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
 * A representation of the model object '<em><b>PDef Param Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PDefParamVal#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefParamVal()
 * @model abstract="true"
 * @generated
 */
public interface PDefParamVal extends EObject {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(PDefParam)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefParamVal_Param()
	 * @model
	 * @generated
	 */
	PDefParam getParam();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PDefParamVal#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(PDefParam value);

} // PDefParamVal
