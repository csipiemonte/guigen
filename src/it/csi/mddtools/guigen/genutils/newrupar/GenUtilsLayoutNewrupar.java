package it.csi.mddtools.guigen.genutils.newrupar;

import java.util.ArrayList;
import java.util.List;

import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandStyles;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.MessageSeverity;
import it.csi.mddtools.guigen.MsgBoxPanel;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.PlainText;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TextField;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.Widget;

import it.csi.mddtools.guigen.genutils.GenUtils;
import it.csi.mddtools.guigen.genutils.GenUtilsLayout;


/**
 * Questa classe contiene i metodi di utilit&agrave; per la gestione di
 * alcuni aspetti del layout per il portale New Rupar.
 *
 * @author Davide Martinotti
 */
public class GenUtilsLayoutNewrupar {

	////////////////////////////////////////////////////////////////////////////////////////////////////
	// METODI SPECIFICI

	/**
	 * 
	 * @param cp
	 * @param quadrante
	 * @return
	 */
	public static List<Button> getButtonsByUDLRCPosition(CommandPanel cp, UDLRCSpecConstants quadrante) {
		List<Button> res = new ArrayList<Button>();

		for ( Widget w : cp.getWidgets() ) {
			if ( w instanceof Button ) {
				UDLRCWidgetLayoutSpec curLay = (UDLRCWidgetLayoutSpec)w.getLayoutSpec();
				if ( curLay != null && curLay.getValue() == quadrante ) {
					res.add((Button)w);
				}
			}
		}

		return res;
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// RIDEFINIZIONE DI METODI PER AOP	

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
			columns = getUDLRCColumnsLayout(firstLevPanel);
		} else  {
			throw new IllegalArgumentException("Layout " + currPanLay.getClass().getName() + " non gestito al primo livello");
		}

		return columns;
	}


	/**
	 * Restituisce lo stile del <div> per i Button
	 * Entro qui solo se ho un layout UDLRC
	 *  
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param b Il Button da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getButtonDivStyleByLayout(GUIModel model, Button b) {
		String res = "";

		if ( ((UDLRCWidgetLayoutSpec)b.getLayoutSpec()).getValue() ==  UDLRCSpecConstants.LEFT ) {
			res = "class=\"button left\"";
		} else if ( ((UDLRCWidgetLayoutSpec)b.getLayoutSpec()).getValue() ==  UDLRCSpecConstants.CENTER ) {
			// per introdurre il caso CENTER è stato necessario modificare i CHECK (prima non era permesso)
			res = "class=\"button center\"";
		} else if ( ((UDLRCWidgetLayoutSpec)b.getLayoutSpec()).getValue() ==  UDLRCSpecConstants.RIGHT ) {
			res = "class=\"button right\"";
		}

		return res;
	}


	/**
	 * Restituisce lo stile per i Button.
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param b Il Button da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getButtonStyleByLayout(GUIModel model, Button b) {
		String res = "";
		// TODO: Implementare nel caso sia necessario trasferire anche sul pulsante il tipo di pannello
		//       (ma NON deve essere necessario....) o serva dare uno stile al pulsante
		//       (idem con patate...)
		return res;
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

		// stile per il formato (numerico o no)
		String style = "";
		Type tp = t.getDataType();
		if ( tp instanceof SimpleType ) {
			if ( GenUtils.isNumeric((SimpleType)tp) ) {
				style = "numbers";
			}
		}

		// compongo lo stile
		if ( !GenUtils.isNullOrEmpty(style) ) {
			res = "cssClass=\"" + style + "\"";
		}

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
		String msgSeverity = "";
		if ( mbp.getMessageSeverity() == MessageSeverity.INFO ) {
			msgSeverity = " Info";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.WARN ) {
			msgSeverity = " Warning";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.ERROR ) {
			msgSeverity = " Error";
		}
		return msgSeverity;
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

		Type t = ((TypedArray)table.getMultiDataBinding().getAppData().getType()).getComponentType();
		Field f = GenUtils.getSelectedField(null, t, col.getSelector());

		if ( f != null ) {
			String style = "";
			if ( GenUtils.isNumeric((SimpleType)f.getType()) ) {
				style = "numbers";
			}
			
			// TODO: implementare altri stili se necessario
			
			if ( !GenUtils.isNullOrEmpty(style) ) {
				res = "class=\"" + style + "\"";
			}
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
		res = "cssClass=\"checkbox\"";
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

		// Imposto lo stile
		if ( t != null ) {
			String style = "";
			
			if ( GenUtils.isNumeric(t) ) {
				res = "numbers";
			}
			
			// TODO: implementare altri stili se necessario
			
			if ( !GenUtils.isNullOrEmpty(style) ) {
				res = "tdStyleClass=\"" + style + "\"";
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

		// TODO: IMPLEMENTARE SE NECESSARIO O ELIMINARE
		//res = "cssClass=\"inputDataMed\"";

		return res;
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS (se necessari)

	/**
	 * 
	 * @param firstLevPanel
	 * @return
	 */
	private static int getUDLRCColumnsLayout(FormPanel firstLevPanel) {
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
