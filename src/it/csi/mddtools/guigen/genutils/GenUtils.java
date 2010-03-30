package it.csi.mddtools.guigen.genutils;

import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.ActorMappingPDefVal;
import it.csi.mddtools.guigen.ActorMappingParam;
import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.AppDataGroup;
import it.csi.mddtools.guigen.AppDataMappingPDefVal;
import it.csi.mddtools.guigen.AppDataMappingParam;
import it.csi.mddtools.guigen.AppModule;
import it.csi.mddtools.guigen.ApplicationArea;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ApplicationDataDefs;
import it.csi.mddtools.guigen.ChkEditStatusCommand;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.ColumnModel;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.CommandOutcome;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.CustomSecurityConstraint;
import it.csi.mddtools.guigen.DataLifetimeType;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.ExtraColumn;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.FileUpload;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.JumpCommand;
import it.csi.mddtools.guigen.JumpExtCommand;
import it.csi.mddtools.guigen.Menu;
import it.csi.mddtools.guigen.MenuPanel;
import it.csi.mddtools.guigen.Menubar;
import it.csi.mddtools.guigen.MsgBoxPanel;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.PDefParamVal;
import it.csi.mddtools.guigen.PDefUseConfig;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelDef;
import it.csi.mddtools.guigen.PanelDefUse;
import it.csi.mddtools.guigen.RadioButton;
import it.csi.mddtools.guigen.RadioButtons;
import it.csi.mddtools.guigen.RefreshViewCommand;
import it.csi.mddtools.guigen.Role;
import it.csi.mddtools.guigen.RoleMappingPDefVal;
import it.csi.mddtools.guigen.RoleMappingParam;
import it.csi.mddtools.guigen.SequenceCommand;
import it.csi.mddtools.guigen.ShowDialogCommand;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.StdMessagePanel;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TableCustomizationPDefVal;
import it.csi.mddtools.guigen.TableCustomizationParam;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypeNamespace;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.Typedefs;
import it.csi.mddtools.guigen.UCMappingPDefVal;
import it.csi.mddtools.guigen.UISecurityConstraint;
import it.csi.mddtools.guigen.UseCase;
import it.csi.mddtools.guigen.UseCaseMappingParam;
import it.csi.mddtools.guigen.UserDefinedPanel;
import it.csi.mddtools.guigen.UserInfoPanel;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WidgetsPanel;
import it.csi.mddtools.guigen.WizardPanel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;


/**
 * Questa classe contiene i metodi di utilit&agrave; per il generatore <b>GuiGen</b>.
 *
 * @author Mauro Antonaci
 * @author Davide Martinotti
 */
public class GenUtils {

	/**
	 * Verifica che il codice della versione sia nella forma canonica:
	 * 
	 * &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;
	 * 
	 * @param codVer Codice della versione.
	 * @return true se il codice rispetta la convenzione, false altrimenti.
	 */
	public static boolean isVersioneFormalmenteCorretta(String codVer) {
		StringTokenizer stok = new StringTokenizer(codVer, ".");
		if (stok.countTokens() != 3) {
			return false;
		} else {
			return true;
		}
	}


	/**
	 * Genera un ID univoco da assegnare ad una Protected Region.
	 * 
	 * @param sourceId Stringa da cui ricavare l'ID (nome ContentPanel, Panel, Widget, ecc...)
	 * @return un id univoco della regione protetta univocamente derivabile
	 *         da sourceId. Serve per avere degli id univoci ma abbastanza corti da non
	 *         creare problemi a seguito di eventuali formattazioni automatiche dei
	 *         commenti che dichiarano la Protected Region.
	 */
	public static String getRegionUID(String sourceId){
		String uid = "R"+sourceId.hashCode();
		return uid;
	}


	//////////////////////////////////////////////////////////////////////////////////
	// content panels

	/**
	 * Restituisce tutti i ContentPanel dell'applicazione.
	 * 
	 * @param  model  GUIModel che rappresenta l'applicazione.
	 * @return Lista dei ContentPanel dell'applicazione.
	 * @author [DM]
	 */
	public static List<ContentPanel> getAllContentPanels(GUIModel model) {
		ApplicationArea appArea =  model.getStructure().getAppWindow().getAppArea();
		return getAllContentPanels(appArea);
	}


	/**
	 * Restituisce tutti i ContentPanels contenuti in una ApplicationArea.
	 * 
	 * @param appArea  L'ApplicationArea interessata.
	 * @return Lista dei ContentPanel dell'ApplicationArea data.
	 * @author [DM]
	 */
	public static List<ContentPanel> getAllContentPanels(ApplicationArea appArea) {
		List<ContentPanel> res = new ArrayList<ContentPanel>();

		// ContentPanels a livello ApplicationArea (this.structure.appWindow.appArea.contentPanels)
		res.addAll(appArea.getContentPanels());

		// ContentPanels a livello packages (AppModule)
		for (AppModule module : appArea.getModules()) {
			res.addAll(module.getContentPanels());
		}

		for (AppModule module : appArea.getExtModules()) {
			res.addAll(module.getContentPanels());
		}
		return res;
	}


	/**
	 * Verifica che il name del ContentPanel sia univoco su tutta l'applicazione.
	 * 
	 * @param contentPanel Il ContentPanel da verificare.
	 * @return true se il name del content panel &egrave; univoco, false altrimenti.
	 */
	public static boolean isContentPanelUnique(ContentPanel contentPanel) {
		ApplicationArea appArea = null;
		if ( contentPanel.eContainer() instanceof ApplicationArea ) {
			// ContentPanel a livello ApplicationArea
			appArea = (ApplicationArea)contentPanel.eContainer();
		} else if ( contentPanel.eContainer() instanceof AppModule ) {
			// ContentPanels a livello packages (AppModule)
			appArea = (ApplicationArea)((AppModule)contentPanel.eContainer()).eContainer();
		}

		List<ContentPanel> cpList = getAllContentPanels(appArea);
		int count = 0;
		for (ContentPanel cp : cpList) {
			if ( cp.getName().equals(contentPanel.getName()) ) {
				count++;
			}
		}

		return (count == 1);
	}


	//////////////////////////////////////////////////////////////////////////////////
	// find parent content panel

	/**
	 * Risale la gerarchia dei pannelli fino ad arrivare al ContentPanel che contiene
	 * (direttamente o indirettamente) il Command in questione.
	 * 
	 * @param a Il Command di cui si vuole conoscere il ContentPanel.
	 * @return Il ContentPanel che contiene il Command.
	 */
	public static ContentPanel findParentContentPanel (Command a) {
		EObject containerOfAction = a.eContainer();
		//String name= containerOfAction.eClass().getName();
		if (containerOfAction instanceof EventHandler) {
			EObject widget = containerOfAction.eContainer();
			EObject panel = widget.eContainer();
			if(panel instanceof RadioButtons) {
				panel = panel.eContainer();
			} else if(widget instanceof Menu) {
				return null; // .. in realtà non è un pannello
			}
			return findParentContentPanel((Panel)panel);
		}
		else if (containerOfAction instanceof CommandOutcome) {
			if (containerOfAction.eContainer() instanceof ExecCommand){
				ExecCommand execAct = (ExecCommand)containerOfAction.eContainer();
				return findParentContentPanel(execAct);	
			}
			else if (containerOfAction.eContainer() instanceof ChkEditStatusCommand){
				ChkEditStatusCommand chkAct = (ChkEditStatusCommand)containerOfAction.eContainer();
				return findParentContentPanel(chkAct);	
			}
			else
				throw new IllegalArgumentException("findParentContentPanel(Command): container non gestito "+containerOfAction.eContainer());
			
		}
		else if (containerOfAction instanceof SequenceCommand) {
			// sequence action
			return findParentContentPanel(((SequenceCommand)containerOfAction));
		}
		else if (containerOfAction instanceof ContentPanel) {
			return (ContentPanel)containerOfAction;
		}
		else {
			return null; // in tutti i casi in cui l'azione non ha un content panel "sopra"
		}

	}

	/**
	 * Risale la gerarchia dei pannelli fino ad arrivare al ContentPanel che contiene
	 * (direttamente o indirettamente) il widget in questione.
	 * 
	 * @param w Il Widget di cui si vuole conoscere il ContentPanel.
	 * @return Il ContentPanel che contiene il Widget.
	 */
	public static ContentPanel findParentContentPanel(Widget w) {
		EObject parent = w.eContainer();
		if(w instanceof RadioButton) {
			parent = parent.eContainer(); //old parent:RadioButtons
		}
		return findParentContentPanel((Panel)parent);
	}

	/**
	 * Risale la gerarchia dei pannelli fino ad arrivare al ContentPanel che contiene
	 * (direttamente o indirettamente) il pannello in questione.
	 * 
	 * @param p Il Panel di cui si vuole conoscere il ContentPanel.
	 * @return Il ContentPanel che contiene il Panel.
	 */
	public static ContentPanel findParentContentPanel(Panel p){
		EObject parent = p.eContainer();
		if (parent instanceof ContentPanel) {
			return (ContentPanel)parent;
		}
		else if (parent instanceof PanelDef) {
			return null; // il pannello è contenuto in un panel def
		}
		else {
			return findParentContentPanel((Panel)parent);
		}
	}


	//////////////////////////////////////////////////////////////////////////////////
	// find parent PanelDef
	/**
	 * Risale la gerarchia dei pannelli fino ad arrivare al PanelDef che contiene
	 * (direttamente o indirettamente) il Command in questione. Vale per comandi
	 * inseriti in frammenti riusabili
	 * 
	 * @param a Il Command di cui si vuole conoscere il PanelDef.
	 * @return Il PanelDef che contiene il Command.
	 */
	public static PanelDef findParentPanelDef (Command a) {
		EObject containerOfAction = a.eContainer();
		//String name= containerOfAction.eClass().getName();
		if (containerOfAction instanceof EventHandler) {
			EObject widget = containerOfAction.eContainer();
			EObject panel = widget.eContainer();
			if(panel instanceof RadioButtons) {
				panel = panel.eContainer();
			} else if(widget instanceof Menu) {
				return null; // .. in realtà non è un pannello
			}
			return findParentPanelDef((Panel)panel);
		}
		else if (containerOfAction instanceof CommandOutcome) {
			if (containerOfAction.eContainer() instanceof ExecCommand){
				ExecCommand execAct = (ExecCommand)containerOfAction.eContainer();
				return findParentPanelDef(execAct);
			}
			else if (containerOfAction.eContainer() instanceof ChkEditStatusCommand){
				ChkEditStatusCommand chkAct = (ChkEditStatusCommand)containerOfAction.eContainer();
				return findParentPanelDef(chkAct);
			} 
			else
				throw new IllegalArgumentException("findParenPanelDef(CommandOutcome): container non gestito "+containerOfAction.eContainer());
		}
		else if (containerOfAction instanceof SequenceCommand) {
			// sequence action
			return findParentPanelDef(((SequenceCommand)containerOfAction));
		}
		else if (containerOfAction instanceof PanelDef) {
			return (PanelDef)containerOfAction;
		}
		else {
			return null; // in tutti i casi in cui l'azione non ha un panel def "sopra"
		}

	}

	/**
	 * Risale la gerarchia dei pannelli fino ad arrivare al PanelDef che contiene
	 * (direttamente o indirettamente) il widget in questione. Vale nel caso in cui
	 * il widget sia contenuto in un frammento riusabile
	 * 
	 * @param w Il Widget di cui si vuole conoscere il PanelDef.
	 * @return Il PanelDef che contiene il Widget.
	 */
	public static PanelDef findParentPanelDef(Widget w) {
		EObject parent = w.eContainer();
		if(w instanceof RadioButton) {
			parent = parent.eContainer(); //old parent:RadioButtons
		}
		return findParentPanelDef((Panel)parent);
	}

	/**
	 * Risale la gerarchia dei pannelli fino ad arrivare al PanelDef che contiene
	 * (direttamente o indirettamente) il pannello in questione.
	 * vale per pannelli contenuti in frammenti riusabili. 
	 * 
	 * @param p Il Panel di cui si vuole conoscere il PanelDef.
	 * @return Il PanelDef che contiene il Panel.
	 */
	public static PanelDef findParentPanelDef(Panel p){
		EObject parent = p.eContainer();
		if (parent instanceof PanelDef) {
			return (PanelDef)parent;
		}
		if (parent instanceof ContentPanel) {
			return null;
		}
		else {
			return findParentPanelDef((Panel)parent);
		}
	}	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	// find all widgets in panels

	/**
	 * Compila una lista dei Widget appartenenti ad uno dei sottopannelli del ContentPanel in oggetto.
	 * Se il ContentPanel &egrave; nullo restituisco la lista completa dei widget dell'applicazione.
	 * Non sono contemplati i widget appartenenti a PanelDef utilizzati nel ContentPanel
	 * @param cp Il ContentPanel che si vuole esaminare.
	 * @return La lista dei Widget del ContentPanel.
	 */
	public static ArrayList<Widget> findAllWidgetsInContentPanel(ContentPanel cp) {
		ArrayList<Widget> res = new ArrayList<Widget>();
		if ( cp != null ) {
			// recupero i pannelli
			if (cp.getPanels()!=null){
				res.addAll(findAllWidgetsInPanel(cp.getPanels()));
			}
			// recupero i DialogPanel
			if ( cp.getDialogs().size() > 0 ) {
				res.addAll(findAllWidgetsInDialogPanels(cp.getDialogs()));
			}
		} else {
			res = findAllWidgetsInApplication();
		}
		return res;
	}


