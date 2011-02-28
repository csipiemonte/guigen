/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.StdWebResModuleNames;
import it.csi.mddtools.guigen.StdWebResourceModule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Std Web Resource Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.StdWebResourceModuleImpl#getStdName <em>Std Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StdWebResourceModuleImpl extends WebResourceModuleImpl implements StdWebResourceModule {
	/**
	 * The default value of the '{@link #getStdName() <em>Std Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdName()
	 * @generated
	 * @ordered
	 */
	protected static final StdWebResModuleNames STD_NAME_EDEFAULT = StdWebResModuleNames.EXT_ALL;

	/**
	 * The cached value of the '{@link #getStdName() <em>Std Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdName()
	 * @generated
	 * @ordered
	 */
	protected StdWebResModuleNames stdName = STD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdWebResourceModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.STD_WEB_RESOURCE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdWebResModuleNames getStdName() {
		return stdName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdName(StdWebResModuleNames newStdName) {
		StdWebResModuleNames oldStdName = stdName;
		stdName = newStdName == null ? STD_NAME_EDEFAULT : newStdName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.STD_WEB_RESOURCE_MODULE__STD_NAME, oldStdName, stdName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.STD_WEB_RESOURCE_MODULE__STD_NAME:
				return getStdName();
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
			case GuigenPackage.STD_WEB_RESOURCE_MODULE__STD_NAME:
				setStdName((StdWebResModuleNames)newValue);
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
			case GuigenPackage.STD_WEB_RESOURCE_MODULE__STD_NAME:
				setStdName(STD_NAME_EDEFAULT);
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
			case GuigenPackage.STD_WEB_RESOURCE_MODULE__STD_NAME:
				return stdName != STD_NAME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stdName: ");
		result.append(stdName);
		result.append(')');
		return result.toString();
	}

} //StdWebResourceModuleImpl