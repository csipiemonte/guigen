/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pagina utilizzabile per messaggi di feedback/conferme etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.DialogPanel#getCommands <em>Commands</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DialogPanel#getMsgBoxes <em>Msg Boxes</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel()
 * @model
 * @generated
 */
public interface DialogPanel extends Panel {

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I pulsanti associati al dialog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference.
	 * @see #setCommands(CommandPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel_Commands()
	 * @model containment="true"
	 * @generated
	 */
	CommandPanel getCommands();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DialogPanel#getCommands <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commands</em>' containment reference.
	 * @see #getCommands()
	 * @generated
	 */
	void setCommands(CommandPanel value);

	/**
	 * Returns the value of the '<em><b>Msg Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.MsgBoxPanel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Boxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I messaggi di feedback da visualizzare devono essere inseriti in uno o più
	 * <b>MessageBoxPanel</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Msg Boxes</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDialogPanel_MsgBoxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MsgBoxPanel> getMsgBoxes();
} // DialogPanel
