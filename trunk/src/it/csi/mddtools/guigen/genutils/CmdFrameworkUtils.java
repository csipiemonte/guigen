package it.csi.mddtools.guigen.genutils;

import it.csi.mddtools.guigen.*;

import org.eclipse.emf.ecore.EObject;

/**
 * Utility legate al command framework
 * @author CSI Piemonte
 *
 */
public class CmdFrameworkUtils {

	/**
	 * 
	 * @param cmd
	 * @return un istanza di: Menu, Widget, ApplicationArea, ContentPanel, PanelDef
	 * (i possibili container di azioni) 
	 */
	public static EObject getCmdChainContainer(Command cmd) {
		EObject parent = cmd.eContainer();
		if (parent == null)
			return null;
		else if (parent instanceof Command) {
			return getCmdChainContainer((Command) parent);
		} else if (parent instanceof CommandOutcome) {
			parent = parent.eContainer();
			return getCmdChainContainer((Command) parent);
		} else if (parent instanceof EventHandler) {
			parent = parent.eContainer();
			return parent; // widget o menu
		} else if (parent instanceof ApplicationArea
				|| parent instanceof PanelDef || parent instanceof ContentPanel) {
			return parent;
		} else
			throw new IllegalArgumentException(
					"contenitore di catena non gestito:" + parent);
	}
}
