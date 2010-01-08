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
 * A representation of the model object '<em><b>Panel Def States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * elenco delgi stati disponibili per un determinato <b>PanelDef</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PanelDefStates#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefStates()
 * @model
 * @generated
 */
public interface PanelDefStates extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.PanelDefState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefStates_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<PanelDefState> getStates();

} // PanelDefStates
