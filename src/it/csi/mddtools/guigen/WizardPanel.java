/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
 *   <li>{@link it.csi.mddtools.guigen.WizardPanel#getNumberingSchema <em>Numbering Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWizardPanel()
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>WizardPanel</b> &egrave; un pannello utilizzato realizzare strutture organizzate\r\na <i>wizard</i>:\r\nPrevede due sezioni visibili:\r\n<ol>\r\n<li>la lista di &quot; etichette &quot; che servono per attivare i vari <i>step</i> \r\n(con evidenza visiva dello step correntemente selezionato)</li>\r\n<li>la sezione in cui viene visualizzato il contenuto dello <i>step</i> corrente.</li>\r\n</ol>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pannello disponibili.\r\nIl <b>WizardPanel</b> pu&ograve; funzionare in tre differenti modalit&agrave;:\r\n<ol>\r\n<li>wizard <b>passivo</b>: la navigazione tra gli step deve essere comandata dalla business\r\nlogic (es. tasti di &quot;avanti&quot; o &quot;indietro&quot; all\'interno dello step)</li>\r\n<li>wizard <b>attivo</b>: la navigazione tra gli step pu&ograve; essere comandata sia dalla\r\nbusiness logic (es. tasti di &quot;avanti&quot; o &quot;indietro&quot; all\'interno dello step) sia\r\ntramite click sulle etichette dei vari step.</li>\r\n</ol>\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
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

	/**
	 * Returns the value of the '<em><b>Numbering Schema</b></em>' attribute.
	 * The default value is <code>"NO_NUMBERING"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.WizardNumberingTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbering Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbering Schema</em>' attribute.
	 * @see it.csi.mddtools.guigen.WizardNumberingTypes
	 * @see #setNumberingSchema(WizardNumberingTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWizardPanel_NumberingSchema()
	 * @model default="NO_NUMBERING"
	 * @generated
	 */
	WizardNumberingTypes getNumberingSchema();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WizardPanel#getNumberingSchema <em>Numbering Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbering Schema</em>' attribute.
	 * @see it.csi.mddtools.guigen.WizardNumberingTypes
	 * @see #getNumberingSchema()
	 * @generated
	 */
	void setNumberingSchema(WizardNumberingTypes value);
} // WizardPanel
