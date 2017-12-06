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
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Vidget a due valori: on/off. Il tipo associato deve essere un Boolean
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCheckBox()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di selezione di un valore booleano (si/no).\r\nIl widget completo prevede una &lt;i&gt;label&lt;/i&gt; ed il campo di immissione associato.\r\nLa &lt;i&gt;label&lt;/i&gt; pu&amp;ograve; essere, in casi particolari, vuota.\r\nIl &lt;b&gt;CheckBox&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento, una &lt;i&gt;standard&lt;/i&gt; ed una\r\n&lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del CheckBox prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (es . campo required)&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;li&gt;la visualizzazione di un marcatore di errore in prossimit&amp;agrave; della label, in caso di fallita\r\nvalidazione&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;\r\n'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface CheckBox extends DataWidget {
} // CheckBox
