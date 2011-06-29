/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Voce di menu
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Menu#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Menu#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Menu#getItem <em>Item</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Menu#getSubmenu <em>Submenu</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Menu#getSecurityConstraints <em>Security Constraints</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Menu#getEventHandler <em>Event Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMenu()
 * @model annotation="logicpkg pkg='ui.menu'"
 * @generated
 */
public interface Menu extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice simbolico della voce di menu. Deve essere univoco all'interno della
	 * struttura di menu e deve essere un identificativo valido secondo Java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenu_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Menu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il menu viene visualizzato con questa etichetta.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenu_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Menu#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.MenuItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OBSOLETO: non utilizzare. Utilizzare l'elemento <i>submenu</i>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenu_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItem> getItem();

	/**
	 * Returns the value of the '<em><b>Submenu</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submenu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco dei sottomenu di questo menu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submenu</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenu_Submenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getSubmenu();

	/**
	 * Returns the value of the '<em><b>Security Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.UISecurityConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * elenco dei secirity constraints associati a questa voce di menu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Constraints</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenu_SecurityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<UISecurityConstraint> getSecurityConstraints();

	/**
	 * Returns the value of the '<em><b>Event Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il menu supporta un handler per l'evento CLICKED. Se non viene specificato
	 * nessun event handler il menu sarà completamente inattivo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Handler</em>' containment reference.
	 * @see #setEventHandler(EventHandler)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenu_EventHandler()
	 * @model containment="true"
	 * @generated
	 */
	EventHandler getEventHandler();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Menu#getEventHandler <em>Event Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Handler</em>' containment reference.
	 * @see #getEventHandler()
	 * @generated
	 */
	void setEventHandler(EventHandler value);

} // Menu
