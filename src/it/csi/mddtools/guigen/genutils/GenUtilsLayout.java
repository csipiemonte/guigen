package it.csi.mddtools.guigen.genutils;

import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.ConfirmButton;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.FileUpload;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GridPanelLayout;
import it.csi.mddtools.guigen.GridWidgetLayoutSpec;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
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

	////////////////////////////////////////////////////////////////////////////////////////////////////
	// Metodi generici validi per tutti i layout.
	
	/**
	 * Restituisce tutti i sottopannelli di un formPanel che sono posizionati
	 * nella posizione specificata (per UDLRC layout)
	 *  
	 * @param panel
	 * @param quadrante
	 * @return
	 * @author [DM]
	 */
	public static List<Panel> getSubPanelsByLayout(FormPanel panel, UDLRCSpecConstants quadrante) {
		List<Panel> result = new ArrayList<Panel>();
		
		for ( Panel currPan : panel.getSubpanels() ) {
			UDLRCWidgetLayoutSpec curLay = (UDLRCWidgetLayoutSpec)currPan.getLayoutSpec();
			if ( curLay != null && curLay.getValue() == quadrante ) {
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
	 * nota: moltiplico per due perch&egrave; il custom tag <code>&lt;customtag:panelGrid&gt;</code> 
	 *       ragiona in termini di colonne reali, quindi vale l'equazione:
	 *           1 widget = label + widget = 2 colonne
	 * @param p
	 * @return
	 * @author [DM]
	 */
	public static String getGridPanelColumnsNumber(WidgetsPanel p) {
		int columns = 0;
		
		if ( p.getLayout() instanceof VerticalFlowPanelLayout ) {
			columns = 2;
		} 
		else if ( p.getLayout() instanceof GridPanelLayout ) {
			columns = ((GridPanelLayout)p.getLayout()).getColumns() * 2;
		} 
		else if ( p.getLayout() instanceof HorizontalFlowPanelLayout ) {
			columns = p.getWidgets().size() * 2;
		}
		
		return Integer.toString(columns);
	}


	/**
	 * Restituisce, se necessario, la percentuale delle colonne da impostare sulla PanelGrid.
	 * 
	 * @param p
	 * @return
	 * @author [DM]
	 */
	public static String getPanelGridPercentCols(WidgetsPanel p) {
		String res = "";
		if ( !GenUtils.isNullOrEmpty(p.getLayout().getColumnSizes()) ) {
			if ( p.getLayout() instanceof VerticalFlowPanelLayout || p.getLayout() instanceof GridPanelLayout ) {
				res = "percentCols=\"" + p.getLayout().getColumnSizes() + "\"";
			}
		}
		return res;
	}


	/**
	 * Restituisce una lista di widget nell'ordine corretto di posizionamento.
	 * 
	 * @param p
	 * @return
	 * @author [DM]
	 */
	public static ArrayList<Widget> getWidgetsByOrder(WidgetsPanel p) {
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
	 * @param hspan
	 * @return
	 * @author [DM]
	 */
	public static Widget getWidgetByRowColumn(WidgetsPanel p, int row, int col, Integer hspan) {
		Widget res = null;
		Iterator<Widget> it = p.getWidgets().iterator();
		while ( it.hasNext() ) {
			Widget tmp = it.next();
			int r = ((GridWidgetLayoutSpec)tmp.getLayoutSpec()).getRow();
			int c = ((GridWidgetLayoutSpec)tmp.getLayoutSpec()).getColumn();
			if ( r == row && c == col ) {
				res = tmp;
				break;
			}
		}
		
		// widget non trovato:
		if ( res == null ) {
			if ( hspan > 0 ) {
				// non c'è perchè non ci deve essere causa colspan di una cella precedente:
				// tutto bene, ritorno null e lo gestisco nel metodo chiamante
				hspan = hspan - 1;
			} else {
				// non c'è perchè ci dovrebbe essere ma è stato dimenticato:
				// aggiungo un PlainText vuoto
				res = GuigenFactory.eINSTANCE.createPlainText();
				res.setLabel(null);
				res.setName(p.getName() + "_" + row + "_" + col);
				GridWidgetLayoutSpec wls = GuigenFactory.eINSTANCE.createGridWidgetLayoutSpec();
				wls.setColumn(col);
				wls.setRow(row);
				wls.setHspan(0);
				res.setLayoutSpec(wls);
			}
		}
		
		return res;
	}


	/**
	 * Restituisce la posizione (first, last oppure niente) del widget da impostare sulla componente <code>&lt;customtag:column&gt;</code>.
	 * 
	 * @param wp Il WidgetsPanel che contiene il Widget da posizionare.
	 * @param w  Il Widget da posizionare.
	 * @param isFirst
	 * @param isLast
	 * @return
	 * @author [DM]
	 */
	public static String getCustomtagColumnPosition(WidgetsPanel wp, Widget w, Boolean isFirst, Boolean isLast) {
		String P_FIRST = "position=\"first\"";
		String P_LAST  = "position=\"last\"";
		
		String res = "";
		
		if ( wp.getLayout() instanceof VerticalFlowPanelLayout ) {
			// niente da impostare, per il momento va bene blank
		} 
		else if ( wp.getLayout() instanceof HorizontalFlowPanelLayout ) {
			if ( isFirst ) {
				res = P_FIRST;
			} else if ( isLast ) {
				res = P_LAST;
			}
		} 
		else if ( wp.getLayout() instanceof GridPanelLayout ) {
			int wcols = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getColumn();   // colonna del widget
			int pcols = ((GridPanelLayout)wp.getLayout()).getColumns();          // colonne totali nel pannello
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();    // span del widget   
			
			if ( wcols == 1 ) {
				res = P_FIRST;
			} else {
				int landingCol = wcols;
				if ( hspan > 1 ) {
					landingCol = (wcols - 1) + hspan;
				}
				
				if ( landingCol == pcols ) {
					res = P_LAST;
				}				
			}			
		}
		
		return res;
	}


	/**
	 * L'attributo hspan di un widget deve essere gestito solo nel caso di GridPanelLayout.
	 *  
	 * @param wp Il WidgetsPanel che contiene il Widget da posizionare.
	 * @param w  Il Widget da posizionare.
	 * @return
	 * @author [DM]
	 */
	public static boolean needHandleCustomtagHeaderHspan(WidgetsPanel wp, Widget w) {
		boolean res = false;
		if ( wp.getLayout() instanceof GridPanelLayout ) {
			if ( ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan() > 1 ) {
				res = true;
			}
		}
		return res;
	}


	/**
	 * Gestisce la clausola <code>&lt;s:else&gt;</code> della visibility di un widget.
	 * 
	 * Non metto la clausola <code>&lt;s:else&gt;</code> della Visibility di un widget
	 * nel caso di VerticalFlowPanelLayout o nel caso di GridPanelLayout con span
	 * della cella = numero totale colonne (&egrave; come se eliminassi un'intera riga).
	 * 
	 * @param wp Il WidgetsPanel che contiene il Widget da posizionare.
	 * @param w  Il Widget da posizionare.
	 * @return
	 */
	public static boolean needHandleCustomtagCloseHspan(WidgetsPanel wp, Widget w) {
		boolean res = true;
		if ( wp.getLayout() instanceof VerticalFlowPanelLayout ) {
			res = false;
		} else if ( wp.getLayout() instanceof GridPanelLayout ) {
			int pcols = ((GridPanelLayout)wp.getLayout()).getColumns();          // colonne totali nel pannello
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();    // span del widget 
			if ( hspan == pcols ) {
				res = false;
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

		if ( needHandleCustomtagHeaderHspan(wp, w) ) {
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();
			colspan = ((hspan * 2) - 1);
		}
		
		// Table e UserDefinedWidget e i Button (Button, ConfirmButton, ResetButton) non hanno label, quindi devo aggiungere 1 al colspan
		if ( w instanceof Table || w instanceof UserDefinedWidget || w instanceof Button || w instanceof ConfirmButton || w instanceof ResetButton ) {
			colspan = colspan + 1;
		}
		
		if ( colspan > 1 ) {
			res = "colSpan=\"" + colspan + "\"";
		}
		return res;
	}


	/**
	 * Imposta l'attributo <code>colSpan</code> della Customtag component (nel caso sia necessario)
	 * per un Widget di tipo PlainText.
	 * 
	 * @param wp Il WidgetsPanel che contiene il PlainText da posizionare.
	 * @param w  Il PlainText da posizionare.
	 * @return L'attributo <code>colSpan</code> correttamente settato (nel caso sia necessario).
	 * @author [DM]
	 */
	public static String getCustomtagHeaderColspan(WidgetsPanel wp, PlainText w) {
		String res = "";
		int colspan = 1;

		if ( needHandleCustomtagHeaderHspan(wp, w) ) {
			int hspan = ((GridWidgetLayoutSpec)w.getLayoutSpec()).getHspan();
			colspan = ((hspan * 2) - 1);
		}
		
		if ( w.getLabel() == null ) {
			colspan = colspan + 1; 
		}		
		
		if ( colspan > 1 ) {
			res = "colSpan=\"" + colspan + "\"";
		}
		return res;
	}	
	

	/**
	 * Gestisce l'attributo <code>colSpan</code> per la clausola <code>&lt;s:else&gt;</code> della visibility di un widget.
	 * 
	 * @param wp Il WidgetsPanel che contiene il Widget da posizionare.
	 * @param w  Il Widget da posizionare.
	 * @return L'attributo <code>colSpan</code> correttamente settato (nel caso sia necessario).
	 * @author [DM]
	 */
	public static String getCustomtagCloseColspan(WidgetsPanel wp, Widget w) {
		String res = "";
		
		if ( wp.getLayout() instanceof VerticalFlowPanelLayout ) {
			// NON CI DOVREI PASSARE... comunque lasciamo
		} 
		else if ( wp.getLayout() instanceof HorizontalFlowPanelLayout ) {
			// niente da impostare, va bene blank
		} 
		else if ( wp.getLayout() instanceof GridPanelLayout ) {
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
	 * Verifica se un ContentPanel contiene o meno delle tabelle 
	 * (problema della localizzazione della Displaytag)
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



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// Metodi generici per funzionalità specifiche per layout: 
	// verranno ridefinite (ove necessario) mediante AOP
	
	/**
	 * Ho un FormPanel di primo livello con layout UDLRC: quante colonne imposto sull'HTML?
	 * - [U][D] L R C -> layout 3 colonne
	 * - [U][D] L C   -> layout 2 colonne
	 * - [U][D] L R   -> combinazione illegale (check)
	 * - [U][D] C     -> layout 1 colonna
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
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
		
		if ( currPanLay instanceof VerticalFlowPanelLayout ) {
			columns = 1;
		} else if ( currPanLay instanceof UDLRCPanelLayout ) {
			columns = 1;
		} else if ( currPanLay instanceof HorizontalFlowPanelLayout ) {
			// ??? come lo gestisco
			columns = 1;
		}

		return columns;
	}


	/**
	 * Restituisce lo stile del <div> per i Button
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param b Il Button da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getButtonDivStyleByLayout(GUIModel model, Button b) {
		String res = "";
		// TODO: implementare diversamente (se necessario)
		return res;
	}
	
	/**
	 * Restituisce lo stile per i Button.
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * - RuparPiemonte
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param b Il Button da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getButtonStyleByLayout(GUIModel model, Button b) {
		String res = "";
		// TODO: implementare diversamente (se necessario)
		return res;
	}	
	
	
	/**
	 * Restituisce lo stile per i TextField.
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param t Il widget di tipo TextField da gestire
	 * @return
	 * @author [DM] STDMDD-188
	 */
	public static String getTextFieldStyleByLayout(GUIModel model, TextField t) {
		String res = "";
		// TODO: implementare diversamente (se necessario)
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
		// TODO: implementare diversamente (se necessario)
		return res;
	}
	

	/**
	 * Restituisce lo stile di un MsgBoxPanel.
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param mbp
	 * @return
	 * @author [DM]
	 */
	public static String getMsgBoxPanelStyleByPortal(GUIModel model, MsgBoxPanel mbp) {
		String res = "";
		// TODO: implementare diversamente (se necessario)
		return res;
	}	
	
	
	/**
	 * Restituisce lo stile di una colonna sulla base del tipo bindato alla colonna stessa.
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
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
		
		if ( f != null) {
			// TODO: implementare diversamente (se necessario)
		}

		return res;
	}	
	
	/**
	 * Restituisce la classe per un CheckBox
	 * NOTA: Anche se il codice è semplice (e potrebbe stare in .ext) DEVE rimanere qui
	 *       in Java poichè questo metodo è chiamato anche da GenUtils.
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * - RuparPiemonte
	 * - Neutral
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */
	public static String getCheckboxPortalStyle(GUIModel model) {
		String res = "";
		// TODO: implementare diversamente (se necessario)
		return res;
	}

	
	/**
	 * 
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 * 
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @param w Il widget di tipo PlainText da gestire
	 * @return
	 * @author [DM]
	 */
	public static String getCustomComponentColumnStyleByPortal(GUIModel model, PlainText w) {
		String res = "";
		// TODO: implementare diversamente (se necessario)
		return res;
	}
	
	
	/**
	 * Restituisce la classe per un TextField in una Table.
	 * NOTA: Anche se il codice è semplice (e potrebbe stare in .ext) DEVE rimanere qui
	 *       in Java poichè questo metodo è chiamato anche da GenUtils.
	 *  
	 * Viene ridefinito tramite AOP per i seguenti portali:
	 * - SistemaPiemonte
	 *
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */	
	public static String getColumnEditableTextfieldPortalStyle(GUIModel model) {
		String res = "";
		// TODO: implementare diversamente (se necessario)
		return res;
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS 
	




	////////////////////////////////////////////////////////////////////////////////////////////////////
	// MAIN

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
}
