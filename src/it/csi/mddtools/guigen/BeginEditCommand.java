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
