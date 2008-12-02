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
 *   <li>{@link it.csi.mddtools.guigen.JumpAction#isPushCurrentPage <em>Push Current Page</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Push Current Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Push Current Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push Current Page</em>' attribute.
	 * @see #setPushCurrentPage(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpAction_PushCurrentPage()
	 * @model
	 * @generated
	 */
	boolean isPushCurrentPage();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.JumpAction#isPushCurrentPage <em>Push Current Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push Current Page</em>' attribute.
	 * @see #isPushCurrentPage()
	 * @generated
	 */
	void setPushCurrentPage(boolean value);

} // JumpAction
