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
 * A representation of the model object '<em><b>Dialog Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pagina utilizzabile per messaggi di feedback/conferme etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.DialogPanel#getCommands <em>Commands</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DialogPanel#getMsgBoxes <em>Msg Boxes</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel()
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>DialogPanel</b> &egrave; un pannello utilizzato per realizzare funzioni di feedback utente\r\n(messaggi informativi, dichieste di conferme). E\'associato all\'intera schermata e, quando &egrave; \r\nattivato, mostra all\'utente i messaggi previsti sostituendo completamente la schermata operativa.\r\n<br/>\r\nAll\'interno del singolo tab &egrave; possibile inserire solo quelle tipologie di pannelli che servono per:\r\n<ul>\r\n<li>mostrare messaggi formattati all\'utente (<b>MsgBoxPanel</b>)</li>\r\n<li>fornire all\'utente i comandi per &quot;rispondere&quot; al feedback, ovvero uno o pi&ugrave;\r\npulsanti di conferma o cancellazione (<b>CommandPanel</b>)</li>\r\n</ul>\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface DialogPanel extends Panel {

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I pulsanti associati al dialog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference.
	 * @see #setCommands(CommandPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel_Commands()
	 * @model containment="true"
	 * @generated
	 */
	CommandPanel getCommands();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DialogPanel#getCommands <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commands</em>' containment reference.
	 * @see #getCommands()
	 * @generated
	 */
	void setCommands(CommandPanel value);

	/**
	 * Returns the value of the '<em><b>Msg Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.MsgBoxPanel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Boxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I messaggi di feedback da visualizzare devono essere inseriti in uno o più
	 * <b>MessageBoxPanel</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Msg Boxes</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel_MsgBoxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MsgBoxPanel> getMsgBoxes();
} // DialogPanel
