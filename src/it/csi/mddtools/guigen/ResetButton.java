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
 * @model annotation="uiwidgetdoc description='E\' il classico pulsante di reset utilizzabile per ripulire la forma utente, riportandola allo stato \r\niniziale.\r\nIl &lt;b&gt;ResetButton&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)&lt;/li&gt;\r\n&lt;li&gt;CommandPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario\r\nrealizzare una \"pulsantiera\" costituita da soli &lt;b&gt;Button&lt;/b&gt;&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede una sola modalit&amp;agrave; di funzionamento: &lt;i&gt;standard&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del ResetButton prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di associare al pulsante uno &lt;i&gt;specificatore di funzione&lt;/i&gt;,\r\nche pu&amp;ograve; essere utilizzato per connotare la funzione che eseguir&amp;agrave;\r\ntale pulsante, con l\'effetto, ad esempio di permettere l\'associazione di uno\r\nstile specifico o di un\'icona rappresentativa della funzone stessa.\r\nL\'elenco delle funzioni specificabili &amp;egrave il seguente:\r\n\t&lt;ul&gt;\r\n\t&lt;li&gt;ADD_ITEM: aggiunta di un elemento ad un insieme di dati/tabella&lt;/li&gt;\r\n\t&lt;li&gt;BACK: ritorno ad una schermata precedente&lt;/li&gt;\r\n\t&lt;li&gt;CANCEL: risposta negativa ad una richiesta di conferma di esecuzione di comando&lt;/li&gt;\r\n\t&lt;li&gt;CONFIRM: risposta positiva ad una richiesta di conferma di esecuzione di comando&lt;/li&gt;\r\n\t&lt;li&gt;DELETE_ITEM: eliminazione di un elemento da un insieme di dati/tabella&lt;/li&gt;\r\n\t&lt;li&gt;DETAIL: visualizzazione del dettaglio di una entit&amp;agrave;&lt;/li&gt;\r\n\t&lt;li&gt;EDIT_ITEM: inizio delle attivit&amp;agrave; di modifica di un\'entit&amp;agrave;&lt;/li&gt;\r\n\t&lt;li&gt;FIRST_ITEM: posizionamento sul primo elemento di un elenco di dati&lt;/li&gt;\r\n\t&lt;li&gt;FORWARD: prosecuzione al prossimo passo di una serie di passi guidati&lt;/li&gt;\r\n\t&lt;li&gt;LAST_ITEM: posizionamento sull\'ultimo elemento di un elenco di dati&lt;/li&gt;\r\n\t&lt;li&gt;LOAD: caricamento di un record&lt;/li&gt;\r\n\t&lt;li&gt;NEXT_ITEM: posizionamento sul prossimo elemento di un elenco di dati&lt;/li&gt;\r\n\t&lt;li&gt;PREVIOUS_ITEM: posizionamento sull\'elemento precedente a quello corrente\r\n\t\t all\'interno di un elenco di dati&lt;/li&gt;\r\n\t&lt;li&gt;SAVE: salvataggio dei dati immessi&lt;/li&gt;\r\n\t&lt;li&gt;SEARCH: effettuazione della ricerca&lt;/li&gt;\r\n\t&lt;li&gt;SEND_MESSAGE: invio di un messaggio (es. email)&lt;/li&gt;\r\n\t&lt;li&gt;SHOW_HELP: visualizzazione di una pagina di aiuto&lt;/li&gt;\r\n\t&lt;li&gt;SHOW_REPORT: visualizzazione di un report&lt;/li&gt;\r\n\t&lt;li&gt;UNSPECIFIED: funzione generica&lt;/li&gt;\r\n\t&lt;/ul&gt;\r\n&lt;/li&gt;\r\n&lt;/ul&gt;\r\n' event-clicked='&lt;p&gt;Il pulsante pu&amp;ograve; ricevere un evento di pressione da parte \r\ndell\'utente che scatena il reset della schermata.\r\nQuesto evento &amp;egrave; implicito (non occorre definire un &lt;b&gt;EventHandler&lt;/b&gt;\r\nper attivarlo). A fronte di questo evento &lt;b&gt;non&lt;/b&gt; &amp;egrave; perci&amp;ograve; \r\npossibile eseguire logica di business. \r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface ResetButton extends Button {
} // ResetButton
