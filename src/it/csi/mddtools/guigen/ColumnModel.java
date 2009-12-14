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
 * A representation of the model object '<em><b>Column Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modello delle colonne di una tabella (<b>Table</b>). Determina quali 
 * colonne vengono visualizzate, in che ordine e altre caratteristiche della tabella.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ColumnModel#getColumns <em>Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ColumnModel#getValueSelector <em>Value Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getColumnModel()
 * @model
 * @generated
 */
public interface ColumnModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco (ordinato) delle colonne che devono essere visualizzate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumnModel_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * seleziona il field del record di cui è composta la collezione collegata
	 * alla Table che deve essere utilizzato come valore di selezione.
	 * Utilizzato solo in congiunzione con un value-binding (quindi con possibilità
	 * di selezione).
	 * Es: se:
	 * <ul>
	 * <li> la tabella è collegata ad una collezione di un tipo <i>Persona</i>, 
	 * costituito dai field:
	 *   <ul>
	 *   <li>codFisc: String</li>
	 *   <li>nome: String</li>
	 *   <li>cognome: String</li>
	 *   </ul>
	 * </li>
	 * <li>il <i>value-binding</i> &egrave; associato ad un appdata di tipo String</li>
	 * <li>il <i>valueSelector</i> &egrave; impostato come "codFisc" </li>
	 * </ul>
	 * Allora selezionando una riga della tabella l'application data di value-binding 
	 * sarà impostato con il codice fiscale del record corrispondente.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Selector</em>' attribute.
	 * @see #setValueSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumnModel_ValueSelector()
	 * @model
	 * @generated
	 */
	String getValueSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ColumnModel#getValueSelector <em>Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Selector</em>' attribute.
	 * @see #getValueSelector()
	 * @generated
	 */
	void setValueSelector(String value);

} // ColumnModel
