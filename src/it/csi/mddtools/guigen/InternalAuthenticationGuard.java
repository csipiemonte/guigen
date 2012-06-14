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
 * A representation of the model object '<em><b>Internal Authentication Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.InternalAuthenticationGuard#getLoginModule <em>Login Module</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.InternalAuthenticationGuard#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getInternalAuthenticationGuard()
 * @model
 * @generated
 */
public interface InternalAuthenticationGuard extends EObject {
	/**
	 * Returns the value of the '<em><b>Login Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Module</em>' containment reference.
	 * @see #setLoginModule(LoginModule)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getInternalAuthenticationGuard_LoginModule()
	 * @model containment="true"
	 * @generated
	 */
	LoginModule getLoginModule();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.InternalAuthenticationGuard#getLoginModule <em>Login Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Module</em>' containment reference.
	 * @see #getLoginModule()
	 * @generated
	 */
	void setLoginModule(LoginModule value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(EnvConfigParams)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getInternalAuthenticationGuard_Params()
	 * @model containment="true"
	 * @generated
	 */
	EnvConfigParams getParams();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.InternalAuthenticationGuard#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(EnvConfigParams value);

} // InternalAuthenticationGuard
