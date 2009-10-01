/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.WizardPanel#isNavigatorActive <em>Navigator Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWizardPanel()
 * @model
 * @generated
 */
public interface WizardPanel extends MultiPanel {

	/**
	 * Returns the value of the '<em><b>Navigator Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigator Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigator Active</em>' attribute.
	 * @see #setNavigatorActive(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWizardPanel_NavigatorActive()
	 * @model default="true"
	 * @generated
	 */
	boolean isNavigatorActive();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WizardPanel#isNavigatorActive <em>Navigator Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigator Active</em>' attribute.
	 * @see #isNavigatorActive()
	 * @generated
	 */
	void setNavigatorActive(boolean value);
} // WizardPanel
