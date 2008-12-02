/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.FlowState;
import it.csi.mddtools.guigen.FlowTransition;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.FlowTransitionImpl#getNextState <em>Next State</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.FlowTransitionImpl#getCommandWidget <em>Command Widget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowTransitionImpl extends EObjectImpl implements FlowTransition {
	/**
	 * The cached value of the '{@link #getNextState() <em>Next State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextState()
	 * @generated
	 * @ordered
	 */
	protected FlowState nextState;

	/**
	 * The cached value of the '{@link #getCommandWidget() <em>Command Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandWidget()
	 * @generated
	 * @ordered
	 */
	protected CommandWidget commandWidget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.FLOW_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowState getNextState() {
		if (nextState != null && nextState.eIsProxy()) {
			InternalEObject oldNextState = (InternalEObject)nextState;
			nextState = (FlowState)eResolveProxy(oldNextState);
			if (nextState != oldNextState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.FLOW_TRANSITION__NEXT_STATE, oldNextState, nextState));
			}
		}
		return nextState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowState basicGetNextState() {
		return nextState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextState(FlowState newNextState) {
		FlowState oldNextState = nextState;
		nextState = newNextState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.FLOW_TRANSITION__NEXT_STATE, oldNextState, nextState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandWidget getCommandWidget() {
		if (commandWidget != null && commandWidget.eIsProxy()) {
			InternalEObject oldCommandWidget = (InternalEObject)commandWidget;
			commandWidget = (CommandWidget)eResolveProxy(oldCommandWidget);
			if (commandWidget != oldCommandWidget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.FLOW_TRANSITION__COMMAND_WIDGET, oldCommandWidget, commandWidget));
			}
		}
		return commandWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandWidget basicGetCommandWidget() {
		return commandWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandWidget(CommandWidget newCommandWidget) {
		CommandWidget oldCommandWidget = commandWidget;
		commandWidget = newCommandWidget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.FLOW_TRANSITION__COMMAND_WIDGET, oldCommandWidget, commandWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.FLOW_TRANSITION__NEXT_STATE:
				if (resolve) return getNextState();
				return basicGetNextState();
			case GuigenPackage.FLOW_TRANSITION__COMMAND_WIDGET:
				if (resolve) return getCommandWidget();
				return basicGetCommandWidget();
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
			case GuigenPackage.FLOW_TRANSITION__NEXT_STATE:
				setNextState((FlowState)newValue);
				return;
			case GuigenPackage.FLOW_TRANSITION__COMMAND_WIDGET:
				setCommandWidget((CommandWidget)newValue);
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
			case GuigenPackage.FLOW_TRANSITION__NEXT_STATE:
				setNextState((FlowState)null);
				return;
			case GuigenPackage.FLOW_TRANSITION__COMMAND_WIDGET:
				setCommandWidget((CommandWidget)null);
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
			case GuigenPackage.FLOW_TRANSITION__NEXT_STATE:
				return nextState != null;
			case GuigenPackage.FLOW_TRANSITION__COMMAND_WIDGET:
				return commandWidget != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowTransitionImpl
