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
 * A representation of the model object '<em><b>Grid Panel Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Layout a griglia.
 * I widget vengono inseriti in una griglia delle dimensioni specificate da <b>columns</b> e <b>rows</b>.
 * Ogni cella contiene un widget e la corrispondente label, se specificata.
 * Per specificare la posizione nella griglia di un widget occorre utilizzare il <b>GridWidgetLayoutSpec</b> 
 * per ogni widget contenuto nel pannello che ha questo layout.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GridPanelLayout#getColumns <em>Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GridPanelLayout#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGridPanelLayout()
 * @model annotation="uilayoutdoc description='&lt;p&gt;\r\nIl &lt;b&gt;GridPanelLayout&lt;/b&gt; (layout a grigia) &amp;egrave; applicabile esclusivamente\r\nal pannello &lt;b&gt;WidgetsPanel&lt;/b&gt; e prevede che gli elementi contenuti nel pannello\r\nche possiede questo layout (widget) siano visualizzati in una struttura a griglia.\r\nE\' necessario specificare le dimensioni orizzontali e verticali della griglia e ciascuna cella\r\ndella griglia pu&amp;ograve; contenere al massimo un solo &lt;b&gt;Widget&lt;/b&gt;.\r\nIn aggiunta un widget pu&amp;ograve; estendersi orizzontalmente per pi&amp;ugrave; di una cella\r\n(&lt;i&gt;hspan&lt;/i&gt;),\r\nDi fatto, se il numero di colonne previste dal layout  &amp;egrave; &lt;i&gt;n&lt;/i&gt;, \r\noccorre tenere in considerazione una struttura costituita da &lt;i&gt;n&lt;/i&gt; colonne logiche\r\ne &lt;i&gt;2*n&lt;/i&gt; colonne fisiche (una per la label ed una per il campo effettivo, \r\nil tutto moltiplicato per il numero colonne logiche).\r\nE\' possibile regolare le percentuali di occupazione della componente label\r\ne della componente widget di ciascuna delle colonne logiche. \r\nLe percentuali sono relative allo spazio a disposizione dell\'interno pannello.\r\nNel clacolo occorre inoltre tenere in considerazione anche casi &amp;quot; degeneri &amp;quot; quali:\r\n&lt;ul&gt;\r\n&lt;li&gt;label non valorizzate&lt;/li&gt;\r\n&lt;li&gt;span orizzontali maggiori di 1&lt;/li&gt;\r\n&lt;/ul&gt;\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.layout'"
 * @generated
 */
public interface GridPanelLayout extends PanelLayout {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione orizzontale della griglia
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGridPanelLayout_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GridPanelLayout#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensione verticale della griglia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGridPanelLayout_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GridPanelLayout#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

} // GridPanelLayout
