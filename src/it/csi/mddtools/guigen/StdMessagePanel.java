/**
 * <copyright>
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
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.StdMessagePanel#isShowGlobalMessages <em>Show Global Messages</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrorDetails <em>Show Field Error Details</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrors <em>Show Field Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getStdMessagePanel()
 * @model
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
