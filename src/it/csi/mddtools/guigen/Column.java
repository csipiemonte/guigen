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
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Column#getSelector <em>Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#isSortable <em>Sortable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Selector()
	 * @model
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortable</em>' attribute.
	 * @see #setSortable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Sortable()
	 * @model
	 * @generated
	 */
	boolean isSortable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#isSortable <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortable</em>' attribute.
	 * @see #isSortable()
	 * @generated
	 */
	void setSortable(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Editable()
	 * @model
	 * @generated
	 */
	String getEditable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #getEditable()
	 * @generated
	 */
	void setEditable(String value);

} // Column
