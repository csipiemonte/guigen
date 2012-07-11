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
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#getSummary <em>Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTable()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di visualizzazione/editing di dati in formato tabellare.\r\n<!--Il widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.-->\r\nLa <b>Table</b> pu&ograve; essere utilizzata all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia; N.B: deve\r\nessere l\'unico widget all\'interno del pannello</li>\r\n</ul>\r\nPrevede tre modalit&agrave; di funzionamento, una <i>standard/visualizzazione</i>,\r\nuna <i>standard/editing</i> ed una <i>ricca</i>.\r\n<h4>modalit&agrave; standard/visualizzazione</h4>\r\nIl funzionamento di base della Table prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di visualizzare le informazioni contenute in una \r\ncollezione di record, con formattazioen dell\'informazione coerente con il tipo di dato\r\ndi ciascuna colonna</li>\r\n<li>la possibilit&agrave; (opzionale) di effettuare l\'ordinamento delle righe in base ai valori\r\ncontenuti in una colonna</li>\r\n<li>la possibilit&agrave; (opzionale) di <b>paginare</b> i risultati (con dimensione della pagina impostabile)</li>\r\n<li>la possibilit&agrave; (opzionale) di effettuare l\'<b>export</b> dei dati della tabella in formato excel o pdf</li>\r\n<li>la possibilit&agrave; (opzionale) di <b>selezione</b> singola o multipla delle righe della Tabella, allo scopo\r\ndi eseguire logiche applicative sulle righe selezionate (l\'esecuzione della logica deve essere comandata in un momento\r\nsuccessivo alla selezione da un <b>Button</b> posto nella stessa schermata)</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitata a comando</li>\r\n<li>la possibilit&agrave; di essere resa invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitata/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<!--<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>-->\r\n</ul>\r\n<h4>modalit&agrave; standard/editing</h4>\r\nRipsetto alla modalit&agrave; <i>standard/visualizzazione</i> la modalit&agrave; <i>standard/editing</i>\r\nprevede alcune possibilit&agrave; aggiuntive:\r\n<ul>\r\n<li><b>editing <i>in place</i></b> delle celle di una colonna:\r\n\t<ul>\r\n\t<li>il <b>widget di editing</b> della cella dipende dal tipo di dato associato alla colonna:\r\n\t\t<ul>\r\n\t\t<li><b>Calendar</b> in caso di tipo DATA</li>\r\n\t\t<li><b>CheckBox</b> in caso di tipo BOOLEAN</li>\r\n\t\t<li><b>TextField</b> in tutti gli altri casi</li>\r\n\t\t</ul>\r\n\t</li>\r\n\t<li>&egrave; possibile selezionare il valore di una cella da una <b>lista di valori</b> (in questo caso il widget utilizzato\r\n\t\tper l\'immissione &egrave; la <b>ComboBox</b>); l\'elenco dei valori selezionabili pu&ograve; essere comune a tutte le\r\n\t\trighe oppure specifico per ciascuna riga\r\n\t</li>\r\n\t<li>&egrave; possibile, nell\'ambito di una colonna dichiarata <i>editabile</i>, decidere a runtime l\'editabilit&agrave;\r\n\t\tdella singola cella (nel qual caso il widget corrispondente apparir&agrave; disabilitato)\r\n\t</li>\r\n\t</ul>\r\n</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sull\'intestazione delle colonne</li>\r\n<li>refresh della sola area della tabella in caso di esecuzione delle funzioni di ordinamento e paginazione</li>\r\n<li>possibilit&agrave; di ridimensionare/cambiare l\'ordine/nascondere le colonne della tabella interattivamente</li>\r\n</ul>' event-clicked='<p>In una tabella &egrave; possibile rendere \"attive\" le celle di alcune\r\ncolonne (purch\350 esse non siano editabili). L\'evento \"clicked\" &egrave; proprio il \"click\" dell\'utente \r\nsu tali celle. \r\nE\'possibile, a fronte ddi questo evento, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAl click di una cella viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla click di una cella viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>'"
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
