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
 * <!-- begin-model-doc -->
 * DataWidget per l'immissione di testo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TextField#getFieldLength <em>Field Length</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TextField#getFieldMaxLength <em>Field Max Length</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Dimensione in caratteri dell area visibile del campo.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Field Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero massimo di caratteri digitabili
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Max Length</em>' attribute.
	 * @see #setFieldMaxLength(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextField_FieldMaxLength()
	 * @model
	 * @generated
	 */
	int getFieldMaxLength();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextField#getFieldMaxLength <em>Field Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Max Length</em>' attribute.
	 * @see #getFieldMaxLength()
	 * @generated
	 */
	void setFieldMaxLength(int value);

} // TextField
