package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.List;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.Field;
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
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.Typedefs;
import it.csi.mddtools.guigen.UserDefinedWidget;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WizardPanel;


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

				// label delle eventuali validazioni
				if ( widget instanceof DataWidget) {
					res.addAll(getDataWidgetValidationLabels((DataWidget)widget, cp));
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


	/**
	 *
	 * @param complexTypesList
	 * @return
	 */
	public static List<String> getVisitorValidatorLabels(List<ComplexType> complexTypesList) {
		List<String> res = new ArrayList<String>();

		for (ComplexType t : complexTypesList) {
			if ( GenUtilsStrutsValidation.requireValidation(t) ) {
				res.addAll(getComplexTypeLabels(t));
			}
		}

		return res;
	}

	
	/**
	 * 
	 * @param cp
	 * @return
	 */
	public static List<String> getApplicationDataLabels(ContentPanel cp) {
		List<String> res = new ArrayList<String>();
		
		for (ApplicationData ad : GenUtils.findAllActionScopedAppDataInContentPanel(cp)) {
			if ( GenUtilsStrutsValidation.requireValidation(ad) ) {
				String key = cp.getName() + "." + ad.getName() + ".visitorvalidator.label";
				res.add(key + "=" + ad.getType().getName() + ": ");
			}
		}
		
		return res;
	}
	
	
	

	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS

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
		else if ( p instanceof WizardPanel ) {
			List<Panel> wpl = ((WizardPanel)p).getPanels();
			int c = 1;
			for ( Panel step : wpl ) {
				lbl = getPanelLabel(step, cp, c);
				if ( lbl != null) {
					res.add(lbl);
				}
				res.addAll(getSubPanelsLabels(step, cp));
				c++;
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
	 * @param p
	 * @param cp
	 * @param c
	 * @return
	 */
	private static String getPanelLabel(Panel p, ContentPanel cp, int c) {
		String res = null;
		String lab = p.getLabel();
		if ( !GenUtils.isNullOrEmpty(lab) ) {
			lab = Integer.toString(c) + ". " + lab;
			res = cp.getName() + "." + p.getName() + ".label=" + lab;
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

		// label della eventuale validazione
		res.addAll(getDataWidgetValidationLabels(rb, cp));

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


	/**
	 *
	 * @param w
	 * @param cp
	 * @return
	 */
	private static List<String> getDataWidgetValidationLabels(DataWidget w, ContentPanel cp) {
		List<String> res = new ArrayList<String>();
		String keyName = cp.getName() + "." + w.getName();
		
		// required validation label
		if ( w.isRequired() ) {
			res.add(keyName + GenUtilsStrutsValidation.REQUIRED_VALIDATION_LABEL + "=Campo " + w.getLabel() + " obbligatorio");
		}

		// validation
		if ( !GenUtils.isNullOrEmpty(w.getDataTypeModifier()) ) {
			res.add(keyName + GenUtilsStrutsValidation.VALIDATOR_VALIDATION_LABEL + ".=" + GenUtilsStrutsValidation.getValidationLabel(w));
		}

		return res;
	}


	/**
	 *
	 * @param t
	 * @return
	 */
	private static List<String> getComplexTypeLabels(ComplexType t) {
		List<String> res = new ArrayList<String>();
		for (Field f : t.getFields()) {
			if ( GenUtilsStrutsValidation.requireValidation(f) ) {
				res.addAll(getFieldLabels(f, t.getName()));
			}
		}
		return res;
	}


	/**
	 *
	 * @param f
	 * @param typeName
	 * @return
	 */
	private static List<String> getFieldLabels(Field field, String typeName) {
		List<String> res = new ArrayList<String>();
		String key = typeName + "." + field.getName();

		if ( field.getType() instanceof ComplexType ) {
			// Tipo complesso: e' un visitor validator
			// TODO: capire nei vari casi qual'� la chiave
			res.add(key + GenUtilsStrutsValidation.VISITOR_VALIDATION_LABEL + "=" + typeName + ": ");
		}
		else if ( field.getType() instanceof SimpleType ) {
			// tipo semplice:

			// required validation
			if ( field.isRequired() ) {
				res.add(key + GenUtilsStrutsValidation.REQUIRED_VALIDATION_LABEL + "=Campo " + field.getName() + " obbligatorio");
			}

			// validation
			if ( !GenUtils.isNullOrEmpty(field.getDataTypeModifier()) ) {
				res.add(key + GenUtilsStrutsValidation.VALIDATOR_VALIDATION_LABEL + "=" + GenUtilsStrutsValidation.getValidationLabel(field));
			}
		}

		return res;
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
