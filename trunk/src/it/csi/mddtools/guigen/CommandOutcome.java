/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Possibile esito di un <b>ExecCommand</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CommandOutcome#getResultCode <em>Result Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CommandOutcome#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOutcome()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface CommandOutcome extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice identificativo dell'esito. Deve essere univoco all'interno del content panel
	 * e deve essere un identificativo valido secondo java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Code</em>' attribute.
	 * @see #setResultCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOutcome_ResultCode()
	 * @model
	 * @generated
	 */
	String getResultCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CommandOutcome#getResultCode <em>Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Code</em>' attribute.
	 * @see #getResultCode()
	 * @generated
	 */
	void setResultCode(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando che viene eseguito nel caso in cui questo <b>CommandOutcome</b>
	 * sia quello prescelto nella logica dell'<b>ExecCommand</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Command)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOutcome_Command()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CommandOutcome#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // CommandOutcome
