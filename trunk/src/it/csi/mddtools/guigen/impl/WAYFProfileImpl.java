/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.WAYFProfile;
import it.csi.mddtools.guigen.WAYFRequestAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WAYF Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.WAYFProfileImpl#getRequestAdapter <em>Request Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WAYFProfileImpl extends EObjectImpl implements WAYFProfile {
	/**
	 * The cached value of the '{@link #getRequestAdapter() <em>Request Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAdapter()
	 * @generated
	 * @ordered
	 */
	protected WAYFRequestAdapter requestAdapter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WAYFProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.WAYF_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WAYFRequestAdapter getRequestAdapter() {
		return requestAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestAdapter(WAYFRequestAdapter newRequestAdapter, NotificationChain msgs) {
		WAYFRequestAdapter oldRequestAdapter = requestAdapter;
		requestAdapter = newRequestAdapter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER, oldRequestAdapter, newRequestAdapter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestAdapter(WAYFRequestAdapter newRequestAdapter) {
		if (newRequestAdapter != requestAdapter) {
			NotificationChain msgs = null;
			if (requestAdapter != null)
				msgs = ((InternalEObject)requestAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER, null, msgs);
			if (newRequestAdapter != null)
				msgs = ((InternalEObject)newRequestAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER, null, msgs);
			msgs = basicSetRequestAdapter(newRequestAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER, newRequestAdapter, newRequestAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER:
				return basicSetRequestAdapter(null, msgs);
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
			case GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER:
				return getRequestAdapter();
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
			case GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER:
				setRequestAdapter((WAYFRequestAdapter)newValue);
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
			case GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER:
				setRequestAdapter((WAYFRequestAdapter)null);
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
			case GuigenPackage.WAYF_PROFILE__REQUEST_ADAPTER:
				return requestAdapter != null;
		}
		return super.eIsSet(featureID);
	}

} //WAYFProfileImpl
