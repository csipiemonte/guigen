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
 * A representation of the model object '<em><b>App Data Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definizione di parametro di <b>PanelDef</b> che permette di rimpiazzare 
 * l'application data fittizio con quello reale nel <b>PanelDefUse</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppDataMappingParam#getDefAppData <em>Def App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataMappingParam()
 * @model
 * @generated
 */
public interface AppDataMappingParam extends PDefParam {
	/**
	 * Returns the value of the '<em><b>Def App Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def App Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def App Data</em>' reference.
	 * @see #setDefAppData(ApplicationData)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataMappingParam_DefAppData()
	 * @model
	 * @generated
	 */
	ApplicationData getDefAppData();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppDataMappingParam#getDefAppData <em>Def App Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def App Data</em>' reference.
	 * @see #getDefAppData()
	 * @generated
	 */
	void setDefAppData(ApplicationData value);

} // AppDataMappingParam
