package it.csi.mddtools.guigen.genutils.intracom;

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
import it.csi.mddtools.guigen.WidgetsPanel;

import it.csi.mddtools.guigen.genutils.GenUtils;
import it.csi.mddtools.guigen.genutils.GenUtilsLayout;


/**
 * Questa classe contiene i metodi di utilit&agrave; per la gestione di
 * alcuni aspetti del layout per il portale Intracom Torino.
 *
 * @author Davide Martinotti
 */
public class GenUtilsLayoutIntracom {


	/**
	 * Ho un FormPanel di primo livello con layout UDLRC: quante colonne imposto sull'HTML?
	 * - [U][D] L R C -> layout 3 colonne
	 * - [U][D] L C   -> layout 2 colonne
	 * - [U][D] L R   -> combinazione illegale (check)
	 * - [U][D] C     -> layout 1 colonna
	 * 
	 * Viene ridefinito tamite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * - RuparPiemonte
	 * 
	 * @param firstLevPanel
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */
	public static int getColumnsLayout(FormPanel firstLevPanel, GUIModel model) {
		PanelLayout currPanLay = firstLevPanel.getLayout();
		int columns = 1;
		
		// TODO: IMPLEMENTARE SE NECESSARIO O ELIMINARE

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
		
		// TODO: IMPLEMENTARE SE NECESSARIO O ELIMINARE

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
		String btnStyleT = "";
		
		if ( b.eContainer() instanceof CommandPanel ) {
			if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.NAVIGATION ) {
				// setto lo stile (per il momento non necessario)
				//btnStyleT += " cssClass=\"???\"";
			} else if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.FUNCTIONAL ) {
				// setto lo stile (per il momento non necessario)
				//btnStyleT += " cssClass=\"???\"";
			}
			
			// setto gli eventi (rollover)
			btnStyleT += "onmouseover=\"this.className='pulsatt'\" onmouseout=\"this.className=''\" " +
						 "onfocus=\"this.className='pulsatt'\" onblur=\"this.className=''\"";
		} 
		else if ( b.eContainer() instanceof WidgetsPanel ) {
			// se e' in un WidgetsPanel, interpreto come FUNCTIONAL
			btnStyleT += "cssClass=\"cercodfisc\" ";
			btnStyleT += "onmouseover=\"this.className='pulsattcodf'\" onmouseout=\"this.className='cercodfisc'\" " + 
						 "onfocus=\"this.className='pulsattcodf'\" onblur=\"this.className='cercodfisc'\"";
		} 
		else {
			// di default per il caso di button non contenuto in un altro tipo di Panel 
			btnStyleT = "";
		}		
		
		return btnStyleT;
	}


	/**
	 * Restituisce lo stile per i TextField.
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param t Il widget di tipo TextFiled da gestire
	 * @return
	 * @author [DM] STDMDD-188
	 */
	public static String getTextFieldStyleByLayout(GUIModel model, TextField t) {
		String res = "";

		// TODO: IMPLEMENTARE SE NECESSARIO O ELIMINARE
		
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
			res = "class=\"boxmsgok\"";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.WARN ) {
			res = "class=\"boxavviso\"";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.ERROR ) {
			res = "class=\"boxmsgerror\"";
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
		
		// TODO: IMPLEMENTARE SE NECESSARIO O ELIMINARE

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
		
		// TODO: IMPLEMENTARE SE NECESSARIO O ELIMINARE
		
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
		
		// TODO: IMPLEMENTARE SE NECESSARIO O ELIMINARE
		
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
		
		return res;
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS (se necessari)





	////////////////////////////////////////////////////////////////////////////////////////////////////
	// MAIN

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
