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
 * A representation of the model object '<em><b>App Data Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppDataGroup#getAppData <em>App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataGroup()
 * @model
 * @generated
 */
public interface AppDataGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>App Data</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Data</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataGroup_AppData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationData> getAppData();

} // AppDataGroup
