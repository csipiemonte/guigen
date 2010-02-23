package it.csi.mddtools.guigen.genutils.sisp;

import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandStyles;
import it.csi.mddtools.guigen.ConfirmButton;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.FileUpload;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GridWidgetLayoutSpec;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.MessageSeverity;
import it.csi.mddtools.guigen.MsgBoxPanel;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.PlainText;
import it.csi.mddtools.guigen.ResetButton;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TextField;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.UserDefinedWidget;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WidgetsPanel;

import it.csi.mddtools.guigen.genutils.GenUtils;
import it.csi.mddtools.guigen.genutils.GenUtilsLayout;


/**
 * Questa classe contiene i metodi di utilit&agrave; per la gestione di
 * alcuni aspetti del layout per il portale SistemaPiemonte.
 *
 * @author Davide Martinotti
 */
public class GenUtilsLayoutSisp {


	/**
	 * Ho un FormPanel di primo livello con layout UDLRC: quante colonne imposto sull'HTML?
	 * - [U][D] L R C -> layout 3 colonne
	 * - [U][D] L C   -> layout 2 colonne
	 * - [U][D] L R   -> combinazione illegale (check)
	 * - [U][D] C     -> layout 1 colonna
	 * 
	 * @param firstLevPanel
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */
	public static int getColumnsLayout(FormPanel firstLevPanel, GUIModel model) {
		PanelLayout currPanLay = firstLevPanel.getLayout();
		int columns = 1;
		
		if ( currPanLay instanceof VerticalFlowPanelLayout ) {
			columns = 1;
		} else if ( currPanLay instanceof UDLRCPanelLayout ) {
			columns = getUDLRCColumnsLayoutSisp(firstLevPanel);
		} else if ( currPanLay instanceof HorizontalFlowPanelLayout ) {
			// ??? come lo gestisco
			columns = 1;
		}

		return columns;
	}


