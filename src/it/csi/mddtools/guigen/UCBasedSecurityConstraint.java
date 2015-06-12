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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Based Security Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Security constraint basato sull'abilitazione dell'utente corrente ad un particolare UseCase
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.UCBasedSecurityConstraint#getUseCase <em>Use Case</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getUCBasedSecurityConstraint()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface UCBasedSecurityConstraint extends UISecurityConstraint {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lo UseCase di riferimento
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' reference.
	 * @see #setUseCase(UseCase)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getUCBasedSecurityConstraint_UseCase()
	 * @model
	 * @generated
	 */
	UseCase getUseCase();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.UCBasedSecurityConstraint#getUseCase <em>Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' reference.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(UseCase value);

} // UCBasedSecurityConstraint
