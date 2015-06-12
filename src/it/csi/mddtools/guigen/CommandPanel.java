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
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pannello destinato a contenere esclusivamente widget di comando (es. pulsanti).
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CommandPanel#getCmdStyle <em>Cmd Style</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CommandPanel#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandPanel()
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>CommandPanel</b> &egrave; un pannello utilizzato per realizzare pulsantiere,\r\novvero gruppi di <b>Button</b> destinati ad eseguire funzioni di business.\r\n<br/>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pulsanti disponibili.\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface CommandPanel extends Panel {

	/**
	 * Returns the value of the '<em><b>Cmd Style</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.CommandStyles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permette di differenziare stilisticamente (ove previsto dai pattern di portale)
	 * tra pulsanti ad uso "funzionale" e pulsanti ad uso "navigazione".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmd Style</em>' attribute.
	 * @see it.csi.mddtools.guigen.CommandStyles
	 * @see #setCmdStyle(CommandStyles)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandPanel_CmdStyle()
	 * @model
	 * @generated
	 */
	CommandStyles getCmdStyle();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CommandPanel#getCmdStyle <em>Cmd Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Style</em>' attribute.
	 * @see it.csi.mddtools.guigen.CommandStyles
	 * @see #getCmdStyle()
	 * @generated
	 */
	void setCmdStyle(CommandStyles value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ristretto a commandWidgets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandPanel_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();
} // CommandPanel
