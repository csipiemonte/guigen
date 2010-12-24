/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.RepartModule;
import it.csi.mddtools.guigen.RepartArtifact;
import it.csi.mddtools.guigen.WebResModuleDeployTypes;
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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Resource Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.WebResourceModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WebResourceModuleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WebResourceModuleImpl#getDeploymentType <em>Deployment Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WebResourceModuleImpl#getRepartModule <em>Repart Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WebResourceModuleImpl extends EObjectImpl implements WebResourceModule {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentType() <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentType()
	 * @generated
	 * @ordered
	 */
	protected static final WebResModuleDeployTypes DEPLOYMENT_TYPE_EDEFAULT = WebResModuleDeployTypes.APPSERVER;

	/**
	 * The cached value of the '{@link #getDeploymentType() <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentType()
	 * @generated
	 * @ordered
	 */
	protected WebResModuleDeployTypes deploymentType = DEPLOYMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepartModule() <em>Repart Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepartModule()
	 * @generated
	 * @ordered
	 */
	protected RepartModule repartModule;

	/**
	 * This is true if the Repart Module containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repartModuleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebResourceModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.WEB_RESOURCE_MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WEB_RESOURCE_MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WEB_RESOURCE_MODULE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepartModule getRepartModule() {
		return repartModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepartModule(RepartModule newRepartModule, NotificationChain msgs) {
		RepartModule oldRepartModule = repartModule;
		repartModule = newRepartModule;
		boolean oldRepartModuleESet = repartModuleESet;
		repartModuleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE, oldRepartModule, newRepartModule, !oldRepartModuleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepartModule(RepartModule newRepartModule) {
		if (newRepartModule != repartModule) {
			NotificationChain msgs = null;
			if (repartModule != null)
				msgs = ((InternalEObject)repartModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE, null, msgs);
			if (newRepartModule != null)
				msgs = ((InternalEObject)newRepartModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE, null, msgs);
			msgs = basicSetRepartModule(newRepartModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRepartModuleESet = repartModuleESet;
			repartModuleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE, newRepartModule, newRepartModule, !oldRepartModuleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRepartModule(NotificationChain msgs) {
		RepartModule oldRepartModule = repartModule;
		repartModule = null;
		boolean oldRepartModuleESet = repartModuleESet;
		repartModuleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE, oldRepartModule, null, oldRepartModuleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepartModule() {
		if (repartModule != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)repartModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE, null, msgs);
			msgs = basicUnsetRepartModule(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRepartModuleESet = repartModuleESet;
			repartModuleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE, null, null, oldRepartModuleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepartModule() {
		return repartModuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE:
				return basicUnsetRepartModule(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebResModuleDeployTypes getDeploymentType() {
		return deploymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentType(WebResModuleDeployTypes newDeploymentType) {
		WebResModuleDeployTypes oldDeploymentType = deploymentType;
		deploymentType = newDeploymentType == null ? DEPLOYMENT_TYPE_EDEFAULT : newDeploymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE, oldDeploymentType, deploymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.WEB_RESOURCE_MODULE__NAME:
				return getName();
			case GuigenPackage.WEB_RESOURCE_MODULE__VERSION:
				return getVersion();
			case GuigenPackage.WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE:
				return getDeploymentType();
			case GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE:
				return getRepartModule();
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
			case GuigenPackage.WEB_RESOURCE_MODULE__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.WEB_RESOURCE_MODULE__VERSION:
				setVersion((String)newValue);
				return;
			case GuigenPackage.WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE:
				setDeploymentType((WebResModuleDeployTypes)newValue);
				return;
			case GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE:
				setRepartModule((RepartModule)newValue);
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
			case GuigenPackage.WEB_RESOURCE_MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.WEB_RESOURCE_MODULE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GuigenPackage.WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE:
				setDeploymentType(DEPLOYMENT_TYPE_EDEFAULT);
				return;
			case GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE:
				unsetRepartModule();
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
			case GuigenPackage.WEB_RESOURCE_MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.WEB_RESOURCE_MODULE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case GuigenPackage.WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE:
				return deploymentType != DEPLOYMENT_TYPE_EDEFAULT;
			case GuigenPackage.WEB_RESOURCE_MODULE__REPART_MODULE:
				return isSetRepartModule();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", deploymentType: ");
		result.append(deploymentType);
		result.append(')');
		return result.toString();
	}

} //WebResourceModuleImpl
