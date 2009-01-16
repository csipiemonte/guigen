/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Column Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Model</em>' containment reference.
	 * @see #setColumnModel(ColumnModel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_ColumnModel()
	 * @model containment="true"
	 * @generated
	 */
	ColumnModel getColumnModel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Model</em>' containment reference.
	 * @see #getColumnModel()
	 * @generated
	 */
	void setColumnModel(ColumnModel value);

} // Table
