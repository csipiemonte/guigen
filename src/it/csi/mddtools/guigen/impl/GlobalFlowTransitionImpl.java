/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.FlowState;
import it.csi.mddtools.guigen.GlobalFlowTransition;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MenuItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Flow Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.GlobalFlowTransitionImpl#getJumpTo <em>Jump To</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GlobalFlowTransitionImpl#getMenuCommand <em>Menu Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalFlowTransitionImpl extends EObjectImpl implements GlobalFlowTransition {
	/**
	 * The cached value of the '{@link #getJumpTo() <em>Jump To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpTo()
	 * @generated
	 * @ordered
	 */
	protected FlowState jumpTo;

	/**
	 * The cached value of the '{@link #getMenuCommand() <em>Menu Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuCommand()
	 * @generated
	 * @ordered
	 */
	protected MenuItem menuCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalFlowTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.GLOBAL_FLOW_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowState getJumpTo() {
		if (jumpTo != null && jumpTo.eIsProxy()) {
			InternalEObject oldJumpTo = (InternalEObject)jumpTo;
			jumpTo = (FlowState)eResolveProxy(oldJumpTo);
			if (jumpTo != oldJumpTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.GLOBAL_FLOW_TRANSITION__JUMP_TO, oldJumpTo, jumpTo));
			}
		}
		return jumpTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowState basicGetJumpTo() {
		return jumpTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpTo(FlowState newJumpTo) {
		FlowState oldJumpTo = jumpTo;
		jumpTo = newJumpTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GLOBAL_FLOW_TRANSITION__JUMP_TO, oldJumpTo, jumpTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem getMenuCommand() {
		if (menuCommand != null && menuCommand.eIsProxy()) {
			InternalEObject oldMenuCommand = (InternalEObject)menuCommand;
			menuCommand = (MenuItem)eResolveProxy(oldMenuCommand);
			if (menuCommand != oldMenuCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.GLOBAL_FLOW_TRANSITION__MENU_COMMAND, oldMenuCommand, menuCommand));
			}
		}
		return menuCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem basicGetMenuCommand() {
		return menuCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuCommand(MenuItem newMenuCommand) {
		MenuItem oldMenuCommand = menuCommand;
		menuCommand = newMenuCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GLOBAL_FLOW_TRANSITION__MENU_COMMAND, oldMenuCommand, menuCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__JUMP_TO:
				if (resolve) return getJumpTo();
				return basicGetJumpTo();
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__MENU_COMMAND:
				if (resolve) return getMenuCommand();
				return basicGetMenuCommand();
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
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__JUMP_TO:
				setJumpTo((FlowState)newValue);
				return;
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__MENU_COMMAND:
				setMenuCommand((MenuItem)newValue);
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
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__JUMP_TO:
				setJumpTo((FlowState)null);
				return;
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__MENU_COMMAND:
				setMenuCommand((MenuItem)null);
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
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__JUMP_TO:
				return jumpTo != null;
			case GuigenPackage.GLOBAL_FLOW_TRANSITION__MENU_COMMAND:
				return menuCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalFlowTransitionImpl
