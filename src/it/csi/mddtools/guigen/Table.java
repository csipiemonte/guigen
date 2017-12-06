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
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tabella di visualizzazione dati. Permette di visualizzare in formato tabellare
 * una collezione di record.
 * Mette a disposizione alcune funzioni avanzate:
 * <ol>
 * <li>paginazione
 *   <ul>
 *   <li>opzionale</li>
 *   <li>con possibilit&agrave; di impostare la dimensione della "pagina"</li>
 *   <li>resettabile da business logic</li>
 *   </ul>
 * </li>  
 * <li>export dei dati
 *   <ul>
 *   <li>opzionale</li>
 *   <li>in formato PDF, XLS, RTF</li>
 *   </ul>
 * </li>
 * <li>Con selezione della riga (&egrave; è il valore associato al DataWidget Table, utilizzabile nella business logic
 *   <ul>
 *   <li>opzionale (abilitata solo se è impostato un databinding/valuebinding)</li>
 *   <li>singola o multipla (a seconda del tipo del databinding/valuebinding)</li>
 *   </ul>
 * </li>
 * <li>Con possibilit&agrave; di editing delle celle
 *   <ul>
 *   <li>con widget di editing differenziato a seconda del tipo del dato della cella (TextField se Stringa/numerico, checkbox se boolean</li>
 *   <li>con possibilit&agrave; di scegliere a runtime se una singola cella deve essere editabile o meno</li>
 *   <li>con possibilit&agrave; di prendere il valore della cella da una collection (tramite combobox); la collection può essere unica per tutta la colonna o variabile per la singola riga</li>
 *   </ul>
 * </li>
 * </ol>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTable()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di visualizzazione/editing di dati in formato tabellare.\r\n&lt;!--Il widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed il campo di immissione associato.\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.--&gt;\r\nLa &lt;b&gt;Table&lt;/b&gt; pu&amp;ograve; essere utilizzata all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia; N.B: deve\r\nessere l\'unico widget all\'interno del pannello&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede tre modalit&amp;agrave; di funzionamento, una &lt;i&gt;standard/visualizzazione&lt;/i&gt;,\r\nuna &lt;i&gt;standard/editing&lt;/i&gt; ed una &lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard/visualizzazione&lt;/h4&gt;\r\nIl funzionamento di base della Table prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di visualizzare le informazioni contenute in una \r\ncollezione di record, con formattazioen dell\'informazione coerente con il tipo di dato\r\ndi ciascuna colonna&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; (opzionale) di effettuare l\'ordinamento delle righe in base ai valori\r\ncontenuti in una colonna&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; (opzionale) di &lt;b&gt;paginare&lt;/b&gt; i risultati (con dimensione della pagina impostabile)&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; (opzionale) di effettuare l\'&lt;b&gt;export&lt;/b&gt; dei dati della tabella in formato excel o pdf&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; (opzionale) di &lt;b&gt;selezione&lt;/b&gt; singola o multipla delle righe della Tabella, allo scopo\r\ndi eseguire logiche applicative sulle righe selezionate (l\'esecuzione della logica deve essere comandata in un momento\r\nsuccessivo alla selezione da un &lt;b&gt;Button&lt;/b&gt; posto nella stessa schermata)&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitata a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere resa invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitata/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;!--&lt;li&gt;la visualizzazione di un marcatore di errore in prossimit&amp;agrave; della label, in caso di fallita\r\nvalidazione&lt;/li&gt;--&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; standard/editing&lt;/h4&gt;\r\nRipsetto alla modalit&amp;agrave; &lt;i&gt;standard/visualizzazione&lt;/i&gt; la modalit&amp;agrave; &lt;i&gt;standard/editing&lt;/i&gt;\r\nprevede alcune possibilit&amp;agrave; aggiuntive:\r\n&lt;ul&gt;\r\n&lt;li&gt;&lt;b&gt;editing &lt;i&gt;in place&lt;/i&gt;&lt;/b&gt; delle celle di una colonna:\r\n\t&lt;ul&gt;\r\n\t&lt;li&gt;il &lt;b&gt;widget di editing&lt;/b&gt; della cella dipende dal tipo di dato associato alla colonna:\r\n\t\t&lt;ul&gt;\r\n\t\t&lt;li&gt;&lt;b&gt;Calendar&lt;/b&gt; in caso di tipo DATA&lt;/li&gt;\r\n\t\t&lt;li&gt;&lt;b&gt;CheckBox&lt;/b&gt; in caso di tipo BOOLEAN&lt;/li&gt;\r\n\t\t&lt;li&gt;&lt;b&gt;TextField&lt;/b&gt; in tutti gli altri casi&lt;/li&gt;\r\n\t\t&lt;/ul&gt;\r\n\t&lt;/li&gt;\r\n\t&lt;li&gt;&amp;egrave; possibile selezionare il valore di una cella da una &lt;b&gt;lista di valori&lt;/b&gt; (in questo caso il widget utilizzato\r\n\t\tper l\'immissione &amp;egrave; la &lt;b&gt;ComboBox&lt;/b&gt;); l\'elenco dei valori selezionabili pu&amp;ograve; essere comune a tutte le\r\n\t\trighe oppure specifico per ciascuna riga\r\n\t&lt;/li&gt;\r\n\t&lt;li&gt;&amp;egrave; possibile, nell\'ambito di una colonna dichiarata &lt;i&gt;editabile&lt;/i&gt;, decidere a runtime l\'editabilit&amp;agrave;\r\n\t\tdella singola cella (nel qual caso il widget corrispondente apparir&amp;agrave; disabilitato)\r\n\t&lt;/li&gt;\r\n\t&lt;/ul&gt;\r\n&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sull\'intestazione delle colonne&lt;/li&gt;\r\n&lt;li&gt;refresh della sola area della tabella in caso di esecuzione delle funzioni di ordinamento e paginazione&lt;/li&gt;\r\n&lt;li&gt;possibilit&amp;agrave; di ridimensionare/cambiare l\'ordine/nascondere le colonne della tabella interattivamente&lt;/li&gt;\r\n&lt;/ul&gt;' event-clicked='&lt;p&gt;In una tabella &amp;egrave; possibile rendere \"attive\" le celle di alcune\r\ncolonne (purch\350 esse non siano editabili). L\'evento \"clicked\" &amp;egrave; proprio il \"click\" dell\'utente \r\nsu tali celle. \r\nE\'possibile, a fronte ddi questo evento, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&amp;agrave; di esecuzione della logica \r\nassociata: &lt;i&gt;standard&lt;/i&gt; e &lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h5&gt;modalit&amp;agrave; standard&lt;/h5&gt;\r\nAl click di una cella viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n&lt;h5&gt;modalit&amp;agrave; ricca&lt;/h5&gt;\r\nAlla click di una cella viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n&lt;ul&gt;\r\n&lt;li&gt;il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar&lt;/li&gt;\r\n&lt;li&gt;il refresh di una porzione specifica di schermata&lt;/li&gt;\r\n&lt;li&gt;il passaggio del flusso ad una schermata differente&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface Table extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Column Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il modello delle colonne che la tabella dovr&agrave; visualizzare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column Model</em>' containment reference.
	 * @see #setColumnModel(ColumnModel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_ColumnModel()
	 * @model containment="true"
	 * @generated
	 */
	ColumnModel getColumnModel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Model</em>' containment reference.
	 * @see #getColumnModel()
	 * @generated
	 */
	void setColumnModel(ColumnModel value);

	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero di record max visualizzati in una pagina. 
	 * Un valore di "0" significa che la paginazione &egrave; disabilitata: in 
	 * questo caso vengono visualizzati tutti i record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Size</em>' attribute.
	 * @see #setPageSize(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_PageSize()
	 * @model
	 * @generated
	 */
	int getPageSize();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' attribute.
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(int value);

	/**
	 * Returns the value of the '<em><b>Enable Export</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true abilita l'export della tabella.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Export</em>' attribute.
	 * @see #setEnableExport(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_EnableExport()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableExport();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Export</em>' attribute.
	 * @see #isEnableExport()
	 * @generated
	 */
	void setEnableExport(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Decorator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true abilita la definizione di un CustomDecorator, 
	 * per impostazioni grafiche particolari a livello di intera riga
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Decorator</em>' attribute.
	 * @see #setCustomDecorator(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_CustomDecorator()
	 * @model
	 * @generated
	 */
	boolean isCustomDecorator();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Decorator</em>' attribute.
	 * @see #isCustomDecorator()
	 * @generated
	 */
	void setCustomDecorator(boolean value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

} // Table
