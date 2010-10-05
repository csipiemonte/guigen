/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Based Security Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Security constraint basato sull'abilitazione dell'utente corrente ad un particolare UseCase
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.UCBasedSecurityConstraint#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getUCBasedSecurityConstraint()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface UCBasedSecurityConstraint extends UISecurityConstraint {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lo UseCase di riferimento
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' reference.
	 * @see #setUseCase(UseCase)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getUCBasedSecurityConstraint_UseCase()
	 * @model
	 * @generated
	 */
	UseCase getUseCase();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.UCBasedSecurityConstraint#getUseCase <em>Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' reference.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(UseCase value);

} // UCBasedSecurityConstraint
