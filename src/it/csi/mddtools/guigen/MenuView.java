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
 * A representation of the model object '<em><b>Menu View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di visualizzare la struttura di menu definita nella <b>MenuBar</b>.
 * Deve essere inserito in un <b>MenuPanel</b>.
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMenuView()
 * @model annotation="uiwidgetdoc description='Questo widget &amp;egrave; un segnaposto utilizzabile per la visualizzazione della struttura\r\ndel menu. \r\nIl &lt;b&gt;MenuView&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;MenuPanel, con layout Verticale&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede una sola modalit&amp;agrave; di funzionamento: &lt;i&gt;standard&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del TreeView prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPer ciascuna voce di menu, inoltre &amp;egrave; possibile replicare gli stessi comportamenti di \r\nvisibilit&amp;agrave;/abilitazione.\r\n' event-clicked='&lt;p&gt;Il &lt;b&gt;MenuView&lt;/b&gt; pu&amp;ograve; ricevere un evento di selezione della voce\r\ndi menu corrispondente, alla quale &amp;egrave, possibile associare una logica\r\ndi business da eseguire.\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface MenuView extends CommandWidget {
} // MenuView
