/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.JumpAction#getJumpTo <em>Jump To</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpAction()
 * @model
 * @generated
 */
public interface JumpAction extends Action {
	/**
	 * Returns the value of the '<em><b>Jump To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump To</em>' reference.
	 * @see #setJumpTo(ContentPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpAction_JumpTo()
	 * @model
	 * @generated
	 */
	ContentPanel getJumpTo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.JumpAction#getJumpTo <em>Jump To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump To</em>' reference.
	 * @see #getJumpTo()
	 * @generated
	 */
	void setJumpTo(ContentPanel value);

} // JumpAction
