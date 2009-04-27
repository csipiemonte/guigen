/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GUIStructure#getAppWindow <em>App Window</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIStructure()
 * @model
 * @generated
 */
public interface GUIStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>App Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Window</em>' containment reference.
	 * @see #setAppWindow(AppWindow)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIStructure_AppWindow()
	 * @model containment="true"
	 * @generated
	 */
	AppWindow getAppWindow();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIStructure#getAppWindow <em>App Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Window</em>' containment reference.
	 * @see #getAppWindow()
	 * @generated
	 */
	void setAppWindow(AppWindow value);

} // GUIStructure
