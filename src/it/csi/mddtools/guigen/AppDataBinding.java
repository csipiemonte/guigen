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
 * A representation of the model object '<em><b>App Data Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Collegamento con un application data o con una parte di esso.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppDataBinding#getAppData <em>App Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppDataBinding#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataBinding()
 * @model annotation="logicpkg pkg='mdl.data'"
 * @generated
 */
public interface AppDataBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>App Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'application data collegato
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Data</em>' reference.
	 * @see #setAppData(ApplicationData)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataBinding_AppData()
	 * @model
	 * @generated
	 */
	ApplicationData getAppData();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppDataBinding#getAppData <em>App Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Data</em>' reference.
	 * @see #getAppData()
	 * @generated
	 */
	void setAppData(ApplicationData value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se specificato fain modo che il binding non sia sul valore dell'application data, ma
	 * su uno specifico field del record.
	 * Ad esempio se un application data "titolare" ha come tipo un <b>ComplexType</b>
	 * di nome <i>Persona</i>, con un campo <i>nome</i>, &egrave; possibile
	 * associare un textfield a tale campo impostando nell'<b>AppDataBinding</b>:
	 * <ul>
	 * <li>l'elemento <i>appData</i> in modo che punti all'application data "titolare"</li>
	 * <li>l'elemento <i>path</i> in modo che valga "nome"</li>
	 * </ul>
	 * E'ovviamente possibile utilizzare <i>path</i> pi&ugrave; complessi
	 * (es. "persona.indirizzo.numCivico").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataBinding_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppDataBinding#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // AppDataBinding
