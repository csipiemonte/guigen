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
 * A representation of the model object '<em><b>Type Def Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TypeDefMappingPDefVal#getActualTypeDef <em>Actual Type Def</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTypeDefMappingPDefVal()
 * @model
 * @generated
 */
public interface TypeDefMappingPDefVal extends PDefParamVal {
	/**
	 * Returns the value of the '<em><b>Actual Type Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Type Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Type Def</em>' reference.
	 * @see #setActualTypeDef(Type)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTypeDefMappingPDefVal_ActualTypeDef()
	 * @model
	 * @generated
	 */
	Type getActualTypeDef();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TypeDefMappingPDefVal#getActualTypeDef <em>Actual Type Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Type Def</em>' reference.
	 * @see #getActualTypeDef()
	 * @generated
	 */
	void setActualTypeDef(Type value);

} // TypeDefMappingPDefVal
