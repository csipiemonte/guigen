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
 * A representation of the model object '<em><b>File Upload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Widget per la selezione e l'upload di un file
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.FileUpload#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getFileUpload()
 * @model annotation="uiwidgetdoc description='E\' il classico widget utilizzabile per la selezione di un &lt;i&gt;file&lt;/i&gt; che dovr&amp;agrave; essere inviato\r\nal server (funzione di &lt;i&gt;file upload&lt;/i&gt;).\r\nIl &lt;b&gt;FileUpload&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento: &lt;i&gt;standard&lt;/i&gt; e &lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del FileUpload prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di selezionare da file system un file mediante &lt;i&gt;browsing&lt;/i&gt; sulle cartelle\r\nlocali alla postazione client&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;' event-clicked='&lt;p&gt;Il widget &lt;b&gt;FileUpload&lt;/b&gt; contiene un pulsante che pu&amp;ograve; ricevere un evento di pressione \r\nda parte dell\'utente a fronte del quale viene visualizzato il &lt;i&gt;dialog&lt;/i&gt; di selezione del file da sottomettere al\r\nserver. \r\nQuesto evento &amp;egrave; implicito (non occorre definire un &lt;b&gt;EventHandler&lt;/b&gt; per attivarlo). \r\nA fronte di questo evento &lt;b&gt;non&lt;/b&gt; &amp;egrave; per&amp;ograve; possibile eseguire logica di business. \r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface FileUpload extends Widget {

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * se <i>multiple</i> = <i>true</i>, sar&agrave; possibile selezionare pi&ugrave; 
	 * di un file. Il valore di default &egrave;: <i>false</i>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFileUpload_Multiple()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.FileUpload#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);
} // FileUpload
