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
			case GuigenPackage.ACTION_EVENT: return createActionEvent();
			case GuigenPackage.ONOFF_ACTION: return createONOFFAction();
			case GuigenPackage.CUSTOM_ACTION: return createCustomAction();
			case GuigenPackage.VISIBILITY_ACTION: return createVisibilityAction();
			case GuigenPackage.REFRESH_VIEW_ACTION: return createRefreshViewAction();
			case GuigenPackage.JUMP_ACTION: return createJumpAction();
			case GuigenPackage.EXEC_ACTION: return createExecAction();
			case GuigenPackage.EVENT_HANDLER: return createEventHandler();
			case GuigenPackage.DIALOG_PANEL: return createDialogPanel();
			case GuigenPackage.SHOW_DIALOG_ACTION: return createShowDialogAction();
			case GuigenPackage.ACTION_RESULT: return createActionResult();
			case GuigenPackage.HEADER: return createHeader();
			case GuigenPackage.FOOTER: return createFooter();
			case GuigenPackage.APP_WINDOW: return createAppWindow();
			case GuigenPackage.STATIC_LINKS: return createStaticLinks();
			case GuigenPackage.SEQUENCE_ACTION: return createSequenceAction();
			case GuigenPackage.JUMP_BACK_ACTION: return createJumpBackAction();
			case GuigenPackage.APPLICATION_DATA: return createApplicationData();
			case GuigenPackage.APP_DATA_BINDING: return createAppDataBinding();
			case GuigenPackage.MULTI_DATA_WIDGET: return createMultiDataWidget();
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
	public ActionEvent createActionEvent() {
		ActionEventImpl actionEvent = new ActionEventImpl();
		return actionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONOFFAction createONOFFAction() {
		ONOFFActionImpl onoffAction = new ONOFFActionImpl();
		return onoffAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomAction createCustomAction() {
		CustomActionImpl customAction = new CustomActionImpl();
		return customAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityAction createVisibilityAction() {
		VisibilityActionImpl visibilityAction = new VisibilityActionImpl();
		return visibilityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshViewAction createRefreshViewAction() {
		RefreshViewActionImpl refreshViewAction = new RefreshViewActionImpl();
		return refreshViewAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpAction createJumpAction() {
		JumpActionImpl jumpAction = new JumpActionImpl();
		return jumpAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecAction createExecAction() {
		ExecActionImpl execAction = new ExecActionImpl();
		return execAction;
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
	public ShowDialogAction createShowDialogAction() {
		ShowDialogActionImpl showDialogAction = new ShowDialogActionImpl();
		return showDialogAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionResult createActionResult() {
		ActionResultImpl actionResult = new ActionResultImpl();
		return actionResult;
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
	public SequenceAction createSequenceAction() {
		SequenceActionImpl sequenceAction = new SequenceActionImpl();
		return sequenceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpBackAction createJumpBackAction() {
		JumpBackActionImpl jumpBackAction = new JumpBackActionImpl();
		return jumpBackAction;
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
