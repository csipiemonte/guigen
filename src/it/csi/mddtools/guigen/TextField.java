/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TextField#getFieldLength <em>Field Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends DataWidget {
	/**
	 * Returns the value of the '<em><b>Field Length</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Length</em>' attribute.
	 * @see #setFieldLength(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextField_FieldLength()
	 * @model default="15"
	 * @generated
	 */
	int getFieldLength();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextField#getFieldLength <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Length</em>' attribute.
	 * @see #getFieldLength()
	 * @generated
	 */
	void setFieldLength(int value);

} // TextField
