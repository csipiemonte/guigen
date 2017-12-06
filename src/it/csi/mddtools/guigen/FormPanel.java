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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pannello destinato a contenere sottopannelli. Serve principlamente per definire
 * la struttura della user interface. Non tutte lel possibilità (di layout, di annidamento)
 * sono disponibili pe rtutte le cartucce di layout/portale.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.FormPanel#getSubpanels <em>Subpanels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.FormPanel#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.FormPanel#isCollapsible <em>Collapsible</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel()
 * @model annotation="uipaneldoc description='&lt;p&gt;\r\nIl &lt;b&gt;FormPanel&lt;/b&gt; &amp;egrave; un pannello utilizzato principalmente per\r\ncreare la macro struttura della schermata. E\'un pannello destinato a \r\ncontenere altri pannelli con lo scopo di organizzarli in struttura secondo i vari\r\nlayout disponibili. &lt;br/&gt;\r\nIl &lt;b&gt;FormPanel&lt;/b&gt; tipicamente si colloca:\r\n&lt;ul&gt;\r\n&lt;li&gt;come pannello principale (pi&amp;ugrave; esterno) della schermata;&lt;/li&gt;\r\n&lt;li&gt;come pannello principale del singolo quadrante all\'interno di un &lt;b&gt;FormPanel&lt;/b&gt;\r\ncon layout a quadranti (UDLRC)&lt;/li&gt;\r\n&lt;li&gt;come contenitore di ciascun &lt;i&gt;item&lt;/i&gt; di un pannello a &lt;i&gt;tab&lt;/i&gt;\r\no &lt;i&gt;wizard&lt;/i&gt;&lt;/li&gt;\r\n&lt;li&gt;per ogni &lt;i&gt;item&lt;/i&gt; di un &lt;b&gt;MultiPanel&lt;/b&gt;&lt;/li&gt;\r\n&lt;/ul&gt;\r\nIl &lt;b&gt;FormPanel&lt;/b&gt; pu&amp;ograve; essere dotato di &lt;i&gt;titolo&lt;/i&gt;. Nel caso di\r\n&lt;b&gt;FormPanel&lt;/b&gt; utilizzato all\'interno di un &lt;b&gt;TabSetPanel&lt;/b&gt; tale titolo \r\n&amp;egrave; utilizzato come etichetta del tab corrispondente, mentre nel caso in cui sia\r\nutilizzato all\'interno di un &lt;b&gt;WizardPanel&lt;/b&gt; il titolo viene visualizzato come\r\nnome dello &lt;i&gt;step&lt;/i&gt; corrispondente.\r\nIl &lt;b&gt;FormPanel&lt;/b&gt; non pu&amp;ograve; contenere widget, ma solo sottopannelli.\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface FormPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Subpanels</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpanels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Un <B>FormPanel</b> contiene uno o più sottopannelli organizzati in 
	 * vari tipi di layout. La disposizione effettiva dei sottopannelli all'interno del
	 * <b>FormPanel</b> dipende da:
	 * <ul>
	 * <li>il tipo di layout associato al pannello</li>
	 * <li>lo specificatore associato a ciascun sottopannello</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subpanels</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel_Subpanels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panel> getSubpanels();

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OBSOLETO: NON UTILIZZARE: utilizzare un <b>WidgetsPanel</b> o un
	 * <b>CommandPanel</b> interni al <b>FormPanel</b> ed inserire lì i
	 * widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Collapsible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se <i>true</i> il pannello &egrave; collassabile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsible</em>' attribute.
	 * @see #setCollapsible(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel_Collapsible()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollapsible();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.FormPanel#isCollapsible <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsible</em>' attribute.
	 * @see #isCollapsible()
	 * @generated
	 */
	void setCollapsible(boolean value);

} // FormPanel
