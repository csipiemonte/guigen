/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di passare alla visualizzazione di un <b>ContentPanel</b>
 * differente.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.JumpCommand#getJumpTo <em>Jump To</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.JumpCommand#isPushCurrentPage <em>Push Current Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface JumpCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Jump To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il <b>ContentPanel</b> a cui saltare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jump To</em>' reference.
	 * @see #setJumpTo(ContentPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpCommand_JumpTo()
	 * @model
	 * @generated
	 */
	ContentPanel getJumpTo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.JumpCommand#getJumpTo <em>Jump To</em>}' reference.
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
	 * <!-- begin-model-doc -->
	 * Salva in uno stack la pagina corrente prima di effettuare il salto.
	 * Da utilizzarsi in congiunzione con <b>JumpBackCommand</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Push Current Page</em>' attribute.
	 * @see #setPushCurrentPage(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpCommand_PushCurrentPage()
	 * @model
	 * @generated
	 */
	boolean isPushCurrentPage();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.JumpCommand#isPushCurrentPage <em>Push Current Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push Current Page</em>' attribute.
	 * @see #isPushCurrentPage()
	 * @generated
	 */
	void setPushCurrentPage(boolean value);

} // JumpCommand
