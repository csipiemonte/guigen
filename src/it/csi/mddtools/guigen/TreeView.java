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
 * A representation of the model object '<em><b>Tree View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Widget che permette di visualizzare una struttura ad albero.
 * La struttura dati deve essere mantenuta in un application data di tipo TreeNode.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TreeView#getNodeSelectionType <em>Node Selection Type</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTreeView()
 * @model annotation="uiwidgetdoc description='E\' un widget utilizzabile per la visualizzazione di una struttura ad albero.\r\nIl &lt;b&gt;TreeView&lt;/b&gt; pu&amp;ograve; essere utilizzato all\'interno di:\r\n&lt;ul&gt;\r\n&lt;li&gt;WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)&lt;/li&gt;\r\n&lt;/ul&gt;\r\nPrevede due modalit&amp;agrave; di funzionamento: &lt;i&gt;standard&lt;/i&gt; e &lt;i&gt;ricca&lt;/i&gt;.\r\n&lt;h4&gt;modalit&amp;agrave; standard&lt;/h4&gt;\r\nIl funzionamento di base del TreeView prevede:\r\n&lt;ul&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di visualizzare una struttura ad albero in termini di testo sintetico descrittivo\r\ndel contenuto di ciascun nodo.&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di espandere un nodo non foglia per mostrarne i nodi figli&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere reso invisibile a comando&lt;/li&gt;\r\n&lt;li&gt;la possibilit&amp;agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;h4&gt;modalit&amp;agrave; ricca&lt;/h4&gt;\r\nLa modalit&amp;agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n&lt;ul&gt;\r\n&lt;li&gt;tooltip al passaggio del cursore sulla label del widget&lt;/li&gt;\r\n&lt;/ul&gt;' event-clicked='&lt;p&gt;Il &lt;b&gt;TreeView&lt;/b&gt; pu&amp;ograve; ricevere un evento di pressione da parte \r\ndell\'utente che agisce in due modi a seconda che il nodo selezionato sia un nodo\r\nfoglia o intermedio.\r\n&lt;ol&gt;\r\n&lt;li&gt;in caso di nodo intermedio l\'evento &amp;egrave; implicito (non occorre definire un \r\n&lt;b&gt;EventHandler&lt;/b&gt;per attivarlo) e l\'effetto della selezione &amp;egrave; l\'espansione \r\no la chiusura del nodo&lt;/li&gt;\r\n&lt;li&gt;in caso di nodo foglia &amp;egrave; possibile eseguire della logica server-side; tale\r\nlogica avr&amp;agrave, a disposizione l\'informazione che permette di risalire al nodo selezionato.&lt;/li&gt;\r\n&lt;/ol&gt;\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface TreeView extends DataWidget, MultiDataWidget {

	/**
	 * Returns the value of the '<em><b>Node Selection Type</b></em>' attribute.
	 * The default value is <code>"ALL_NODES"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.TreeSelectionTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determina il tipo di selezione permessa sull'albero:
	 * <ul>
	 * <li>solo sui nodi foglia</li>
	 * <li>solo sui nodi non foglia</li>
	 * <li>su tutti i nodi</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Selection Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.TreeSelectionTypes
	 * @see #setNodeSelectionType(TreeSelectionTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTreeView_NodeSelectionType()
	 * @model default="ALL_NODES"
	 * @generated
	 */
	TreeSelectionTypes getNodeSelectionType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TreeView#getNodeSelectionType <em>Node Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Selection Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.TreeSelectionTypes
	 * @see #getNodeSelectionType()
	 * @generated
	 */
	void setNodeSelectionType(TreeSelectionTypes value);
} // TreeView
