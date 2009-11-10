/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel Def Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PanelDefUse#getPanelDef <em>Panel Def</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDefUse#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefUse()
 * @model
 * @generated
 */
public interface PanelDefUse extends Panel {
	/**
	 * Returns the value of the '<em><b>Panel Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Def</em>' reference.
	 * @see #setPanelDef(PanelDef)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefUse_PanelDef()
	 * @model
	 * @generated
	 */
	PanelDef getPanelDef();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDefUse#getPanelDef <em>Panel Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Def</em>' reference.
	 * @see #getPanelDef()
	 * @generated
	 */
	void setPanelDef(PanelDef value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(PDefUseConfig)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDefUse_Config()
	 * @model containment="true"
	 * @generated
	 */
	PDefUseConfig getConfig();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDefUse#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(PDefUseConfig value);

} // PanelDefUse