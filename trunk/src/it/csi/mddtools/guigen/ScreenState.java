/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stato di visibili&agrave; / abilitazione dei widget contenuti in un 
 * <b>ContentPanel</b>. Per passare da uno stato all'altro &egrave; 
 * necessario utilizzare il comando <b>ScreenStateCommand</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ScreenState#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ScreenState#getWidgetsOn <em>Widgets On</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ScreenState#getWidgetsVisible <em>Widgets Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenState()
 * @model annotation="logicpkg pkg='ui.state'"
 * @generated
 */
public interface ScreenState extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice identificativo dello stato. Deve essere univoco nel content panel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ScreenState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Widgets On</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * elenco dei widget che devono essere resi editabili se il <b>ContentPanel</b>
	 * &egrave; in questo stato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets On</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenState_WidgetsOn()
	 * @model
	 * @generated
	 */
	EList<Widget> getWidgetsOn();

	/**
	 * Returns the value of the '<em><b>Widgets Visible</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets Visible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * elenco dei widget che devono essere resi visibili se il <b>ContentPanel</b>
	 * &egrave; in questo stato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets Visible</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenState_WidgetsVisible()
	 * @model
	 * @generated
	 */
	EList<Widget> getWidgetsVisible();

} // ScreenState
