/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activate Multi Panel Item Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getMultipanel <em>Multipanel</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActivateMultiPanelItemCommand()
 * @model
 * @generated
 */
public interface ActivateMultiPanelItemCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Multipanel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multipanel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multipanel</em>' reference.
	 * @see #setMultipanel(MultiPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActivateMultiPanelItemCommand_Multipanel()
	 * @model
	 * @generated
	 */
	MultiPanel getMultipanel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getMultipanel <em>Multipanel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multipanel</em>' reference.
	 * @see #getMultipanel()
	 * @generated
	 */
	void setMultipanel(MultiPanel value);

	/**
	 * Returns the value of the '<em><b>Active Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Item</em>' reference.
	 * @see #isSetActiveItem()
	 * @see #unsetActiveItem()
	 * @see #setActiveItem(Panel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActivateMultiPanelItemCommand_ActiveItem()
	 * @model unsettable="true"
	 * @generated
	 */
	Panel getActiveItem();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Item</em>' reference.
	 * @see #isSetActiveItem()
	 * @see #unsetActiveItem()
	 * @see #getActiveItem()
	 * @generated
	 */
	void setActiveItem(Panel value);

	/**
	 * Unsets the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActiveItem()
	 * @see #getActiveItem()
	 * @see #setActiveItem(Panel)
	 * @generated
	 */
	void unsetActiveItem();

	/**
	 * Returns whether the value of the '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active Item</em>' reference is set.
	 * @see #unsetActiveItem()
	 * @see #getActiveItem()
	 * @see #setActiveItem(Panel)
	 * @generated
	 */
	boolean isSetActiveItem();

} // ActivateMultiPanelItemCommand
