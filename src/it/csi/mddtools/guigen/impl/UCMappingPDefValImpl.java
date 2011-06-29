/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.UCMappingPDefVal;
import it.csi.mddtools.guigen.UseCase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.UCMappingPDefValImpl#getActualUseCase <em>Actual Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UCMappingPDefValImpl extends PDefParamValImpl implements UCMappingPDefVal {
	/**
	 * The cached value of the '{@link #getActualUseCase() <em>Actual Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualUseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase actualUseCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCMappingPDefValImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.UC_MAPPING_PDEF_VAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getActualUseCase() {
		if (actualUseCase != null && actualUseCase.eIsProxy()) {
			InternalEObject oldActualUseCase = (InternalEObject)actualUseCase;
			actualUseCase = (UseCase)eResolveProxy(oldActualUseCase);
			if (actualUseCase != oldActualUseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE, oldActualUseCase, actualUseCase));
			}
		}
		return actualUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetActualUseCase() {
		return actualUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualUseCase(UseCase newActualUseCase) {
		UseCase oldActualUseCase = actualUseCase;
		actualUseCase = newActualUseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE, oldActualUseCase, actualUseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE:
				if (resolve) return getActualUseCase();
				return basicGetActualUseCase();
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
			case GuigenPackage.UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE:
				setActualUseCase((UseCase)newValue);
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
			case GuigenPackage.UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE:
				setActualUseCase((UseCase)null);
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
			case GuigenPackage.UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE:
				return actualUseCase != null;
		}
		return super.eIsSet(featureID);
	}

} //UCMappingPDefValImpl
