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
 * A representation of the model object '<em><b>Custom Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Un template custom da utilizzarsi per la generazione <i>full</i> 
 * del codice a fronte di un <b>ExecCommand</b>. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CustomTemplate#getTplID <em>Tpl ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CustomTemplate#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CustomTemplate#getModelSlots <em>Model Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomTemplate()
 * @model
 * @generated
 */
public interface CustomTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Tpl ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tpl ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID mnemonico del template. Il valore di questo attributo sar&agrave; a 
	 * disposizione del codiuce che implementa il template <i>XPand</i>, e 
	 * dovrà essere utilizzato per instradare la logica di generazione verso il 
	 * template corretto.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tpl ID</em>' attribute.
	 * @see #setTplID(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomTemplate_TplID()
	 * @model
	 * @generated
	 */
	String getTplID();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CustomTemplate#getTplID <em>Tpl ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tpl ID</em>' attribute.
	 * @see #getTplID()
	 * @generated
	 */
	void setTplID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome del template
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CustomTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Slots</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ModelSlotDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dichiarazione degli <i>slot</i> (opzionali) destinati a contenere eventuali 
	 * modelli ausiliarii.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Slots</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomTemplate_ModelSlots()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelSlotDef> getModelSlots();

} // CustomTemplate
