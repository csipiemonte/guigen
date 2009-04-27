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
 * [[TODO: add documentation here]]
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
	 * [[TODO: add documentation here]]
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
	 * [[TODO: add documentation here]]
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
