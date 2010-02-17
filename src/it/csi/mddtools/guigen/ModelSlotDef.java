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
 * A representation of the model object '<em><b>Model Slot Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definizione di uno slot destinato a contenere un modello ausiliario utilizzabile
 * da un custom template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ModelSlotDef#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ModelSlotDef#getModelClass <em>Model Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlotDef()
 * @model
 * @generated
 */
public interface ModelSlotDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome mnemonico dello slot
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlotDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ModelSlotDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * full qualified name della classe Java corrispondente alla classe EMF degli 
	 * elementi associabili allo slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Class</em>' attribute.
	 * @see #setModelClass(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlotDef_ModelClass()
	 * @model
	 * @generated
	 */
	String getModelClass();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ModelSlotDef#getModelClass <em>Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Class</em>' attribute.
	 * @see #getModelClass()
	 * @generated
	 */
	void setModelClass(String value);

} // ModelSlotDef
