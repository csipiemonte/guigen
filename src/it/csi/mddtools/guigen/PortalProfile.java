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
 * A representation of the model object '<em><b>Portal Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definisce alcune caratteristiche dipendenti dal portale di esposizione.
 * In particolare l'elenco delle risorse statiche che devono essere referenziate
 * dall'applicazione e in che modo deve avvenire tale utilizzo.
 * Permette di modellare tutte le varie combinazioni di possibli utilizzi
 * di librerie javascript, temi, risorse da includere, modalit&agrave; remote/locali
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PortalProfile#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PortalProfile#getResModules <em>Res Modules</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PortalProfile#getWhereAreYouFromPortalCode <em>Where Are You From Portal Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PortalProfile#getResourceProviderCode <em>Resource Provider Code</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalProfile()
 * @model
 * @generated
 */
public interface PortalProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome logico (carattere informativo) del portale
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PortalProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Res Modules</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.WebResourceModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risorse statiche necessarie per l'esposizione dell'applicazione sul portale
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Res Modules</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalProfile_ResModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebResourceModule> getResModules();

	/**
	 * Returns the value of the '<em><b>Where Are You From Portal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice identificativo del portale per il meccanismo di riconoscimento della 
	 * provenienza (<i>where are you from</i>)).
	 * Il codice pu&ograve; essere fornito dal meccanismo di autenticazione (se
	 * previsto) oppure come parametro esplicito: per ogni portale il codice deve essere lo stesso nei due casi.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Where Are You From Portal Code</em>' attribute.
	 * @see #setWhereAreYouFromPortalCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalProfile_WhereAreYouFromPortalCode()
	 * @model
	 * @generated
	 */
	String getWhereAreYouFromPortalCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PortalProfile#getWhereAreYouFromPortalCode <em>Where Are You From Portal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Are You From Portal Code</em>' attribute.
	 * @see #getWhereAreYouFromPortalCode()
	 * @generated
	 */
	void setWhereAreYouFromPortalCode(String value);

	/**
	 * Returns the value of the '<em><b>Resource Provider Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice utilizzato per discriminare i <i>resource provider</i> relativi ai differenti
	 * portali nell'ambito di una esposizione multi-portale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Provider Code</em>' attribute.
	 * @see #setResourceProviderCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalProfile_ResourceProviderCode()
	 * @model
	 * @generated
	 */
	String getResourceProviderCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PortalProfile#getResourceProviderCode <em>Resource Provider Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Provider Code</em>' attribute.
	 * @see #getResourceProviderCode()
	 * @generated
	 */
	void setResourceProviderCode(String value);

} // PortalProfile
