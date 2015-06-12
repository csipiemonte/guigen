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
 * A representation of the model object '<em><b>Activation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modello di attivazione dell'applicazione.
 * Opzionale
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActivationModel#getActivationParams <em>Activation Params</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActivationModel()
 * @model annotation="logicpkg pkg='app'"
 * @generated
 */
public interface ActivationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Activation Params</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ActivationParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * elenco dei parametri di attivazione dell'applicazione. Il valore effettivo dei parametri
	 * &egrave; disponibile nella logica di business associata all' <i>onInitCommand</i>
	 * dell'applicazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Params</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActivationModel_ActivationParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivationParam> getActivationParams();

} // ActivationModel
