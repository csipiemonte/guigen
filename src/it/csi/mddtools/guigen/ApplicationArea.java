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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Rappresenta l'area di user interface specifica dell'applicazione, 
 * innestata nella struttura comune solitamente definita dagli standard
 * del sito di esposizione.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getMenubar <em>Menubar</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getTitlebar <em>Titlebar</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getStatusbar <em>Statusbar</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getContentPanels <em>Content Panels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getStaticLinks <em>Static Links</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getOnInitCommand <em>On Init Command</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getModules <em>Modules</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getExtModules <em>Ext Modules</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationArea#getHomePage <em>Home Page</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea()
 * @model annotation="logicpkg pkg='app'"
 * @generated
 */
public interface ApplicationArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Menubar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menubar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Struttura del menu dell'applicazione.
	 * Il menu deve essere definito in questo punto, mentre la visualizzazione effettiva 
	 * dipende dalla particolare cartuccia di layout.
	 * In alcuni layout potrebbe esserci un unico modo di visualizzare il menu e la visualizzazione potrebbe essere di default
	 * (es. in alto sotto al banner dell'applicativo).
	 * In altri layout il menu deve essere inserito esplicitamente tramite un particolare
	 * widget denominato MenuView che viene espanso con la struttura del menu
	 * definita in questo elemento.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Menubar</em>' containment reference.
	 * @see #setMenubar(Menubar)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_Menubar()
	 * @model containment="true"
	 * @generated
	 */
	Menubar getMenubar();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationArea#getMenubar <em>Menubar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menubar</em>' containment reference.
	 * @see #getMenubar()
	 * @generated
	 */
	void setMenubar(Menubar value);

	/**
	 * Returns the value of the '<em><b>Titlebar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titlebar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titlebar</em>' containment reference.
	 * @see #setTitlebar(Titlebar)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_Titlebar()
	 * @model containment="true"
	 * @generated
	 */
	Titlebar getTitlebar();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationArea#getTitlebar <em>Titlebar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titlebar</em>' containment reference.
	 * @see #getTitlebar()
	 * @generated
	 */
	void setTitlebar(Titlebar value);

	/**
	 * Returns the value of the '<em><b>Statusbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statusbar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statusbar</em>' containment reference.
	 * @see #setStatusbar(Statusbar)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_Statusbar()
	 * @model containment="true"
	 * @generated
	 */
	Statusbar getStatusbar();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationArea#getStatusbar <em>Statusbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statusbar</em>' containment reference.
	 * @see #getStatusbar()
	 * @generated
	 */
	void setStatusbar(Statusbar value);

	/**
	 * Returns the value of the '<em><b>Content Panels</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ContentPanel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Panels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contiene i ContentPanel che costituiscono le schermate dell'applicazione.
	 * Deprecato (dalla v.1.3): definire le schermate in uno o più AppModule, 
	 * preferibilmente mantenuti su file separati.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Panels</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_ContentPanels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentPanel> getContentPanels();

	/**
	 * Returns the value of the '<em><b>Static Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Links</em>' containment reference.
	 * @see #setStaticLinks(StaticLinks)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_StaticLinks()
	 * @model containment="true"
	 * @generated
	 */
	StaticLinks getStaticLinks();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationArea#getStaticLinks <em>Static Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Links</em>' containment reference.
	 * @see #getStaticLinks()
	 * @generated
	 */
	void setStaticLinks(StaticLinks value);

	/**
	 * Returns the value of the '<em><b>On Init Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Init Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comandi che vengono eseguiti all'inizializzazione dell'applicazione
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Init Command</em>' containment reference.
	 * @see #setOnInitCommand(Command)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_OnInitCommand()
	 * @model containment="true"
	 * @generated
	 */
	Command getOnInitCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationArea#getOnInitCommand <em>On Init Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Init Command</em>' containment reference.
	 * @see #getOnInitCommand()
	 * @generated
	 */
	void setOnInitCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.AppModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moduli applicativi (insiemi di ContentPanel). 
	 * Deprecato: utilizzare <b>extModules</b> e mantenere gli <b>AppModule</b>
	 * su file separati.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppModule> getModules();

	/**
	 * Returns the value of the '<em><b>Ext Modules</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.AppModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moduli applicativi (insiemi di ContentPanel). 
	 * Gli <b>AppModule</b> devono essere mantenuti su file separati.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Modules</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_ExtModules()
	 * @model
	 * @generated
	 */
	EList<AppModule> getExtModules();

	/**
	 * Returns the value of the '<em><b>Home Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il content panel che deve essere considerato la Home Page dell'applicativo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Home Page</em>' reference.
	 * @see #setHomePage(ContentPanel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea_HomePage()
	 * @model
	 * @generated
	 */
	ContentPanel getHomePage();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationArea#getHomePage <em>Home Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Page</em>' reference.
	 * @see #getHomePage()
	 * @generated
	 */
	void setHomePage(ContentPanel value);

} // ApplicationArea
