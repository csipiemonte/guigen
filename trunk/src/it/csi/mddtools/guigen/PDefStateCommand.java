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
 * A representation of the model object '<em><b>PDef State Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di far passare un <b>PanelDef</b> nello stato specificato. 
 * Pu&ograve; essere utilizzato in due modi:
 * <ol>
 * <li>all'interno del <b>PanelDef</b>, in una catena di comandi referenziata
 *        da un <b>EventHandler</b>: in questo caso l'effetto del comando
 *        &egrave; applicato ai widget dell'istanza di <b>PanelDef</b> sulla quale
 *        &egrave; indirizzato l'evento</li>.
 * <li>all'interno di un <b>ContentPanel</b> che referenzia un <b>PanelDef</b>
 * tramite <b>PanelDefUse</b>: in questo caso il comando &egrave; inserito
 * all'interno di una catena di comandi referenziata da un <b>EventHandler</b>
 * associato ad un <b>Widget</b> definito nel <b>ContentPanel</b>. Ovviamente
 * &egrave; necessario indicare, in questo caso, il <b>PanelDefUse</b> al quale
 * deve essere inviato il comando (che nel caso precedente &egrave; implicito)
 * </li>
 * </ol>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PDefStateCommand#getGoTo <em>Go To</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PDefStateCommand#getPDefUse <em>PDef Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefStateCommand()
 * @model
 * @generated
 */
public interface PDefStateCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Go To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lo stato in cui si desidera far passare il <b>PanelDef</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Go To</em>' reference.
	 * @see #setGoTo(PanelDefState)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefStateCommand_GoTo()
	 * @model
	 * @generated
	 */
	PanelDefState getGoTo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PDefStateCommand#getGoTo <em>Go To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go To</em>' reference.
	 * @see #getGoTo()
	 * @generated
	 */
	void setGoTo(PanelDefState value);

	/**
	 * Returns the value of the '<em><b>PDef Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il <b>PanelDefUse</b> a cui deve essere indirizzato il comando. Deve essere utilizzato solo
	 * nel caso di utilizzo del comando esterno al <b>PanelDef</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PDef Use</em>' reference.
	 * @see #setPDefUse(PanelDefUse)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPDefStateCommand_PDefUse()
	 * @model
	 * @generated
	 */
	PanelDefUse getPDefUse();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PDefStateCommand#getPDefUse <em>PDef Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDef Use</em>' reference.
	 * @see #getPDefUse()
	 * @generated
	 */
	void setPDefUse(PanelDefUse value);

} // PDefStateCommand
