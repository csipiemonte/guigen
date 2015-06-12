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
 * A representation of the model object '<em><b>GUI Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Struttura della user interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GUIStructure#getAppWindow <em>App Window</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIStructure()
 * @model
 * @generated
 */
public interface GUIStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>App Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * porzione di schermata dipendente dall'applicazione
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Window</em>' containment reference.
	 * @see #setAppWindow(AppWindow)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIStructure_AppWindow()
	 * @model containment="true"
	 * @generated
	 */
	AppWindow getAppWindow();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIStructure#getAppWindow <em>App Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Window</em>' containment reference.
	 * @see #getAppWindow()
	 * @generated
	 */
	void setAppWindow(AppWindow value);

} // GUIStructure
