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
 * A representation of the model object '<em><b>Model Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ModelSlot#getDef <em>Def</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ModelSlot#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlot()
 * @model
 * @generated
 */
public interface ModelSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' reference.
	 * @see #setDef(ModelSlotDef)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlot_Def()
	 * @model
	 * @generated
	 */
	ModelSlotDef getDef();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ModelSlot#getDef <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(ModelSlotDef value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' reference.
	 * @see #setVal(EObject)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlot_Val()
	 * @model
	 * @generated
	 */
	EObject getVal();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ModelSlot#getVal <em>Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' reference.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(EObject value);

} // ModelSlot
