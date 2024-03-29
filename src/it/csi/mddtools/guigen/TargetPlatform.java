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
 * A representation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * specifica della target platform per cui deve essere generato il pacchetto, pi&ugrave; altre caratteristiche tecniche.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#isEnableFatClient <em>Enable Fat Client</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#getPortalExpositions <em>Portal Expositions</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#getWayfProfile <em>Wayf Profile</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#getSecurityProfile <em>Security Profile</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform()
 * @model
 * @generated
 */
public interface TargetPlatform extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.TargetPlatformCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice della piattaforma target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.TargetPlatformCodes
	 * @see #setCode(TargetPlatformCodes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_Code()
	 * @model
	 * @generated
	 */
	TargetPlatformCodes getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.TargetPlatformCodes
	 * @see #getCode()
	 * @generated
	 */
	void setCode(TargetPlatformCodes value);

	/**
	 * Returns the value of the '<em><b>Enable Rich UI Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Rich UI Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true sono abilitati i comportamenti "ricchi" di User Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Rich UI Behavior</em>' attribute.
	 * @see #setEnableRichUIBehavior(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_EnableRichUIBehavior()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnableRichUIBehavior();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Rich UI Behavior</em>' attribute.
	 * @see #isEnableRichUIBehavior()
	 * @generated
	 */
	void setEnableRichUIBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Fat Client</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true sono abilitati i comportamenti "ricchi" di User Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Fat Client</em>' attribute.
	 * @see #setEnableFatClient(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_EnableFatClient()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnableFatClient();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#isEnableFatClient <em>Enable Fat Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Fat Client</em>' attribute.
	 * @see #isEnableFatClient()
	 * @generated
	 */
	void setEnableFatClient(boolean value);

	/**
	 * Returns the value of the '<em><b>Portal Expositions</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.PortalExposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco dei portali di esposizione dell'applicativo, nell'ambito di una esposizione
	 * multi-portale 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portal Expositions</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_PortalExpositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortalExposition> getPortalExpositions();

	/**
	 * Returns the value of the '<em><b>Wayf Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wayf Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wayf Profile</em>' reference.
	 * @see #setWayfProfile(WAYFProfile)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_WayfProfile()
	 * @model
	 * @generated
	 */
	WAYFProfile getWayfProfile();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#getWayfProfile <em>Wayf Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wayf Profile</em>' reference.
	 * @see #getWayfProfile()
	 * @generated
	 */
	void setWayfProfile(WAYFProfile value);

	/**
	 * Returns the value of the '<em><b>Security Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Profile</em>' reference.
	 * @see #setSecurityProfile(SecurityProfile)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_SecurityProfile()
	 * @model
	 * @generated
	 */
	SecurityProfile getSecurityProfile();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#getSecurityProfile <em>Security Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Profile</em>' reference.
	 * @see #getSecurityProfile()
	 * @generated
	 */
	void setSecurityProfile(SecurityProfile value);

} // TargetPlatform
