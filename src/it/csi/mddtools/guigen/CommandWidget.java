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
 * A representation of the model object '<em><b>Command Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe astratta di widget con funzione di comando (es pulsanti)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CommandWidget#getFunctionSpecifier <em>Function Specifier</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandWidget()
 * @model annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface CommandWidget extends Widget {

	/**
	 * Returns the value of the '<em><b>Function Specifier</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.CommandFunctions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Specifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Specifier</em>' attribute.
	 * @see it.csi.mddtools.guigen.CommandFunctions
	 * @see #setFunctionSpecifier(CommandFunctions)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandWidget_FunctionSpecifier()
	 * @model default="0"
	 * @generated
	 */
	CommandFunctions getFunctionSpecifier();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CommandWidget#getFunctionSpecifier <em>Function Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Specifier</em>' attribute.
	 * @see it.csi.mddtools.guigen.CommandFunctions
	 * @see #getFunctionSpecifier()
	 * @generated
	 */
	void setFunctionSpecifier(CommandFunctions value);
} // CommandWidget
