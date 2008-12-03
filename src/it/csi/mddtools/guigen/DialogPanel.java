/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.DialogPanel#getDialogContent <em>Dialog Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel()
 * @model
 * @generated
 */
public interface DialogPanel extends Panel {

	/**
	 * Returns the value of the '<em><b>Dialog Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialog Content</em>' containment reference.
	 * @see #setDialogContent(Panel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel_DialogContent()
	 * @model containment="true"
	 * @generated
	 */
	Panel getDialogContent();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DialogPanel#getDialogContent <em>Dialog Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog Content</em>' containment reference.
	 * @see #getDialogContent()
	 * @generated
	 */
	void setDialogContent(Panel value);
} // DialogPanel
