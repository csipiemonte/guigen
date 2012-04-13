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
 * A representation of the model object '<em><b>Command On Widgets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe astratta da cui discendono i comandi che agiscono su un elenco di widget,
 * o di elementi di menu
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CommandOnWidgets#getTargetWidgets <em>Target Widgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CommandOnWidgets#getTargetMenuElement <em>Target Menu Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOnWidgets()
 * @model abstract="true"
 *        annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface CommandOnWidgets extends Command {
	/**
	 * Returns the value of the '<em><b>Target Widgets</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Widgets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I widget su cui opera il comando.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Widgets</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOnWidgets_TargetWidgets()
	 * @model required="true"
	 * @generated
	 */
	EList<Widget> getTargetWidgets();

	/**
	 * Returns the value of the '<em><b>Target Menu Element</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Menu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli elementi del menu su cui opera il comando.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Menu Element</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOnWidgets_TargetMenuElement()
	 * @model
	 * @generated
	 */
	EList<Menu> getTargetMenuElement();

} // CommandOnWidgets
