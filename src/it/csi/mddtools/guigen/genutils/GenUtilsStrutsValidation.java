package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.List;

import it.csi.mddtools.guigen.CheckBox;
import it.csi.mddtools.guigen.ComboBox;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.RadioButtons;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.TextArea;
import it.csi.mddtools.guigen.TextField;
import it.csi.mddtools.guigen.Widget;


/**
 * Questa classe contiene i metodi per generare le annotazioni e le altre
 * <i>facilities</i> previste dal Validation Framework di Struts 2.
 * <p>
 * Per una spiegazione dettagliata dell'utilizzo del Validation Framework
 * si rimanda alla documentazione ufficiale di Struts2 e ai manuali. 
 * 
 * @author Davide Martinotti
 */
public class GenUtilsStrutsValidation {
	
	/*
	 * Costanti per la definizione dei validatori
	 */
	
	private static final String STRING_SIZE_VALIDATOR = "size";
	
	private static final String STRING_REGEXP_VALIDATOR = "regexp";
	
	private static final String NUMERIC_RANGE_VALIDATOR = "range";
	
	private static final String DATE_SHORT_VALIDATOR = "short";
	
	private static final String DATE_EXTENDED_VALIDATOR = "extended";
	
	private static final String DATE_FORMAT_VALIDATOR = "format";
	
	private static final String CUSTOM_VALIDATOR = "custom";
	
	
	/*
	 * Costanti per la definizione dei formati
	 */
	
	private static final String DATE_FORMAT = "dd/MM/yyyy";
	
	private static final String HOUR_SHORT_FORMAT = "hh:mm";
	
	private static final String HOUR_EXTENDED_FORMAT = "hh:mm:ss";
	
	private static final String DATETIME_SHORT_FORMAT = DATE_FORMAT + "-" + HOUR_SHORT_FORMAT;
	
	private static final String DATETIME_EXTENDED_FORMAT = DATE_FORMAT + "-" + HOUR_EXTENDED_FORMAT;


	////////////////////////////////////////////////////////////////////////////////////////////////////
	//JAVA METHODS FOR STRUTS 2 VALIDATION

	/**
	 * Restituisce la lista di tutti i custom validators definiti dal generatore.
	 * 
	 * @return La lista dei custom validators del generatore.
	 */
	public static List<String> getGuigenCustomValidators() {
		List<String> res = new ArrayList<String>();
		
		// aggiungere alla lista i Custom Validators che Guigen genererà di default
		// nel commento l'indice con cui si potrà accedere al validatore
		res.add("csiDateValidator"); // 0
		
		return res;
	}	
	

