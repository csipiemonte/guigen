/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.JumpExtCommand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Ext Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.JumpExtCommandImpl#getStaticUrl <em>Static Url</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.JumpExtCommandImpl#getRuntimeUrlProvider <em>Runtime Url Provider</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.JumpExtCommandImpl#getLocationCode <em>Location Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpExtCommandImpl extends CommandImpl implements JumpExtCommand {
	/**
	 * The default value of the '{@link #getStaticUrl() <em>Static Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticUrl() <em>Static Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticUrl()
	 * @generated
	 * @ordered
	 */
	protected String staticUrl = STATIC_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuntimeUrlProvider() <em>Runtime Url Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeUrlProvider()
	 * @generated
	 * @ordered
	 */
	protected ApplicationData runtimeUrlProvider;

	/**
	 * The default value of the '{@link #getLocationCode() <em>Location Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationCode() <em>Location Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCode()
	 * @generated
	 * @ordered
	 */
	protected String locationCode = LOCATION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpExtCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.JUMP_EXT_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticUrl() {
		return staticUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticUrl(String newStaticUrl) {
		String oldStaticUrl = staticUrl;
		staticUrl = newStaticUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.JUMP_EXT_COMMAND__STATIC_URL, oldStaticUrl, staticUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationData getRuntimeUrlProvider() {
		if (runtimeUrlProvider != null && runtimeUrlProvider.eIsProxy()) {
			InternalEObject oldRuntimeUrlProvider = (InternalEObject)runtimeUrlProvider;
			runtimeUrlProvider = (ApplicationData)eResolveProxy(oldRuntimeUrlProvider);
			if (runtimeUrlProvider != oldRuntimeUrlProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER, oldRuntimeUrlProvider, runtimeUrlProvider));
			}
		}
		return runtimeUrlProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationData basicGetRuntimeUrlProvider() {
		return runtimeUrlProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeUrlProvider(ApplicationData newRuntimeUrlProvider) {
		ApplicationData oldRuntimeUrlProvider = runtimeUrlProvider;
		runtimeUrlProvider = newRuntimeUrlProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER, oldRuntimeUrlProvider, runtimeUrlProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationCode() {
		return locationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationCode(String newLocationCode) {
		String oldLocationCode = locationCode;
		locationCode = newLocationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.JUMP_EXT_COMMAND__LOCATION_CODE, oldLocationCode, locationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.JUMP_EXT_COMMAND__STATIC_URL:
				return getStaticUrl();
			case GuigenPackage.JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER:
				if (resolve) return getRuntimeUrlProvider();
				return basicGetRuntimeUrlProvider();
			case GuigenPackage.JUMP_EXT_COMMAND__LOCATION_CODE:
				return getLocationCode();
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
			case GuigenPackage.JUMP_EXT_COMMAND__STATIC_URL:
				setStaticUrl((String)newValue);
				return;
			case GuigenPackage.JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER:
				setRuntimeUrlProvider((ApplicationData)newValue);
				return;
			case GuigenPackage.JUMP_EXT_COMMAND__LOCATION_CODE:
				setLocationCode((String)newValue);
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
			case GuigenPackage.JUMP_EXT_COMMAND__STATIC_URL:
				setStaticUrl(STATIC_URL_EDEFAULT);
				return;
			case GuigenPackage.JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER:
				setRuntimeUrlProvider((ApplicationData)null);
				return;
			case GuigenPackage.JUMP_EXT_COMMAND__LOCATION_CODE:
				setLocationCode(LOCATION_CODE_EDEFAULT);
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
			case GuigenPackage.JUMP_EXT_COMMAND__STATIC_URL:
				return STATIC_URL_EDEFAULT == null ? staticUrl != null : !STATIC_URL_EDEFAULT.equals(staticUrl);
			case GuigenPackage.JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER:
				return runtimeUrlProvider != null;
			case GuigenPackage.JUMP_EXT_COMMAND__LOCATION_CODE:
				return LOCATION_CODE_EDEFAULT == null ? locationCode != null : !LOCATION_CODE_EDEFAULT.equals(locationCode);
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
		result.append(" (staticUrl: ");
		result.append(staticUrl);
		result.append(", locationCode: ");
		result.append(locationCode);
		result.append(')');
		return result.toString();
	}

} //JumpExtCommandImpl
