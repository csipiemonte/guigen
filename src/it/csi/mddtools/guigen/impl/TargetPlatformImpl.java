/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.TargetPlatform;
import it.csi.mddtools.guigen.TargetPlatformCodes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#isEnableFatClient <em>Enable Fat Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetPlatformImpl extends EObjectImpl implements TargetPlatform {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final TargetPlatformCodes CODE_EDEFAULT = TargetPlatformCodes.WLS92;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected TargetPlatformCodes code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableRichUIBehavior() <em>Enable Rich UI Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableRichUIBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_RICH_UI_BEHAVIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableRichUIBehavior() <em>Enable Rich UI Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableRichUIBehavior()
	 * @generated
	 * @ordered
	 */
	protected boolean enableRichUIBehavior = ENABLE_RICH_UI_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableFatClient() <em>Enable Fat Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableFatClient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_FAT_CLIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableFatClient() <em>Enable Fat Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableFatClient()
	 * @generated
	 * @ordered
	 */
	protected boolean enableFatClient = ENABLE_FAT_CLIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TARGET_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformCodes getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(TargetPlatformCodes newCode) {
		TargetPlatformCodes oldCode = code;
		code = newCode == null ? CODE_EDEFAULT : newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TARGET_PLATFORM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableRichUIBehavior() {
		return enableRichUIBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableRichUIBehavior(boolean newEnableRichUIBehavior) {
		boolean oldEnableRichUIBehavior = enableRichUIBehavior;
		enableRichUIBehavior = newEnableRichUIBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR, oldEnableRichUIBehavior, enableRichUIBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableFatClient() {
		return enableFatClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableFatClient(boolean newEnableFatClient) {
		boolean oldEnableFatClient = enableFatClient;
		enableFatClient = newEnableFatClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TARGET_PLATFORM__ENABLE_FAT_CLIENT, oldEnableFatClient, enableFatClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.TARGET_PLATFORM__CODE:
				return getCode();
			case GuigenPackage.TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR:
				return isEnableRichUIBehavior();
			case GuigenPackage.TARGET_PLATFORM__ENABLE_FAT_CLIENT:
				return isEnableFatClient();
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
			case GuigenPackage.TARGET_PLATFORM__CODE:
				setCode((TargetPlatformCodes)newValue);
				return;
			case GuigenPackage.TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR:
				setEnableRichUIBehavior((Boolean)newValue);
				return;
			case GuigenPackage.TARGET_PLATFORM__ENABLE_FAT_CLIENT:
				setEnableFatClient((Boolean)newValue);
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
			case GuigenPackage.TARGET_PLATFORM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GuigenPackage.TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR:
				setEnableRichUIBehavior(ENABLE_RICH_UI_BEHAVIOR_EDEFAULT);
				return;
			case GuigenPackage.TARGET_PLATFORM__ENABLE_FAT_CLIENT:
				setEnableFatClient(ENABLE_FAT_CLIENT_EDEFAULT);
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
			case GuigenPackage.TARGET_PLATFORM__CODE:
				return code != CODE_EDEFAULT;
			case GuigenPackage.TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR:
				return enableRichUIBehavior != ENABLE_RICH_UI_BEHAVIOR_EDEFAULT;
			case GuigenPackage.TARGET_PLATFORM__ENABLE_FAT_CLIENT:
				return enableFatClient != ENABLE_FAT_CLIENT_EDEFAULT;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", enableRichUIBehavior: ");
		result.append(enableRichUIBehavior);
		result.append(", enableFatClient: ");
		result.append(enableFatClient);
		result.append(')');
		return result.toString();
	}

} //TargetPlatformImpl
