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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Rappresenta l'astrazione di una variabile applicativa.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationData#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationData#getLifetimeExtent <em>Lifetime Extent</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationData#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationData()
 * @model annotation="logicpkg pkg='mdl.data'"
 * @generated
 */
public interface ApplicationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome simbolico. Deve essere univoco all'interno dell'applicazione e deve 
	 * essere un codice valido secondo java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lifetime Extent</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.DataLifetimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifetime Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifica la persistenza del valore impostato nell'application data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifetime Extent</em>' attribute.
	 * @see it.csi.mddtools.guigen.DataLifetimeType
	 * @see #setLifetimeExtent(DataLifetimeType)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationData_LifetimeExtent()
	 * @model
	 * @generated
	 */
	DataLifetimeType getLifetimeExtent();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationData#getLifetimeExtent <em>Lifetime Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime Extent</em>' attribute.
	 * @see it.csi.mddtools.guigen.DataLifetimeType
	 * @see #getLifetimeExtent()
	 * @generated
	 */
	void setLifetimeExtent(DataLifetimeType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il tipo del valore contenuto nell'application data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationData_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationData#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ApplicationData
