/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.PortalExposition;
import it.csi.mddtools.guigen.SecurityProfile;
import it.csi.mddtools.guigen.PortalProfile;
import it.csi.mddtools.guigen.TargetPlatform;
import it.csi.mddtools.guigen.TargetPlatformCodes;

import it.csi.mddtools.guigen.WAYFProfile;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#isEnableFatClient <em>Enable Fat Client</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#getPortalExpositions <em>Portal Expositions</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#getWayfProfile <em>Wayf Profile</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl#getSecurityProfile <em>Security Profile</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getPortalExpositions() <em>Portal Expositions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalExpositions()
	 * @generated
	 * @ordered
	 */
	protected EList<PortalExposition> portalExpositions;

	/**
	 * The cached value of the '{@link #getWayfProfile() <em>Wayf Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayfProfile()
	 * @generated
	 * @ordered
	 */
	protected WAYFProfile wayfProfile;

	/**
	 * The cached value of the '{@link #getSecurityProfile() <em>Security Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityProfile()
	 * @generated
	 * @ordered
	 */
	protected SecurityProfile securityProfile;

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
	public EList<PortalExposition> getPortalExpositions() {
		if (portalExpositions == null) {
			portalExpositions = new EObjectContainmentEList<PortalExposition>(PortalExposition.class, this, GuigenPackage.TARGET_PLATFORM__PORTAL_EXPOSITIONS);
		}
		return portalExpositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WAYFProfile getWayfProfile() {
		if (wayfProfile != null && wayfProfile.eIsProxy()) {
			InternalEObject oldWayfProfile = (InternalEObject)wayfProfile;
			wayfProfile = (WAYFProfile)eResolveProxy(oldWayfProfile);
			if (wayfProfile != oldWayfProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.TARGET_PLATFORM__WAYF_PROFILE, oldWayfProfile, wayfProfile));
			}
		}
		return wayfProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WAYFProfile basicGetWayfProfile() {
		return wayfProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWayfProfile(WAYFProfile newWayfProfile) {
		WAYFProfile oldWayfProfile = wayfProfile;
		wayfProfile = newWayfProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TARGET_PLATFORM__WAYF_PROFILE, oldWayfProfile, wayfProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityProfile getSecurityProfile() {
		if (securityProfile != null && securityProfile.eIsProxy()) {
			InternalEObject oldSecurityProfile = (InternalEObject)securityProfile;
			securityProfile = (SecurityProfile)eResolveProxy(oldSecurityProfile);
			if (securityProfile != oldSecurityProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.TARGET_PLATFORM__SECURITY_PROFILE, oldSecurityProfile, securityProfile));
			}
		}
		return securityProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityProfile basicGetSecurityProfile() {
		return securityProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityProfile(SecurityProfile newSecurityProfile) {
		SecurityProfile oldSecurityProfile = securityProfile;
		securityProfile = newSecurityProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TARGET_PLATFORM__SECURITY_PROFILE, oldSecurityProfile, securityProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.TARGET_PLATFORM__PORTAL_EXPOSITIONS:
				return ((InternalEList<?>)getPortalExpositions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case GuigenPackage.TARGET_PLATFORM__PORTAL_EXPOSITIONS:
				return getPortalExpositions();
			case GuigenPackage.TARGET_PLATFORM__WAYF_PROFILE:
				if (resolve) return getWayfProfile();
				return basicGetWayfProfile();
			case GuigenPackage.TARGET_PLATFORM__SECURITY_PROFILE:
				if (resolve) return getSecurityProfile();
				return basicGetSecurityProfile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
			case GuigenPackage.TARGET_PLATFORM__PORTAL_EXPOSITIONS:
				getPortalExpositions().clear();
				getPortalExpositions().addAll((Collection<? extends PortalExposition>)newValue);
				return;
			case GuigenPackage.TARGET_PLATFORM__WAYF_PROFILE:
				setWayfProfile((WAYFProfile)newValue);
				return;
			case GuigenPackage.TARGET_PLATFORM__SECURITY_PROFILE:
				setSecurityProfile((SecurityProfile)newValue);
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
			case GuigenPackage.TARGET_PLATFORM__PORTAL_EXPOSITIONS:
				getPortalExpositions().clear();
				return;
			case GuigenPackage.TARGET_PLATFORM__WAYF_PROFILE:
				setWayfProfile((WAYFProfile)null);
				return;
			case GuigenPackage.TARGET_PLATFORM__SECURITY_PROFILE:
				setSecurityProfile((SecurityProfile)null);
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
			case GuigenPackage.TARGET_PLATFORM__PORTAL_EXPOSITIONS:
				return portalExpositions != null && !portalExpositions.isEmpty();
			case GuigenPackage.TARGET_PLATFORM__WAYF_PROFILE:
				return wayfProfile != null;
			case GuigenPackage.TARGET_PLATFORM__SECURITY_PROFILE:
				return securityProfile != null;
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

		StringBuilder result = new StringBuilder(super.toString());
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
