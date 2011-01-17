package it.csi.mddtools.guigen.genutils.neutral;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.CommandFunctions;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.ConfirmButton;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GridWidgetLayoutSpec;
import it.csi.mddtools.guigen.MenuPanel;
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
 * alcuni aspetti del layout per il portale New Rupar.
 *
 * @author Davide Martinotti
 */
public class GenUtilsLayoutNeutral {

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

	
	/**
	 * 
	 * @param mp
	 * @return
	 */
	public static String getMenuPanelOrientation(MenuPanel mp) {
		String res = "";

		// il MenuPanel può essere contenuto solo in un FormPanel (da check)
		FormPanel parent = (FormPanel)mp.eContainer();
		
		// a che livello di annidamento è inserito il MenuPanel?
		int level = getMenuPanelLevel(parent);
		
		
		if ( level == 1 ) {
			// il menu è contenuto in un FormPanel di primo livello
			if ( parent.getLayout() instanceof VerticalFlowPanelLayout ) {
				res = " horizontal";
			}
		} 
		else if ( level == 2 ) {
			// il menu è contenuto in un FormPanel di secondo livello...
			if ( parent.getLayoutSpec() != null && parent.getLayoutSpec() instanceof UDLRCWidgetLayoutSpec ) {
				// con layout UDLRC: in quale quadrante è?
				UDLRCSpecConstants quadrante = ((UDLRCWidgetLayoutSpec)parent.getLayoutSpec()).getValue();
				if ( quadrante== UDLRCSpecConstants.LEFT || quadrante== UDLRCSpecConstants.RIGHT ) {
					res = " vertical";
				} else if ( quadrante== UDLRCSpecConstants.UP || quadrante== UDLRCSpecConstants.DOWN ) {
					res = " horizontal";
				}
			}
		}
		else {
			// e se è annidato più profondamente?
		}
		
		return res;
	}
	
	
	
	private static int getMenuPanelLevel(EObject obj) {
		EObject parent = obj.eContainer();
		if ( parent instanceof ContentPanel ) {
			return 1;
		} else {
			return 1 + getMenuPanelLevel(parent);
		}
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
		String cmdStyle = "";

		CommandFunctions cmdFunct =  b.getFunctionSpecifier();
		if (cmdFunct != null) {
			if (CommandFunctions.ADD_ITEM.equals(cmdFunct)) {
				cmdStyle = "addItem";
			} else if (CommandFunctions.EDIT_ITEM.equals(cmdFunct)) {
				cmdStyle = "editItem";
			} else if (CommandFunctions.DELETE_ITEM.equals(cmdFunct)) {
				cmdStyle = "deleteItem";
			} else if (CommandFunctions.SEARCH.equals(cmdFunct)) {
				cmdStyle = "search";
			} else if (CommandFunctions.SAVE.equals(cmdFunct)) {
				cmdStyle = "save";
			} else if (CommandFunctions.LOAD.equals(cmdFunct)) {
				cmdStyle = "load";
			} else if (CommandFunctions.DETAIL.equals(cmdFunct)) {
				cmdStyle = "detail";
			} else if (CommandFunctions.LOOKUP.equals(cmdFunct)) {
				cmdStyle = "lookup";			
			} else if (CommandFunctions.NEXT_ITEM.equals(cmdFunct)) {
				cmdStyle = "nextItem";
			} else if (CommandFunctions.PREVIOUS_ITEM.equals(cmdFunct)) {
				cmdStyle = "previousItem";
			} else if (CommandFunctions.FIRST_ITEM.equals(cmdFunct)) {
				cmdStyle = "firstItem";
			} else if (CommandFunctions.LAST_ITEM.equals(cmdFunct)) {
				cmdStyle = "lastItem";
			} else if (CommandFunctions.CONFIRM.equals(cmdFunct)) {
				cmdStyle = "confirm";
			} else if (CommandFunctions.CANCEL.equals(cmdFunct)) {
				cmdStyle = "cancel";
			} else if (CommandFunctions.FORWARD.equals(cmdFunct)) {
				cmdStyle = "forward";
			} else if (CommandFunctions.BACK.equals(cmdFunct)) {
				cmdStyle = "back";
			} else if (CommandFunctions.SHOW_REPORT.equals(cmdFunct)) {
				cmdStyle = "showReport";
			} else if (CommandFunctions.SHOW_HELP.equals(cmdFunct)) {
				cmdStyle = "showHelp";
			} else if (CommandFunctions.SEND_MESSAGE.equals(cmdFunct)) {
				cmdStyle = "sendMessage";
			}
		}
		
		res = "cssClass=\"buttonWidget" + (!GenUtils.isNullOrEmpty(cmdStyle) ? " " + cmdStyle : "") + "\"";
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
		
		if(t.getFieldLength() > 0){
			res += "size=\""+t.getFieldLength()+"\" ";
		}
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
			res += "cssClass=\"" + style + "\"";
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
			msgSeverity = " info";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.WARN ) {
			msgSeverity = " warning";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.ERROR ) {
			msgSeverity = " error";
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
		assert table.getMultiDataBinding() != null;
		assert table.getMultiDataBinding().getAppData() != null;
		assert table.getMultiDataBinding().getAppData().getType() instanceof TypedArray;
		Type t = ((TypedArray)table.getMultiDataBinding().getAppData().getType()).getComponentType();
		Field f = GenUtils.getSelectedField(null, t, col.getSelector());

		if ( f != null ) {
			String style = "";
			if (f.getType()instanceof SimpleType && GenUtils.isNumeric((SimpleType)f.getType()) ) {
				style = "numbers";
			}

			// TODO: trasformare in un check
			assert !col.isEditable() || f.getType() instanceof SimpleType;

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
				style = "numbers";
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


	/**
	 * Restituisce l'attributo di obbligatoriet&agrave; del campo 
	 * da settare nella custom Component widgetsPanelColumn
	 * 
	 * @param w
	 * @return
	 * @author [DM]
	 */
	public static String getCustomtagRequiredField(Widget w) {
		String res = "";

		if ( w instanceof DataWidget ) {
			if ( ((DataWidget)w).isRequired() ) {
				res = "fieldRequired=\"true\"";
			}
		}

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
		
		// Table e i Button (Button, ConfirmButton, ResetButton) non hanno label, quindi devo aggiungere 1 al colspan
		if ( w instanceof Table || w instanceof Button || w instanceof ConfirmButton || w instanceof ResetButton ) {
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
