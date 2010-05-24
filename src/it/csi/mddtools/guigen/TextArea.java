/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Campo di immissione testo multilinea.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TextArea#getRows <em>Rows</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TextArea#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTextArea()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di immissione di dati testuali a riga multipla.\r\nIl widget completo prevede una <i>label</i> ed l\'area di immissione associata.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nLa <b>TextArea</b> pu&ograve; essere utilizzata all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento: standard e ricca.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base della TextArea prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di specificare la dimensione in righe/colonne\r\ndell\'area editabile</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<!-- <li>verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (es. solo caratteri numerici per tipi numerici)</li>\r\n<li>verifiche client side al momento della digitazione di rispetto della dimensione massima del dato</li> -->\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>'"
 * @generated
 */
public interface TextArea extends DataWidget {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione in righe dell'area di input. Se nell'input si supera il numero
	 * di righe specificate appare una scrollbar verticale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextArea_Rows()
	 * @model default="10"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextArea#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione in colonne dell'area di input. Se nell'input si supera il numero
	 * di colonne specificate appare una scrollbar orizzontale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTextArea_Columns()
	 * @model default="30"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TextArea#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

} // TextArea
