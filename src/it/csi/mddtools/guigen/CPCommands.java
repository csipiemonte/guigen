/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contenitore dei comandi associati al content panel (vengono eseguiti in 
 * differenti momenti a seconda del tipo di esecuzione del singolo comando)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CPCommands#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCPCommands()
 * @model
 * @generated
 */
public interface CPCommands extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.CPCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'elenco dei comandi
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCPCommands_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<CPCommand> getCommands();

} // CPCommands
