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
 * A representation of the model object '<em><b>Begin Edit Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dichiara l'inizio di una sessione di editing, effettuando un backup in memoria
 * degli <b>ApplicationData</b> specificati.
 * La copia di backup sar&agrave; realizzata per valore e potr&agrave; essere utilizzata
 * per ripristinare il valore originario (funzione di <i>undo</i> richiamata
 * utilizzando <b>EndEditCommand</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.BeginEditCommand#getDataEdited <em>Data Edited</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getBeginEditCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface BeginEditCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Data Edited</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Edited</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco dei dati oggetto dell'editing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Edited</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getBeginEditCommand_DataEdited()
	 * @model
	 * @generated
	 */
	EList<ApplicationData> getDataEdited();

} // BeginEditCommand
