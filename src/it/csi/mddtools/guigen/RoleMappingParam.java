/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.RoleMappingParam#getDefRole <em>Def Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRoleMappingParam()
 * @model
 * @generated
 */
public interface RoleMappingParam extends PDefParam {
	/**
	 * Returns the value of the '<em><b>Def Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Role</em>' reference.
	 * @see #setDefRole(Role)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRoleMappingParam_DefRole()
	 * @model
	 * @generated
	 */
	Role getDefRole();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RoleMappingParam#getDefRole <em>Def Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Role</em>' reference.
	 * @see #getDefRole()
	 * @generated
	 */
	void setDefRole(Role value);

} // RoleMappingParam
