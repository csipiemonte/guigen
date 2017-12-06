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
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Campo di immissione per date, con strumento per la selezione della data
 * (date picker).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Calendar#isSelectYear <em>Select Year</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Calendar#isSelectMonth <em>Select Month</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Calendar#getSelectYearRange <em>Select Year Range</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCalendar()
 * @model annotation="uiwidgetdoc description='E\' un campo utilizzabile per l\'immissione di date (nel formato gg/mm/aaaa).\r\nIl widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed il campo di immissione associato.\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.\r\nIl &lt;b&gt;Calendar&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento, una &lt;i&gt;standard&lt;/i&gt; ed una\r\n&lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del Calnedar prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la limitazione automatica del numero di caratteri digitabili (gg/mm/aaa=10)&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (che deve necessariamente essere di tipo \"DATA\")&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;li&gt;la visualizzazione di un marcatore di errore in prossimit&amp;agrave; della label, in caso di fallita\r\nvalidazione&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (maschera GG/MM/AAAA)&lt;/li&gt;\r\n&lt;li&gt;&lt;i&gt;date-picker&lt;/i&gt;: strumento di selezione della data a partire da mini-calendario&lt;/li&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface Calendar extends DataWidget {

	/**
	 * Returns the value of the '<em><b>Select Year</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * se valorizzato a <i>true</i> permette all'utente la scelta dell'anno tramite una
	 * dropdown list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Select Year</em>' attribute.
	 * @see #setSelectYear(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCalendar_SelectYear()
	 * @model default="false"
	 * @generated
	 */
	boolean isSelectYear();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Calendar#isSelectYear <em>Select Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Year</em>' attribute.
	 * @see #isSelectYear()
	 * @generated
	 */
	void setSelectYear(boolean value);

	/**
	 * Returns the value of the '<em><b>Select Month</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * se valorizzato a <i>true</i> permette all'utente la scelta del mese tramite una
	 * dropdown list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Select Month</em>' attribute.
	 * @see #setSelectMonth(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCalendar_SelectMonth()
	 * @model default="false"
	 * @generated
	 */
	boolean isSelectMonth();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Calendar#isSelectMonth <em>Select Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Month</em>' attribute.
	 * @see #isSelectMonth()
	 * @generated
	 */
	void setSelectMonth(boolean value);

	/**
	 * Returns the value of the '<em><b>Select Year Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * permette di specificare il range di selezione dell'anno (utilizzato solo se 
	 * <i>selectYear = true</i>:
	 * <ul>
	 * <li>"-nn:+nn" : range relativo all'anno corrente (es. "-100:+50") </li>
	 * <li>"c-nn:c+nn" : range relativo all'anno correntemente selezionato (es. "c-5:c+5") </li>
	 * <li>"-nnnn:+nnnn" : range assoluto (es. "-1950:+1999") </li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Select Year Range</em>' attribute.
	 * @see #setSelectYearRange(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCalendar_SelectYearRange()
	 * @model
	 * @generated
	 */
	String getSelectYearRange();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Calendar#getSelectYearRange <em>Select Year Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Year Range</em>' attribute.
	 * @see #getSelectYearRange()
	 * @generated
	 */
	void setSelectYearRange(String value);
} // Calendar