	/**
	 * Restituisce la lista completa dei widget dell'applicazione.
	 * 
	 * @return La lista dei Widget dell'applicazione.
	 */
	public static ArrayList<Widget> findAllWidgetsInApplication() {
		TreeIterator<EObject> all = GuigenPackage.eINSTANCE.eAllContents();
		ArrayList<Widget> allW = new ArrayList<Widget>();
		while(all.hasNext()) {
			EObject curr = all.next();
			if (curr instanceof Widget) {
				allW.add((Widget)curr);
			}
		}
		return allW;
	}




	/**
	 * Compila una lista dei widget contenuti in un Panel.
	 * 
	 * @param p Il Panel da esaminare.
	 * @return La lista dei widget del Panel  (e di tutti i suoi sottopannelli).
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(Panel p){
		if(p instanceof FormPanel)
			return findAllWidgetsInPanel((FormPanel)p);
		else if (p instanceof WidgetsPanel)
			return findAllWidgetsInPanel((WidgetsPanel)p);
		else if (p instanceof CommandPanel)
			return findAllWidgetsInPanel((CommandPanel)p);
		else if (p instanceof MenuPanel)
			return findAllWidgetsInPanel((MenuPanel)p);
		else if (p instanceof TabSetPanel)
			return findAllWidgetsInPanel((TabSetPanel)p);
		else if (p instanceof WizardPanel)
			return findAllWidgetsInPanel((WizardPanel)p);
		else if (p instanceof MultiPanel)
			return findAllWidgetsInPanel((MultiPanel)p);
		else if (p instanceof DialogPanel)
			return findAllWidgetsInPanel((DialogPanel)p);
		else if (p instanceof StdMessagePanel)
			return new ArrayList<Widget>(); // [DM] non ha sottopannelli, ritorno un ArrayList vuoto
		else if (p instanceof UserInfoPanel)
			return new ArrayList<Widget>(); // [DM] non ha sottopannelli, ritorno un ArrayList vuoto
		else if (p instanceof UserDefinedPanel)
			return new ArrayList<Widget>(); // [DM] come lo gestiamo? non posso sapere a priori se ha qualcosa, ritorno un ArrayList vuoto
		else if (p instanceof MsgBoxPanel)
			return findAllWidgetsInPanel((MsgBoxPanel)p);
		else if (p instanceof PanelDefUse)
			return findAllWidgetsInPanel((PanelDefUse)p);
		else
			throw new IllegalArgumentException("Tipo pannello non gestito:"+p);
	}

	/**
	 * Compila una lista dei widget appartenenti al pannello in questione o ad
	 * uno sei suoi sottopannelli.
	 * 
	 * @param p Il FormPanel da esaminare.
	 * @return La lista dei widget del FormPanel (e di tutti i suoi sottopannelli).
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(FormPanel p) {
		ArrayList<Widget> ris = new ArrayList<Widget>();
		// widget sottopannelli
		if (p.getSubpanels() != null) {
			for (Panel panel : p.getSubpanels()) {
				ArrayList<Widget> tmp = findAllWidgetsInPanel(panel);
				ris.addAll(tmp);				
			}
		}
		return ris;
	}	
	
	
	/**
	 * Compila una lista dei widget appartenenti al pannello in questione.
	 * 
	 * @param p Il WidgetsPanel da esaminare.
	 * @return La lista dei widget del WidgetsPanel.
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(WidgetsPanel p) {
		return new ArrayList<Widget>(p.getWidgets());
	}	


	/**
	 * Compila una lista dei widget appartenenti al pannello in questione.
	 * 
	 * @param p Il CommandPanel da esaminare.
	 * @return La lista dei widget del CommandPanel.
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(CommandPanel p) {
		return new ArrayList<Widget>(p.getWidgets());
	}	


	/**
	 * Compila una lista dei widget appartenenti al pannello in questione.
	 * 
	 * @param p Il MenuPanel da esaminare.
	 * @return La lista dei widget del MenuPanel.
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(MenuPanel p) {
		return new ArrayList<Widget>(p.getWidgets());
	}	
	

	/**
	 * Compila una lista dei widget appartenenti ad un insieme di DialogPanel.
	 * 
	 * @param l La lista di DialogPanel da esaminare.
	 * @return La lista dei widget contenuti nei pannelli in esame.
	 */
	public static ArrayList<Widget> findAllWidgetsInDialogPanels(List<DialogPanel> l) {
		ArrayList<Widget> res = new ArrayList<Widget>();
		for (DialogPanel dp : l) {
			res.addAll(findAllWidgetsInPanel(dp));
		}
		return res;
	}


	/**
	 * Compila una lista dei widget appartenenti al pannello in questione o ad
	 * uno sei suoi sottopannelli.
	 * 
	 * @param dp Il DialogPanel da esaminare.
	 * @return La lista dei widget del DialogPanel (e di tutti i suoi sottopannelli).
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(DialogPanel dp) {
		ArrayList<Widget> result = new ArrayList<Widget>();
		List<MsgBoxPanel> dlgBoxes = dp.getMsgBoxes();
		if ( dlgBoxes != null) {
			for (MsgBoxPanel msgBoxPanel : dlgBoxes) {
				ArrayList<Widget> parz = findAllWidgetsInPanel(msgBoxPanel);
				result.addAll(parz);				
			}
		}
		result.addAll(findAllWidgetsInPanel(dp.getCommands()));
		return result;
	}

	/**
	 * Compila una lista dei widget contenuti in un MsgBoxPanel.
	 * 
	 * @param p Il MsgBoxPanel da esaminare.
	 * @return La lista dei widget del MsgBoxPanel.
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(MsgBoxPanel p) {
		ArrayList<Widget> result = new ArrayList<Widget>();
		result.addAll(p.getTextMessages());
		return result;
	}

	/**
	 * Compila una lista di tutti i widget appartenenti ai tab 
	 * del TabSetPanel in oggetto (e dei loro sottopannelli).
	 * 
	 * @param tsp Il TabSetPanel da esaminare.
	 * @return La lista dei widget del TabSetPanel (e di tutti i suoi sottopannelli).
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(TabSetPanel tsp) {
		if (tsp.getPanels() == null && tsp.getSwitcher()==null) {
			return null;
		} else {
			ArrayList<Widget> ris = new ArrayList<Widget>();
			// aggiungo lo switcher se presente
			if (tsp.getSwitcher()!=null)
				ris.add(tsp.getSwitcher());
			// aggiungo i widget dei tabs
			if ( tsp.getPanels() != null ) {
				for (Panel panel : tsp.getPanels()) {
					ArrayList<Widget> tmp = findAllWidgetsInPanel(panel);
					ris.addAll(tmp);					
				}
			}
			return ris;
		}
	}

	/**
	 * Compila una lista di tutti i widget appartenenti ai tab 
	 * del TabSetPanel in oggetto (e dei loro sottopannelli).
	 * 
	 * @param tsp Il TabSetPanel da esaminare.
	 * @return La lista dei widget del TabSetPanel (e di tutti i suoi sottopannelli).
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(WizardPanel tsp) {
		if (tsp.getPanels() == null && tsp.getSwitcher()==null) {
			return null;
		} else {
			ArrayList<Widget> ris = new ArrayList<Widget>();
			// aggiungo lo switcher se presente
			if (tsp.getSwitcher()!=null)
				ris.add(tsp.getSwitcher());
			// aggiungo i widget dei tabs
			if ( tsp.getPanels() != null ) {
				for (Panel panel : tsp.getPanels()) {
					ArrayList<Widget> tmp = findAllWidgetsInPanel(panel);
					ris.addAll(tmp);					
				}
			}
			return ris;
		}
	}
	
	/**
	 * Compila una lista di tutti i widget appartenenti ad uno dei sottopannelli del
	 * MultiPanel in oggetto(e di tutti i suoi sottopannelli).
	 * 
	 * @param mp Il MultiPanel da esaminare.
	 * @return La lista dei widget del MultiPanel (e di tutti i suoi sottopannelli).
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(MultiPanel mp) {
		if ( mp.getPanels() == null ) {
			return null;
		} else {
			ArrayList<Widget> ris = new ArrayList<Widget>();
			if (mp.getPanels() != null) {
				for (Panel panel : mp.getPanels()) {
					ArrayList<Widget> tmp = findAllWidgetsInPanel(panel);
					ris.addAll(tmp);
				}
			}
			return ris;
		}
	}

	/**
	 * Compila una lista dei widget contenuti in un PanelDefUse.
	 * 
	 * @param p Il PanelDefUse da esaminare.
	 * @return Una lista vuota in quanto i widget del PanelDefAssociato non rientrano
	 * nei risultati.  
	 */
	public static ArrayList<Widget> findAllWidgetsInPanel(PanelDefUse p) {
		ArrayList<Widget> result = new ArrayList<Widget>();
		return result;
	}

	//////////////////////////////////////////////////////////////////////////////////

	/**
	 * Restituisce la lista dei widget di tipo Table contenuti in un ContentPanel.
	 * 
	 * @param cp Il ContentPanel
	 * @return  Lista dei widget di tipo Table contenuti nel ContentPanel.
	 * @author [DM]
	 */
	public static List<Table> findAllTablesInContentPanel(ContentPanel cp) {
		List<Table> res = new ArrayList<Table>();

		for ( Widget w : findAllWidgetsInContentPanel(cp) ) {
			if ( w instanceof Table ) {
				res.add((Table)w);
			}
		}

		return res;
	}



	//////////////////////////////////////////////////////////////////////////////////

	/**
	 * Restituisce la lista dei widget di tipo TreeView contenuti in un ContentPanel.
	 * 
	 * @param cp Il ContentPanel
	 * @return  Lista dei widget di tipo TreeView contenuti nel ContentPanel.
	 * @author [DM]
	 */
	public static List<TreeView> findAllTreeInContentPanel(ContentPanel cp) {
		List<TreeView> res = new ArrayList<TreeView>();

		for ( Widget w : findAllWidgetsInContentPanel(cp) ) {
			if ( w instanceof TreeView ) {
				res.add((TreeView)w);
			}
		}

		return res;
	}



	//////////////////////////////////////////////////////////////////////////////////
	// exec actions

