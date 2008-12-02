/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GUIFlow#getStates <em>States</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIFlow#getStartState <em>Start State</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIFlow#getGlobalTransition <em>Global Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIFlow()
 * @model
 * @generated
 */
public interface GUIFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.FlowState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIFlow_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowState> getStates();

	/**
	 * Returns the value of the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start State</em>' reference.
	 * @see #setStartState(FlowState)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIFlow_StartState()
	 * @model
	 * @generated
	 */
	FlowState getStartState();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIFlow#getStartState <em>Start State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start State</em>' reference.
	 * @see #getStartState()
	 * @generated
	 */
	void setStartState(FlowState value);

	/**
	 * Returns the value of the '<em><b>Global Transition</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.GlobalFlowTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Transition</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIFlow_GlobalTransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalFlowTransition> getGlobalTransition();

} // GUIFlow