	/**
	 * Restituisce lo stile del <div> per i Button
	 *  
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param b Il Button da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getButtonDivStyleByLayout(GUIModel model, Button b) {
		String res = "";
		
		String btnStyleT = "";
		if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.NAVIGATION ) {
			btnStyleT = "Nav";
		} else if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.FUNCTIONAL ) {
			btnStyleT = "Funz";
		}
		
		if ( ((UDLRCWidgetLayoutSpec)b.getLayoutSpec()).getValue() ==  UDLRCSpecConstants.LEFT ) {
			res = "class=\"puls" + btnStyleT + "Sx\"";
		} else if ( ((UDLRCWidgetLayoutSpec)b.getLayoutSpec()).getValue() ==  UDLRCSpecConstants.RIGHT ) {
			res = "class=\"puls" + btnStyleT + "Dx\"";
		}

		return res;
	}


	/**
	 * Restituisce lo stile per i Button.
	 * Non mi piace molto questa implementazione (troppo empirica), ma...
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param b Il Button da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getButtonStyleByLayout(GUIModel model, Button b) {
		int btnStyleL = 70;
		int PIXEL_PER_CHAR = 8; // consideriamo una media di 8px per ogni carattere

		if ( b.getLabel() != null ) {
			int lblLen = b.getLabel().length();
			int size = lblLen * PIXEL_PER_CHAR;
			
			if ( size <= 70 ) {
				btnStyleL = 70;
			} else if ( size > 70 && size <= 95 ) {
				btnStyleL = 95;
			} else if ( size > 95 && size <= 160 ) {	
				btnStyleL = 160;
			} else if ( size > 160 && size <= 190 ) {
				btnStyleL = 190;
			} else if ( size > 190 && size <= 205 ) {
				btnStyleL = 205;
			} else if ( size > 205 && size <= 255 ) {
				btnStyleL = 255;
			} else if ( size > 255 ) {
				btnStyleL = 330;
			}
		}
		
		String btnStyleT = "";
		if ( b.eContainer() instanceof CommandPanel ) {
			if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.NAVIGATION ) {
				btnStyleT = "nav";
			} else if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.FUNCTIONAL ) {
				btnStyleT = "funz";
			}
		} else {
			// di default per il caso deprecato di button non contenuto in un CommandPanel
			btnStyleT = "funz";
		}
		
		return "cssClass=\"" + btnStyleT + btnStyleL + " overouthandler\"";
	}


	/**
	 * Restituisce lo stile per i TextField.
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param t Il widget di tipo TextFiled da gestire
	 * @return
	 * @author [DM] STDMDD-188
	 */
	public static String getTextFieldStyleByLayout(GUIModel model, TextField t) {
		String res = "";
		int len = t.getFieldLength();
		if ( len > 0 ) {
			// stile per la lunghezza
			String lenCss = "";
			if ( len <= 14 ) {
				// "small" se Textfield.size in [1..14]
				lenCss = "small";
			} else if ( len >= 15 && len <= 29  ) {
				// "med" se Textfield.size in [15..29]
				lenCss = "med";
			} else if ( len >= 30 ) {
				// "maxi" se Textfield.size >= 30 
				lenCss = "maxi";
			}
			
			// stile per il formato (numerico o no)
			String numCss = "";
			Type tp = t.getDataType();
			if ( tp instanceof SimpleType ) {
				if ( GenUtils.isNumeric((SimpleType)tp) ) {
					numCss = " numeri";
				}
			}
			
			// compongo
			res = "cssClass=\"" + lenCss + numCss + "\"";
		}
		
		return res;
	}

	
	/**
	 * Restituisce lo stile per i FileUpload.
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param f Il widget di tipo FileUpload da gestire
	 * @return
	 * @author [DM] STDMDD-294
	 */
	public static String getFileUploadStyleByLayout(GUIModel model, FileUpload f) {
		String res = "";
		
		/*int len = f.getFieldLength();
		if ( len > 0 ) {
			// stile per la lunghezza
			String lenCss = "";
			if ( len <= 14 ) {
				// "small" se Textfield.size in [1..14]
				lenCss = "small";
			} else if ( len >= 15 && len <= 29  ) {
				// "med" se Textfield.size in [15..29]
				lenCss = "med";
			} else if ( len >= 30 ) {
				// "maxi" se Textfield.size >= 30 
				lenCss = "maxi";
			}
			
			res = "cssClass=\"" + lenCss + "\"";
		}*/
		
		res = "cssClass=\"med\"";
		return res;
	}
	

	/**
	 * Restituisce lo stile di un MsgBoxPanel.
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param mbp
	 * @return
	 * @author [DM]
	 */
	public static String getMsgBoxPanelStyleByPortal(GUIModel model, MsgBoxPanel mbp) {
		String res = "";
		if ( mbp.getMessageSeverity() == MessageSeverity.INFO ) {
			res = "class=\"messaggioOk\"";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.WARN ) {
			res = "class=\"messaggio\"";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.ERROR ) {
			res = "class=\"messaggioKo\"";
		}
		return res;
	}


	/**
	 * Restituisce lo stile di una colonna sulla base del tipo bindato alla colonna stessa.
	 * 
	 * @param col
	 * @param t
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */
	public static String getColumnStyle(Column col, Table table, GUIModel model) {
		String res = "";
		assert table.getMultiDataBinding() != null;
		assert table.getMultiDataBinding().getAppData() != null;
		assert table.getMultiDataBinding().getAppData().getType() instanceof TypedArray;
		Type t = ((TypedArray)(table.getMultiDataBinding().getAppData().getType())).getComponentType();
		Field f = GenUtils.getSelectedField(null, t, col.getSelector());
		
		if ( f != null) {
			if ( f.getType() instanceof SimpleType && GenUtils.isNumeric((SimpleType)f.getType()) ) {
				res = "class=\"numeri\"";
			}
			// TODO: trasformare in un check
			assert !col.isEditable() || f.getType() instanceof SimpleType;
		}

		return res;
	}


