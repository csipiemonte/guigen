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
 * A representation of the model object '<em><b>Std Web Resource Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modulo standard di risorse web attualmente utilizzabili nell'applicazione.
 * L'utilizzo effettivo di ciascuna tipologia dipende dal tipo di modulo
 * (attributo <i>stdName</i>)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.StdWebResourceModule#getStdName <em>Std Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getStdWebResourceModule()
 * @model
 * @generated
 */
public interface StdWebResourceModule extends WebResourceModule {
	/**
	 * Returns the value of the '<em><b>Std Name</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.StdWebResModuleNames}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Name</em>' attribute.
	 * @see it.csi.mddtools.guigen.StdWebResModuleNames
	 * @see #setStdName(StdWebResModuleNames)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getStdWebResourceModule_StdName()
	 * @model
	 * @generated
	 */
	StdWebResModuleNames getStdName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.StdWebResourceModule#getStdName <em>Std Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Name</em>' attribute.
	 * @see it.csi.mddtools.guigen.StdWebResModuleNames
	 * @see #getStdName()
	 * @generated
	 */
	void setStdName(StdWebResModuleNames value);

} // StdWebResourceModule
