package it.csi.mddtools.guigen.genutils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;


import it.csi.mddtools.guigen.CommandOutcome;
import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DataLifetimeType;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GridPanelLayout;
import it.csi.mddtools.guigen.GridWidgetLayoutSpec;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.JumpCommand;
import it.csi.mddtools.guigen.JumpExtCommand;
import it.csi.mddtools.guigen.Menu;
import it.csi.mddtools.guigen.MenuItem;
import it.csi.mddtools.guigen.MenuPanel;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.Menubar;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.PortalNames;
import it.csi.mddtools.guigen.RadioButton;
import it.csi.mddtools.guigen.RadioButtons;
import it.csi.mddtools.guigen.SequenceCommand;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.StdMessagePanel;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.Widget;




public class GenUtils {
	
public static ContentPanel findParentContentPanel (Command a){
	EObject containerOfAction = a.eContainer();
	//String name= containerOfAction.eClass().getName();
	if (containerOfAction instanceof EventHandler){
		EObject widget=containerOfAction.eContainer();
		EObject panel = widget.eContainer();
		if(panel instanceof RadioButtons)
			panel = panel.eContainer();
		else if(widget instanceof MenuItem)
			return null; // .. in realtà non è un pannello
		return findParentContentPanel((Panel)panel);
	}
	else if (containerOfAction instanceof CommandOutcome){
		ExecCommand execAct= (ExecCommand)containerOfAction.eContainer();
		return findParentContentPanel(execAct);
	}
	else if (containerOfAction instanceof SequenceCommand){
		// sequence action
		return findParentContentPanel(((SequenceCommand)containerOfAction));
	}
	else if (containerOfAction instanceof ContentPanel){
		return (ContentPanel)containerOfAction;
	}
	else{
		return null; // in tutti i casi in cui l'azione non ha un content panel "sopra"
	}
	
}
 

public static ContentPanel findParentContentPanel(Widget w){
	EObject parent = w.eContainer();
	if(w instanceof RadioButton)
		parent = parent.eContainer(); //old parent:RadioButtons
	return findParentContentPanel((Panel)parent);
}

/**
 * Risale la gerarchia dei pannelli fino ad arrivare al content panel che contiene
 * (direttamente o indirettamente) il pannello in questione.
 * @param p
 * @return
 */
public static ContentPanel findParentContentPanel(Panel p){
	EObject parent = p.eContainer();
	if (parent instanceof ContentPanel)
		return (ContentPanel)parent;
	else
		return findParentContentPanel((Panel)parent);
}


/**
 * Compila una lista dei Widget appartenenti ad uno dei sottopannelli del
 * content panel in oggetto. Se il content panel è nullo restituisco la lista completa
 * dei widget dell'applicazione
 * @param cp
 * @return
 */
public static ArrayList<Widget> findAllWidgetsInContentPanel(ContentPanel cp){
	if (cp != null)
		return findAllWidgetsInPanel(cp.getPanels());
	else
		return findAllWidgetsInApplication();
}


/**
 * Restituisce la lista completa dei widget dell'applicazione
 * @return
 */
public static ArrayList<Widget> findAllWidgetsInApplication() {
	TreeIterator<EObject> all= GuigenPackage.eINSTANCE.eAllContents();
	ArrayList<Widget> allW = new ArrayList<Widget>();
	while(all.hasNext()){
		EObject curr = all.next();
		if (curr instanceof Widget)
			allW.add((Widget)curr);
	}
	return allW;
}

/**
 * Compila una lista dei widget appartenenti al pannello in questione o ad
 * uno sei suoi sottopannelli.
 * @param p
 * @return
 */
	public static ArrayList<Widget> findAllWidgetsInPanel(FormPanel p) {
		ArrayList<Widget> ris = new ArrayList<Widget>();
		// widget primo livello
		ris.addAll(p.getWidgets());
		
		// widget sottopannelli
		if (p.getSubpanels() != null) {
			Iterator<Panel> it = p.getSubpanels().iterator();
			while (it.hasNext()) {
				ArrayList<Widget> tmp = findAllWidgetsInPanel(it.next());
				ris.addAll(tmp);
			}
		}
		return ris;
	}

public static ArrayList<Widget> findAllWidgetsInPanel(Panel p){
	if(p instanceof FormPanel)
		return findAllWidgetsInPanel((FormPanel)p);
	else if (p instanceof TabSetPanel)
		return findAllWidgetsInPanel((TabSetPanel)p);
	else if (p instanceof MultiPanel)
		return findAllWidgetsInPanel((MultiPanel)p);
	else if (p instanceof DialogPanel)
		return findAllWidgetsInPanel((DialogPanel)p);
	else if (p instanceof StdMessagePanel)
		return new ArrayList<Widget>(); // [DM] non ha sottopannelli, ritorno un ArrayList vuoto
	else
		throw new IllegalArgumentException("Tipo pannello non gestito");
}

/**
 * compila una lista dei widget contenuti nel dialog
 * @param dp
 * @return
 */
public static ArrayList<Widget> findAllWidgetsInPanel(DialogPanel dp){
	Panel dlgContent = dp.getDialogContent();
	if (dlgContent==null)
		return null;
	else
		return findAllWidgetsInPanel(dlgContent);
}

/**
 * Compila una lista di tutti i widget appartenenti ad uno dei tab del tabset
 * in oggetto.
 * @param tsp
 * @return
 */
	public static ArrayList<Widget> findAllWidgetsInPanel(TabSetPanel tsp) {
		if (tsp.getPanels() == null)
			return null;
		else {
			ArrayList<Widget> ris = new ArrayList<Widget>();
			if (tsp.getPanels() != null) {
				Iterator<Panel> it = tsp.getPanels().iterator();
				while (it.hasNext()) {
					ArrayList<Widget> tmp = findAllWidgetsInPanel(it.next());
					ris.addAll(tmp);
				}
			}
			return ris;
		}
	}

