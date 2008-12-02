/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.FlowState;
import it.csi.mddtools.guigen.FlowTransition;
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
 * An implementation of the model object '<em><b>Flow State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.FlowStateImpl#getContentPanel <em>Content Panel</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.FlowStateImpl#getPossibleTransitions <em>Possible Transitions</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.FlowStateImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowStateImpl extends EObjectImpl implements FlowState {
	/**
	 * The cached value of the '{@link #getContentPanel() <em>Content Panel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPanel()
	 * @generated
	 * @ordered
	 */
	protected ContentPanel contentPanel;

	/**
	 * The cached value of the '{@link #getPossibleTransitions() <em>Possible Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowTransition> possibleTransitions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.FLOW_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPanel getContentPanel() {
		if (contentPanel != null && contentPanel.eIsProxy()) {
			InternalEObject oldContentPanel = (InternalEObject)contentPanel;
			contentPanel = (ContentPanel)eResolveProxy(oldContentPanel);
			if (contentPanel != oldContentPanel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.FLOW_STATE__CONTENT_PANEL, oldContentPanel, contentPanel));
			}
		}
		return contentPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPanel basicGetContentPanel() {
		return contentPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentPanel(ContentPanel newContentPanel) {
		ContentPanel oldContentPanel = contentPanel;
		contentPanel = newContentPanel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.FLOW_STATE__CONTENT_PANEL, oldContentPanel, contentPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowTransition> getPossibleTransitions() {
		if (possibleTransitions == null) {
			possibleTransitions = new EObjectContainmentEList<FlowTransition>(FlowTransition.class, this, GuigenPackage.FLOW_STATE__POSSIBLE_TRANSITIONS);
		}
		return possibleTransitions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.FLOW_STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.FLOW_STATE__POSSIBLE_TRANSITIONS:
				return ((InternalEList<?>)getPossibleTransitions()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.FLOW_STATE__CONTENT_PANEL:
				if (resolve) return getContentPanel();
				return basicGetContentPanel();
			case GuigenPackage.FLOW_STATE__POSSIBLE_TRANSITIONS:
				return getPossibleTransitions();
			case GuigenPackage.FLOW_STATE__NAME:
				return getName();
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
			case GuigenPackage.FLOW_STATE__CONTENT_PANEL:
				setContentPanel((ContentPanel)newValue);
				return;
			case GuigenPackage.FLOW_STATE__POSSIBLE_TRANSITIONS:
				getPossibleTransitions().clear();
				getPossibleTransitions().addAll((Collection<? extends FlowTransition>)newValue);
				return;
			case GuigenPackage.FLOW_STATE__NAME:
				setName((String)newValue);
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
			case GuigenPackage.FLOW_STATE__CONTENT_PANEL:
				setContentPanel((ContentPanel)null);
				return;
			case GuigenPackage.FLOW_STATE__POSSIBLE_TRANSITIONS:
				getPossibleTransitions().clear();
				return;
			case GuigenPackage.FLOW_STATE__NAME:
				setName(NAME_EDEFAULT);
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
			case GuigenPackage.FLOW_STATE__CONTENT_PANEL:
				return contentPanel != null;
			case GuigenPackage.FLOW_STATE__POSSIBLE_TRANSITIONS:
				return possibleTransitions != null && !possibleTransitions.isEmpty();
			case GuigenPackage.FLOW_STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //FlowStateImpl
