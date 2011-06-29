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
 * A representation of the model object '<em><b>Clear Appdata Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ClearAppdataCommand#getAppData <em>App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getClearAppdataCommand()
 * @model
 * @generated
 */
public interface ClearAppdataCommand extends Command {
	/**
	 * Returns the value of the '<em><b>App Data</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Data</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getClearAppdataCommand_AppData()
	 * @model
	 * @generated
	 */
	EList<ApplicationData> getAppData();

} // ClearAppdataCommand
