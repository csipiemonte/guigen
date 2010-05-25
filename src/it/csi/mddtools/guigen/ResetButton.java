/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pulsante con funzione di reset della form.
 * Non è possibile associare alcun event handler a questo pulsante.
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getResetButton()
 * @model annotation="uiwidgetdoc description='E\' il classico pulsante di reset utilizzabile per ripulire la forma utente, riportandola allo stato \r\niniziale.\r\nIl <b>ResetButton</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)</li>\r\n<li>CommandPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario\r\nrealizzare una \"pulsantiera\" costituita da soli <b>Button</b></li>\r\n</ul>\r\nPrevede una sola modalit&agrave; di funzionamento: <i>standard</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del ResetButton prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la possibilit&agrave; di associare al pulsante uno <i>specificatore di funzione</i>,\r\nche pu&ograve; essere utilizzato per connotare la funzione che eseguir&agrave;\r\ntale pulsante, con l\'effetto, ad esempio di permettere l\'associazione di uno\r\nstile specifico o di un\'icona rappresentativa della funzone stessa.\r\nL\'elenco delle funzioni specificabili &egrave il seguente:\r\n\t<ul>\r\n\t<li>ADD_ITEM: aggiunta di un elemento ad un insieme di dati/tabella</li>\r\n\t<li>BACK: ritorno ad una schermata precedente</li>\r\n\t<li>CANCEL: risposta negativa ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>CONFIRM: risposta positiva ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>DELETE_ITEM: eliminazione di un elemento da un insieme di dati/tabella</li>\r\n\t<li>DETAIL: visualizzazione del dettaglio di una entit&agrave;</li>\r\n\t<li>EDIT_ITEM: inizio delle attivit&agrave; di modifica di un\'entit&agrave;</li>\r\n\t<li>FIRST_ITEM: posizionamento sul primo elemento di un elenco di dati</li>\r\n\t<li>FORWARD: prosecuzione al prossimo passo di una serie di passi guidati</li>\r\n\t<li>LAST_ITEM: posizionamento sull\'ultimo elemento di un elenco di dati</li>\r\n\t<li>LOAD: caricamento di un record</li>\r\n\t<li>NEXT_ITEM: posizionamento sul prossimo elemento di un elenco di dati</li>\r\n\t<li>PREVIOUS_ITEM: posizionamento sull\'elemento precedente a quello corrente\r\n\t\t all\'interno di un elenco di dati</li>\r\n\t<li>SAVE: salvataggio dei dati immessi</li>\r\n\t<li>SEARCH: effettuazione della ricerca</li>\r\n\t<li>SEND_MESSAGE: invio di un messaggio (es. email)</li>\r\n\t<li>SHOW_HELP: visualizzazione di una pagina di aiuto</li>\r\n\t<li>SHOW_REPORT: visualizzazione di un report</li>\r\n\t<li>UNSPECIFIED: funzione generica</li>\r\n\t</ul>\r\n</li>\r\n</ul>\r\n' event-clicked='<p>Il pulsante pu&ograve; ricevere un evento di pressione da parte \r\ndell\'utente che scatena il reset della schermata.\r\nQuesto evento &egrave; implicito (non occorre definire un <b>EventHandler</b>\r\nper attivarlo). A fronte di questo evento <b>non</b> &egrave; perci&ograve; \r\npossibile eseguire logica di business. \r\n</p>'"
 * @generated
 */
public interface ResetButton extends Button {
} // ResetButton
