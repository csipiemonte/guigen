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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * superclasse di tutte le classi che definiscono un particolare layout
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PanelLayout#getColumnSizes <em>Column Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelLayout()
 * @model abstract="true"
 *        annotation="logicpkg pkg='ui.layout'"
 * @generated
 */
public interface PanelLayout extends EObject {

	/**
	 * Returns the value of the '<em><b>Column Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Sizes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * impostazione percentuale della dimensione delle colonne. Varia a seconda del 
	 * particolare tipo di layout. 
	 * Per ogni colonna logica (destinata a contenere un widget composto da label+controllo)
	 * è necessario impostare due valori separati da virgola: i valori in posizione
	 * dispari (1,3,...) determinano la percentuale da assegnare alla label, mentre
	 * i valori in posizione pari (2,4,...) determinano la percentuale da assegnare
	 * al controllo vero e proprio.
	 * Es: per un GridLayout di 2 colonne una possibile impostazione &egrave;:
	 * "20,30,25,25", che equivale ad una occupazone delle due colonne logiche 
	 * del 50% dello spazio e, all'intenro della prima colonna logica il 20% dello spazio sarà assegnato 
	 * alla label mentre il restante 30% sarà assegnato al controllo.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column Sizes</em>' attribute.
	 * @see #setColumnSizes(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelLayout_ColumnSizes()
	 * @model
	 * @generated
	 */
	String getColumnSizes();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelLayout#getColumnSizes <em>Column Sizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Sizes</em>' attribute.
	 * @see #getColumnSizes()
	 * @generated
	 */
	void setColumnSizes(String value);
} // PanelLayout
