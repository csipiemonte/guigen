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
 * A representation of the model object '<em><b>Command On Panels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe astratta da cui discendono i comandi che agiscono su un elenco di pannelli
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CommandOnPanels#getTargetPanels <em>Target Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOnPanels()
 * @model abstract="true"
 *        annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface CommandOnPanels extends Command {
	/**
	 * Returns the value of the '<em><b>Target Panels</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Panels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ii pannelli su cui agisce il comando.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Panels</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandOnPanels_TargetPanels()
	 * @model
	 * @generated
	 */
	EList<Panel> getTargetPanels();

} // CommandOnPanels
