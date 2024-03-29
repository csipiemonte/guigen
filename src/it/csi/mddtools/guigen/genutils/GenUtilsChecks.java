/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.AppDataMappingPDefVal;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Calendar;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ConfirmButton;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GridPanelLayout;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.MenuPanel;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.PDefParamVal;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelDefUse;
import it.csi.mddtools.guigen.PlainText;
import it.csi.mddtools.guigen.ResetButton;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.UserDefinedWidget;
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
	 * @return La lista dei DataBinding che non � possibile risolvere.
	 */
	public static ArrayList<ApplicationData> findUnresolvedAppDataBinding(
			ContentPanel cp) {
		// [AM] gli appdata referenziati sono:
		// - quelli collegati ad un databinding ad un widget
		// - quelli collegati ad un collection databinding ad un widget
		// - quelli referenziati in un parametro di PanelDFefUse
		// per semplicita' la gestione degli AppData derivanti da PanelDef 
		// � trattata a parte mantenendo la logica presistente per gli altri casi
		
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
		// PanelDefUse
		ris.addAll(_findUnresolvedAppDataForPanelDef(cp));
		return ris;
	}

	/**
	 * restituisce solo gli appdata non risolti relativi ai PanelDefUse (pezza temporanea per
	 * evitare di stravolgere la logica di findUnresolvedAppDataBinding.
	 */
	public static ArrayList<ApplicationData> _findUnresolvedAppDataForPanelDef(ContentPanel cp){
		ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>(); 
		ris.addAll(_findUnresolvedAppDataForPanelDef(cp.getPanels(), cp));
		return ris;
	}
	
	public static ArrayList<ApplicationData> _findUnresolvedAppDataForPanelDef(Panel p, ContentPanel cp){
		if (p instanceof FormPanel){
			return _findUnresolvedAppDataForPanelDef((FormPanel)p, cp);
		}
		else if (p instanceof MultiPanel){
			return _findUnresolvedAppDataForPanelDef((MultiPanel)p, cp);
		}
		else if (p instanceof PanelDefUse){
			return _findUnresolvedAppDataForPanelDef((PanelDefUse)p, cp);
		}
		else
			return new ArrayList<ApplicationData>(); // empty
	}
	
	public static ArrayList<ApplicationData> _findUnresolvedAppDataForPanelDef(FormPanel p, ContentPanel cp){
		ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
		Iterator<Panel> it_subp = p.getSubpanels().iterator();
		while (it_subp.hasNext()) {
			Panel panel = it_subp.next();
			ris.addAll(_findUnresolvedAppDataForPanelDef(panel, cp));
		}
		return ris;
	}
	
	public static ArrayList<ApplicationData> _findUnresolvedAppDataForPanelDef(MultiPanel p, ContentPanel cp){
		ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
		Iterator<Panel> it_subp = p.getPanels().iterator();
		while (it_subp.hasNext()) {
			Panel panel = it_subp.next();
			ris.addAll(_findUnresolvedAppDataForPanelDef(panel, cp));
		}
		return ris;
	}
	
	public static ArrayList<ApplicationData> _findUnresolvedAppDataForPanelDef(PanelDefUse pdu, ContentPanel cp){
		ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
		if (pdu.getConfig()!=null){
			Iterator<PDefParamVal> pdpv_it = pdu.getConfig().getParamValues().iterator();
			while (pdpv_it.hasNext()) {
				PDefParamVal pDefParamVal = pdpv_it.next();
				if (pDefParamVal instanceof AppDataMappingPDefVal){
					if (((AppDataMappingPDefVal) pDefParamVal).getActualAppData()!=null){
						if(!cp.getAppData().contains(((AppDataMappingPDefVal) pDefParamVal).getActualAppData())){
							ris.add(((AppDataMappingPDefVal) pDefParamVal).getActualAppData());
						}
					}
				}
			}
		}
		return ris;
	}


	/**
	 * Verifica che l'attributo columnSizes di un WidgetsPanel sia formalmente
	 * corretto, cio� composto da numeri interi.
	 * 
	 * @param wp Il WidgetsPanel da verificare.
	 * @return true se l'attributo &egrave; corretto, false altrimenti.
	 */	
	public static boolean columnSizesFormatWidgetsPanelCheck(WidgetsPanel wp) {
		// per il momento ignoriamo l'HorizontalFlowPanelLayout
		if (wp.getLayout() instanceof VerticalFlowPanelLayout || wp.getLayout() instanceof GridPanelLayout) {
			StringTokenizer st = new StringTokenizer(wp.getLayout().getColumnSizes(), ",");
			while (st.hasMoreTokens()) {
				try {
					Integer.parseInt(st.nextToken());
				} catch (NumberFormatException e) {
					return false;
				}
			}
		}
		// tutto bene, ritorno true
		return true;
	}
	
	
	/**
	 * Verifica che l'attributo columnSizes di un WidgetsPanel sia formalmente
	 * corretto, ovvero che la somma di tutti gli elementi corrisponda a 100.
	 * 
	 * @param wp Il WidgetsPanel da verificare.
	 * @return true se l'attributo &egrave; corretto, false altrimenti.
	 */
	public static boolean columnSizesSumWidgetsPanelCheck(WidgetsPanel wp) {
		// per il momento ignoriamo l'HorizontalFlowPanelLayout
		if (wp.getLayout() instanceof VerticalFlowPanelLayout || wp.getLayout() instanceof GridPanelLayout) {
			StringTokenizer st = new StringTokenizer(wp.getLayout().getColumnSizes(), ",");
			int colsSum = 0;
			while (st.hasMoreTokens()) {
				// non ci deve essere eccezione perch� prima ho verificato che siano tutti numeri
				colsSum += Integer.parseInt(st.nextToken());
			}
			
			// verifico che la somma di tutte le colonne corrisponda a 100 o a 12
			if (colsSum != 100 && colsSum != 12) {
				return false;
			}
		}
		// tutto bene, ritorno true
		return true;
	}	
	
	/**
	 * Verifica che l'attributo columnSizes di un WidgetsPanel sia formalmente
	 * corretto, ovvero che il numero atteso di colonne, specificato
	 * nell'attributo, corrisponda con il numero di colonne fisiche che 
	 * verranno realmente generate sulla base di quanto modellato.
	 * 
	 * @param wp Il WidgetsPanel da verificare.
	 * @return true se l'attributo &egrave; corretto, false altrimenti.
	 */
	public static int realColumnsNumberWidgetsPanelCheck(WidgetsPanel wp) {	
		int realCols = 0;
		
		// per il momento ignoriamo l'HorizontalFlowPanelLayout
		if (wp.getLayout() instanceof VerticalFlowPanelLayout || wp.getLayout() instanceof GridPanelLayout) {
			if (wp.getLayout() instanceof VerticalFlowPanelLayout) {
				realCols = Integer.parseInt(GenUtilsLayout.getGridPanelColumnsNumber(wp));
			} else if (wp.getLayout() instanceof GridPanelLayout) {
				realCols = getGridPanelRealColumnNumber(wp);
			}
		}
		
		return realCols;
	}	

	public static int expectedColumnsNumberWidgetsPanelCheck(WidgetsPanel wp) {
		int expectedCols = 0;
		
		// per il momento ignoriamo l'HorizontalFlowPanelLayout
		if (wp.getLayout() instanceof VerticalFlowPanelLayout || wp.getLayout() instanceof GridPanelLayout) {
			StringTokenizer st = new StringTokenizer(wp.getLayout().getColumnSizes(), ",");
			expectedCols = st.countTokens();			
		}
		
		return expectedCols;
	}
	

	/*
	 * Verifica che l'attributo columnSizes di un WidgetsPanel sia formalmente
	 * corretto.
	 * 
	 * @param wp Il WidgetsPanel da verificare.
	 * @return true se l'attributo &egrave; corretto, false altrimenti.
	 */
	/*public static boolean columnSizesWidgetsPanelCheck(WidgetsPanel wp) {
		// per il momento ignoriamo l'HorizontalFlowPanelLayout
		if (wp.getLayout() instanceof VerticalFlowPanelLayout || wp.getLayout() instanceof GridPanelLayout) {
			StringTokenizer st = new StringTokenizer(wp.getLayout().getColumnSizes(), ",");
			int cols = st.countTokens();

			// verifico che il numero delle colonne sia quello atteso
			int expectedCols = 0;
			if (wp.getLayout() instanceof VerticalFlowPanelLayout) {
				expectedCols = Integer.parseInt(GenUtilsLayout.getGridPanelColumnsNumber(wp));
			} else if (wp.getLayout() instanceof GridPanelLayout) {
				expectedCols = getGridPanelRealColumnNumber(wp);
			}
			if (cols != expectedCols) {
				return false;
			}
			
			// verifico che ciascuna colonna sia fatta in formato numerico intero
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
	}*/

	/**
	 * Determina il numero massimo di colonne FISICHE che verranno generate per il
	 * WidgetsPanel dato.
	 * 
	 * @param p
	 * @return
	 * @author [DM]
	 */
	public static int getGridPanelRealColumnNumber(WidgetsPanel p) {
		int columns = 0;

		int rows = ((GridPanelLayout)p.getLayout()).getRows();
		for (int i = 0; i < rows; i++) {
			int currRow = i+1;
			List<Widget> widgets = GenUtilsLayout.getWidgetsByRow(p, currRow);
			int currRowCols = 0;
			for (Widget w : widgets) {
				int cols = getWidgetRealColumnNumber(p, w);
				currRowCols += cols;
			}
			if (currRowCols > columns) {
				columns = currRowCols;
			}
		}
		return columns;
	}


	/**
	 * Calcola il numero di colenne FISICHE che verranno realmente generate
	 * per il Widget dato.
	 * 
	 * @param wp
	 * @param w
	 * @return
	 * @author [DM]
	 */
	public static int getWidgetRealColumnNumber(WidgetsPanel wp, Widget w) {
		// di default un widget genera 2 colonne (LABEL + WIDGET)
		int cols = 2; 

		// ... ma ci sono delle eccezioni ...
		if ( w instanceof Table || w instanceof Button || w instanceof ConfirmButton || w instanceof ResetButton ) {
			// Table, e i Button (Button, ConfirmButton, ResetButton) non hanno label, quindi generano 1 colonna fisica
			cols = 1;
		} else if ( w instanceof PlainText ) {
			// un PlainText con label nulla genera 1 sola colonna fisica
			if ( w.getLabel() == null ) {
				cols = 1; 
			}
		} else {
			// gli altri Widget con label nulla generano anch'essi 1 sola colonna fisica
			if ( w.getLabel() == null ) {
				cols = 1; 
			}			
		}

		return cols;
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
	
	/**
	 * Controlla solo superficialmente i complexTypes (corrispondenza per tipo di tipo e per nome/codice)
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static boolean typeWeakEquals(Type t1, Type t2) {
		assert t1 != null && t2 != null;
		if (t1 instanceof SimpleType && t2 instanceof SimpleType) {
			return ((SimpleType) t1).getCode() == ((SimpleType) t2).getCode()&&
			((SimpleType) t1).isNillable() == ((SimpleType) t2).isNillable();
		} else if (t1 instanceof ComplexType && t2 instanceof ComplexType) {
			return t1.getName().equals(t2.getName()); // weak
		} else if (t1 instanceof TypedArray && t2 instanceof TypedArray) {
			Type et1 = ((TypedArray) t1).getComponentType();
			Type et2 = ((TypedArray) t2).getComponentType();
			return typeWeakEquals(et1, et2);
		} else
			return false; // tipo di tipi non corrispondenti
	}
	
	
	public static boolean hasCircularHierarchy(ComplexType ct){
		if (ct == null)
			return false;
		else{
			return hasCircularHierarchy(ct, new ArrayList<ComplexType>());
		}
	}

	private static boolean hasCircularHierarchy(ComplexType ct,
			ArrayList<ComplexType> alreadyVisited) {
		if (alreadyVisited.contains(ct)){
			return true;
		}
		else if(ct.getExtends()==null){
			return false;
		}
		else{
			alreadyVisited.add(ct);
			return hasCircularHierarchy(ct.getExtends(), alreadyVisited);
		}
	}
	
	/**
	 * Metodo che prende in input la lista di tutti gli appData "agganciati" 
	 * al modello e ne verifica l'univocit� a livello della property name
	 * @param appDataList
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static boolean applicationDataNamesAreAllUnambiguous(List appDataList){
		HashMap<String, ApplicationData> hmAppData = new HashMap<String, ApplicationData>();
		for (Iterator iterator = appDataList.iterator(); iterator.hasNext();) {
			ApplicationData applicationData = (ApplicationData) iterator.next();
			if (hmAppData.containsKey(applicationData.getName())){
				return false;
			}
			hmAppData.put(applicationData.getName(), applicationData);
		}
		return true;
	}

}
