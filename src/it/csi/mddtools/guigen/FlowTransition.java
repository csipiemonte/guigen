/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.FlowTransition#getNextState <em>Next State</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.FlowTransition#getCommandWidget <em>Command Widget</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getFlowTransition()
 * @model
 * @generated
 */
public interface FlowTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Next State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next State</em>' reference.
	 * @see #setNextState(FlowState)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFlowTransition_NextState()
	 * @model
	 * @generated
	 */
	FlowState getNextState();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.FlowTransition#getNextState <em>Next State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next State</em>' reference.
	 * @see #getNextState()
	 * @generated
	 */
	void setNextState(FlowState value);

	/**
	 * Returns the value of the '<em><b>Command Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Widget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Widget</em>' reference.
	 * @see #setCommandWidget(CommandWidget)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFlowTransition_CommandWidget()
	 * @model
	 * @generated
	 */
	CommandWidget getCommandWidget();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.FlowTransition#getCommandWidget <em>Command Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Widget</em>' reference.
	 * @see #getCommandWidget()
	 * @generated
	 */
	void setCommandWidget(CommandWidget value);

} // FlowTransition
