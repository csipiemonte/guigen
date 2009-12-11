/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Campo di immissione testo multilinea.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TextArea#getRows <em>Rows</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TextArea#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends DataWidget {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione in righe dell'area di input. Se nell'input si supera il numero
	 * di righe specificate appare una scrollbar verticale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextArea_Rows()
	 * @model default="10"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextArea#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione in colonne dell'area di input. Se nell'input si supera il numero
	 * di colonne specificate appare una scrollbar orizzontale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextArea_Columns()
	 * @model default="30"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextArea#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

} // TextArea