	/**
	 * Restituisce la lista delle ExecAction dell'EventHandler.
	 * 
	 * @param eh L'EventHandler da esaminare.
	 * @return Lista degli ExecCommand associati all'EeventHandler dato.
	 */
	public static List<ExecCommand> getAllExecActionsForEventHandler(EventHandler eh){
		//List<ExecCommand> ris = new ArrayList<ExecCommand>();
		return getAllExecActionsRecursive(eh.getCommand());
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<ExecCommand> getAllExecActionsRecursive(Command a){
		if (a instanceof ExecCommand)
			return getAllExecActionsRecursive((ExecCommand) a);
		else if (a instanceof SequenceCommand)
			return getAllExecActionsRecursive((SequenceCommand)a);
		else if (a instanceof ChkEditStatusCommand)
			return getAllExecActionsRecursive((ChkEditStatusCommand)a);
		else
			return new ArrayList<ExecCommand>();
	}

	/**
	 *
	 * @param ea
	 * @return
	 */
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

	/**
	 *
	 * @param ea
	 * @return
	 */
	public static List<ExecCommand> getAllExecActionsRecursive(ChkEditStatusCommand ea){
		List<ExecCommand> ris = new ArrayList<ExecCommand>();
		// cerca nei rami di outcome...
		if (ea.getDoIfChanged()!=null && ea.getDoIfChanged().getCommand()!=null){
			List<ExecCommand> parz1 = getAllExecActionsRecursive(ea.getDoIfChanged().getCommand());
			if (parz1 !=null)
				ris.addAll(parz1);
		}
		if (ea.getDoIfNotChanged()!=null && ea.getDoIfNotChanged().getCommand()!=null){
			List<ExecCommand> parz2 = getAllExecActionsRecursive(ea.getDoIfNotChanged().getCommand());
			if (parz2 !=null)
				ris.addAll(parz2);
		}
		return ris;
	}
	
	/**
	 *
	 * @param sa
	 * @return
	 */
	public static List<ExecCommand> getAllExecActionsRecursive(SequenceCommand sa){
		List<ExecCommand> ris = new ArrayList<ExecCommand>();
		Iterator<Command> it_steps = sa.getCommands().iterator();
		while(it_steps.hasNext()){
			ris.addAll(getAllExecActionsRecursive(it_steps.next()));
		}
		return ris;
	}



	//////////////////////////////////////////////////////////////////////////////////
	// menu

	/**
	 *
	 * @param ea
	 * @return
	 */
	public static boolean isInMenuBranch(ExecCommand ea) {
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

	/**
	 *
	 * @param sa
	 * @return
	 */
	public static boolean isInMenuBranch(SequenceCommand sa) {
		Object parent = sa.eContainer();
		if (parent instanceof CommandOutcome)
			return isInMenuBranch((CommandOutcome)parent);
		else if (parent instanceof EventHandler)
			return isInMenuBranch((EventHandler)parent);
		else
			return false;
	}

	/**
	 *
	 * @param eh
	 * @return
	 */
	public static boolean isInMenuBranch(EventHandler eh) {
		Object parent = eh.eContainer();
		if (parent instanceof Menu) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @param ar
	 * @return
	 */
	public static boolean isInMenuBranch(CommandOutcome ar){
		ExecCommand parent = (ExecCommand)ar.eContainer();
		return isInMenuBranch(parent);

	}


	/**
	 * 
	 * @param jc
	 * @return true se jc è in un ramo di content panel e il jump è a quel content panel
	 */
	public static boolean jumpToSameContentPanel(JumpCommand jc){
		ContentPanel cp = findParentContentPanel(jc);
		if (cp==null || !cp.equals(jc.getJumpTo())) {
			return false;
		} else {
			return true;
		}
	}

	
	//////////////////////////////////////////////////////////////////////////////////
	// get all possible jumps

	/**
	 * Restituisce un array list di tutti i possibili salti ad altre pagine a partire da
	 * un content panel prefissato.
	 * @param cp
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(ContentPanel cp){
		List<ContentPanel> res = new ArrayList<ContentPanel>();

		// jumps for panels
		res.addAll(getAllPossibleJumps(cp.getPanels()));

		// jump for DialogPanels
		for (DialogPanel dp : cp.getDialogs()) {
			res.addAll(getAllPossibleJumps(dp));
		}

		return res;
	}

	/**
	 *
	 * @param mb
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(Menubar mb) {
		List<ContentPanel> result = new ArrayList<ContentPanel>();
		List<Menu> allEventSourceMenu = getAllEventSourceMenus(mb);
		for (Menu currM : allEventSourceMenu) {
			EventHandler currEH = currM.getEventHandler();
			List<ContentPanel> currJumps = getAllPossibleJumps(currEH);
			result.addAll(currJumps);
		}
		return result;
	}

	/**
	 *
	 * @param mi
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(Menu m) {
		List<ContentPanel> result = new ArrayList<ContentPanel>();
		EventHandler currEH = m.getEventHandler();
		List<ContentPanel> ehResult = getAllPossibleJumps(currEH);
		if (ehResult!=null)
			result.addAll(ehResult);
		// vai nei sottomenu
		if (m.getSubmenu().size()>0){
			Iterator<Menu> it_subm = m.getSubmenu().iterator();
			while(it_subm.hasNext()){
				Menu currSubm = it_subm.next();
				result.addAll(getAllPossibleJumps(currSubm));
			}
		}
		return result;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(Panel p) {
		if (p instanceof FormPanel)
			return getAllPossibleJumps((FormPanel)p);
		if (p instanceof WidgetsPanel)
			return getAllPossibleJumps((WidgetsPanel)p);
		if (p instanceof CommandPanel)
			return getAllPossibleJumps((CommandPanel)p);
		else if (p instanceof MultiPanel)
			return getAllPossibleJumps((MultiPanel)p);
		else if (p instanceof DialogPanel)
			return getAllPossibleJumps((DialogPanel)p);
		else
			return null;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(FormPanel p) {
		// scende in tutti i sotto pannelli
		HashSet<ContentPanel> recursiveDestinations = new HashSet<ContentPanel>();
		List<Panel> subpanels = p.getSubpanels();
		if (subpanels!=null){
			Iterator<Panel> panels_it = subpanels.iterator();
			while(panels_it.hasNext()){
				List<ContentPanel> currSubJumps = getAllPossibleJumps(panels_it.next());
				if (currSubJumps!=null) {
					recursiveDestinations.addAll(currSubJumps);
				}
			}
		}

		List<ContentPanel> result= new ArrayList<ContentPanel>();
		result.addAll(recursiveDestinations);
		return result;
	}

	/**
	 *
	 * @param p
	 * @return
	 */	
	public static List<ContentPanel> getAllPossibleJumps(WidgetsPanel p) {
		HashSet<ContentPanel> recursiveDestinations = new HashSet<ContentPanel>();
		if ( p.getWidgets() != null ) {
			for (Widget w : p.getWidgets()) {
				List<ContentPanel> currSubJumps = getAllPossibleJumps(w);
				if (currSubJumps != null) {
					recursiveDestinations.addAll(currSubJumps);
				}
			}
		}
		
		List<ContentPanel> result= new ArrayList<ContentPanel>();
		result.addAll(recursiveDestinations);
		return result;
	}
	
	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(CommandPanel p) {
		// guarda i widget a primo livello
		HashSet<ContentPanel> firstLevelDestinations = new HashSet<ContentPanel>();
		List<Widget> widgets = p.getWidgets();
		if (widgets!=null){
			Iterator<Widget> widgets_it = widgets.iterator();
			while(widgets_it.hasNext()){
				List<ContentPanel> currSubJumps = getAllPossibleJumps(widgets_it.next());
				if (currSubJumps!=null) {
					firstLevelDestinations.addAll(currSubJumps);
				}
			}
		}

		List<ContentPanel> result= new ArrayList<ContentPanel>();
		result.addAll(firstLevelDestinations);
		return result;
	}	
	
	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(DialogPanel p) {
		// Un dialog panel può contenere jump solo nel command panel
		if (p.getCommands()!=null) {
			return getAllPossibleJumps(p.getCommands());
		} else {
			return new ArrayList<ContentPanel>();
		}
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(MultiPanel p) {
		// scende in tutti i sotto pannelli
		HashSet<ContentPanel> recursiveDestinations = new HashSet<ContentPanel>();
		List<Panel> subpanels = p.getPanels();
		if (subpanels!=null){
			Iterator<Panel> panels_it = subpanels.iterator();
			while(panels_it.hasNext()){
				List<ContentPanel> currSubJumps = getAllPossibleJumps(panels_it.next());
				if (currSubJumps!=null) {
					recursiveDestinations.addAll(currSubJumps);
				}
			}
		}
		List<ContentPanel> result= new ArrayList<ContentPanel>();
		result.addAll(recursiveDestinations);
		return result;
	}

	/**
	 *
	 * @param w
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(Widget w) {
		List<EventHandler> eventHandlers = w.getEventHandlers();
		Iterator<EventHandler> evh_it = eventHandlers.iterator();

		HashSet<ContentPanel> resultSet = new HashSet<ContentPanel>();
		while(evh_it.hasNext()){
			List<ContentPanel> currSubJumps = getAllPossibleJumps(evh_it.next());
			if (currSubJumps!=null) {
				resultSet.addAll(currSubJumps);
			}
		}
		List<ContentPanel> result = new ArrayList<ContentPanel>();
		result.addAll(resultSet);
		return result;
	}

	/**
	 *
	 * @param evh
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(EventHandler evh) {
		Command a = evh.getCommand();
		if (a==null) {
			return null;
		} else {
			return getAllPossibleJumps(a);
		}
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(Command a) {
		if (a instanceof JumpCommand)
			return getAllPossibleJumps((JumpCommand)a);
		else if (a instanceof ExecCommand)
			return getAllPossibleJumps((ExecCommand)a);
		else if (a instanceof ChkEditStatusCommand)
			return getAllPossibleJumps((ChkEditStatusCommand)a);
		else if (a instanceof SequenceCommand)
			return getAllPossibleJumps((SequenceCommand)a);
		else
			return null;
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(JumpCommand a) {
		List<ContentPanel> ris = new ArrayList<ContentPanel>();
		ris.add(a.getJumpTo());
		return ris;
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(SequenceCommand a) {
		Command lastStep = a.getCommands().get(a.getCommands().size()-1);
		return getAllPossibleJumps(lastStep);
	}

	/**
	 *
	 * @param ar
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(CommandOutcome ar) {
		return getAllPossibleJumps(ar.getCommand());
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(ExecCommand a) {
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


	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<ContentPanel> getAllPossibleJumps(ChkEditStatusCommand a) {
		HashSet<ContentPanel> resultSet = new HashSet<ContentPanel>();
		List<ContentPanel> parz1 = getAllPossibleJumps(a.getDoIfChanged());
		List<ContentPanel> parz2 = getAllPossibleJumps(a.getDoIfNotChanged());
		if (parz1!=null)
			resultSet.addAll(parz1);
		if (parz2!=null)
			resultSet.addAll(parz2);
		List<ContentPanel> ris = new ArrayList<ContentPanel>();
		ris.addAll(resultSet);
		return ris;
	}


	//////////////////////////////////////////////////////////////////////////////////
	// get all possible extjumps

	/**
	 *
	 * @param cp
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(ContentPanel cp) {
		List<JumpExtCommand> res = new ArrayList<JumpExtCommand>();

		// jumps for panels
		res.addAll(getAllPossibleExtJumps(cp.getPanels()));

		// jump for DialogPanels
		for (DialogPanel dp : cp.getDialogs()) {
			res.addAll(getAllPossibleExtJumps(dp));
		}

		return res;
	}

	/**
	 *
	 * @param mb
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(Menubar mb) {
		List<Menu> allEventSourceMenu = getAllEventSourceMenus(mb);
		List<JumpExtCommand> result = new ArrayList<JumpExtCommand>();
		for (Menu currM : allEventSourceMenu) {
			EventHandler currEH = currM.getEventHandler();
			List<JumpExtCommand> currJumps = getAllPossibleExtJumps(currEH);
			result.addAll(currJumps);			
		}
		return result;
	}

	/**
	 *
	 * @param mi
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(Menu m) {
		List<JumpExtCommand> result = new ArrayList<JumpExtCommand>();
		EventHandler currEH = m.getEventHandler();
		List<JumpExtCommand> ehResult = getAllPossibleExtJumps(currEH);
		if (ehResult!=null)
			result.addAll(ehResult);
		// vai nei sottomenu
		if (m.getSubmenu().size()>0){
			Iterator<Menu> it_subm = m.getSubmenu().iterator();
			while(it_subm.hasNext()){
				Menu currSubm = it_subm.next();
				result.addAll(getAllPossibleExtJumps(currSubm));
			}
		}
		return result;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(Panel p) {
		if (p instanceof FormPanel)
			return getAllPossibleExtJumps((FormPanel)p);
		if (p instanceof WidgetsPanel)
			return getAllPossibleExtJumps((WidgetsPanel)p);
		if (p instanceof CommandPanel)
			return getAllPossibleExtJumps((CommandPanel)p);
		else if (p instanceof MultiPanel)
			return getAllPossibleExtJumps((MultiPanel)p);
		else if (p instanceof DialogPanel)
			return getAllPossibleExtJumps((DialogPanel)p);
		else
			return null;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(FormPanel p) {
		// scende in tutti i sotto pannelli
		HashSet<JumpExtCommand> recursiveDestinations = new HashSet<JumpExtCommand>();
		List<Panel> subpanels = p.getSubpanels();
		if (subpanels!=null){
			Iterator<Panel> panels_it = subpanels.iterator();
			while(panels_it.hasNext()){
				List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(panels_it.next());
				if ( currSubJumps != null ) {
					recursiveDestinations.addAll(currSubJumps);
				}
			}
		}

		List<JumpExtCommand> result = new ArrayList<JumpExtCommand>();
		result.addAll(recursiveDestinations);
		return result;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(WidgetsPanel p) {	
		HashSet<JumpExtCommand> recursiveDestinations = new HashSet<JumpExtCommand>();
		if ( p.getWidgets() != null ) {
			for (Widget w : p.getWidgets()) {
				List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(w);
				if ( currSubJumps != null ) {
					recursiveDestinations.addAll(currSubJumps);
				}
			}
		}
		
		List<JumpExtCommand> result = new ArrayList<JumpExtCommand>();
		result.addAll(recursiveDestinations);
		return result;	
	}
	
	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(CommandPanel p) {
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

		List<JumpExtCommand> result= new ArrayList<JumpExtCommand>();
		result.addAll(firstLevelDestinations);
		return result;
	}	
	
	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(DialogPanel p) {
		// Un dialog panel può contenere jump solo nel command panel
		if (p.getCommands()!=null)
			return getAllPossibleExtJumps(p.getCommands());
		else
			return new ArrayList<JumpExtCommand>();
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(MultiPanel p) {
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

	/**
	 *
	 * @param w
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(Widget w) {
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

	/**
	 *
	 * @param evh
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(EventHandler evh) {
		Command a = evh.getCommand();
		if (a==null) {
			return null;
		} else{
			return getAllPossibleExtJumps(a);
		}
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(Command a) {
		if (a instanceof JumpExtCommand)
			return getAllPossibleExtJumps((JumpExtCommand)a);
		else if (a instanceof ExecCommand)
			return getAllPossibleExtJumps((ExecCommand)a);
		else if (a instanceof ChkEditStatusCommand)
			return getAllPossibleExtJumps((ChkEditStatusCommand)a);
		else if (a instanceof SequenceCommand)
			return getAllPossibleExtJumps((SequenceCommand)a);
		else
			return null;
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(JumpExtCommand a) {
		List<JumpExtCommand> ris = new ArrayList<JumpExtCommand>();
		ris.add(getAdjustedJumpExtCommand(a));
		return ris;
	}

	/**
	 * Restituisce una nuova istanza di JumpExtCommand nella quale lo static url 
	 * viene sovrascritto con il codice di accesso al runtime url provider, se 
	 * presente 
	 * @param jec
	 * @return
	 */
	public static JumpExtCommand getAdjustedJumpExtCommand(JumpExtCommand jec){
		if ( jec.getRuntimeUrlProvider() != null ) {
			String s = "${";
			s+=getAppDataKey(jec.getRuntimeUrlProvider());
			s+="}";
			JumpExtCommand currJD = GuigenFactory.eINSTANCE.createJumpExtCommand();
			currJD.setLocationCode(jec.getLocationCode());
			currJD.setStaticUrl(s);
			return currJD;
		}
		else {
			return jec;
		}
	}
	
	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(SequenceCommand a) {
		Command lastStep = a.getCommands().get(a.getCommands().size()-1);
		return getAllPossibleExtJumps(lastStep);
	}

	/**
	 *
	 * @param ar
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(CommandOutcome ar) {
		return getAllPossibleExtJumps(ar.getCommand());
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(ExecCommand a) {
		Iterator<CommandOutcome> res_it = a.getResults().iterator();
		HashSet<JumpExtCommand> resultSet = new HashSet<JumpExtCommand>();
		while(res_it.hasNext()) {
			List<JumpExtCommand> currSubJumps = getAllPossibleExtJumps(res_it.next());
			if ( currSubJumps != null ) {
				resultSet.addAll(currSubJumps);
			}
		}
		List<JumpExtCommand> ris = new ArrayList<JumpExtCommand>();
		ris.addAll(resultSet);
		return ris;
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<JumpExtCommand> getAllPossibleExtJumps(ChkEditStatusCommand a) {
		HashSet<JumpExtCommand> resultSet = new HashSet<JumpExtCommand>();
		List<JumpExtCommand> parz1 = getAllPossibleExtJumps(a.getDoIfChanged());
		List<JumpExtCommand> parz2 = getAllPossibleExtJumps(a.getDoIfNotChanged());
		if (parz1!=null)
			resultSet.addAll(parz1);
		if (parz2!=null)
			resultSet.addAll(parz2);
		List<JumpExtCommand> ris = new ArrayList<JumpExtCommand>();
		ris.addAll(resultSet);
		return ris;
	}

	
	
	//////////////////////////////////////////////////////////////////////////////////
	// get all possible ShowDialogs

	/**
	 * Restituisce un array list di tutti i possibili salti ad altre pagine a partire da
	 * un content panel prefissato.
	 * @param cp
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(ContentPanel cp) {
		List<DialogPanel> res = new ArrayList<DialogPanel>();

		// show dialog for panels
		res.addAll(getAllPossibleShowDialogs(cp.getPanels()));

		// showdialog for DialogPanels
		for (DialogPanel dp : cp.getDialogs()) {
			res.addAll(getAllPossibleShowDialogs(dp));
		}

		return res;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(Panel p) {
		if ( p instanceof FormPanel ) {
			return getAllPossibleShowDialogs((FormPanel)p);
		} else if ( p instanceof WidgetsPanel ) {
			return getAllPossibleShowDialogs((WidgetsPanel)p);		
		} else if ( p instanceof CommandPanel ) {
			return getAllPossibleShowDialogs((CommandPanel)p);
		} else if ( p instanceof MultiPanel ) {
			return getAllPossibleShowDialogs((MultiPanel)p);
		} else if ( p instanceof DialogPanel ) {
			return getAllPossibleShowDialogs((DialogPanel)p);
		} else {
			return null;
		}
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(FormPanel p) {
		// scende in tutti i sotto pannelli
		HashSet<DialogPanel> recursiveDestinations = new HashSet<DialogPanel>();
		List<Panel> subpanels = p.getSubpanels();
		if (subpanels!=null){
			Iterator<Panel> panels_it = subpanels.iterator();
			while ( panels_it.hasNext() ) {
				List<DialogPanel> currSubShowDialogs = getAllPossibleShowDialogs(panels_it.next());
				if ( currSubShowDialogs != null ) {
					recursiveDestinations.addAll(currSubShowDialogs);
				}
			}
		}
		
		List<DialogPanel> result = new ArrayList<DialogPanel>();
		result.addAll(recursiveDestinations);
		return result;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(WidgetsPanel p) {
		HashSet<DialogPanel> recursiveDestinations = new HashSet<DialogPanel>();
		if ( p.getWidgets() != null ) {
			for (Widget w : p.getWidgets()) {
				List<DialogPanel> currSubShowDialogs = getAllPossibleShowDialogs(w);
				if ( currSubShowDialogs != null ) {
					recursiveDestinations.addAll(currSubShowDialogs);
				}
			}
		}
		
		List<DialogPanel> result = new ArrayList<DialogPanel>();
		result.addAll(recursiveDestinations);
		return result;
	}
	
	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(CommandPanel p) {
		HashSet<DialogPanel> firstLevelDestinations = new HashSet<DialogPanel>();
		List<Widget> widgets = p.getWidgets();
		if ( widgets != null ) {
			Iterator<Widget> widgets_it = widgets.iterator();
			while ( widgets_it.hasNext() ) {
				List<DialogPanel> currSubShowDialogs = getAllPossibleShowDialogs(widgets_it.next());
				if ( currSubShowDialogs != null ) {
					firstLevelDestinations.addAll(currSubShowDialogs);
				}
			}
		}

		List<DialogPanel> result = new ArrayList<DialogPanel>();
		result.addAll(firstLevelDestinations);
		return result;
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(DialogPanel p) {
		// Un DialogPanel può contenere showDialog solo nel command panel (ha senso?)
		if ( p.getCommands() != null ) {
			return getAllPossibleShowDialogs(p.getCommands());
		} else {
			return new ArrayList<DialogPanel>();
		}
	}

	/**
	 *
	 * @param p
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(MultiPanel p) {
		// scende in tutti i sotto pannelli
		HashSet<DialogPanel> recursiveDestinations = new HashSet<DialogPanel>();
		List<Panel> subpanels = p.getPanels();
		if ( subpanels != null ) {
			Iterator<Panel> panels_it = subpanels.iterator();
			while ( panels_it.hasNext() ) {
				List<DialogPanel> currSubShowDialogs = getAllPossibleShowDialogs(panels_it.next());
				if  ( currSubShowDialogs != null ) {
					recursiveDestinations.addAll(currSubShowDialogs);
				}
			}
		}
		List<DialogPanel> result = new ArrayList<DialogPanel>();
		result.addAll(recursiveDestinations);
		return result;
	}

	/**
	 *
	 * @param w
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(Widget w) {
		List<EventHandler> eventHandlers = w.getEventHandlers();
		Iterator<EventHandler> evh_it = eventHandlers.iterator();

		HashSet<DialogPanel> resultSet = new HashSet<DialogPanel>();
		while ( evh_it.hasNext() ) {
			List<DialogPanel> currSubShowDialogs = getAllPossibleShowDialogs(evh_it.next());
			if ( currSubShowDialogs != null ) {
				resultSet.addAll(currSubShowDialogs);
			}
		}
		List<DialogPanel> result = new ArrayList<DialogPanel>();
		result.addAll(resultSet);
		return result;
	}

	/**
	 *
	 * @param evh
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(EventHandler evh) {
		Command a = evh.getCommand();
		if ( a == null ) {
			return null;
		} else {
			return getAllPossibleShowDialogs(a);
		}
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(Command a) {
		if ( a instanceof ShowDialogCommand ) {
			return getAllPossibleShowDialogs((ShowDialogCommand)a);
		} else if ( a instanceof ExecCommand ) {
			return getAllPossibleShowDialogs((ExecCommand)a);
		}
		  else if ( a instanceof ChkEditStatusCommand ) {
				return getAllPossibleShowDialogs((ChkEditStatusCommand)a);
		} else if ( a instanceof SequenceCommand ) {
			return getAllPossibleShowDialogs((SequenceCommand)a);
		} else {
			return null;
		}
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(ShowDialogCommand a) {
		List<DialogPanel> ris = new ArrayList<DialogPanel>();
		ris.add(a.getDialog());
		return ris;
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(SequenceCommand a) {
		Command lastStep = a.getCommands().get(a.getCommands().size()-1);
		return getAllPossibleShowDialogs(lastStep);
	}

	/**
	 *
	 * @param ar
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(CommandOutcome ar) {
		return getAllPossibleShowDialogs(ar.getCommand());
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(ExecCommand a) {
		Iterator<CommandOutcome> res_it = a.getResults().iterator();
		HashSet<DialogPanel> resultSet = new HashSet<DialogPanel>();
		while ( res_it.hasNext() ) {
			List<DialogPanel> currSubShowDialogs = getAllPossibleShowDialogs(res_it.next());
			if ( currSubShowDialogs != null ) {
				resultSet.addAll(currSubShowDialogs);
			}
		}
		
		List<DialogPanel> ris = new ArrayList<DialogPanel>();
		ris.addAll(resultSet);
		return ris;
	}	
	
	
	/**
	 *
	 * @param a
	 * @return
	 */
	public static List<DialogPanel> getAllPossibleShowDialogs(ChkEditStatusCommand a) {
		HashSet<DialogPanel> resultSet = new HashSet<DialogPanel>();
		List<DialogPanel> parz1 = getAllPossibleShowDialogs(a.getDoIfChanged());
		List<DialogPanel> parz2 = getAllPossibleShowDialogs(a.getDoIfNotChanged());
		if ( parz1 != null ) {
			resultSet.addAll(parz1);
		}
		if ( parz2 != null ) {
			resultSet.addAll(parz2);
		}
		
		List<DialogPanel> ris = new ArrayList<DialogPanel>();
		ris.addAll(resultSet);
		return ris;
	}


	//////////////////////////////////////////////////////////////////////////////////
	// get all Event Source

	/**
	 *
	 * @param cp
	 * @return
	 */
	public static List<Widget> getAllEventSourceWidgets(ContentPanel cp) {
		List<Widget> allWidgetsInCP = findAllWidgetsInContentPanel(cp);
		Iterator<Widget> w_it = allWidgetsInCP.iterator();
		List<Widget> result = new ArrayList<Widget>();
		while ( w_it.hasNext() ) {
			Widget currW = w_it.next();
			if ( currW.getEventHandlers() != null && currW.getEventHandlers().size() > 0 ) {
				result.add(currW);
			}
		}
		return result;
	}

	/**
	 *
	 * @param mb
	 * @return
	 */
	public static List<Menu> getAllEventSourceMenus(Menubar mb) {
		List<Menu> result = new ArrayList<Menu>();
		Iterator<Menu> m_it = mb.getTopLevelMenu().iterator();
		while ( m_it.hasNext() ) {
			Menu currMnu = m_it.next();
			List<Menu> currMenus = getAllEventSourceMenus(currMnu);
			result.addAll(currMenus);
		}
		return result;
	}

	/**
	 *
	 * @param m
	 * @return
	 */
	public static List<Menu> getAllEventSourceMenus(Menu m) {
		List<Menu> result = new ArrayList<Menu>();
		if ( m.getEventHandler() != null ) {
			result.add(m);
		}
		Iterator<Menu> it_m = m.getSubmenu().iterator();
		while ( it_m.hasNext() ) {
			Menu currSM = it_m.next();
			result.addAll(getAllEventSourceMenus(currSM));
		}
		return result;
	}

	/**
	 * 
	 * @param name
	 * @param menubar
	 * @return
	 */
	public static boolean isMenuNameUnique(String name, Menubar menubar){
		if (isNullOrEmpty(name))
			return true;
		else{
			int nOccurs = 0;
			Iterator<Menu> m_it = menubar.getTopLevelMenu().iterator();
			while (m_it.hasNext()) {
				Menu menu = (Menu) m_it.next();
				nOccurs+=countOccurs(name,menu);
			}
			return nOccurs==1; // 1 ed 1 sola occorrenza = OK
		}
	}

	/**
	 * 
	 * @param name
	 * @param menu
	 * @return
	 */
	private static int countOccurs(String name, Menu menu) {
		int nOccurs=0;
		if ( menu.getName().equals(name) ) {
			nOccurs++;
		}
		
		Iterator<Menu> smenu_it = menu.getSubmenu().iterator();
		while (smenu_it.hasNext()) {
			Menu submenu = (Menu) smenu_it.next();
			nOccurs+=countOccurs(name, submenu);
		}
		return nOccurs;
	}
	//////////////////////////////////////////////////////////////////////////////////

	/**
	 *
	 * @param rb
	 * @return
	 */
	public static String getFixedRadioButtonList(RadioButtons rb) {
		String list = "";
		if ( rb.getRadio() != null && rb.getRadio().size() > 0 ) {
			Iterator<RadioButton> it = rb.getRadio().iterator();
			while ( it.hasNext() ) {
				RadioButton currRadio = it.next();
				String currRadioString = getFixedRadioButtonList(currRadio);
				list += currRadioString + ",";
			}
			list = list.substring(0, list.length()-1); // tolgo ultimo ","
			return list;
		}
		else {
			return ""; // non si dovrebbe mai essere in questo caso (check sul modello)
		}
	}

	/**
	 *
	 * @param rb
	 * @return
	 */
	public static String getFixedRadioButtonList(RadioButton rb) {
		return "'" + (!isNullOrEmpty(rb.getValue()) ? rb.getValue() : rb.getName()) + "':'" + rb.getLabel() + "'";
	}

	//////////////////////

	/**
	 *
	 * @param model
	 * @return
	 */
	public static List<ApplicationData> getAllApplicationData(GUIModel model) {
		return getAllApplicationData(model.getAppDataDefs());
	}

	/**
	 *
	 * @param appDataDefs
	 * @return
	 */
	public static List<ApplicationData> getAllApplicationData(ApplicationDataDefs appDataDefs) {
		List<ApplicationData> res = new ArrayList<ApplicationData>();

		// ApplicationData a livello ApplicationDataDefs
		res.addAll(appDataDefs.getAppData());

		// ApplicationData a livello package (AppDataGroup)
		for (AppDataGroup group : appDataDefs.getGroups()) {
			res.addAll(group.getAppData());
		}

		for (AppDataGroup extgroup : appDataDefs.getExtGroups()) {
			res.addAll(extgroup.getAppData());
		}
		
		return res;
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

	/**
	 *
	 * @param w
	 * @return
	 */
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

	/**
	 *
	 * @param eh
	 * @return
	 */
	public static ArrayList<ApplicationData> findAllActionScopedAppData(EventHandler eh){
		return findAllActionScopedAppData(eh.getCommand());
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	public static ArrayList<ApplicationData> findAllActionScopedAppData(Command a){
		if (a instanceof SequenceCommand)
			return findAllActionScopedAppData((SequenceCommand)a);
		else if (a instanceof ExecCommand)
			return findAllActionScopedAppData((ExecCommand)a);
		else if (a instanceof ChkEditStatusCommand)
			return findAllActionScopedAppData((ChkEditStatusCommand)a);
		else
			return null;
	}

	/**
	 *
	 * @param mb
	 * @return
	 */
	public static List<ApplicationData> findAllActionScopedAppDataInMenubar(Menubar mb){
		List<ApplicationData> result = new ArrayList<ApplicationData>();
		Iterator<Menu> it_m = mb.getTopLevelMenu().iterator();
		while(it_m.hasNext()){
			Menu currMnu =it_m.next();
			List<ApplicationData> parz = findAllActionScopedAppData(currMnu);
			if (parz!=null) {
				result.addAll(parz);
			}
		}
		return result;
	}

	/**
	 *
	 * @param m
	 * @return
	 */
	public static List<ApplicationData> findAllActionScopedAppData(Menu m){
		List<ApplicationData> result = new ArrayList<ApplicationData>();
		
		if (m.getEventHandler()!=null){
			List<ApplicationData> parz = findAllActionScopedAppData(m.getEventHandler());
			if (parz!=null) {
				result.addAll(parz);
			}
		}
		// submenu
		Iterator<Menu> it_sm = m.getSubmenu().iterator();
		while(it_sm.hasNext()){
			Menu currSM = it_sm.next();
			List<ApplicationData> parz = findAllActionScopedAppData(currSM);
			if (parz!=null) {
				result.addAll(parz);
			}
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
		if (a.getPostExecData()!=null) {
			ris.addAll(a.getPostExecData());
		}
		Iterator<CommandOutcome> a_it = a.getResults().iterator();
		while(a_it.hasNext()){
			ArrayList<ApplicationData> currAppDataList = findAllActionScopedAppData(a_it.next());
			if (currAppDataList!=null) {
				ris.addAll(currAppDataList);
			}
		}
		return ris;
	}

	/**
	 * restituisce gli app data diretti e quelli di eventuali exec action interne ai vari rami di result
	 * @param a
	 * @return
	 */
	public static ArrayList<ApplicationData> findAllActionScopedAppData(ChkEditStatusCommand a){
		ArrayList<ApplicationData> ris = new ArrayList<ApplicationData>();
		ArrayList<ApplicationData> r1 = findAllActionScopedAppData(a.getDoIfChanged());
		ArrayList<ApplicationData> r2 = findAllActionScopedAppData(a.getDoIfNotChanged());
		if (r1 != null)
			ris.addAll(r1);
		if(r2 != null)
			ris.addAll(r2);
		return ris;
	}

	/**
	 *
	 * @param r
	 * @return
	 */
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
			if (currAppDataList!=null) {
				ris.addAll(currAppDataList);
			}
		}
		return ris;
	}

	

	///////////////////////////////

	/**
	 * 
	 * @param mb
	 * @return
	 */
	public static List<CustomSecurityConstraint> getAllCustomSecConstraints4Menus(Menubar mb){
		ArrayList<CustomSecurityConstraint> result = new ArrayList<CustomSecurityConstraint>();
		Iterator<Menu> it_m = mb.getTopLevelMenu().iterator();
		while(it_m.hasNext()){
			List<CustomSecurityConstraint> currRis = getAllCustomSecConstraints4Menu(it_m.next());
			result.addAll(currRis);
		}
		return result;
	}

	/**
	 * 
	 * @param m
	 * @return
	 */
	public static List<CustomSecurityConstraint> getAllCustomSecConstraints4Menu(Menu m){
		ArrayList<CustomSecurityConstraint> result = new ArrayList<CustomSecurityConstraint>();
		if(m.getSecurityConstraints().size()>0){
			Iterator<UISecurityConstraint> it_sc = m.getSecurityConstraints().iterator();
			while(it_sc.hasNext()){
				UISecurityConstraint currSC = it_sc.next();
				if (currSC instanceof CustomSecurityConstraint) {
					result.add((CustomSecurityConstraint)currSC);
				}
			}
		}
		
		Iterator<Menu> it_subm = m.getSubmenu().iterator();
		while(it_subm.hasNext()){
			List<CustomSecurityConstraint> currRis = getAllCustomSecConstraints4Menu(it_subm.next());
			result.addAll(currRis);
		}
		
		return result;
	}


	/**
	 * restituisce la stringa OGNL per il value del data widget.
	 * Se il widget ha un app data binding viene referenziato quello, altrimenti
	 * viene associato semplicemente alla proerty della action corrispondente
	 * @param w
	 * @return
	 */
	public static String getOGNLForWidgetValue(DataWidget w, String contextPrefix, PDefUseConfig pduConf){
		if (w.getDatabinding()!=null){
			AppDataBinding binding = w.getDatabinding();
			//  [AM] sostituzione eventuale  del mapping per PanelDefUse
			binding = getResolvedAppDatabinding(binding, pduConf);
			if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_ACTION)){
				return ""+getFullBindingPath(binding)+"";
			}
			else if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_SESSION)||
					binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.SAME_PAGE)){
				return ""+getFullBindingPath(binding)+"";  // unificato
			}
			else {
				throw new IllegalArgumentException("Errore di generazione: tipo lifetime extent non supportato in "+w);
			}
		}
		else {
			return getWidgetName(w, contextPrefix);
		}
	}


