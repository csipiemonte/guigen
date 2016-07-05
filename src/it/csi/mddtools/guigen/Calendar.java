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
 * @model annotation="uiwidgetdoc description='E\' un campo utilizzabile per l\'immissione di date (nel formato gg/mm/aaaa).\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>Calendar</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del Calnedar prevede:\r\n<ul>\r\n<li>la limitazione automatica del numero di caratteri digitabili (gg/mm/aaa=10)</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (che deve necessariamente essere di tipo \"DATA\")</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (maschera GG/MM/AAAA)</li>\r\n<li><i>date-picker</i>: strumento di selezione della data a partire da mini-calendario</li>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>'"
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
