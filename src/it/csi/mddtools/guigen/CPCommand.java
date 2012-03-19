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
 * A representation of the model object '<em><b>CP Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Comando asosciato al Content Panel che viene eseguito a seconda di quanto
 * specificato in <i>execute</i>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CPCommand#getExecute <em>Execute</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CPCommand#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCPCommand()
 * @model
 * @generated
 */
public interface CPCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Execute</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.CPCommandExecutionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' attribute.
	 * @see it.csi.mddtools.guigen.CPCommandExecutionTypes
	 * @see #setExecute(CPCommandExecutionTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCPCommand_Execute()
	 * @model
	 * @generated
	 */
	CPCommandExecutionTypes getExecute();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CPCommand#getExecute <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute</em>' attribute.
	 * @see it.csi.mddtools.guigen.CPCommandExecutionTypes
	 * @see #getExecute()
	 * @generated
	 */
	void setExecute(CPCommandExecutionTypes value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Command)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCPCommand_Command()
	 * @model containment="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CPCommand#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // CPCommand