	/**
	 * Risolve una eventuale sovrascrittura dell'appdata binding se predente un PDefUseParam.
	 * @param original il binding originale (direttamente colegato al widget, che nel caso di
	 * pannelli inclusi punta ad un appdata fittizio)
	 * @param pduConf la configurazione (opzionale) dell'eventuale PanelDefUse che referenzia il 
	 * PanelDef che definisce il pannello che contiene widget... 
	 * @return il binding definito dalla configurazione se il widget &egrave; un widget appartenente ad 
	 * un panel def, il binding originario se il widget è un widget direttamente incluso in un 
	 * ContentPanel (nel qual caso pduConf è nullo) 
	 */
	public static AppDataBinding getResolvedAppDatabinding(AppDataBinding original, PDefUseConfig pduConf) {
		//
//		System.out.println("getResolvedAppDatabinding");
//		if (original != null){
//			System.out.println("original:"+original.getAppData().getName()+"."+original.getPath());
//		}
		///
		if (pduConf == null)
			return original;
		else {
			AppDataMappingPDefVal mapping = findAppDataMappingInConfig(original.getAppData(), pduConf);
			if (mapping==null){
				///
//				System.out.println("rewrite del binding non trovata");
				///
				return original;
			}
			else{
				ApplicationData actualAD = mapping.getActualAppData();
				///
//				System.out.println("actualAD="+actualAD.getName());
				///
				AppDataBinding newADB  = GuigenFactory.eINSTANCE.createAppDataBinding();
				newADB.setPath(original.getPath());
				newADB.setAppData(actualAD);
				return newADB;
			}
		}
	}

