/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DataWidget per l'immissione di testo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TextField#getFieldLength <em>Field Length</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TextField#getFieldMaxLength <em>Field Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTextField()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di immissione di dati testuali a riga singola.\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>TextField</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TextField prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di specificare il numero massimo di caratteri\r\naccettabili</li>\r\n<li>la possibilit&agrave; di specificare la dimensione massima dell\'area editabile\r\n(che &egrave; utilizzata in modi differenti a seconda della cartuccia/skin)</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (es. solo caratteri numerici per tipi numerici)</li>\r\n<li>verifiche client side al momento della digitazione di rispetto della dimensione massima del dato</li>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\nInoltre &egrave; possibile, se esplicitamente modellato, associare al <b>TextField</b> la\r\nfunzionalit&agrave; di <i>suggestion</i> che consiste nel fornire, man mano che si digitano i \r\ncaratteri nel campo di testo, una lista di voci che corrispondono nella loro parte iniziale alla stringa\r\ndi caratteri immessa fino a quel momento (la logica di costruzione progressiva della lista di \r\nsuggerimenti &egrave; a carico dello sviluppatore).' event-key-pressed='<p>L\'evento <b>KeyPressed</b>, utilizzabile solo in modalit&agrave; ricca, \r\npermette di ottenere la funzione di <i>suggestion</i>\r\n</p>'"
 * @generated
 */
public interface TextField extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Field Length</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione in caratteri dell area visibile del campo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Length</em>' attribute.
	 * @see #setFieldLength(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextField_FieldLength()
	 * @model default="15"
	 * @generated
	 */
	int getFieldLength();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextField#getFieldLength <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Length</em>' attribute.
	 * @see #getFieldLength()
	 * @generated
	 */
	void setFieldLength(int value);

	/**
	 * Returns the value of the '<em><b>Field Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero massimo di caratteri digitabili
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Max Length</em>' attribute.
	 * @see #setFieldMaxLength(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextField_FieldMaxLength()
	 * @model
	 * @generated
	 */
	int getFieldMaxLength();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextField#getFieldMaxLength <em>Field Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Max Length</em>' attribute.
	 * @see #getFieldMaxLength()
	 * @generated
	 */
	void setFieldMaxLength(int value);

} // TextField
