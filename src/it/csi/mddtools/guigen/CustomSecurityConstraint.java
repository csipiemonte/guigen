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
 * A representation of the model object '<em><b>Custom Security Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Security constraint a logica custom
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CustomSecurityConstraint#getMethodNameSuffix <em>Method Name Suffix</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomSecurityConstraint()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface CustomSecurityConstraint extends UISecurityConstraint {

	/**
	 * Returns the value of the '<em><b>Method Name Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * suffisso del nome del metodo nel quale dovr&agrave; essere codificata la logica del constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Name Suffix</em>' attribute.
	 * @see #setMethodNameSuffix(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomSecurityConstraint_MethodNameSuffix()
	 * @model
	 * @generated
	 */
	String getMethodNameSuffix();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CustomSecurityConstraint#getMethodNameSuffix <em>Method Name Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name Suffix</em>' attribute.
	 * @see #getMethodNameSuffix()
	 * @generated
	 */
	void setMethodNameSuffix(String value);
} // CustomSecurityConstraint
