package it.csi.mddtools.guigen.genutils;

import org.eclipse.emf.ecore.EObject;

import it.csi.mddtools.guigen.Action;
import it.csi.mddtools.guigen.ActionResult;
import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.ExecAction;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.JumpAction;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.SequenceAction;

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

public static ContentPanel findParentContentPanel(Panel p){
	EObject parent = p.eContainer();
	if (parent instanceof ContentPanel)
		return (ContentPanel)parent;
	else
		return findParentContentPanel((Panel)parent);
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
