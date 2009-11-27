/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppModule;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.GuigenPackage;

import it.csi.mddtools.guigen.SecurityModel;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppModuleImpl#getContentPanels <em>Content Panels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppModuleImpl#getExtSecurityModel <em>Ext Security Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppModuleImpl extends EObjectImpl implements AppModule {
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
	 * The cached value of the '{@link #getContentPanels() <em>Content Panels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPanels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentPanel> contentPanels;

	/**
	 * The cached value of the '{@link #getExtSecurityModel() <em>Ext Security Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtSecurityModel()
	 * @generated
	 * @ordered
	 */
	protected SecurityModel extSecurityModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.APP_MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentPanel> getContentPanels() {
		if (contentPanels == null) {
			contentPanels = new EObjectContainmentEList<ContentPanel>(ContentPanel.class, this, GuigenPackage.APP_MODULE__CONTENT_PANELS);
		}
		return contentPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModel getExtSecurityModel() {
		if (extSecurityModel != null && extSecurityModel.eIsProxy()) {
			InternalEObject oldExtSecurityModel = (InternalEObject)extSecurityModel;
			extSecurityModel = (SecurityModel)eResolveProxy(oldExtSecurityModel);
			if (extSecurityModel != oldExtSecurityModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.APP_MODULE__EXT_SECURITY_MODEL, oldExtSecurityModel, extSecurityModel));
			}
		}
		return extSecurityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModel basicGetExtSecurityModel() {
		return extSecurityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtSecurityModel(SecurityModel newExtSecurityModel) {
		SecurityModel oldExtSecurityModel = extSecurityModel;
		extSecurityModel = newExtSecurityModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_MODULE__EXT_SECURITY_MODEL, oldExtSecurityModel, extSecurityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.APP_MODULE__CONTENT_PANELS:
				return ((InternalEList<?>)getContentPanels()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.APP_MODULE__NAME:
				return getName();
			case GuigenPackage.APP_MODULE__CONTENT_PANELS:
				return getContentPanels();
			case GuigenPackage.APP_MODULE__EXT_SECURITY_MODEL:
				if (resolve) return getExtSecurityModel();
				return basicGetExtSecurityModel();
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
			case GuigenPackage.APP_MODULE__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.APP_MODULE__CONTENT_PANELS:
				getContentPanels().clear();
				getContentPanels().addAll((Collection<? extends ContentPanel>)newValue);
				return;
			case GuigenPackage.APP_MODULE__EXT_SECURITY_MODEL:
				setExtSecurityModel((SecurityModel)newValue);
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
			case GuigenPackage.APP_MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.APP_MODULE__CONTENT_PANELS:
				getContentPanels().clear();
				return;
			case GuigenPackage.APP_MODULE__EXT_SECURITY_MODEL:
				setExtSecurityModel((SecurityModel)null);
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
			case GuigenPackage.APP_MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.APP_MODULE__CONTENT_PANELS:
				return contentPanels != null && !contentPanels.isEmpty();
			case GuigenPackage.APP_MODULE__EXT_SECURITY_MODEL:
				return extSecurityModel != null;
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
		result.append(')');
		return result.toString();
	}

} //AppModuleImpl
