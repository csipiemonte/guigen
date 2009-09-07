package it.csi.mddtools.guigen.genutils.rupar;

import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandStyles;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.MessageSeverity;
import it.csi.mddtools.guigen.MsgBoxPanel;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;


/**
 * Questa classe contiene i metodi di utilit&agrave; per la gestione di
 * alcuni aspetti del layout per il portale RuparPiemonte.
 *
 * @author Davide Martinotti
 */
public class GenUtilsLayoutRupar {


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
			columns = getUDLRCColumnsLayoutRupar(firstLevPanel);
		} else if ( currPanLay instanceof HorizontalFlowPanelLayout ) {
			// ??? come lo gestisco
			columns = 1;
		}

		return columns;
	}


	/**
	 * Restituisce lo stile per i button. 
	 * Non mi piace molto questa implementazione (troppo empirica), ma...
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param b Il Button da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getButtonStyleByLayout(GUIModel model, Button b) {
		String css = "";

		String btnStyleT = "";
		if ( b.eContainer() instanceof CommandPanel ) {
			CommandPanel container = (CommandPanel)b.eContainer();
			if ( container.getCmdStyle() == CommandStyles.NAVIGATION ) 
			{
				if ( container.getLayout() instanceof UDLRCPanelLayout ) 
				{
					if ( ((UDLRCWidgetLayoutSpec)b.getLayoutSpec()).getValue() ==  UDLRCSpecConstants.RIGHT ) {
						btnStyleT = "inputBarra1";
					} else {
						btnStyleT = "inputPulsante";
					}
				}
				else if ( container.getLayout() instanceof HorizontalFlowPanelLayout ) 
				{
					if ( container.getWidgets().size() == 1) {
						btnStyleT = "inputBarraTot";
					} else {
						// devo capire se è l'ultimo o no
						Button lastB = (Button)container.getWidgets().get(container.getWidgets().size()-1);
						if ( lastB == b ) {
							btnStyleT = "inputBarra1";
						} else {
							btnStyleT = "inputPulsante";
						}
					}
				}
			} 
			else if ( container.getCmdStyle() == CommandStyles.FUNCTIONAL ) {
				btnStyleT = "inputPulsante";
			}
		} else {
			// di default per il caso di button non contenuto in un CommandPanel
			btnStyleT = "inputPulsante";
		}		
		
		/*if ( b.getLabel() != null ) {
			int lblLen = b.getLabel().length();
			
			if ( lblLen > 0 && lblLen < 15 ) {
				css = "";
			} else if ( lblLen >= 15 && lblLen <= 20 ) {
				css = " big";
			} else if ( lblLen >= 21 && lblLen <= 31 ) {
				css = " bigger";
			} else if ( lblLen >= 32 ) {
				css = " biggest";
			}
		}*/
		
		return "cssClass=\"" + btnStyleT + css + "\" onmouseover=\"javascript:overOutHandler(this, '" + btnStyleT + "Hover" + css + "');\" onmouseout=\"javascript:overOutHandler(this, '" + btnStyleT + css + "');\"";
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
			res = "id=\"boxAvviso\"";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.WARN ) {
			res = "id=\"boxAvviso\"";
		} else if ( mbp.getMessageSeverity() == MessageSeverity.ERROR ) {
			res = "id=\"boxError\"";
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



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS (se necessari)	
	
	/**
	 * 
	 * @param firstLevPanel
	 * @return
	 */
	private static int getUDLRCColumnsLayoutRupar(FormPanel firstLevPanel) {
		int columns = 1;
		// al momento gestico l'UDLRC come colonna unica...
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
