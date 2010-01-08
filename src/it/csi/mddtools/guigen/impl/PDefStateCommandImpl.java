/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.PDefStateCommand;
import it.csi.mddtools.guigen.PanelDefState;
import it.csi.mddtools.guigen.PanelDefUse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDef State Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.PDefStateCommandImpl#getGoTo <em>Go To</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PDefStateCommandImpl#getPDefUse <em>PDef Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PDefStateCommandImpl extends CommandImpl implements PDefStateCommand {
	/**
	 * The cached value of the '{@link #getGoTo() <em>Go To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoTo()
	 * @generated
	 * @ordered
	 */
	protected PanelDefState goTo;

	/**
	 * The cached value of the '{@link #getPDefUse() <em>PDef Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDefUse()
	 * @generated
	 * @ordered
	 */
	protected PanelDefUse pDefUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDefStateCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.PDEF_STATE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelDefState getGoTo() {
		if (goTo != null && goTo.eIsProxy()) {
			InternalEObject oldGoTo = (InternalEObject)goTo;
			goTo = (PanelDefState)eResolveProxy(oldGoTo);
			if (goTo != oldGoTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.PDEF_STATE_COMMAND__GO_TO, oldGoTo, goTo));
			}
		}
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelDefState basicGetGoTo() {
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoTo(PanelDefState newGoTo) {
		PanelDefState oldGoTo = goTo;
		goTo = newGoTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PDEF_STATE_COMMAND__GO_TO, oldGoTo, goTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelDefUse getPDefUse() {
		if (pDefUse != null && pDefUse.eIsProxy()) {
			InternalEObject oldPDefUse = (InternalEObject)pDefUse;
			pDefUse = (PanelDefUse)eResolveProxy(oldPDefUse);
			if (pDefUse != oldPDefUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.PDEF_STATE_COMMAND__PDEF_USE, oldPDefUse, pDefUse));
			}
		}
		return pDefUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelDefUse basicGetPDefUse() {
		return pDefUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDefUse(PanelDefUse newPDefUse) {
		PanelDefUse oldPDefUse = pDefUse;
		pDefUse = newPDefUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PDEF_STATE_COMMAND__PDEF_USE, oldPDefUse, pDefUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.PDEF_STATE_COMMAND__GO_TO:
				if (resolve) return getGoTo();
				return basicGetGoTo();
			case GuigenPackage.PDEF_STATE_COMMAND__PDEF_USE:
				if (resolve) return getPDefUse();
				return basicGetPDefUse();
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
			case GuigenPackage.PDEF_STATE_COMMAND__GO_TO:
				setGoTo((PanelDefState)newValue);
				return;
			case GuigenPackage.PDEF_STATE_COMMAND__PDEF_USE:
				setPDefUse((PanelDefUse)newValue);
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
			case GuigenPackage.PDEF_STATE_COMMAND__GO_TO:
				setGoTo((PanelDefState)null);
				return;
			case GuigenPackage.PDEF_STATE_COMMAND__PDEF_USE:
				setPDefUse((PanelDefUse)null);
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
			case GuigenPackage.PDEF_STATE_COMMAND__GO_TO:
				return goTo != null;
			case GuigenPackage.PDEF_STATE_COMMAND__PDEF_USE:
				return pDefUse != null;
		}
		return super.eIsSet(featureID);
	}

} //PDefStateCommandImpl
