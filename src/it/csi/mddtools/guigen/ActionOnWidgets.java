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
 * A representation of the model object '<em><b>Action On Widgets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActionOnWidgets#getTargetWidgets <em>Target Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActionOnWidgets()
 * @model abstract="true"
 * @generated
 */
public interface ActionOnWidgets extends Action {
	/**
	 * Returns the value of the '<em><b>Target Widgets</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Widgets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Widgets</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActionOnWidgets_TargetWidgets()
	 * @model required="true"
	 * @generated
	 */
	EList<Widget> getTargetWidgets();

} // ActionOnWidgets
