/**
 * <copyright>
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
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getKeySelector <em>Key Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getValueSelector <em>Value Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#isOmitHeaderValue <em>Omit Header Value</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getFieldLength <em>Field Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox()
 * @model annotation="uiwidgetdoc description='E\' il widget di selezione di uno (o pi&ugrave;) dati a partire da una lista di dati precaricata.\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>ComboBox</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TextField prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di specificare per ogni elemento della lista,\r\nun valore visualizzato e la corrispondente chiave, utilizzata come valore\r\neffettivamente seleizonato e utilizzabile dalla logica applicativa</li>\r\n<li>la scelta tra selezione singola o multipla</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>funzione di <i>autocomplete</i> (restrizione dell\'elenco di opzioni a fronte dell\'immissione \r\nprogressiva dei caratteri iniziali della selezione stessa)</li>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\n<!-- Inoltre &egrave; possibile, se esplicitamente modellato, associare alla <b>ComboBox</b> la\r\nfunzionalit&agrave; di <i>suggestion</i> che consiste nel fornire, man mano che si digitano i \r\ncaratteri nel campo di testo, una lista di voci che corrispondono nella loro parte iniziale alla stringa\r\ndi caratteri immessa fino a quel momento (la logica di costruzione progressiva della lista di \r\nsuggerimenti &egrave; a carico dello sviluppatore). -->' event-value-changed='<p>E\'possibile, a fronte della selezione da parte dell\'utente di una delle\r\nopzioni presenti nella lista, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>'"
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
} // ComboBox
