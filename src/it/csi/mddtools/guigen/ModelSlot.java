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
 * A representation of the model object '<em><b>Model Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Valorizzazione di uno slot con un modello utilizzabile dal custom template
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ModelSlot#getDef <em>Def</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ModelSlot#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlot()
 * @model
 * @generated
 */
public interface ModelSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definizione del model slot di cui questo <b>ModelSlot</b> rappresenta la
	 * valorizzazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def</em>' reference.
	 * @see #setDef(ModelSlotDef)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlot_Def()
	 * @model
	 * @generated
	 */
	ModelSlotDef getDef();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ModelSlot#getDef <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(ModelSlotDef value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Valore dello slot. Il tipo dell'elemento associato deve corrispondere con
	 * quanto dichiarato nell'attributo <i>modelClass</i> dell'oggetto 
	 * <b>ModelSlotDef</b> corrispondente.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Val</em>' reference.
	 * @see #setVal(EObject)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getModelSlot_Val()
	 * @model
	 * @generated
	 */
	EObject getVal();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ModelSlot#getVal <em>Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' reference.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(EObject value);

} // ModelSlot
