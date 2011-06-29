/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.RoleMappingPDefVal#getActualRole <em>Actual Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRoleMappingPDefVal()
 * @model
 * @generated
 */
public interface RoleMappingPDefVal extends PDefParamVal {
	/**
	 * Returns the value of the '<em><b>Actual Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Role</em>' reference.
	 * @see #setActualRole(Role)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRoleMappingPDefVal_ActualRole()
	 * @model
	 * @generated
	 */
	Role getActualRole();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RoleMappingPDefVal#getActualRole <em>Actual Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Role</em>' reference.
	 * @see #getActualRole()
	 * @generated
	 */
	void setActualRole(Role value);

} // RoleMappingPDefVal
