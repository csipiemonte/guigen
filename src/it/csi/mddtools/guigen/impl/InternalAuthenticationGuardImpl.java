/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.EnvConfigParams;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.InternalAuthenticationGuard;
import it.csi.mddtools.guigen.LoginModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Authentication Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.InternalAuthenticationGuardImpl#getLoginModule <em>Login Module</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.InternalAuthenticationGuardImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalAuthenticationGuardImpl extends EObjectImpl implements InternalAuthenticationGuard {
	/**
	 * The cached value of the '{@link #getLoginModule() <em>Login Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginModule()
	 * @generated
	 * @ordered
	 */
	protected LoginModule loginModule;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EnvConfigParams params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalAuthenticationGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.INTERNAL_AUTHENTICATION_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginModule getLoginModule() {
		return loginModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoginModule(LoginModule newLoginModule, NotificationChain msgs) {
		LoginModule oldLoginModule = loginModule;
		loginModule = newLoginModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE, oldLoginModule, newLoginModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginModule(LoginModule newLoginModule) {
		if (newLoginModule != loginModule) {
			NotificationChain msgs = null;
			if (loginModule != null)
				msgs = ((InternalEObject)loginModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE, null, msgs);
			if (newLoginModule != null)
				msgs = ((InternalEObject)newLoginModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE, null, msgs);
			msgs = basicSetLoginModule(newLoginModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE, newLoginModule, newLoginModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvConfigParams getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(EnvConfigParams newParams, NotificationChain msgs) {
		EnvConfigParams oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(EnvConfigParams newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE:
				return basicSetLoginModule(null, msgs);
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS:
				return basicSetParams(null, msgs);
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
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE:
				return getLoginModule();
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS:
				return getParams();
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
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE:
				setLoginModule((LoginModule)newValue);
				return;
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS:
				setParams((EnvConfigParams)newValue);
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
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE:
				setLoginModule((LoginModule)null);
				return;
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS:
				setParams((EnvConfigParams)null);
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
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE:
				return loginModule != null;
			case GuigenPackage.INTERNAL_AUTHENTICATION_GUARD__PARAMS:
				return params != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalAuthenticationGuardImpl
