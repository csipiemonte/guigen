/**
 * <copyright>
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
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.FormPanel#getSubpanels <em>Subpanels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.FormPanel#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getFormPanel()
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>FormPanel</b> &egrave; un pannello utilizzato principalmente per\r\ncreare la macro struttura della schermata. E\'un pannello destinato a \r\ncontenere altri pannelli con lo scopo di organizzarli in struttura secondo i vari\r\nlayout disponibili. <br/>\r\nIl <b>FormPanel</b> tipicamente si colloca:\r\n<ul>\r\n<li>come pannello principale (pi&ugrave; esterno) della schermata;</li>\r\n<li>come pannello principale del singolo quadrante all\'interno di un <b>FormPanel</b>\r\ncon layout a quadranti (UDLRC)</li>\r\n<li>come contenitore di ciascun <i>item</i> di un pannello a <i>tab</i>\r\no <i>wizard</i></li>\r\n<li>per ogni <i>item</i> di un <b>MultiPanel</b></li>\r\n</ul>\r\nIl <b>FormPanel</b> pu&ograve; essere dotato di <i>titolo</i>. Nel caso di\r\n<b>FormPanel</b> utilizzato all\'interno di un <b>TabSetPanel</b> tale titolo \r\n&egrave; utilizzato come etichetta del tab corrispondente, mentre nel caso in cui sia\r\nutilizzato all\'interno di un <b>WizardPanel</b> il titolo viene visualizzato come\r\nnome dello <i>step</i> corrispondente.\r\nIl <b>FormPanel</b> non pu&ograve; contenere widget, ma solo sottopannelli.\r\n</p>'"
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

} // FormPanel
