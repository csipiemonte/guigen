/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.LocalLoginUI;
import it.csi.mddtools.guigen.LoginUITypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Login UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.LocalLoginUIImpl#getUiType <em>Ui Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalLoginUIImpl extends EObjectImpl implements LocalLoginUI {
	/**
	 * The default value of the '{@link #getUiType() <em>Ui Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiType()
	 * @generated
	 * @ordered
	 */
	protected static final LoginUITypes UI_TYPE_EDEFAULT = LoginUITypes.USERNAME_PASSWORD;

	/**
	 * The cached value of the '{@link #getUiType() <em>Ui Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiType()
	 * @generated
	 * @ordered
	 */
	protected LoginUITypes uiType = UI_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalLoginUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.LOCAL_LOGIN_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUITypes getUiType() {
		return uiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiType(LoginUITypes newUiType) {
		LoginUITypes oldUiType = uiType;
		uiType = newUiType == null ? UI_TYPE_EDEFAULT : newUiType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.LOCAL_LOGIN_UI__UI_TYPE, oldUiType, uiType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.LOCAL_LOGIN_UI__UI_TYPE:
				return getUiType();
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
			case GuigenPackage.LOCAL_LOGIN_UI__UI_TYPE:
				setUiType((LoginUITypes)newValue);
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
			case GuigenPackage.LOCAL_LOGIN_UI__UI_TYPE:
				setUiType(UI_TYPE_EDEFAULT);
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
			case GuigenPackage.LOCAL_LOGIN_UI__UI_TYPE:
				return uiType != UI_TYPE_EDEFAULT;
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
		result.append(" (uiType: ");
		result.append(uiType);
		result.append(')');
		return result.toString();
	}

} //LocalLoginUIImpl
