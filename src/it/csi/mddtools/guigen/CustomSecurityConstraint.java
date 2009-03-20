/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Security Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CustomSecurityConstraint#getMethodNameSuffix <em>Method Name Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomSecurityConstraint()
 * @model
 * @generated
 */
public interface CustomSecurityConstraint extends UISecurityConstraint {

	/**
	 * Returns the value of the '<em><b>Method Name Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name Suffix</em>' attribute.
	 * @see #setMethodNameSuffix(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomSecurityConstraint_MethodNameSuffix()
	 * @model
	 * @generated
	 */
	String getMethodNameSuffix();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CustomSecurityConstraint#getMethodNameSuffix <em>Method Name Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name Suffix</em>' attribute.
	 * @see #getMethodNameSuffix()
	 * @generated
	 */
	void setMethodNameSuffix(String value);
} // CustomSecurityConstraint
