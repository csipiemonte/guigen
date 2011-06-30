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
 * A representation of the model object '<em><b>Screen State Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di far passare un <b>ContnetPanel</b> nello stato specificato
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ScreenStateCommand#getGoTo <em>Go To</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenStateCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface ScreenStateCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Go To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lo stato in cui si desidera far passare il <b>ContentPanel</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Go To</em>' reference.
	 * @see #setGoTo(ScreenState)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenStateCommand_GoTo()
	 * @model
	 * @generated
	 */
	ScreenState getGoTo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ScreenStateCommand#getGoTo <em>Go To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go To</em>' reference.
	 * @see #getGoTo()
	 * @generated
	 */
	void setGoTo(ScreenState value);

} // ScreenStateCommand
