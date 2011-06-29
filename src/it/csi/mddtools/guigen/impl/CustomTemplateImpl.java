/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.CustomTemplate;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.ModelSlotDef;

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
 * An implementation of the model object '<em><b>Custom Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.CustomTemplateImpl#getTplID <em>Tpl ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.CustomTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.CustomTemplateImpl#getModelSlots <em>Model Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomTemplateImpl extends EObjectImpl implements CustomTemplate {
	/**
	 * The default value of the '{@link #getTplID() <em>Tpl ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTplID()
	 * @generated
	 * @ordered
	 */
	protected static final String TPL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTplID() <em>Tpl ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTplID()
	 * @generated
	 * @ordered
	 */
	protected String tplID = TPL_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getModelSlots() <em>Model Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelSlotDef> modelSlots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.CUSTOM_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTplID() {
		return tplID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTplID(String newTplID) {
		String oldTplID = tplID;
		tplID = newTplID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CUSTOM_TEMPLATE__TPL_ID, oldTplID, tplID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CUSTOM_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelSlotDef> getModelSlots() {
		if (modelSlots == null) {
			modelSlots = new EObjectContainmentEList<ModelSlotDef>(ModelSlotDef.class, this, GuigenPackage.CUSTOM_TEMPLATE__MODEL_SLOTS);
		}
		return modelSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.CUSTOM_TEMPLATE__MODEL_SLOTS:
				return ((InternalEList<?>)getModelSlots()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.CUSTOM_TEMPLATE__TPL_ID:
				return getTplID();
			case GuigenPackage.CUSTOM_TEMPLATE__NAME:
				return getName();
			case GuigenPackage.CUSTOM_TEMPLATE__MODEL_SLOTS:
				return getModelSlots();
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
			case GuigenPackage.CUSTOM_TEMPLATE__TPL_ID:
				setTplID((String)newValue);
				return;
			case GuigenPackage.CUSTOM_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.CUSTOM_TEMPLATE__MODEL_SLOTS:
				getModelSlots().clear();
				getModelSlots().addAll((Collection<? extends ModelSlotDef>)newValue);
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
			case GuigenPackage.CUSTOM_TEMPLATE__TPL_ID:
				setTplID(TPL_ID_EDEFAULT);
				return;
			case GuigenPackage.CUSTOM_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.CUSTOM_TEMPLATE__MODEL_SLOTS:
				getModelSlots().clear();
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
			case GuigenPackage.CUSTOM_TEMPLATE__TPL_ID:
				return TPL_ID_EDEFAULT == null ? tplID != null : !TPL_ID_EDEFAULT.equals(tplID);
			case GuigenPackage.CUSTOM_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.CUSTOM_TEMPLATE__MODEL_SLOTS:
				return modelSlots != null && !modelSlots.isEmpty();
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
		result.append(" (tplID: ");
		result.append(tplID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CustomTemplateImpl
