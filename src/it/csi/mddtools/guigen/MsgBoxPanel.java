/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
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
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MsgBoxPanel#getMessageSeverity <em>Message Severity</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MsgBoxPanel#getTextMessages <em>Text Messages</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MsgBoxPanel#isShowStdLegend <em>Show Std Legend</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMsgBoxPanel()
 * @model annotation="uipaneldoc description='&lt;p&gt;\r\nIl &lt;b&gt;MsgBoxPanel&lt;/b&gt; &amp;egrave; un pannello utilizzabile per mostrare all\'utente\r\ndel testo in sola lettura, eventualmente formattato. Il testo pu&amp;ograve; essere statico\r\n(definito a tempo di modellazione) o dinamico (calcolato a runtime).\r\nE\' il meccanismo preferenziale da utilizzare in tutti quei casi in cui non sia sufficiente\r\nutilizzare lo &lt;b&gt;StdMessagePanel&lt;/b&gt;, che &amp;egrave; orientato principalmente a brevi\r\nmessaggi testuali.\r\n&lt;br/&gt;\r\nData la natura del pannello, &amp;egrave; possibile inserire esclusivamente dei widget di\r\nvisualizzazione di testo (&lt;b&gt;PlainText&lt;/b&gt;).\r\n&lt;/p&gt;'"
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

	/**
	 * Returns the value of the '<em><b>Show Std Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * se impostato a i<i>true</i> fa si che nel pannello siano mostrate le voci della
	 * legenda standard (es. indicazione del significato del '*'), prima di tutti i testi
	 * custom. Il valore di default &egrave; <i>false</i> 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Std Legend</em>' attribute.
	 * @see #setShowStdLegend(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMsgBoxPanel_ShowStdLegend()
	 * @model
	 * @generated
	 */
	boolean isShowStdLegend();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MsgBoxPanel#isShowStdLegend <em>Show Std Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Std Legend</em>' attribute.
	 * @see #isShowStdLegend()
	 * @generated
	 */
	void setShowStdLegend(boolean value);

} // MsgBoxPanel
