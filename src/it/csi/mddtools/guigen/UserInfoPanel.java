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
