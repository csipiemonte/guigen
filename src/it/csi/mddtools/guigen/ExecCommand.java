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
 * A representation of the model object '<em><b>Exec Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getResults <em>Results</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getPostExecData <em>Post Exec Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand()
 * @model
 * @generated
 */
public interface ExecCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.CommandOutcome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandOutcome> getResults();

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ExecCommand#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Post Exec Data</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Exec Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Exec Data</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_PostExecData()
	 * @model
	 * @generated
	 */
	EList<ApplicationData> getPostExecData();

} // ExecCommand
