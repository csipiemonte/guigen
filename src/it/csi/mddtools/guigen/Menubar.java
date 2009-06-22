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
 *   <li>{@link it.csi.mddtools.guigen.Menubar#isRemoteInfoBox <em>Remote Info Box</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Remote Info Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Info Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Info Box</em>' attribute.
	 * @see #setRemoteInfoBox(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenubar_RemoteInfoBox()
	 * @model
	 * @generated
	 */
	boolean isRemoteInfoBox();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Menubar#isRemoteInfoBox <em>Remote Info Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Info Box</em>' attribute.
	 * @see #isRemoteInfoBox()
	 * @generated
	 */
	void setRemoteInfoBox(boolean value);

} // Menubar
