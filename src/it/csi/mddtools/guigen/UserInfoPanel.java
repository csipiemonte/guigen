/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Info Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pannello per la visualizzazione delle informazioni identificative dell'utente loggato.
 * Un <b>ContentPanel</b> che contiene uno <b>UserInfoPanel</b> deve referenziare 
 * l'application data <i>common::currentUser</i>.
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getUserInfoPanel()
 * @model annotation="uipaneldoc description='<p>\r\nLo <b>UserInfoPanel</b> &egrave; un pannello utilizzato per visualizzare le informazioni\r\nrelative all\'utente selezionato, che tipicamente sono:\r\n<ol>\r\n<li>il nome ed il cognome dell\'utente</li>\r\n<li>il codice fiscale dell\'utente</li>\r\n<li>l\'ente di appartenenza</li>\r\n<li>il ruolo</li>\r\n</ol>\r\n<br/>\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface UserInfoPanel extends Panel {
} // UserInfoPanel
