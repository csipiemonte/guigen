/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#isNillable <em>Nillable</em>}</li>
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

} // SimpleType
