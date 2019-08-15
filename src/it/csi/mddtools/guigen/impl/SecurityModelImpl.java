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

import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.AutenticationMethod;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.LogoutActionTypes;
import it.csi.mddtools.guigen.Role;
import it.csi.mddtools.guigen.SecurityModel;
import it.csi.mddtools.guigen.UseCase;

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
 * An implementation of the model object '<em><b>Security Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityModelImpl#getAutenticationMethod <em>Autentication Method</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityModelImpl#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityModelImpl#getSecurityAppID <em>Security App ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityModelImpl#getUserInfoLogoutAction <em>User Info Logout Action</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityModelImpl#isAskForConfirmationOnLogout <em>Ask For Confirmation On Logout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityModelImpl extends EObjectImpl implements SecurityModel {
	/**
	 * The cached value of the '{@link #getAutenticationMethod() <em>Autentication Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected AutenticationMethod autenticationMethod;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCases;

	/**
	 * The default value of the '{@link #getSecurityAppID() <em>Security App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityAppID()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityAppID() <em>Security App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityAppID()
	 * @generated
	 * @ordered
	 */
	protected String securityAppID = SECURITY_APP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The default value of the '{@link #getUserInfoLogoutAction() <em>User Info Logout Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInfoLogoutAction()
	 * @generated
	 * @ordered
	 */
	protected static final LogoutActionTypes USER_INFO_LOGOUT_ACTION_EDEFAULT = LogoutActionTypes.LOCAL_LOGOUT;

	/**
	 * The cached value of the '{@link #getUserInfoLogoutAction() <em>User Info Logout Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInfoLogoutAction()
	 * @generated
	 * @ordered
	 */
	protected LogoutActionTypes userInfoLogoutAction = USER_INFO_LOGOUT_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAskForConfirmationOnLogout() <em>Ask For Confirmation On Logout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAskForConfirmationOnLogout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASK_FOR_CONFIRMATION_ON_LOGOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAskForConfirmationOnLogout() <em>Ask For Confirmation On Logout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAskForConfirmationOnLogout()
	 * @generated
	 * @ordered
	 */
	protected boolean askForConfirmationOnLogout = ASK_FOR_CONFIRMATION_ON_LOGOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.SECURITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutenticationMethod getAutenticationMethod() {
		return autenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutenticationMethod(AutenticationMethod newAutenticationMethod, NotificationChain msgs) {
		AutenticationMethod oldAutenticationMethod = autenticationMethod;
		autenticationMethod = newAutenticationMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD, oldAutenticationMethod, newAutenticationMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutenticationMethod(AutenticationMethod newAutenticationMethod) {
		if (newAutenticationMethod != autenticationMethod) {
			NotificationChain msgs = null;
			if (autenticationMethod != null)
				msgs = ((InternalEObject)autenticationMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD, null, msgs);
			if (newAutenticationMethod != null)
				msgs = ((InternalEObject)newAutenticationMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD, null, msgs);
			msgs = basicSetAutenticationMethod(newAutenticationMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD, newAutenticationMethod, newAutenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, GuigenPackage.SECURITY_MODEL__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCases() {
		if (useCases == null) {
			useCases = new EObjectContainmentEList<UseCase>(UseCase.class, this, GuigenPackage.SECURITY_MODEL__USE_CASES);
		}
		return useCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityAppID() {
		return securityAppID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityAppID(String newSecurityAppID) {
		String oldSecurityAppID = securityAppID;
		securityAppID = newSecurityAppID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_MODEL__SECURITY_APP_ID, oldSecurityAppID, securityAppID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, GuigenPackage.SECURITY_MODEL__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoutActionTypes getUserInfoLogoutAction() {
		return userInfoLogoutAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserInfoLogoutAction(LogoutActionTypes newUserInfoLogoutAction) {
		LogoutActionTypes oldUserInfoLogoutAction = userInfoLogoutAction;
		userInfoLogoutAction = newUserInfoLogoutAction == null ? USER_INFO_LOGOUT_ACTION_EDEFAULT : newUserInfoLogoutAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_MODEL__USER_INFO_LOGOUT_ACTION, oldUserInfoLogoutAction, userInfoLogoutAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAskForConfirmationOnLogout() {
		return askForConfirmationOnLogout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAskForConfirmationOnLogout(boolean newAskForConfirmationOnLogout) {
		boolean oldAskForConfirmationOnLogout = askForConfirmationOnLogout;
		askForConfirmationOnLogout = newAskForConfirmationOnLogout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT, oldAskForConfirmationOnLogout, askForConfirmationOnLogout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD:
				return basicSetAutenticationMethod(null, msgs);
			case GuigenPackage.SECURITY_MODEL__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case GuigenPackage.SECURITY_MODEL__USE_CASES:
				return ((InternalEList<?>)getUseCases()).basicRemove(otherEnd, msgs);
			case GuigenPackage.SECURITY_MODEL__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD:
				return getAutenticationMethod();
			case GuigenPackage.SECURITY_MODEL__ACTORS:
				return getActors();
			case GuigenPackage.SECURITY_MODEL__USE_CASES:
				return getUseCases();
			case GuigenPackage.SECURITY_MODEL__SECURITY_APP_ID:
				return getSecurityAppID();
			case GuigenPackage.SECURITY_MODEL__ROLES:
				return getRoles();
			case GuigenPackage.SECURITY_MODEL__USER_INFO_LOGOUT_ACTION:
				return getUserInfoLogoutAction();
			case GuigenPackage.SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT:
				return isAskForConfirmationOnLogout();
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
			case GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD:
				setAutenticationMethod((AutenticationMethod)newValue);
				return;
			case GuigenPackage.SECURITY_MODEL__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case GuigenPackage.SECURITY_MODEL__USE_CASES:
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>)newValue);
				return;
			case GuigenPackage.SECURITY_MODEL__SECURITY_APP_ID:
				setSecurityAppID((String)newValue);
				return;
			case GuigenPackage.SECURITY_MODEL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GuigenPackage.SECURITY_MODEL__USER_INFO_LOGOUT_ACTION:
				setUserInfoLogoutAction((LogoutActionTypes)newValue);
				return;
			case GuigenPackage.SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT:
				setAskForConfirmationOnLogout((Boolean)newValue);
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
			case GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD:
				setAutenticationMethod((AutenticationMethod)null);
				return;
			case GuigenPackage.SECURITY_MODEL__ACTORS:
				getActors().clear();
				return;
			case GuigenPackage.SECURITY_MODEL__USE_CASES:
				getUseCases().clear();
				return;
			case GuigenPackage.SECURITY_MODEL__SECURITY_APP_ID:
				setSecurityAppID(SECURITY_APP_ID_EDEFAULT);
				return;
			case GuigenPackage.SECURITY_MODEL__ROLES:
				getRoles().clear();
				return;
			case GuigenPackage.SECURITY_MODEL__USER_INFO_LOGOUT_ACTION:
				setUserInfoLogoutAction(USER_INFO_LOGOUT_ACTION_EDEFAULT);
				return;
			case GuigenPackage.SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT:
				setAskForConfirmationOnLogout(ASK_FOR_CONFIRMATION_ON_LOGOUT_EDEFAULT);
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
			case GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD:
				return autenticationMethod != null;
			case GuigenPackage.SECURITY_MODEL__ACTORS:
				return actors != null && !actors.isEmpty();
			case GuigenPackage.SECURITY_MODEL__USE_CASES:
				return useCases != null && !useCases.isEmpty();
			case GuigenPackage.SECURITY_MODEL__SECURITY_APP_ID:
				return SECURITY_APP_ID_EDEFAULT == null ? securityAppID != null : !SECURITY_APP_ID_EDEFAULT.equals(securityAppID);
			case GuigenPackage.SECURITY_MODEL__ROLES:
				return roles != null && !roles.isEmpty();
			case GuigenPackage.SECURITY_MODEL__USER_INFO_LOGOUT_ACTION:
				return userInfoLogoutAction != USER_INFO_LOGOUT_ACTION_EDEFAULT;
			case GuigenPackage.SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT:
				return askForConfirmationOnLogout != ASK_FOR_CONFIRMATION_ON_LOGOUT_EDEFAULT;
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
		result.append(" (securityAppID: ");
		result.append(securityAppID);
		result.append(", userInfoLogoutAction: ");
		result.append(userInfoLogoutAction);
		result.append(", askForConfirmationOnLogout: ");
		result.append(askForConfirmationOnLogout);
		result.append(')');
		return result.toString();
	}

} //SecurityModelImpl
