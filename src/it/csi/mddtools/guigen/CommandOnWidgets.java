/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
 * Classe astratta da cui discendono i comandi che agiscono su un elenco di widget
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CommandOnWidgets#getTargetWidgets <em>Target Widgets</em>}</li>
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

} // CommandOnWidgets
