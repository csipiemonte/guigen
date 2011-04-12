/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.PortalExposition;
import it.csi.mddtools.guigen.PortalProfile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Exposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.PortalExpositionImpl#getPortal <em>Portal</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PortalExpositionImpl#getAreaCode <em>Area Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortalExpositionImpl extends EObjectImpl implements PortalExposition {
	/**
	 * The cached value of the '{@link #getPortal() <em>Portal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortal()
	 * @generated
	 * @ordered
	 */
	protected PortalProfile portal;

	/**
	 * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected String areaCode = AREA_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortalExpositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.PORTAL_EXPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalProfile getPortal() {
		if (portal != null && portal.eIsProxy()) {
			InternalEObject oldPortal = (InternalEObject)portal;
			portal = (PortalProfile)eResolveProxy(oldPortal);
			if (portal != oldPortal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.PORTAL_EXPOSITION__PORTAL, oldPortal, portal));
			}
		}
		return portal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalProfile basicGetPortal() {
		return portal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortal(PortalProfile newPortal) {
		PortalProfile oldPortal = portal;
		portal = newPortal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PORTAL_EXPOSITION__PORTAL, oldPortal, portal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaCode(String newAreaCode) {
		String oldAreaCode = areaCode;
		areaCode = newAreaCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PORTAL_EXPOSITION__AREA_CODE, oldAreaCode, areaCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.PORTAL_EXPOSITION__PORTAL:
				if (resolve) return getPortal();
				return basicGetPortal();
			case GuigenPackage.PORTAL_EXPOSITION__AREA_CODE:
				return getAreaCode();
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
			case GuigenPackage.PORTAL_EXPOSITION__PORTAL:
				setPortal((PortalProfile)newValue);
				return;
			case GuigenPackage.PORTAL_EXPOSITION__AREA_CODE:
				setAreaCode((String)newValue);
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
			case GuigenPackage.PORTAL_EXPOSITION__PORTAL:
				setPortal((PortalProfile)null);
				return;
			case GuigenPackage.PORTAL_EXPOSITION__AREA_CODE:
				setAreaCode(AREA_CODE_EDEFAULT);
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
			case GuigenPackage.PORTAL_EXPOSITION__PORTAL:
				return portal != null;
			case GuigenPackage.PORTAL_EXPOSITION__AREA_CODE:
				return AREA_CODE_EDEFAULT == null ? areaCode != null : !AREA_CODE_EDEFAULT.equals(areaCode);
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
		result.append(" (areaCode: ");
		result.append(areaCode);
		result.append(')');
		return result.toString();
	}

} //PortalExpositionImpl
