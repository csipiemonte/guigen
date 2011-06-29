/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
