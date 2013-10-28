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
