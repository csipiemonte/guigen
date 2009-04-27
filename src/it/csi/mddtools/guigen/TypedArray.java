/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TypedArray#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedArray()
 * @model
 * @generated
 */
public interface TypedArray extends Type {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Type)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedArray_ComponentType()
	 * @model
	 * @generated
	 */
	Type getComponentType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TypedArray#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Type value);

} // TypedArray
