/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppDataMappingParam;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Data Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppDataMappingParamImpl#getDefAppData <em>Def App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppDataMappingParamImpl extends PDefParamImpl implements AppDataMappingParam {
	/**
	 * The cached value of the '{@link #getDefAppData() <em>Def App Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefAppData()
	 * @generated
	 * @ordered
	 */
	protected ApplicationData defAppData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppDataMappingParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.APP_DATA_MAPPING_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationData getDefAppData() {
		if (defAppData != null && defAppData.eIsProxy()) {
			InternalEObject oldDefAppData = (InternalEObject)defAppData;
			defAppData = (ApplicationData)eResolveProxy(oldDefAppData);
			if (defAppData != oldDefAppData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.APP_DATA_MAPPING_PARAM__DEF_APP_DATA, oldDefAppData, defAppData));
			}
		}
		return defAppData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationData basicGetDefAppData() {
		return defAppData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefAppData(ApplicationData newDefAppData) {
		ApplicationData oldDefAppData = defAppData;
		defAppData = newDefAppData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_DATA_MAPPING_PARAM__DEF_APP_DATA, oldDefAppData, defAppData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.APP_DATA_MAPPING_PARAM__DEF_APP_DATA:
				if (resolve) return getDefAppData();
				return basicGetDefAppData();
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
			case GuigenPackage.APP_DATA_MAPPING_PARAM__DEF_APP_DATA:
				setDefAppData((ApplicationData)newValue);
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
			case GuigenPackage.APP_DATA_MAPPING_PARAM__DEF_APP_DATA:
				setDefAppData((ApplicationData)null);
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
			case GuigenPackage.APP_DATA_MAPPING_PARAM__DEF_APP_DATA:
				return defAppData != null;
		}
		return super.eIsSet(featureID);
	}

} //AppDataMappingParamImpl
