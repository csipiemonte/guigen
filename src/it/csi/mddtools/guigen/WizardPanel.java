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
 * Particolare tipo di <b>MultiPanel</b> che prevede una sezione di
 * navigazione in alto che rappresenta la sequenza degli step del wizard.
 * Il naviogatore pu&ograve; essere attivo o passivo. Nel caso in cui il navigatore
 * sia passivo per passare d auno step all'altro &egrave; necessario utilizzare
 * il comando <b>ActivateMultiPanelItem</b> agganciato ad un evento collegato ad 
 * un pulsante interno al pannello che descrive ciascuno step.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.WizardPanel#isNavigatorActive <em>Navigator Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WizardPanel#getSwitcher <em>Switcher</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Se impostato a true la sezione di navigazione sar&agrave; cliccabile, 
	 * permettendo cos&igrave; il salto libero da uno step all'altro.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Switcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switcher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Widget fittizio che permette di associare un event handler all'evento di
	 * CLICK sullo step (utilizzabile solo in modalit&agrave; attiva).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Switcher</em>' containment reference.
	 * @see #setSwitcher(TabSwitcher)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWizardPanel_Switcher()
	 * @model containment="true"
	 * @generated
	 */
	TabSwitcher getSwitcher();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WizardPanel#getSwitcher <em>Switcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switcher</em>' containment reference.
	 * @see #getSwitcher()
	 * @generated
	 */
	void setSwitcher(TabSwitcher value);
} // WizardPanel
