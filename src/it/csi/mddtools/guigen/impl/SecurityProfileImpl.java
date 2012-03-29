/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ExternalAuthenticationGuard;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.IdentityAdapter;
import it.csi.mddtools.guigen.InternalAuthenticationGuard;
import it.csi.mddtools.guigen.PEPImplementation;
import it.csi.mddtools.guigen.SecurityProfile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityProfileImpl#getExtAuthGuard <em>Ext Auth Guard</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityProfileImpl#getIntAuthGuard <em>Int Auth Guard</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityProfileImpl#getIdAdapter <em>Id Adapter</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SecurityProfileImpl#getPepImpl <em>Pep Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityProfileImpl extends EObjectImpl implements SecurityProfile {
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
	 * The cached value of the '{@link #getExtAuthGuard() <em>Ext Auth Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtAuthGuard()
	 * @generated
	 * @ordered
	 */
	protected ExternalAuthenticationGuard extAuthGuard;

	/**
	 * The cached value of the '{@link #getIntAuthGuard() <em>Int Auth Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntAuthGuard()
	 * @generated
	 * @ordered
	 */
	protected InternalAuthenticationGuard intAuthGuard;

	/**
	 * The cached value of the '{@link #getIdAdapter() <em>Id Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAdapter()
	 * @generated
	 * @ordered
	 */
	protected IdentityAdapter idAdapter;

	/**
	 * The cached value of the '{@link #getPepImpl() <em>Pep Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPepImpl()
	 * @generated
	 * @ordered
	 */
	protected PEPImplementation pepImpl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.SECURITY_PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAuthenticationGuard getExtAuthGuard() {
		return extAuthGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtAuthGuard(ExternalAuthenticationGuard newExtAuthGuard, NotificationChain msgs) {
		ExternalAuthenticationGuard oldExtAuthGuard = extAuthGuard;
		extAuthGuard = newExtAuthGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD, oldExtAuthGuard, newExtAuthGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtAuthGuard(ExternalAuthenticationGuard newExtAuthGuard) {
		if (newExtAuthGuard != extAuthGuard) {
			NotificationChain msgs = null;
			if (extAuthGuard != null)
				msgs = ((InternalEObject)extAuthGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD, null, msgs);
			if (newExtAuthGuard != null)
				msgs = ((InternalEObject)newExtAuthGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD, null, msgs);
			msgs = basicSetExtAuthGuard(newExtAuthGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD, newExtAuthGuard, newExtAuthGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAuthenticationGuard getIntAuthGuard() {
		return intAuthGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntAuthGuard(InternalAuthenticationGuard newIntAuthGuard, NotificationChain msgs) {
		InternalAuthenticationGuard oldIntAuthGuard = intAuthGuard;
		intAuthGuard = newIntAuthGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD, oldIntAuthGuard, newIntAuthGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntAuthGuard(InternalAuthenticationGuard newIntAuthGuard) {
		if (newIntAuthGuard != intAuthGuard) {
			NotificationChain msgs = null;
			if (intAuthGuard != null)
				msgs = ((InternalEObject)intAuthGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD, null, msgs);
			if (newIntAuthGuard != null)
				msgs = ((InternalEObject)newIntAuthGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD, null, msgs);
			msgs = basicSetIntAuthGuard(newIntAuthGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD, newIntAuthGuard, newIntAuthGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAdapter getIdAdapter() {
		return idAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdAdapter(IdentityAdapter newIdAdapter, NotificationChain msgs) {
		IdentityAdapter oldIdAdapter = idAdapter;
		idAdapter = newIdAdapter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__ID_ADAPTER, oldIdAdapter, newIdAdapter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAdapter(IdentityAdapter newIdAdapter) {
		if (newIdAdapter != idAdapter) {
			NotificationChain msgs = null;
			if (idAdapter != null)
				msgs = ((InternalEObject)idAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__ID_ADAPTER, null, msgs);
			if (newIdAdapter != null)
				msgs = ((InternalEObject)newIdAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__ID_ADAPTER, null, msgs);
			msgs = basicSetIdAdapter(newIdAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__ID_ADAPTER, newIdAdapter, newIdAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEPImplementation getPepImpl() {
		return pepImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPepImpl(PEPImplementation newPepImpl, NotificationChain msgs) {
		PEPImplementation oldPepImpl = pepImpl;
		pepImpl = newPepImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__PEP_IMPL, oldPepImpl, newPepImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPepImpl(PEPImplementation newPepImpl) {
		if (newPepImpl != pepImpl) {
			NotificationChain msgs = null;
			if (pepImpl != null)
				msgs = ((InternalEObject)pepImpl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__PEP_IMPL, null, msgs);
			if (newPepImpl != null)
				msgs = ((InternalEObject)newPepImpl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SECURITY_PROFILE__PEP_IMPL, null, msgs);
			msgs = basicSetPepImpl(newPepImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SECURITY_PROFILE__PEP_IMPL, newPepImpl, newPepImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD:
				return basicSetExtAuthGuard(null, msgs);
			case GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD:
				return basicSetIntAuthGuard(null, msgs);
			case GuigenPackage.SECURITY_PROFILE__ID_ADAPTER:
				return basicSetIdAdapter(null, msgs);
			case GuigenPackage.SECURITY_PROFILE__PEP_IMPL:
				return basicSetPepImpl(null, msgs);
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
			case GuigenPackage.SECURITY_PROFILE__NAME:
				return getName();
			case GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD:
				return getExtAuthGuard();
			case GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD:
				return getIntAuthGuard();
			case GuigenPackage.SECURITY_PROFILE__ID_ADAPTER:
				return getIdAdapter();
			case GuigenPackage.SECURITY_PROFILE__PEP_IMPL:
				return getPepImpl();
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
			case GuigenPackage.SECURITY_PROFILE__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD:
				setExtAuthGuard((ExternalAuthenticationGuard)newValue);
				return;
			case GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD:
				setIntAuthGuard((InternalAuthenticationGuard)newValue);
				return;
			case GuigenPackage.SECURITY_PROFILE__ID_ADAPTER:
				setIdAdapter((IdentityAdapter)newValue);
				return;
			case GuigenPackage.SECURITY_PROFILE__PEP_IMPL:
				setPepImpl((PEPImplementation)newValue);
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
			case GuigenPackage.SECURITY_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD:
				setExtAuthGuard((ExternalAuthenticationGuard)null);
				return;
			case GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD:
				setIntAuthGuard((InternalAuthenticationGuard)null);
				return;
			case GuigenPackage.SECURITY_PROFILE__ID_ADAPTER:
				setIdAdapter((IdentityAdapter)null);
				return;
			case GuigenPackage.SECURITY_PROFILE__PEP_IMPL:
				setPepImpl((PEPImplementation)null);
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
			case GuigenPackage.SECURITY_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.SECURITY_PROFILE__EXT_AUTH_GUARD:
				return extAuthGuard != null;
			case GuigenPackage.SECURITY_PROFILE__INT_AUTH_GUARD:
				return intAuthGuard != null;
			case GuigenPackage.SECURITY_PROFILE__ID_ADAPTER:
				return idAdapter != null;
			case GuigenPackage.SECURITY_PROFILE__PEP_IMPL:
				return pepImpl != null;
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

} //SecurityProfileImpl
