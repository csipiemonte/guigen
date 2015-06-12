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
 * A representation of the model object '<em><b>Repart Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Rappresenta un <i>modulo</i> di <i>artefatti</i> disponibile
 * sul repository degli artefatti.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.RepartModule#getOrganization <em>Organization</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.RepartModule#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.RepartModule#getVersion <em>Version</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.RepartModule#getType <em>Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.RepartModule#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRepartModule()
 * @model
 * @generated
 */
public interface RepartModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * organizzazione a cui appartiene il modulo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRepartModule_Organization()
	 * @model required="true"
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RepartModule#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome del modulo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRepartModule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RepartModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * versione del modulo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRepartModule_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RepartModule#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.RepartModuleTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * tipo di modulo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.RepartModuleTypes
	 * @see #setType(RepartModuleTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRepartModule_Type()
	 * @model required="true"
	 * @generated
	 */
	RepartModuleTypes getType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RepartModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.RepartModuleTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(RepartModuleTypes value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.RepartArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco degli artefatti contenuti nel modulo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRepartModule_Artifacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepartArtifact> getArtifacts();

} // RepartModule
