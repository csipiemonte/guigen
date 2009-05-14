/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuigenFactoryImpl extends EFactoryImpl implements GuigenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GuigenFactory init() {
		try {
			GuigenFactory theGuigenFactory = (GuigenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.csi.it/mddtools"); 
			if (theGuigenFactory != null) {
				return theGuigenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GuigenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GuigenPackage.APPLICATION_AREA: return createApplicationArea();
			case GuigenPackage.MENUBAR: return createMenubar();
			case GuigenPackage.STATUSBAR: return createStatusbar();
			case GuigenPackage.TITLEBAR: return createTitlebar();
			case GuigenPackage.CONTENT_PANEL: return createContentPanel();
			case GuigenPackage.FORM_PANEL: return createFormPanel();
			case GuigenPackage.TAB_SET_PANEL: return createTabSetPanel();
			case GuigenPackage.COMMAND_WIDGET: return createCommandWidget();
			case GuigenPackage.DATA_WIDGET: return createDataWidget();
			case GuigenPackage.BUTTON: return createButton();
			case GuigenPackage.TEXT_FIELD: return createTextField();
			case GuigenPackage.TEXT_AREA: return createTextArea();
			case GuigenPackage.CALENDAR: return createCalendar();
			case GuigenPackage.COMBO_BOX: return createComboBox();
			case GuigenPackage.TABLE: return createTable();
			case GuigenPackage.CHECK_BOX: return createCheckBox();
			case GuigenPackage.GUI_MODEL: return createGUIModel();
			case GuigenPackage.GUI_STRUCTURE: return createGUIStructure();
			case GuigenPackage.GUI_BEHAVIORS: return createGUIBehaviors();
			case GuigenPackage.RADIO_BUTTONS: return createRadioButtons();
			case GuigenPackage.RADIO_BUTTON: return createRadioButton();
			case GuigenPackage.RESET_BUTTON: return createResetButton();
			case GuigenPackage.CONFIRM_BUTTON: return createConfirmButton();
			case GuigenPackage.HORIZONTAL_FLOW_PANEL_LAYOUT: return createHorizontalFlowPanelLayout();
			case GuigenPackage.VERTICAL_FLOW_PANEL_LAYOUT: return createVerticalFlowPanelLayout();
			case GuigenPackage.UDLRC_PANEL_LAYOUT: return createUDLRCPanelLayout();
			case GuigenPackage.UDLRC_WIDGET_LAYOUT_SPEC: return createUDLRCWidgetLayoutSpec();
			case GuigenPackage.IMAGE: return createImage();
			case GuigenPackage.MENU: return createMenu();
			case GuigenPackage.MENU_ITEM: return createMenuItem();
			case GuigenPackage.DISABLED_COMPONENT_SET: return createDisabledComponentSet();
			case GuigenPackage.COLUMN_MODEL: return createColumnModel();
			case GuigenPackage.COLUMN: return createColumn();
			case GuigenPackage.COMMAND_EVENT: return createCommandEvent();
			case GuigenPackage.ONOFF_COMMAND: return createONOFFCommand();
			case GuigenPackage.CUSTOM_COMMAND: return createCustomCommand();
			case GuigenPackage.VISIBILITY_COMMAND: return createVisibilityCommand();
			case GuigenPackage.REFRESH_VIEW_COMMAND: return createRefreshViewCommand();
			case GuigenPackage.JUMP_COMMAND: return createJumpCommand();
			case GuigenPackage.EXEC_COMMAND: return createExecCommand();
			case GuigenPackage.EVENT_HANDLER: return createEventHandler();
			case GuigenPackage.DIALOG_PANEL: return createDialogPanel();
			case GuigenPackage.SHOW_DIALOG_COMMAND: return createShowDialogCommand();
			case GuigenPackage.COMMAND_OUTCOME: return createCommandOutcome();
			case GuigenPackage.HEADER: return createHeader();
			case GuigenPackage.FOOTER: return createFooter();
			case GuigenPackage.APP_WINDOW: return createAppWindow();
			case GuigenPackage.STATIC_LINKS: return createStaticLinks();
			case GuigenPackage.SEQUENCE_COMMAND: return createSequenceCommand();
			case GuigenPackage.JUMP_BACK_COMMAND: return createJumpBackCommand();
			case GuigenPackage.APPLICATION_DATA: return createApplicationData();
			case GuigenPackage.APP_DATA_BINDING: return createAppDataBinding();
			case GuigenPackage.MULTI_DATA_WIDGET: return createMultiDataWidget();
			case GuigenPackage.TYPEDEFS: return createTypedefs();
			case GuigenPackage.SIMPLE_TYPE: return createSimpleType();
			case GuigenPackage.COMPLEX_TYPE: return createComplexType();
			case GuigenPackage.TYPED_ARRAY: return createTypedArray();
			case GuigenPackage.FIELD: return createField();
			case GuigenPackage.APPLICATION_DATA_DEFS: return createApplicationDataDefs();
			case GuigenPackage.TREE_VIEW: return createTreeView();
			case GuigenPackage.PLAIN_TEXT: return createPlainText();
			case GuigenPackage.MENU_VIEW: return createMenuView();
			case GuigenPackage.GRID_PANEL_LAYOUT: return createGridPanelLayout();
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC: return createGridWidgetLayoutSpec();
			case GuigenPackage.COMMAND_PANEL: return createCommandPanel();
			case GuigenPackage.MENU_PANEL: return createMenuPanel();
			case GuigenPackage.HIDDEN_VALUE: return createHiddenValue();
			case GuigenPackage.USER_DEFINED_WIDGET: return createUserDefinedWidget();
			case GuigenPackage.MULTI_PANEL: return createMultiPanel();
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND: return createActivateMultiPanelItemCommand();
			case GuigenPackage.UC_BASED_SECURITY_CONSTRAINT: return createUCBasedSecurityConstraint();
			case GuigenPackage.SECURITY_MODEL: return createSecurityModel();
			case GuigenPackage.ACTOR: return createActor();
			case GuigenPackage.USE_CASE: return createUseCase();
			case GuigenPackage.ACTOR_BASED_SECURITY_CONSTRAINT: return createActorBasedSecurityConstraint();
			case GuigenPackage.CUSTOM_SECURITY_CONSTRAINT: return createCustomSecurityConstraint();
			case GuigenPackage.OPAUTHSSO: return createOPAUTHSSO();
			case GuigenPackage.SSOBARTSSO: return createSSOBARTSSO();
			case GuigenPackage.CUSTOM_AUTHENTICATION: return createCustomAuthentication();
			case GuigenPackage.STD_MESSAGE_PANEL: return createStdMessagePanel();
			case GuigenPackage.JUMP_EXT_COMMAND: return createJumpExtCommand();
			case GuigenPackage.TARGET_PLATFORM: return createTargetPlatform();
			case GuigenPackage.USER_INFO_PANEL: return createUserInfoPanel();
			case GuigenPackage.USER_DEFINED_PANEL: return createUserDefinedPanel();
			case GuigenPackage.WIZARD_PANEL: return createWizardPanel();
			case GuigenPackage.APP_MODULE: return createAppModule();
			case GuigenPackage.TYPE_NAMESPACE: return createTypeNamespace();
			case GuigenPackage.APP_DATA_GROUP: return createAppDataGroup();
			case GuigenPackage.MSG_BOX_PANEL: return createMsgBoxPanel();
			case GuigenPackage.NOP_COMMAND: return createNOPCommand();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GuigenPackage.WIDGET_DATA_TYPE:
				return createWidgetDataTypeFromString(eDataType, initialValue);
			case GuigenPackage.UDLRC_SPEC_CONSTANTS:
				return createUDLRCSpecConstantsFromString(eDataType, initialValue);
			case GuigenPackage.EVENT_TYPES:
				return createEventTypesFromString(eDataType, initialValue);
			case GuigenPackage.DATA_LIFETIME_TYPE:
				return createDataLifetimeTypeFromString(eDataType, initialValue);
			case GuigenPackage.SIMPLE_TYPE_CODES:
				return createSimpleTypeCodesFromString(eDataType, initialValue);
			case GuigenPackage.PORTAL_NAMES:
				return createPortalNamesFromString(eDataType, initialValue);
			case GuigenPackage.TARGET_PLATFORM_CODES:
				return createTargetPlatformCodesFromString(eDataType, initialValue);
			case GuigenPackage.MESSAGE_SEVERITY:
				return createMessageSeverityFromString(eDataType, initialValue);
			case GuigenPackage.COMMAND_STYLES:
				return createCommandStylesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GuigenPackage.WIDGET_DATA_TYPE:
				return convertWidgetDataTypeToString(eDataType, instanceValue);
			case GuigenPackage.UDLRC_SPEC_CONSTANTS:
				return convertUDLRCSpecConstantsToString(eDataType, instanceValue);
			case GuigenPackage.EVENT_TYPES:
				return convertEventTypesToString(eDataType, instanceValue);
			case GuigenPackage.DATA_LIFETIME_TYPE:
				return convertDataLifetimeTypeToString(eDataType, instanceValue);
			case GuigenPackage.SIMPLE_TYPE_CODES:
				return convertSimpleTypeCodesToString(eDataType, instanceValue);
			case GuigenPackage.PORTAL_NAMES:
				return convertPortalNamesToString(eDataType, instanceValue);
			case GuigenPackage.TARGET_PLATFORM_CODES:
				return convertTargetPlatformCodesToString(eDataType, instanceValue);
			case GuigenPackage.MESSAGE_SEVERITY:
				return convertMessageSeverityToString(eDataType, instanceValue);
			case GuigenPackage.COMMAND_STYLES:
				return convertCommandStylesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationArea createApplicationArea() {
		ApplicationAreaImpl applicationArea = new ApplicationAreaImpl();
		return applicationArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menubar createMenubar() {
		MenubarImpl menubar = new MenubarImpl();
		return menubar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statusbar createStatusbar() {
		StatusbarImpl statusbar = new StatusbarImpl();
		return statusbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titlebar createTitlebar() {
		TitlebarImpl titlebar = new TitlebarImpl();
		return titlebar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPanel createContentPanel() {
		ContentPanelImpl contentPanel = new ContentPanelImpl();
		return contentPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormPanel createFormPanel() {
		FormPanelImpl formPanel = new FormPanelImpl();
		return formPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabSetPanel createTabSetPanel() {
		TabSetPanelImpl tabSetPanel = new TabSetPanelImpl();
		return tabSetPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandWidget createCommandWidget() {
		CommandWidgetImpl commandWidget = new CommandWidgetImpl();
		return commandWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWidget createDataWidget() {
		DataWidgetImpl dataWidget = new DataWidgetImpl();
		return dataWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea createTextArea() {
		TextAreaImpl textArea = new TextAreaImpl();
		return textArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIModel createGUIModel() {
		GUIModelImpl guiModel = new GUIModelImpl();
		return guiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIStructure createGUIStructure() {
		GUIStructureImpl guiStructure = new GUIStructureImpl();
		return guiStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIBehaviors createGUIBehaviors() {
		GUIBehaviorsImpl guiBehaviors = new GUIBehaviorsImpl();
		return guiBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButtons createRadioButtons() {
		RadioButtonsImpl radioButtons = new RadioButtonsImpl();
		return radioButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetButton createResetButton() {
		ResetButtonImpl resetButton = new ResetButtonImpl();
		return resetButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmButton createConfirmButton() {
		ConfirmButtonImpl confirmButton = new ConfirmButtonImpl();
		return confirmButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalFlowPanelLayout createHorizontalFlowPanelLayout() {
		HorizontalFlowPanelLayoutImpl horizontalFlowPanelLayout = new HorizontalFlowPanelLayoutImpl();
		return horizontalFlowPanelLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalFlowPanelLayout createVerticalFlowPanelLayout() {
		VerticalFlowPanelLayoutImpl verticalFlowPanelLayout = new VerticalFlowPanelLayoutImpl();
		return verticalFlowPanelLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDLRCPanelLayout createUDLRCPanelLayout() {
		UDLRCPanelLayoutImpl udlrcPanelLayout = new UDLRCPanelLayoutImpl();
		return udlrcPanelLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDLRCWidgetLayoutSpec createUDLRCWidgetLayoutSpec() {
		UDLRCWidgetLayoutSpecImpl udlrcWidgetLayoutSpec = new UDLRCWidgetLayoutSpecImpl();
		return udlrcWidgetLayoutSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabledComponentSet createDisabledComponentSet() {
		DisabledComponentSetImpl disabledComponentSet = new DisabledComponentSetImpl();
		return disabledComponentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnModel createColumnModel() {
		ColumnModelImpl columnModel = new ColumnModelImpl();
		return columnModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandEvent createCommandEvent() {
		CommandEventImpl commandEvent = new CommandEventImpl();
		return commandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONOFFCommand createONOFFCommand() {
		ONOFFCommandImpl onoffCommand = new ONOFFCommandImpl();
		return onoffCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCommand createCustomCommand() {
		CustomCommandImpl customCommand = new CustomCommandImpl();
		return customCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityCommand createVisibilityCommand() {
		VisibilityCommandImpl visibilityCommand = new VisibilityCommandImpl();
		return visibilityCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshViewCommand createRefreshViewCommand() {
		RefreshViewCommandImpl refreshViewCommand = new RefreshViewCommandImpl();
		return refreshViewCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpCommand createJumpCommand() {
		JumpCommandImpl jumpCommand = new JumpCommandImpl();
		return jumpCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecCommand createExecCommand() {
		ExecCommandImpl execCommand = new ExecCommandImpl();
		return execCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandler createEventHandler() {
		EventHandlerImpl eventHandler = new EventHandlerImpl();
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogPanel createDialogPanel() {
		DialogPanelImpl dialogPanel = new DialogPanelImpl();
		return dialogPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowDialogCommand createShowDialogCommand() {
		ShowDialogCommandImpl showDialogCommand = new ShowDialogCommandImpl();
		return showDialogCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandOutcome createCommandOutcome() {
		CommandOutcomeImpl commandOutcome = new CommandOutcomeImpl();
		return commandOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Footer createFooter() {
		FooterImpl footer = new FooterImpl();
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppWindow createAppWindow() {
		AppWindowImpl appWindow = new AppWindowImpl();
		return appWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticLinks createStaticLinks() {
		StaticLinksImpl staticLinks = new StaticLinksImpl();
		return staticLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceCommand createSequenceCommand() {
		SequenceCommandImpl sequenceCommand = new SequenceCommandImpl();
		return sequenceCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpBackCommand createJumpBackCommand() {
		JumpBackCommandImpl jumpBackCommand = new JumpBackCommandImpl();
		return jumpBackCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationData createApplicationData() {
		ApplicationDataImpl applicationData = new ApplicationDataImpl();
		return applicationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDataBinding createAppDataBinding() {
		AppDataBindingImpl appDataBinding = new AppDataBindingImpl();
		return appDataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiDataWidget createMultiDataWidget() {
		MultiDataWidgetImpl multiDataWidget = new MultiDataWidgetImpl();
		return multiDataWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Typedefs createTypedefs() {
		TypedefsImpl typedefs = new TypedefsImpl();
		return typedefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedArray createTypedArray() {
		TypedArrayImpl typedArray = new TypedArrayImpl();
		return typedArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataDefs createApplicationDataDefs() {
		ApplicationDataDefsImpl applicationDataDefs = new ApplicationDataDefsImpl();
		return applicationDataDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeView createTreeView() {
		TreeViewImpl treeView = new TreeViewImpl();
		return treeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainText createPlainText() {
		PlainTextImpl plainText = new PlainTextImpl();
		return plainText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuView createMenuView() {
		MenuViewImpl menuView = new MenuViewImpl();
		return menuView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridPanelLayout createGridPanelLayout() {
		GridPanelLayoutImpl gridPanelLayout = new GridPanelLayoutImpl();
		return gridPanelLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridWidgetLayoutSpec createGridWidgetLayoutSpec() {
		GridWidgetLayoutSpecImpl gridWidgetLayoutSpec = new GridWidgetLayoutSpecImpl();
		return gridWidgetLayoutSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPanel createCommandPanel() {
		CommandPanelImpl commandPanel = new CommandPanelImpl();
		return commandPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuPanel createMenuPanel() {
		MenuPanelImpl menuPanel = new MenuPanelImpl();
		return menuPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenValue createHiddenValue() {
		HiddenValueImpl hiddenValue = new HiddenValueImpl();
		return hiddenValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedWidget createUserDefinedWidget() {
		UserDefinedWidgetImpl userDefinedWidget = new UserDefinedWidgetImpl();
		return userDefinedWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPanel createMultiPanel() {
		MultiPanelImpl multiPanel = new MultiPanelImpl();
		return multiPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateMultiPanelItemCommand createActivateMultiPanelItemCommand() {
		ActivateMultiPanelItemCommandImpl activateMultiPanelItemCommand = new ActivateMultiPanelItemCommandImpl();
		return activateMultiPanelItemCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCBasedSecurityConstraint createUCBasedSecurityConstraint() {
		UCBasedSecurityConstraintImpl ucBasedSecurityConstraint = new UCBasedSecurityConstraintImpl();
		return ucBasedSecurityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModel createSecurityModel() {
		SecurityModelImpl securityModel = new SecurityModelImpl();
		return securityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorBasedSecurityConstraint createActorBasedSecurityConstraint() {
		ActorBasedSecurityConstraintImpl actorBasedSecurityConstraint = new ActorBasedSecurityConstraintImpl();
		return actorBasedSecurityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomSecurityConstraint createCustomSecurityConstraint() {
		CustomSecurityConstraintImpl customSecurityConstraint = new CustomSecurityConstraintImpl();
		return customSecurityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPAUTHSSO createOPAUTHSSO() {
		OPAUTHSSOImpl opauthsso = new OPAUTHSSOImpl();
		return opauthsso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSOBARTSSO createSSOBARTSSO() {
		SSOBARTSSOImpl ssobartsso = new SSOBARTSSOImpl();
		return ssobartsso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomAuthentication createCustomAuthentication() {
		CustomAuthenticationImpl customAuthentication = new CustomAuthenticationImpl();
		return customAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdMessagePanel createStdMessagePanel() {
		StdMessagePanelImpl stdMessagePanel = new StdMessagePanelImpl();
		return stdMessagePanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpExtCommand createJumpExtCommand() {
		JumpExtCommandImpl jumpExtCommand = new JumpExtCommandImpl();
		return jumpExtCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatform createTargetPlatform() {
		TargetPlatformImpl targetPlatform = new TargetPlatformImpl();
		return targetPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInfoPanel createUserInfoPanel() {
		UserInfoPanelImpl userInfoPanel = new UserInfoPanelImpl();
		return userInfoPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedPanel createUserDefinedPanel() {
		UserDefinedPanelImpl userDefinedPanel = new UserDefinedPanelImpl();
		return userDefinedPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPanel createWizardPanel() {
		WizardPanelImpl wizardPanel = new WizardPanelImpl();
		return wizardPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppModule createAppModule() {
		AppModuleImpl appModule = new AppModuleImpl();
		return appModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNamespace createTypeNamespace() {
		TypeNamespaceImpl typeNamespace = new TypeNamespaceImpl();
		return typeNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDataGroup createAppDataGroup() {
		AppDataGroupImpl appDataGroup = new AppDataGroupImpl();
		return appDataGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgBoxPanel createMsgBoxPanel() {
		MsgBoxPanelImpl msgBoxPanel = new MsgBoxPanelImpl();
		return msgBoxPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOPCommand createNOPCommand() {
		NOPCommandImpl nopCommand = new NOPCommandImpl();
		return nopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetDataType createWidgetDataTypeFromString(EDataType eDataType, String initialValue) {
		WidgetDataType result = WidgetDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWidgetDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDLRCSpecConstants createUDLRCSpecConstantsFromString(EDataType eDataType, String initialValue) {
		UDLRCSpecConstants result = UDLRCSpecConstants.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDLRCSpecConstantsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypes createEventTypesFromString(EDataType eDataType, String initialValue) {
		EventTypes result = EventTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLifetimeType createDataLifetimeTypeFromString(EDataType eDataType, String initialValue) {
		DataLifetimeType result = DataLifetimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataLifetimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeCodes createSimpleTypeCodesFromString(EDataType eDataType, String initialValue) {
		SimpleTypeCodes result = SimpleTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalNames createPortalNamesFromString(EDataType eDataType, String initialValue) {
		PortalNames result = PortalNames.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortalNamesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformCodes createTargetPlatformCodesFromString(EDataType eDataType, String initialValue) {
		TargetPlatformCodes result = TargetPlatformCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetPlatformCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSeverity createMessageSeverityFromString(EDataType eDataType, String initialValue) {
		MessageSeverity result = MessageSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandStyles createCommandStylesFromString(EDataType eDataType, String initialValue) {
		CommandStyles result = CommandStyles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandStylesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigenPackage getGuigenPackage() {
		return (GuigenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GuigenPackage getPackage() {
		return GuigenPackage.eINSTANCE;
	}

} //GuigenFactoryImpl
