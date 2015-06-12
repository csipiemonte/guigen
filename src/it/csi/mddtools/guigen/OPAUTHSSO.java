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
 * A representation of the model object '<em><b>OPAUTHSSO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Meccanismo di autenticazione basato su Single Sign On di Oracle Portal
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.OPAUTHSSO#getMinAuthLevel <em>Min Auth Level</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getOPAUTHSSO()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface OPAUTHSSO extends AutenticationMethod {

	/**
	 * Returns the value of the '<em><b>Min Auth Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Auth Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * livello minimo di autenticazione: 
	 * <ul>
	 * <li>1=username/password</li>
	 * <li>2=username/password/pin</li>
	 * <li>3=certificato digitale</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Auth Level</em>' attribute.
	 * @see #setMinAuthLevel(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getOPAUTHSSO_MinAuthLevel()
	 * @model default="1"
	 * @generated
	 */
	int getMinAuthLevel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.OPAUTHSSO#getMinAuthLevel <em>Min Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Auth Level</em>' attribute.
	 * @see #getMinAuthLevel()
	 * @generated
	 */
	void setMinAuthLevel(int value);
} // OPAUTHSSO
