/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ActivationModel;
import it.csi.mddtools.guigen.ActivationParam;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ActivationModelImpl#getActivationParams <em>Activation Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationModelImpl extends EObjectImpl implements ActivationModel {
	/**
	 * The cached value of the '{@link #getActivationParams() <em>Activation Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationParams()
	 * @generated
	 * @ordered
	 */
	protected ActivationParam activationParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.ACTIVATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationParam getActivationParams() {
		return activationParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationParams(ActivationParam newActivationParams, NotificationChain msgs) {
		ActivationParam oldActivationParams = activationParams;
		activationParams = newActivationParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS, oldActivationParams, newActivationParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationParams(ActivationParam newActivationParams) {
		if (newActivationParams != activationParams) {
			NotificationChain msgs = null;
			if (activationParams != null)
				msgs = ((InternalEObject)activationParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS, null, msgs);
			if (newActivationParams != null)
				msgs = ((InternalEObject)newActivationParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS, null, msgs);
			msgs = basicSetActivationParams(newActivationParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS, newActivationParams, newActivationParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS:
				return basicSetActivationParams(null, msgs);
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
			case GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS:
				return getActivationParams();
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
			case GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS:
				setActivationParams((ActivationParam)newValue);
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
			case GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS:
				setActivationParams((ActivationParam)null);
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
			case GuigenPackage.ACTIVATION_MODEL__ACTIVATION_PARAMS:
				return activationParams != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivationModelImpl
