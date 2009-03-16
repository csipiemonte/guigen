package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.List;

import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.UserDefinedWidget;
import it.csi.mddtools.guigen.Widget;


/**
 * Questa classe contiene i metodi per generare le label di Struts2.
 * <p>
 * Per una spiegazione dettagliata dell'utilizzo dell'i18n Framework
 * si rimanda alla documentazione ufficiale di Struts2 e ai manuali.
 *
 * @author Davide Martinotti
 */
public class GenUtilsI18n {

	
	/**
	 * 
	 * @param cp
	 * @return
	 */
	public static List<String> getContentPanelLabels(ContentPanel cp) {
		List<String> res = new ArrayList<String>();

		// pannello di primo livello
		Panel p = cp.getPanels();
		String lbl = getPanelLabel(p, cp);
		if ( lbl != null ) {
			res.add(lbl);
		}
		
		// sottopannelli di secondo livello (e oltre)
		res.addAll(getSubPanelsLabels(p, cp));

		return res;
	}
	
	
	/**
	 * 
	 * @param cp
	 * @return
	 */
	public static List<String> getWidgetsLabels(ContentPanel cp) {
		List<String> res = new ArrayList<String>();
		String lbl = null;
		
		ArrayList<Widget> widgets = GenUtils.findAllWidgetsInContentPanel(cp);

		for ( Widget widget : widgets ) {
			if ( widgetHasLabel(widget) ) {
				lbl = getWidgetLabel(widget, cp);
				if ( lbl != null ) {
					res.add(lbl);
				}
			}
		}

		return res;
	}	

	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	//
	
	/**
	 * 
	 * @param p
	 * @param cp
	 * @return
	 */
	private static List<String> getSubPanelsLabels(Panel p, ContentPanel cp) {
		List<String> res = new ArrayList<String>();
		String lbl = null;

		if ( p instanceof FormPanel ) {
			List<Panel> fpl = ((FormPanel)p).getSubpanels();
			for ( Panel panel : fpl ) {
				lbl = getPanelLabel(panel, cp);
				if ( lbl != null) {
					res.add(lbl);
				}
				res.addAll(getSubPanelsLabels(panel, cp));
			}

		} 
		else if ( p instanceof MultiPanel ) {
			List<Panel> mpl = ((MultiPanel)p).getPanels();
			for (Panel panel : mpl) {
				lbl = getPanelLabel(panel, cp);
				if ( lbl != null) {
					res.add(lbl);
				}
				res.addAll(getSubPanelsLabels(panel, cp));				
			}
		} 
		else if ( p instanceof TabSetPanel ) {
			List<Panel> tpl = ((TabSetPanel)p).getPanels();
			for ( Panel tab : tpl ) {
				lbl = getPanelLabel(tab, cp);
				if ( lbl != null) {
					res.add(lbl);
				}
				res.addAll(getSubPanelsLabels(tab, cp));				
			}
		}
		else {
			lbl = getPanelLabel(p, cp);
			if ( lbl != null) {
				res.add(lbl);
			}
		}

		return res;
	}
	
	
	/**
	 * 
	 * @param p
	 * @param cp
	 * @return
	 */
	private static String getPanelLabel(Panel p, ContentPanel cp) {
		String res = null;
		if ( !GenUtils.isNullOrEmpty(p.getLabel()) ) {
			res = cp.getName() + "." + p.getName() + ".label=" + p.getLabel();
		}
		return res;
	}
	
	
	/**
	 * 
	 * @param w
	 * @param cp
	 * @return
	 */
	private static String getWidgetLabel(Widget w, ContentPanel cp) {
		String res = null;
		if ( !GenUtils.isNullOrEmpty(w.getLabel()) ) {
			res = cp.getName() + "." + w.getName() + ".label=" + w.getLabel();
		}
		return res;		
	}
	
	
	/**
	 * 
	 * @param w
	 * @return
	 */
	private static boolean widgetHasLabel(Widget w) {
		boolean res = true;
		
		if ( w instanceof HiddenValue || w instanceof Table || w instanceof MenuView ||
				w instanceof TreeView || w instanceof UserDefinedWidget ) {
			res = false;
		}
		
		return res;
	}
	
}
