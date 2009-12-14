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
 * A representation of the model object '<em><b>PDef Use Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PDefUseConfig#getParamValues <em>Param Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefUseConfig()
 * @model
 * @generated
 */
public interface PDefUseConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Values</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.PDefParamVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme delle valorizzazioni di tutti i parametri previsti dal <b>PanelDef</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param Values</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefUseConfig_ParamValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PDefParamVal> getParamValues();

} // PDefUseConfig
