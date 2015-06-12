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
 * A representation of the model object '<em><b>Web Resource Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modulo di risorse web che l'applicazione utilizza in vario modo. 
 * Preferibilmente si utilizza la sottoclasse <i>StdWebResourceModule</i>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.WebResourceModule#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WebResourceModule#getVersion <em>Version</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WebResourceModule#getDeploymentType <em>Deployment Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WebResourceModule#getRepartModule <em>Repart Module</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWebResourceModule()
 * @model abstract="true"
 * @generated
 */
public interface WebResourceModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome logico del modulo. Non &egrave; necessario che corrisponda al nome
	 * del modulo disponibile su repart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWebResourceModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WebResourceModule#getName <em>Name</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versione del modulo. Non &egrave; necessario che corrisponda alla versione
	 * del modulo disponibile su repart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWebResourceModule_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WebResourceModule#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Repart Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repart Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modulo effettivo disponibile su repart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repart Module</em>' containment reference.
	 * @see #isSetRepartModule()
	 * @see #unsetRepartModule()
	 * @see #setRepartModule(RepartModule)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWebResourceModule_RepartModule()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	RepartModule getRepartModule();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WebResourceModule#getRepartModule <em>Repart Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repart Module</em>' containment reference.
	 * @see #isSetRepartModule()
	 * @see #unsetRepartModule()
	 * @see #getRepartModule()
	 * @generated
	 */
	void setRepartModule(RepartModule value);

	/**
	 * Unsets the value of the '{@link it.csi.mddtools.guigen.WebResourceModule#getRepartModule <em>Repart Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepartModule()
	 * @see #getRepartModule()
	 * @see #setRepartModule(RepartModule)
	 * @generated
	 */
	void unsetRepartModule();

	/**
	 * Returns whether the value of the '{@link it.csi.mddtools.guigen.WebResourceModule#getRepartModule <em>Repart Module</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repart Module</em>' containment reference is set.
	 * @see #unsetRepartModule()
	 * @see #getRepartModule()
	 * @see #setRepartModule(RepartModule)
	 * @generated
	 */
	boolean isSetRepartModule();

	/**
	 * Returns the value of the '<em><b>Deployment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.WebResModuleDeployTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determina:
	 * <ul>
	 * <li>dove il modulo sar&agrave; installato in esercizio</li>
	 * <li>se e come sar&agrave; referenziato a build time</i>
	 * <li>come sar&agrave; referenziato a runtime</i>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.WebResModuleDeployTypes
	 * @see #setDeploymentType(WebResModuleDeployTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWebResourceModule_DeploymentType()
	 * @model
	 * @generated
	 */
	WebResModuleDeployTypes getDeploymentType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WebResourceModule#getDeploymentType <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.WebResModuleDeployTypes
	 * @see #getDeploymentType()
	 * @generated
	 */
	void setDeploymentType(WebResModuleDeployTypes value);

} // WebResourceModule
