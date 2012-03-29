/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.IdentityAdapter;
import it.csi.mddtools.guigen.InfoSourceTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl#getInfoSourceName <em>Info Source Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityAdapterImpl extends EObjectImpl implements IdentityAdapter {
	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final InfoSourceTypes SOURCE_TYPE_EDEFAULT = InfoSourceTypes.REQUEST_PARAM;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected InfoSourceTypes sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoSourceName() <em>Info Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoSourceName() <em>Info Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoSourceName()
	 * @generated
	 * @ordered
	 */
	protected String infoSourceName = INFO_SOURCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.IDENTITY_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoSourceTypes getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(InfoSourceTypes newSourceType) {
		InfoSourceTypes oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoSourceName() {
		return infoSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoSourceName(String newInfoSourceName) {
		String oldInfoSourceName = infoSourceName;
		infoSourceName = newInfoSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME, oldInfoSourceName, infoSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				return getSourceType();
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				return getInfoSourceName();
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
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				setSourceType((InfoSourceTypes)newValue);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				setInfoSourceName((String)newValue);
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
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				setInfoSourceName(INFO_SOURCE_NAME_EDEFAULT);
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
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				return INFO_SOURCE_NAME_EDEFAULT == null ? infoSourceName != null : !INFO_SOURCE_NAME_EDEFAULT.equals(infoSourceName);
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
		result.append(" (sourceType: ");
		result.append(sourceType);
		result.append(", infoSourceName: ");
		result.append(infoSourceName);
		result.append(')');
		return result.toString();
	}

} //IdentityAdapterImpl
