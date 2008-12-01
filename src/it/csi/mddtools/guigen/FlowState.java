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
 * A representation of the model object '<em><b>Flow State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.FlowState#getContentPanel <em>Content Panel</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.FlowState#getPossibleTransitions <em>Possible Transitions</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.FlowState#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getFlowState()
 * @model
 * @generated
 */
public interface FlowState extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Panel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Panel</em>' reference.
	 * @see #setContentPanel(ContentPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFlowState_ContentPanel()
	 * @model
	 * @generated
	 */
	ContentPanel getContentPanel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.FlowState#getContentPanel <em>Content Panel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Panel</em>' reference.
	 * @see #getContentPanel()
	 * @generated
	 */
	void setContentPanel(ContentPanel value);

	/**
	 * Returns the value of the '<em><b>Possible Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.FlowTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Transitions</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFlowState_PossibleTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowTransition> getPossibleTransitions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFlowState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.FlowState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FlowState
