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
 * A representation of the model object '<em><b>Security Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Caratteristiche di sicurezza dell'applicazione
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getAutenticationMethod <em>Autentication Method</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getActors <em>Actors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getSecurityAppID <em>Security App ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getUserInfoLogoutAction <em>User Info Logout Action</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#isAskForConfirmationOnLogout <em>Ask For Confirmation On Logout</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface SecurityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Autentication Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autentication Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifica la modalit&agrave; di autenticazione prevista per l'applicazione
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autentication Method</em>' containment reference.
	 * @see #setAutenticationMethod(AutenticationMethod)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_AutenticationMethod()
	 * @model containment="true"
	 * @generated
	 */
	AutenticationMethod getAutenticationMethod();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityModel#getAutenticationMethod <em>Autentication Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autentication Method</em>' containment reference.
	 * @see #getAutenticationMethod()
	 * @generated
	 */
	void setAutenticationMethod(AutenticationMethod value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco degli <b>Actor</b> dell'applicazione (secondo la terminologia di IRIDE2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco degli <b>UseCase</b> dell'applicazione (secondo la terminologia di IRIDE2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_UseCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUseCases();

	/**
	 * Returns the value of the '<em><b>Security App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security App ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice identificativo dell'applicazione, come censito in IRIDE2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security App ID</em>' attribute.
	 * @see #setSecurityAppID(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_SecurityAppID()
	 * @model
	 * @generated
	 */
	String getSecurityAppID();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityModel#getSecurityAppID <em>Security App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security App ID</em>' attribute.
	 * @see #getSecurityAppID()
	 * @generated
	 */
	void setSecurityAppID(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco dei <b>Role</b> dell'applicazione (secondo la terminologia di IRIDE2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>User Info Logout Action</b></em>' attribute.
	 * The default value is <code>"LOCAL_LOGOUT"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.LogoutActionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Info Logout Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Azione che viene associata al link <i>esci</i> presente sullo 
	 * <b>UserInfoPanel</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Info Logout Action</em>' attribute.
	 * @see it.csi.mddtools.guigen.LogoutActionTypes
	 * @see #setUserInfoLogoutAction(LogoutActionTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_UserInfoLogoutAction()
	 * @model default="LOCAL_LOGOUT"
	 * @generated
	 */
	LogoutActionTypes getUserInfoLogoutAction();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityModel#getUserInfoLogoutAction <em>User Info Logout Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Info Logout Action</em>' attribute.
	 * @see it.csi.mddtools.guigen.LogoutActionTypes
	 * @see #getUserInfoLogoutAction()
	 * @generated
	 */
	void setUserInfoLogoutAction(LogoutActionTypes value);

	/**
	 * Returns the value of the '<em><b>Ask For Confirmation On Logout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostata a <i>true</i> all'azione di logout viene chiesta conferma all'utente.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ask For Confirmation On Logout</em>' attribute.
	 * @see #setAskForConfirmationOnLogout(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_AskForConfirmationOnLogout()
	 * @model
	 * @generated
	 */
	boolean isAskForConfirmationOnLogout();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityModel#isAskForConfirmationOnLogout <em>Ask For Confirmation On Logout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ask For Confirmation On Logout</em>' attribute.
	 * @see #isAskForConfirmationOnLogout()
	 * @generated
	 */
	void setAskForConfirmationOnLogout(boolean value);

} // SecurityModel
