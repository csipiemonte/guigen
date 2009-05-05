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
 * A representation of the model object '<em><b>Msg Box Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MsgBoxPanel#getMessageSeverity <em>Message Severity</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MsgBoxPanel#getTextMessages <em>Text Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMsgBoxPanel()
 * @model
 * @generated
 */
public interface MsgBoxPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Message Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.MessageSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Severity</em>' attribute.
	 * @see it.csi.mddtools.guigen.MessageSeverity
	 * @see #setMessageSeverity(MessageSeverity)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMsgBoxPanel_MessageSeverity()
	 * @model
	 * @generated
	 */
	MessageSeverity getMessageSeverity();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MsgBoxPanel#getMessageSeverity <em>Message Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Severity</em>' attribute.
	 * @see it.csi.mddtools.guigen.MessageSeverity
	 * @see #getMessageSeverity()
	 * @generated
	 */
	void setMessageSeverity(MessageSeverity value);

	/**
	 * Returns the value of the '<em><b>Text Messages</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.PlainText}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Messages</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMsgBoxPanel_TextMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainText> getTextMessages();

} // MsgBoxPanel