	public static AppDataMappingPDefVal findAppDataMappingInConfig(ApplicationData appData, PDefUseConfig pduConf){
		///
//		System.out.println("findAppDataMappingInConfig:"+appData.getName()+","+pduConf.getParamValues().size());
		///
		if (pduConf != null){
			Iterator<PDefParamVal> it_pduc = pduConf.getParamValues().iterator();
			while (it_pduc.hasNext()) {
				PDefParamVal currParamVal = it_pduc.next();
				///
//				System.out.println("currParamVal:"+currParamVal);
				///
				if (currParamVal.getParam()!=null && currParamVal.getParam() instanceof AppDataMappingParam){
					AppDataMappingParam currParam = (AppDataMappingParam)(currParamVal.getParam());
					///
//					System.out.println("currParamVal: originalAppData="+currParam.getDefAppData().getName());
//					System.out.println("currParamVal: actual="+((AppDataMappingPDefVal)currParamVal).getActualAppData().getName());
					///

					if (currParam.getDefAppData().equals(appData))
						return (AppDataMappingPDefVal)currParamVal;
				}
			}
			// se non trovo niente
			return null;
		}
		return null;
	}
	
	
	/**
	 *
	 * @param w
	 * @return
	 */
	public static String getOGNLForWidgetMultiValue(MultiDataWidget w, String contextPrefix, PDefUseConfig pduConf){
		if (w.getMultiDataBinding()!=null){
			AppDataBinding binding = w.getMultiDataBinding();
			// [AM] risoluzione eventuale del mapping
			binding = getResolvedAppDatabinding(binding, pduConf);
			if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_ACTION)){
				return ""+getFullBindingPath(binding)+"";
			}
			else if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_SESSION)||
					binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.SAME_PAGE)){
				return ""+getFullBindingPath(binding)+""; // unificato
			}
			else {
				throw new IllegalArgumentException("Errore di generazione: tipo lifetime extent non supportato in "+w);
			}
		}
		else {
			return getWidgetName(w, contextPrefix);
		}
	}


	/**
	 *
	 * @param w
	 * @return
	 */
	public static String getOGNLForColumnMultiValue(Column c, PDefUseConfig pduConf){
		if (c.getMultiDataBinding()!=null){
			AppDataBinding binding = c.getMultiDataBinding();
			// [AM] risoluzione eventuale del mapping
			binding = getResolvedAppDatabinding(binding, pduConf);
			if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_ACTION)){
				return ""+getFullBindingPath(binding)+"";
			}
			else if (binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.USER_SESSION)||
					binding.getAppData().getLifetimeExtent().equals(DataLifetimeType.SAME_PAGE)){
				return ""+getFullBindingPath(binding)+""; // unificato
			}
			else {
				throw new IllegalArgumentException("Errore di generazione: tipo lifetime extent non supportato in "+c);
			}
		}
		else {
			throw new IllegalArgumentException("multibinding della colonna nullo");
		}
	}
	
	/**
	 * Restituisce il nome del widget. E' utilizzabile in molti contesti
	 * Ovunque nel generatore si faccia riferimento al nome del widget con queto pattern
	 * bisogna effettuare una chiamata a questo metodo.
	 *
	 * @param w Il widget
	 * @param contextPrefix (opzionale) il prefisso che serve a rendere univoco il nome.
	 * Serve per gestire il caso di widget contenuto in un PanelDef e indirettamente referenziato
	 * da un PanelDefUse (STDMDD-360)
	 * @return  Il nome del widget
	 * @author [DM][AM]
	 */
	public static String getWidgetName(Widget w, String contextPrefix) {
		if (contextPrefix==null)
			contextPrefix="";
		return "widg_" + contextPrefix+w.getName();
	}


	public static String getFullID(Widget w, String contextPrefix){
		return contextPrefix == null || contextPrefix.length()==0 ? w.getName() : contextPrefix+w.getName();
	}

	
	public static String getFullID(Panel p, String contextPrefix){
		return contextPrefix == null || contextPrefix.length()==0 ? p.getName() : contextPrefix+p.getName();
	}

	
	/**
	 *
	 * @param binding
	 * @return
	 */
	public static String getFullBindingPath(AppDataBinding binding){
		ApplicationData data = binding.getAppData();
		String path = binding.getPath();
		String ris = ""+getAppDataKey(data);
		if (path!=null && path.length()>0)
			ris+=("."+path);
		return ris;
	}


	/**
	 * chiave dell'app data quando salvato in sessione
	 * @param ad
	 * @return
	 */
	public static String getAppDataKey(ApplicationData ad){
		return "appData"+ad.getName();
	}


	/**
	 * nome della property associata all'appdata quando viene inserito nella action
	 * @param ad
	 * @return
	 */
	public static String getAppDataPropertyName(ApplicationData ad){
		return "appData"+ad.getName();
	}

	//////////////////////////////////////
	
	/**
	 * Risolve una eventuale sovrascrittura dell'actor se predente un PDefUseParam.
	 * @param original l'actor originale 
	 * @param pduConf la configurazione (opzionale) dell'eventuale PanelDefUse che referenzia il 
	 * PanelDef che definisce il pannello che contiene widget... 
	 * @return l'actor definito dalla configurazione se il widget è un widget appartenente ad 
	 * un panel def, l'acotr originario se il widget è un widget direttamente incluso in un 
	 * ContnetPanel (nel qual caso pduConf è nullo) 
	 */
	public static Actor getResolvedActor(Actor original, PDefUseConfig pduConf){
		//
//		System.out.println("getResolvedactor");
//		if (original != null){
//			System.out.println("original:"+original.getAppData().getName()+"."+original.getPath());
//		}
		///
		if (pduConf == null)
			return original;
		else {
			ActorMappingPDefVal mapping = findActorMappingInConfig(original, pduConf);
			if (mapping==null){
				///
//				System.out.println("rewrite del binding non trovata");
				///
				return original;
			}
			else{
				Actor actualAct = mapping.getActualActor();
				///
//				System.out.println("actualAD="+actualAD.getName());
				///
				return actualAct;
			}
		}
	}

	public static ActorMappingPDefVal findActorMappingInConfig(Actor actor, PDefUseConfig pduConf){
		///
//		System.out.println("findAppDataMappingInConfig:"+appData.getName()+","+pduConf.getParamValues().size());
		///
		if (pduConf != null){
			Iterator<PDefParamVal> it_pduc = pduConf.getParamValues().iterator();
			while (it_pduc.hasNext()) {
				PDefParamVal currParamVal = it_pduc.next();
				///
//				System.out.println("currParamVal:"+currParamVal);
				///
				if (currParamVal.getParam()!=null && currParamVal.getParam() instanceof ActorMappingParam){
					ActorMappingParam currParam = (ActorMappingParam)(currParamVal.getParam());
					///
//					System.out.println("currParamVal: originalAppData="+currParam.getDefAppData().getName());
//					System.out.println("currParamVal: actual="+((AppDataMappingPDefVal)currParamVal).getActualAppData().getName());
					///

					if (currParam.getDefActor().equals(actor))
						return (ActorMappingPDefVal)currParamVal;
				}
			}
			// se non trovo niente
			return null;
		}
		return null;
	}
	
	
	/**
	 * Risolve una eventuale sovrascrittura dell'use case se predente un PDefUseParam.
	 * @param original l'use case originale 
	 * @param pduConf la configurazione (opzionale) dell'eventuale PanelDefUse che referenzia il 
	 * PanelDef che definisce il pannello che contiene widget... 
	 * @return l'use case definito dalla configurazione se il widget è un widget appartenente ad 
	 * un panel def, l'use case originario se il widget è un widget direttamente incluso in un 
	 * ContnetPanel (nel qual caso pduConf è nullo) 
	 */
	public static UseCase getResolvedUseCase(UseCase original, PDefUseConfig pduConf){
		//
//		System.out.println("getResolvedactor");
//		if (original != null){
//			System.out.println("original:"+original.getAppData().getName()+"."+original.getPath());
//		}
		///
		if (pduConf == null)
			return original;
		else {
			UCMappingPDefVal mapping = findUCMappingInConfig(original, pduConf);
			if (mapping==null){
				///
//				System.out.println("rewrite del binding non trovata");
				///
				return original;
			}
			else{
				UseCase actualUC = mapping.getActualUseCase();
				///
//				System.out.println("actualAD="+actualAD.getName());
				///
				return actualUC;
			}
		}
	}

	public static UCMappingPDefVal findUCMappingInConfig(UseCase uc, PDefUseConfig pduConf){
		///
//		System.out.println("findAppDataMappingInConfig:"+appData.getName()+","+pduConf.getParamValues().size());
		///
		if (pduConf != null){
			Iterator<PDefParamVal> it_pduc = pduConf.getParamValues().iterator();
			while (it_pduc.hasNext()) {
				PDefParamVal currParamVal = it_pduc.next();
				///
//				System.out.println("currParamVal:"+currParamVal);
				///
				if (currParamVal.getParam()!=null && currParamVal.getParam() instanceof UseCaseMappingParam){
					UseCaseMappingParam currParam = (UseCaseMappingParam)(currParamVal.getParam());
					///
//					System.out.println("currParamVal: originalAppData="+currParam.getDefAppData().getName());
//					System.out.println("currParamVal: actual="+((AppDataMappingPDefVal)currParamVal).getActualAppData().getName());
					///

					if (currParam.getDefUseCase().equals(uc))
						return (UCMappingPDefVal)currParamVal;
				}
			}
			// se non trovo niente
			return null;
		}
		return null;
	}

	
	/**
	 * Risolve una eventuale sovrascrittura dell'role se predente un PDefUseParam.
	 * @param original il role originale 
	 * @param pduConf la configurazione (opzionale) dell'eventuale PanelDefUse che referenzia il 
	 * PanelDef che definisce il pannello che contiene widget... 
	 * @return il role case definito dalla configurazione se il widget è un widget appartenente ad 
	 * un panel def, il role originario se il widget è un widget direttamente incluso in un 
	 * ContnetPanel (nel qual caso pduConf è nullo) 
	 */
	public static Role getResolvedRole(Role original, PDefUseConfig pduConf){
		//
//		System.out.println("getResolvedactor");
//		if (original != null){
//			System.out.println("original:"+original.getAppData().getName()+"."+original.getPath());
//		}
		///
		if (pduConf == null)
			return original;
		else {
			RoleMappingPDefVal mapping = findRoleMappingInConfig(original, pduConf);
			if (mapping==null){
				///
//				System.out.println("rewrite del binding non trovata");
				///
				return original;
			}
			else{
				Role actualRole = mapping.getActualRole();
				///
//				System.out.println("actualAD="+actualAD.getName());
				///
				return actualRole;
			}
		}
	}

	public static RoleMappingPDefVal findRoleMappingInConfig(Role role, PDefUseConfig pduConf){
		///
//		System.out.println("findAppDataMappingInConfig:"+appData.getName()+","+pduConf.getParamValues().size());
		///
		if (pduConf != null){
			Iterator<PDefParamVal> it_pduc = pduConf.getParamValues().iterator();
			while (it_pduc.hasNext()) {
				PDefParamVal currParamVal = it_pduc.next();
				///
//				System.out.println("currParamVal:"+currParamVal);
				///
				if (currParamVal.getParam()!=null && currParamVal.getParam() instanceof RoleMappingParam){
					RoleMappingParam currParam = (RoleMappingParam)(currParamVal.getParam());
					///
//					System.out.println("currParamVal: originalAppData="+currParam.getDefAppData().getName());
//					System.out.println("currParamVal: actual="+((AppDataMappingPDefVal)currParamVal).getActualAppData().getName());
					///

					if (currParam.getDefRole().equals(role))
						return (RoleMappingPDefVal)currParamVal;
				}
			}
			// se non trovo niente
			return null;
		}
		return null;
	}

	
	//////////////////////////////////////
	

	/**
	 *
	 * @param m
	 * @return
	 */
	public static List<Menu> getAllMenuRecursive(Menu m){
		List<Menu> result = new ArrayList<Menu>();
		result.addAll(m.getSubmenu());
		for (Menu menu : m.getSubmenu()) {
			List<Menu> currSM = getAllMenuRecursive(menu);
			result.addAll(currSM);
		}
		return result;
	}	
	

	/**
	 *
	 * @param w
	 * @return
	 * @author [DM]
	 */
	public static String getWidgetLabelFor(Widget w, String contextPrefix, PDefUseConfig pduConf) {
		if ( w instanceof DataWidget ) {
			return getOGNLForWidgetValue((DataWidget)w, contextPrefix, pduConf);
		}
		return getWidgetName(w, contextPrefix);
	}


	/**
	 * Restituisce il campo per l'editabilità di una colonna della tabella
	 * @param currCol
	 * @param table
	 * @param model
	 * @param contextPrefix
	 * @param pduConf
	 * @param theme Tema di Struts2 da utilizzare per evidenziare cella errata (STDMDD-409)
	 * @return
	 * @author [DM]
	 */
	public static String getColumnEditableField(Column currCol, Table table, GUIModel model, String contextPrefix, PDefUseConfig pduConf, String theme) {
		String res = "";
		
		// ricavo il tipo (sicuramente ComplexType) del MultiDataBinding
		Type t = ((TypedArray)table.getMultiDataBinding().getAppData().getType()).getComponentType();
		
		// ricavo il field 
		Field f = getSelectedField(null, t, currCol.getSelector());
		
		if ( f != null ) {
			// Scelta del formatter sulla base del tipo ritornato (deve essere un SimpleType) 
			if ( f.getType() instanceof SimpleType ) {
				SimpleType ft = (SimpleType) f.getType();
				// al momento gestiamo in maniera diversa solo i boolean
				// TODO: se necessario implementare altri comparatori
				if ( isBoolean(ft) ) {
					String nameResetter = "%{'__checkbox_"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"['+(#attr.row_"+table.getName()+"_rowNum - 1)+']."+currCol.getSelector()+"'}"; 
					String ckIdResetter = "%{'__checkbox_"+getOGNLForWidgetValue(table, contextPrefix, pduConf)+"_"+currCol.getSelector()+
						"_'+(#attr.row_"+table.getName()+"_rowNum - 1)}";
					String ckId = "%{'"+getWidgetName(table, contextPrefix)+"_"+currCol.getSelector()+
					"_'+(#attr.row_"+table.getName()+"_rowNum - 1)}";
					String disabled = !GenUtils.isNullOrEmpty(currCol.getEditableFlagSelector()) ? " disabled=\"%{!"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"[(#attr.row_"+table.getName()+"_rowNum - 1)]."+currCol.getEditableFlagSelector()+"}\" " : "";
					res = "<s:checkbox name=\"%{'"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"['+(#attr.row_"+table.getName()+"_rowNum - 1)+']."+currCol.getSelector()+"'}\" "+GenUtilsLayout.getCheckboxPortalStyle(model)+" "+disabled+" id=\""+ckId+"\" "+
					      (!GenUtils.isNullOrEmpty(theme) ? " theme=\"" + theme + "\"" : "") +
					      "/>";
					res+="\n";
					res+= !GenUtils.isNullOrEmpty(currCol.getEditableFlagSelector()) ? "<s:if test=\"%{"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"[(#attr.row_"+table.getName()+"_rowNum - 1)]."+currCol.getEditableFlagSelector()+"}\">" : "";
					res+= "<s:hidden name=\""+nameResetter+"\" id=\""+ckIdResetter+"\" />";
					res+= !GenUtils.isNullOrEmpty(currCol.getEditableFlagSelector()) ? "</s:if>" : "";
				} else {
					if (currCol.getMultiDataBinding()!=null){
						String disabled = !GenUtils.isNullOrEmpty(currCol.getEditableFlagSelector()) ? " disabled=\"%{!"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"[(#attr.row_"+table.getName()+"_rowNum - 1)]."+currCol.getEditableFlagSelector()+"}\" " : "";
						res = "<s:select name=\"%{'"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"['+(#attr.row_"+table.getName()+"_rowNum - 1)+']."+currCol.getSelector()+"'}\"" +
								
					          " headerKey=\"\" headerValue=\"\" "+
					          " list=\""+getOGNLForColumnMultiValue(currCol, pduConf)+"\" "+
					          disabled +
					          " listKey=\""+currCol.getMultidataKeySelector()+"\""+
					          " listValue=\""+currCol.getMultidataValueSelector()+"\""+
					          (!GenUtils.isNullOrEmpty(theme) ? " theme=\"" + theme + "\"" : "") +
					          "/>";
					}
					else if (currCol.getMultidataPropertySelector()!=null) {
						String disabled = !GenUtils.isNullOrEmpty(currCol.getEditableFlagSelector()) ? " disabled=\"%{!"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"[(#attr.row_"+table.getName()+"_rowNum - 1)]."+currCol.getEditableFlagSelector()+"}\" " : "";
						res = "<s:select name=\"%{'"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"['+(#attr.row_"+table.getName()+"_rowNum - 1)+']."+currCol.getSelector()+"'}\"" +
								
					          " headerKey=\"\" headerValue=\"\" "+
					          " list= \""+getOGNLForWidgetMultiValue(table,contextPrefix, pduConf)+"[(#attr.row_"+table.getName()+"_rowNum - 1)]."+currCol.getMultidataPropertySelector()+"\" " +
					          disabled +
					          " listKey=\""+currCol.getMultidataKeySelector()+"\""+
					          " listValue=\""+currCol.getMultidataValueSelector()+"\""+
					          (!GenUtils.isNullOrEmpty(theme) ? " theme=\"" + theme + "\"" : "") +
					          "/>";
					}
					else {
						String disabled = !GenUtils.isNullOrEmpty(currCol.getEditableFlagSelector()) ? " disabled=\"%{!"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"[(#attr.row_"+table.getName()+"_rowNum - 1)]."+currCol.getEditableFlagSelector()+"}\" " : "";
						res = "<s:textfield name=\"%{'"+getOGNLForWidgetMultiValue(table, contextPrefix, pduConf)+"['+(#attr.row_"+table.getName()+"_rowNum - 1)+']."+currCol.getSelector()+"'}\" "+disabled+" "+GenUtilsLayout.getColumnEditableTextfieldPortalStyle(model)+
						(!GenUtils.isNullOrEmpty(theme) ? " theme=\"" + theme + "\"" : "") +
						" />";
					}
				}
			}
		}		
		
		return res;
	}


	/**
	 * 
	 * @param cp
	 * @return
	 * @author [DM] STDMDD-294: gestione FileUpload
	 */
	public static boolean hasFileUpload(ContentPanel cp) {
		List<Widget> widgetsList = findAllWidgetsInContentPanel(cp);
		for (Widget widget : widgetsList) {
			if ( widget instanceof FileUpload ) {
				return true;
			}
		}
		return false;
	}

	
	/**
	 * Risolve una eventuale customizzazione di una tabella se predente un PDefUseParam.
	 * 
	 * @param table la tabella originale
	 * @param pduConf la configurazione (opzionale) dell'eventuale PanelDefUse che referenzia il 
	 *                PanelDef che definisce il pannello che contiene la tabella... 
	 * @return la nuova lista delle colonne customizzata secondo quanto definito dalla configurazione se la Table 
	 *         appartiene ad un PanelDef, la lista originaria delle colonne del ColumnModel se la tabella &egrave; direttamente 
	 *         inclusa in un ContentPanel (nel qual caso pduConf è nullo) 
	 * @author [DM] STDMDD-446
	 */
	public static List<Column> getCustomizedColumnsList(Table table, PDefUseConfig pduConf) {
		// Lista delle colonne originali
		ArrayList<Column> res = new ArrayList<Column>(table.getColumnModel().getColumns());
		
		// cerco se esiste una customizzazione per questa tabella
		TableCustomizationPDefVal cust = findTableCustomizationParamInConfig(table, pduConf);
			
		// Se c'è una customizzazione per questa tabella calcolo la nuova lista delle colonne
		if (cust != null) 
		{
			// creo due mappe di lavoro: 
			// - una LOGICA che rappresenta la posizione originale delle colonne nel ColumnModel della Table
			// - una FISICA che rappresenta la posizione attuale ricoperta dalle colonne del ColumnModel in seguito
			//     all'aggiunta di nuove colonne
			// La prima mappa non verrà mai variata 
			Map<Column, Integer> workmapLogical = new HashMap<Column, Integer>();
			Map<Column, Integer> workmapPhysical = new HashMap<Column, Integer>();
			int i = 0;
			for (Column column : table.getColumnModel().getColumns()) {				
				workmapLogical.put(column, i);   // posizione originale (logica) della colonna
				workmapPhysical.put(column, i);  // posizione attuale (fisica) della colonna
				i++;
			}
			
			// extra columns
			if (cust.getExtraCols().size() > 0) 
			{
				for (ExtraColumn extraColumn : cust.getExtraCols()) 
				{
					int originalLogicalPos = 0;
					int newLogicalPos = 0;
					int originalPhisicalPos = 0;
					int newPhisicalPos = 0;
					if (extraColumn.getInsertAfter() != null) 
					{
						// colonna da inserire in una posizione specificata
						originalLogicalPos = workmapLogical.get(extraColumn.getInsertAfter()); // posizione logica della colonna dopo la quale					
						                                                                       // andrà inserita la nuova colonna
						
						// devo tradurre la posizione logica in posizione fisica 
						// (eventuali colonne già aggiunte dopo questa colonna in iterazioni precedenti)
						// quindi cerco la colonna che occupa la posizione logica che dovrebbe essere occupata
						// dalla nuova tabella
						newLogicalPos = originalLogicalPos + 1;
					} 
					else
					{
						// colonna da inserire all'inizio, prima di tutte le colonne						
						newLogicalPos = 0;
					}
					
					// devo tradurre la posizione logica in posizione fisica (eventuali colonne aggiunte)
					// quindi cerco la colonna che occupa la posizione logica che dovrebbe essere occupata 							
					Column cc = null;
					Integer p1 = null;
					for (Column c1 : workmapLogical.keySet()) {
						p1 = workmapLogical.get(c1);
						if (p1.equals(newLogicalPos) ) {
							cc = c1;
							break;
						}
					}
					
					
					// recupero la posizione fisica della colonna : sarà la posizione fisica della nuova colonna
					if (cc != null) {
						// colonna trovata 
						originalPhisicalPos = workmapPhysical.get(cc);
					} else {
						// se non trovo l'elemento successivo allora sto aggiungendo DOPO l'ultimo elemento
						// quindi in ultima posizione
						originalPhisicalPos = res.size();
					}
					
					
					// inserisco la colonna nella nuova posizione nella lista finale
					// (le altre slittano indietro automaticamente)
					res.add(originalPhisicalPos, extraColumn);
					
					// devo modificare le posizioni fisiche di tutte le colonne 
					// successive a questa nuova, ovvero che hanno una posizione logica
					// uguale o maggiore di questa
					for (Column c2 : workmapPhysical.keySet()) {
						if (workmapPhysical.get(c2) >= originalPhisicalPos) {
							// aumento di 1 la posizione fisica delle colonne
							newPhisicalPos = workmapPhysical.get(c2) + 1;
							workmapPhysical.put(c2, newPhisicalPos);
						}
					}	
				}
			}

			
			// hidden columns: rimuove le colenne dichiarate hidden
			if ( cust.getHiddenCols().size() > 0) {
				for (Column hiddenColumn : cust.getHiddenCols()) {
					res.remove(hiddenColumn);
				}

			}
		}

		return res;
	}
	
	
	public static TableCustomizationPDefVal findTableCustomizationParamInConfig(Table table, PDefUseConfig pduConf) {
		TableCustomizationPDefVal res = null;
		if (pduConf != null) {
			for (PDefParamVal currParamVal : pduConf.getParamValues()) {
				if (currParamVal.getParam() != null && currParamVal.getParam() instanceof TableCustomizationParam) {
					TableCustomizationParam currParam = (TableCustomizationParam)(currParamVal.getParam());
					if (currParam.getBaseTable().equals(table)) {
						res = (TableCustomizationPDefVal)currParamVal;
					}
				}
			}
		}
		return res;
	}
	
	
	public static String extractLabelKey(String label) {
		return label.substring(0, label.indexOf('='));
	}
	
	
	//// Elenco pannelli in un ContnetPanel per restrizione choice list
	public static ArrayList<Panel> getAllChildPanels(ContentPanel cp){
		if (cp.getPanels()!=null)
			return getAllChildPanels(cp.getPanels());
		else
			return new ArrayList<Panel>();
	}
	
	//// Elenco pannelli in un PanelDef (non PDefUse!!) per restrizione choice list
	public static ArrayList<Panel> getAllChildPanels(PanelDef pdef){
		if (pdef.getPanel()!=null)
			return getAllChildPanels(pdef.getPanel());
		else
			return new ArrayList<Panel>();
	}
	
	public static ArrayList<Panel> getAllChildPanels(Panel p){
		ArrayList<Panel> ris = new ArrayList<Panel>();
		ris.add(p);
		if (p instanceof FormPanel){
			Iterator<Panel> it_p = ((FormPanel)p).getSubpanels().iterator();
			while (it_p.hasNext()) {
				Panel currSubp = (Panel) it_p.next();
				ris.addAll(getAllChildPanels(currSubp)); // mai nullo!
			}
		}
		else if (p instanceof MultiPanel){
			Iterator<Panel> it_p = ((MultiPanel)p).getPanels().iterator();
			while (it_p.hasNext()) {
				Panel currSubp = (Panel) it_p.next();
				ris.addAll(getAllChildPanels(currSubp)); // mai nullo!
			}
		}
		// negli altri casi non ci sono sottopannelli e nel PDefUse non scendo
		return ris;
	}
	
	
	//// TABS
	
	public static ArrayList<TabSetPanel> getAllTabSets(ContentPanel p){
//		System.out.println("getAllTabsets "+p);
		if (p.getPanels()!=null)
			return getAllTabSets(p.getPanels());
		else
			return new ArrayList<TabSetPanel>();
	}
	
	public static ArrayList<TabSetPanel> getAllTabSets(Panel p){
//		System.out.println("getAllTabsets "+p);
		ArrayList<TabSetPanel> ris = new ArrayList<TabSetPanel>();
		if (p instanceof FormPanel){
			ris.addAll(getAllTabSets((FormPanel)p));
		}
		else if(p instanceof TabSetPanel){
			ris.addAll(getAllTabSets((TabSetPanel)p));
		}
		else if(p instanceof WizardPanel){
			ris.addAll(getAllTabSets((WizardPanel)p));
		}
		else if (p instanceof MultiPanel){
			ris.addAll(getAllTabSets((MultiPanel)p));
		}
		// gli altri casi non aggiungono tabset
		return ris;
	}

	public static ArrayList<TabSetPanel> getAllTabSets(FormPanel p){
//		System.out.println("getAllTabsets "+p);
		ArrayList<TabSetPanel> ris = new ArrayList<TabSetPanel>();
		Iterator<Panel> p_it = p.getSubpanels().iterator();
		while (p_it.hasNext()) {
			Panel panel = (Panel) p_it.next();
			ris.addAll(getAllTabSets(panel));
		}
		return ris;
	}
	
	public static ArrayList<TabSetPanel> getAllTabSets(TabSetPanel p){
//		System.out.println("getAllTabsets "+p);
		ArrayList<TabSetPanel> ris = new ArrayList<TabSetPanel>();
		Iterator<Panel> p_it = p.getPanels().iterator();
		while (p_it.hasNext()) {
			Panel panel = (Panel) p_it.next();
			ris.addAll(getAllTabSets(panel));
		}
		ris.add(p);
		return ris;
	}
	
	public static ArrayList<TabSetPanel> getAllTabSets(WizardPanel p){
//		System.out.println("getAllTabsets "+p);
		ArrayList<TabSetPanel> ris = new ArrayList<TabSetPanel>();
		Iterator<Panel> p_it = p.getPanels().iterator();
		while (p_it.hasNext()) {
			Panel panel = (Panel) p_it.next();
			ris.addAll(getAllTabSets(panel));
		}
		return ris;
	}
	
	public static ArrayList<TabSetPanel> getAllTabSets(MultiPanel p){
//		System.out.println("getAllTabsets "+p);
		ArrayList<TabSetPanel> ris = new ArrayList<TabSetPanel>();
		Iterator<Panel> p_it = p.getPanels().iterator();
		while (p_it.hasNext()) {
			Panel panel = (Panel) p_it.next();
			ris.addAll(getAllTabSets(panel));
		}
		return ris;
	}
	
	
	////////////////////////////////////////////////////////////////////////
	///// Lista dei panel def use referenziati in un contentPanel
	public static List<PanelDefUse> getAllPanelDefUses(ContentPanel cp) {
		List<PanelDefUse> ris = new ArrayList<PanelDefUse>();
		ris = getAllPanelDefUses(cp.getPanels());
		return ris;
	}
	
	private static List<PanelDefUse> getAllPanelDefUses(Panel p) {
		List<PanelDefUse> ris = new ArrayList<PanelDefUse>();
		if (p instanceof FormPanel){
			FormPanel fp = (FormPanel)p;
			Iterator<Panel> it_subp = fp.getSubpanels().iterator();
			Panel currP = null;
			while(it_subp.hasNext()){
				currP = it_subp.next();
				ris.addAll(getAllPanelDefUses(currP));
			}
		}
		else if (p instanceof MultiPanel){
			MultiPanel mp = (MultiPanel)p;
			Iterator<Panel> it_items = mp.getPanels().iterator();
			Panel currP = null;
			while(it_items.hasNext()){
				currP = it_items.next();
				ris.addAll(getAllPanelDefUses(currP));
			}
		}
		else if (p instanceof PanelDefUse){
			ris.add((PanelDefUse)p);
		}
		
		return ris;
	}


	////////////////////////////////////////////////////////////////////////////////////////////////////
	// GESTIONE DEI TIPI DI DATO

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

	/**
	 * 
	 * @param javaCompType
	 * @return
	 */
	public static Class getTypedArrayClass(Class javaCompType){
		Object dummyArray = Array.newInstance(javaCompType, 0);
		return dummyArray.getClass();
	}

	/**
	 * 
	 * @param name
	 * @param code
	 * @param nillable
	 * @return
	 */
	public static SimpleType createDT(String name, SimpleTypeCodes code, boolean nillable){
		SimpleType dt = GuigenFactory.eINSTANCE.createSimpleType();
		dt.setName(name);
		dt.setCode(code);
		dt.setNillable(nillable);
		return dt;
	}

	/**
	 * 
	 * @param name
	 * @param dt
	 * @return
	 */
	public static it.csi.mddtools.guigen.TypedArray createTA(String name,SimpleType dt){
		it.csi.mddtools.guigen.TypedArray ta = GuigenFactory.eINSTANCE.createTypedArray();
		ta.setName(name);
		ta.setComponentType(dt);
		return ta;
	}

	/**
	 * 
	 * @param name
	 * @param dt
	 * @return
	 */
	public static it.csi.mddtools.guigen.TypedArray createTA(String name,ComplexType dt){
		it.csi.mddtools.guigen.TypedArray ta = GuigenFactory.eINSTANCE.createTypedArray();
		ta.setName(name);
		ta.setComponentType(dt);
		return ta;
	}

	/**
	 * 
	 * @param model
	 * @return
	 */
	public static List<Type> getAllTypes(GUIModel model) {
		return getAllTypes(model.getTypedefs());
	}

	/**
	 * 
	 * @param typedef
	 * @return
	 */
	public static List<Type> getAllTypes(Typedefs typedef) {
		List<Type> res = new ArrayList<Type>();

		// Tipi a livello di Typedefs
		res.addAll(typedef.getTypes());

		// Tipi a livello di package (Ty)
		for (TypeNamespace ns : typedef.getNamespaces()) {
			res.addAll(ns.getTypes());
		}

		for (TypeNamespace extns : typedef.getExtNamespaces()) {
			res.addAll(extns.getTypes());
		}
		return res;
	}

	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isNumeric(SimpleType t) {
		return isInteger(t) || isDecimal(t);
	}
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isInteger(SimpleType t) {
		return t.getCode() == SimpleTypeCodes.INT || t.getCode() == SimpleTypeCodes.LONG;
	}	
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isDecimal(SimpleType t) {
		return t.getCode() == SimpleTypeCodes.DOUBLE || t.getCode() == SimpleTypeCodes.FLOAT;
	}
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isString(SimpleType t) {
		return t.getCode() == SimpleTypeCodes.STRING;
	}
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isDate(SimpleType t) {
		return t.getCode() == SimpleTypeCodes.DATE || t.getCode() == SimpleTypeCodes.DATETIME;
	}	
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isHour(SimpleType t) {
		return t.getCode() == SimpleTypeCodes.HOURS;
	}	
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isDateOrHour(SimpleType t) {
		return isDate(t) || isHour(t);
	}		

	/**
	 * 
	 * @param t
	 * @return
	 */
	public static boolean isBoolean(SimpleType t) {
		return t.getCode() == SimpleTypeCodes.BOOLEAN;
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// INTROSPECTION SUI TIPI DI DATO NEI SELETTORI
	
	/**
	 * 
	 * @param col
	 * @param table
	 * @return
	 */
	public static String getColumnFormatter(Column col, Table table) {
		String res = "";
		
		// ricavo il tipo (sicuramente ComplexType) del MultiDataBinding
		Type t = ((TypedArray)table.getMultiDataBinding().getAppData().getType()).getComponentType();
		
		// ricavo il field 
		Field f = getSelectedField(null, t, col.getSelector());
		
		if ( f != null ) {
			// Scelta del formatter sulla base del tipo ritornato (deve essere un SimpleType) 
			if ( f.getType() instanceof SimpleType ) {
				SimpleType ft = (SimpleType) f.getType();
				if ( isNumeric(ft) ) {
					res = "format=\"{0,number,#,##0.00}\"";
				}
				// al momento gestiamo solo formatter per campi NUMERICI (INTERI [INT, LONG] o DECIMALI [DOUBLE, FLOAT]).
				// TODO: se necessario implementare altri comparatori				
			}
		}

		return res;
	}
	
	
	/**
	 * 
	 * @param col
	 * @param table
	 * @return
	 */
	public static String getColumnComparator(Column col, Table table) {
		String res = "";

		if ( col.isSortable() ) {
			// ricavo il tipo (sicuramente ComplexType) del 
			Type t = ((TypedArray)table.getMultiDataBinding().getAppData().getType()).getComponentType();
			
			// ricavo il field 
			Field f = getSelectedField(null, t, col.getSelector());
			
			if ( f != null ) {
				// scelta del Comparator sulla base del tipo ritornato (deve essere un SimpleType)
				if ( f.getType() instanceof SimpleType ) {
					SimpleType ft = (SimpleType)f.getType();
					if ( ft.getCode() == SimpleTypeCodes.DATE ) {
						res = "CsiDateComparator";
					} else if ( ft.getCode() == SimpleTypeCodes.DATETIME ) {
						res = "CsiDateTimeComparator";
					}
					// al momento gestiamo solo comparatori per campi DATE e DATETIME.
					// TODO: se necessario implementare altri comparatori
				}
			}
		}

		return res;
	}	
	
	
	public static boolean isBoundToArray(AppDataBinding db){
		if (db.getAppData()!=null){
			if (db.getPath()==null || db.getPath().length()==0){
				 return db.getAppData().getType() instanceof TypedArray;
			}
			else{
				// verifico se il field e' un array
				if (db.getAppData().getType() instanceof ComplexType){
					Field fld = getSelectedField(null, (ComplexType)(db.getAppData().getType()), db.getPath());
					if (fld!=null){
						return fld.getType() instanceof TypedArray;
					}
					else
						throw new IllegalArgumentException("campo "+db.getAppData().getType()+"."+db.getPath()+" non trovato");
				}
				else
					throw new IllegalArgumentException("si sta tentantdo di dereferenziare con 'path' un tipo non complesso:"+db.getAppData().getType());
			}
		}
		else
			return false;
	}
	
	
	/**
	 * Ritorna il Field corrispondente al selettore passato.
	 * 
	 * @param f
	 * @param ct
	 * @param selector
	 * @return Il Field corrispondente al selettore passato, null se il selettore non viene risolto.
	 */
	public static Field getSelectedField(Field f, Type ct, String selector) {
		if ( ct instanceof SimpleType ) {
			return getSelectedField(f, (SimpleType)ct, selector);
		} else if ( ct instanceof TypedArray ) {
			return getSelectedField(f, (TypedArray)ct, selector);
		} else if ( ct instanceof ComplexType ) {
			return getSelectedField(f, (ComplexType)ct, selector);
		}
		return null;
	}


	/**
	 * Ritorna il Field corrispondente al selettore passato.
	 * 
	 * @param f
	 * @param ct
	 * @param selector
	 * @return Il Field corrispondente al selettore passato, null se il selettore non viene risolto.
	 */
	private static Field getSelectedField(Field f, ComplexType ct, String selector) {
		String[] parts = splitSelector(selector);
		if ( parts == null ) { 
			return null;
		}
		
		Field f1 = getFieldByName(ct, parts[0]);
		if ( f1 != null ) {
			return getSelectedField(f1, f1.getType(), parts[1]);
		}
		return null;
	}	
	

	/**
	 * Ritorna il Field corrispondente al selettore passato.
	 * 
	 * @param f
	 * @param ct
	 * @param selector
	 * @return Il Field corrispondente al selettore passato, null se il selettore non viene risolto.
	 */
	private static Field getSelectedField(Field f, SimpleType ct, String selector) {
		if ( !GenUtils.isNullOrEmpty(selector) ) {
			return null;
		}
		return f;
	}	

	/**
	 * Ritorna il Field corrispondente al selettore passato.
	 * 
	 * @param f
	 * @param ct
	 * @param selector
	 * @return Il Field corrispondente al selettore passato, null se il selettore non viene risolto.
	 */
	private static Field getSelectedField(Field f, TypedArray ct, String selector) {
		return getSelectedField(f, ct.getComponentType(), selector);
	}
	
	
	/**
	 * 
	 * @param ct
	 * @param fn
	 * @return
	 */
	private static Field getFieldByName(ComplexType ct, String fn) {
		if ( ct != null ) {
			for ( Field f : ct.getAllFields() ) {
				if ( fn.equals(f.getName()) ) {
					return f;
				}
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param selector
	 * @return
	 */
	private static String[] splitSelector(String selector) {
		String[] res = new String[2];
		if (selector==null)
			return null;
		
		if ( selector.indexOf(".") > 0 ) {
			res[0] = selector.substring(0, selector.indexOf("."));
			res[1] =  selector.substring(selector.indexOf(".")+1);
		} else if ( selector.indexOf(".") < 0 ) {
			res[0] = selector;
		} else if ( selector.indexOf(".") == 0 ) { 
			return null;
		}		
		
		if ( res[0].indexOf("[") > 0 ) {
			res[0] = res[0].substring(0, res[0].indexOf("["));
		}
		return res;
	}
	                      
	///////////////////////////////////////////////////
	//// Utility per features ricche
	
	/**
	 * @return l'elenco degli id (nel formato dei tag START/END fragment) dei pannelli che sono oggetto
	 * di refresh mirato nei comandi associati all'event handler.
	 * Se non vi sono RefreshViewCommand nella struttura di comandi il risultato e' null.
	 */
	public static String[] getRefreshTargetIds(EventHandler eh){
		//System.out.println("getRefreshTargetIds:EventHandler");
		if (eh.getCommand()!=null){
			return getRefreshTargetIds(eh.getCommand());
		}
		else return null;
	}

	//public static String[] getRefreshTargetIds(CommandWidget cw){
	public static ArrayList<String> getRefreshTargetIds(Widget cw){
		//System.out.println("getRefreshTargetIds:CommandWidget");
		String [] ris = getRefreshTargetIds(cw.getEventHandlers());
		//System.out.println("getRefreshTargetIds:CommandWidget->"+ris);
		//return ris;
		ArrayList<String> ris2 = new ArrayList<String>();
		if (ris!=null){
			for (int i = 0; i < ris.length; i++) {
				String string = ris[i];
				ris2.add(string);
			}
			return ris2;
		}
		else
			return null;
		
	}
	
	public static String[] getRefreshTargetIds(EList<EventHandler> ehs){
		//System.out.println("getRefreshTargetIds:EventHandler[]");
		Iterator<EventHandler> it = ehs.iterator();
		ArrayList<String> ids = new ArrayList<String>();
		while (it.hasNext()) {
			EventHandler eventHandler = (EventHandler) it.next();
			String [] parz = getRefreshTargetIds(eventHandler);
			if (parz!=null){
				for (int i = 0; i < parz.length; i++) {
					String currId = parz[i];
					ids.add(currId);
				}
			}
		}
		if (ids.size()>0){
			String ris[] = new String[ids.size()];
			Iterator<String> resIt = ids.iterator();
			int i=0;
			while (resIt.hasNext()) {
				String currId = resIt.next();
				ris[i++]=currId;
			}
			//System.out.println("getRefreshTargetIds:EventHandler[]->"+ris);
			return ris;
		}
		else{
			//System.out.println("getRefreshTargetIds:EventHandler[]->null");
			return null;
		}
	}
	
	public static String[] getRefreshTargetIds(Command c){
		//System.out.println("getRefreshTargetIds:Command");
		if (c instanceof SequenceCommand)
			return getRefreshTargetIds((SequenceCommand)c);
		else if (c instanceof ExecCommand)
			return getRefreshTargetIds((ExecCommand)c);
		else if (c instanceof ChkEditStatusCommand)
			return getRefreshTargetIds((ChkEditStatusCommand)c);
		else if (c instanceof RefreshViewCommand)
			return getRefreshTargetIds((RefreshViewCommand)c);
		else 
			return null;
	}
	
	public static String[] getRefreshTargetIds(RefreshViewCommand c){
		//System.out.println("getRefreshTargetIds:RefreshViewCommand");
		ArrayList<String> ids = new ArrayList<String>();
		Iterator<Panel> it = c.getTargetPanels().iterator();
		while(it.hasNext()){
			ids.add("p_"+it.next().getName());
		}
		if (ids.size()>0){
			String [] ris = new String[ids.size()];
			int i=0;
			Iterator<String> resIt = ids.iterator();
			while (resIt.hasNext()) {
				String currId = resIt.next();
				ris[i++]=currId;
			}
			//System.out.println("getRefreshTargetIds:RefreshViewCommand->"+ris);
			return ris;
		}
		else{
			//System.out.println("getRefreshTargetIds:RefreshViewCommand->null");
			return null;
		}
	}
	
	public static String[] getRefreshTargetIds(ExecCommand c){
		//System.out.println("getRefreshTargetIds:ExecCommand");
		Iterator<CommandOutcome> it = c.getResults().iterator();
		ArrayList<String> ids = new ArrayList<String>();
		while (it.hasNext()) {
			CommandOutcome outcome = it.next();
			String[] parz = getRefreshTargetIds(outcome);
			if (parz!=null)
				for (int i = 0; i<parz.length;i++) {
					String currId = parz[i];
					ids.add(currId);
				}
		}
		if (ids.size()>0){
			String [] ris = new String[ids.size()];
			int i=0;
			Iterator<String> resIt = ids.iterator();
			while (resIt.hasNext()) {
				String currId = resIt.next();
				ris[i++]=currId;
			}
			//System.out.println("getRefreshTargetIds:ExecCommand->"+ris);
			return ris;
		}
		else{
			//System.out.println("getRefreshTargetIds:ExecCommand->null");
			return null;
		}
	}
	
	public static String[] getRefreshTargetIds(ChkEditStatusCommand c){
		//System.out.println("getRefreshTargetIds:ChekEditStatusCommand");
		String [] ris = null;
		String parzIf [] = getRefreshTargetIds(c.getDoIfChanged());
		String parzIfNot [] = getRefreshTargetIds(c.getDoIfNotChanged());
		int risLength = (parzIf!=null ? parzIf.length : 0) + (parzIfNot!=null ? parzIfNot.length : 0);
		if (risLength>0){
			ris = new String[risLength];
			int iris=0;
			// 1
			for (int i = 0; i < parzIf.length; i++) {
				String s = parzIf[i];
				ris[iris++]=s;
			}
			// 2
			for (int i = 0; i < parzIfNot.length; i++) {
				String s = parzIfNot[i];
				ris[iris++]=s;
			}
		}
		//System.out.println("getRefreshTargetIds:ExecCommand->"+ris);
		return ris;
		
	}
	
	public static String[] getRefreshTargetIds(CommandOutcome cout){
		//System.out.println("getRefreshTargetIds:CommandOutcome");
		String [] ris = getRefreshTargetIds(cout.getCommand());
		//System.out.println("getRefreshTargetIds:CommandOutcome->"+ris);
		return ris;
	}
	
	public static String[] getRefreshTargetIds(SequenceCommand c){
		//System.out.println("getRefreshTargetIds:SequenceCommand");
		Iterator<Command> it = c.getCommands().iterator();
		ArrayList<String> ids = new ArrayList<String>();
		while (it.hasNext()) {
			Command currStep = it.next();
			String[] parz = getRefreshTargetIds(currStep);
			if (parz!=null)
				for (int i=0;i<parz.length;i++) {
					String currId = parz[i];
					ids.add(currId);
				}
		}
		if (ids.size()>0){
			String [] ris = new String[ids.size()];
			int i=0;
			Iterator<String> resIt = ids.iterator();
			while (resIt.hasNext()) {
				String currId = resIt.next();
				ris[i++]=currId;
			}
			//System.out.println("getRefreshTargetIds:SequenceCommand->"+ris);
			return ris;
		}
		else {
			//System.out.println("getRefreshTargetIds:SequenceCommand->null");
			return null;
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	// UTILITY METHODS

	/**
	 * Verifica se una stringa &egrave; nulla o vuota.
	 * 
	 * @param s La Stringa da verificare.
	 * @return  true se la stringa &egrave; nulla o vuota, false altrimenti.
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
		/*try {
			MenuItem mi = GuigenFactory.eINSTANCE.createMenuItem();
			EventHandler eh = GuigenFactory.eINSTANCE.createEventHandler();
			mi.setEventHandler(eh);
			ExecCommand ex = GuigenFactory.eINSTANCE.createExecCommand();
			eh.setCommand(ex);
			findParentContentPanel(ex);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/	
	}


	

}
