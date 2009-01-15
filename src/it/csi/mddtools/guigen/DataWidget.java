/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.DataWidget#getDataType <em>Data Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DataWidget#getDataTypeModifier <em>Data Type Modifier</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DataWidget#getDatabinding <em>Databinding</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getDataWidget()
 * @model
 * @generated
 */
public interface DataWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.WidgetDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.WidgetDataType
	 * @see #setDataType(WidgetDataType)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDataWidget_DataType()
	 * @model
	 * @generated
	 */
	WidgetDataType getDataType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DataWidget#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.WidgetDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(WidgetDataType value);

	/**
	 * Returns the value of the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Modifier</em>' attribute.
	 * @see #setDataTypeModifier(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDataWidget_DataTypeModifier()
	 * @model
	 * @generated
	 */
	String getDataTypeModifier();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DataWidget#getDataTypeModifier <em>Data Type Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Modifier</em>' attribute.
	 * @see #getDataTypeModifier()
	 * @generated
	 */
	void setDataTypeModifier(String value);

	/**
	 * Returns the value of the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databinding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databinding</em>' containment reference.
	 * @see #setDatabinding(AppDataBinding)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDataWidget_Databinding()
	 * @model containment="true"
	 * @generated
	 */
	AppDataBinding getDatabinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DataWidget#getDatabinding <em>Databinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databinding</em>' containment reference.
	 * @see #getDatabinding()
	 * @generated
	 */
	void setDatabinding(AppDataBinding value);

} // DataWidget
