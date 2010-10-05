/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Role;
import it.csi.mddtools.guigen.RoleMappingPDefVal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.RoleMappingPDefValImpl#getActualRole <em>Actual Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleMappingPDefValImpl extends PDefParamValImpl implements RoleMappingPDefVal {
	/**
	 * The cached value of the '{@link #getActualRole() <em>Actual Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualRole()
	 * @generated
	 * @ordered
	 */
	protected Role actualRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleMappingPDefValImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.ROLE_MAPPING_PDEF_VAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getActualRole() {
		if (actualRole != null && actualRole.eIsProxy()) {
			InternalEObject oldActualRole = (InternalEObject)actualRole;
			actualRole = (Role)eResolveProxy(oldActualRole);
			if (actualRole != oldActualRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE, oldActualRole, actualRole));
			}
		}
		return actualRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetActualRole() {
		return actualRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualRole(Role newActualRole) {
		Role oldActualRole = actualRole;
		actualRole = newActualRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE, oldActualRole, actualRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE:
				if (resolve) return getActualRole();
				return basicGetActualRole();
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
			case GuigenPackage.ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE:
				setActualRole((Role)newValue);
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
			case GuigenPackage.ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE:
				setActualRole((Role)null);
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
			case GuigenPackage.ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE:
				return actualRole != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleMappingPDefValImpl
