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
 * A representation of the model object '<em><b>Form Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.FormPanel#getSubpanels <em>Subpanels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.FormPanel#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel()
 * @model
 * @generated
 */
public interface FormPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Subpanels</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpanels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpanels</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel_Subpanels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panel> getSubpanels();

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

} // FormPanel
