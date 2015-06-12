/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
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
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationDataDefs#getAppData <em>App Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationDataDefs#getGroups <em>Groups</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationDataDefs#getExtGroups <em>Ext Groups</em>}</li>
 * </ul>
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
