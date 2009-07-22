/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.ScreenState;
import it.csi.mddtools.guigen.ScreenStateCommand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen State Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ScreenStateCommandImpl#getGoTo <em>Go To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenStateCommandImpl extends CommandImpl implements ScreenStateCommand {
	/**
	 * The cached value of the '{@link #getGoTo() <em>Go To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoTo()
	 * @generated
	 * @ordered
	 */
	protected ScreenState goTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenStateCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.SCREEN_STATE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenState getGoTo() {
		if (goTo != null && goTo.eIsProxy()) {
			InternalEObject oldGoTo = (InternalEObject)goTo;
			goTo = (ScreenState)eResolveProxy(oldGoTo);
			if (goTo != oldGoTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.SCREEN_STATE_COMMAND__GO_TO, oldGoTo, goTo));
			}
		}
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenState basicGetGoTo() {
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoTo(ScreenState newGoTo) {
		ScreenState oldGoTo = goTo;
		goTo = newGoTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SCREEN_STATE_COMMAND__GO_TO, oldGoTo, goTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.SCREEN_STATE_COMMAND__GO_TO:
				if (resolve) return getGoTo();
				return basicGetGoTo();
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
			case GuigenPackage.SCREEN_STATE_COMMAND__GO_TO:
				setGoTo((ScreenState)newValue);
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
			case GuigenPackage.SCREEN_STATE_COMMAND__GO_TO:
				setGoTo((ScreenState)null);
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
			case GuigenPackage.SCREEN_STATE_COMMAND__GO_TO:
				return goTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ScreenStateCommandImpl
