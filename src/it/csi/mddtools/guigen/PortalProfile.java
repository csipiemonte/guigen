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
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PortalProfile#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PortalProfile#getResModules <em>Res Modules</em>}</li>
 * </ul>
 * </p>
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

} // PortalProfile
