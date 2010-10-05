/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Role;
import it.csi.mddtools.guigen.RoleMappingParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.RoleMappingParamImpl#getDefRole <em>Def Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleMappingParamImpl extends PDefParamImpl implements RoleMappingParam {
	/**
	 * The cached value of the '{@link #getDefRole() <em>Def Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefRole()
	 * @generated
	 * @ordered
	 */
	protected Role defRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleMappingParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.ROLE_MAPPING_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDefRole() {
		if (defRole != null && defRole.eIsProxy()) {
			InternalEObject oldDefRole = (InternalEObject)defRole;
			defRole = (Role)eResolveProxy(oldDefRole);
			if (defRole != oldDefRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.ROLE_MAPPING_PARAM__DEF_ROLE, oldDefRole, defRole));
			}
		}
		return defRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDefRole() {
		return defRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefRole(Role newDefRole) {
		Role oldDefRole = defRole;
		defRole = newDefRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.ROLE_MAPPING_PARAM__DEF_ROLE, oldDefRole, defRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.ROLE_MAPPING_PARAM__DEF_ROLE:
				if (resolve) return getDefRole();
				return basicGetDefRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigenPackage.ROLE_MAPPING_PARAM__DEF_ROLE:
				setDefRole((Role)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuigenPackage.ROLE_MAPPING_PARAM__DEF_ROLE:
				setDefRole((Role)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuigenPackage.ROLE_MAPPING_PARAM__DEF_ROLE:
				return defRole != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleMappingParamImpl
