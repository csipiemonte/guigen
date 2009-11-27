/**
 * <copyright>
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
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
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
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationArea()
 * @model
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
	 * [[TODO: add documentation here]]
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
	 * [[TODO: add documentation here]]
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
	 * [[TODO: add documentation here]]
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
	 * [[TODO: add documentation here]]
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
	 * [[TODO: add documentation here]]
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
