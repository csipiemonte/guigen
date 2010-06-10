/**
 * <copyright>
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
 * @model annotation="uiwidgetdoc description='Questo widget &egrave; un segnaposto utilizzabile per la visualizzazione della struttura\r\ndel menu. \r\nIl <b>MenuView</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>MenuPanel, con layout Verticale</li>\r\n</ul>\r\nPrevede una sola modalit&agrave; di funzionamento: <i>standard</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TreeView prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n</ul>\r\nPer ciascuna voce di menu, inoltre &egrave; possibile replicare gli stessi comportamenti di \r\nvisibilit&agrave;/abilitazione.\r\n' event-clicked='<p>Il <b>MenuView</b> pu&ograve; ricevere un evento di selezione della voce\r\ndi menu corrispondente, alla quale &egrave, possibile associare una logica\r\ndi business da eseguire.\r\n</p>'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface MenuView extends CommandWidget {
} // MenuView
