/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show Dialog Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ShowDialogAction#getDialog <em>Dialog</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getShowDialogAction()
 * @model
 * @generated
 */
public interface ShowDialogAction extends Action {
	/**
	 * Returns the value of the '<em><b>Dialog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialog</em>' reference.
	 * @see #setDialog(DialogPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getShowDialogAction_Dialog()
	 * @model
	 * @generated
	 */
	DialogPanel getDialog();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ShowDialogAction#getDialog <em>Dialog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog</em>' reference.
	 * @see #getDialog()
	 * @generated
	 */
	void setDialog(DialogPanel value);

} // ShowDialogAction
