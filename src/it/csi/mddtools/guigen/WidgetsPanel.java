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
 * A representation of the model object '<em><b>Widgets Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pannello destinato a contenere Widget.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.WidgetsPanel#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WidgetsPanel#getSummary <em>Summary</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WidgetsPanel#isCollapsible <em>Collapsible</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWidgetsPanel()
 * @model annotation="uipaneldoc description='&lt;p&gt;\r\nIl &lt;b&gt;widgetsPanel&lt;/b&gt; &amp;egrave; il pannello principale utilizzabile per la realizzazione di\r\n&lt;i&gt;form&lt;/i&gt; di immissione/visualizzazione dati. Al suo interno &amp;egrave; possibile inserire, secondo\r\ni vari layout disponibili, praticamente tutti i &lt;b&gt;Widget&lt;/b&gt;. L\'effetto grafico &amp;egrave; quello di un\r\ninsieme di widget organizzati verticalmente, orizzontalmente oppure a griglia. Ciascun\r\nwidget &amp;egrave; dotato di label. Il pannello stesso pu&amp;ograve;, opzionalmente, essere dotato di\r\n&amp;quot;titolo&amp;quot; che viene visualzzato in testa al pannello.\r\n&lt;br/&gt;\r\nAll\'interno del singolo tab &amp;egrave; possibile inserire tutte le tipologie di widget disponibili, ad esclusione\r\ndel &lt;b&gt;MenuView&lt;/b&gt; che deve invece essere obbligatoriamente inserito in un &lt;b&gt;MenuPanel&lt;/b&gt;.\r\n&lt;/p&gt;'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface WidgetsPanel extends Panel {
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
	 * Elenco dei widget contenuti. I Widget sono organizzati secondo il layout
	 * associato al pannello e secondo gli eventuali specificatori associati a 
	 * ciascun widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidgetsPanel_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidgetsPanel_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WidgetsPanel#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

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
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidgetsPanel_Collapsible()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollapsible();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WidgetsPanel#isCollapsible <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsible</em>' attribute.
	 * @see #isCollapsible()
	 * @generated
	 */
	void setCollapsible(boolean value);

} // WidgetsPanel