	/**
	 * Restituisce la lista di tutti i custom validators definiti 
	 * dall'utente nei widgets nell'intera applicazione.
	 * I custom validators definiti in pi&ugrave; widgets vengono conteggiati
	 * una sola volta.
	 * 
	 * @return La lista dei custom validators.
	 */
	public static List<String> getUserCustomValidators() {
		List<String> res = new ArrayList<String>();
		
		for (Widget w : GenUtils.findAllWidgetsInApplication()) {
			if ( w instanceof DataWidget ) {
				String customValidator = getCustomValidatorName((DataWidget)w);
				if ( !isNullOrEmpty(customValidator) ) {
					if ( !res.contains(customValidator) ) {
						res.add(customValidator);
					}
				}
			}
		}
		
		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 * 
	 * @param w Il DataWidget da validare.
	 * @return  Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidation(DataWidget w) {
		String res = "";
		if ( w.getDataType() instanceof SimpleType ) {
			if (w instanceof TextField) {
				res += getWidgetValidationAnnotation((TextField)w);
			} else if (w instanceof TextArea) {
				res += getWidgetValidationAnnotation((TextArea)w);
			} else if (w instanceof RadioButtons) {
				res += getWidgetValidationAnnotation((RadioButtons)w);
			} else if (w instanceof CheckBox) {
				res += getWidgetValidationAnnotation((CheckBox)w);
			} else if (w instanceof ComboBox) {
				res += getWidgetValidationAnnotation((ComboBox)w);
			} 
		}
		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 * 
	 * @param w Il DataWidget da validare (di tipo TextField).
	 * @return  Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(TextField w) {
		//System.out.println("-----> [GenUtils::getWidgetValidation] FOR TextField " + w);
		String res = "";
		SimpleType t = (SimpleType)w.getDataType();

		// required validation
		if ( w.isRequired() ) {
			if ( t.getCode() == SimpleTypeCodes.STRING || t.getCode() == SimpleTypeCodes.DATE ||
				 t.getCode() == SimpleTypeCodes.DATETIME || t.getCode() == SimpleTypeCodes.HOURS ) {
				// i tipi DATA sono gestiti dal generatore come STRINGHE
				res += getRequiredStringValidator(w);
			} else {
				res += getRequiredValidator(w);
			}
		}
		
		// validation by rules
		if ( !isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w);
		}
		
		//System.out.println("=====> [GenUtils::getWidgetValidationAnnotation] RETURNING {" + res + "}");
		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato econdo le regole definite.
	 * 
	 * @param w Il DataWidget da validare (di tipo TextArea).
	 * @return  Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(TextArea w) {
		//System.out.println("-----> [GenUtils::getWidgetValidation] FOR TextArea " + w);
		String res = "";
		
		// required validation (si suppone che la TextArea sia una stringa)
		if ( w.isRequired() ) {
			res += getRequiredStringValidator(w);
		}
		
		// validation by rules
		if ( !isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w);
		}
		
		//System.out.println("=====> [GenUtils::getWidgetValidationAnnotation] RETURNING {" + res + "}");
		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato econdo le regole definite.
	 * 
	 * @param w Il DataWidget da validare (di tipo RadioButtons).
	 * @return  Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(RadioButtons w) {
		//System.out.println("-----> [GenUtils::getWidgetValidationAnnotation] FOR RadioButtons " + w);
		String res = "";
		
		// required validation
		if ( w.isRequired() ) {
			res += getRequiredValidator(w);
		}
		
		// validation by rules
		if ( !isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w);
		}
		
		//System.out.println("=====> [GenUtils::getWidgetValidationAnnotation] RETURNING {" + res + "}");
		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato econdo le regole definite.
	 * 
	 * @param w Il DataWidget da validare (di tipo CheckBox).
	 * @return  Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(CheckBox w) {
		//System.out.println("-----> [GenUtils::getWidgetValidation] FOR CheckBox " + w);
		String res = "";
		
		// required validation
		if ( w.isRequired() ) {
			res += getRequiredValidator(w);
		}
		
		// validation by rules
		if ( !isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w);
		}
		
		//System.out.println("=====> [GenUtils::getWidgetValidationAnnotation] RETURNING {" + res + "}");
		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato econdo le regole definite.
	 * 
	 * @param w Il DataWidget da validare (di tipo ComboBox).
	 * @return  Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(ComboBox w) {
		//System.out.println("-----> [GenUtils::getWidgetValidation] FOR ComboBox " + w);
		String res = "";
		
		// required validation
		if ( w.isRequired() ) {
			res += getRequiredValidator(w);
		}
		
		// validation by rules
		if ( !isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w);
		}
		
		//System.out.println("=====> [GenUtils::getWidgetValidationAnnotation] RETURNING {" + res + "}");
		return res;
	}


	/**
	 * Genera l'annotazione per il <code><b>RequiredFieldValidator</b></code>.
	 * 
	 * @param w Il DataWidget da validare.
	 * @return  L'annotazione da inserire nella Action di Struts.
	 */
	public static String getRequiredValidator(DataWidget w) {
		//System.out.println("=====> [GenUtils::getRequiredValidator] FOR " + w);
		return "@RequiredFieldValidator(type = ValidatorType.FIELD, fieldName = \"" + GenUtils.getWidgetName(w) + "\", " +
					"message = \"Campo " + w.getLabel() + " obbligatorio\")";
	}


	/**
	 * Genera l'annotazione per il <code><b>RequiredStringValidator</b></code>.
	 * 
	 * @param w Il DataWidget da validare.
	 * @return  L'annotazione da inserire nella Action di Struts.
	 */
	public static String getRequiredStringValidator(DataWidget w) {
		//System.out.println("=====> [GenUtils::getRequiredStringValidator] FOR " + w);
		return "@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = \"" + GenUtils.getWidgetName(w) + "\", " +
					" message = \"Campo " + w.getLabel() + " obbligatorio\")";

	}


	/**
	 * Genera le annotazioni per i tipi di validazione espressi nel campo dataTypeModifier del widget.
	 * 
	 * @param dataTypeModifier  Il valore del campo <code>dataTypeModifier</code> del widget.
	 * @param type  Il tipo di dato (<code>SimpleType</code>) del widget da validare.
	 * @param fieldName  Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyValidationRule(DataWidget w) {
		//System.out.println("=====> [GenUtils::applyValidationRule]");
		String res = "";
		
		SimpleType type = (SimpleType)w.getDataType();
		String fieldName = GenUtils.getWidgetName(w);
		String fieldLabel = w.getLabel();
		
		// ricavo la regola di validazione
		String[] validationRule = getValidationRule(w.getDataTypeModifier());
		if ( !isNullOrEmpty(validationRule[0]) ) {
			if ( type.getCode() == SimpleTypeCodes.STRING ) {
				res += applyStringValidationRule(validationRule, fieldName, fieldLabel);
			} else if ( type.getCode() == SimpleTypeCodes.INT || type.getCode() == SimpleTypeCodes.LONG ) {
				// tipo numerico intero
				res += applyNumericIntValidationRule(validationRule, fieldName, fieldLabel);
			} else if ( type.getCode() == SimpleTypeCodes.DOUBLE || type.getCode() == SimpleTypeCodes.FLOAT ) {
				// tipo numerico decimale
				res += applyNumericDecValidationRule(validationRule, fieldName, fieldLabel);
			} else if ( type.getCode() == SimpleTypeCodes.DATE || type.getCode() == SimpleTypeCodes.DATETIME || type.getCode() == SimpleTypeCodes.HOURS ) {
				// tipi data
				res += applyDateValidationRule(validationRule, fieldName, fieldLabel, type);
			} else {
				// sugli altri tipi è comunque definibile un validatore custom
				res += applyCustomValidationRule(validationRule, fieldName, fieldLabel);
			}
		}
		return res;
	}


	/**
	 * 
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>) 
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyStringValidationRule(String[] validationRule, String fieldName, String fieldLabel) {
		//System.out.println("=====> [GenUtils::applyStringValidationRule]");
		String res = "";
		
		if ( validationRule[0].equals(STRING_SIZE_VALIDATOR) ) {
			if ( !isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( !isNullOrEmpty(range[0]) || !isNullOrEmpty(range[1]) ) {
					res += "@StringLengthFieldValidator(type = ValidatorType.FIELD, fieldName = \"" + fieldName + "\", ";
					// minimo e massimo
					if ( !isNullOrEmpty(range[0]) ) {
						res += "minLength = \"" + range[0] + "\", ";
					}
					if ( !isNullOrEmpty(range[1]) ) {
						res += "maxLength = \"" + range[1] + "\", ";
					}					
					// messaggio
					res += "message = \"Campo " + fieldLabel;
					if ( !isNullOrEmpty(range[0]) ) {
						res += " : minimo " + range[0] + " caratteri";
					}
					if ( !isNullOrEmpty(range[1]) ) {
						res += " : massimo " + range[1] + " caratteri";
					}
					res += "\")";
				}
			}
		} else if ( validationRule[0].equals(STRING_REGEXP_VALIDATOR) ) {
			if ( !isNullOrEmpty(validationRule[1]) ) {
				res += "@RegexFieldValidator(type = ValidatorType.FIELD, fieldName = \"" + fieldName + "\", " +
						"expression = \"" + validationRule[1] + "\"";
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, fieldLabel);
		}

		return res;
	}


	/**
	 * 
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>) 
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyNumericIntValidationRule(String[] validationRule, String fieldName, String fieldLabel) {
		//System.out.println("=====> [GenUtils::applyNumericIntValidationRule]");
		String res = "";
		
		if ( validationRule[0].equals(NUMERIC_RANGE_VALIDATOR) ) {
			if ( !isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( range[0] != null || range[1] != null ) {
					res += "@IntRangeFieldValidator(type = ValidatorType.FIELD, fieldName = \"" + fieldName + "\", ";
					// minimo e massimo
					if ( !isNullOrEmpty(range[0]) ) {
						res += "min = \"" + range[0] + "\", ";
					}
					if ( !isNullOrEmpty(range[1]) ) {
						res += "max = \"" + range[1] + "\", ";
					}					
					// messaggio
					res += "message = \"Campo " + fieldLabel;
					if ( !isNullOrEmpty(range[0]) ) {
						res += " : valore minimo " + range[0];
					}
					if ( !isNullOrEmpty(range[1]) ) {
						res += " : valore massimo " + range[1];
					}
					res += "\")";
				}
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, fieldLabel);
		}

		return res;
	}


	/**
	 * 
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>) 
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyNumericDecValidationRule(String[] validationRule, String fieldName, String fieldLabel) {
		//System.out.println("=====> [GenUtils::applyNumericDecValidationRule]");
		String res = "";
		
		if ( validationRule[0].equals(NUMERIC_RANGE_VALIDATOR) ) {
			if ( !isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( range[0] != null || range[1] != null ) {
					res += "@DoubleRangeFieldValidator(type = ValidatorType.FIELD, fieldName = \"" + fieldName + "\", ";
					// minimo e massimo
					if ( !isNullOrEmpty(range[0]) ) {
						res += "minInclusive = \"" + range[0] + "\", ";
					}
					if ( !isNullOrEmpty(range[1]) ) {
						res += "maxInclusive = \"" + range[1] + "\", ";
					}					
					// messaggio
					res += "message = \"Campo " + fieldLabel;
					if ( !isNullOrEmpty(range[0]) ) {
						res += " : valore minimo " + range[0];
					}
					if ( !isNullOrEmpty(range[1]) ) {
						res += " : valore massimo " + range[1];
					}
					res += "\")";
				}
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, fieldLabel);
		}

		return res;
	}


	/**
	 * 
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>) 
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyDateValidationRule(String[] validationRule, String fieldName, String fieldLabel, SimpleType type) {
		//System.out.println("=====> [GenUtils::applyDateValidationRule]");
		String res = "";
		
		if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, fieldLabel);
		} else {
			// stabiliamo un formato di default che è quello data
			String format = DATE_FORMAT;
			
			if ( validationRule[0].equals(DATE_SHORT_VALIDATOR) ) {
				if ( type.getCode() == SimpleTypeCodes.DATETIME ) {
					format = DATETIME_SHORT_FORMAT;
				} else if ( type.getCode() == SimpleTypeCodes.HOURS ) {
					format = HOUR_SHORT_FORMAT;
				}
			} else if ( validationRule[0].equals(DATE_EXTENDED_VALIDATOR) ) {
				if ( type.getCode() == SimpleTypeCodes.DATETIME ) {
					format = DATETIME_EXTENDED_FORMAT;
				} else if ( type.getCode() == SimpleTypeCodes.HOURS ) {
					format = HOUR_EXTENDED_FORMAT;
				}				
			} else if ( validationRule[0].equals(DATE_FORMAT_VALIDATOR) ) {
				if ( !isNullOrEmpty(validationRule[1]) ) {
					format = validationRule[1];
				}
			}
			//System.out.println("=====> [GenUtils::applyDateValidationRule] DATE FORMAT IS {" + format + "}");
		
			// genero l'annotazione
			res += "@CustomValidator(" + 
						"type = \"" + getGuigenCustomValidators().get(0) + "\", " + 
						"fieldName = \"" + fieldName + "\", " + 
						"message = \"Campo " + fieldLabel + " : formato non valido\", " + 
						"parameters = { @ValidationParameter( name = \"format\", value = \"" + format + "\" ) } " + 
					")";
		}

		//System.out.println("=====> [GenUtils::applyDateValidationRule] RETURNING {" + res + "}");
		return res;
	}

	
	/**
	 * 
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>) 
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyCustomValidationRule(String[] validationRule, String fieldName, String fieldLabel) {
		//System.out.println("=====> [GenUtils::applyCustomValidationRule]");
		String res = "";
		
		if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			if ( !isNullOrEmpty(validationRule[1]) ) {
				res += getCustomValidatorAnnotation(validationRule[1], fieldName, fieldLabel);
			}
		}
		
		//System.out.println("=====> [GenUtils::applyCustomValidationRule] RETURNING {" + res + "}");
		return res;
	}


	/**
	 * Estrae dal campo <code>dataTypeModifier</code> del widget le regole di validazione.
	 * <p>
	 * Le regole di validazione devono essere espresse secondo la sintassi:
	 * <blockquote><pre>
	 * validatore:parametri
	 * </pre></blockquote>
	 * dove<br>
	 * <ul>
	 * <li><b>validatore:</b> è il tipo di validatore da applicare al campo;</li>
	 * <li><b>parametri:</b> (<i>opzionale</i>) parametri necessari alla validazione; variano a seconda del validatore</li>
	 * </ul>
	 * Si rimanda alla issue <b>STDMDD-12</b> di Jira per il dettaglio dei tipi di validazione ammessi per ciascun tipo
	 * di dato e i relativi parametri.
	 *
	 * @param dataTypeModifier  Il valore del campo <code>dataTypeModifier</code> del widget.
	 * @return Le regole di validazione splittate in <i>validatore</i> (<code>rule[0]</code>) e <i>parametri</i> (<code>rule[1]</code>).
	 */
	private static String[] getValidationRule(String dataTypeModifier) {
		//System.out.println("=====> [GenUtils::getValidationRule] dataTypeModifier = {" + dataTypeModifier + "}");
		String[] rule = new String[2];

		if ( !isNullOrEmpty(dataTypeModifier) ) {
			String dtm = dataTypeModifier.trim();
			int i = dtm.indexOf(':');
			
			//System.out.println("=====> [GenUtils::getValidationRule] : position is {" + i + "}");
			if ( i > 0 ) {
				// presenti validatore e parametri
				rule[0] = dtm.substring(0, i).trim();
				if ( i+1 < dtm.length() ) {
					rule[1] = dtm.substring(i+1).trim();
				}
			} else if ( i < 0 ) {
				// presente solo il validatore (parametri opzionali)
				rule[0] = dtm;
			}
			// NOTA: se i == 0, significherebbe che manca il validatore (ad esempio ':1,7')
		}

		//System.out.println("=====> [GenUtils::getValidationRule] RETURNING {'" + rule[0] + "', '" + rule[1] + "'}");
		return rule;
	}	
	
	
	/**
	 * Estrae dal campo parametri delle regole di validazione il range del campo, espresso come
	 * minimo e massimo separati da virgola, ovvero:
	 * <blockquote><pre>
	 * <b>&lt;min&gt;,&lt;max&gt;</b>
	 * </pre></blockquote>
	 * <p>
	 * Minimo e massimo sono entrambi opzionali; le sintassi ammesse sono:
	 * <ul>
	 * <li><b>&lt;min&gt;,&lt;max&gt;</b></li>
	 * <li><b>&lt;min&gt;,</b></li>
	 * <li><b>&lt;min&gt;</b></li>
	 * <li><b>,&lt;max&gt;</b></li>
	 * </ul>
	 * Non viene effettuato nessun controllo formale sul tipo di dato atteso per ciascun valore
	 * del range.
	 * 
	 * @param stringRange La stringa con il range da decodificare.
	 * @return Il range splittato in <i>min</i> (<code>range[0]</code>) e <i>max</i> (<code>max[1]</code>).
	 */
	private static String[] getRange(String stringRange) {
		//System.out.println("=====> [GenUtils::getRange] stringRange = {" + stringRange + "}");
		String[] range = new String[2];
		
		if ( !isNullOrEmpty(stringRange) ) {
			String sr = stringRange.trim();
			int i = sr.indexOf(',');
		
			//System.out.println("=====> [GenUtils::getRange] , position is {" + i + "}");
			if ( i > 0 ) {
				// presente minimo e massimo (<min>,<max>) oppure solo il minimo (<min>,)
				range[0] = sr.substring(0, i).trim();
				if ( i+1 < sr.length() ) {
					range[1] = sr.substring(i+1).trim();
				}
			} else if ( i < 0 ) {
				// presente solo il minimo espresso senza virgola (<min>) 
				range[0] = sr;
			} else if ( i == 0 ) {
				// presente solo il massimo (,<max>)
				range[1] = sr.substring(1).trim();
			}
		}
		
		//System.out.println("=====> [GenUtils::getRange] RETURNING {'" + range[0] + "', '" + range[1] + "'}");
		return range;
	}
	
	
	/**
	 * Resrtituisce il nome di un Custom Validator eventualmente modellato in un widget.
	 * 
	 * @param w  Il DataWidget
	 * @return  Il nome del Custom Validator.
	 */
	private static String getCustomValidatorName(DataWidget w) {
		String res = null;
		
		String[] validationRule = getValidationRule(((DataWidget) w).getDataTypeModifier());
		if ( !isNullOrEmpty(validationRule[0]) && !isNullOrEmpty(validationRule[1]) ) {
			if ( CUSTOM_VALIDATOR.equals(validationRule[0]) ) {
				res = validationRule[1];
			}
		}
		
		return res;
	}
	
	
	/**
	 * 
	 * @param validator  Il nome del Custom Validator.
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	private static String getCustomValidatorAnnotation(String validator, String fieldName, String fieldLabel) {
		return "@CustomValidator(" + 
					"type = \"" + validator + "\", " + 
					"fieldName = \"" + fieldName + "\", " + 
					"message = \"Campo " + fieldLabel + " non valido\"" + 
					// TODO: gestione dei parametri?
					//", parameters = { @ValidationParameter( name = \"format\", value = \"" + format + "\" ) } " + 
				")";
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	// JAVA METHODS FOR STRUTS 2 VALIDATION CHECKS	
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	// UTILITY METHODS 		
	

	public static boolean isNullOrEmpty(String s) {
		return (s == null || s.trim().length() == 0);
	}		
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	// MAIN
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
