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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Buttons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Widget a selezione alternativa tra un insieme statico di valori.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.RadioButtons#getRadio <em>Radio</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.RadioButtons#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di selezione di una opzione tra un insieme finito (e definito a tempo di sviluppo) di possibilit&amp;agrave;.\r\nIl widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed il campo di immissione associato, che &amp;egrave; a sua volta costituito\r\nda un elenco di pulsanti la cui selezione &amp;egrave; mutualmente esclusiva.\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.\r\nIl &lt;b&gt;RadioButtons&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento, una &lt;i&gt;standard&lt;/i&gt; ed una\r\n&lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del RadioButtons prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (es. verifica di campo required)&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;li&gt;la visualizzazione di un marcatore di errore in prossimit&amp;agrave; della label, in caso di fallita\r\nvalidazione&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;\r\n' event-clicked='&lt;p&gt;E\'possibile, a fronte della selezione da parte dell\'utente di una delle opzioni visualizzate, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&amp;agrave; di esecuzione della logica \r\nassociata: &lt;i&gt;standard&lt;/i&gt; e &lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h5&gt;modalit&amp;agrave; standard&lt;/h5&gt;\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n&lt;h5&gt;modalit&amp;agrave; ricca&lt;/h5&gt;\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n&lt;ul&gt;\r\n&lt;li&gt;il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar&lt;/li&gt;\r\n&lt;li&gt;il refresh di una porzione specifica di schermata&lt;/li&gt;\r\n&lt;li&gt;il passaggio del flusso ad una schermata differente&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface RadioButtons extends DataWidget {
	/**
	 * Returns the value of the '<em><b>Radio</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.RadioButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme dei radiobutton che determina l'insieme dei valori possibili
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radio</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons_Radio()
	 * @model containment="true"
	 * @generated
	 */
	EList<RadioButton> getRadio();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orientamento dei singoli <b>Radiobutton</b>. Valori ammessi:
	 * <ul>
	 * <li>Vertical</li>
	 * <li>Horizontal</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(PanelLayout)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons_Layout()
	 * @model containment="true"
	 * @generated
	 */
	PanelLayout getLayout();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RadioButtons#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(PanelLayout value);

} // RadioButtons
