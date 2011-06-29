/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
 * <!-- begin-model-doc -->
 * Classe astratta dalla quale discendono tutte le classi che rappresentano
 * widget associabili a dati (<b>ApplicationData</b>). Un <b>DataWidget</b>
 * ha un concetto di <i>valore</i> del widget che rappresenta l'input inserito.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.DataWidget#getDataTypeModifier <em>Data Type Modifier</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DataWidget#getDatabinding <em>Databinding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DataWidget#getDataType <em>Data Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DataWidget#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getDataWidget()
 * @model annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface DataWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tipo del valore atteso. Deve essere un <b>SimpleType</b> e deve corrispondenre con il tipo del
	 * binding eventualmente associato.
	 * Se non viene associato nessun binding, esiste comunque un binding implicito
	 * a scope USER_ACTION (sconsigliato).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(Type)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDataWidget_DataType()
	 * @model
	 * @generated
	 */
	Type getDataType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DataWidget#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Type value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configurazione di validazione che indica che il valore associato al widget è obbligatorio. 
	 * Utilizzato solo nel caso di binding ad un application data non strutturato.
	 * Nel caso di binding con un field di un application data di tipo strutturato, 
	 * l'eventuale constraint di obbligatoriet&agrave; deve essere impostato nel <b>ComplexType</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDataWidget_Required()
	 * @model default="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DataWidget#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Il binding verso l' <b>ApplicationData</b> nel quale deve essere inserito
	 * il valore immesso dall'utente tramite il widget.
	 * <!-- end-model-doc -->
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
