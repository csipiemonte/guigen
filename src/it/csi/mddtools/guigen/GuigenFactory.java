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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage
 * @generated
 */
public interface GuigenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuigenFactory eINSTANCE = it.csi.mddtools.guigen.impl.GuigenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Area</em>'.
	 * @generated
	 */
	ApplicationArea createApplicationArea();

	/**
	 * Returns a new object of class '<em>Menubar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menubar</em>'.
	 * @generated
	 */
	Menubar createMenubar();

	/**
	 * Returns a new object of class '<em>Statusbar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statusbar</em>'.
	 * @generated
	 */
	Statusbar createStatusbar();

	/**
	 * Returns a new object of class '<em>Titlebar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titlebar</em>'.
	 * @generated
	 */
	Titlebar createTitlebar();

	/**
	 * Returns a new object of class '<em>Content Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Panel</em>'.
	 * @generated
	 */
	ContentPanel createContentPanel();

	/**
	 * Returns a new object of class '<em>Form Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Panel</em>'.
	 * @generated
	 */
	FormPanel createFormPanel();

	/**
	 * Returns a new object of class '<em>Tab Set Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Set Panel</em>'.
	 * @generated
	 */
	TabSetPanel createTabSetPanel();

	/**
	 * Returns a new object of class '<em>Command Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Widget</em>'.
	 * @generated
	 */
	CommandWidget createCommandWidget();

	/**
	 * Returns a new object of class '<em>Data Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Widget</em>'.
	 * @generated
	 */
	DataWidget createDataWidget();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Field</em>'.
	 * @generated
	 */
	TextField createTextField();

	/**
	 * Returns a new object of class '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Area</em>'.
	 * @generated
	 */
	TextArea createTextArea();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	Calendar createCalendar();

	/**
	 * Returns a new object of class '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combo Box</em>'.
	 * @generated
	 */
	ComboBox createComboBox();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>GUI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Model</em>'.
	 * @generated
	 */
	GUIModel createGUIModel();

	/**
	 * Returns a new object of class '<em>GUI Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Structure</em>'.
	 * @generated
	 */
	GUIStructure createGUIStructure();

	/**
	 * Returns a new object of class '<em>GUI Behaviors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Behaviors</em>'.
	 * @generated
	 */
	GUIBehaviors createGUIBehaviors();

	/**
	 * Returns a new object of class '<em>Radio Buttons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Buttons</em>'.
	 * @generated
	 */
	RadioButtons createRadioButtons();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Reset Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Button</em>'.
	 * @generated
	 */
	ResetButton createResetButton();

	/**
	 * Returns a new object of class '<em>Confirm Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confirm Button</em>'.
	 * @generated
	 */
	ConfirmButton createConfirmButton();

	/**
	 * Returns a new object of class '<em>Horizontal Flow Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Flow Panel Layout</em>'.
	 * @generated
	 */
	HorizontalFlowPanelLayout createHorizontalFlowPanelLayout();

	/**
	 * Returns a new object of class '<em>Vertical Flow Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Flow Panel Layout</em>'.
	 * @generated
	 */
	VerticalFlowPanelLayout createVerticalFlowPanelLayout();

	/**
	 * Returns a new object of class '<em>UDLRC Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDLRC Panel Layout</em>'.
	 * @generated
	 */
	UDLRCPanelLayout createUDLRCPanelLayout();

	/**
	 * Returns a new object of class '<em>UDLRC Widget Layout Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDLRC Widget Layout Spec</em>'.
	 * @generated
	 */
	UDLRCWidgetLayoutSpec createUDLRCWidgetLayoutSpec();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu</em>'.
	 * @generated
	 */
	Menu createMenu();

	/**
	 * Returns a new object of class '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Item</em>'.
	 * @generated
	 */
	MenuItem createMenuItem();

	/**
	 * Returns a new object of class '<em>Disabled Component Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabled Component Set</em>'.
	 * @generated
	 */
	DisabledComponentSet createDisabledComponentSet();

	/**
	 * Returns a new object of class '<em>Column Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Model</em>'.
	 * @generated
	 */
	ColumnModel createColumnModel();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Event</em>'.
	 * @generated
	 */
	CommandEvent createCommandEvent();

	/**
	 * Returns a new object of class '<em>ONOFF Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ONOFF Command</em>'.
	 * @generated
	 */
	ONOFFCommand createONOFFCommand();

	/**
	 * Returns a new object of class '<em>Custom Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Command</em>'.
	 * @generated
	 */
	CustomCommand createCustomCommand();

	/**
	 * Returns a new object of class '<em>Visibility Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Command</em>'.
	 * @generated
	 */
	VisibilityCommand createVisibilityCommand();

	/**
	 * Returns a new object of class '<em>Refresh View Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refresh View Command</em>'.
	 * @generated
	 */
	RefreshViewCommand createRefreshViewCommand();

	/**
	 * Returns a new object of class '<em>Jump Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump Command</em>'.
	 * @generated
	 */
	JumpCommand createJumpCommand();

	/**
	 * Returns a new object of class '<em>Exec Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exec Command</em>'.
	 * @generated
	 */
	ExecCommand createExecCommand();

	/**
	 * Returns a new object of class '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Handler</em>'.
	 * @generated
	 */
	EventHandler createEventHandler();

	/**
	 * Returns a new object of class '<em>Dialog Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Panel</em>'.
	 * @generated
	 */
	DialogPanel createDialogPanel();

	/**
	 * Returns a new object of class '<em>Show Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Show Dialog Command</em>'.
	 * @generated
	 */
	ShowDialogCommand createShowDialogCommand();

	/**
	 * Returns a new object of class '<em>Command Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Outcome</em>'.
	 * @generated
	 */
	CommandOutcome createCommandOutcome();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Header Meta Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Meta Attr</em>'.
	 * @generated
	 */
	HeaderMetaAttr createHeaderMetaAttr();

	/**
	 * Returns a new object of class '<em>Footer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Footer</em>'.
	 * @generated
	 */
	Footer createFooter();

	/**
	 * Returns a new object of class '<em>App Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Window</em>'.
	 * @generated
	 */
	AppWindow createAppWindow();

	/**
	 * Returns a new object of class '<em>Static Links</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Links</em>'.
	 * @generated
	 */
	StaticLinks createStaticLinks();

	/**
	 * Returns a new object of class '<em>Sequence Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Command</em>'.
	 * @generated
	 */
	SequenceCommand createSequenceCommand();

	/**
	 * Returns a new object of class '<em>Jump Back Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump Back Command</em>'.
	 * @generated
	 */
	JumpBackCommand createJumpBackCommand();

	/**
	 * Returns a new object of class '<em>Application Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Data</em>'.
	 * @generated
	 */
	ApplicationData createApplicationData();

	/**
	 * Returns a new object of class '<em>App Data Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Data Binding</em>'.
	 * @generated
	 */
	AppDataBinding createAppDataBinding();

	/**
	 * Returns a new object of class '<em>Multi Data Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Data Widget</em>'.
	 * @generated
	 */
	MultiDataWidget createMultiDataWidget();

	/**
	 * Returns a new object of class '<em>Typedefs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typedefs</em>'.
	 * @generated
	 */
	Typedefs createTypedefs();

	/**
	 * Returns a new object of class '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type</em>'.
	 * @generated
	 */
	SimpleType createSimpleType();

	/**
	 * Returns a new object of class '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type</em>'.
	 * @generated
	 */
	ComplexType createComplexType();

	/**
	 * Returns a new object of class '<em>Type Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Annotation</em>'.
	 * @generated
	 */
	TypeAnnotation createTypeAnnotation();

	/**
	 * Returns a new object of class '<em>Typed Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Array</em>'.
	 * @generated
	 */
	TypedArray createTypedArray();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Application Data Defs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Data Defs</em>'.
	 * @generated
	 */
	ApplicationDataDefs createApplicationDataDefs();

	/**
	 * Returns a new object of class '<em>Tree View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree View</em>'.
	 * @generated
	 */
	TreeView createTreeView();

	/**
	 * Returns a new object of class '<em>Plain Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Text</em>'.
	 * @generated
	 */
	PlainText createPlainText();

	/**
	 * Returns a new object of class '<em>Menu View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu View</em>'.
	 * @generated
	 */
	MenuView createMenuView();

	/**
	 * Returns a new object of class '<em>Grid Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Panel Layout</em>'.
	 * @generated
	 */
	GridPanelLayout createGridPanelLayout();

	/**
	 * Returns a new object of class '<em>Grid Widget Layout Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Widget Layout Spec</em>'.
	 * @generated
	 */
	GridWidgetLayoutSpec createGridWidgetLayoutSpec();

	/**
	 * Returns a new object of class '<em>Command Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Panel</em>'.
	 * @generated
	 */
	CommandPanel createCommandPanel();

	/**
	 * Returns a new object of class '<em>Menu Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Panel</em>'.
	 * @generated
	 */
	MenuPanel createMenuPanel();

	/**
	 * Returns a new object of class '<em>Hidden Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hidden Value</em>'.
	 * @generated
	 */
	HiddenValue createHiddenValue();

	/**
	 * Returns a new object of class '<em>User Defined Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Widget</em>'.
	 * @generated
	 */
	UserDefinedWidget createUserDefinedWidget();

	/**
	 * Returns a new object of class '<em>Multi Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Panel</em>'.
	 * @generated
	 */
	MultiPanel createMultiPanel();

	/**
	 * Returns a new object of class '<em>Activate Multi Panel Item Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activate Multi Panel Item Command</em>'.
	 * @generated
	 */
	ActivateMultiPanelItemCommand createActivateMultiPanelItemCommand();

	/**
	 * Returns a new object of class '<em>UC Based Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UC Based Security Constraint</em>'.
	 * @generated
	 */
	UCBasedSecurityConstraint createUCBasedSecurityConstraint();

	/**
	 * Returns a new object of class '<em>Security Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Model</em>'.
	 * @generated
	 */
	SecurityModel createSecurityModel();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case</em>'.
	 * @generated
	 */
	UseCase createUseCase();

	/**
	 * Returns a new object of class '<em>Actor Based Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Based Security Constraint</em>'.
	 * @generated
	 */
	ActorBasedSecurityConstraint createActorBasedSecurityConstraint();

	/**
	 * Returns a new object of class '<em>Custom Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Security Constraint</em>'.
	 * @generated
	 */
	CustomSecurityConstraint createCustomSecurityConstraint();

	/**
	 * Returns a new object of class '<em>OPAUTHSSO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPAUTHSSO</em>'.
	 * @generated
	 */
	OPAUTHSSO createOPAUTHSSO();

	/**
	 * Returns a new object of class '<em>SSOBARTSSO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSOBARTSSO</em>'.
	 * @generated
	 */
	SSOBARTSSO createSSOBARTSSO();

	/**
	 * Returns a new object of class '<em>Custom Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Authentication</em>'.
	 * @generated
	 */
	CustomAuthentication createCustomAuthentication();

	/**
	 * Returns a new object of class '<em>Std Message Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Std Message Panel</em>'.
	 * @generated
	 */
	StdMessagePanel createStdMessagePanel();

	/**
	 * Returns a new object of class '<em>Jump Ext Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump Ext Command</em>'.
	 * @generated
	 */
	JumpExtCommand createJumpExtCommand();

	/**
	 * Returns a new object of class '<em>Target Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Platform</em>'.
	 * @generated
	 */
	TargetPlatform createTargetPlatform();

	/**
	 * Returns a new object of class '<em>User Info Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Info Panel</em>'.
	 * @generated
	 */
	UserInfoPanel createUserInfoPanel();

	/**
	 * Returns a new object of class '<em>User Defined Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Panel</em>'.
	 * @generated
	 */
	UserDefinedPanel createUserDefinedPanel();

	/**
	 * Returns a new object of class '<em>Wizard Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard Panel</em>'.
	 * @generated
	 */
	WizardPanel createWizardPanel();

	/**
	 * Returns a new object of class '<em>App Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Module</em>'.
	 * @generated
	 */
	AppModule createAppModule();

	/**
	 * Returns a new object of class '<em>Type Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Namespace</em>'.
	 * @generated
	 */
	TypeNamespace createTypeNamespace();

	/**
	 * Returns a new object of class '<em>App Data Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Data Group</em>'.
	 * @generated
	 */
	AppDataGroup createAppDataGroup();

	/**
	 * Returns a new object of class '<em>Msg Box Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Msg Box Panel</em>'.
	 * @generated
	 */
	MsgBoxPanel createMsgBoxPanel();

	/**
	 * Returns a new object of class '<em>NOP Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOP Command</em>'.
	 * @generated
	 */
	NOPCommand createNOPCommand();

	/**
	 * Returns a new object of class '<em>Widgets Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widgets Panel</em>'.
	 * @generated
	 */
	WidgetsPanel createWidgetsPanel();

	/**
	 * Returns a new object of class '<em>Screen State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen State</em>'.
	 * @generated
	 */
	ScreenState createScreenState();

	/**
	 * Returns a new object of class '<em>Screen States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen States</em>'.
	 * @generated
	 */
	ScreenStates createScreenStates();

	/**
	 * Returns a new object of class '<em>Screen State Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen State Command</em>'.
	 * @generated
	 */
	ScreenStateCommand createScreenStateCommand();

	/**
	 * Returns a new object of class '<em>Shibboleth SSO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shibboleth SSO</em>'.
	 * @generated
	 */
	ShibbolethSSO createShibbolethSSO();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Role Based Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Based Security Constraint</em>'.
	 * @generated
	 */
	RoleBasedSecurityConstraint createRoleBasedSecurityConstraint();

	/**
	 * Returns a new object of class '<em>File Upload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Upload</em>'.
	 * @generated
	 */
	FileUpload createFileUpload();

	/**
	 * Returns a new object of class '<em>Tab Switcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Switcher</em>'.
	 * @generated
	 */
	TabSwitcher createTabSwitcher();

	/**
	 * Returns a new object of class '<em>Panel Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panel Def</em>'.
	 * @generated
	 */
	PanelDef createPanelDef();

	/**
	 * Returns a new object of class '<em>App Data Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Data Mapping Param</em>'.
	 * @generated
	 */
	AppDataMappingParam createAppDataMappingParam();

	/**
	 * Returns a new object of class '<em>Type Def Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Def Mapping Param</em>'.
	 * @generated
	 */
	TypeDefMappingParam createTypeDefMappingParam();

	/**
	 * Returns a new object of class '<em>Use Case Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case Mapping Param</em>'.
	 * @generated
	 */
	UseCaseMappingParam createUseCaseMappingParam();

	/**
	 * Returns a new object of class '<em>Role Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Mapping Param</em>'.
	 * @generated
	 */
	RoleMappingParam createRoleMappingParam();

	/**
	 * Returns a new object of class '<em>Actor Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Mapping Param</em>'.
	 * @generated
	 */
	ActorMappingParam createActorMappingParam();

	/**
	 * Returns a new object of class '<em>Panel Def Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panel Def Use</em>'.
	 * @generated
	 */
	PanelDefUse createPanelDefUse();

	/**
	 * Returns a new object of class '<em>App Data Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Data Mapping PDef Val</em>'.
	 * @generated
	 */
	AppDataMappingPDefVal createAppDataMappingPDefVal();

	/**
	 * Returns a new object of class '<em>Type Def Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Def Mapping PDef Val</em>'.
	 * @generated
	 */
	TypeDefMappingPDefVal createTypeDefMappingPDefVal();

	/**
	 * Returns a new object of class '<em>UC Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UC Mapping PDef Val</em>'.
	 * @generated
	 */
	UCMappingPDefVal createUCMappingPDefVal();

	/**
	 * Returns a new object of class '<em>Role Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Mapping PDef Val</em>'.
	 * @generated
	 */
	RoleMappingPDefVal createRoleMappingPDefVal();

	/**
	 * Returns a new object of class '<em>Actor Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Mapping PDef Val</em>'.
	 * @generated
	 */
	ActorMappingPDefVal createActorMappingPDefVal();

	/**
	 * Returns a new object of class '<em>PDef Use Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDef Use Config</em>'.
	 * @generated
	 */
	PDefUseConfig createPDefUseConfig();

	/**
	 * Returns a new object of class '<em>Activation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Model</em>'.
	 * @generated
	 */
	ActivationModel createActivationModel();

	/**
	 * Returns a new object of class '<em>Activation Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Param</em>'.
	 * @generated
	 */
	ActivationParam createActivationParam();

	/**
	 * Returns a new object of class '<em>Begin Edit Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Begin Edit Command</em>'.
	 * @generated
	 */
	BeginEditCommand createBeginEditCommand();

	/**
	 * Returns a new object of class '<em>End Edit Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Edit Command</em>'.
	 * @generated
	 */
	EndEditCommand createEndEditCommand();

	/**
	 * Returns a new object of class '<em>Chk Edit Status Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chk Edit Status Command</em>'.
	 * @generated
	 */
	ChkEditStatusCommand createChkEditStatusCommand();

	/**
	 * Returns a new object of class '<em>Panel Def State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panel Def State</em>'.
	 * @generated
	 */
	PanelDefState createPanelDefState();

	/**
	 * Returns a new object of class '<em>PDef State Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDef State Command</em>'.
	 * @generated
	 */
	PDefStateCommand createPDefStateCommand();

	/**
	 * Returns a new object of class '<em>Panel Def States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panel Def States</em>'.
	 * @generated
	 */
	PanelDefStates createPanelDefStates();

	/**
	 * Returns a new object of class '<em>Table Customization Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Customization Param</em>'.
	 * @generated
	 */
	TableCustomizationParam createTableCustomizationParam();

	/**
	 * Returns a new object of class '<em>Extra Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra Column</em>'.
	 * @generated
	 */
	ExtraColumn createExtraColumn();

	/**
	 * Returns a new object of class '<em>Table Customization PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Customization PDef Val</em>'.
	 * @generated
	 */
	TableCustomizationPDefVal createTableCustomizationPDefVal();

	/**
	 * Returns a new object of class '<em>Custom Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Cartridge</em>'.
	 * @generated
	 */
	CustomCartridge createCustomCartridge();

	/**
	 * Returns a new object of class '<em>Custom Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Template</em>'.
	 * @generated
	 */
	CustomTemplate createCustomTemplate();

	/**
	 * Returns a new object of class '<em>Model Slot Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Slot Def</em>'.
	 * @generated
	 */
	ModelSlotDef createModelSlotDef();

	/**
	 * Returns a new object of class '<em>Model Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Slot</em>'.
	 * @generated
	 */
	ModelSlot createModelSlot();

	/**
	 * Returns a new object of class '<em>Clear Appdata Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Appdata Command</em>'.
	 * @generated
	 */
	ClearAppdataCommand createClearAppdataCommand();

	/**
	 * Returns a new object of class '<em>Map View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map View</em>'.
	 * @generated
	 */
	MapView createMapView();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Map Envelope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Envelope</em>'.
	 * @generated
	 */
	MapEnvelope createMapEnvelope();

	/**
	 * Returns a new object of class '<em>Portal Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portal Profile</em>'.
	 * @generated
	 */
	PortalProfile createPortalProfile();

	/**
	 * Returns a new object of class '<em>Std Web Resource Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Std Web Resource Module</em>'.
	 * @generated
	 */
	StdWebResourceModule createStdWebResourceModule();

	/**
	 * Returns a new object of class '<em>Repart Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repart Artifact</em>'.
	 * @generated
	 */
	RepartArtifact createRepartArtifact();

	/**
	 * Returns a new object of class '<em>Repart Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repart Module</em>'.
	 * @generated
	 */
	RepartModule createRepartModule();

	/**
	 * Returns a new object of class '<em>Breadcrumb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breadcrumb</em>'.
	 * @generated
	 */
	Breadcrumb createBreadcrumb();

	/**
	 * Returns a new object of class '<em>Map View Gadgets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map View Gadgets</em>'.
	 * @generated
	 */
	MapViewGadgets createMapViewGadgets();

	/**
	 * Returns a new object of class '<em>Portal Exposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portal Exposition</em>'.
	 * @generated
	 */
	PortalExposition createPortalExposition();

	/**
	 * Returns a new object of class '<em>CP Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP Command</em>'.
	 * @generated
	 */
	CPCommand createCPCommand();

	/**
	 * Returns a new object of class '<em>CP Commands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP Commands</em>'.
	 * @generated
	 */
	CPCommands createCPCommands();

	/**
	 * Returns a new object of class '<em>Security Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Profile</em>'.
	 * @generated
	 */
	SecurityProfile createSecurityProfile();

	/**
	 * Returns a new object of class '<em>External Authentication Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Authentication Guard</em>'.
	 * @generated
	 */
	ExternalAuthenticationGuard createExternalAuthenticationGuard();

	/**
	 * Returns a new object of class '<em>Internal Authentication Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Authentication Guard</em>'.
	 * @generated
	 */
	InternalAuthenticationGuard createInternalAuthenticationGuard();

	/**
	 * Returns a new object of class '<em>WAYF Request Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WAYF Request Adapter</em>'.
	 * @generated
	 */
	WAYFRequestAdapter createWAYFRequestAdapter();

	/**
	 * Returns a new object of class '<em>WAYF Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WAYF Profile</em>'.
	 * @generated
	 */
	WAYFProfile createWAYFProfile();

	/**
	 * Returns a new object of class '<em>Login UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login UI</em>'.
	 * @generated
	 */
	LoginUI createLoginUI();

	/**
	 * Returns a new object of class '<em>Login Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Module</em>'.
	 * @generated
	 */
	LoginModule createLoginModule();

	/**
	 * Returns a new object of class '<em>Identity Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Adapter</em>'.
	 * @generated
	 */
	IdentityAdapter createIdentityAdapter();

	/**
	 * Returns a new object of class '<em>Env Config Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Config Param</em>'.
	 * @generated
	 */
	EnvConfigParam createEnvConfigParam();

	/**
	 * Returns a new object of class '<em>Env Config Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Config Params</em>'.
	 * @generated
	 */
	EnvConfigParams createEnvConfigParams();

	/**
	 * Returns a new object of class '<em>PEP Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PEP Implementation</em>'.
	 * @generated
	 */
	PEPImplementation createPEPImplementation();

	/**
	 * Returns a new object of class '<em>Inline Code Snippet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Code Snippet</em>'.
	 * @generated
	 */
	InlineCodeSnippet createInlineCodeSnippet();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Annotation Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Detail</em>'.
	 * @generated
	 */
	AnnotationDetail createAnnotationDetail();

	/**
	 * Returns a new object of class '<em>Captcha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Captcha</em>'.
	 * @generated
	 */
	Captcha createCaptcha();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuigenPackage getGuigenPackage();

} //GuigenFactory
