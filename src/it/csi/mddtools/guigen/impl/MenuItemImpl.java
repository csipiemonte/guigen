/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MenuItem;

import it.csi.mddtools.guigen.UISecurityConstraint;
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
 * An implementation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MenuItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MenuItemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MenuItemImpl#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MenuItemImpl#getSecurityConstraints <em>Security Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuItemImpl extends EObjectImpl implements MenuItem {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventHandler() <em>Event Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandler()
	 * @generated
	 * @ordered
	 */
	protected EventHandler eventHandler;

	/**
	 * The cached value of the '{@link #getSecurityConstraints() <em>Security Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<UISecurityConstraint> securityConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.MENU_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MENU_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MENU_ITEM__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandler getEventHandler() {
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventHandler(EventHandler newEventHandler, NotificationChain msgs) {
		EventHandler oldEventHandler = eventHandler;
		eventHandler = newEventHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MENU_ITEM__EVENT_HANDLER, oldEventHandler, newEventHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHandler(EventHandler newEventHandler) {
		if (newEventHandler != eventHandler) {
			NotificationChain msgs = null;
			if (eventHandler != null)
				msgs = ((InternalEObject)eventHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MENU_ITEM__EVENT_HANDLER, null, msgs);
			if (newEventHandler != null)
				msgs = ((InternalEObject)newEventHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MENU_ITEM__EVENT_HANDLER, null, msgs);
			msgs = basicSetEventHandler(newEventHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MENU_ITEM__EVENT_HANDLER, newEventHandler, newEventHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UISecurityConstraint> getSecurityConstraints() {
		if (securityConstraints == null) {
			securityConstraints = new EObjectContainmentEList<UISecurityConstraint>(UISecurityConstraint.class, this, GuigenPackage.MENU_ITEM__SECURITY_CONSTRAINTS);
		}
		return securityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.MENU_ITEM__EVENT_HANDLER:
				return basicSetEventHandler(null, msgs);
			case GuigenPackage.MENU_ITEM__SECURITY_CONSTRAINTS:
				return ((InternalEList<?>)getSecurityConstraints()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.MENU_ITEM__NAME:
				return getName();
			case GuigenPackage.MENU_ITEM__LABEL:
				return getLabel();
			case GuigenPackage.MENU_ITEM__EVENT_HANDLER:
				return getEventHandler();
			case GuigenPackage.MENU_ITEM__SECURITY_CONSTRAINTS:
				return getSecurityConstraints();
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
			case GuigenPackage.MENU_ITEM__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.MENU_ITEM__LABEL:
				setLabel((String)newValue);
				return;
			case GuigenPackage.MENU_ITEM__EVENT_HANDLER:
				setEventHandler((EventHandler)newValue);
				return;
			case GuigenPackage.MENU_ITEM__SECURITY_CONSTRAINTS:
				getSecurityConstraints().clear();
				getSecurityConstraints().addAll((Collection<? extends UISecurityConstraint>)newValue);
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
			case GuigenPackage.MENU_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.MENU_ITEM__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GuigenPackage.MENU_ITEM__EVENT_HANDLER:
				setEventHandler((EventHandler)null);
				return;
			case GuigenPackage.MENU_ITEM__SECURITY_CONSTRAINTS:
				getSecurityConstraints().clear();
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
			case GuigenPackage.MENU_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.MENU_ITEM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case GuigenPackage.MENU_ITEM__EVENT_HANDLER:
				return eventHandler != null;
			case GuigenPackage.MENU_ITEM__SECURITY_CONSTRAINTS:
				return securityConstraints != null && !securityConstraints.isEmpty();
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
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //MenuItemImpl
