/**
 * <copyright>
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
 * [[TODO: add documentation here]]
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
