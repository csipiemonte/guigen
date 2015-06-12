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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Customization PDef Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Valorizzazione di parametro di <b>PanelDef</b> che permette di personalizzare
 * una <b>Table</b> per la quale &egrave; stata prevista la personalizzabilit&agrave;
 * (tramite un <b>TableCustomizationPDefVal</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TableCustomizationPDefVal#getExtraCols <em>Extra Cols</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TableCustomizationPDefVal#getHiddenCols <em>Hidden Cols</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationPDefVal()
 * @model
 * @generated
 */
public interface TableCustomizationPDefVal extends PDefParamVal {
	/**
	 * Returns the value of the '<em><b>Extra Cols</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ExtraColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'elenco delle colonne da aggiungere alle colonne preesistenti nella tabella
	 * base. Le colonne saranno aggiunte secondo quanto specificato nell'
	 * attributo <i>insertAfter</i> dell'oggetto <b>ExtraColumn</b> corrispondente.
	 * Se due <b>ExtraColumn</b> presentano lo stesso valore di tale attributo, esse
	 * saranno inserite nell'ordine in cui sono presenti in questo elenco.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Cols</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationPDefVal_ExtraCols()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtraColumn> getExtraCols();

	/**
	 * Returns the value of the '<em><b>Hidden Cols</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco delle colonne della <b>Table</b> base che devono essere nascoste.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hidden Cols</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationPDefVal_HiddenCols()
	 * @model
	 * @generated
	 */
	EList<Column> getHiddenCols();

} // TableCustomizationPDefVal