	/**
	 * Compila una lista di tutti i widget appartenenti ad uno dei sottopannelli del 
	 * multipanel in oggetto.
	 * @param mp
	 * @return
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(MultiPanel mp) {
		if (mp.getPanels() == null)
			return null;
		else {
			ArrayList<Widget> ris = new ArrayList<Widget>();
			if (mp.getPanels() != null) {
				Iterator<Panel> it = mp.getPanels().iterator();
				while (it.hasNext()) {
					ArrayList<Widget> tmp = findAllWidgetsInPanel(it.next());
					ris.addAll(tmp);
				}
			}
			return ris;
		}
	}	
	
public static boolean isVersioneFormalmenteCorretta(String codVer){
	StringTokenizer stok = new StringTokenizer(codVer, ".");
	if (stok.countTokens()!=3)
		return false;
	else
		return true;
}


/**
 * 
 * @param sourceId
 * @return un id univoco della regione protetta univocamente derivabile
 * da sourceId. Serve per avere degli id univoci ma abbastanza corti da non
 * creare problemi a seguito di eventuali formattazioni automatiche dei 
 * commenti che dichiarano la protectred region 
 */
public static String getRegionUID(String sourceId){
	String uid = "R"+sourceId.hashCode();
	return uid;
}


public static List<ExecCommand> getAllExecActionsForEventHandler(EventHandler eh){
	List<ExecCommand> ris = new ArrayList<ExecCommand>();
	return getAllExecActionsRecursive(eh.getCommand());
}


public static List<ExecCommand> getAllExecActionsRecursive(Command a){
	if (a instanceof ExecCommand)
		return getAllExecActionsRecursive((ExecCommand) a);
	else if (a instanceof SequenceCommand)
		return getAllExecActionsRecursive((SequenceCommand)a);
	else
		return new ArrayList<ExecCommand>();
}

public static List<ExecCommand> getAllExecActionsRecursive(ExecCommand ea){
	List<ExecCommand> ris = new ArrayList<ExecCommand>();
	ris.add(ea);
	// cerca nei rami di outcome...
	Iterator<CommandOutcome> it_ar = ea.getResults().iterator();
	while(it_ar.hasNext()){
		Command currResultAction = it_ar.next().getCommand();
		ris.addAll(getAllExecActionsRecursive(currResultAction));
	}
	return ris;
}

public static List<ExecCommand> getAllExecActionsRecursive(SequenceCommand sa){
	List<ExecCommand> ris = new ArrayList<ExecCommand>();
	Iterator<Command> it_steps = sa.getCommands().iterator();
	while(it_steps.hasNext()){
		ris.addAll(getAllExecActionsRecursive(it_steps.next()));
	}
	return ris;
}


public static boolean isInMenuBranch(ExecCommand ea){
	Object parent = ea.eContainer();
	
	if (parent instanceof EventHandler)
		return isInMenuBranch((EventHandler)parent);
	else if (parent instanceof CommandOutcome)
		return isInMenuBranch((CommandOutcome)parent);
	else if (parent instanceof SequenceCommand)
		return isInMenuBranch((SequenceCommand)parent);
	else
		return false;
}

public static boolean isInMenuBranch(SequenceCommand sa){
	Object parent = sa.eContainer();
	if (parent instanceof CommandOutcome)
		return isInMenuBranch((CommandOutcome)parent);
	else if (parent instanceof EventHandler)
		return isInMenuBranch((EventHandler)parent);
	else
		return false;
}

public static boolean isInMenuBranch(EventHandler eh){
	Object parent = eh.eContainer();
	if (parent instanceof MenuItem)
		return true;
	else
		return false;
}

public static boolean isInMenuBranch(CommandOutcome ar){
	ExecCommand parent = (ExecCommand)ar.eContainer();
	return isInMenuBranch(parent);
	 
}
/**
 * Restituisce un array list di tutti i possibili salti ad altre pagine a partire da
 * un content panel prefissato. 
 * @param cp
 * @return
 */
public static List<ContentPanel> getAllPossibleJumps(ContentPanel cp){
	return getAllPossibleJumps(cp.getPanels());
}

public static List<JumpExtCommand> getAllPossibleExtJumps(ContentPanel cp){
	return getAllPossibleExtJumps(cp.getPanels());
}

public static List<ContentPanel> getAllPossibleJumps(Menubar mb){
	List<MenuItem> allEventSourceMenuItems = getAllEventSourceMenuItems(mb);
	Iterator<MenuItem> it_mi = allEventSourceMenuItems.iterator();
	List<ContentPanel> result = new ArrayList<ContentPanel>();
	while(it_mi.hasNext()){
		MenuItem currMI = it_mi.next();
		EventHandler currEH = currMI.getEventHandler();
		List<ContentPanel> currJumps = getAllPossibleJumps(currEH);
		result.addAll(currJumps);
	}
	return result;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(Menubar mb){
	List<MenuItem> allEventSourceMenuItems = getAllEventSourceMenuItems(mb);
	Iterator<MenuItem> it_mi = allEventSourceMenuItems.iterator();
	List<JumpExtCommand> result = new ArrayList<JumpExtCommand>();
	while(it_mi.hasNext()){
		MenuItem currMI = it_mi.next();
		EventHandler currEH = currMI.getEventHandler();
		List<JumpExtCommand> currJumps = getAllPossibleExtJumps(currEH);
		result.addAll(currJumps);
	}
	return result;
}

public static List<ContentPanel> getAllPossibleJumps(MenuItem mi){
	List<ContentPanel> result = new ArrayList<ContentPanel>();
	EventHandler currEH = mi.getEventHandler();
	result = getAllPossibleJumps(currEH);
	return result;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(MenuItem mi){
	List<JumpExtCommand> result = new ArrayList<JumpExtCommand>();
	EventHandler currEH = mi.getEventHandler();
	result = getAllPossibleExtJumps(currEH);
	return result;
}

public static List<ContentPanel> getAllPossibleJumps(Panel p){
	if (p instanceof FormPanel)
		return getAllPossibleJumps((FormPanel)p);
	else if (p instanceof MultiPanel)
		return getAllPossibleJumps((MultiPanel)p);
	else
		return null; // TODO gestire i tabset panel....
}

public static List<JumpExtCommand> getAllPossibleExtJumps(Panel p){
	if (p instanceof FormPanel)
		return getAllPossibleExtJumps((FormPanel)p);
	else if (p instanceof MultiPanel)
		return getAllPossibleExtJumps((MultiPanel)p);
	else
		return null; // TODO gestire i tabset panel....
}

public static List<ContentPanel> getAllPossibleJumps(FormPanel p){
	// scende in tutti i sotto pannelli
	HashSet<ContentPanel> recursiveDestinations = new HashSet<ContentPanel>();
	List<Panel> subpanels = p.getSubpanels();
	if (subpanels!=null){
		Iterator<Panel> panels_it = subpanels.iterator();
		while(panels_it.hasNext()){
			List<ContentPanel> currSubJumps = getAllPossibleJumps(panels_it.next());
			if (currSubJumps!=null)
				recursiveDestinations.addAll(currSubJumps);
		}
	}
	// guarda i widget a primo livello
	HashSet<ContentPanel> firstLevelDestinations = new HashSet<ContentPanel>();
	List<Widget> widgets = p.getWidgets();
	if (widgets!=null){
		Iterator<Widget> widgets_it = widgets.iterator();
		while(widgets_it.hasNext()){
			List<ContentPanel> currSubJumps = getAllPossibleJumps(widgets_it.next());
			if (currSubJumps!=null)
				firstLevelDestinations.addAll(currSubJumps);
		}
	}
	
	recursiveDestinations.addAll(firstLevelDestinations);
	List<ContentPanel> result= new ArrayList<ContentPanel>();
	result.addAll(recursiveDestinations);
	result.addAll(firstLevelDestinations);
	return result;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(FormPanel p){
	// scende in tutti i sotto pannelli
	HashSet<JumpExtCommand> recursiveDestinations = new HashSet<JumpExtCommand>();
	List<Panel> subpanels = p.getSubpanels();
	if (subpanels!=null){
		Iterator<Panel> panels_it = subpanels.iterator();
		while(panels_it.hasNext()){
			List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(panels_it.next());
			if (currSubJumps!=null)
				recursiveDestinations.addAll(currSubJumps);
		}
	}
	// guarda i widget a primo livello
	HashSet<JumpExtCommand> firstLevelDestinations = new HashSet<JumpExtCommand>();
	List<Widget> widgets = p.getWidgets();
	if (widgets!=null){
		Iterator<Widget> widgets_it = widgets.iterator();
		while(widgets_it.hasNext()){
			List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(widgets_it.next());
			if (currSubJumps!=null)
				firstLevelDestinations.addAll(currSubJumps);
		}
	}
	
	recursiveDestinations.addAll(firstLevelDestinations);
	List<JumpExtCommand> result= new ArrayList<JumpExtCommand>();
	result.addAll(recursiveDestinations);
	result.addAll(firstLevelDestinations);
	return result;
}

public static List<ContentPanel> getAllPossibleJumps(MultiPanel p){
	// scende in tutti i sotto pannelli
	HashSet<ContentPanel> recursiveDestinations = new HashSet<ContentPanel>();
	List<Panel> subpanels = p.getPanels();
	if (subpanels!=null){
		Iterator<Panel> panels_it = subpanels.iterator();
		while(panels_it.hasNext()){
			List<ContentPanel> currSubJumps = getAllPossibleJumps(panels_it.next());
			if (currSubJumps!=null)
				recursiveDestinations.addAll(currSubJumps);
		}
	}	
	List<ContentPanel> result= new ArrayList<ContentPanel>();
	result.addAll(recursiveDestinations);
	return result;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(MultiPanel p){
	// scende in tutti i sotto pannelli
	HashSet<JumpExtCommand> recursiveDestinations = new HashSet<JumpExtCommand>();
	List<Panel> subpanels = p.getPanels();
	if (subpanels!=null){
		Iterator<Panel> panels_it = subpanels.iterator();
		while(panels_it.hasNext()){
			List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(panels_it.next());
			if (currSubJumps!=null)
				recursiveDestinations.addAll(currSubJumps);
		}
	}	
	List<JumpExtCommand> result= new ArrayList<JumpExtCommand>();
	result.addAll(recursiveDestinations);
	return result;
}

public static List<ContentPanel> getAllPossibleJumps(Widget w){
	List<EventHandler> eventHandlers = w.getEventHandlers();
	Iterator<EventHandler> evh_it = eventHandlers.iterator();
	
	HashSet<ContentPanel> resultSet = new HashSet<ContentPanel>();
	while(evh_it.hasNext()){
		List<ContentPanel> currSubJumps = getAllPossibleJumps(evh_it.next());
		if (currSubJumps!=null)
			resultSet.addAll(currSubJumps);
	}
	List<ContentPanel> result = new ArrayList<ContentPanel>();
	result.addAll(resultSet);
	return result;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(Widget w){
	List<EventHandler> eventHandlers = w.getEventHandlers();
	Iterator<EventHandler> evh_it = eventHandlers.iterator();
	
	HashSet<JumpExtCommand> resultSet = new HashSet<JumpExtCommand>();
	while(evh_it.hasNext()){
		List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(evh_it.next());
		if (currSubJumps!=null)
			resultSet.addAll(currSubJumps);
	}
	List<JumpExtCommand> result = new ArrayList<JumpExtCommand>();
	result.addAll(resultSet);
	return result;
}

public static List<ContentPanel> getAllPossibleJumps(EventHandler evh){
	Command a = evh.getCommand();
	if (a==null)
		return null;
	else{
		return getAllPossibleJumps(a);
	}
}

public static List<JumpExtCommand> getAllPossibleExtJumps(EventHandler evh){
	Command a = evh.getCommand();
	if (a==null)
		return null;
	else{
		return getAllPossibleExtJumps(a);
	}
}

public static List<ContentPanel> getAllPossibleJumps(Command a){
	if (a instanceof JumpCommand)
		return getAllPossibleJumps((JumpCommand)a);
	else if (a instanceof ExecCommand)
		return getAllPossibleJumps((ExecCommand)a);
	else if (a instanceof SequenceCommand)
		return getAllPossibleJumps((SequenceCommand)a);
	else
		return null;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(Command a){
	if (a instanceof JumpExtCommand)
		return getAllPossibleExtJumps((JumpExtCommand)a);
	else if (a instanceof ExecCommand)
		return getAllPossibleExtJumps((ExecCommand)a);
	else if (a instanceof SequenceCommand)
		return getAllPossibleExtJumps((SequenceCommand)a);
	else
		return null;
}

public static List<ContentPanel> getAllPossibleJumps(JumpCommand a){
	List<ContentPanel> ris = new ArrayList<ContentPanel>();
	ris.add(a.getJumpTo());
	return ris;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(JumpExtCommand a){
	List<JumpExtCommand> ris = new ArrayList<JumpExtCommand>();
	if (a.getRuntimeUrlProvider()!=null){
		String s = "${";
		s+=getAppDataKey(a.getRuntimeUrlProvider());
		s+="}";
		JumpExtCommand currJD = GuigenFactory.eINSTANCE.createJumpExtCommand();
		currJD.setLocationCode(a.getLocationCode());
		currJD.setStaticUrl(s);
		ris.add(currJD);
	}
	else{
		ris.add(a);
	}
	return ris;
}

public static List<ContentPanel> getAllPossibleJumps(SequenceCommand a){
	Command lastStep = a.getCommands().get(a.getCommands().size()-1);
	return getAllPossibleJumps(lastStep);
}

public static List<JumpExtCommand> getAllPossibleExtJumps(SequenceCommand a){
	Command lastStep = a.getCommands().get(a.getCommands().size()-1);
	return getAllPossibleExtJumps(lastStep);
}

public static List<ContentPanel> getAllPossibleJumps(CommandOutcome ar){
	return getAllPossibleJumps(ar.getCommand());
}

public static List<JumpExtCommand> getAllPossibleExtJumps(CommandOutcome ar){
	return getAllPossibleExtJumps(ar.getCommand());
}

public static List<ContentPanel> getAllPossibleJumps(ExecCommand a){
	Iterator<CommandOutcome> res_it = a.getResults().iterator();
	HashSet<ContentPanel> resultSet = new HashSet<ContentPanel>();
	while(res_it.hasNext()){
		List<ContentPanel> currSubJumps = getAllPossibleJumps(res_it.next());
		if (currSubJumps!=null)
			resultSet.addAll(currSubJumps);
	}
	List<ContentPanel> ris = new ArrayList<ContentPanel>();
	ris.addAll(resultSet);
	return ris;
}

public static List<JumpExtCommand> getAllPossibleExtJumps(ExecCommand a){
	Iterator<CommandOutcome> res_it = a.getResults().iterator();
	HashSet<JumpExtCommand> resultSet = new HashSet<JumpExtCommand>();
	while(res_it.hasNext()){
		List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(res_it.next());
		if (currSubJumps!=null)
			resultSet.addAll(currSubJumps);
	}
	List<JumpExtCommand> ris = new ArrayList<JumpExtCommand>();
	ris.addAll(resultSet);
	return ris;
}
//////////////////////

public static List<Widget> getAllEventSourceWidgets(ContentPanel cp){
	List<Widget> allWidgetsInCP = findAllWidgetsInContentPanel(cp);
	Iterator<Widget> w_it = allWidgetsInCP.iterator();
	List<Widget> result = new ArrayList<Widget>();
	while(w_it.hasNext()){
		Widget currW = w_it.next();
		if (currW.getEventHandlers()!=null && currW.getEventHandlers().size()>0)
			result.add(currW);
	}
	return result;
}


public static List<MenuItem> getAllEventSourceMenuItems(Menubar mb){
	List<MenuItem> result = new ArrayList<MenuItem>();
	Iterator<Menu> m_it = mb.getTopLevelMenu().iterator();
	while(m_it.hasNext()){
		Menu currMnu = m_it.next();
		List<MenuItem> currMenuItems = getAllEventSourceMenuItems(currMnu);
		result.addAll(currMenuItems);
	}
	return result;
}

public static List<MenuItem> getAllEventSourceMenuItems(Menu m){
	List<MenuItem> result = new ArrayList<MenuItem>();
	Iterator<MenuItem> it_mi = m.getItem().iterator();
	while(it_mi.hasNext()){
		MenuItem currMI = it_mi.next();
		if (currMI.getEventHandler()!=null)
			result.add(currMI);
	}
	// TODO aggiungere i submenu...
	Iterator<Menu> it_sm = m.getSubmenu().iterator();
	while(it_sm.hasNext()){
		Menu currSM = it_sm.next();
		result.addAll(getAllEventSourceMenuItems(currSM));
	}
	return result;
}

///////

public static String getFixedRadioButtonList(RadioButtons rb){
	String list = "";
	if (rb.getRadio()!=null && rb.getRadio().size()>0){
		Iterator<RadioButton> it = rb.getRadio().iterator();
		while(it.hasNext()){
			RadioButton currRadio = it.next();
			String currRadioString = "'"+currRadio.getName()+"':'"+currRadio.getLabel()+"'";
			list+=currRadioString+",";
		}
		list = list.substring(0,list.length()-1); // tolgo ultimo ","
		return list;
	}
	else
		return ""; // non si dovrebbe mai essere iun questo caso (check sul modello)
}





/**
 * restituisce tutti gli application data con scope USER_ACTION dichiarati
 * nel content panel in input (e referenziati nelle varie exec-action interne)
 * @param cp
 * @return
 */
public static ArrayList<ApplicationData> findAllActionScopedAppDataInContentPanel(ContentPanel cp){
	ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
	ris.addAll(cp.getAppData());
	return ris;
}

public static ArrayList<ApplicationData> findAllActionScopedAppData(Widget w){
	ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
	Iterator<EventHandler> eh_it = w.getEventHandlers().iterator();
	while(eh_it.hasNext()){
		EventHandler eh = eh_it.next();
		ArrayList<ApplicationData> currAppdataList = findAllActionScopedAppData(eh);
		if (currAppdataList!=null)
			ris.addAll(currAppdataList);
	}
	return ris;
}

public static ArrayList<ApplicationData> findAllActionScopedAppData(EventHandler eh){
	return findAllActionScopedAppData(eh.getCommand());
}

public static ArrayList<ApplicationData> findAllActionScopedAppData(Command a){
	if (a instanceof SequenceCommand)
		return findAllActionScopedAppData((SequenceCommand)a);
	else if (a instanceof ExecCommand)
		return findAllActionScopedAppData((ExecCommand)a);
	else	
		return null;
}

public static List<ApplicationData> findAllActionScopedAppDataInMenubar(Menubar mb){
	List<ApplicationData> result = new ArrayList<ApplicationData>();
	Iterator<Menu> it_m = mb.getTopLevelMenu().iterator();
	while(it_m.hasNext()){
		Menu currMnu =it_m.next();
		List<ApplicationData> parz = findAllActionScopedAppData(currMnu); 
		if (parz!=null)result.addAll(parz);
	}
	return result;
}

public static List<ApplicationData> findAllActionScopedAppData(Menu m){
	List<ApplicationData> result = new ArrayList<ApplicationData>();
	Iterator<MenuItem> it_mi = m.getItem().iterator();
	while(it_mi.hasNext()){
		MenuItem currMI = it_mi.next();
		if (currMI.getEventHandler()!=null){
			List<ApplicationData>parz  = findAllActionScopedAppData(currMI.getEventHandler());
			if (parz!=null) result.addAll(parz);
		}
	}
	// submenu
	Iterator<Menu> it_sm = m.getSubmenu().iterator();
	while(it_sm.hasNext()){
		Menu currSM = it_sm.next();
		List<ApplicationData> parz = findAllActionScopedAppData(currSM); 
		if (parz!=null) result.addAll(parz);
	}
	return result;
}


/**
 * restituisce gli app data diretti e quelli di eventuali exec action interne ai vari rami di result
 * @param a
 * @return
 */
public static ArrayList<ApplicationData> findAllActionScopedAppData(ExecCommand a){
	ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
	if (a.getPostExecData()!=null)
		ris.addAll(a.getPostExecData());
	Iterator<CommandOutcome> a_it = a.getResults().iterator();
	while(a_it.hasNext()){
		ArrayList<ApplicationData> currAppDataList = findAllActionScopedAppData(a_it.next());
		if (currAppDataList!=null)
			ris.addAll(currAppDataList);
	}
	return ris;
}

public static ArrayList<ApplicationData> findAllActionScopedAppData(CommandOutcome r){
	return findAllActionScopedAppData(r.getCommand());
}

/**
 * restituisce tutti gli app data di tutte le eventuiali exec action presenti negli step
 * @param a
 * @return
 */
public static ArrayList<ApplicationData> findAllActionScopedAppData(SequenceCommand a){
	ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
	Iterator<Command> a_it = a.getCommands().iterator();
	while(a_it.hasNext()){
		ArrayList<ApplicationData> currAppDataList = findAllActionScopedAppData(a_it.next());
		if (currAppDataList!=null)
			ris.addAll(currAppDataList);
	}
	return ris;
}


/**
 * restituisce la stringa OGNL per il value del data widget.
 * Se il widget ha un app data binding viene referenziato quello, altrimenti
 * viene associato semplicemente alla proerty della action corrispondente
 * @param w
 * @return
 */
public static String getOGNLForWidgetValue(DataWidget w){
	if (w.getDatabinding()!=null){
		AppDataBinding binding = w.getDatabinding();
		if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_ACTION)){
			return ""+getFullBindingPath(binding)+"";
		}
		else if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_SESSION)){
			return ""+getFullBindingPath(binding)+"";  // unificato
		}
		else {
			throw new IllegalArgumentException("Errore di generazione: tipo lifetime extent non supportato in "+w);
		}
	}
	else {
		return getWidgetName(w);
	}
}

public static String getOGNLForWidgetMultiValue(MultiDataWidget w){
	if (w.getMultiDataBinding()!=null){
		AppDataBinding binding = w.getMultiDataBinding();
		if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_ACTION)){
			return ""+getFullBindingPath(binding)+"";
		}
		else if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_SESSION)){
			return ""+getFullBindingPath(binding)+""; // unificato
		}
		else {
			throw new IllegalArgumentException("Errore di generazione: tipo lifetime extent non supportato in "+w);
		}
	}
	else {
		return getWidgetName(w);
	}
}


