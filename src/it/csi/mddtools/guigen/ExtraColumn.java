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
 * A representation of the model object '<em><b>Extra Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo specifico di <b>Column<b> utilizzabile in un <b>TableCustomizationParam</b> 
 * per aggiungere colonne ad una <b>Table</b> presente in un <b>PanelDef</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ExtraColumn#getInsertAfter <em>Insert After</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getExtraColumn()
 * @model
 * @generated
 */
public interface ExtraColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Insert After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indica in che posizione deve essere aggiunta la nuova colonna:
	 * <ul>
	 * <li>se l'attributo non &egrave; impostato la colonna verr&agrave; aggiunta
	 *        in prima posizione</li>
	 * <li>se l'attributo &egrave; valorizzato la colonna verr&agrave; inserita dopo
	 * la colonna indicata</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert After</em>' reference.
	 * @see #setInsertAfter(Column)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExtraColumn_InsertAfter()
	 * @model
	 * @generated
	 */
	Column getInsertAfter();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ExtraColumn#getInsertAfter <em>Insert After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert After</em>' reference.
	 * @see #getInsertAfter()
	 * @generated
	 */
	void setInsertAfter(Column value);

} // ExtraColumn
