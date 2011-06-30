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
 * A representation of the model object '<em><b>Custom Cartridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Cartuccia custom da utilizzare per la <i>full-code generation</i> in un 
 * <b>ExecCommand</b>.
 * La definizione di una <b>CustomCartridge</b> &egrave; considerata una 
 * feature avanzata.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CustomCartridge#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CustomCartridge#getCrtID <em>Crt ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CustomCartridge#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomCartridge()
 * @model
 * @generated
 */
public interface CustomCartridge extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome mnemonico della cartuccia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomCartridge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CustomCartridge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Crt ID</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.CustomCartridgeID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crt ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * id della cartuccia
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crt ID</em>' attribute.
	 * @see it.csi.mddtools.guigen.CustomCartridgeID
	 * @see #setCrtID(CustomCartridgeID)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomCartridge_CrtID()
	 * @model
	 * @generated
	 */
	CustomCartridgeID getCrtID();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CustomCartridge#getCrtID <em>Crt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crt ID</em>' attribute.
	 * @see it.csi.mddtools.guigen.CustomCartridgeID
	 * @see #getCrtID()
	 * @generated
	 */
	void setCrtID(CustomCartridgeID value);

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.CustomTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Template messi a disposizione dalla cartuccia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomCartridge_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomTemplate> getTemplates();

} // CustomCartridge
