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
 * A representation of the model object '<em><b>Multi Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MultiPanel#getPanels <em>Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiPanel()
 * @model
 * @generated
 */
public interface MultiPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Panels</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panels</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiPanel_Panels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panel> getPanels();

} // MultiPanel
