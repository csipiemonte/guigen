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
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo base (semplice).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#isNillable <em>Nillable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#isUserDefined <em>User Defined</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#getDataTypeModifiers <em>Data Type Modifiers</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#getEditHintMsg <em>Edit Hint Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends Type {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.SimpleTypeCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice che serve per discriminare il tipo base specifico.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.SimpleTypeCodes
	 * @see #setCode(SimpleTypeCodes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_Code()
	 * @model
	 * @generated
	 */
	SimpleTypeCodes getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.SimpleTypeCodes
	 * @see #getCode()
	 * @generated
	 */
	void setCode(SimpleTypeCodes value);

	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true, il tipo ammette il vlaore <i>null</i> nel suo dominio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #setNillable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_Nillable()
	 * @model
	 * @generated
	 */
	boolean isNillable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #isNillable()
	 * @generated
	 */
	void setNillable(boolean value);

	/**
	 * Returns the value of the '<em><b>User Defined</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true, il tipo ammette il vlaore <i>null</i> nel suo dominio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined</em>' attribute.
	 * @see #setUserDefined(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_UserDefined()
	 * @model default="false"
	 * @generated
	 */
	boolean isUserDefined();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#isUserDefined <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined</em>' attribute.
	 * @see #isUserDefined()
	 * @generated
	 */
	void setUserDefined(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Modifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Modifiers</em>' attribute list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_DataTypeModifiers()
	 * @model
	 * @generated
	 */
	EList<String> getDataTypeModifiers();

	/**
	 * Returns the value of the '<em><b>Edit Hint Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Hint Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Hint Msg</em>' attribute.
	 * @see #setEditHintMsg(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_EditHintMsg()
	 * @model
	 * @generated
	 */
	String getEditHintMsg();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#getEditHintMsg <em>Edit Hint Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Hint Msg</em>' attribute.
	 * @see #getEditHintMsg()
	 * @generated
	 */
	void setEditHintMsg(String value);

} // SimpleType
