/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * elenco delgi stati disponibili per un determinato <b>ContentPanel</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ScreenStates#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenStates()
 * @model annotation="logicpkg pkg='ui.state'"
 * @generated
 */
public interface ScreenStates extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ScreenState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getScreenStates_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScreenState> getStates();

} // ScreenStates
