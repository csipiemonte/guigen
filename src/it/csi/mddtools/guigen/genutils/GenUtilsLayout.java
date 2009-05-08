package it.csi.mddtools.guigen.genutils;

import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandStyles;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GridPanelLayout;
import it.csi.mddtools.guigen.GridWidgetLayoutSpec;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.PlainText;
import it.csi.mddtools.guigen.PortalNames;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TextField;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.Widget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Questa classe contiene i metodi di utilit&agrave; per la gestione di
 * alcuni aspetti del layout.
 *
 * @author Davide Martinotti
 */
public class GenUtilsLayout {

	/**
	 * Restituisce tutti i sottopannelli di un formPanel di primo livello che sono posizionati
	 * nella posizione specificata (per UDLRC layout)
	 *  
	 * @param firstLevPanel
	 * @param layout
	 * @return
	 * @author [DM]
	 */
	public static List<Panel> getSubPanelsByLayout(FormPanel firstLevPanel, UDLRCSpecConstants quadrante) {
		List<Panel> result = new ArrayList<Panel>();
		
		Iterator<Panel> itSp = firstLevPanel.getSubpanels().iterator();
		while ( itSp.hasNext() ) {
			Panel currPan = itSp.next();
			UDLRCWidgetLayoutSpec curLay = (UDLRCWidgetLayoutSpec)currPan.getLayoutSpec();
			if ( curLay != null && curLay.getValue() == quadrante) {
				result.add(currPan);
			}
		}
		
		return result;
	}


	/**
	 * Restituisce il sottopannello di un FormPanel di primo livello situato nella posizione indicata.
	 * Vengono fatte, per semplificare la generazione, le seguenti assunzioni:
	 * - il layout UDLRC viene applicato solo al primo livello (check)
	 * - è ammesso un solo sottopannello per ciascuno dei cinque quadranti (check)
	 * - non sono ammessi direttamente widget come figli di un pannello di primo livello con layout UDLRC
	 * 
	 * @param firstLevPanel
	 * @param quadrante
	 * @return
	 * @author [DM]
	 */
	public static Panel getSubPanelByLayout(FormPanel firstLevPanel, UDLRCSpecConstants quadrante) {
		Panel res = null;
		if ( getSubPanelsByLayout(firstLevPanel, quadrante).size() > 0 ) {
			res = getSubPanelsByLayout(firstLevPanel, quadrante).get(0);
		}
		return res;
	}


	/**
	 * Ho un FormPanel di primo livello con layout UDLRC: quante colonne imposto sull'HTML?
	 * - [U][D] L R C -> layout 3 colonne
	 * - [U][D] L C   -> layout 2 colonne
	 * - [U][D] L R   -> combinazione illegale (check)
	 * - [U][D] C     -> layout 1 colonna
	 * 
	 * @param firstLevPanel
	 * @param layout
	 * @return
	 * @author [DM]
	 */
	public static int getColumnsLayout(FormPanel firstLevPanel, GUIModel model) {
		
		PanelLayout currPanLay = firstLevPanel.getLayout();
		int columns = 1;
		
		if ( currPanLay instanceof VerticalFlowPanelLayout ) {
			columns = 1;
		} else if ( currPanLay instanceof UDLRCPanelLayout ) {
			if ( model.getPortale() == PortalNames.SISTEMA_PIEMONTE ) {
				columns = getUDLRCColumnsLayoutSisp(firstLevPanel);
			} else if ( model.getPortale() == PortalNames.INTRANET_RUPARPIEMONTE ) {
				columns = getUDLRCColumnsLayoutRupar(firstLevPanel);
			}			
		} else if ( currPanLay instanceof HorizontalFlowPanelLayout ) {
			// ??? come lo gestisco
			columns = 1;
		}

		return columns;
	}
	
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
	
