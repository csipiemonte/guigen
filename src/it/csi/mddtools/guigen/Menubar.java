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
 * A representation of the model object '<em><b>Menubar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contiene la struttura del menu. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Menubar#getTopLevelMenu <em>Top Level Menu</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Menubar#isRemoteInfoBox <em>Remote Info Box</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMenubar()
 * @model annotation="logicpkg pkg='ui.menu'"
 * @generated
 */
public interface Menubar extends EObject {
	/**
	 * Returns the value of the '<em><b>Top Level Menu</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Level Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contiene il primo livello di voci di menu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level Menu</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenubar_TopLevelMenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getTopLevelMenu();

	/**
	 * Returns the value of the '<em><b>Remote Info Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Info Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Info Box</em>' attribute.
	 * @see #setRemoteInfoBox(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenubar_RemoteInfoBox()
	 * @model
	 * @generated
	 */
	boolean isRemoteInfoBox();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Menubar#isRemoteInfoBox <em>Remote Info Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Info Box</em>' attribute.
	 * @see #isRemoteInfoBox()
	 * @generated
	 */
	void setRemoteInfoBox(boolean value);

} // Menubar
