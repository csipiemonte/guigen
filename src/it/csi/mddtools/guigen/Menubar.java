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
 * A representation of the model object '<em><b>Menubar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Menubar#getTopLevelMenu <em>Top Level Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMenubar()
 * @model
 * @generated
 */
public interface Menubar extends EObject {
	/**
	 * Returns the value of the '<em><b>Top Level Menu</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Level Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level Menu</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenubar_TopLevelMenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getTopLevelMenu();

} // Menubar