	/**
	 * 
	 * @param firstLevPanel
	 * @return
	 */
	private static int getUDLRCColumnsLayoutSisp(FormPanel firstLevPanel) {
		int columns = 1;

		int left = getSubPanelsByLayout(firstLevPanel, UDLRCSpecConstants.LEFT).size();
		int right = getSubPanelsByLayout(firstLevPanel, UDLRCSpecConstants.RIGHT).size();
		
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
	

	/**
	 * nota: moltiplico per due perch&egrave; il custom tag <code>&lt;customtag:panelGrid&gt;</code> 
	 *       ragiona in termini di colonne reali, quindi vale l'equazione:
	 *           1 widget = label + widget = 2 colonne
	 * @param p
	 * @return
	 * @author [DM]
	 */
	public static String getGridPanelColumnsNumber(FormPanel p) {
		int columns = 0;
		
		if ( p.getLayout() instanceof VerticalFlowPanelLayout ) {
			columns = 2;
		} else if ( p.getLayout() instanceof GridPanelLayout ) {
			columns = ((GridPanelLayout)p.getLayout()).getColumns() * 2;
		} else if ( p.getLayout() instanceof HorizontalFlowPanelLayout ) {
			columns = p.getWidgets().size() * 2;
		}
		
		return Integer.toString(columns);
	}


	/**
	 * Restituisce una lista di widget nell'ordine corretto di posizionamento.
	 * 
	 * @param p
	 * @return
	 * @author [DM]
	 */
	public static ArrayList<Widget> getWidgetsByOrder(FormPanel p) {
		ArrayList<Widget> res = new ArrayList<Widget>();
		
		if ( p.getLayout() instanceof VerticalFlowPanelLayout ) {
			res.addAll(p.getWidgets());
		} else if ( p.getLayout() instanceof HorizontalFlowPanelLayout ) {
			res.addAll(p.getWidgets());
		} else if ( p.getLayout() instanceof GridPanelLayout ) {
			int cols  = ((GridPanelLayout)p.getLayout()).getColumns();
			int rows  = ((GridPanelLayout)p.getLayout()).getRows();
			Integer hspan = 0;

			// ciclo sulle righe
			for ( int r=1; r <= rows; r++ ) {
				// ciclo sulle colonne
				for ( int c=1; c <= cols; c++ ) {
					Widget w = getWidgetByRowColumn(p, r, c, hspan);
					if ( w != null ) {
						res.add(w);
						hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();
					}
				}
			}
		}
		
		return res;
	}


	/**
	 * Restituisce il widget che, in un GridLayout, si trova nella posizione specificata
	 * (riga - colonna), e gestisce i casi particolari di colspan e widget dimenticato.
	 * 
	 * @param p
	 * @param row
	 * @param col
	 * @return
	 * @author [DM]
	 */
	public static Widget getWidgetByRowColumn(FormPanel p, int row, int col, Integer hspan) {
		Widget res = null;
		Iterator<Widget> it = p.getWidgets().iterator();
		while ( it.hasNext() ) {
			Widget tmp = it.next();
			int r = ((GridWidgetLayoutSpec)tmp.getLayoutSpec()).getRow();
			int c = ((GridWidgetLayoutSpec)tmp.getLayoutSpec()).getColumn();
			//int s = ((GridWidgetLayoutSpec)tmp.getLayoutSpec()).getHspan();
			if ( r == row && c == col ) {
				res = tmp;
				break;
			}
		}
		
		// widget non trovato:
		if ( res == null ) {
			if ( hspan > 0 ) {
				// non c'è perchè non ci deve essere causa colspan di una cella precedente:
				// tutto bene, ritorno null e lo gestisco sopra
				
				//System.out.println(".....> [getWidgetByRowColumn] manca posizione {" + row + "}{" + col + "} : " + "DECREMENTO hspan '" + hspan + "' -> '" + (hspan-1) + "'");
				hspan = hspan - 1;
			} else {
				// non c'è perchè ci dovrebbe essere ma è stato dimenticato:
				// aggiungo un PlainText vuoto
				res = GuigenFactory.eINSTANCE.createPlainText();
				res.setLabel("");
				res.setName(p.getName() + "_" + row + "_" + col);
				GridWidgetLayoutSpec wls = GuigenFactory.eINSTANCE.createGridWidgetLayoutSpec();
				wls.setColumn(col);
				wls.setRow(row);
				wls.setHspan(0);
				res.setLayoutSpec(wls);
				//System.out.println("'''''> [getWidgetByRowColumn] manca posizione {" + row + "}{" + col + "} : " + "AGGIUNGO PlainText '" + res + "'");
			}
		}
		
		return res;
	}


	/**
	 * 
	 * @param model
	 * @param cp
	 * @param fp
	 * @param w
	 * @param isFirst
	 * @param isLast
	 * @param isLabel
	 * @return
	 * @author [DM]
	 */
	public static String getCustomtagColumnPosition(FormPanel fp, Widget w, Boolean isFirst, Boolean isLast, Boolean isLabel) {
		String P_FIRST = "position=\"first\"";
		String P_LAST  = "position=\"last\"";
		
		String res = "";
		
		if ( fp.getLayout() instanceof VerticalFlowPanelLayout ) {
			// niente da impostare, per il momento va bene blank
		} else if ( fp.getLayout() instanceof HorizontalFlowPanelLayout ) {
			if ( isFirst ) {
				res = P_FIRST;
			} else if ( isLast ) {
				res = P_LAST;
			}
		} else if ( fp.getLayout() instanceof GridPanelLayout ) {
			int wcols = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getColumn();   // colonna del widget
			int pcols = ((GridPanelLayout)fp.getLayout()).getColumns();          // colonne totali nel pannello
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();    // span del widget   

			if ( hspan > 1 ) {
				if ( isLabel ) {
					// la label non puo' mai avere last, ma solo first
					if ( wcols == 1 ) {
						res = P_FIRST;
					}
				} else {
					// una cella con un widget non puo' mai avere first, ma solo last
					int landingCol = (wcols - 1) + hspan;
					if ( landingCol == pcols ) {
						res = P_LAST;
					}
				}
				
			} else {
				if ( wcols == 1 ) {
					res = P_FIRST;
				} else if ( wcols == pcols ) {
					res = P_LAST;
				}
			}
		}
		
		return res;
	}


	/**
	 * L'attributo hspan di un widget deve essere gestito solo nel caso di GridPanelLayout.
	 *  
	 * @param fp
	 * @param w
	 * @return
	 * @author [DM]
	 */
	public static boolean needHandleCustomtagHeaderHspan(FormPanel fp, Widget w) {
		boolean res = false;
		if ( fp.getLayout() instanceof GridPanelLayout ) {
			if ( ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan() > 1 ) {
				res = true;
			}
		}
		return res;
	}


	/**
	 * Non metto l'else della Visibility nel caso di VerticalFlowPanelLayout
	 * o nel caso di GridPanelLayout con span della cella = numero totale colonne
	 * (&egrave; come se eliminassi un'intera riga...)
	 * 
	 * @param fp
	 * @param w
	 * @return
	 */
	public static boolean needHandleCustomtagCloseHspan(FormPanel fp, Widget w) {
		boolean res = true;
		if ( fp.getLayout() instanceof VerticalFlowPanelLayout ) {
			res = false;
		} else if ( fp.getLayout() instanceof GridPanelLayout ) {
			int pcols = ((GridPanelLayout)fp.getLayout()).getColumns();          // colonne totali nel pannello
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();    // span del widget 
			if ( hspan == pcols ) {
				res = false;
			}
		}
		return res;
	}


	/**
	 * 
	 * @param fp
	 * @param w
	 * @return
	 * @author [DM]
	 */
	public static int getCustomtagHeaderColspan(Widget w) {
		int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();
		
		return ((hspan * 2) - 1);
	}

	/**
	 * 
	 * @param fp
	 * @param w
	 * @return
	 * @author [DM]
	 */
	public static int getCustomtagHeaderColspan(PlainText w) {
		int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();
		int res = ((hspan * 2) - 1);
		if ( w.getLabel() == null ) {
			res = res + 1;
		}
		return res;
	}	
	

	/**
	 * 
	 * @param fp
	 * @param w
	 * @return
	 * @author [DM]
	 */
	public static String getCustomtagCloseColspan(FormPanel fp, Widget w) {
		String res = "";
		
		if ( fp.getLayout() instanceof VerticalFlowPanelLayout ) {
			// NON CI DOVREI PASSARE... comunque lasciamo
		} else if ( fp.getLayout() instanceof HorizontalFlowPanelLayout ) {
			// niente da impostare, va bene blank
		} else if ( fp.getLayout() instanceof GridPanelLayout ) {
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();    // span del widget
			int s = 2;
			if ( hspan > 1 ) {
				s = hspan * 2;
			}
			res = "colSpan=\"" + s +"\"";
		}
		
		return res;
	}

	
	/**
	 * 
	 * @param model
	 * @param b
	 * @return
	 * @author [DM]
	 */
	public static String getButtonDivStyleByLayout(GUIModel model, Button b) {
		String res = "";
		if ( model.getPortale() == PortalNames.SISTEMA_PIEMONTE ) {
			res = getButtonDivStyleSistemaPiemonte(model, b);
		} else if ( model.getPortale() == PortalNames.INTRANET_RUPARPIEMONTE ) {
			// TODO: implementare quando necessario
		} else if ( model.getPortale() == PortalNames.NEUTRAL ) {
			// TODO: implementare quando necessario
		}
		return res;
	}	
	
	public static String getButtonDivStyleSistemaPiemonte(GUIModel model, Button b) {
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
	 * 
	 * @param model
	 * @param b
	 * @return
	 * @author [DM]
	 */
	public static String getButtonStyleByLayout(GUIModel model, Button b) {
		String res = "";
		if ( model.getPortale() == PortalNames.SISTEMA_PIEMONTE ) {
			res = getButtonStyleSistemaPiemonte(model, b);
		} else if ( model.getPortale() == PortalNames.INTRANET_RUPARPIEMONTE ) {
			res = getButtonStyleRupar(model, b);
		} else if ( model.getPortale() == PortalNames.NEUTRAL ) {
			// TODO: implementare quando necessario
		}
		return res;
	}

	/**
	 * Non mi piace molto questa implementazione (troppo empirica), ma...
	 * 
	 * @param model
	 * @param b
	 * @return
	 * @author [DM]
	 */
	public static String getButtonStyleSistemaPiemonte(GUIModel model, Button b) {
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
		if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.NAVIGATION ) {
			btnStyleT = "nav";
		} else if ( ((CommandPanel)b.eContainer()).getCmdStyle() == CommandStyles.FUNCTIONAL ) {
			btnStyleT = "funz";
		}
		
		return "cssClass=\"" + btnStyleT + btnStyleL + "\"";
	}


	/**
	 * Non mi piace molto questa implementazione (troppo empirica), ma...
	 * 
	 * @param model
	 * @param b
	 * @return
	 * @author [DM]
	 */	
	public static String getButtonStyleRupar(GUIModel model, Button b) {
		String css = "";

		if ( b.getLabel() != null ) {
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
		}
		
		return "cssClass=\"inputPulsante" + css + "\" onmouseover=\"javascript:overOutHandler(this, 'inputPulsanteHover" + css + "');\" onmouseout=\"javascript:overOutHandler(this, 'inputPulsante" + css + "');\"";
	}

	/**
	 * 
	 * @param model
	 * @param t
	 * @return
	 * @author [DM]
	 */
	public static String getTextFieldStyleByLayout(GUIModel model, TextField t) {
		String res = "";
		if ( model.getPortale() == PortalNames.SISTEMA_PIEMONTE ) {
			res = getTextFieldStyleSistemaPiemonte(model, t);
		} else if ( model.getPortale() == PortalNames.INTRANET_RUPARPIEMONTE ) {
			// TODO: implementare quando necessario
		} else if ( model.getPortale() == PortalNames.NEUTRAL ) {
			// TODO: implementare quando necessario
		}
		return res;
	}	
	
	/**
	 * 
	 * @param model
	 * @param t
	 * @return
	 * @author [DM] STDMDD-188
	 */
	public static String getTextFieldStyleSistemaPiemonte(GUIModel model, TextField t) {
		String res = "";
		int len = t.getFieldLength();
		if ( len > 0 ) {
			String css = "";
			if ( len <= 14 ) {
				// "small" se Textfield.size in [1..14]
				css = "small";
			} else if ( len >= 15 && len <= 29  ) {
				// "med" se Textfield.size in [15..29]
				css = "med";
			} else if ( len >= 30 ) {
				// "maxi" se Textfield.size >= 30 
				css = "maxi";
			}
			res = "cssClass=\"" + css + "\"";
		}
		
		return res;		
	}

	

	/**
	 * Verifica se un ContentPanel contiene o meno delle tabelle 
	 * (problema della localizzazione della displaytag)
	 * @param cp Il ContentPanel da verificare
	 * @return  true se il ContentPanel contiene almeno una tabella, false altrimenti.
	 * @author [DM]
	 */
	public static boolean hasTable(ContentPanel cp) {
		return GenUtils.findAllTablesInContentPanel(cp).size() > 0;
	}
	
	/**
	 * Verifica se un Panel contiene o meno delle tabelle 
	 * (problema della localizzazione della displaytag)
	 * @param p Il Panel da verificare
	 * @return  true se il ContentPanel contiene almeno una tabella, false altrimenti.
	 * @author [DM]
	 */
	public static boolean hasTable(Panel p) {
		boolean res = false;
		
		for ( Widget w : GenUtils.findAllWidgetsInPanel(p) ) {
			if ( w instanceof Table ) {
				res = true;
				break;
			}
		}
		
		return res;
	}	


	/**
	 * Verifica se un ContentPanel contiene o meno dei widget di tipo TreeView.
	 * @param cp Il ContentPanel da verificare
	 * @return  true se il ContentPanel contiene almeno un TreeView, false altrimenti.
	 * @author [DM]
	 */	
	public static boolean hasTree(ContentPanel cp) {
		return GenUtils.findAllTreeInContentPanel(cp).size() > 0;
	}
	
	
	/**
	 * 
	 * @param model
	 * @return
	 * @author [DM]
	 */
	public static String getComboBoxValueChangedHandlerStyle(GUIModel model) {
		String res = "";
		if ( model.getPortale() == PortalNames.SISTEMA_PIEMONTE ) {
			res = "funz70";
		} else if ( model.getPortale() == PortalNames.INTRANET_RUPARPIEMONTE ) {
			
		}
		return res;
	}
	
}
