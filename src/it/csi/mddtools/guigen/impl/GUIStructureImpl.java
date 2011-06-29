/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppWindow;
import it.csi.mddtools.guigen.GUIStructure;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GUI Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIStructureImpl#getAppWindow <em>App Window</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GUIStructureImpl extends EObjectImpl implements GUIStructure {
	/**
	 * The cached value of the '{@link #getAppWindow() <em>App Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppWindow()
	 * @generated
	 * @ordered
	 */
	protected AppWindow appWindow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.GUI_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppWindow getAppWindow() {
		return appWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppWindow(AppWindow newAppWindow, NotificationChain msgs) {
		AppWindow oldAppWindow = appWindow;
		appWindow = newAppWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_STRUCTURE__APP_WINDOW, oldAppWindow, newAppWindow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppWindow(AppWindow newAppWindow) {
		if (newAppWindow != appWindow) {
			NotificationChain msgs = null;
			if (appWindow != null)
				msgs = ((InternalEObject)appWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_STRUCTURE__APP_WINDOW, null, msgs);
			if (newAppWindow != null)
				msgs = ((InternalEObject)newAppWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_STRUCTURE__APP_WINDOW, null, msgs);
			msgs = basicSetAppWindow(newAppWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_STRUCTURE__APP_WINDOW, newAppWindow, newAppWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.GUI_STRUCTURE__APP_WINDOW:
				return basicSetAppWindow(null, msgs);
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
			case GuigenPackage.GUI_STRUCTURE__APP_WINDOW:
				return getAppWindow();
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
			case GuigenPackage.GUI_STRUCTURE__APP_WINDOW:
				setAppWindow((AppWindow)newValue);
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
			case GuigenPackage.GUI_STRUCTURE__APP_WINDOW:
				setAppWindow((AppWindow)null);
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
			case GuigenPackage.GUI_STRUCTURE__APP_WINDOW:
				return appWindow != null;
		}
		return super.eIsSet(featureID);
	}

} //GUIStructureImpl
