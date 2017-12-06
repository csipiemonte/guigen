/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
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
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.WizardPanel#isNavigatorActive <em>Navigator Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WizardPanel#getSwitcher <em>Switcher</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WizardPanel#getNumberingSchema <em>Numbering Schema</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWizardPanel()
 * @model annotation="uipaneldoc description='&lt;p&gt;\r\nIl &lt;b&gt;WizardPanel&lt;/b&gt; &amp;egrave; un pannello utilizzato realizzare strutture organizzate\r\na &lt;i&gt;wizard&lt;/i&gt;:\r\nPrevede due sezioni visibili:\r\n&lt;ol&gt;\r\n&lt;li&gt;la lista di &amp;quot; etichette &amp;quot; che servono per attivare i vari &lt;i&gt;step&lt;/i&gt; \r\n(con evidenza visiva dello step correntemente selezionato)&lt;/li&gt;\r\n&lt;li&gt;la sezione in cui viene visualizzato il contenuto dello &lt;i&gt;step&lt;/i&gt; corrente.&lt;/li&gt;\r\n&lt;/ol&gt;\r\nAll\'interno del singolo tab &amp;egrave; possibile inserire tutte le tipologie di pannello disponibili.\r\nIl &lt;b&gt;WizardPanel&lt;/b&gt; pu&amp;ograve; funzionare in tre differenti modalit&amp;agrave;:\r\n&lt;ol&gt;\r\n&lt;li&gt;wizard &lt;b&gt;passivo&lt;/b&gt;: la navigazione tra gli step deve essere comandata dalla business\r\nlogic (es. tasti di &amp;quot;avanti&amp;quot; o &amp;quot;indietro&amp;quot; all\'interno dello step)&lt;/li&gt;\r\n&lt;li&gt;wizard &lt;b&gt;attivo&lt;/b&gt;: la navigazione tra gli step pu&amp;ograve; essere comandata sia dalla\r\nbusiness logic (es. tasti di &amp;quot;avanti&amp;quot; o &amp;quot;indietro&amp;quot; all\'interno dello step) sia\r\ntramite click sulle etichette dei vari step.&lt;/li&gt;\r\n&lt;/ol&gt;\r\n&lt;/p&gt;'"
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
