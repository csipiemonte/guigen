/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.TabSetPanel;

import it.csi.mddtools.guigen.TabSwitcher;
import org.eclipse.emf.common.notify.Notification;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Set Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TabSetPanelImpl#getSwitcher <em>Switcher</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabSetPanelImpl extends MultiPanelImpl implements TabSetPanel {
	/**
	 * The cached value of the '{@link #getSwitcher() <em>Switcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitcher()
	 * @generated
	 * @ordered
	 */
	protected TabSwitcher switcher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabSetPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TAB_SET_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabSwitcher getSwitcher() {
		return switcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitcher(TabSwitcher newSwitcher, NotificationChain msgs) {
		TabSwitcher oldSwitcher = switcher;
		switcher = newSwitcher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.TAB_SET_PANEL__SWITCHER, oldSwitcher, newSwitcher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitcher(TabSwitcher newSwitcher) {
		if (newSwitcher != switcher) {
			NotificationChain msgs = null;
			if (switcher != null)
				msgs = ((InternalEObject)switcher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TAB_SET_PANEL__SWITCHER, null, msgs);
			if (newSwitcher != null)
				msgs = ((InternalEObject)newSwitcher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TAB_SET_PANEL__SWITCHER, null, msgs);
			msgs = basicSetSwitcher(newSwitcher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TAB_SET_PANEL__SWITCHER, newSwitcher, newSwitcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.TAB_SET_PANEL__SWITCHER:
				return basicSetSwitcher(null, msgs);
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
			case GuigenPackage.TAB_SET_PANEL__SWITCHER:
				return getSwitcher();
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
			case GuigenPackage.TAB_SET_PANEL__SWITCHER:
				setSwitcher((TabSwitcher)newValue);
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
			case GuigenPackage.TAB_SET_PANEL__SWITCHER:
				setSwitcher((TabSwitcher)null);
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
			case GuigenPackage.TAB_SET_PANEL__SWITCHER:
				return switcher != null;
		}
		return super.eIsSet(featureID);
	}

} //TabSetPanelImpl
