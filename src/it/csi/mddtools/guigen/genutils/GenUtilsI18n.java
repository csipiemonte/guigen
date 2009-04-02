package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.List;

import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.Menu;
import it.csi.mddtools.guigen.MenuItem;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.Menubar;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PlainText;
import it.csi.mddtools.guigen.RadioButton;
import it.csi.mddtools.guigen.RadioButtons;
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
	public static List<String> getMenuBarLabels(Menubar mb) {
		List<String> res = new ArrayList<String>();
		
		if ( mb != null ) {
			for ( Menu menu : mb.getTopLevelMenu() ) {
				res.addAll(getSubMenuLabels(menu));
			}
		}
		
		return res;
	}	
	
	
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
			if ( widget instanceof Table ) {
				// aggiungo le label delle colonne della tabella
				res.addAll(getTableColumnsLabels((Table)widget, cp));
			}
			else if ( widget instanceof RadioButtons ) {
				res.addAll(getRadioButtonsLabels((RadioButtons)widget, cp));
			}
			else if ( widget instanceof PlainText ) {
				res.addAll(getPlainTextLabels((PlainText)widget, cp));
			}
			else if ( widgetHasLabel(widget) ) {
				lbl = getWidgetLabel(widget, cp);
				if ( lbl != null ) {
					res.add(lbl);
				}
			}
		}

		return res;
	}	

	
	/**
	 * 
	 * @param w
	 * @return
	 */
	public static String getText(Widget w) {
		String res = "";
		if ( !GenUtils.isNullOrEmpty(w.getLabel()) ) {
			ContentPanel cp = GenUtils.findParentContentPanel(w);
			if ( cp != null ) {
				res = "%{getText('" + cp.getName() + "." + w.getName() + ".label')}";
			}
		}
		return res;
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVAT METHODS
	
	/**
	 * 
	 * @param menu
	 * @return
	 */
	private static List<String> getSubMenuLabels(Menu menu) {
		List<String> res = new ArrayList<String>();
		String lbl = null;
		
		// label del menu
		lbl = getMenuLabel(menu);
		if ( lbl != null ) {
			res.add(lbl);
		}
		
		// label degli item del menu
		for ( MenuItem item : menu.getItem() ) {
			lbl = getMenuItemLabel(item);
			if ( lbl != null ) {
				res.add(lbl);
			}
		}
		
		// label dei sottomenu
		for ( Menu subMenu : menu.getSubmenu() ) {
			res.addAll(getSubMenuLabels(subMenu));
		}
		
		return res;
	}


	/**
	 * 
	 * @param menu
	 * @param prefix
	 * @return
	 */
	private static String getMenuLabel(Menu menu) {
		String res = null;
		if ( !GenUtils.isNullOrEmpty(menu.getLabel()) ) {
			res = menu.getName() + ".label=" + menu.getLabel();
		}
		return res;
	}
	
	
	/**
	 * 
	 * @param item
	 * @param prefix
	 * @return
	 */
	private static String getMenuItemLabel(MenuItem item) {
		String res = null;
		if ( !GenUtils.isNullOrEmpty(item.getLabel()) ) {
			res = item.getName() + ".label=" + item.getLabel();
		}
		return res;
	}	
	

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

	
	/**
	 * 
	 * @param t
	 * @return
	 */
	private static List<String> getTableColumnsLabels(Table t, ContentPanel cp) {
		List<String> res = new ArrayList<String>();
		
		for ( Column col : t.getColumnModel().getColumns() ) {
			if ( !GenUtils.isNullOrEmpty(col.getLabel()) ) {
				res.add(cp.getName() + "." + t.getName() + "." + col.getSelector() + ".label=" + col.getLabel().trim());
			}
		}
		
		return res;
	}
	
	
	/**
	 * 
	 * @param rb
	 * @param cp
	 * @return
	 */
	private static List<String> getRadioButtonsLabels(RadioButtons rb, ContentPanel cp) {
		List<String> res = new ArrayList<String>();
		String lbl = null;
		
		// label del gruppo
		lbl = getWidgetLabel(rb, cp);
		if ( lbl != null ) {
			res.add(lbl);
		}
		
		// label dei singoli radio
		for ( RadioButton radio : rb.getRadio() ) {
			if ( !GenUtils.isNullOrEmpty(radio.getLabel()) ) {
				res.add(cp.getName() + "." + rb.getName() + "." + radio.getName() + ".label=" + radio.getLabel().trim());
			}
		}
		
		return res;
	}
	
	
	/**
	 * 
	 * @param t
	 * @param cp
	 * @return
	 */
	private static List<String> getPlainTextLabels(PlainText t, ContentPanel cp) {
		List<String> res = new ArrayList<String>();
		String lbl = null;
		
		// label del gruppo
		lbl = getWidgetLabel(t, cp);
		if ( lbl != null ) {
			res.add(lbl);
		}		
		
		// static text
		if ( !GenUtils.isNullOrEmpty(t.getStaticText()) ) {
			res.add(cp.getName() + "." + t.getName() + ".statictext.label=" + t.getStaticText().trim());
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
			res = cp.getName() + "." + w.getName() + ".label=" + w.getLabel().trim();
		}
		return res;		
	}
	
}
