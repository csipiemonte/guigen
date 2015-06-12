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
 * A representation of the model object '<em><b>Show Dialog Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Attiva un <b>DialogPanel</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ShowDialogCommand#getDialog <em>Dialog</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getShowDialogCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface ShowDialogCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Dialog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il dialog da attivare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dialog</em>' reference.
	 * @see #setDialog(DialogPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getShowDialogCommand_Dialog()
	 * @model
	 * @generated
	 */
	DialogPanel getDialog();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ShowDialogCommand#getDialog <em>Dialog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog</em>' reference.
	 * @see #getDialog()
	 * @generated
	 */
	void setDialog(DialogPanel value);

} // ShowDialogCommand
