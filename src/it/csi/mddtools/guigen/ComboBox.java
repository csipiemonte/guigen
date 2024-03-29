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
 * A representation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MultiDataWidget che permette la selezione di uno o più valori all'interno di 
 * un elenco di possibili opzioni.
 * Se il value-binding &egrave; impostato su un <b>ApplicationData</b> di tipo
 * Simple la combo sar&agrave; a selezione singola; se il value-binding &egrave; impostato su un <b>ApplicationData</b> di tipo
 * TypedArray (con component type Simple) la combo sar&agrave; a selezione multipla.
 * Alla combo &egrave; possibile associare un event handler relativo all'evento
 * VALUE_CHANGED, che viene scatenato nel momento un cui viene modificata la selezione.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getKeySelector <em>Key Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getValueSelector <em>Value Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#isOmitHeaderValue <em>Omit Header Value</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getFieldLength <em>Field Length</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getVisibleLines <em>Visible Lines</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox()
 * @model annotation="uiwidgetdoc description='E\' il widget di selezione di uno (o pi&amp;ugrave;) dati a partire da una lista di dati precaricata.\r\nIl widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed il campo di immissione associato.\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.\r\nIl &lt;b&gt;ComboBox&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento, una &lt;i&gt;standard&lt;/i&gt; ed una\r\n&lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del TextField prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di specificare per ogni elemento della lista,\r\nun valore visualizzato e la corrispondente chiave, utilizzata come valore\r\neffettivamente seleizonato e utilizzabile dalla logica applicativa&lt;/li&gt;\r\n&lt;li&gt;la scelta tra selezione singola o multipla&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;li&gt;la visualizzazione di un marcatore di errore in prossimit&amp;agrave; della label, in caso di fallita\r\nvalidazione&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;funzione di &lt;i&gt;autocomplete&lt;/i&gt; (restrizione dell\'elenco di opzioni a fronte dell\'immissione \r\nprogressiva dei caratteri iniziali della selezione stessa)&lt;/li&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;!-- Inoltre &amp;egrave; possibile, se esplicitamente modellato, associare alla &lt;b&gt;ComboBox&lt;/b&gt; la\r\nfunzionalit&amp;agrave; di &lt;i&gt;suggestion&lt;/i&gt; che consiste nel fornire, man mano che si digitano i \r\ncaratteri nel campo di testo, una lista di voci che corrispondono nella loro parte iniziale alla stringa\r\ndi caratteri immessa fino a quel momento (la logica di costruzione progressiva della lista di \r\nsuggerimenti &amp;egrave; a carico dello sviluppatore). --&gt;' event-value-changed='&lt;p&gt;E\'possibile, a fronte della selezione da parte dell\'utente di una delle\r\nopzioni presenti nella lista, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&amp;agrave; di esecuzione della logica \r\nassociata: &lt;i&gt;standard&lt;/i&gt; e &lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h5&gt;modalit&amp;agrave; standard&lt;/h5&gt;\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n&lt;h5&gt;modalit&amp;agrave; ricca&lt;/h5&gt;\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n&lt;ul&gt;\r\n&lt;li&gt;il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar&lt;/li&gt;\r\n&lt;li&gt;il refresh di una porzione specifica di schermata&lt;/li&gt;\r\n&lt;li&gt;il passaggio del flusso ad una schermata differente&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface ComboBox extends DataWidget, MultiDataWidget {

	/**
	 * Returns the value of the '<em><b>Key Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome del campo che deve essere considerato come "key". Il campo deve
	 * corrispondere ad un field del complex type di cui è costituito l'array
	 * collegato alla combo (tramite multi-data-binding).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Selector</em>' attribute.
	 * @see #setKeySelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_KeySelector()
	 * @model
	 * @generated
	 */
	String getKeySelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#getKeySelector <em>Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Selector</em>' attribute.
	 * @see #getKeySelector()
	 * @generated
	 */
	void setKeySelector(String value);

	/**
	 * Returns the value of the '<em><b>Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome del campo che deve essere utilizzato come descrizione visualizzata. Il campo deve
	 * corrispondere ad un field del complex type di cui è costituito l'array
	 * collegato alla combo (tramite multi-data-binding).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Selector</em>' attribute.
	 * @see #setValueSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_ValueSelector()
	 * @model
	 * @generated
	 */
	String getValueSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#getValueSelector <em>Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Selector</em>' attribute.
	 * @see #getValueSelector()
	 * @generated
	 */
	void setValueSelector(String value);

	/**
	 * Returns the value of the '<em><b>Omit Header Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Header Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true non viene inserita la entry relativa allo stato di selezione nulla.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Omit Header Value</em>' attribute.
	 * @see #setOmitHeaderValue(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_OmitHeaderValue()
	 * @model default="false"
	 * @generated
	 */
	boolean isOmitHeaderValue();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#isOmitHeaderValue <em>Omit Header Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Header Value</em>' attribute.
	 * @see #isOmitHeaderValue()
	 * @generated
	 */
	void setOmitHeaderValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Field Length</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione in caratteri dell area visibile del campo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Length</em>' attribute.
	 * @see #setFieldLength(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_FieldLength()
	 * @model default="15"
	 * @generated
	 */
	int getFieldLength();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#getFieldLength <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Length</em>' attribute.
	 * @see #getFieldLength()
	 * @generated
	 */
	void setFieldLength(int value);

	/**
	 * Returns the value of the '<em><b>Visible Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numero di linee visibili senza bisogno di utilizzare la scrollbar in caso di 
	 * <b>ComboBox</b> a selezione <i>multipla</i>. Se impostato a zero il numero di 
	 * linee visualizzabili non &egrave; predicibile. Nel caso di selezione singola invece
	 * l'attributo non ha effetto.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible Lines</em>' attribute.
	 * @see #setVisibleLines(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_VisibleLines()
	 * @model
	 * @generated
	 */
	int getVisibleLines();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#getVisibleLines <em>Visible Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Lines</em>' attribute.
	 * @see #getVisibleLines()
	 * @generated
	 */
	void setVisibleLines(int value);
} // ComboBox
