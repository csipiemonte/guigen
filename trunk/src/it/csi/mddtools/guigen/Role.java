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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ruolo come definito in IRIDE2
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Role#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Role#getDomainCode <em>Domain Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRole()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice identificativo (come censito in IRIDE2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRole_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Role#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Domain Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice del dominio di validit&agrave; del ruolo (come censito in IRIDE2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Code</em>' attribute.
	 * @see #setDomainCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRole_DomainCode()
	 * @model
	 * @generated
	 */
	String getDomainCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Role#getDomainCode <em>Domain Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Code</em>' attribute.
	 * @see #getDomainCode()
	 * @generated
	 */
	void setDomainCode(String value);

} // Role
