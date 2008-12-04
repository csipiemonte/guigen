package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import it.csi.mddtools.guigen.Action;
import it.csi.mddtools.guigen.ActionResult;
import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.ExecAction;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.JumpAction;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.SequenceAction;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.Widget;

public class GenUtils {
public static ContentPanel findParentContentPanel (Action a){
	EObject containerOfAction = a.eContainer();
	String name= containerOfAction.eClass().getName();
	if (name.equals("EventHandler")){
		EObject widget=containerOfAction.eContainer();
		EObject panel = widget.eContainer();
		return findParentContentPanel((Panel)panel);
	}
	else if (containerOfAction instanceof ActionResult){
		ExecAction execAct= (ExecAction)containerOfAction.eContainer();
		return findParentContentPanel(execAct);
	}
	else{
		// sequence action
		return findParentContentPanel(((SequenceAction)containerOfAction));
	}
	
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
 * content panel in oggetto
 * @param cp
 * @return
 */
public static ArrayList<Widget> findAllWidgetsInContentPanel(ContentPanel cp){
	return findAllWidgetsInPanel(cp.getPanels());
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
	else if (p instanceof DialogPanel)
		return findAllWidgetsInPanel((DialogPanel)p);
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
		if (tsp.getTabs() == null)
			return null;
		else {
			ArrayList<Widget> ris = new ArrayList<Widget>();
			if (tsp.getTabs() != null) {
				Iterator<Panel> it = tsp.getTabs().iterator();
				while (it.hasNext()) {
					ArrayList<Widget> tmp = findAllWidgetsInPanel(it.next());
					ris.addAll(tmp);
				}
			}
			return ris;
		}
	}

public static void main(String[] args) {
	try {
		it.csi.mddtools.guigen.GuigenPackage.eINSTANCE.getClass();
		ContentPanel cp = GuigenFactory.eINSTANCE.createContentPanel();
		FormPanel p1 = GuigenFactory.eINSTANCE.createFormPanel();
		cp.setPanels(p1);
		Button b1 = GuigenFactory.eINSTANCE.createButton();
		p1.getWidgets().add(b1);
		EventHandler eh1 = GuigenFactory.eINSTANCE.createEventHandler();
		b1.getEventHandlers().add(eh1);
		JumpAction a1 = GuigenFactory.eINSTANCE.createJumpAction();
		eh1.setAction(a1);
		ContentPanel out = findParentContentPanel(a1);
		System.out.println(""+out);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
