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
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pannello a visualizzazione alternativa. Permette di visualizzare uno solo 
 * dei pannelli definiti nella collezione <i>panels</i>.
 * Per visualizzare uno specifico pannello occorre utilizzare il comando
 * <b>ActivateMultipanelItem</b>.
 * Lo statoiniziale di questo pannello &egrave; la non visualizzazione di nessun pannello.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MultiPanel#getPanels <em>Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiPanel()
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>MultiPanel</b> &egrave; un pannello utilizzato per realizzare pannelli <i>mutevoli</i>, ovvero che \r\nassumono programmaticamente le sembianze di uno tra <i>n</i> pannelli possibili. Esiste anche la \r\npossibilit&agrave; di non visualizzare nessun pannello: in quesot cao il <b>MultiPanel</b> non produce nessuna\r\nstruttura visualizzata. Il <b>MultiPanel</b> &egrave; lo strumento principale da utilizzare nel caso in cui sia \r\nnecessaria la scomparsa di un intero pannello (cosa che non &egravE; possibile realizzare esclusivamente\r\ncon i comandi di visibilit&agrave; sui <b>Widget</b>).\r\n<br/>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pannello disponibili.\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface MultiPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Panels</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I pannelli visualizzabili in alternativa
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Panels</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiPanel_Panels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panel> getPanels();

} // MultiPanel
