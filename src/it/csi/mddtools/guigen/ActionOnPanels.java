/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action On Panels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActionOnPanels#getTargetPanels <em>Target Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActionOnPanels()
 * @model abstract="true"
 * @generated
 */
public interface ActionOnPanels extends Action {
	/**
	 * Returns the value of the '<em><b>Target Panels</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Panels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Panels</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActionOnPanels_TargetPanels()
	 * @model
	 * @generated
	 */
	EList<Panel> getTargetPanels();

} // ActionOnPanels
