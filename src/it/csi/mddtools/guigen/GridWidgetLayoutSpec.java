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
 * A representation of the model object '<em><b>Grid Widget Layout Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifica di posizionamento di widget in un layout a griglia
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getRow <em>Row</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getColumn <em>Column</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getHspan <em>Hspan</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getVspan <em>Vspan</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGridWidgetLayoutSpec()
 * @model annotation="logicpkg pkg='ui.layout'"
 * @generated
 */
public interface GridWidgetLayoutSpec extends WidgetLayoutSpecifier {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Riga in cui deve essere posizionato il Widget (prima riga = 1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGridWidgetLayoutSpec_Row()
	 * @model
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Colonna in cui deve essere posizionato il Widget (prima colonna = 1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGridWidgetLayoutSpec_Column()
	 * @model
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Returns the value of the '<em><b>Hspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero di colonne di occupazione del widget. 
	 * Se non specificato si assume l'occupazione di una colonna.
	 * Il widget occuper&agrave; le colonne da <b>column</b> a <b>column+hspan</b> comprese.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hspan</em>' attribute.
	 * @see #setHspan(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGridWidgetLayoutSpec_Hspan()
	 * @model
	 * @generated
	 */
	int getHspan();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getHspan <em>Hspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hspan</em>' attribute.
	 * @see #getHspan()
	 * @generated
	 */
	void setHspan(int value);

	/**
	 * Returns the value of the '<em><b>Vspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero di righe di occupazione del widget. 
	 * Se non specificato si assume l'occupazione di una riga.
	 * Il widget occuper&agrave; le righe da <b>row</b> a <b>row+vspan</b> comprese.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vspan</em>' attribute.
	 * @see #setVspan(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGridWidgetLayoutSpec_Vspan()
	 * @model
	 * @generated
	 */
	int getVspan();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getVspan <em>Vspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vspan</em>' attribute.
	 * @see #getVspan()
	 * @generated
	 */
	void setVspan(int value);

} // GridWidgetLayoutSpec
