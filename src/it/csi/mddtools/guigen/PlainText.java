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
 * A representation of the model object '<em><b>Plain Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette la visualizzazione di testo, fisso o proveniente da application data, senza possibilità di editing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PlainText#getStaticText <em>Static Text</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPlainText()
 * @model annotation="uiwidgetdoc description='E\' un widget di visualizzazione di dati testuali.\r\nIl widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed il campo di visualizzazione associato, che\r\n&amp;egrave; semplicemente il testo corrispondente al valore associato al widget\r\n(da qui il nome di &lt;b&gt;PlainText&lt;/b&gt;).\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.\r\nIl &lt;b&gt;TextField&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia&lt;/li&gt;\r\n&lt;li&gt;DialogPanel, per la visualizzazione del testo del dialog&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento, una &lt;i&gt;standard&lt;/i&gt; ed una\r\n&lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del PlainText prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;\r\n'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface PlainText extends DataWidget {

	/**
	 * Returns the value of the '<em><b>Static Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato il widget visualizzer&agrave; il testo html specificato a fianco alla label.
	 * In caso contrario, e se sar&agrave; specificato un data binding, il
	 * valore visualizzato sar&agrave; preso dall'application data referenziato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Text</em>' attribute.
	 * @see #setStaticText(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPlainText_StaticText()
	 * @model
	 * @generated
	 */
	String getStaticText();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PlainText#getStaticText <em>Static Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Text</em>' attribute.
	 * @see #getStaticText()
	 * @generated
	 */
	void setStaticText(String value);
} // PlainText
