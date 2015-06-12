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
 * A representation of the model object '<em><b>App Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modulo dell'applicativo. Da mantenere in un file separato.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppModule#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppModule#getContentPanels <em>Content Panels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppModule#getExtSecurityModel <em>Ext Security Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppModule#isSecure <em>Secure</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppModule()
 * @model
 * @generated
 */
public interface AppModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice identificativo del modulo. Deve essere univoco all'interno 
	 * dell'applicazione e deve essere un identificativo valido di package java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content Panels</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ContentPanel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Panels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco delle schermate che costituiscono il modulo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Panels</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppModule_ContentPanels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentPanel> getContentPanels();

	/**
	 * Returns the value of the '<em><b>Ext Security Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Security Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * riferimento al modello di sicurezza.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Security Model</em>' reference.
	 * @see #setExtSecurityModel(SecurityModel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppModule_ExtSecurityModel()
	 * @model
	 * @generated
	 */
	SecurityModel getExtSecurityModel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppModule#getExtSecurityModel <em>Ext Security Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Security Model</em>' reference.
	 * @see #getExtSecurityModel()
	 * @generated
	 */
	void setExtSecurityModel(SecurityModel value);

	/**
	 * Returns the value of the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure</em>' attribute.
	 * @see #setSecure(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppModule_Secure()
	 * @model
	 * @generated
	 */
	boolean isSecure();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppModule#isSecure <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure</em>' attribute.
	 * @see #isSecure()
	 * @generated
	 */
	void setSecure(boolean value);

} // AppModule
