/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modello di attivazione dell'applicazione.
 * Opzionale
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActivationModel#getActivationParams <em>Activation Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActivationModel()
 * @model annotation="logicpkg pkg='app'"
 * @generated
 */
public interface ActivationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Activation Params</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ActivationParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * elenco dei parametri di attivazione dell'applicazione. Il valore effettivo dei parametri
	 * &egrave; disponibile nella logica di business associata all' <i>onInitCommand</i>
	 * dell'applicazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Params</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActivationModel_ActivationParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivationParam> getActivationParams();

} // ActivationModel
