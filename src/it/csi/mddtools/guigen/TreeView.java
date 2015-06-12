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
 * @model annotation="uiwidgetdoc description='E\' un widget utilizzabile per la visualizzazione di una struttura ad albero.\r\nIl <b>TreeView</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento: <i>standard</i> e <i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TreeView prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di visualizzare una struttura ad albero in termini di testo sintetico descrittivo\r\ndel contenuto di ciascun nodo.</li>\r\n<li>la possibilit&agrave; di espandere un nodo non foglia per mostrarne i nodi figli</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>' event-clicked='<p>Il <b>TreeView</b> pu&ograve; ricevere un evento di pressione da parte \r\ndell\'utente che agisce in due modi a seconda che il nodo selezionato sia un nodo\r\nfoglia o intermedio.\r\n<ol>\r\n<li>in caso di nodo intermedio l\'evento &egrave; implicito (non occorre definire un \r\n<b>EventHandler</b>per attivarlo) e l\'effetto della selezione &egrave; l\'espansione \r\no la chiusura del nodo</li>\r\n<li>in caso di nodo foglia &egrave; possibile eseguire della logica server-side; tale\r\nlogica avr&agrave, a disposizione l\'informazione che permette di risalire al nodo selezionato.</li>\r\n</ol>\r\n</p>'"
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
