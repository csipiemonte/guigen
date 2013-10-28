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
 * A representation of the model object '<em><b>Login Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.LoginModule#isInternal <em>Internal</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.LoginModule#getLoginUI <em>Login UI</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getLoginModule()
 * @model
 * @generated
 */
public interface LoginModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getLoginModule_Internal()
	 * @model
	 * @generated
	 */
	boolean isInternal();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.LoginModule#isInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #isInternal()
	 * @generated
	 */
	void setInternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Login UI</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.LoginUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login UI</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getLoginModule_LoginUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoginUI> getLoginUI();

} // LoginModule