	/**
	 * Restituisce la classe per un CheckBox
	 * NOTA: Anche se il codice è semplice (e potrebbe stare in .ext) DEVE rimanere qui
	 *       in Java poichè questo metodo è chiamato anche da GenUtils.
	 *       
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */
	public static String getCheckboxPortalStyle(GUIModel model) {
		String res = "";
		res = "cssClass=\"noBorder\"";
		return res;
	}


	/**
	 * Restituisce la classe da applicare ad una cella nella CustomComponent sulla base
	 * del tipo di dato del Widget (PlainText).
	 * Utilizzato per allineare a destra i dati numerici.
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param w Il widget di tipo PlainText da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getCustomComponentColumnStyleByPortal(GUIModel model, PlainText w) {
		String res = "";
		
		SimpleType t = null;
		if ( w.getDatabinding() != null ) {
			// recupero il tipo dal Databinding
			Field f = GenUtils.getSelectedField(null, w.getDatabinding().getAppData().getType(), w.getDatabinding().getPath());
			if ( f != null ) {
				if ( f.getType() instanceof SimpleType ) {
					t = (SimpleType)f.getType();
				}
			}
		} 
		else {
			// recupero il tipo direttamente dal widget
			if ( w.getDataType() instanceof SimpleType ) {
				t = (SimpleType)w.getDataType();
			}
		}
		
		if ( t != null ) {
			if ( GenUtils.isNumeric(t) ) {
				res = "tdStyleClass=\"numeri\"";
			}
		}
		return res;
	}


	/**
	 * Restituisce la classe per un TextField in una Table.
	 * NOTA: Anche se il codice è semplice (e potrebbe stare in .ext) DEVE rimanere qui
	 *       in Java poichè questo metodo è chiamato anche da GenUtils.
	 *  
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */	
	public static String getColumnEditableTextfieldPortalStyle(GUIModel model) {
		String res = "";
		res = "cssClass=\"inputDataMed\"";
		return res;
	}

	/**
	 * Imposta l'attributo <code>colSpan</code> della Customtag component (nel caso sia necessario).
	 * 
	 * @param wp Il WidgetsPanel che contiene il Widget da posizionare.
	 * @param w  Il Widget da posizionare.
	 * @return L'attributo <code>colSpan</code> correttamente settato (nel caso sia necessario).
	 * @author [DM]
	 */
	public static String getCustomtagHeaderColspan(WidgetsPanel wp, Widget w) {
		String res = "";
		int colspan = 1;

		if ( GenUtilsLayout.needHandleCustomtagHeaderHspan(wp, w) ) {
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();
			colspan = ((hspan * 2) - 1);
		}
		
		// Table e UserDefinedWidget e i Button (Button, ConfirmButton, ResetButton) non hanno label, quindi devo aggiungere 1 al colspan
		if ( w instanceof Table || w instanceof UserDefinedWidget || w instanceof Button || w instanceof ConfirmButton || w instanceof ResetButton ) {
			colspan = colspan + 1;
		} else if ( w.getLabel() == null ) {
			// Per gli altri widgets, se l'attributo "label" è null non mette la colonna della label
			colspan = colspan + 1;
		}
		
		if ( colspan > 1 ) {
			res = "colSpan=\"" + colspan + "\"";
		}
		return res;
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS (se necessari)

	/**
	 * 
	 * @param firstLevPanel
	 * @return
	 */
	private static int getUDLRCColumnsLayoutSisp(FormPanel firstLevPanel) {
		int columns = 1;

		int left = GenUtilsLayout.getSubPanelsByLayout(firstLevPanel, UDLRCSpecConstants.LEFT).size();
		int right = GenUtilsLayout.getSubPanelsByLayout(firstLevPanel, UDLRCSpecConstants.RIGHT).size();
		
		if ( right == 1 ) {
			// layout 3 colonne
			columns = 3;
		} else if ( left == 1 ) {
			// layout 2 colonne
			columns = 2;
		} else {
			// layout 1 colonna
		}
		
		return columns;
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
