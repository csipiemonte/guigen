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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activate Multi Panel Item Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di visualizzare uno degli item di un <b>MultiPanel</b> 
 * (o di una delle sue sottoclassi <b>TabSetPanel</b> o <b>WizardPanel</b>).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getMultipanel <em>Multipanel</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActivateMultiPanelItemCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface ActivateMultiPanelItemCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Multipanel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multipanel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il multipanel del quale si desidera cambiare l'item visualizzato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multipanel</em>' reference.
	 * @see #setMultipanel(MultiPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActivateMultiPanelItemCommand_Multipanel()
	 * @model
	 * @generated
	 */
	MultiPanel getMultipanel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getMultipanel <em>Multipanel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multipanel</em>' reference.
	 * @see #getMultipanel()
	 * @generated
	 */
	void setMultipanel(MultiPanel value);

	/**
	 * Returns the value of the '<em><b>Active Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'item da visualizzare. Se impostato a "null" non verr&agrave; visualizzato nessun pannello
	 * (vale solo per il <b>MultiPanel</b>).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Item</em>' reference.
	 * @see #isSetActiveItem()
	 * @see #unsetActiveItem()
	 * @see #setActiveItem(Panel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActivateMultiPanelItemCommand_ActiveItem()
	 * @model unsettable="true"
	 * @generated
	 */
	Panel getActiveItem();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Item</em>' reference.
	 * @see #isSetActiveItem()
	 * @see #unsetActiveItem()
	 * @see #getActiveItem()
	 * @generated
	 */
	void setActiveItem(Panel value);

	/**
	 * Unsets the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActiveItem()
	 * @see #getActiveItem()
	 * @see #setActiveItem(Panel)
	 * @generated
	 */
	void unsetActiveItem();

	/**
	 * Returns whether the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active Item</em>' reference is set.
	 * @see #unsetActiveItem()
	 * @see #getActiveItem()
	 * @see #setActiveItem(Panel)
	 * @generated
	 */
	boolean isSetActiveItem();

} // ActivateMultiPanelItemCommand
