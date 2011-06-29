/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di mostrare/nascondere i widget specificati. Lo stato di visibilit&agrave;
 * rimane persistente in sessione.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.VisibilityCommand#isShow <em>Show</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getVisibilityCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface VisibilityCommand extends Command, CommandOnWidgets {
	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true il comando ha effetto di rendere visibile i widget; 
	 * se impostato a false ha l'effetto di renderli invisibili.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see #setShow(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getVisibilityCommand_Show()
	 * @model
	 * @generated
	 */
	boolean isShow();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.VisibilityCommand#isShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see #isShow()
	 * @generated
	 */
	void setShow(boolean value);

} // VisibilityCommand
