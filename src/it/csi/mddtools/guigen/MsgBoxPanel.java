/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>MsgBoxPanel</b> &egrave; un pannello utilizzabile per mostrare all\'utente\r\ndel testo in sola lettura, eventualmente formattato. Il testo pu&ograve; essere statico\r\n(definito a tempo di modellazione) o dinamico (calcolato a runtime).\r\nE\' il meccanismo preferenziale da utilizzare in tutti quei casi in cui non sia sufficiente\r\nutilizzare lo <b>StdMessagePanel</b>, che &egrave; orientato principalmente a brevi\r\nmessaggi testuali.\r\n<br/>\r\nData la natura del pannello, &egrave; possibile inserire esclusivamente dei widget di\r\nvisualizzazione di testo (<b>PlainText</b>).\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
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
	 * <!-- begin-model-doc -->
	 * Tipologia del messaggio (utilizzato solo se il pannello &egrave; contenuto in un
	 * <b>DialogPanel</b>.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * contengono il testo vero e proprio
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Messages</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMsgBoxPanel_TextMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainText> getTextMessages();

} // MsgBoxPanel
