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
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Campo di immissione testo multilinea.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TextArea#getRows <em>Rows</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TextArea#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTextArea()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di immissione di dati testuali a riga multipla.\r\nIl widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed l\'area di immissione associata.\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.\r\nLa &lt;b&gt;TextArea&lt;/b&gt; pu&amp;ograve; essere utilizzata all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento: standard e ricca.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base della TextArea prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di specificare la dimensione in righe/colonne\r\ndell\'area editabile&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;li&gt;la visualizzazione di un marcatore di errore in prossimit&amp;agrave; della label, in caso di fallita\r\nvalidazione&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;!-- &lt;li&gt;verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (es. solo caratteri numerici per tipi numerici)&lt;/li&gt;\r\n&lt;li&gt;verifiche client side al momento della digitazione di rispetto della dimensione massima del dato&lt;/li&gt; --&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
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
