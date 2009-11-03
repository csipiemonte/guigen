package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.Calendar;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.GridPanelLayout;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.MenuPanel;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WidgetsPanel;

/**
 * Questa classe contiene i metodi di utilit&agrave; per i Check.
 * 
 * @author Davide Martinotti
 */
public class GenUtilsChecks {

	/**
	 * Controlla che tutti i widget di un CommandPanel siano dei CommandWidget o
	 * al massimo un HiddenValue.
	 * 
	 * @param cp Il CommandPanel da controllare.
	 * @return true se tutti i widget sono dei CommandWidget (o HiddenValue),
	 *         false altrimenti.
	 * @author [DM]
	 */
	public static boolean commandPanelCommandWidgetCheck(CommandPanel cp) {
		for (Widget w : cp.getWidgets()) {
			if (!(w instanceof CommandWidget) && !(w instanceof HiddenValue)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Un CommandPanel pu&ograve; avere solo due tipi di layout: 
	 *    [a] HorizontalFlowPanelLayout, 
	 *    [b] UDLRCPanelLayout ristretto (solo LEFT e RIGHT)
	 * 
	 * @param cp  Il CommandPanel da controllare.
	 * @return  true se il layout &egrace; corretto, false altrimenti.
	 * @author [DM]
	 */
	public static boolean commandPanelLayoutCheck(CommandPanel cp) {
		boolean res = true;

		if ( cp.getLayout() instanceof VerticalFlowPanelLayout || cp.getLayout() instanceof GridPanelLayout ) {
			res = false;
		} else if ( cp.getLayout() instanceof UDLRCPanelLayout ) { 
			for ( Widget w : cp.getWidgets() ) {
				if ( !(w.getLayoutSpec() instanceof UDLRCWidgetLayoutSpec) ) {
					res = false;
					break;				
				}
				
				// center e' stato aggiunto per la nuova architettura (xhtml cross-portal)
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
	 * Verifica che tutti i widget di un MenuPanel siano di tipo MenuView o
	 * TreeView.
	 * 
	 * @param cp
	 *            Il CommandPanel da verificare.
	 * @return true se tutti i widget sono dei CommandWidget, false altrimenti.
	 * @author [DM]
	 */
	public static boolean menuPanelWidgetCheck(MenuPanel mp) {
		for (Widget w : mp.getWidgets()) {
			if (!(w instanceof MenuView) && !(w instanceof TreeView)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Verifica se esistono dei DataBinding (semplici o multi) non risolvibili.
	 * Vengono presi in considerazione: (1) tutti i binding associati a widget inseriti direttamente
	 * nel ContentPanel; (2) i binding derivanti da istanziazione di PanelDef.
	 * 
	 * @param cp
	 *            Il ContentPanel da verificare.
	 * @return La lista dei DataBinding che non è possibile risolvere.
	 */
	public static ArrayList<ApplicationData> findUnresolvedAppDataBinding(
			ContentPanel cp) {
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

			// [DM] Verifico i DataBinding degli ExecCommand
			if (w.getEventHandlers() != null && w.getEventHandlers().size() > 0) {
				for (EventHandler eh : w.getEventHandlers()) {
					for (ExecCommand ec : GenUtils.getAllExecActionsForEventHandler(eh)) {
						for (ApplicationData ad : ec.getPostExecData()) {
							if (!cp.getAppData().contains(ad)) {
								ris.add(ad);
							}
						}
					}
				}
			}

		}

		return ris;
	}

	/**
	 * Verifica che l'attributo columnSizes di un WidgetsPanel sia formalmente
	 * corretto.
	 * 
	 * @param wpIl
	 *            WidgetsPanel da verificare.
	 * @return true se l'attributo &egrave; corretto, false altrimenti.
	 */
	public static boolean columnSizesWidgetsPanelCheck(WidgetsPanel wp) {
		// per il momento ignoriamo l'HorizontalFlowPanelLayout
		if (wp.getLayout() instanceof VerticalFlowPanelLayout
				|| wp.getLayout() instanceof GridPanelLayout) {
			StringTokenizer st = new StringTokenizer(wp.getLayout().getColumnSizes(), ",");
			int cols = st.countTokens();

			// verifico che il numero delle colonne sia quello atteso
			int expectedCols = Integer.parseInt(GenUtilsLayout.getGridPanelColumnsNumber(wp));
			if (cols != expectedCols) {
				return false;
			}

			// verifico che ciascuna colonna sia fatta in formato numerico
			// intero
			int colsSum = 0;
			while (st.hasMoreTokens()) {
				try {
					colsSum += Integer.parseInt(st.nextToken());
				} catch (NumberFormatException e) {
					return false;
				}
			}

			// verifico che la somma di tutte le colonne corrisponda a 100
			if (colsSum != 100) {
				return false;
			}
		}

		// tutto bene, ritorno true
		return true;
	}

	/**
	 * Verifica che il DataBinding di un Calendar (se esiste) sia di tipo Date.
	 * 
	 * @param c
	 *            Il widget di tipo Calendar da verificare.
	 * @return true se il DataBinding &egrave; del tipo atteso, false
	 *         altrimenti.
	 */
	public static boolean calendarDataBindingTypeCheck(Calendar c) {
		Type t = c.getDatabinding().getAppData().getType();
		if (c.getDatabinding().getPath() != null && c.getDatabinding().getPath().length() > 0) {
			Field f = GenUtils.getSelectedField(null, t, c.getDatabinding().getPath());
			if (f != null) {
				if (f.getType() instanceof SimpleType) {
					SimpleType ft = (SimpleType) f.getType();
					if (ft.getCode() == SimpleTypeCodes.DATE) {
						return true;
					}
				}
			}
			return false;
		} else {
			if (c.getDatabinding().getAppData().getType() instanceof SimpleType
					&& ((SimpleType) (c.getDatabinding().getAppData().getType())).getCode() == SimpleTypeCodes.DATE)
				return true;
			else
				return false;
		}
	}

	/**
	 * Verifica la corrispondenza di tipo tra DataWidget e binding.
	 * 
	 * @param w Il DataWidget da verificare.
	 * @return true se c'&grave; corrispondenza di tipo tra DataWidget e
	 *         binding, false altrimenti.
	 * @author [DM]
	 */
	public static boolean widgetDataBindingCorrispondenceCheck(DataWidget w) {
		try {
			Type wdt = w.getDataType();
			AppDataBinding db = w.getDatabinding();
			if (db==null)
				return true;
			else{
				if(!(db.getAppData().getType() instanceof SimpleType) && 
						db.getPath()!=null&&
						db.getPath().length()>0)
				{
					Field f = GenUtils.getSelectedField(null, db.getAppData().getType(), db.getPath());
					if (f!=null)
						return typeEquals(f.getType(), wdt);
					else
						return false; // field not found
				}
				else{
					return typeEquals(wdt, db.getAppData().getType());
				}
					
			}			
			
		} catch (RuntimeException re) {
			re.printStackTrace();
			throw re;
		}
	}

	public static boolean typeEquals(Type t1, Type t2) {
		assert t1 != null && t2 != null;
		if (t1 instanceof SimpleType && t2 instanceof SimpleType) {
			return ((SimpleType) t1).getCode() == ((SimpleType) t2).getCode()&&
			((SimpleType) t1).isNillable() == ((SimpleType) t2).isNillable();
		} else if (t1 instanceof ComplexType && t2 instanceof ComplexType) {
			return t1.equals(t2);
		} else if (t1 instanceof TypedArray && t2 instanceof TypedArray) {
			Type et1 = ((TypedArray) t1).getComponentType();
			Type et2 = ((TypedArray) t2).getComponentType();
			return typeEquals(et1, et2);
		} else
			return false; // tipo di tipi non corrispondenti
	}
}
