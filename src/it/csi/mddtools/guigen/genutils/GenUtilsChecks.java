package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.Iterator;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.MenuPanel;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.Widget;


/**
 * Questa classe contiene i metodi di utilit&agrave; per i Check.
 *
 * @author Davide Martinotti
 */
public class GenUtilsChecks {

	/**
	 * Controlla che tutti i widget di un CommandPanel siano dei CommandWidget
	 * o al massimo un HiddenValue.
	 * 
	 * @param cp  Il CommandPanel da controllare.
	 * @return  true se tutti i widget sono dei CommandWidget (o HiddenValue), false altrimenti.
	 * @author [DM]
	 */
	public static boolean commandPanelCommandWidgetCheck(CommandPanel cp) {
		for (Widget w : cp.getWidgets()) {
			if ( !(w instanceof CommandWidget) && !(w instanceof HiddenValue) ) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Un CommandPanel pu&ograve; avere solo due tipi di layout: 
	 *    [a] HorizontalFlowPanelLayout, 
	 *    [b] UDLRCPanelLayout ristretto (solo LEFT ed RIGHT)
	 * 
	 * @param cp  Il CommandPanel da controllare.
	 * @return  true se il layout &egrace; corretto, false altrimenti.
	 * @author [DM]
	 */
	public static boolean commandPanelLayoutCheck(CommandPanel cp) {
		boolean res = true;
		
		if ( cp.getLayout() instanceof VerticalFlowPanelLayout ) {
			res = false;
		} else if ( cp.getLayout() instanceof UDLRCPanelLayout ) { 
			for ( Widget w : cp.getWidgets() ) {
				if ( !(w.getLayoutSpec() instanceof UDLRCWidgetLayoutSpec) ) {
					res = false;
					break;				
				}
				
				UDLRCWidgetLayoutSpec ls = (UDLRCWidgetLayoutSpec)w.getLayoutSpec();
				if ( ls.getValue() != UDLRCSpecConstants.LEFT && ls.getValue() != UDLRCSpecConstants.RIGHT ) {
					res = false;
					break;				
				}
			}
		}
	
		return res;
	}


	/**
	 * Controlla che tutti i widget di un MenuPanel siano di tipo MenuView o TreeView.
	 * 
	 * @param cp  Il CommandPanel da controllare.
	 * @return  true se tutti i widget sono dei CommandWidget, false altrimenti.
	 * @author [DM]
	 */
	public static boolean menuPanelWidgetCheck(MenuPanel mp) {
		for (Widget w : mp.getWidgets()) {
			if ( !(w instanceof MenuView) && !(w instanceof TreeView) ) {
				return false;
			}
		}
		return true;
	}

	
	/**
	 * Verifica se esistono dei DataBinding (semplici o multi) non risolvibili
	 * @param cp
	 * @return
	 */
	public static ArrayList<ApplicationData> findUnresolvedAppDataBinding(ContentPanel cp) {
		ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
		ArrayList<Widget> cpWidgets = GenUtils.findAllWidgetsInContentPanel(cp);
		Iterator<Widget> it_w = cpWidgets.iterator();
	
		while (it_w.hasNext()) {
			Widget w = (Widget) it_w.next();
		
			if (w instanceof DataWidget) {
				if (((DataWidget) w).getDatabinding() != null) {
					ApplicationData ad = ((DataWidget) w).getDatabinding().getAppData();
					if (!cp.getAppData().contains(ad)) {
						ris.add(ad);
					}
				}
			}
			if (w instanceof MultiDataWidget) {
				if (((MultiDataWidget) w).getMultiDataBinding() != null) {
					ApplicationData ad = ((MultiDataWidget) w).getMultiDataBinding().getAppData();
					if (!cp.getAppData().contains(ad)) {
						ris.add(ad);
					}
				}
			}
		}

		return ris;
	}

}
