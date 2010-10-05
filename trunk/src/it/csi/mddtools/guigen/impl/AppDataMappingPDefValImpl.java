/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppDataMappingPDefVal;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Data Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppDataMappingPDefValImpl#getActualAppData <em>Actual App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppDataMappingPDefValImpl extends PDefParamValImpl implements AppDataMappingPDefVal {
	/**
	 * The cached value of the '{@link #getActualAppData() <em>Actual App Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualAppData()
	 * @generated
	 * @ordered
	 */
	protected ApplicationData actualAppData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppDataMappingPDefValImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.APP_DATA_MAPPING_PDEF_VAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationData getActualAppData() {
		if (actualAppData != null && actualAppData.eIsProxy()) {
			InternalEObject oldActualAppData = (InternalEObject)actualAppData;
			actualAppData = (ApplicationData)eResolveProxy(oldActualAppData);
			if (actualAppData != oldActualAppData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA, oldActualAppData, actualAppData));
			}
		}
		return actualAppData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationData basicGetActualAppData() {
		return actualAppData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualAppData(ApplicationData newActualAppData) {
		ApplicationData oldActualAppData = actualAppData;
		actualAppData = newActualAppData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA, oldActualAppData, actualAppData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA:
				if (resolve) return getActualAppData();
				return basicGetActualAppData();
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
			case GuigenPackage.APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA:
				setActualAppData((ApplicationData)newValue);
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
			case GuigenPackage.APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA:
				setActualAppData((ApplicationData)null);
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
			case GuigenPackage.APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA:
				return actualAppData != null;
		}
		return super.eIsSet(featureID);
	}

} //AppDataMappingPDefValImpl
