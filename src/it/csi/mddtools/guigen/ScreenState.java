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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ScreenState#getWidgetsOn <em>Widgets On</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ScreenState#getWidgetsVisible <em>Widgets Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenState()
 * @model
 * @generated
 */
public interface ScreenState extends EObject {
	/**
	 * Returns the value of the '<em><b>Widgets On</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>Widgets Visible</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenState_WidgetsVisible()
	 * @model
	 * @generated
	 */
	EList<Widget> getWidgetsVisible();

} // ScreenState
