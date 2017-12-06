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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std Message Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pannello di visualizzazione di messaggi.
 * Permette di visualizzare:
 * <ul>
 * <li>informativi</li>
 * <li>di errore associati ai singoli campi</li>
 * <li>di errore globali</li>
 * </ul>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.StdMessagePanel#isShowGlobalMessages <em>Show Global Messages</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrorDetails <em>Show Field Error Details</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrors <em>Show Field Errors</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getStdMessagePanel()
 * @model annotation="uipaneldoc description='&lt;p&gt;\r\nLo &lt;b&gt;stdMessagePanel&lt;/b&gt; &amp;egrave; un pannello di tipo informativo utilizzato per mostrare \r\nall\'utente eventuali messaggi di errore o informativi.\r\nSe, durante l\'elaborazione, si verificano degli errori oppure se la business logic inserisce dei messaggi\r\ninformativi il pannello mostra tali messaggi.\r\nSe invece non si verifica almeno una di queste due condizioni, il pannello non ha nessuna evidenza\r\ngrafica.\r\nLe tipologie di messaggio visualizzabili sono:\r\n&lt;ul&gt;\r\n&lt;li&gt;messaggi informativi&lt;/li&gt;\r\n&lt;li&gt;messaggi di errore globali&lt;/li&gt;\r\n&lt;li&gt;messaggi di errore relativi a campi specifici&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;br/&gt;\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface StdMessagePanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Show Global Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Global Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impostare a true se si desidera visualizzare i messaggi di errore globali
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Global Messages</em>' attribute.
	 * @see #setShowGlobalMessages(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getStdMessagePanel_ShowGlobalMessages()
	 * @model
	 * @generated
	 */
	boolean isShowGlobalMessages();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.StdMessagePanel#isShowGlobalMessages <em>Show Global Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Global Messages</em>' attribute.
	 * @see #isShowGlobalMessages()
	 * @generated
	 */
	void setShowGlobalMessages(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Field Error Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Field Error Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impostare a true se si desidera visualizzare i messaggi di errore relativi ai vari field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Field Error Details</em>' attribute.
	 * @see #setShowFieldErrorDetails(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getStdMessagePanel_ShowFieldErrorDetails()
	 * @model
	 * @generated
	 */
	boolean isShowFieldErrorDetails();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrorDetails <em>Show Field Error Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Field Error Details</em>' attribute.
	 * @see #isShowFieldErrorDetails()
	 * @generated
	 */
	void setShowFieldErrorDetails(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Field Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Field Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impostare a true se si desidera visualizzare i messaggi di errore
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Field Errors</em>' attribute.
	 * @see #setShowFieldErrors(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getStdMessagePanel_ShowFieldErrors()
	 * @model
	 * @generated
	 */
	boolean isShowFieldErrors();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrors <em>Show Field Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Field Errors</em>' attribute.
	 * @see #isShowFieldErrors()
	 * @generated
	 */
	void setShowFieldErrors(boolean value);

} // StdMessagePanel
