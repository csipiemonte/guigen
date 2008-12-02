/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.FlowState;
import it.csi.mddtools.guigen.GUIFlow;
import it.csi.mddtools.guigen.GlobalFlowTransition;
import it.csi.mddtools.guigen.GuigenPackage;

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
 * An implementation of the model object '<em><b>GUI Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIFlowImpl#getStates <em>States</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIFlowImpl#getStartState <em>Start State</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIFlowImpl#getGlobalTransition <em>Global Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GUIFlowImpl extends EObjectImpl implements GUIFlow {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowState> states;

	/**
	 * The cached value of the '{@link #getStartState() <em>Start State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartState()
	 * @generated
	 * @ordered
	 */
	protected FlowState startState;

	/**
	 * The cached value of the '{@link #getGlobalTransition() <em>Global Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalFlowTransition> globalTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.GUI_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<FlowState>(FlowState.class, this, GuigenPackage.GUI_FLOW__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowState getStartState() {
		if (startState != null && startState.eIsProxy()) {
			InternalEObject oldStartState = (InternalEObject)startState;
			startState = (FlowState)eResolveProxy(oldStartState);
			if (startState != oldStartState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.GUI_FLOW__START_STATE, oldStartState, startState));
			}
		}
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowState basicGetStartState() {
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartState(FlowState newStartState) {
		FlowState oldStartState = startState;
		startState = newStartState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_FLOW__START_STATE, oldStartState, startState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalFlowTransition> getGlobalTransition() {
		if (globalTransition == null) {
			globalTransition = new EObjectContainmentEList<GlobalFlowTransition>(GlobalFlowTransition.class, this, GuigenPackage.GUI_FLOW__GLOBAL_TRANSITION);
		}
		return globalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.GUI_FLOW__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case GuigenPackage.GUI_FLOW__GLOBAL_TRANSITION:
				return ((InternalEList<?>)getGlobalTransition()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.GUI_FLOW__STATES:
				return getStates();
			case GuigenPackage.GUI_FLOW__START_STATE:
				if (resolve) return getStartState();
				return basicGetStartState();
			case GuigenPackage.GUI_FLOW__GLOBAL_TRANSITION:
				return getGlobalTransition();
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
			case GuigenPackage.GUI_FLOW__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends FlowState>)newValue);
				return;
			case GuigenPackage.GUI_FLOW__START_STATE:
				setStartState((FlowState)newValue);
				return;
			case GuigenPackage.GUI_FLOW__GLOBAL_TRANSITION:
				getGlobalTransition().clear();
				getGlobalTransition().addAll((Collection<? extends GlobalFlowTransition>)newValue);
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
			case GuigenPackage.GUI_FLOW__STATES:
				getStates().clear();
				return;
			case GuigenPackage.GUI_FLOW__START_STATE:
				setStartState((FlowState)null);
				return;
			case GuigenPackage.GUI_FLOW__GLOBAL_TRANSITION:
				getGlobalTransition().clear();
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
			case GuigenPackage.GUI_FLOW__STATES:
				return states != null && !states.isEmpty();
			case GuigenPackage.GUI_FLOW__START_STATE:
				return startState != null;
			case GuigenPackage.GUI_FLOW__GLOBAL_TRANSITION:
				return globalTransition != null && !globalTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GUIFlowImpl
