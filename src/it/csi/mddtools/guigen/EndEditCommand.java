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
 * A representation of the model object '<em><b>End Edit Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di terminare una sessione di editing su un certo insieme di <b>ApplicationData</b>,
 * con la possibilità di effettuare un <i>undo</i> sui dati specificati.
 * Utilizzato in congiunzione con <b>BeginEditCommand</b>. 
 * Nota: data la struttura dei due comandi di inizio e fine della sessione di
 * editing &egrave; possibile effettuare l'<i>undo</i> di una parte degli
 * application data specificati nel comando di inizio editing (specificando
 * nel <b>EndEditCommand</b> solo una parte degli application data
 * precedentemente specificati nel <b>BeginEditCommand</b>.
 * Si consiglia, in questi casi, di terminare correttamente la sessione di 
 * editing per <b>tutti</b> gli application data per evitar eche rimangano 
 * in memoria dati di backup obsoleti.
 * Per far ci&ograve; &egrave; sufficiente utilizzare due volte il comando
 * <b>EndEditCommand</b>: la prima volta con <i>undo</i> impostato a
 * true (e specificando solo i dati di cui si vuole effettuare l'undo) e
 * una seconda volta con <i>undo</i> impostato a false, specificando 
 * i restanti dati.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.EndEditCommand#getDataEdited <em>Data Edited</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.EndEditCommand#isUndo <em>Undo</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getEndEditCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface EndEditCommand extends Command {
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
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEndEditCommand_DataEdited()
	 * @model
	 * @generated
	 */
	EList<ApplicationData> getDataEdited();

	/**
	 * Returns the value of the '<em><b>Undo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true viene ripristinato il valore originario di tutti gli
	 * <b>ApplicationData</b> indicati.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undo</em>' attribute.
	 * @see #setUndo(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEndEditCommand_Undo()
	 * @model
	 * @generated
	 */
	boolean isUndo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EndEditCommand#isUndo <em>Undo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undo</em>' attribute.
	 * @see #isUndo()
	 * @generated
	 */
	void setUndo(boolean value);

} // EndEditCommand
