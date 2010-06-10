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
 * A representation of the model object '<em><b>Application Data Defs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Insieme delle definizioni di application data utilizzati nell'applicativo
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationDataDefs#getAppData <em>App Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationDataDefs#getGroups <em>Groups</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationDataDefs#getExtGroups <em>Ext Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationDataDefs()
 * @model annotation="logicpkg pkg='mdl.data'"
 * @generated
 */
public interface ApplicationDataDefs extends EObject {
	/**
	 * Returns the value of the '<em><b>App Data</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEPRECATO: utilizzare application data definiti all'interno di <b>AppDataGroup</b>
	 * mantenuti esternamente e referenziati in <i>extGroups</i>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Data</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationDataDefs_AppData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationData> getAppData();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.AppDataGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEPRECATO: utilizzare <i>extGroups</i>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationDataDefs_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppDataGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Ext Groups</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.AppDataGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * referenzia gli <b>AppDataGroup</b> definiti esternamente e utilizzati nell'applicazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Groups</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationDataDefs_ExtGroups()
	 * @model
	 * @generated
	 */
	EList<AppDataGroup> getExtGroups();

} // ApplicationDataDefs
