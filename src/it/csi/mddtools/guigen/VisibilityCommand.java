/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.VisibilityCommand#isShow <em>Show</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getVisibilityCommand()
 * @model
 * @generated
 */
public interface VisibilityCommand extends Command, CommandOnWidgets {
	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see #setShow(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getVisibilityCommand_Show()
	 * @model
	 * @generated
	 */
	boolean isShow();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.VisibilityCommand#isShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see #isShow()
	 * @generated
	 */
	void setShow(boolean value);

} // VisibilityCommand
