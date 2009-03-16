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
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ComplexType#getFields <em>Fields</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComplexType#isInitFields <em>Init Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends Type {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Init Fields</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Fields</em>' attribute.
	 * @see #setInitFields(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType_InitFields()
	 * @model default="false"
	 * @generated
	 */
	boolean isInitFields();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComplexType#isInitFields <em>Init Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Fields</em>' attribute.
	 * @see #isInitFields()
	 * @generated
	 */
	void setInitFields(boolean value);

} // ComplexType
