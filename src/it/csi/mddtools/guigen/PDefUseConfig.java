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
 * A representation of the model object '<em><b>PDef Use Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PDefUseConfig#getParamValues <em>Param Values</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefUseConfig()
 * @model
 * @generated
 */
public interface PDefUseConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Values</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.PDefParamVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme delle valorizzazioni di tutti i parametri previsti dal <b>PanelDef</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param Values</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefUseConfig_ParamValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PDefParamVal> getParamValues();

} // PDefUseConfig