/**
 * Restituisce il nome del widget. E' utilizzabile in molti contesti
 * TODO: se cambiamo i nomi nel generatore occorre modificare anche questo
 * 
 * @param w Il widget
 * @return  Il nome del widget
 * @author [DM] 
 */
public static String getWidgetName(Widget w) {
	return "widg_" + w.getName();
}


public static String getFullBindingPath(AppDataBinding binding){
	ApplicationData data = binding.getAppData();
	String path = binding.getPath();
	String ris = ""+getAppDataKey(data);
	if (path!=null && path.length()>0)
		ris+=("."+path);
	return ris;
}

//chiave dell'app data quando salvato in sessione
public static String getAppDataKey(ApplicationData ad){
	return "appData"+ad.getName();
}

// nome della property associata all'appdata quando viene inserito nella action
public static String getAppDataPropertyName(ApplicationData ad){
	return "appData"+ad.getName();
}

// [DM] verifica se l'elemento Menu ha un solo Item o no
public static boolean hasUniqueMenuItem(Menu currMenu) {
	int numItems = currMenu.getItem().size();
	int numSubMenus = currMenu.getSubmenu().size();
	return ((numItems == 1 && numSubMenus == 0) ? true : false);
}

public static List<MenuItem> getAllMenuItemRecursive(Menu m){
	List<MenuItem> result = new ArrayList<MenuItem>();
	result.addAll(m.getItem());
	Iterator<Menu> it_sm = m.getSubmenu().iterator();
	while(it_sm.hasNext()){
		Menu currSM = it_sm.next();
		List<MenuItem> currSMI = getAllMenuItemRecursive(currSM);
		result.addAll(currSMI);
	}
	return result;
}


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
public static int getColumnsLayout(FormPanel firstLevPanel) {
	
	PanelLayout currPanLay = firstLevPanel.getLayout();
	int columns = 1;
	
	if ( currPanLay instanceof VerticalFlowPanelLayout ) {
		columns = 1;
	} else if ( currPanLay instanceof UDLRCPanelLayout ) {
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
	} else if ( currPanLay instanceof HorizontalFlowPanelLayout ) {
		// ??? come lo gestisco
		columns = 1;
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
public static String getButtonStyleByLayout(GUIModel model, Button b) {
	String res = "";
	if ( model.getPortale() == PortalNames.SISTEMA_PIEMONTE ) {
		res = getButtonStyleSistemaPiemonte(model, b);
	} else if ( model.getPortale() == PortalNames.INTRANET_RUPARPIEMONTE ) {
		
	}
	return res;
}

/**
 * Non mi piace molto questa implementazione, ma...
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
	if ( b.getLayoutSpec() != null && b.getLayoutSpec() instanceof UDLRCWidgetLayoutSpec ) {
		btnStyleT = "nav";
	} else {
		btnStyleT = "funz";
	}
	
	return "cssClass=\"" + btnStyleT + btnStyleL + "\"";
}






////////////////////////////////////////////////////////////////////////////////////////////////////

public static it.csi.mddtools.guigen.Type[] generateCSIBaseTypes(){
    // tipi semplici
	//basicTypesMap = new Hashtable();
	SimpleType csiInteger = createDT("Integer", SimpleTypeCodes.INT, false);
	//basicTypesMap.put(Integer.TYPE, csiInteger);
	SimpleType csiBoolean = createDT("Boolean", SimpleTypeCodes.BOOLEAN, false);
	//basicTypesMap.put(Boolean.TYPE, csiBoolean);
	SimpleType csiByte = createDT("Byte", SimpleTypeCodes.BYTE, false);
	//basicTypesMap.put(Byte.TYPE, csiByte);
	SimpleType csiDate = createDT("Date", SimpleTypeCodes.DATE, false);
	//basicTypesMap.put(java.util.Date.class, csiDate);
	SimpleType csiDouble = createDT("Double", SimpleTypeCodes.DOUBLE, false);
	//basicTypesMap.put(Double.TYPE, csiDouble);
	SimpleType csiFloat = createDT("Float", SimpleTypeCodes.FLOAT, false);
	//basicTypesMap.put(Float.TYPE, csiFloat);
	SimpleType csiLong = createDT("Long", SimpleTypeCodes.LONG, false);
	//basicTypesMap.put(Long.TYPE, csiLong);
	SimpleType csiString = createDT("String", SimpleTypeCodes.STRING, false);
	//basicTypesMap.put(String.class, csiString);
	// tipi wrapped (nillable)
	SimpleType csiWInteger = createDT("WrappedInteger", SimpleTypeCodes.INT, true);
	//basicTypesMap.put(Integer.class, csiWInteger);
	SimpleType csiWBoolean = createDT("WrappedBoolean", SimpleTypeCodes.BOOLEAN, true);
	//basicTypesMap.put(Boolean.class, csiWBoolean);
	SimpleType csiWDouble = createDT("WrappedDouble", SimpleTypeCodes.DOUBLE, true);
	//basicTypesMap.put(Double.class, csiWDouble);
	SimpleType csiWFloat = createDT("WrappedFloat", SimpleTypeCodes.FLOAT, true);
	//basicTypesMap.put(Float.class, csiWFloat);
	SimpleType csiWLong = createDT("WrappedLong", SimpleTypeCodes.LONG, true);
	
	SimpleType csiTreeCat = createDT("TreeNode", SimpleTypeCodes.TREE_NODE, true);
	
	//basicTypesMap.put(Long.class, csiWLong);
	// array di tipi semplici
	it.csi.mddtools.guigen.TypedArray csiIntegerArray = createTA("Array of Integer", csiInteger);
	//basicTypesMap.put(getTypedArrayClass(Integer.TYPE), csiIntegerArray);
	it.csi.mddtools.guigen.TypedArray csiBooleanArray = createTA("Array of Boolean", csiBoolean);
	//basicTypesMap.put(getTypedArrayClass(Boolean.TYPE), csiBooleanArray);
	it.csi.mddtools.guigen.TypedArray csiByteArray = createTA("Array of Byte", csiByte);
	//basicTypesMap.put(getTypedArrayClass(Byte.TYPE), csiByteArray);
	it.csi.mddtools.guigen.TypedArray csiDateArray = createTA("Array of Date", csiDate);
	//basicTypesMap.put(getTypedArrayClass(java.util.Date.class), csiDateArray);
	it.csi.mddtools.guigen.TypedArray csiDoubleArray = createTA("Array of Double", csiDouble);
	//basicTypesMap.put(getTypedArrayClass(Double.TYPE), csiDoubleArray);
	it.csi.mddtools.guigen.TypedArray csiFloatArray = createTA("Array of Float", csiFloat);
	//basicTypesMap.put(getTypedArrayClass(Float.TYPE), csiFloatArray);
	it.csi.mddtools.guigen.TypedArray csiLongArray = createTA("Array of Long", csiLong);
	//basicTypesMap.put(getTypedArrayClass(Long.TYPE), csiLongArray);
	it.csi.mddtools.guigen.TypedArray csiStringArray = createTA("Array of String", csiString);
	//basicTypesMap.put(getTypedArrayClass(String.class), csiStringArray);
	// array di tipi wrapped
	it.csi.mddtools.guigen.TypedArray csiWIntegerArray = createTA("Array of WrappedInteger", csiWInteger);
	//basicTypesMap.put(getTypedArrayClass(Integer.class), csiWIntegerArray);
	it.csi.mddtools.guigen.TypedArray csiWBooleanArray = createTA("Array of WrappedBoolean", csiWBoolean);
	//basicTypesMap.put(getTypedArrayClass(Boolean.class), csiWBooleanArray);
	it.csi.mddtools.guigen.TypedArray csiWDoubleArray = createTA("Array of WrappedDouble", csiWDouble);
	//basicTypesMap.put(getTypedArrayClass(Double.class), csiWDoubleArray);
	it.csi.mddtools.guigen.TypedArray csiWFloatArray = createTA("Array of WrappedFloat", csiWFloat);
	//basicTypesMap.put(getTypedArrayClass(Float.class), csiWFloatArray);
	it.csi.mddtools.guigen.TypedArray csiWLongArray = createTA("Array of WrappedLong", csiWLong);
	
	it.csi.mddtools.guigen.TypedArray csiTreeCatArray = createTA("Array of TreeNode", csiTreeCat);
	//basicTypesMap.put(getTypedArrayClass(Long.class), csiWLongArray);
	
	it.csi.mddtools.guigen.Type [] types = new it.csi.mddtools.guigen.Type[]{
			csiInteger,csiBoolean,csiByte,csiDate,csiDouble,csiFloat,csiLong,csiString,
			csiWInteger,csiWBoolean,csiWDouble,csiWFloat,csiWLong,csiTreeCat,
			csiIntegerArray,csiBooleanArray,csiByteArray,csiDateArray,csiDoubleArray,csiFloatArray,csiLongArray,csiStringArray,
			csiWIntegerArray,csiWBooleanArray,csiWDoubleArray,csiWFloatArray,csiWLongArray, csiTreeCatArray
	};
	return types;
}

public static Class getTypedArrayClass(Class javaCompType){
	Object dummyArray = Array.newInstance(javaCompType, 0);
	return dummyArray.getClass();
}
public static SimpleType createDT(String name, SimpleTypeCodes code, boolean nillable){
	SimpleType dt = GuigenFactory.eINSTANCE.createSimpleType();
	dt.setName(name);
	dt.setCode(code);
	dt.setNillable(nillable);
	return dt;
}

public static it.csi.mddtools.guigen.TypedArray createTA(String name,SimpleType dt){
	it.csi.mddtools.guigen.TypedArray ta = GuigenFactory.eINSTANCE.createTypedArray();
	ta.setName(name);
	ta.setComponentType(dt);
	return ta;
}

public static it.csi.mddtools.guigen.TypedArray createTA(String name,ComplexType dt){
	it.csi.mddtools.guigen.TypedArray ta = GuigenFactory.eINSTANCE.createTypedArray();
	ta.setName(name);
	ta.setComponentType(dt);
	return ta;
}


////////////////////////////////////////////////////////////////////////////////////////////////////
// JAVA METHODS FOR CHECKS

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



////////////////////////////////////////////////////////////////////////////////////////////////////
// UTILITY METHODS

/**
 *
 * @param s
 * @return
 */
public static boolean isNullOrEmpty(String s) {
	return (s == null || s.trim().length() == 0);
}



////////////////////////////////////////////////////////////////////////////////////////////////////
// MAIN

/**
 * @param args
 */
public static void main(String[] args) {
	try {
		MenuItem mi = GuigenFactory.eINSTANCE.createMenuItem();
		EventHandler eh = GuigenFactory.eINSTANCE.createEventHandler();
		mi.setEventHandler(eh);
		ExecCommand ex = GuigenFactory.eINSTANCE.createExecCommand();
		eh.setCommand(ex);
		findParentContentPanel(ex);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
