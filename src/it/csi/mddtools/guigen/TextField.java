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
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DataWidget per l'immissione di testo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TextField#getFieldLength <em>Field Length</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TextField#getFieldMaxLength <em>Field Max Length</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTextField()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di immissione di dati testuali a riga singola.\r\nIl widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed il campo di immissione associato.\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.\r\nIl &lt;b&gt;TextField&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento, una &lt;i&gt;standard&lt;/i&gt; ed una\r\n&lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del TextField prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di specificare il numero massimo di caratteri\r\naccettabili&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di specificare la dimensione massima dell\'area editabile\r\n(che &amp;egrave; utilizzata in modi differenti a seconda della cartuccia/skin)&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;li&gt;la visualizzazione di un marcatore di errore in prossimit&amp;agrave; della label, in caso di fallita\r\nvalidazione&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (es. solo caratteri numerici per tipi numerici)&lt;/li&gt;\r\n&lt;li&gt;verifiche client side al momento della digitazione di rispetto della dimensione massima del dato&lt;/li&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;\r\nInoltre &amp;egrave; possibile, se esplicitamente modellato, associare al &lt;b&gt;TextField&lt;/b&gt; la\r\nfunzionalit&amp;agrave; di &lt;i&gt;suggestion&lt;/i&gt; che consiste nel fornire, man mano che si digitano i \r\ncaratteri nel campo di testo, una lista di voci che corrispondono nella loro parte iniziale alla stringa\r\ndi caratteri immessa fino a quel momento (la logica di costruzione progressiva della lista di \r\nsuggerimenti &amp;egrave; a carico dello sviluppatore).' event-key-pressed='&lt;p&gt;L\'evento &lt;b&gt;KeyPressed&lt;/b&gt;, utilizzabile solo in modalit&amp;agrave; ricca, \r\npermette di ottenere la funzione di &lt;i&gt;suggestion&lt;/i&gt;\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
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
