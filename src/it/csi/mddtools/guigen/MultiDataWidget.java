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
 * A representation of the model object '<em><b>Multi Data Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe astratta dalla quale discendono tutte le classi che rappresentano
 * widget associabili a collezioni. Un <b>MultiDataWidget</b>
 * ha un concetto di <i>collezione</i> del widget che rappresenta l'insieme 
 * finito di possibili valori selezionabili.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MultiDataWidget#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiDataWidget()
 * @model annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface MultiDataWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Data Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il binding all'<b>ApplicationData</b> nel quale sono contenuti gli elementi dell'insieme
	 * di possibili valori. Il tipo dell'oggetto puntato deve essere un <b>TypedArray</b> e 
	 * il <i>componentType</i> di questo <b>TypedArray</b> deve essere un <b>ComplexType</b>, poich&egrave;
	 *  &egrave; necessario poter specificare il valore selezionato e la label descrittiva di tale valore (perci&ograve; servono almeno due field).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Data Binding</em>' containment reference.
	 * @see #setMultiDataBinding(AppDataBinding)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiDataWidget_MultiDataBinding()
	 * @model containment="true"
	 * @generated
	 */
	AppDataBinding getMultiDataBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MultiDataWidget#getMultiDataBinding <em>Multi Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Data Binding</em>' containment reference.
	 * @see #getMultiDataBinding()
	 * @generated
	 */
	void setMultiDataBinding(AppDataBinding value);

} // MultiDataWidget
