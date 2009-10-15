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
 * A representation of the model object '<em><b>Tab Set Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TabSetPanel#getSwitcher <em>Switcher</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTabSetPanel()
 * @model
 * @generated
 */
public interface TabSetPanel extends MultiPanel {

	/**
	 * Returns the value of the '<em><b>Switcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switcher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switcher</em>' containment reference.
	 * @see #setSwitcher(TabSwitcher)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTabSetPanel_Switcher()
	 * @model containment="true"
	 * @generated
	 */
	TabSwitcher getSwitcher();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TabSetPanel#getSwitcher <em>Switcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switcher</em>' containment reference.
	 * @see #getSwitcher()
	 * @generated
	 */
	void setSwitcher(TabSwitcher value);

} // TabSetPanel
