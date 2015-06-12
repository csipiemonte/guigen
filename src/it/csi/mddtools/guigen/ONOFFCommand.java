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
 * A representation of the model object '<em><b>ONOFF Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di abilitare/disabilitare i widget e/o menu specificati. Lo stato di abilitazione
 * rimane persistente in sessione.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ONOFFCommand#isEnable <em>Enable</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getONOFFCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface ONOFFCommand extends Command, CommandOnWidgets {
	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true il comando ha effetto di abilitare i widget; 
	 * se impostato a false ha l'effetto di disabilitazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #setEnable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getONOFFCommand_Enable()
	 * @model
	 * @generated
	 */
	boolean isEnable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ONOFFCommand#isEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #isEnable()
	 * @generated
	 */
	void setEnable(boolean value);

} // ONOFFCommand
