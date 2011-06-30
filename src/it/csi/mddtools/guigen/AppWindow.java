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
 * A representation of the model object '<em><b>App Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Finestra applicativa comprendente le parti comuni a tutte le schermate e la
 * parte variabile.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppWindow#getFooter <em>Footer</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppWindow#getHeader <em>Header</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppWindow#getAppArea <em>App Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow()
 * @model annotation="logicpkg pkg='app'"
 * @generated
 */
public interface AppWindow extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Header del portale. Comune a tutte le schermate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow_Header()
	 * @model containment="true"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppWindow#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footer del portale. Comune a tutte le schermate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(Footer)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow_Footer()
	 * @model containment="true"
	 * @generated
	 */
	Footer getFooter();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppWindow#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(Footer value);

	/**
	 * Returns the value of the '<em><b>App Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Porzione di finestra dipendente dall'applicazione
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Area</em>' containment reference.
	 * @see #setAppArea(ApplicationArea)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow_AppArea()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationArea getAppArea();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppWindow#getAppArea <em>App Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Area</em>' containment reference.
	 * @see #getAppArea()
	 * @generated
	 */
	void setAppArea(ApplicationArea value);

} // AppWindow
