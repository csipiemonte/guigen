/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.Calendar;
import it.csi.mddtools.guigen.CheckBox;
import it.csi.mddtools.guigen.ComboBox;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.RadioButtons;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.TextArea;
import it.csi.mddtools.guigen.TextField;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypedArray;
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

	
	/*
	 * Costanti per la definizione delle label
	 */	
	
	public static final String REQUIRED_VALIDATION_LABEL = ".required.label";
	
	public static final String VALIDATOR_VALIDATION_LABEL = ".validator.label";
	
	public static final String VISITOR_VALIDATION_LABEL = ".visitorvalidator.label";
	
	
	/*
	 * 
	 */
	public static final Map<String, String> simpleTypeUdValidators = new HashMap<String, String>();
	static {
		simpleTypeUdValidators.put("csiUdStringRangeValidator",  "StringLengthFieldValidator");	 // 0	
		simpleTypeUdValidators.put("csiUdStringRegexpValidator", "RegexFieldValidator");         // 1
		simpleTypeUdValidators.put("csiUdNumericIntValidator",   "RangeValidatorSupport<Integer>");      // 2
		simpleTypeUdValidators.put("csiUdNumericDecValidator",   "DoubleRangeFieldValidator");   // 3
		simpleTypeUdValidators.put("csiUdDateValidator",         "CsiDateValidator");            // 4
		simpleTypeUdValidators.put("csiUdLongRangeValidator",    "CsiLongRangeValidator");       // 5
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	//JAVA METHODS FOR STRUTS 2 VALIDATION

	/* **************************************  CUSTOM VALIDATORS ************************************* */
	
	/**
	 * Restituisce la lista di tutti i custom validators definiti dal generatore.
	 *
	 * @return La lista dei custom validators del generatore.
	 */
	public static List<String> getGuigenCustomValidators() {
		List<String> res = new ArrayList<String>();

		// aggiungere alla lista i Custom Validators che Guigen generer� di default
		// nel commento l'indice con cui si potr� accedere al validatore
		res.add("csiDateValidator");             // 0
		res.add("csiLongRangeValidator");			 // 1	
		
		return res;
	}

	
	/**
	 * Restituisce la lista di tutti i Validatori per User Defined Simple Types definiti dal generatore.
	 *
	 * @return La lista di tutti i Validatori per User Defined Simple Types del generatore.
	 */
	public static List<String> getGuigenUserDefinedTypesValidators() {
		return new ArrayList<String>(simpleTypeUdValidators.keySet());
	}	
	
	public static String getGuigenUserDefinedTypeValidatorClassImpl(String validatorName) {
		return simpleTypeUdValidators.get(validatorName);
	}
	

	/**
	 * Restituisce la lista di tutti i custom validators definiti
	 * dall'utente nei widgets nell'intera applicazione.
	 * I custom validators definiti in pi&ugrave; widgets vengono conteggiati
	 * una sola volta.
	 *
	 * @return La lista dei nomi dei custom validators.
	 */
	public static List<String> getUserCustomValidatorsName() {
		List<String> res = new ArrayList<String>();

		for (Widget w : GenUtils.findAllWidgetsInApplication()) {
			if ( w instanceof DataWidget ) {
				String customValidator = getCustomValidatorName((DataWidget)w);
				if ( !GenUtils.isNullOrEmpty(customValidator) ) {
					if ( !res.contains(customValidator) ) {
						res.add(customValidator);
					}
				}
			}
		}

		return res;
	}

	
	/* **************************************  WIDGET VALIDATORS ************************************* */
	

	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 *
	 * @param w Il DataWidget da validare.
	 * @return  Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidation(DataWidget w, ContentPanel cp, String contextPrefix) {
		String res = "";
		
		
		if ( w.getDataType() instanceof SimpleType ) {
			// tipo semplice
			if ( w instanceof TextField ) {
				res += getWidgetValidationAnnotation((TextField)w, cp, contextPrefix);
			} else if ( w instanceof TextArea ) {
				res += getWidgetValidationAnnotation((TextArea)w, cp, contextPrefix);
			} else if ( w instanceof RadioButtons ) {
				res += getWidgetValidationAnnotation((RadioButtons)w, cp, contextPrefix);
			} else if ( w instanceof CheckBox ) {
				res += getWidgetValidationAnnotation((CheckBox)w, cp, contextPrefix);
			} else if ( w instanceof ComboBox ) {
				res += getWidgetValidationAnnotation((ComboBox)w, cp, contextPrefix);
			} else if ( w instanceof Calendar ) {
				res += getWidgetValidationAnnotation((Calendar)w, cp, contextPrefix);
			}
		}
		else if ( w.getDataType() instanceof TypedArray ) {
			res += getWidgetValidationAnnotationTypedArray(w, cp, contextPrefix);
		}

		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 *
	 * @param w  Il DataWidget da validare (di tipo TextField).
	 * @param cp Il ContentPanel che contiene il DataWidget da validare.
	 * @return   Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(TextField w, ContentPanel cp, String contextPrefix) {
		String res = "";
		SimpleType t = (SimpleType)w.getDataType();
		boolean expandFieldName = true;

		// required validation
		if ( w.isRequired() ) {
			String keyName = cp.getName() + "." + w.getName();
			if ( GenUtils.isString(t) || GenUtils.isDateOrHour(t) ) {
				// i tipi DATA sono gestiti dal generatore come STRINGHE
				res += getRequiredStringValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			} else {
				res += getRequiredValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			}
		}

		// validation by rules
		if ( !GenUtils.isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w, cp, expandFieldName, contextPrefix);
		}

		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 *
	 * @param w  Il DataWidget da validare (di tipo TextArea).
	 * @param cp Il ContentPanel che contiene il DataWidget da validare.
	 * @return   Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(TextArea w, ContentPanel cp, String contextPrefix) {
		String res = "";
		boolean expandFieldName = true;

		// required validation (si suppone che la TextArea sia una stringa)
		if ( w.isRequired() ) {
			res += getRequiredStringValidator(GenUtils.getWidgetName(w, contextPrefix), cp.getName() + "." + w.getName(), expandFieldName);
		}

		// validation by rules
		if ( !GenUtils.isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w, cp, expandFieldName, contextPrefix);
		}

		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 *
	 * @param w  Il DataWidget da validare (di tipo RadioButtons).
	 * @param cp Il ContentPanel che contiene il DataWidget da validare.
	 * @return   Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(RadioButtons w, ContentPanel cp, String contextPrefix) {
		String res = "";
		SimpleType t = (SimpleType)w.getDataType();
		boolean expandFieldName = true;

		// required validation
		if ( w.isRequired() ) {
			String keyName = cp.getName() + "." + w.getName();
			if ( GenUtils.isString(t) || GenUtils.isDateOrHour(t) ) {
				// i tipi DATA sono gestiti dal generatore come STRINGHE
				res += getRequiredStringValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			} else {
				res += getRequiredValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			}
		}

		// validation by rules
		if ( !GenUtils.isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w, cp, expandFieldName, contextPrefix);
		}

		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 *
	 * @param w  Il DataWidget da validare (di tipo CheckBox).
	 * @param cp Il ContentPanel che contiene il DataWidget da validare.
	 * @return   Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(CheckBox w, ContentPanel cp, String contextPrefix) {
		String res = "";
		SimpleType t = (SimpleType)w.getDataType();
		boolean expandFieldName = true;

		// required validation
		if ( w.isRequired() ) {
			String keyName = cp.getName() + "." + w.getName();
			if ( GenUtils.isString(t) || GenUtils.isDateOrHour(t) ) {
				// i tipi DATA sono gestiti dal generatore come STRINGHE
				res += getRequiredStringValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			} else {
				res += getRequiredValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			}
		}

		// validation by rules
		if ( !GenUtils.isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w, cp, expandFieldName, contextPrefix);
		}

		return res;
	}


	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 *
	 * @param w  Il DataWidget da validare (di tipo ComboBox).
	 * @param cp Il ContentPanel che contiene il DataWidget da validare.
	 * @return   Le annotazioni di validazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotation(ComboBox w, ContentPanel cp, String contextPrefix) {
		String res = "";
		SimpleType t = (SimpleType)w.getDataType();
		boolean expandFieldName = true;

		// required validation
		if ( w.isRequired() ) {
			String keyName = cp.getName() + "." + w.getName();
			if ( GenUtils.isString(t) || GenUtils.isDateOrHour(t) ) {
				// i tipi DATA sono gestiti dal generatore come STRINGHE
				res += getRequiredStringValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			} else {
				res += getRequiredValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
			}
		}

		// validation by rules
		if ( !GenUtils.isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w, cp, expandFieldName, contextPrefix);
		}

		return res;
	}

	
	/**
	 * Genera le annotazioni per validare il DataWidget passato secondo le regole definite.
	 *
	 * @param w  Il DataWidget da validare (di tipo ComboBox).
	 * @param cp Il ContentPanel che contiene il DataWidget da validare.
	 * @return   Le annotazioni di validazione da inserire nella Action di Struts.
	 */	
	public static String getWidgetValidationAnnotation(Calendar w, ContentPanel cp, String contextPrefix) {
		String res = "";
		boolean expandFieldName = true;

		// required validation
		if ( w.isRequired() ) {
			String keyName = cp.getName() + "." + w.getName();
			// i tipi DATA sono gestiti dal generatore come STRINGHE, e Calendar pu� essere solamente di tipo data
			res += getRequiredStringValidator(GenUtils.getWidgetName(w, contextPrefix), keyName, expandFieldName);
		}

		// validation by rules
		if ( !GenUtils.isNullOrEmpty(w.getDataTypeModifier()) ) {
			res += applyValidationRule(w, cp, expandFieldName, contextPrefix);
		}

		return res;
	}	
	

	/**
	 * Genera le annotazioni per i tipi di validazione espressi nel campo dataTypeModifier del widget.
	 *
	 * @param w                Il DataWidget da validare.
	 * @param cp               Il ContentPanel che contiene il DataWidget da validare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyValidationRule(DataWidget w, ContentPanel cp, boolean expandFieldName, String contextPrefix) {
		SimpleType type = (SimpleType)w.getDataType();
		String fieldName = GenUtils.getWidgetName(w, contextPrefix);
		String keyName = cp.getName() + "." + w.getName();
		
		return applyValidationRule(w.getDataTypeModifier(), type, fieldName, keyName, expandFieldName);
	}

	
	/**
	 * Genera l'annotazione per un Widget con tipo TypedArray (solo obbligatoriet&agrave;)
	 * 
	 * @param w  Il DataWidget da validare (di tipo ComboBox).
	 * @param cp Il ContentPanel che contiene il DataWidget da validare.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String getWidgetValidationAnnotationTypedArray(DataWidget w, ContentPanel cp, String contextPrefix) {
		String res = "";
		boolean expandFieldName = true;
		
		// required validation
		if ( w.isRequired() ) {
			res += getRequiredValidator(GenUtils.getWidgetName(w, contextPrefix), cp.getName() + "." + w.getName(), expandFieldName);
		}
		
		return res;
	}
	
	
	
	/* **************************************  APPLICATION DATA ************************************** */


	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isValidatorAnnotationRequired(ComplexType t) {
		boolean res = false;
		for ( Field f : t.getFields() ) {
			res = requireValidation(f);
			if ( res ) {
				break;
			}
		}
		return res;
	}


	/**
	 * Restituisce (se necessaria) l'annotazione per un Visitor Filed Validator.
	 * 
	 * @param ad  L'<code>ApplicationData</code> da validare.
	 * @param expandVisitorFieldValidator true se &egrave; necessario inserire l'annotazione, false altrimenti.
	 * @return L'annotazione <code>@VisitorFieldValidator</code> se &egrave; richiesta la validazione, blank altrimenti.
	 */
	public static String getVisitorFieldValidator(ApplicationData ad, ContentPanel cp, Boolean expandVisitorFieldValidator) {
		String res = "";
		if ( expandVisitorFieldValidator && requireValidation(ad) ) {
			String key = cp.getName() + "." + ad.getName() + VISITOR_VALIDATION_LABEL;
			res = getVisitorFieldValidatorAnnotation(key);
		}
		return res;
	}


	/**
	 * 
	 * @param f
	 * @return
	 */
	public static String getValidatorFieldAnnotationForDTO(Field f) {
		String res = "";
		
		ComplexType ct = (ComplexType)f.eContainer();
		
		if ( requireValidation(f) ) {
			if ( f.getType() instanceof ComplexType ) {
				// Tipo complesso: inserisco un'annotazione di VisitorFieldValidator
				res = getVisitorFieldValidatorAnnotation(ct.getName() + "." + f.getName() + VISITOR_VALIDATION_LABEL);
			}
			else if ( f.getType() instanceof SimpleType ) {
				// Tipo semplice: devo controllare che tipo e' per mettere l'annotazione giusta
				res = getFieldValidatorByType(f, ct.getName());
			}
		}
	
		return res;
	}

	
	/**
	 * 
	 * @param ad
	 * @return
	 */
	public static boolean requireValidation(ApplicationData ad) {
		return requireValidation(ad.getType());
	}
	
	
	
	
	public static boolean requireValidation(Type type) {
		
		boolean res = false;
		
		
		if ( type instanceof ComplexType ) {
			res = requireValidation((ComplexType)type);
		}
		else if(type instanceof TypedArray){	
			res = requireValidation((TypedArray)type);
		}
		
		return res;
	}
	
	
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean requireValidation(ComplexType t) {
		boolean res = false;
		
		for ( Field field : t.getFields() ) {
			res = requireValidation(field);
			if ( res ) {
				break;
			}
		}
		
		return res;
	}

	
	
	
	public static boolean requireValidation(TypedArray ta) {
	
		return requireValidation(ta.getComponentType());
		
	}
	
	
	

	/**
	 * 
	 * @param field
	 * @return
	 */
	public static boolean requireValidation(Field field) {
		boolean res = false;
		
		if ( field.getType() instanceof ComplexType ) {
			// Tipo complesso: ciclo sui campi del tipo
			for ( Field f : ((ComplexType)field.getType()).getFields() ) {
				res = requireValidation(f);
				if ( res ) {
					break;
				}
			}
		}
		else if ( field.getType() instanceof SimpleType ) {
			// tipo semplice: controllo se e' required oppure se e' stato impostato 
			res = ( field.isRequired() || !GenUtils.isNullOrEmpty(field.getDataTypeModifier()) );
		}
		
		return res;
	}
	

	/**
	 * 
	 * @param f
	 * @return
	 */
	public static String getFieldValidatorByType(Field f, String ctName) {
		String res = "";

		SimpleType type = (SimpleType)f.getType();
		String fieldName = f.getName();
		String keyName = ctName + "." + fieldName;
		boolean expandFieldName = false;
		
		
		// required validation
		if ( f.isRequired() ) {
			if ( GenUtils.isString(type) || GenUtils.isDateOrHour(type) ) {
				// i tipi DATA sono gestiti dal generatore come STRINGHE
				res += getRequiredStringValidator(fieldName, keyName, expandFieldName);
			} else {
				res += getRequiredValidator(fieldName, keyName, expandFieldName);
			}
		}

		// validation by rules
		if ( !GenUtils.isNullOrEmpty(f.getDataTypeModifier()) ) {
			res += applyValidationRule(f.getDataTypeModifier(), type, fieldName, keyName, expandFieldName);
		}

		return res;
	}



	/* ************************************  VALIDATOR ANNOTATIONS *********************************** */

	/**
	 * Genera l'annotazione per il <code><b>RequiredFieldValidator</b></code>.
	 *
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param keyName    Il nome da utilizzare nella chiave.
	 * @return  L'annotazione da inserire nella Action di Struts.
	 */
	public static String getRequiredValidator(String fieldName, String keyName, boolean expandFieldName) {
		return "@RequiredFieldValidator(type = ValidatorType.FIELD, " + 
					(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "" ) +
					" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					" key = \"" + keyName + REQUIRED_VALIDATION_LABEL + "\"" +
					")";
	}


	/**
	 * Genera l'annotazione per il <code><b>RequiredStringValidator</b></code>.
	 *
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param keyName    Il nome da utilizzare nella chiave.
	 * @return  L'annotazione da inserire nella Action di Struts.
	 */
	public static String getRequiredStringValidator(String fieldName, String keyName, boolean expandFieldName) {
		return "@RequiredStringValidator(type = ValidatorType.FIELD, " + 
					(expandFieldName ? " fieldName = \"" + fieldName + "\", " : "") +
					" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					" key = \"" + keyName + REQUIRED_VALIDATION_LABEL + "\"" +
					")";
	}

	
	
	/**
	 * Genera le annotazioni per i tipi di validazione espressi nel campo dataTypeModifier.
	 *
	 * @param dataTypeModifier 
	 * @param type  
	 * @param keyName    Il nome da utilizzare nella chiave.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyValidationRule(String dataTypeModifier, SimpleType type, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";

		// ricavo la regola di validazione
		String[] validationRule = getValidationRule(dataTypeModifier);
		if ( !GenUtils.isNullOrEmpty(validationRule[0]) ) {
			if ( GenUtils.isString(type) ) {
				res += applyStringValidationRule(validationRule, fieldName, keyName, expandFieldName, type.isUserDefined());
			} else if ( GenUtils.isInteger(type) ) {
				// tipo numerico intero (INT)
				res += applyNumericIntValidationRule(validationRule, fieldName, keyName, expandFieldName, type.isUserDefined());
			} else if ( GenUtils.isLong(type) ) {
				// tipo numerico intero (Long)
				res += applyNumericLongValidationRule(validationRule, fieldName, keyName, expandFieldName, type.isUserDefined());
			} else if ( GenUtils.isDecimal(type) ) {
				// tipo numerico decimale (DOUBLE o FLOAT)
				res += applyNumericDecValidationRule(validationRule, fieldName, keyName, expandFieldName, type.isUserDefined());
			} else if ( type.getCode() == SimpleTypeCodes.DATE ) {
				res += applyDateValidationRule(validationRule, fieldName, keyName, expandFieldName, type.isUserDefined());
			} else if ( type.getCode() == SimpleTypeCodes.DATETIME ) {
				res += applyDateTimeValidationRule(validationRule, fieldName, keyName, expandFieldName, type.isUserDefined());
			} else if ( GenUtils.isHour(type) ) {
				res += applyHourValidationRule(validationRule, fieldName, keyName, expandFieldName, type.isUserDefined());
			} else {
				// sugli altri tipi � comunque definibile un validatore custom
				res += applyCustomValidationRule(validationRule, fieldName, keyName, expandFieldName);
			}
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param keyName    Il nome da utilizzare nella chiave.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @param userDefined true se il SimpleType � UserDefined, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyStringValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName, boolean userDefined) {
		String res = "";

		if ( validationRule[0].equals(STRING_SIZE_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( !GenUtils.isNullOrEmpty(range[0]) || !GenUtils.isNullOrEmpty(range[1]) ) {
					if (userDefined) {
						res += getStringSizeUdValidationAnnotation(range, fieldName, keyName, expandFieldName);
					} else {
						res += getStringSizeValidationAnnotation(range, fieldName, keyName, expandFieldName);
					}
				}
			}
		} else if ( validationRule[0].equals(STRING_REGEXP_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				if (userDefined) {
					res += getStringRegexpUdValidationAnnotation(validationRule, fieldName, keyName, expandFieldName);
				} else {
					res += getStringRegexpValidationAnnotation(validationRule, fieldName, keyName, expandFieldName);
				}
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @param userDefined true se il SimpleType � UserDefined, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyNumericIntValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName, boolean userDefined) {
		String res = "";

		if ( validationRule[0].equals(NUMERIC_RANGE_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( range[0] != null || range[1] != null ) {
					if (userDefined) {
						res += getNumericIntRangeUdValidationAnnotation(range, fieldName, keyName, expandFieldName);
					} else {
						res += getNumericIntRangeValidationAnnotation(range, fieldName, keyName, expandFieldName);
					}
				}
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
		}

		return res;
	}
	
	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @param userDefined true se il SimpleType � UserDefined, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyNumericLongValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName, boolean userDefined) {
		String res = "";

		if ( validationRule[0].equals(NUMERIC_RANGE_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( range[0] != null || range[1] != null ) {
					if (userDefined) {
						res += getNumericLongRangeUdValidationAnnotation(range, fieldName, keyName, expandFieldName);
					} else {
						res += getNumericLongRangeValidationAnnotation(range, fieldName, keyName, expandFieldName);
					}
				}
			}
		} else if (validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
		}

		return res;
	}	

	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @param userDefined true se il SimpleType � UserDefined, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyNumericDecValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName, boolean userDefined) {
		String res = "";

		if ( validationRule[0].equals(NUMERIC_RANGE_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( range[0] != null || range[1] != null ) {
					if (userDefined) {
						res += getNumericDecRangeUdValidationAnnotation(range, fieldName, keyName, expandFieldName);
					} else {
						res += getNumericDecRangeValidationAnnotation(range, fieldName, keyName, expandFieldName);
					}
				}
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @param userDefined true se il SimpleType � UserDefined, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyDateValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName, boolean userDefined) {
		String res = "";

		if ( validationRule[0].equals(DATE_FORMAT_VALIDATOR) ) {
			String format = DATE_FORMAT;
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				format = validationRule[1];
			}
			
			if (userDefined) {
				res += getDateUdValidatorAnnotation(format, fieldName, keyName, expandFieldName);
			} else {
				res += getDateValidatorAnnotation(format, fieldName, keyName, expandFieldName);
			}
			
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @param userDefined true se il SimpleType � UserDefined, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyDateTimeValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName, boolean userDefined) {
		String res = "";

		if ( validationRule[0].equals(DATE_SHORT_VALIDATOR) ) {
			res += getDateValidatorAnnotation(DATETIME_SHORT_FORMAT, fieldName, keyName, expandFieldName);
		} else if ( validationRule[0].equals(DATE_EXTENDED_VALIDATOR) ) {
			res += getDateValidatorAnnotation(DATETIME_EXTENDED_FORMAT, fieldName, keyName, expandFieldName);
		} else if ( validationRule[0].equals(DATE_FORMAT_VALIDATOR) ) {
			String format = DATETIME_SHORT_FORMAT;
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				format = validationRule[1];
			}
			
			if (userDefined) {
				res += getDateUdValidatorAnnotation(format, fieldName, keyName, expandFieldName);
			} else {
				res += getDateValidatorAnnotation(format, fieldName, keyName, expandFieldName);
			}
			
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @param userDefined true se il SimpleType � UserDefined, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyHourValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName, boolean userDefined) {
		String res = "";

		if ( validationRule[0].equals(DATE_SHORT_VALIDATOR) ) {
			res += getDateValidatorAnnotation(HOUR_SHORT_FORMAT, fieldName, keyName, expandFieldName);
		} else if ( validationRule[0].equals(DATE_EXTENDED_VALIDATOR) ) {
			res += getDateValidatorAnnotation(HOUR_EXTENDED_FORMAT, fieldName, keyName, expandFieldName);
		} else if ( validationRule[0].equals(DATE_FORMAT_VALIDATOR) ) {
			String format = HOUR_SHORT_FORMAT;
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				format = validationRule[1];
			}
			
			if (userDefined) {
				res += getDateUdValidatorAnnotation(format, fieldName, keyName, expandFieldName);
			} else {
				res += getDateValidatorAnnotation(format, fieldName, keyName, expandFieldName);
			}
			
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @param expandFieldName  true se &grave; necessario inserire nell'annotazione la propriet&agrave; <code>fieldName</code>, false altrimenti.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	public static String applyCustomValidationRule(String[] validationRule, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";

		if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				res += getCustomValidatorAnnotation(validationRule[1], fieldName, keyName, expandFieldName);
			}
		}

		return res;
	}


	/* ************************************  VALIDATOR LABELS *********************************** */

	/**
	 * 
	 * @param w
	 * @return
	 */
	public static String getValidationLabel(DataWidget w) {
		SimpleType type = (SimpleType)w.getDataType();
		String fieldLabel = w.getLabel();
		String dataTypeModifier = w.getDataTypeModifier();

		return getValidationLabel(dataTypeModifier, type, fieldLabel);
	}

	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public static String getValidationLabel(Field f) {
		SimpleType type = (SimpleType)f.getType();
		String fieldLabel = f.getName();
		String dataTypeModifier = f.getDataTypeModifier();
		
		return getValidationLabel(dataTypeModifier, type, fieldLabel);
	}
	
	
	/**
	 * 
	 * @param dataTypeModifier
	 * @param type
	 * @param fieldLabel
	 * @return
	 */
	public static String getValidationLabel(String dataTypeModifier, SimpleType type, String fieldLabel) {
		String res = "";
		
		// ricavo la regola di validazione
		String[] validationRule = getValidationRule(dataTypeModifier);
		if ( !GenUtils.isNullOrEmpty(validationRule[0]) ) {
			if ( GenUtils.isString(type) ) {
				res += getStringValidationLabel(validationRule, fieldLabel);
			} else if ( GenUtils.isInteger(type) || GenUtils.isLong(type) ) {
				// tipo numerico integer o Long
				res += getNumericIntValidationLabel(validationRule, fieldLabel);
			} else if ( GenUtils.isDecimal(type) ) {
				// tipo numerico decimale
				res += getNumericDecValidationLabel(validationRule, fieldLabel);
			} else if ( type.getCode() == SimpleTypeCodes.DATE ) {
				res += getDateValidationLabel(validationRule, fieldLabel);
			} else if ( type.getCode() == SimpleTypeCodes.DATETIME ) {
				res += getDateTimeValidationLabel(validationRule, fieldLabel);
			} else if ( type.getCode() == SimpleTypeCodes.HOURS ) {
				res += getHourValidationLabel(validationRule, fieldLabel);
			} else {
				// sugli altri tipi � comunque definibile un validatore custom
				res += getCustomValidationLabel(validationRule, fieldLabel);
			}
		}
				
		return res;
	}
	
	
	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	public static String getStringValidationLabel(String[] validationRule, String fieldLabel) {
		String res = "";

		if ( validationRule[0].equals(STRING_SIZE_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( !GenUtils.isNullOrEmpty(range[0]) || !GenUtils.isNullOrEmpty(range[1]) ) {
					res += "Campo " + fieldLabel;
					if ( !GenUtils.isNullOrEmpty(range[0]) ) {
						res += " : minimo " + range[0] + " caratteri";
					}
					if ( !GenUtils.isNullOrEmpty(range[1]) ) {
						res += " : massimo " + range[1] + " caratteri";
					}
				}
			}
		} else if ( validationRule[0].equals(STRING_REGEXP_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				res += "Campo " + fieldLabel + " non valido";
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorLabel(validationRule[1], fieldLabel);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	public static String getNumericIntValidationLabel(String[] validationRule, String fieldLabel) {
		String res = "";

		if ( validationRule[0].equals(NUMERIC_RANGE_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( range[0] != null || range[1] != null ) {
					res += "Campo " + fieldLabel;
					if ( !GenUtils.isNullOrEmpty(range[0]) ) {
						res += " : valore minimo " + range[0];
					}
					if ( !GenUtils.isNullOrEmpty(range[1]) ) {
						res += " : valore massimo " + range[1];
					}
				}
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorLabel(validationRule[1], fieldLabel);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	public static String getNumericDecValidationLabel(String[] validationRule, String fieldLabel) {
		String res = "";

		if ( validationRule[0].equals(NUMERIC_RANGE_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				String[] range = getRange(validationRule[1]);
				if ( range[0] != null || range[1] != null ) {
					res += "Campo " + fieldLabel;
					if ( !GenUtils.isNullOrEmpty(range[0]) ) {
						res += " : valore minimo " + range[0];
					}
					if ( !GenUtils.isNullOrEmpty(range[1]) ) {
						res += " : valore massimo " + range[1];
					}
				}
			}
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorLabel(validationRule[1], fieldLabel);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	public static String getDateValidationLabel(String[] validationRule, String fieldLabel) {
		String res = "";

		if ( validationRule[0].equals(DATE_FORMAT_VALIDATOR) ) {
			String format = DATE_FORMAT;
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				format = validationRule[1];
			}
			res += getDateValidatorLabel(format, fieldLabel);
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorLabel(validationRule[1], fieldLabel);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	public static String getDateTimeValidationLabel(String[] validationRule, String fieldLabel) {
		String res = "";

		if ( validationRule[0].equals(DATE_SHORT_VALIDATOR) ) {
			res += getDateValidatorLabel(DATETIME_SHORT_FORMAT, fieldLabel);
		} else if ( validationRule[0].equals(DATE_EXTENDED_VALIDATOR) ) {
			res += getDateValidatorLabel(DATETIME_EXTENDED_FORMAT, fieldLabel);
		} else if ( validationRule[0].equals(DATE_FORMAT_VALIDATOR) ) {
			String format = DATETIME_SHORT_FORMAT;
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				format = validationRule[1];
			}
			res += getDateValidatorLabel(format, fieldLabel);
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorLabel(validationRule[1], fieldLabel);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	public static String getHourValidationLabel(String[] validationRule, String fieldLabel) {
		String res = "";

		if ( validationRule[0].equals(DATE_SHORT_VALIDATOR) ) {
			res += getDateValidatorLabel(HOUR_SHORT_FORMAT, fieldLabel);
		} else if ( validationRule[0].equals(DATE_EXTENDED_VALIDATOR) ) {
			res += getDateValidatorLabel(HOUR_EXTENDED_FORMAT, fieldLabel);
		} else if ( validationRule[0].equals(DATE_FORMAT_VALIDATOR) ) {
			String format = HOUR_SHORT_FORMAT;
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				format = validationRule[1];
			}
			res += getDateValidatorLabel(format, fieldLabel);
		} else if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			res += getCustomValidatorLabel(validationRule[1], fieldLabel);
		}

		return res;
	}


	/**
	 *
	 * @param validationRule Le regole di validazione splittate in <i>validatore</i> (<code>validationRule[0]</code>)
	 *                       e <i>parametri</i> (<code>validationRule[1]</code>).
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	public static String getCustomValidationLabel(String[] validationRule, String fieldLabel) {
		String res = "";

		if ( validationRule[0].equals(CUSTOM_VALIDATOR) ) {
			if ( !GenUtils.isNullOrEmpty(validationRule[1]) ) {
				res += getCustomValidatorLabel(validationRule[1], fieldLabel);
			}
		}

		return res;
	}


	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS	
	

	/**
	 * Estrae dal campo <code>dataTypeModifier</code> del widget le regole di validazione.
	 * <p>
	 * Le regole di validazione devono essere espresse secondo la sintassi:
	 * <blockquote><pre>
	 * validatore:parametri
	 * </pre></blockquote>
	 * dove<br>
	 * <ul>
	 * <li><b>validatore:</b> � il tipo di validatore da applicare al campo;</li>
	 * <li><b>parametri:</b> (<i>opzionale</i>) parametri necessari alla validazione; variano a seconda del validatore</li>
	 * </ul>
	 * Si rimanda alla issue <b>STDMDD-12</b> di Jira per il dettaglio dei tipi di validazione ammessi per ciascun tipo
	 * di dato e i relativi parametri.
	 *
	 * @param dataTypeModifier  Il valore del campo <code>dataTypeModifier</code> del widget.
	 * @return Le regole di validazione splittate in <i>validatore</i> (<code>rule[0]</code>) e <i>parametri</i> (<code>rule[1]</code>).
	 */
	private static String[] getValidationRule(String dataTypeModifier) {
		return splitString(dataTypeModifier, ":");
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
		return splitString(stringRange, ",");
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
		if ( !GenUtils.isNullOrEmpty(validationRule[0]) && !GenUtils.isNullOrEmpty(validationRule[1]) ) {
			if ( CUSTOM_VALIDATOR.equals(validationRule[0]) ) {
				res = validationRule[1];
			}
		}

		return res;
	}


	/* 
	 * STANDARD VALIDATOR ANNOTATION 
	 */
	
	
	private static String getStringSizeValidationAnnotation(String[] range, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";

		res += "@StringLengthFieldValidator(type = ValidatorType.FIELD, ";
		if ( expandFieldName ) {
			res += "fieldName = \"" + fieldName + "\", ";
		}
		// minimo e massimo
		if ( !GenUtils.isNullOrEmpty(range[0]) ) {
			res += "minLength = \"" + range[0] + "\", ";
		}
		if ( !GenUtils.isNullOrEmpty(range[1]) ) {
			res += "maxLength = \"" + range[1] + "\", ";
		}
		// message � obbligatorio: va settato a Stringa vuota se si usa key
		res += " message = \"\", ";
		// chiave per i18n
		res += getValidationKey(keyName);
		res += ")";

		return res;
	}


	private static String getStringRegexpValidationAnnotation(String[] validationRule, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";
		
		res += "@RegexFieldValidator(type = ValidatorType.FIELD, " +
				(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") + 
				"regex = \"" + validationRule[1] + "\", " +
				"message = \"\", " + // message e' obbligatorio: va settato a Stringa vuota se si usa key
				getValidationKey(keyName) + 
				")";
		
		return res;		
	}	


	private static String getNumericIntRangeValidationAnnotation(String[] range, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";
		
		res += "@IntRangeFieldValidator(type = ValidatorType.FIELD, ";
		if (expandFieldName ) {
			res += "fieldName = \"" + fieldName + "\", ";
		}
		// minimo e massimo
		if ( !GenUtils.isNullOrEmpty(range[0]) ) {
			res += "min = \"" + range[0] + "\", ";
		}
		if ( !GenUtils.isNullOrEmpty(range[1]) ) {
			res += "max = \"" + range[1] + "\", ";
		}
		// message � obbligatorio: va settato a Stringa vuota se si usa key
		res += " message = \"\", ";
		// chiave per i18n
		res += getValidationKey(keyName);
		res += ")";
		
		return res;		
	}


	private static String getNumericDecRangeValidationAnnotation(String[] range, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";
		
		res += "@DoubleRangeFieldValidator(type = ValidatorType.FIELD, ";
		if ( expandFieldName ) {
			res += "fieldName = \"" + fieldName + "\", ";
		}
		// minimo e massimo
		if ( !GenUtils.isNullOrEmpty(range[0]) ) {
			res += "minInclusive = \"" + range[0] + "\", ";
		}
		if ( !GenUtils.isNullOrEmpty(range[1]) ) {
			res += "maxInclusive = \"" + range[1] + "\", ";
		}
		// message � obbligatorio: va settato a Stringa vuota se si usa key
		res += " message = \"\", ";
		// chiave per i18n
		res += getValidationKey(keyName);
		res += ")";
		
		return res;		
	}	
	
	
	/**
	 *
	 * @param format     Il formato data da valiadre.
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	private static String getDateValidatorAnnotation(String format, String fieldName, String keyName, boolean expandFieldName) {
		return "@CustomValidator(" +
					"type = \"" + getGuigenCustomValidators().get(0) + "\", " +
					(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
					" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					getValidationKey(keyName) + ", " + 
					"parameters = { @ValidationParameter( name = \"format\", value = \"" + format + "\" ) } " +
			   ")";
	}
	
	/**
	 * 
	 * @param fieldName Il nome del campo da utilizzare.
	 * @return  L'annotazione da inserire nella Action di Struts.
	 */
	private static String getLongValidatorAnnotation(String fieldName, String keyName, boolean expandFieldName) {
		return "@CustomValidator(" +
					"type = \"" + getGuigenCustomValidators().get(1) + "\", " +
					(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
					" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					getValidationKey(keyName) + " } " +
			   ")";
	}


	/**
	 * 
	 * TODO: gestire eventualmente i parametri dei Custom Validators
	 * @param validator  Il nome del Custom Validator.
	 * @param fieldName  Il nome del campo da utilizzare.
	 * @return L'annotazione da inserire nella Action di Struts.
	 */
	private static String getCustomValidatorAnnotation(String validator, String fieldName, String keyName, boolean expandFieldName) {
		/*String res = "";

		if ( !GenUtils.isNullOrEmpty(validator) ) {
			String[] val = splitString(validator, "[");

			res += "@CustomValidator(" +
						"type = \"" + val[0] + "\", " +
						(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
						getValidationKey(fieldName) + 
						getCustomValidatorParametersAnnotation(val[1]) +
				   ")";
		}

		return res;*/
		
		return "@CustomValidator(" +
					"type = \"" + validator + "\", " +
					(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
					"message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					getValidationKey(keyName) + 
				")";
	}

	/*
	 * TODO: al momento non utilizzato -> implementare
	 * @param parameters
	 * @return
	 */
	/*private static String getCustomValidatorParametersAnnotation(String parameters) {
		String res = "";

		if ( !GenUtils.isNullOrEmpty(parameters) ) {
			// prendo solo i token validi (<param>:<value>)
			List<String[]> tokList = getCustomValidatorParameters(parameters);

			// aggiungo le annotazioni per i token validi
			if ( tokList.size() > 0 ) {
				res += ", parameters = { ";
				int c = 1;
				for ( String[] tok : tokList ) {
					res += "@ValidationParameter( name = \"" + tok[0] + "\", value = \"" + tok[1] + "\" )";

					if ( c < tokList.size() ) {
						res += ", ";
					}
					c++;
				} // END FOREACH
				res += "} ";
			}
		}

		return res;
	}*/


	/*
	 * TODO: al momento non utilizzato -> implementare
	 * @param parameters
	 * @return
	 */
	/*private static List<String[]> getCustomValidatorParameters(String parameters) {
		List<String[]> tokList = new ArrayList<String[]>();

		if ( !GenUtils.isNullOrEmpty(parameters) ) {
			StringTokenizer strTok = new StringTokenizer(parameters, "][");

			if ( strTok.countTokens() > 0 ) {
				while ( strTok.hasMoreTokens() ) {
					String t = strTok.nextToken();
					if ( !GenUtils.isNullOrEmpty(t) ) {
						String[] parts = splitString(t.trim(), ":");
						if ( !GenUtils.isNullOrEmpty(parts[0]) && !GenUtils.isNullOrEmpty(parts[1]) ) {
							tokList.add(parts);
						}
					}
				} // END WHILE
			}
		}

		return tokList;
	}*/



	/* 
	 * USER DEFINED VALIDATOR ANNOTATION 
	 */	
	
	
	private static String getStringSizeUdValidationAnnotation(String[] range, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";

		res += "@CustomValidator(" +
					"type = \"csiUdStringRangeValidator\", " +
					(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
					" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					getValidationKey(keyName) + ", " + 
					"parameters = { " ;
						// minimo e massimo
						if ( !GenUtils.isNullOrEmpty(range[0]) ) {
							res += "@ValidationParameter( name = \"minLength\", value = \"" + range[0] + "\" ), ";
						}
						if ( !GenUtils.isNullOrEmpty(range[1]) ) {
							res += "@ValidationParameter( name = \"maxLength\", value = \"" + range[1] + "\" ) ";
						}					
					res += "} ";
		res += ")";

		return res;		
	}


	private static String getStringRegexpUdValidationAnnotation(String[] validationRule, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";
		
		res += "@CustomValidator(" +
					"type = \"csiUdStringRegexpValidator\", " +
					(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
					" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					getValidationKey(keyName) + ", " + 
					"parameters = { @ValidationParameter( name = \"regex\", value = \"" + validationRule[1] + "\" ) } " +
			   ")";
		
		return res;		
	}	


	private static String getNumericIntRangeUdValidationAnnotation(String[] range, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";

		res += "@CustomValidator(" +
				"type = \"csiUdNumericIntValidator\", " +
				(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
				" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
				getValidationKey(keyName) + ", " + 
				"parameters = { " ;
					// minimo e massimo
					if ( !GenUtils.isNullOrEmpty(range[0]) ) {
						res += "@ValidationParameter( name = \"min\", value = \"" + range[0] + "\" ), ";
					}
					if ( !GenUtils.isNullOrEmpty(range[1]) ) {
						res += "@ValidationParameter( name = \"max\", value = \"" + range[1] + "\" ) ";
					}					
				res += "} ";
		res += ")";
		
		
		return res;	
	}	
	
	private static String getNumericLongRangeUdValidationAnnotation(
			String[] range, String fieldName, String keyName,
			boolean expandFieldName) {
		String res = "";
//		TODO [SC] verificare il corretto funzionamento
		res += "@CustomValidator(" +
				"type = \"csiUdLongRangeValidator\", " +
				(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
				" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
				getValidationKey(keyName) + ", " + 
				"parameters = { " ;
					// minimo e massimo
					if ( !GenUtils.isNullOrEmpty(range[0]) ) {
						res += "@ValidationParameter( name = \"min\", value = \"" + range[0] + "\" ) ";
					}
					if ( !GenUtils.isNullOrEmpty(range[1]) ) {
						res += ", @ValidationParameter( name = \"max\", value = \"" + range[1] + "\" ) ";
					}					
				res += "} ";
		res += ")";
		
		
		return res;	
	}
	
	private static String getNumericLongRangeValidationAnnotation(
			String[] range, String fieldName, String keyName,
			boolean expandFieldName) {
		String res = "";
//		TODO [SC] verificare il corretto funzionamento
		res += "@CustomValidator(" +
				"type = \"csiLongRangeValidator\", " +
				(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
				" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
				getValidationKey(keyName) + ", " + 
				"parameters = { " ;
					// minimo e massimo
					if ( !GenUtils.isNullOrEmpty(range[0]) ) {
						res += "@ValidationParameter( name = \"min\", value = \"" + range[0] + "\" ) ";
					}
					if ( !GenUtils.isNullOrEmpty(range[1]) ) {
						res += ", @ValidationParameter( name = \"max\", value = \"" + range[1] + "\" ) ";
					}					
				res += "} ";
		res += ")";
		
		return res;		
	}


	
	


	private static String getNumericDecRangeUdValidationAnnotation(String[] range, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";

		res += "@CustomValidator(" +
				"type = \"csiUdNumericDecValidator\", " +
				(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
				" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
				getValidationKey(keyName) + ", " + 
				"parameters = { " ;
					// minimo e massimo
					if ( !GenUtils.isNullOrEmpty(range[0]) ) {
						res += "@ValidationParameter( name = \"minInclusive\", value = \"" + range[0] + "\" ), ";
					}
					if ( !GenUtils.isNullOrEmpty(range[1]) ) {
						res += "@ValidationParameter( name = \"maxInclusive\", value = \"" + range[1] + "\" ) ";
					}					
				res += "} ";
		res += ")";
		
		return res;		
	}	
	
	
	private static String getDateUdValidatorAnnotation(String format, String fieldName, String keyName, boolean expandFieldName) {
		String res = "";
		res += "@CustomValidator(" +
					"type = \"csiUdDateValidator\", " +
					(expandFieldName ? "fieldName = \"" + fieldName + "\", " : "") +
					" message = \"\", " + // message � obbligatorio: va settato a Stringa vuota se si usa key
					getValidationKey(keyName) + ", " + 
					"parameters = { @ValidationParameter( name = \"format\", value = \"" + format + "\" ) } " +
			   ")";		
		return res;
	}



	/**
	 * 
	 * @param key
	 * @return
	 */
	private static String getVisitorFieldValidatorAnnotation(String key) {
		// message � obbligatorio: va settato a Stringa vuota se si usa key
		return "@VisitorFieldValidator(message = \"\", key = \"" + key + "\", appendPrefix = true)";
	}
	

	/**
	 * 
	 * @param fieldName
	 * @return
	 */
	private static String getValidationKey(String keyName) {
		return "key = \"" + keyName + VALIDATOR_VALIDATION_LABEL + "\"";
	}	
	
	
	/**
	 *
	 * @param format     Il formato data da validare.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	private static String getDateValidatorLabel(String format, String fieldLabel) {
		return "Campo " + fieldLabel + " : formato " + format + " non rispettato";
	}


	/**
	 * 
	 * @param validator  Il nome del Custom Validator.
	 * @param fieldLabel Il nome del campo (<code>label</code> del widget) da utilizzare nel messaggio.
	 * @return La label da inserire nel file di properties relativo alla Action di Struts.
	 */
	private static String getCustomValidatorLabel(String validator, String fieldLabel) {
		return "Campo " + fieldLabel + " non valido";
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// UTILS METHODS

	/**
	 *
	 * @param s
	 * @param sep
	 * @return
	 */
	public static String[] splitString(String s, String sep) {
		String[] res = new String[2];

		if ( !GenUtils.isNullOrEmpty(s) ) {
			String sr = s.trim();
			int i = sr.indexOf(sep);

			if ( i > 0 ) {
				// presente chiave e valore (<key>sep<val>) oppure solo la chiave (<key>sep)
				res[0] = sr.substring(0, i).trim();
				if ( i+1 < sr.length() ) {
					res[1] = sr.substring(i+1).trim();
				}
			} else if ( i < 0 ) {
				// presente solo la chiave espressa senza separatore (<key>)
				res[0] = sr;
			} else if ( i == 0 ) {
				// presente solo il valore espresso con il separatore davanti (sep<val>)
				if ( !GenUtils.isNullOrEmpty(sr.substring(1).trim()) ) {
					res[1] = sr.substring(1).trim();
				}
			}

		}

		return res;
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
