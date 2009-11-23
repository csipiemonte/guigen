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
 * A representation of the model object '<em><b>Activation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActivationModel#getActivationParams <em>Activation Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActivationModel()
 * @model
 * @generated
 */
public interface ActivationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Activation Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Params</em>' containment reference.
	 * @see #setActivationParams(ActivationParam)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActivationModel_ActivationParams()
	 * @model containment="true"
	 * @generated
	 */
	ActivationParam getActivationParams();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActivationModel#getActivationParams <em>Activation Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Params</em>' containment reference.
	 * @see #getActivationParams()
	 * @generated
	 */
	void setActivationParams(ActivationParam value);

} // ActivationModel
