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
 * A representation of the model object '<em><b>Panel Def State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stato di visibili&agrave; / abilitazione dei widget contenuti in un 
 * <b>PanelDef</b>. Per passare da uno stato all'altro &egrave; 
 * necessario utilizzare il comando <b>PDefStateCommand</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PanelDefState#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDefState#getWidgetsOn <em>Widgets On</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDefState#getWidgetsVisible <em>Widgets Visible</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefState()
 * @model
 * @generated
 */
public interface PanelDefState extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice identificativo dello stato. Deve essere univoco nel <b>PanelDef</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDefState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Widgets On</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * elenco dei widget che devono essere resi editabili se il <b>PanelDef</b>
	 * &egrave; in questo stato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets On</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefState_WidgetsOn()
	 * @model
	 * @generated
	 */
	EList<Widget> getWidgetsOn();

	/**
	 * Returns the value of the '<em><b>Widgets Visible</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * elenco dei widget che devono essere resi visibili se il <b>PanelDef</b>
	 * &egrave; in questo stato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets Visible</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefState_WidgetsVisible()
	 * @model
	 * @generated
	 */
	EList<Widget> getWidgetsVisible();

} // PanelDefState
