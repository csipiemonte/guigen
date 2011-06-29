/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Def Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TypeDefMappingParam#getDefTypeDef <em>Def Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTypeDefMappingParam()
 * @model
 * @generated
 */
public interface TypeDefMappingParam extends PDefParam {
	/**
	 * Returns the value of the '<em><b>Def Type Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Type Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Type Def</em>' reference.
	 * @see #setDefTypeDef(Type)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTypeDefMappingParam_DefTypeDef()
	 * @model
	 * @generated
	 */
	Type getDefTypeDef();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TypeDefMappingParam#getDefTypeDef <em>Def Type Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Type Def</em>' reference.
	 * @see #getDefTypeDef()
	 * @generated
	 */
	void setDefTypeDef(Type value);

} // TypeDefMappingParam
