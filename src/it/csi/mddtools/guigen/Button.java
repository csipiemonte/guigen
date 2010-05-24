/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Superclasse di tutti i pulsanti.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Button#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getButton()
 * @model annotation="uiwidgetdoc description='E\' il classico pulsante di comando utilizzabile per comandare l\'esecuzione\r\ndelle varie funzioni applicative (ricerca, inserimento, verifica, conferma, ....)\r\nIl <b>Button</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)</li>\r\n<li>CommandPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario\r\nrealizzare una \"pulsantiera\" costituita da soli <b>Button</b></li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del Button prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la possibilit&agrave; di associare al pulsante uno <i>specificatore di funzione</i>,\r\nche pu&ograve; essere utilizzato per connotare la funzione che eseguir&agrave;\r\ntale pulsante, con l\'effetto, ad esempio di permettere l\'associazione di uno\r\nstile specifico o di un\'icona rappresentativa della funzone stessa.\r\nL\'elenco delle funzioni specificabili &egrave il seguente:\r\n\t<ul>\r\n\t<li>ADD_ITEM: aggiunta di un elemento ad un insieme di dati/tabella</li>\r\n\t<li>BACK: ritorno ad una schermata precedente</li>\r\n\t<li>CANCEL: risposta negativa ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>CONFIRM: risposta positiva ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>DELETE_ITEM: eliminazione di un elemento da un insieme di dati/tabella</li>\r\n\t<li>DETAIL: visualizzazione del dettaglio di una entit&agrave;</li>\r\n\t<li>EDIT_ITEM: inizio delle attivit&agrave; di modifica di un\'entit&agrave;</li>\r\n\t<li>FIRST_ITEM: posizionamento sul primo elemento di un elenco di dati</li>\r\n\t<li>FORWARD: prosecuzione al prossimo passo di una serie di passi guidati</li>\r\n\t<li>LAST_ITEM: posizionamento sull\'ultimo elemento di un elenco di dati</li>\r\n\t<li>LOAD: caricamento di un record</li>\r\n\t<li>NEXT_ITEM: posizionamento sul prossimo elemento di un elenco di dati</li>\r\n\t<li>PREVIOUS_ITEM: posizionamento sull\'elemento precedente a quello corrente\r\n\t\t all\'interno di un elenco di dati</li>\r\n\t<li>SAVE: salvataggio dei dati immessi</li>\r\n\t<li>SEARCH: effettuazione della ricerca</li>\r\n\t<li>SEND_MESSAGE: invio di un messaggio (es. email)</li>\r\n\t<li>SHOW_HELP: visualizzazione di una pagina di aiuto</li>\r\n\t<li>SHOW_REPORT: visualizzazione di un report</li>\r\n\t<li>UNSPECIFIED: funzione generica</li>\r\n\t</ul>\r\n</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>possibilit&agrave; di effettuare un refresh parziale della schermata \r\na fronte dell\'esecuzione del comando associato alla pressione del pulsante</li>\r\n</ul>' event-clicked='<p>Il pulsante pu&ograve ricevere un evento di pressione da parte \r\ndell\'utente e, a fronte di questo evento &egrave; possibile eseguire logica\r\ndi business. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAlla pressione del pulsante viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla pressione del pulsante viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>'"
 * @generated
 */
public interface Button extends CommandWidget {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PER FUTURE ESPANSIONI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getButton_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Button#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

} // Button
