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
 * A representation of the model object '<em><b>Sequence Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di eseguire in sequenza i comandi specificati. I codice di ritorno 
 * del comando &egrave; il codice dell'ultimo dei comandi.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.SequenceCommand#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSequenceCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface SequenceCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli elementi della sequenza di comandi.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSequenceCommand_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // SequenceCommand
