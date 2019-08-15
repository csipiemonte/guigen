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
import it.csi.mddtools.guigen.PortalProfile;
import it.csi.mddtools.guigen.WebResourceModule;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.PortalProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PortalProfileImpl#getResModules <em>Res Modules</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PortalProfileImpl#getWhereAreYouFromPortalCode <em>Where Are You From Portal Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PortalProfileImpl#getResourceProviderCode <em>Resource Provider Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortalProfileImpl extends EObjectImpl implements PortalProfile {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResModules() <em>Res Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResModules()
	 * @generated
	 * @ordered
	 */
	protected EList<WebResourceModule> resModules;

	/**
	 * The default value of the '{@link #getWhereAreYouFromPortalCode() <em>Where Are You From Portal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereAreYouFromPortalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String WHERE_ARE_YOU_FROM_PORTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhereAreYouFromPortalCode() <em>Where Are You From Portal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereAreYouFromPortalCode()
	 * @generated
	 * @ordered
	 */
	protected String whereAreYouFromPortalCode = WHERE_ARE_YOU_FROM_PORTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceProviderCode() <em>Resource Provider Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProviderCode()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_PROVIDER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceProviderCode() <em>Resource Provider Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProviderCode()
	 * @generated
	 * @ordered
	 */
	protected String resourceProviderCode = RESOURCE_PROVIDER_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortalProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.PORTAL_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PORTAL_PROFILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebResourceModule> getResModules() {
		if (resModules == null) {
			resModules = new EObjectContainmentEList<WebResourceModule>(WebResourceModule.class, this, GuigenPackage.PORTAL_PROFILE__RES_MODULES);
		}
		return resModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhereAreYouFromPortalCode() {
		return whereAreYouFromPortalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereAreYouFromPortalCode(String newWhereAreYouFromPortalCode) {
		String oldWhereAreYouFromPortalCode = whereAreYouFromPortalCode;
		whereAreYouFromPortalCode = newWhereAreYouFromPortalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PORTAL_PROFILE__WHERE_ARE_YOU_FROM_PORTAL_CODE, oldWhereAreYouFromPortalCode, whereAreYouFromPortalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceProviderCode() {
		return resourceProviderCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceProviderCode(String newResourceProviderCode) {
		String oldResourceProviderCode = resourceProviderCode;
		resourceProviderCode = newResourceProviderCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PORTAL_PROFILE__RESOURCE_PROVIDER_CODE, oldResourceProviderCode, resourceProviderCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.PORTAL_PROFILE__RES_MODULES:
				return ((InternalEList<?>)getResModules()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.PORTAL_PROFILE__NAME:
				return getName();
			case GuigenPackage.PORTAL_PROFILE__RES_MODULES:
				return getResModules();
			case GuigenPackage.PORTAL_PROFILE__WHERE_ARE_YOU_FROM_PORTAL_CODE:
				return getWhereAreYouFromPortalCode();
			case GuigenPackage.PORTAL_PROFILE__RESOURCE_PROVIDER_CODE:
				return getResourceProviderCode();
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
			case GuigenPackage.PORTAL_PROFILE__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.PORTAL_PROFILE__RES_MODULES:
				getResModules().clear();
				getResModules().addAll((Collection<? extends WebResourceModule>)newValue);
				return;
			case GuigenPackage.PORTAL_PROFILE__WHERE_ARE_YOU_FROM_PORTAL_CODE:
				setWhereAreYouFromPortalCode((String)newValue);
				return;
			case GuigenPackage.PORTAL_PROFILE__RESOURCE_PROVIDER_CODE:
				setResourceProviderCode((String)newValue);
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
			case GuigenPackage.PORTAL_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.PORTAL_PROFILE__RES_MODULES:
				getResModules().clear();
				return;
			case GuigenPackage.PORTAL_PROFILE__WHERE_ARE_YOU_FROM_PORTAL_CODE:
				setWhereAreYouFromPortalCode(WHERE_ARE_YOU_FROM_PORTAL_CODE_EDEFAULT);
				return;
			case GuigenPackage.PORTAL_PROFILE__RESOURCE_PROVIDER_CODE:
				setResourceProviderCode(RESOURCE_PROVIDER_CODE_EDEFAULT);
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
			case GuigenPackage.PORTAL_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.PORTAL_PROFILE__RES_MODULES:
				return resModules != null && !resModules.isEmpty();
			case GuigenPackage.PORTAL_PROFILE__WHERE_ARE_YOU_FROM_PORTAL_CODE:
				return WHERE_ARE_YOU_FROM_PORTAL_CODE_EDEFAULT == null ? whereAreYouFromPortalCode != null : !WHERE_ARE_YOU_FROM_PORTAL_CODE_EDEFAULT.equals(whereAreYouFromPortalCode);
			case GuigenPackage.PORTAL_PROFILE__RESOURCE_PROVIDER_CODE:
				return RESOURCE_PROVIDER_CODE_EDEFAULT == null ? resourceProviderCode != null : !RESOURCE_PROVIDER_CODE_EDEFAULT.equals(resourceProviderCode);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", whereAreYouFromPortalCode: ");
		result.append(whereAreYouFromPortalCode);
		result.append(", resourceProviderCode: ");
		result.append(resourceProviderCode);
		result.append(')');
		return result.toString();
	}

} //PortalProfileImpl
