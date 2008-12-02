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
 * A representation of the model object '<em><b>Global Flow Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GlobalFlowTransition#getJumpTo <em>Jump To</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GlobalFlowTransition#getMenuCommand <em>Menu Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGlobalFlowTransition()
 * @model
 * @generated
 */
public interface GlobalFlowTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Jump To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump To</em>' reference.
	 * @see #setJumpTo(FlowState)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGlobalFlowTransition_JumpTo()
	 * @model
	 * @generated
	 */
	FlowState getJumpTo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GlobalFlowTransition#getJumpTo <em>Jump To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump To</em>' reference.
	 * @see #getJumpTo()
	 * @generated
	 */
	void setJumpTo(FlowState value);

	/**
	 * Returns the value of the '<em><b>Menu Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Command</em>' reference.
	 * @see #setMenuCommand(MenuItem)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGlobalFlowTransition_MenuCommand()
	 * @model
	 * @generated
	 */
	MenuItem getMenuCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GlobalFlowTransition#getMenuCommand <em>Menu Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Command</em>' reference.
	 * @see #getMenuCommand()
	 * @generated
	 */
	void setMenuCommand(MenuItem value);

} // GlobalFlowTransition
