/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.guigen.GuigenFactory
 * @model kind="package"
 * @generated
 */
public interface GuigenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "guigen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "guigen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuigenPackage eINSTANCE = it.csi.mddtools.guigen.impl.GuigenPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ApplicationAreaImpl <em>Application Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ApplicationAreaImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationArea()
	 * @generated
	 */
	int APPLICATION_AREA = 0;

	/**
	 * The feature id for the '<em><b>Menubar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__MENUBAR = 0;

	/**
	 * The feature id for the '<em><b>Titlebar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__TITLEBAR = 1;

	/**
	 * The feature id for the '<em><b>Statusbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__STATUSBAR = 2;

	/**
	 * The feature id for the '<em><b>Content Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__CONTENT_PANELS = 3;

	/**
	 * The feature id for the '<em><b>Static Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__STATIC_LINKS = 4;

	/**
	 * The feature id for the '<em><b>On Init Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__ON_INIT_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__MODULES = 6;

	/**
	 * The number of structural features of the '<em>Application Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenubarImpl <em>Menubar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenubarImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenubar()
	 * @generated
	 */
	int MENUBAR = 1;

	/**
	 * The feature id for the '<em><b>Top Level Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUBAR__TOP_LEVEL_MENU = 0;

	/**
	 * The number of structural features of the '<em>Menubar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUBAR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.StatusbarImpl <em>Statusbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.StatusbarImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStatusbar()
	 * @generated
	 */
	int STATUSBAR = 2;

	/**
	 * The number of structural features of the '<em>Statusbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSBAR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TitlebarImpl <em>Titlebar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TitlebarImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTitlebar()
	 * @generated
	 */
	int TITLEBAR = 3;

	/**
	 * The number of structural features of the '<em>Titlebar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLEBAR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ContentPanelImpl <em>Content Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ContentPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getContentPanel()
	 * @generated
	 */
	int CONTENT_PANEL = 4;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__PANELS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>App Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__APP_DATA = 2;

	/**
	 * The feature id for the '<em><b>On Refresh Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__ON_REFRESH_COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Dialogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__DIALOGS = 4;

	/**
	 * The number of structural features of the '<em>Content Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__LAYOUT_SPEC = 3;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.FormPanelImpl <em>Form Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.FormPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFormPanel()
	 * @generated
	 */
	int FORM_PANEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Subpanels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__SUBPANELS = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__WIDGETS = PANEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Form Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TabSetPanelImpl <em>Tab Set Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TabSetPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTabSetPanel()
	 * @generated
	 */
	int TAB_SET_PANEL = 6;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 8;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandWidgetImpl <em>Command Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandWidget()
	 * @generated
	 */
	int COMMAND_WIDGET = 9;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.DataWidgetImpl <em>Data Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.DataWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDataWidget()
	 * @generated
	 */
	int DATA_WIDGET = 10;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 11;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TextFieldImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 12;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TextAreaImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 13;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CalendarImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 14;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ComboBoxImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 15;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TableImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 16;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CheckBoxImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 17;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GUIModelImpl <em>GUI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GUIModelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIModel()
	 * @generated
	 */
	int GUI_MODEL = 18;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GUIStructureImpl <em>GUI Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GUIStructureImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIStructure()
	 * @generated
	 */
	int GUI_STRUCTURE = 19;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GUIBehaviorsImpl <em>GUI Behaviors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GUIBehaviorsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIBehaviors()
	 * @generated
	 */
	int GUI_BEHAVIORS = 20;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RadioButtonsImpl <em>Radio Buttons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RadioButtonsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRadioButtons()
	 * @generated
	 */
	int RADIO_BUTTONS = 21;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RadioButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 22;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ResetButtonImpl <em>Reset Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ResetButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getResetButton()
	 * @generated
	 */
	int RESET_BUTTON = 23;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ConfirmButtonImpl <em>Confirm Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ConfirmButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getConfirmButton()
	 * @generated
	 */
	int CONFIRM_BUTTON = 24;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelLayoutImpl <em>Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelLayout()
	 * @generated
	 */
	int PANEL_LAYOUT = 25;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.HorizontalFlowPanelLayoutImpl <em>Horizontal Flow Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.HorizontalFlowPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHorizontalFlowPanelLayout()
	 * @generated
	 */
	int HORIZONTAL_FLOW_PANEL_LAYOUT = 26;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.VerticalFlowPanelLayoutImpl <em>Vertical Flow Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.VerticalFlowPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVerticalFlowPanelLayout()
	 * @generated
	 */
	int VERTICAL_FLOW_PANEL_LAYOUT = 27;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UDLRCPanelLayoutImpl <em>UDLRC Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UDLRCPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCPanelLayout()
	 * @generated
	 */
	int UDLRC_PANEL_LAYOUT = 28;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WidgetLayoutSpecifierImpl <em>Widget Layout Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WidgetLayoutSpecifierImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetLayoutSpecifier()
	 * @generated
	 */
	int WIDGET_LAYOUT_SPECIFIER = 29;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UDLRCWidgetLayoutSpecImpl <em>UDLRC Widget Layout Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UDLRCWidgetLayoutSpecImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCWidgetLayoutSpec()
	 * @generated
	 */
	int UDLRC_WIDGET_LAYOUT_SPEC = 30;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ImageImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 31;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 32;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuItemImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 33;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.DisabledComponentSetImpl <em>Disabled Component Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.DisabledComponentSetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDisabledComponentSet()
	 * @generated
	 */
	int DISABLED_COMPONENT_SET = 34;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ColumnModelImpl <em>Column Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ColumnModelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getColumnModel()
	 * @generated
	 */
	int COLUMN_MODEL = 35;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ColumnImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 36;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 37;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandEventImpl <em>Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandEventImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandEvent()
	 * @generated
	 */
	int COMMAND_EVENT = 38;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ONOFFCommandImpl <em>ONOFF Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ONOFFCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getONOFFCommand()
	 * @generated
	 */
	int ONOFF_COMMAND = 39;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CustomCommandImpl <em>Custom Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CustomCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomCommand()
	 * @generated
	 */
	int CUSTOM_COMMAND = 40;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.VisibilityCommandImpl <em>Visibility Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.VisibilityCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVisibilityCommand()
	 * @generated
	 */
	int VISIBILITY_COMMAND = 41;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RefreshViewCommandImpl <em>Refresh View Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RefreshViewCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRefreshViewCommand()
	 * @generated
	 */
	int REFRESH_VIEW_COMMAND = 42;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.JumpCommandImpl <em>Jump Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.JumpCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpCommand()
	 * @generated
	 */
	int JUMP_COMMAND = 43;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ExecCommandImpl <em>Exec Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ExecCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExecCommand()
	 * @generated
	 */
	int EXEC_COMMAND = 44;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.EventHandlerImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 45;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.WidgetTargetAction <em>Widget Target Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.WidgetTargetAction
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetTargetAction()
	 * @generated
	 */
	int WIDGET_TARGET_ACTION = 46;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandOnWidgetsImpl <em>Command On Widgets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandOnWidgetsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOnWidgets()
	 * @generated
	 */
	int COMMAND_ON_WIDGETS = 47;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.DialogPanelImpl <em>Dialog Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.DialogPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDialogPanel()
	 * @generated
	 */
	int DIALOG_PANEL = 48;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ShowDialogCommandImpl <em>Show Dialog Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ShowDialogCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getShowDialogCommand()
	 * @generated
	 */
	int SHOW_DIALOG_COMMAND = 49;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandOutcomeImpl <em>Command Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandOutcomeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOutcome()
	 * @generated
	 */
	int COMMAND_OUTCOME = 50;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandOnPanelsImpl <em>Command On Panels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandOnPanelsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOnPanels()
	 * @generated
	 */
	int COMMAND_ON_PANELS = 51;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.HeaderImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 52;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.FooterImpl <em>Footer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.FooterImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFooter()
	 * @generated
	 */
	int FOOTER = 53;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppWindowImpl <em>App Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppWindowImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppWindow()
	 * @generated
	 */
	int APP_WINDOW = 54;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.StaticLinksImpl <em>Static Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.StaticLinksImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStaticLinks()
	 * @generated
	 */
	int STATIC_LINKS = 55;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SequenceCommandImpl <em>Sequence Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SequenceCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSequenceCommand()
	 * @generated
	 */
	int SEQUENCE_COMMAND = 56;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.JumpBackCommandImpl <em>Jump Back Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.JumpBackCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpBackCommand()
	 * @generated
	 */
	int JUMP_BACK_COMMAND = 57;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ApplicationDataImpl <em>Application Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ApplicationDataImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationData()
	 * @generated
	 */
	int APPLICATION_DATA = 58;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppDataBindingImpl <em>App Data Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppDataBindingImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataBinding()
	 * @generated
	 */
	int APP_DATA_BINDING = 59;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MultiDataWidgetImpl <em>Multi Data Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MultiDataWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMultiDataWidget()
	 * @generated
	 */
	int MULTI_DATA_WIDGET = 60;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypedefsImpl <em>Typedefs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypedefsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypedefs()
	 * @generated
	 */
	int TYPEDEFS = 61;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 62;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SimpleTypeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 63;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ComplexTypeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 64;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypedArrayImpl <em>Typed Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypedArrayImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypedArray()
	 * @generated
	 */
	int TYPED_ARRAY = 65;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.FieldImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 66;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl <em>Application Data Defs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationDataDefs()
	 * @generated
	 */
	int APPLICATION_DATA_DEFS = 67;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TreeViewImpl <em>Tree View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TreeViewImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTreeView()
	 * @generated
	 */
	int TREE_VIEW = 68;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PlainTextImpl <em>Plain Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PlainTextImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPlainText()
	 * @generated
	 */
	int PLAIN_TEXT = 69;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuViewImpl <em>Menu View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuViewImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuView()
	 * @generated
	 */
	int MENU_VIEW = 70;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GridPanelLayoutImpl <em>Grid Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GridPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGridPanelLayout()
	 * @generated
	 */
	int GRID_PANEL_LAYOUT = 71;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl <em>Grid Widget Layout Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGridWidgetLayoutSpec()
	 * @generated
	 */
	int GRID_WIDGET_LAYOUT_SPEC = 72;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandPanelImpl <em>Command Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandPanel()
	 * @generated
	 */
	int COMMAND_PANEL = 73;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuPanelImpl <em>Menu Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuPanel()
	 * @generated
	 */
	int MENU_PANEL = 74;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.HiddenValueImpl <em>Hidden Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.HiddenValueImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHiddenValue()
	 * @generated
	 */
	int HIDDEN_VALUE = 75;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UserDefinedWidgetImpl <em>User Defined Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UserDefinedWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserDefinedWidget()
	 * @generated
	 */
	int USER_DEFINED_WIDGET = 76;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MultiPanelImpl <em>Multi Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MultiPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMultiPanel()
	 * @generated
	 */
	int MULTI_PANEL = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PANEL__PANELS = PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__NAME = MULTI_PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__LABEL = MULTI_PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__LAYOUT = MULTI_PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__LAYOUT_SPEC = MULTI_PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__PANELS = MULTI_PANEL__PANELS;

	/**
	 * The number of structural features of the '<em>Tab Set Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL_FEATURE_COUNT = MULTI_PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LAYOUT_SPEC = 2;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__EVENT_HANDLERS = 3;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__SECURITY_CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DEFAULT_VISIBLE = 5;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DEFAULT_ENABLED = 6;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The number of structural features of the '<em>Command Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__DATA_TYPE_MODIFIER = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__DATABINDING = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__DATA_TYPE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__REQUIRED = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = COMMAND_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = COMMAND_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_SPEC = COMMAND_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__EVENT_HANDLERS = COMMAND_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SECURITY_CONSTRAINTS = COMMAND_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DEFAULT_VISIBLE = COMMAND_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DEFAULT_ENABLED = COMMAND_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE = COMMAND_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = COMMAND_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Field Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__FIELD_LENGTH = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ROWS = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__COLUMNS = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__MULTI_DATA_BINDING = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__KEY_SELECTOR = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__VALUE_SELECTOR = DATA_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MULTI_DATA_BINDING = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN_MODEL = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PAGE_SIZE = DATA_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENABLE_EXPORT = DATA_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Custom Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CUSTOM_DECORATOR = DATA_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Beahviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__BEAHVIORS = 1;

	/**
	 * The feature id for the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__COD_PRODOTTO = 2;

	/**
	 * The feature id for the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__COD_COMPONENTE = 3;

	/**
	 * The feature id for the '<em><b>Versione Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__VERSIONE_PRODOTTO = 4;

	/**
	 * The feature id for the '<em><b>Versione Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__VERSIONE_COMPONENTE = 5;

	/**
	 * The feature id for the '<em><b>Typedefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__TYPEDEFS = 6;

	/**
	 * The feature id for the '<em><b>App Data Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__APP_DATA_DEFS = 7;

	/**
	 * The feature id for the '<em><b>Portale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__PORTALE = 8;

	/**
	 * The feature id for the '<em><b>Security Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__SECURITY_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Target Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__TARGET_PLATFORM = 10;

	/**
	 * The number of structural features of the '<em>GUI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL_FEATURE_COUNT = 11;

	/**
	 * The feature id for the '<em><b>App Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_STRUCTURE__APP_WINDOW = 0;

	/**
	 * The number of structural features of the '<em>GUI Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>GUI Behaviors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_BEHAVIORS_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__RADIO = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Buttons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__LAYOUT_SPEC = BUTTON__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__EVENT_HANDLERS = BUTTON__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__SECURITY_CONSTRAINTS = BUTTON__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__DEFAULT_VISIBLE = BUTTON__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__DEFAULT_ENABLED = BUTTON__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__IMAGE = BUTTON__IMAGE;

	/**
	 * The number of structural features of the '<em>Reset Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__LAYOUT_SPEC = BUTTON__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__EVENT_HANDLERS = BUTTON__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__SECURITY_CONSTRAINTS = BUTTON__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__DEFAULT_VISIBLE = BUTTON__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__DEFAULT_ENABLED = BUTTON__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__IMAGE = BUTTON__IMAGE;

	/**
	 * The number of structural features of the '<em>Confirm Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_LAYOUT_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Horizontal Flow Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_FLOW_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vertical Flow Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FLOW_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UDLRC Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDLRC_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Layout Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDLRC_WIDGET_LAYOUT_SPEC__VALUE = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UDLRC Widget Layout Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDLRC_WIDGET_LAYOUT_SPEC_FEATURE_COUNT = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMAGE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ITEM = 2;

	/**
	 * The feature id for the '<em><b>Submenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__SUBMENU = 3;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__SECURITY_CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Event Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__EVENT_HANDLER = 5;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Event Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__EVENT_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__SECURITY_CONSTRAINTS = 3;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Disabled Component Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLED_COMPONENT_SET_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MODEL__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MODEL__VALUE_SELECTOR = 1;

	/**
	 * The number of structural features of the '<em>Column Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MODEL_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SORTABLE = 2;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__EDITABLE = 3;

	/**
	 * The feature id for the '<em><b>Event Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__EVENT_ACTIVE = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_COMMAND__TARGET_WIDGETS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_COMMAND__ENABLE = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ONOFF Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_COMMAND__TARGET_WIDGETS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_COMMAND__SHOW = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visibility Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_COMMAND__TARGET_WIDGETS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Panels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_COMMAND__TARGET_PANELS = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refresh View Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jump To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_COMMAND__JUMP_TO = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Push Current Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_COMMAND__PUSH_CURRENT_PAGE = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jump Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND__RESULTS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND__METHOD_NAME = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post Exec Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND__POST_EXEC_DATA = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exec Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Skip Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__SKIP_VALIDATION = 2;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Widget Target Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TARGET_ACTION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ON_WIDGETS__TARGET_WIDGETS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command On Widgets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ON_WIDGETS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__COMMANDS = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__MSG_BOXES = PANEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dialog Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dialog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_DIALOG_COMMAND__DIALOG = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Show Dialog Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_DIALOG_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OUTCOME__RESULT_CODE = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OUTCOME__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Command Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OUTCOME_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Target Panels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ON_PANELS__TARGET_PANELS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command On Panels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ON_PANELS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cod Canale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COD_CANALE = 0;

	/**
	 * The feature id for the '<em><b>Cod Applicativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COD_APPLICATIVO = 1;

	/**
	 * The feature id for the '<em><b>Nome Canale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NOME_CANALE = 2;

	/**
	 * The feature id for the '<em><b>Link Canale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__LINK_CANALE = 3;

	/**
	 * The feature id for the '<em><b>Nome Applicativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NOME_APPLICATIVO = 4;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 5;

	/**
	 * The number of structural features of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_WINDOW__FOOTER = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_WINDOW__HEADER = 1;

	/**
	 * The feature id for the '<em><b>App Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_WINDOW__APP_AREA = 2;

	/**
	 * The number of structural features of the '<em>App Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_WINDOW_FEATURE_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Static Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_LINKS_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COMMAND__COMMANDS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jump Back Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_BACK_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lifetime Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA__LIFETIME_EXTENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Application Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>App Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_BINDING__APP_DATA = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_BINDING__PATH = 1;

	/**
	 * The number of structural features of the '<em>App Data Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_BINDING_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__MULTI_DATA_BINDING = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Data Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEFS__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEFS__NAMESPACES = 1;

	/**
	 * The number of structural features of the '<em>Typedefs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEFS_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__CODE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NILLABLE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__FIELDS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__INIT_FIELDS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY__COMPONENT_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATA_TYPE_MODIFIER = 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>App Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_DEFS__APP_DATA = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_DEFS__GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Application Data Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_DEFS_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__MULTI_DATA_BINDING = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tree View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Static Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__STATIC_TEXT = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plain Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__NAME = COMMAND_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__LABEL = COMMAND_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__LAYOUT_SPEC = COMMAND_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__EVENT_HANDLERS = COMMAND_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__SECURITY_CONSTRAINTS = COMMAND_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__DEFAULT_VISIBLE = COMMAND_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__DEFAULT_ENABLED = COMMAND_WIDGET__DEFAULT_ENABLED;

	/**
	 * The number of structural features of the '<em>Menu View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW_FEATURE_COUNT = COMMAND_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PANEL_LAYOUT__COLUMNS = PANEL_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PANEL_LAYOUT__ROWS = PANEL_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Grid Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_WIDGET_LAYOUT_SPEC__ROW = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_WIDGET_LAYOUT_SPEC__COLUMN = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_WIDGET_LAYOUT_SPEC__HSPAN = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Grid Widget Layout Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_WIDGET_LAYOUT_SPEC_FEATURE_COUNT = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__NAME = FORM_PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__LABEL = FORM_PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__LAYOUT = FORM_PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__LAYOUT_SPEC = FORM_PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Subpanels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__SUBPANELS = FORM_PANEL__SUBPANELS;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__WIDGETS = FORM_PANEL__WIDGETS;

	/**
	 * The feature id for the '<em><b>Cmd Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__CMD_STYLE = FORM_PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL_FEATURE_COUNT = FORM_PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__NAME = FORM_PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__LABEL = FORM_PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__LAYOUT = FORM_PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__LAYOUT_SPEC = FORM_PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Subpanels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__SUBPANELS = FORM_PANEL__SUBPANELS;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__WIDGETS = FORM_PANEL__WIDGETS;

	/**
	 * The number of structural features of the '<em>Menu Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL_FEATURE_COUNT = FORM_PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The number of structural features of the '<em>Hidden Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The number of structural features of the '<em>User Defined Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActivateMultiPanelItemCommandImpl <em>Activate Multi Panel Item Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActivateMultiPanelItemCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActivateMultiPanelItemCommand()
	 * @generated
	 */
	int ACTIVATE_MULTI_PANEL_ITEM_COMMAND = 78;

	/**
	 * The feature id for the '<em><b>Multipanel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activate Multi Panel Item Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_MULTI_PANEL_ITEM_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AutenticationMethodImpl <em>Autentication Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AutenticationMethodImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAutenticationMethod()
	 * @generated
	 */
	int AUTENTICATION_METHOD = 79;

	/**
	 * The number of structural features of the '<em>Autentication Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICATION_METHOD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UISecurityConstraintImpl <em>UI Security Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UISecurityConstraintImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUISecurityConstraint()
	 * @generated
	 */
	int UI_SECURITY_CONSTRAINT = 80;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SECURITY_CONSTRAINT__VISIBLE = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SECURITY_CONSTRAINT__ENABLED = 1;

	/**
	 * The number of structural features of the '<em>UI Security Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SECURITY_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UCBasedSecurityConstraintImpl <em>UC Based Security Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UCBasedSecurityConstraintImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUCBasedSecurityConstraint()
	 * @generated
	 */
	int UC_BASED_SECURITY_CONSTRAINT = 81;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_BASED_SECURITY_CONSTRAINT__VISIBLE = UI_SECURITY_CONSTRAINT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_BASED_SECURITY_CONSTRAINT__ENABLED = UI_SECURITY_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_BASED_SECURITY_CONSTRAINT__USE_CASE = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UC Based Security Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_BASED_SECURITY_CONSTRAINT_FEATURE_COUNT = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SecurityModelImpl <em>Security Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SecurityModelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSecurityModel()
	 * @generated
	 */
	int SECURITY_MODEL = 82;

	/**
	 * The feature id for the '<em><b>Autentication Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__AUTENTICATION_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__USE_CASES = 2;

	/**
	 * The feature id for the '<em><b>Security App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITY_APP_ID = 3;

	/**
	 * The number of structural features of the '<em>Security Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActorImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 83;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CODE = 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UseCaseImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 84;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PERMISSION = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActorBasedSecurityConstraintImpl <em>Actor Based Security Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActorBasedSecurityConstraintImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActorBasedSecurityConstraint()
	 * @generated
	 */
	int ACTOR_BASED_SECURITY_CONSTRAINT = 85;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_BASED_SECURITY_CONSTRAINT__VISIBLE = UI_SECURITY_CONSTRAINT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_BASED_SECURITY_CONSTRAINT__ENABLED = UI_SECURITY_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_BASED_SECURITY_CONSTRAINT__ACTOR = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Based Security Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_BASED_SECURITY_CONSTRAINT_FEATURE_COUNT = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CustomSecurityConstraintImpl <em>Custom Security Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CustomSecurityConstraintImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomSecurityConstraint()
	 * @generated
	 */
	int CUSTOM_SECURITY_CONSTRAINT = 86;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_CONSTRAINT__VISIBLE = UI_SECURITY_CONSTRAINT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_CONSTRAINT__ENABLED = UI_SECURITY_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Method Name Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Security Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_CONSTRAINT_FEATURE_COUNT = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.OPAUTHSSOImpl <em>OPAUTHSSO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.OPAUTHSSOImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getOPAUTHSSO()
	 * @generated
	 */
	int OPAUTHSSO = 87;

	/**
	 * The feature id for the '<em><b>Min Auth Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAUTHSSO__MIN_AUTH_LEVEL = AUTENTICATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OPAUTHSSO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAUTHSSO_FEATURE_COUNT = AUTENTICATION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SSOBARTSSOImpl <em>SSOBARTSSO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SSOBARTSSOImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSSOBARTSSO()
	 * @generated
	 */
	int SSOBARTSSO = 88;

	/**
	 * The number of structural features of the '<em>SSOBARTSSO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSOBARTSSO_FEATURE_COUNT = AUTENTICATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CustomAuthenticationImpl <em>Custom Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CustomAuthenticationImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomAuthentication()
	 * @generated
	 */
	int CUSTOM_AUTHENTICATION = 89;

	/**
	 * The number of structural features of the '<em>Custom Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_AUTHENTICATION_FEATURE_COUNT = AUTENTICATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.StdMessagePanelImpl <em>Std Message Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.StdMessagePanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStdMessagePanel()
	 * @generated
	 */
	int STD_MESSAGE_PANEL = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Show Global Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Field Error Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS = PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Field Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS = PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Std Message Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.JumpExtCommandImpl <em>Jump Ext Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.JumpExtCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpExtCommand()
	 * @generated
	 */
	int JUMP_EXT_COMMAND = 91;

	/**
	 * The feature id for the '<em><b>Static Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EXT_COMMAND__STATIC_URL = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime Url Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EXT_COMMAND__LOCATION_CODE = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Jump Ext Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EXT_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl <em>Target Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TargetPlatformImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTargetPlatform()
	 * @generated
	 */
	int TARGET_PLATFORM = 92;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__CODE = 0;

	/**
	 * The number of structural features of the '<em>Target Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UserInfoPanelImpl <em>User Info Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UserInfoPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserInfoPanel()
	 * @generated
	 */
	int USER_INFO_PANEL = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The number of structural features of the '<em>User Info Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UserDefinedPanelImpl <em>User Defined Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UserDefinedPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserDefinedPanel()
	 * @generated
	 */
	int USER_DEFINED_PANEL = 94;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The number of structural features of the '<em>User Defined Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WizardPanelImpl <em>Wizard Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WizardPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWizardPanel()
	 * @generated
	 */
	int WIZARD_PANEL = 95;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__NAME = MULTI_PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__LABEL = MULTI_PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__LAYOUT = MULTI_PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__LAYOUT_SPEC = MULTI_PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__PANELS = MULTI_PANEL__PANELS;

	/**
	 * The number of structural features of the '<em>Wizard Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL_FEATURE_COUNT = MULTI_PANEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppModuleImpl <em>App Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppModuleImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppModule()
	 * @generated
	 */
	int APP_MODULE = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MODULE__CONTENT_PANELS = 1;

	/**
	 * The number of structural features of the '<em>App Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MODULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypeNamespaceImpl <em>Type Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypeNamespaceImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeNamespace()
	 * @generated
	 */
	int TYPE_NAMESPACE = 97;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAMESPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAMESPACE__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Type Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAMESPACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppDataGroupImpl <em>App Data Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppDataGroupImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataGroup()
	 * @generated
	 */
	int APP_DATA_GROUP = 98;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>App Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_GROUP__APP_DATA = 1;

	/**
	 * The number of structural features of the '<em>App Data Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MsgBoxPanelImpl <em>Msg Box Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MsgBoxPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMsgBoxPanel()
	 * @generated
	 */
	int MSG_BOX_PANEL = 99;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Message Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__MESSAGE_SEVERITY = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__TEXT_MESSAGES = PANEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Msg Box Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.NOPCommandImpl <em>NOP Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.NOPCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getNOPCommand()
	 * @generated
	 */
	int NOP_COMMAND = 100;

	/**
	 * The number of structural features of the '<em>NOP Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOP_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WidgetsPanelImpl <em>Widgets Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WidgetsPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetsPanel()
	 * @generated
	 */
	int WIDGETS_PANEL = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__WIDGETS = PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widgets Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.WidgetDataType <em>Widget Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.WidgetDataType
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetDataType()
	 * @generated
	 */
	int WIDGET_DATA_TYPE = 102;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.UDLRCSpecConstants <em>UDLRC Spec Constants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.UDLRCSpecConstants
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCSpecConstants()
	 * @generated
	 */
	int UDLRC_SPEC_CONSTANTS = 103;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.EventTypes <em>Event Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEventTypes()
	 * @generated
	 */
	int EVENT_TYPES = 104;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.DataLifetimeType <em>Data Lifetime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.DataLifetimeType
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDataLifetimeType()
	 * @generated
	 */
	int DATA_LIFETIME_TYPE = 105;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.SimpleTypeCodes <em>Simple Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.SimpleTypeCodes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSimpleTypeCodes()
	 * @generated
	 */
	int SIMPLE_TYPE_CODES = 106;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.PortalNames <em>Portal Names</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.PortalNames
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPortalNames()
	 * @generated
	 */
	int PORTAL_NAMES = 107;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.TargetPlatformCodes <em>Target Platform Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.TargetPlatformCodes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTargetPlatformCodes()
	 * @generated
	 */
	int TARGET_PLATFORM_CODES = 108;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.MessageSeverity <em>Message Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.MessageSeverity
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMessageSeverity()
	 * @generated
	 */
	int MESSAGE_SEVERITY = 109;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.CommandStyles <em>Command Styles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.CommandStyles
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandStyles()
	 * @generated
	 */
	int COMMAND_STYLES = 110;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ApplicationArea <em>Application Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Area</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea
	 * @generated
	 */
	EClass getApplicationArea();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ApplicationArea#getMenubar <em>Menubar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menubar</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getMenubar()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_Menubar();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ApplicationArea#getTitlebar <em>Titlebar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titlebar</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getTitlebar()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_Titlebar();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ApplicationArea#getStatusbar <em>Statusbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statusbar</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getStatusbar()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_Statusbar();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ApplicationArea#getContentPanels <em>Content Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Panels</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getContentPanels()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_ContentPanels();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ApplicationArea#getStaticLinks <em>Static Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Links</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getStaticLinks()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_StaticLinks();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ApplicationArea#getOnInitCommand <em>On Init Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Init Command</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getOnInitCommand()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_OnInitCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ApplicationArea#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getModules()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_Modules();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Menubar <em>Menubar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menubar</em>'.
	 * @see it.csi.mddtools.guigen.Menubar
	 * @generated
	 */
	EClass getMenubar();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Menubar#getTopLevelMenu <em>Top Level Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Menu</em>'.
	 * @see it.csi.mddtools.guigen.Menubar#getTopLevelMenu()
	 * @see #getMenubar()
	 * @generated
	 */
	EReference getMenubar_TopLevelMenu();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Statusbar <em>Statusbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statusbar</em>'.
	 * @see it.csi.mddtools.guigen.Statusbar
	 * @generated
	 */
	EClass getStatusbar();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Titlebar <em>Titlebar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titlebar</em>'.
	 * @see it.csi.mddtools.guigen.Titlebar
	 * @generated
	 */
	EClass getTitlebar();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ContentPanel <em>Content Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Panel</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel
	 * @generated
	 */
	EClass getContentPanel();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ContentPanel#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Panels</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getPanels()
	 * @see #getContentPanel()
	 * @generated
	 */
	EReference getContentPanel_Panels();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ContentPanel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getName()
	 * @see #getContentPanel()
	 * @generated
	 */
	EAttribute getContentPanel_Name();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ContentPanel#getAppData <em>App Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>App Data</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getAppData()
	 * @see #getContentPanel()
	 * @generated
	 */
	EReference getContentPanel_AppData();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ContentPanel#getOnRefreshCommand <em>On Refresh Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Refresh Command</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getOnRefreshCommand()
	 * @see #getContentPanel()
	 * @generated
	 */
	EReference getContentPanel_OnRefreshCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ContentPanel#getDialogs <em>Dialogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dialogs</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getDialogs()
	 * @see #getContentPanel()
	 * @generated
	 */
	EReference getContentPanel_Dialogs();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.FormPanel <em>Form Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Panel</em>'.
	 * @see it.csi.mddtools.guigen.FormPanel
	 * @generated
	 */
	EClass getFormPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.FormPanel#getSubpanels <em>Subpanels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpanels</em>'.
	 * @see it.csi.mddtools.guigen.FormPanel#getSubpanels()
	 * @see #getFormPanel()
	 * @generated
	 */
	EReference getFormPanel_Subpanels();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.FormPanel#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see it.csi.mddtools.guigen.FormPanel#getWidgets()
	 * @see #getFormPanel()
	 * @generated
	 */
	EReference getFormPanel_Widgets();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TabSetPanel <em>Tab Set Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Set Panel</em>'.
	 * @see it.csi.mddtools.guigen.TabSetPanel
	 * @generated
	 */
	EClass getTabSetPanel();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see it.csi.mddtools.guigen.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Panel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.Panel#getName()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Panel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see it.csi.mddtools.guigen.Panel#getLabel()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Label();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.Panel#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see it.csi.mddtools.guigen.Panel#getLayout()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.Panel#getLayoutSpec <em>Layout Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Spec</em>'.
	 * @see it.csi.mddtools.guigen.Panel#getLayoutSpec()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_LayoutSpec();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see it.csi.mddtools.guigen.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Widget#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see it.csi.mddtools.guigen.Widget#getLabel()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Label();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.Widget#getLayoutSpec <em>Layout Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Spec</em>'.
	 * @see it.csi.mddtools.guigen.Widget#getLayoutSpec()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_LayoutSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Widget#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Handlers</em>'.
	 * @see it.csi.mddtools.guigen.Widget#getEventHandlers()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_EventHandlers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Widget#getSecurityConstraints <em>Security Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Constraints</em>'.
	 * @see it.csi.mddtools.guigen.Widget#getSecurityConstraints()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_SecurityConstraints();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Widget#isDefaultVisible <em>Default Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Visible</em>'.
	 * @see it.csi.mddtools.guigen.Widget#isDefaultVisible()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_DefaultVisible();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Widget#isDefaultEnabled <em>Default Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Enabled</em>'.
	 * @see it.csi.mddtools.guigen.Widget#isDefaultEnabled()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_DefaultEnabled();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CommandWidget <em>Command Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Widget</em>'.
	 * @see it.csi.mddtools.guigen.CommandWidget
	 * @generated
	 */
	EClass getCommandWidget();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.DataWidget <em>Data Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Widget</em>'.
	 * @see it.csi.mddtools.guigen.DataWidget
	 * @generated
	 */
	EClass getDataWidget();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.DataWidget#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see it.csi.mddtools.guigen.DataWidget#getDataType()
	 * @see #getDataWidget()
	 * @generated
	 */
	EReference getDataWidget_DataType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.DataWidget#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see it.csi.mddtools.guigen.DataWidget#isRequired()
	 * @see #getDataWidget()
	 * @generated
	 */
	EAttribute getDataWidget_Required();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.DataWidget#getDataTypeModifier <em>Data Type Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type Modifier</em>'.
	 * @see it.csi.mddtools.guigen.DataWidget#getDataTypeModifier()
	 * @see #getDataWidget()
	 * @generated
	 */
	EAttribute getDataWidget_DataTypeModifier();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.DataWidget#getDatabinding <em>Databinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databinding</em>'.
	 * @see it.csi.mddtools.guigen.DataWidget#getDatabinding()
	 * @see #getDataWidget()
	 * @generated
	 */
	EReference getDataWidget_Databinding();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see it.csi.mddtools.guigen.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Button#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see it.csi.mddtools.guigen.Button#getImage()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Image();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see it.csi.mddtools.guigen.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TextField#getFieldLength <em>Field Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Length</em>'.
	 * @see it.csi.mddtools.guigen.TextField#getFieldLength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_FieldLength();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see it.csi.mddtools.guigen.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TextArea#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see it.csi.mddtools.guigen.TextArea#getRows()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Rows();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TextArea#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see it.csi.mddtools.guigen.TextArea#getColumns()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Columns();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see it.csi.mddtools.guigen.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see it.csi.mddtools.guigen.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ComboBox#getKeySelector <em>Key Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Selector</em>'.
	 * @see it.csi.mddtools.guigen.ComboBox#getKeySelector()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_KeySelector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ComboBox#getValueSelector <em>Value Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Selector</em>'.
	 * @see it.csi.mddtools.guigen.ComboBox#getValueSelector()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_ValueSelector();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see it.csi.mddtools.guigen.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Model</em>'.
	 * @see it.csi.mddtools.guigen.Table#getColumnModel()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ColumnModel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Size</em>'.
	 * @see it.csi.mddtools.guigen.Table#getPageSize()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_PageSize();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Export</em>'.
	 * @see it.csi.mddtools.guigen.Table#isEnableExport()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_EnableExport();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Decorator</em>'.
	 * @see it.csi.mddtools.guigen.Table#isCustomDecorator()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_CustomDecorator();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see it.csi.mddtools.guigen.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.GUIModel <em>GUI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Model</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel
	 * @generated
	 */
	EClass getGUIModel();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIModel#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getStructure()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Structure();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIModel#getBeahviors <em>Beahviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beahviors</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getBeahviors()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Beahviors();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GUIModel#getCodProdotto <em>Cod Prodotto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Prodotto</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getCodProdotto()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_CodProdotto();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GUIModel#getCodComponente <em>Cod Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Componente</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getCodComponente()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_CodComponente();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GUIModel#getVersioneProdotto <em>Versione Prodotto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versione Prodotto</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getVersioneProdotto()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_VersioneProdotto();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GUIModel#getVersioneComponente <em>Versione Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versione Componente</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getVersioneComponente()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_VersioneComponente();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIModel#getTypedefs <em>Typedefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typedefs</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getTypedefs()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_Typedefs();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIModel#getAppDataDefs <em>App Data Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App Data Defs</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getAppDataDefs()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_AppDataDefs();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GUIModel#getPortale <em>Portale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portale</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getPortale()
	 * @see #getGUIModel()
	 * @generated
	 */
	EAttribute getGUIModel_Portale();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIModel#getSecurityModel <em>Security Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Model</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getSecurityModel()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_SecurityModel();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIModel#getTargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Platform</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getTargetPlatform()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_TargetPlatform();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.GUIStructure <em>GUI Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Structure</em>'.
	 * @see it.csi.mddtools.guigen.GUIStructure
	 * @generated
	 */
	EClass getGUIStructure();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIStructure#getAppWindow <em>App Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App Window</em>'.
	 * @see it.csi.mddtools.guigen.GUIStructure#getAppWindow()
	 * @see #getGUIStructure()
	 * @generated
	 */
	EReference getGUIStructure_AppWindow();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.GUIBehaviors <em>GUI Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Behaviors</em>'.
	 * @see it.csi.mddtools.guigen.GUIBehaviors
	 * @generated
	 */
	EClass getGUIBehaviors();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RadioButtons <em>Radio Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Buttons</em>'.
	 * @see it.csi.mddtools.guigen.RadioButtons
	 * @generated
	 */
	EClass getRadioButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.RadioButtons#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Radio</em>'.
	 * @see it.csi.mddtools.guigen.RadioButtons#getRadio()
	 * @see #getRadioButtons()
	 * @generated
	 */
	EReference getRadioButtons_Radio();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see it.csi.mddtools.guigen.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.RadioButton#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.guigen.RadioButton#getValue()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Value();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ResetButton <em>Reset Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Button</em>'.
	 * @see it.csi.mddtools.guigen.ResetButton
	 * @generated
	 */
	EClass getResetButton();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ConfirmButton <em>Confirm Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confirm Button</em>'.
	 * @see it.csi.mddtools.guigen.ConfirmButton
	 * @generated
	 */
	EClass getConfirmButton();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PanelLayout <em>Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel Layout</em>'.
	 * @see it.csi.mddtools.guigen.PanelLayout
	 * @generated
	 */
	EClass getPanelLayout();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.HorizontalFlowPanelLayout <em>Horizontal Flow Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Flow Panel Layout</em>'.
	 * @see it.csi.mddtools.guigen.HorizontalFlowPanelLayout
	 * @generated
	 */
	EClass getHorizontalFlowPanelLayout();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.VerticalFlowPanelLayout <em>Vertical Flow Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Flow Panel Layout</em>'.
	 * @see it.csi.mddtools.guigen.VerticalFlowPanelLayout
	 * @generated
	 */
	EClass getVerticalFlowPanelLayout();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UDLRCPanelLayout <em>UDLRC Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDLRC Panel Layout</em>'.
	 * @see it.csi.mddtools.guigen.UDLRCPanelLayout
	 * @generated
	 */
	EClass getUDLRCPanelLayout();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WidgetLayoutSpecifier <em>Widget Layout Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Layout Specifier</em>'.
	 * @see it.csi.mddtools.guigen.WidgetLayoutSpecifier
	 * @generated
	 */
	EClass getWidgetLayoutSpecifier();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec <em>UDLRC Widget Layout Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDLRC Widget Layout Spec</em>'.
	 * @see it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec
	 * @generated
	 */
	EClass getUDLRCWidgetLayoutSpec();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec#getValue()
	 * @see #getUDLRCWidgetLayoutSpec()
	 * @generated
	 */
	EAttribute getUDLRCWidgetLayoutSpec_Value();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see it.csi.mddtools.guigen.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Image#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see it.csi.mddtools.guigen.Image#getImage()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Image();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see it.csi.mddtools.guigen.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Menu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.Menu#getName()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Menu#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see it.csi.mddtools.guigen.Menu#getLabel()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Menu#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see it.csi.mddtools.guigen.Menu#getItem()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Menu#getSubmenu <em>Submenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submenu</em>'.
	 * @see it.csi.mddtools.guigen.Menu#getSubmenu()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Submenu();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Menu#getSecurityConstraints <em>Security Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Constraints</em>'.
	 * @see it.csi.mddtools.guigen.Menu#getSecurityConstraints()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_SecurityConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.Menu#getEventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handler</em>'.
	 * @see it.csi.mddtools.guigen.Menu#getEventHandler()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_EventHandler();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see it.csi.mddtools.guigen.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MenuItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.MenuItem#getName()
	 * @see #getMenuItem()
	 * @generated
	 */
	EAttribute getMenuItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MenuItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see it.csi.mddtools.guigen.MenuItem#getLabel()
	 * @see #getMenuItem()
	 * @generated
	 */
	EAttribute getMenuItem_Label();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MenuItem#getEventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handler</em>'.
	 * @see it.csi.mddtools.guigen.MenuItem#getEventHandler()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_EventHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.MenuItem#getSecurityConstraints <em>Security Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Constraints</em>'.
	 * @see it.csi.mddtools.guigen.MenuItem#getSecurityConstraints()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_SecurityConstraints();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.DisabledComponentSet <em>Disabled Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabled Component Set</em>'.
	 * @see it.csi.mddtools.guigen.DisabledComponentSet
	 * @generated
	 */
	EClass getDisabledComponentSet();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ColumnModel <em>Column Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Model</em>'.
	 * @see it.csi.mddtools.guigen.ColumnModel
	 * @generated
	 */
	EClass getColumnModel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ColumnModel#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see it.csi.mddtools.guigen.ColumnModel#getColumns()
	 * @see #getColumnModel()
	 * @generated
	 */
	EReference getColumnModel_Columns();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ColumnModel#getValueSelector <em>Value Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Selector</em>'.
	 * @see it.csi.mddtools.guigen.ColumnModel#getValueSelector()
	 * @see #getColumnModel()
	 * @generated
	 */
	EAttribute getColumnModel_ValueSelector();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see it.csi.mddtools.guigen.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see it.csi.mddtools.guigen.Column#getSelector()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Selector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see it.csi.mddtools.guigen.Column#getLabel()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Label();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#isSortable <em>Sortable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortable</em>'.
	 * @see it.csi.mddtools.guigen.Column#isSortable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Sortable();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see it.csi.mddtools.guigen.Column#isEditable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Editable();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#isEventActive <em>Event Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Active</em>'.
	 * @see it.csi.mddtools.guigen.Column#isEventActive()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_EventActive();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see it.csi.mddtools.guigen.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Event</em>'.
	 * @see it.csi.mddtools.guigen.CommandEvent
	 * @generated
	 */
	EClass getCommandEvent();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ONOFFCommand <em>ONOFF Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ONOFF Command</em>'.
	 * @see it.csi.mddtools.guigen.ONOFFCommand
	 * @generated
	 */
	EClass getONOFFCommand();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ONOFFCommand#isEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see it.csi.mddtools.guigen.ONOFFCommand#isEnable()
	 * @see #getONOFFCommand()
	 * @generated
	 */
	EAttribute getONOFFCommand_Enable();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CustomCommand <em>Custom Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Command</em>'.
	 * @see it.csi.mddtools.guigen.CustomCommand
	 * @generated
	 */
	EClass getCustomCommand();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.VisibilityCommand <em>Visibility Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Command</em>'.
	 * @see it.csi.mddtools.guigen.VisibilityCommand
	 * @generated
	 */
	EClass getVisibilityCommand();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.VisibilityCommand#isShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see it.csi.mddtools.guigen.VisibilityCommand#isShow()
	 * @see #getVisibilityCommand()
	 * @generated
	 */
	EAttribute getVisibilityCommand_Show();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RefreshViewCommand <em>Refresh View Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refresh View Command</em>'.
	 * @see it.csi.mddtools.guigen.RefreshViewCommand
	 * @generated
	 */
	EClass getRefreshViewCommand();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.JumpCommand <em>Jump Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Command</em>'.
	 * @see it.csi.mddtools.guigen.JumpCommand
	 * @generated
	 */
	EClass getJumpCommand();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.JumpCommand#getJumpTo <em>Jump To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jump To</em>'.
	 * @see it.csi.mddtools.guigen.JumpCommand#getJumpTo()
	 * @see #getJumpCommand()
	 * @generated
	 */
	EReference getJumpCommand_JumpTo();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.JumpCommand#isPushCurrentPage <em>Push Current Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Push Current Page</em>'.
	 * @see it.csi.mddtools.guigen.JumpCommand#isPushCurrentPage()
	 * @see #getJumpCommand()
	 * @generated
	 */
	EAttribute getJumpCommand_PushCurrentPage();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ExecCommand <em>Exec Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Command</em>'.
	 * @see it.csi.mddtools.guigen.ExecCommand
	 * @generated
	 */
	EClass getExecCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ExecCommand#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see it.csi.mddtools.guigen.ExecCommand#getResults()
	 * @see #getExecCommand()
	 * @generated
	 */
	EReference getExecCommand_Results();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ExecCommand#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see it.csi.mddtools.guigen.ExecCommand#getMethodName()
	 * @see #getExecCommand()
	 * @generated
	 */
	EAttribute getExecCommand_MethodName();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ExecCommand#getPostExecData <em>Post Exec Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Post Exec Data</em>'.
	 * @see it.csi.mddtools.guigen.ExecCommand#getPostExecData()
	 * @see #getExecCommand()
	 * @generated
	 */
	EReference getExecCommand_PostExecData();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler</em>'.
	 * @see it.csi.mddtools.guigen.EventHandler
	 * @generated
	 */
	EClass getEventHandler();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.EventHandler#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see it.csi.mddtools.guigen.EventHandler#getCommand()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Command();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.EventHandler#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see it.csi.mddtools.guigen.EventHandler#getEventType()
	 * @see #getEventHandler()
	 * @generated
	 */
	EAttribute getEventHandler_EventType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.EventHandler#isSkipValidation <em>Skip Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Validation</em>'.
	 * @see it.csi.mddtools.guigen.EventHandler#isSkipValidation()
	 * @see #getEventHandler()
	 * @generated
	 */
	EAttribute getEventHandler_SkipValidation();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WidgetTargetAction <em>Widget Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Target Action</em>'.
	 * @see it.csi.mddtools.guigen.WidgetTargetAction
	 * @generated
	 */
	EClass getWidgetTargetAction();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CommandOnWidgets <em>Command On Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command On Widgets</em>'.
	 * @see it.csi.mddtools.guigen.CommandOnWidgets
	 * @generated
	 */
	EClass getCommandOnWidgets();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.CommandOnWidgets#getTargetWidgets <em>Target Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Widgets</em>'.
	 * @see it.csi.mddtools.guigen.CommandOnWidgets#getTargetWidgets()
	 * @see #getCommandOnWidgets()
	 * @generated
	 */
	EReference getCommandOnWidgets_TargetWidgets();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.DialogPanel <em>Dialog Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Panel</em>'.
	 * @see it.csi.mddtools.guigen.DialogPanel
	 * @generated
	 */
	EClass getDialogPanel();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.DialogPanel#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commands</em>'.
	 * @see it.csi.mddtools.guigen.DialogPanel#getCommands()
	 * @see #getDialogPanel()
	 * @generated
	 */
	EReference getDialogPanel_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.DialogPanel#getMsgBoxes <em>Msg Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Boxes</em>'.
	 * @see it.csi.mddtools.guigen.DialogPanel#getMsgBoxes()
	 * @see #getDialogPanel()
	 * @generated
	 */
	EReference getDialogPanel_MsgBoxes();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ShowDialogCommand <em>Show Dialog Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Dialog Command</em>'.
	 * @see it.csi.mddtools.guigen.ShowDialogCommand
	 * @generated
	 */
	EClass getShowDialogCommand();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ShowDialogCommand#getDialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dialog</em>'.
	 * @see it.csi.mddtools.guigen.ShowDialogCommand#getDialog()
	 * @see #getShowDialogCommand()
	 * @generated
	 */
	EReference getShowDialogCommand_Dialog();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CommandOutcome <em>Command Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Outcome</em>'.
	 * @see it.csi.mddtools.guigen.CommandOutcome
	 * @generated
	 */
	EClass getCommandOutcome();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CommandOutcome#getResultCode <em>Result Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Code</em>'.
	 * @see it.csi.mddtools.guigen.CommandOutcome#getResultCode()
	 * @see #getCommandOutcome()
	 * @generated
	 */
	EAttribute getCommandOutcome_ResultCode();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.CommandOutcome#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see it.csi.mddtools.guigen.CommandOutcome#getCommand()
	 * @see #getCommandOutcome()
	 * @generated
	 */
	EReference getCommandOutcome_Command();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CommandOnPanels <em>Command On Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command On Panels</em>'.
	 * @see it.csi.mddtools.guigen.CommandOnPanels
	 * @generated
	 */
	EClass getCommandOnPanels();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.CommandOnPanels#getTargetPanels <em>Target Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Panels</em>'.
	 * @see it.csi.mddtools.guigen.CommandOnPanels#getTargetPanels()
	 * @see #getCommandOnPanels()
	 * @generated
	 */
	EReference getCommandOnPanels_TargetPanels();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see it.csi.mddtools.guigen.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Header#getCodCanale <em>Cod Canale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Canale</em>'.
	 * @see it.csi.mddtools.guigen.Header#getCodCanale()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_CodCanale();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Header#getCodApplicativo <em>Cod Applicativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Applicativo</em>'.
	 * @see it.csi.mddtools.guigen.Header#getCodApplicativo()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_CodApplicativo();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Header#getNomeCanale <em>Nome Canale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Canale</em>'.
	 * @see it.csi.mddtools.guigen.Header#getNomeCanale()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_NomeCanale();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Header#getLinkCanale <em>Link Canale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Canale</em>'.
	 * @see it.csi.mddtools.guigen.Header#getLinkCanale()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_LinkCanale();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Header#getNomeApplicativo <em>Nome Applicativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Applicativo</em>'.
	 * @see it.csi.mddtools.guigen.Header#getNomeApplicativo()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_NomeApplicativo();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Footer <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer</em>'.
	 * @see it.csi.mddtools.guigen.Footer
	 * @generated
	 */
	EClass getFooter();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AppWindow <em>App Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Window</em>'.
	 * @see it.csi.mddtools.guigen.AppWindow
	 * @generated
	 */
	EClass getAppWindow();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.AppWindow#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see it.csi.mddtools.guigen.AppWindow#getFooter()
	 * @see #getAppWindow()
	 * @generated
	 */
	EReference getAppWindow_Footer();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.AppWindow#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see it.csi.mddtools.guigen.AppWindow#getHeader()
	 * @see #getAppWindow()
	 * @generated
	 */
	EReference getAppWindow_Header();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.AppWindow#getAppArea <em>App Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App Area</em>'.
	 * @see it.csi.mddtools.guigen.AppWindow#getAppArea()
	 * @see #getAppWindow()
	 * @generated
	 */
	EReference getAppWindow_AppArea();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.StaticLinks <em>Static Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Links</em>'.
	 * @see it.csi.mddtools.guigen.StaticLinks
	 * @generated
	 */
	EClass getStaticLinks();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.SequenceCommand <em>Sequence Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Command</em>'.
	 * @see it.csi.mddtools.guigen.SequenceCommand
	 * @generated
	 */
	EClass getSequenceCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.SequenceCommand#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see it.csi.mddtools.guigen.SequenceCommand#getCommands()
	 * @see #getSequenceCommand()
	 * @generated
	 */
	EReference getSequenceCommand_Commands();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.JumpBackCommand <em>Jump Back Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Back Command</em>'.
	 * @see it.csi.mddtools.guigen.JumpBackCommand
	 * @generated
	 */
	EClass getJumpBackCommand();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ApplicationData <em>Application Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Data</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationData
	 * @generated
	 */
	EClass getApplicationData();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ApplicationData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationData#getName()
	 * @see #getApplicationData()
	 * @generated
	 */
	EAttribute getApplicationData_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ApplicationData#getLifetimeExtent <em>Lifetime Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifetime Extent</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationData#getLifetimeExtent()
	 * @see #getApplicationData()
	 * @generated
	 */
	EAttribute getApplicationData_LifetimeExtent();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ApplicationData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationData#getType()
	 * @see #getApplicationData()
	 * @generated
	 */
	EReference getApplicationData_Type();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AppDataBinding <em>App Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Data Binding</em>'.
	 * @see it.csi.mddtools.guigen.AppDataBinding
	 * @generated
	 */
	EClass getAppDataBinding();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.AppDataBinding#getAppData <em>App Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App Data</em>'.
	 * @see it.csi.mddtools.guigen.AppDataBinding#getAppData()
	 * @see #getAppDataBinding()
	 * @generated
	 */
	EReference getAppDataBinding_AppData();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.AppDataBinding#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see it.csi.mddtools.guigen.AppDataBinding#getPath()
	 * @see #getAppDataBinding()
	 * @generated
	 */
	EAttribute getAppDataBinding_Path();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MultiDataWidget <em>Multi Data Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Data Widget</em>'.
	 * @see it.csi.mddtools.guigen.MultiDataWidget
	 * @generated
	 */
	EClass getMultiDataWidget();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MultiDataWidget#getMultiDataBinding <em>Multi Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Data Binding</em>'.
	 * @see it.csi.mddtools.guigen.MultiDataWidget#getMultiDataBinding()
	 * @see #getMultiDataWidget()
	 * @generated
	 */
	EReference getMultiDataWidget_MultiDataBinding();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Typedefs <em>Typedefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedefs</em>'.
	 * @see it.csi.mddtools.guigen.Typedefs
	 * @generated
	 */
	EClass getTypedefs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Typedefs#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see it.csi.mddtools.guigen.Typedefs#getTypes()
	 * @see #getTypedefs()
	 * @generated
	 */
	EReference getTypedefs_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Typedefs#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see it.csi.mddtools.guigen.Typedefs#getNamespaces()
	 * @see #getTypedefs()
	 * @generated
	 */
	EReference getTypedefs_Namespaces();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see it.csi.mddtools.guigen.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see it.csi.mddtools.guigen.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SimpleType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.guigen.SimpleType#getCode()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Code();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SimpleType#isNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see it.csi.mddtools.guigen.SimpleType#isNillable()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Nillable();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see it.csi.mddtools.guigen.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ComplexType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see it.csi.mddtools.guigen.ComplexType#getFields()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Fields();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ComplexType#isInitFields <em>Init Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Fields</em>'.
	 * @see it.csi.mddtools.guigen.ComplexType#isInitFields()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_InitFields();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TypedArray <em>Typed Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Array</em>'.
	 * @see it.csi.mddtools.guigen.TypedArray
	 * @generated
	 */
	EClass getTypedArray();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.TypedArray#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see it.csi.mddtools.guigen.TypedArray#getComponentType()
	 * @see #getTypedArray()
	 * @generated
	 */
	EReference getTypedArray_ComponentType();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see it.csi.mddtools.guigen.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.csi.mddtools.guigen.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Field#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see it.csi.mddtools.guigen.Field#isRequired()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Required();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Field#getDataTypeModifier <em>Data Type Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type Modifier</em>'.
	 * @see it.csi.mddtools.guigen.Field#getDataTypeModifier()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_DataTypeModifier();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ApplicationDataDefs <em>Application Data Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Data Defs</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationDataDefs
	 * @generated
	 */
	EClass getApplicationDataDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ApplicationDataDefs#getAppData <em>App Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App Data</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationDataDefs#getAppData()
	 * @see #getApplicationDataDefs()
	 * @generated
	 */
	EReference getApplicationDataDefs_AppData();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ApplicationDataDefs#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationDataDefs#getGroups()
	 * @see #getApplicationDataDefs()
	 * @generated
	 */
	EReference getApplicationDataDefs_Groups();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TreeView <em>Tree View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree View</em>'.
	 * @see it.csi.mddtools.guigen.TreeView
	 * @generated
	 */
	EClass getTreeView();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PlainText <em>Plain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Text</em>'.
	 * @see it.csi.mddtools.guigen.PlainText
	 * @generated
	 */
	EClass getPlainText();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PlainText#getStaticText <em>Static Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Text</em>'.
	 * @see it.csi.mddtools.guigen.PlainText#getStaticText()
	 * @see #getPlainText()
	 * @generated
	 */
	EAttribute getPlainText_StaticText();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu View</em>'.
	 * @see it.csi.mddtools.guigen.MenuView
	 * @generated
	 */
	EClass getMenuView();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.GridPanelLayout <em>Grid Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Panel Layout</em>'.
	 * @see it.csi.mddtools.guigen.GridPanelLayout
	 * @generated
	 */
	EClass getGridPanelLayout();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GridPanelLayout#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see it.csi.mddtools.guigen.GridPanelLayout#getColumns()
	 * @see #getGridPanelLayout()
	 * @generated
	 */
	EAttribute getGridPanelLayout_Columns();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GridPanelLayout#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see it.csi.mddtools.guigen.GridPanelLayout#getRows()
	 * @see #getGridPanelLayout()
	 * @generated
	 */
	EAttribute getGridPanelLayout_Rows();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec <em>Grid Widget Layout Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Widget Layout Spec</em>'.
	 * @see it.csi.mddtools.guigen.GridWidgetLayoutSpec
	 * @generated
	 */
	EClass getGridWidgetLayoutSpec();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see it.csi.mddtools.guigen.GridWidgetLayoutSpec#getRow()
	 * @see #getGridWidgetLayoutSpec()
	 * @generated
	 */
	EAttribute getGridWidgetLayoutSpec_Row();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see it.csi.mddtools.guigen.GridWidgetLayoutSpec#getColumn()
	 * @see #getGridWidgetLayoutSpec()
	 * @generated
	 */
	EAttribute getGridWidgetLayoutSpec_Column();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getHspan <em>Hspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hspan</em>'.
	 * @see it.csi.mddtools.guigen.GridWidgetLayoutSpec#getHspan()
	 * @see #getGridWidgetLayoutSpec()
	 * @generated
	 */
	EAttribute getGridWidgetLayoutSpec_Hspan();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CommandPanel <em>Command Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Panel</em>'.
	 * @see it.csi.mddtools.guigen.CommandPanel
	 * @generated
	 */
	EClass getCommandPanel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CommandPanel#getCmdStyle <em>Cmd Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd Style</em>'.
	 * @see it.csi.mddtools.guigen.CommandPanel#getCmdStyle()
	 * @see #getCommandPanel()
	 * @generated
	 */
	EAttribute getCommandPanel_CmdStyle();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MenuPanel <em>Menu Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Panel</em>'.
	 * @see it.csi.mddtools.guigen.MenuPanel
	 * @generated
	 */
	EClass getMenuPanel();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.HiddenValue <em>Hidden Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hidden Value</em>'.
	 * @see it.csi.mddtools.guigen.HiddenValue
	 * @generated
	 */
	EClass getHiddenValue();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UserDefinedWidget <em>User Defined Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Widget</em>'.
	 * @see it.csi.mddtools.guigen.UserDefinedWidget
	 * @generated
	 */
	EClass getUserDefinedWidget();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MultiPanel <em>Multi Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Panel</em>'.
	 * @see it.csi.mddtools.guigen.MultiPanel
	 * @generated
	 */
	EClass getMultiPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.MultiPanel#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panels</em>'.
	 * @see it.csi.mddtools.guigen.MultiPanel#getPanels()
	 * @see #getMultiPanel()
	 * @generated
	 */
	EReference getMultiPanel_Panels();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand <em>Activate Multi Panel Item Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activate Multi Panel Item Command</em>'.
	 * @see it.csi.mddtools.guigen.ActivateMultiPanelItemCommand
	 * @generated
	 */
	EClass getActivateMultiPanelItemCommand();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getMultipanel <em>Multipanel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multipanel</em>'.
	 * @see it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getMultipanel()
	 * @see #getActivateMultiPanelItemCommand()
	 * @generated
	 */
	EReference getActivateMultiPanelItemCommand_Multipanel();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem <em>Active Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Item</em>'.
	 * @see it.csi.mddtools.guigen.ActivateMultiPanelItemCommand#getActiveItem()
	 * @see #getActivateMultiPanelItemCommand()
	 * @generated
	 */
	EReference getActivateMultiPanelItemCommand_ActiveItem();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AutenticationMethod <em>Autentication Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autentication Method</em>'.
	 * @see it.csi.mddtools.guigen.AutenticationMethod
	 * @generated
	 */
	EClass getAutenticationMethod();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UISecurityConstraint <em>UI Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Security Constraint</em>'.
	 * @see it.csi.mddtools.guigen.UISecurityConstraint
	 * @generated
	 */
	EClass getUISecurityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.UISecurityConstraint#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see it.csi.mddtools.guigen.UISecurityConstraint#isVisible()
	 * @see #getUISecurityConstraint()
	 * @generated
	 */
	EAttribute getUISecurityConstraint_Visible();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.UISecurityConstraint#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see it.csi.mddtools.guigen.UISecurityConstraint#isEnabled()
	 * @see #getUISecurityConstraint()
	 * @generated
	 */
	EAttribute getUISecurityConstraint_Enabled();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UCBasedSecurityConstraint <em>UC Based Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Based Security Constraint</em>'.
	 * @see it.csi.mddtools.guigen.UCBasedSecurityConstraint
	 * @generated
	 */
	EClass getUCBasedSecurityConstraint();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.UCBasedSecurityConstraint#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Case</em>'.
	 * @see it.csi.mddtools.guigen.UCBasedSecurityConstraint#getUseCase()
	 * @see #getUCBasedSecurityConstraint()
	 * @generated
	 */
	EReference getUCBasedSecurityConstraint_UseCase();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.SecurityModel <em>Security Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Model</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel
	 * @generated
	 */
	EClass getSecurityModel();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.SecurityModel#getAutenticationMethod <em>Autentication Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autentication Method</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel#getAutenticationMethod()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_AutenticationMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.SecurityModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel#getActors()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.SecurityModel#getUseCases <em>Use Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Cases</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel#getUseCases()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_UseCases();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SecurityModel#getSecurityAppID <em>Security App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security App ID</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel#getSecurityAppID()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_SecurityAppID();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see it.csi.mddtools.guigen.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Actor#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.guigen.Actor#getCode()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Code();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see it.csi.mddtools.guigen.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.UseCase#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permission</em>'.
	 * @see it.csi.mddtools.guigen.UseCase#getPermission()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Permission();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.UseCase#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.guigen.UseCase#getCode()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Code();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActorBasedSecurityConstraint <em>Actor Based Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Based Security Constraint</em>'.
	 * @see it.csi.mddtools.guigen.ActorBasedSecurityConstraint
	 * @generated
	 */
	EClass getActorBasedSecurityConstraint();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ActorBasedSecurityConstraint#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see it.csi.mddtools.guigen.ActorBasedSecurityConstraint#getActor()
	 * @see #getActorBasedSecurityConstraint()
	 * @generated
	 */
	EReference getActorBasedSecurityConstraint_Actor();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CustomSecurityConstraint <em>Custom Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Security Constraint</em>'.
	 * @see it.csi.mddtools.guigen.CustomSecurityConstraint
	 * @generated
	 */
	EClass getCustomSecurityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CustomSecurityConstraint#getMethodNameSuffix <em>Method Name Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name Suffix</em>'.
	 * @see it.csi.mddtools.guigen.CustomSecurityConstraint#getMethodNameSuffix()
	 * @see #getCustomSecurityConstraint()
	 * @generated
	 */
	EAttribute getCustomSecurityConstraint_MethodNameSuffix();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.OPAUTHSSO <em>OPAUTHSSO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPAUTHSSO</em>'.
	 * @see it.csi.mddtools.guigen.OPAUTHSSO
	 * @generated
	 */
	EClass getOPAUTHSSO();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.OPAUTHSSO#getMinAuthLevel <em>Min Auth Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Auth Level</em>'.
	 * @see it.csi.mddtools.guigen.OPAUTHSSO#getMinAuthLevel()
	 * @see #getOPAUTHSSO()
	 * @generated
	 */
	EAttribute getOPAUTHSSO_MinAuthLevel();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.SSOBARTSSO <em>SSOBARTSSO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSOBARTSSO</em>'.
	 * @see it.csi.mddtools.guigen.SSOBARTSSO
	 * @generated
	 */
	EClass getSSOBARTSSO();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CustomAuthentication <em>Custom Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Authentication</em>'.
	 * @see it.csi.mddtools.guigen.CustomAuthentication
	 * @generated
	 */
	EClass getCustomAuthentication();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.StdMessagePanel <em>Std Message Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Message Panel</em>'.
	 * @see it.csi.mddtools.guigen.StdMessagePanel
	 * @generated
	 */
	EClass getStdMessagePanel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.StdMessagePanel#isShowGlobalMessages <em>Show Global Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Global Messages</em>'.
	 * @see it.csi.mddtools.guigen.StdMessagePanel#isShowGlobalMessages()
	 * @see #getStdMessagePanel()
	 * @generated
	 */
	EAttribute getStdMessagePanel_ShowGlobalMessages();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrorDetails <em>Show Field Error Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Field Error Details</em>'.
	 * @see it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrorDetails()
	 * @see #getStdMessagePanel()
	 * @generated
	 */
	EAttribute getStdMessagePanel_ShowFieldErrorDetails();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrors <em>Show Field Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Field Errors</em>'.
	 * @see it.csi.mddtools.guigen.StdMessagePanel#isShowFieldErrors()
	 * @see #getStdMessagePanel()
	 * @generated
	 */
	EAttribute getStdMessagePanel_ShowFieldErrors();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.JumpExtCommand <em>Jump Ext Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Ext Command</em>'.
	 * @see it.csi.mddtools.guigen.JumpExtCommand
	 * @generated
	 */
	EClass getJumpExtCommand();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.JumpExtCommand#getStaticUrl <em>Static Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Url</em>'.
	 * @see it.csi.mddtools.guigen.JumpExtCommand#getStaticUrl()
	 * @see #getJumpExtCommand()
	 * @generated
	 */
	EAttribute getJumpExtCommand_StaticUrl();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.JumpExtCommand#getRuntimeUrlProvider <em>Runtime Url Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Url Provider</em>'.
	 * @see it.csi.mddtools.guigen.JumpExtCommand#getRuntimeUrlProvider()
	 * @see #getJumpExtCommand()
	 * @generated
	 */
	EReference getJumpExtCommand_RuntimeUrlProvider();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.JumpExtCommand#getLocationCode <em>Location Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Code</em>'.
	 * @see it.csi.mddtools.guigen.JumpExtCommand#getLocationCode()
	 * @see #getJumpExtCommand()
	 * @generated
	 */
	EAttribute getJumpExtCommand_LocationCode();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Platform</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatform
	 * @generated
	 */
	EClass getTargetPlatform();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TargetPlatform#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatform#getCode()
	 * @see #getTargetPlatform()
	 * @generated
	 */
	EAttribute getTargetPlatform_Code();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UserInfoPanel <em>User Info Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Info Panel</em>'.
	 * @see it.csi.mddtools.guigen.UserInfoPanel
	 * @generated
	 */
	EClass getUserInfoPanel();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UserDefinedPanel <em>User Defined Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Panel</em>'.
	 * @see it.csi.mddtools.guigen.UserDefinedPanel
	 * @generated
	 */
	EClass getUserDefinedPanel();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WizardPanel <em>Wizard Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard Panel</em>'.
	 * @see it.csi.mddtools.guigen.WizardPanel
	 * @generated
	 */
	EClass getWizardPanel();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AppModule <em>App Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Module</em>'.
	 * @see it.csi.mddtools.guigen.AppModule
	 * @generated
	 */
	EClass getAppModule();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.AppModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.AppModule#getName()
	 * @see #getAppModule()
	 * @generated
	 */
	EAttribute getAppModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.AppModule#getContentPanels <em>Content Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Panels</em>'.
	 * @see it.csi.mddtools.guigen.AppModule#getContentPanels()
	 * @see #getAppModule()
	 * @generated
	 */
	EReference getAppModule_ContentPanels();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TypeNamespace <em>Type Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Namespace</em>'.
	 * @see it.csi.mddtools.guigen.TypeNamespace
	 * @generated
	 */
	EClass getTypeNamespace();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TypeNamespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.TypeNamespace#getName()
	 * @see #getTypeNamespace()
	 * @generated
	 */
	EAttribute getTypeNamespace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.TypeNamespace#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see it.csi.mddtools.guigen.TypeNamespace#getTypes()
	 * @see #getTypeNamespace()
	 * @generated
	 */
	EReference getTypeNamespace_Types();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AppDataGroup <em>App Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Data Group</em>'.
	 * @see it.csi.mddtools.guigen.AppDataGroup
	 * @generated
	 */
	EClass getAppDataGroup();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.AppDataGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.AppDataGroup#getName()
	 * @see #getAppDataGroup()
	 * @generated
	 */
	EAttribute getAppDataGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.AppDataGroup#getAppData <em>App Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App Data</em>'.
	 * @see it.csi.mddtools.guigen.AppDataGroup#getAppData()
	 * @see #getAppDataGroup()
	 * @generated
	 */
	EReference getAppDataGroup_AppData();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MsgBoxPanel <em>Msg Box Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Box Panel</em>'.
	 * @see it.csi.mddtools.guigen.MsgBoxPanel
	 * @generated
	 */
	EClass getMsgBoxPanel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MsgBoxPanel#getMessageSeverity <em>Message Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Severity</em>'.
	 * @see it.csi.mddtools.guigen.MsgBoxPanel#getMessageSeverity()
	 * @see #getMsgBoxPanel()
	 * @generated
	 */
	EAttribute getMsgBoxPanel_MessageSeverity();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.MsgBoxPanel#getTextMessages <em>Text Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Messages</em>'.
	 * @see it.csi.mddtools.guigen.MsgBoxPanel#getTextMessages()
	 * @see #getMsgBoxPanel()
	 * @generated
	 */
	EReference getMsgBoxPanel_TextMessages();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.NOPCommand <em>NOP Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOP Command</em>'.
	 * @see it.csi.mddtools.guigen.NOPCommand
	 * @generated
	 */
	EClass getNOPCommand();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WidgetsPanel <em>Widgets Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widgets Panel</em>'.
	 * @see it.csi.mddtools.guigen.WidgetsPanel
	 * @generated
	 */
	EClass getWidgetsPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.WidgetsPanel#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see it.csi.mddtools.guigen.WidgetsPanel#getWidgets()
	 * @see #getWidgetsPanel()
	 * @generated
	 */
	EReference getWidgetsPanel_Widgets();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.WidgetDataType <em>Widget Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Widget Data Type</em>'.
	 * @see it.csi.mddtools.guigen.WidgetDataType
	 * @generated
	 */
	EEnum getWidgetDataType();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.UDLRCSpecConstants <em>UDLRC Spec Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UDLRC Spec Constants</em>'.
	 * @see it.csi.mddtools.guigen.UDLRCSpecConstants
	 * @generated
	 */
	EEnum getUDLRCSpecConstants();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.EventTypes <em>Event Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Types</em>'.
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @generated
	 */
	EEnum getEventTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.DataLifetimeType <em>Data Lifetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Lifetime Type</em>'.
	 * @see it.csi.mddtools.guigen.DataLifetimeType
	 * @generated
	 */
	EEnum getDataLifetimeType();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.SimpleTypeCodes <em>Simple Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type Codes</em>'.
	 * @see it.csi.mddtools.guigen.SimpleTypeCodes
	 * @generated
	 */
	EEnum getSimpleTypeCodes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.PortalNames <em>Portal Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Portal Names</em>'.
	 * @see it.csi.mddtools.guigen.PortalNames
	 * @generated
	 */
	EEnum getPortalNames();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.TargetPlatformCodes <em>Target Platform Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Platform Codes</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatformCodes
	 * @generated
	 */
	EEnum getTargetPlatformCodes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.MessageSeverity <em>Message Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Severity</em>'.
	 * @see it.csi.mddtools.guigen.MessageSeverity
	 * @generated
	 */
	EEnum getMessageSeverity();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.CommandStyles <em>Command Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Styles</em>'.
	 * @see it.csi.mddtools.guigen.CommandStyles
	 * @generated
	 */
	EEnum getCommandStyles();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuigenFactory getGuigenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ApplicationAreaImpl <em>Application Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ApplicationAreaImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationArea()
		 * @generated
		 */
		EClass APPLICATION_AREA = eINSTANCE.getApplicationArea();

		/**
		 * The meta object literal for the '<em><b>Menubar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__MENUBAR = eINSTANCE.getApplicationArea_Menubar();

		/**
		 * The meta object literal for the '<em><b>Titlebar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__TITLEBAR = eINSTANCE.getApplicationArea_Titlebar();

		/**
		 * The meta object literal for the '<em><b>Statusbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__STATUSBAR = eINSTANCE.getApplicationArea_Statusbar();

		/**
		 * The meta object literal for the '<em><b>Content Panels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__CONTENT_PANELS = eINSTANCE.getApplicationArea_ContentPanels();

		/**
		 * The meta object literal for the '<em><b>Static Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__STATIC_LINKS = eINSTANCE.getApplicationArea_StaticLinks();

		/**
		 * The meta object literal for the '<em><b>On Init Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__ON_INIT_COMMAND = eINSTANCE.getApplicationArea_OnInitCommand();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__MODULES = eINSTANCE.getApplicationArea_Modules();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MenubarImpl <em>Menubar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MenubarImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenubar()
		 * @generated
		 */
		EClass MENUBAR = eINSTANCE.getMenubar();

		/**
		 * The meta object literal for the '<em><b>Top Level Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENUBAR__TOP_LEVEL_MENU = eINSTANCE.getMenubar_TopLevelMenu();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.StatusbarImpl <em>Statusbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.StatusbarImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStatusbar()
		 * @generated
		 */
		EClass STATUSBAR = eINSTANCE.getStatusbar();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TitlebarImpl <em>Titlebar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TitlebarImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTitlebar()
		 * @generated
		 */
		EClass TITLEBAR = eINSTANCE.getTitlebar();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ContentPanelImpl <em>Content Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ContentPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getContentPanel()
		 * @generated
		 */
		EClass CONTENT_PANEL = eINSTANCE.getContentPanel();

		/**
		 * The meta object literal for the '<em><b>Panels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PANEL__PANELS = eINSTANCE.getContentPanel_Panels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_PANEL__NAME = eINSTANCE.getContentPanel_Name();

		/**
		 * The meta object literal for the '<em><b>App Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PANEL__APP_DATA = eINSTANCE.getContentPanel_AppData();

		/**
		 * The meta object literal for the '<em><b>On Refresh Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PANEL__ON_REFRESH_COMMAND = eINSTANCE.getContentPanel_OnRefreshCommand();

		/**
		 * The meta object literal for the '<em><b>Dialogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PANEL__DIALOGS = eINSTANCE.getContentPanel_Dialogs();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.FormPanelImpl <em>Form Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.FormPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFormPanel()
		 * @generated
		 */
		EClass FORM_PANEL = eINSTANCE.getFormPanel();

		/**
		 * The meta object literal for the '<em><b>Subpanels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_PANEL__SUBPANELS = eINSTANCE.getFormPanel_Subpanels();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_PANEL__WIDGETS = eINSTANCE.getFormPanel_Widgets();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TabSetPanelImpl <em>Tab Set Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TabSetPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTabSetPanel()
		 * @generated
		 */
		EClass TAB_SET_PANEL = eINSTANCE.getTabSetPanel();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__NAME = eINSTANCE.getPanel_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__LABEL = eINSTANCE.getPanel_Label();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__LAYOUT = eINSTANCE.getPanel_Layout();

		/**
		 * The meta object literal for the '<em><b>Layout Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__LAYOUT_SPEC = eINSTANCE.getPanel_LayoutSpec();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.WidgetImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__LABEL = eINSTANCE.getWidget_Label();

		/**
		 * The meta object literal for the '<em><b>Layout Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__LAYOUT_SPEC = eINSTANCE.getWidget_LayoutSpec();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__EVENT_HANDLERS = eINSTANCE.getWidget_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Security Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__SECURITY_CONSTRAINTS = eINSTANCE.getWidget_SecurityConstraints();

		/**
		 * The meta object literal for the '<em><b>Default Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__DEFAULT_VISIBLE = eINSTANCE.getWidget_DefaultVisible();

		/**
		 * The meta object literal for the '<em><b>Default Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__DEFAULT_ENABLED = eINSTANCE.getWidget_DefaultEnabled();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CommandWidgetImpl <em>Command Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CommandWidgetImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandWidget()
		 * @generated
		 */
		EClass COMMAND_WIDGET = eINSTANCE.getCommandWidget();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.DataWidgetImpl <em>Data Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.DataWidgetImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDataWidget()
		 * @generated
		 */
		EClass DATA_WIDGET = eINSTANCE.getDataWidget();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WIDGET__DATA_TYPE = eINSTANCE.getDataWidget_DataType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WIDGET__REQUIRED = eINSTANCE.getDataWidget_Required();

		/**
		 * The meta object literal for the '<em><b>Data Type Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WIDGET__DATA_TYPE_MODIFIER = eINSTANCE.getDataWidget_DataTypeModifier();

		/**
		 * The meta object literal for the '<em><b>Databinding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WIDGET__DATABINDING = eINSTANCE.getDataWidget_Databinding();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ButtonImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IMAGE = eINSTANCE.getButton_Image();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TextFieldImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Field Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__FIELD_LENGTH = eINSTANCE.getTextField_FieldLength();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TextAreaImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__ROWS = eINSTANCE.getTextArea_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__COLUMNS = eINSTANCE.getTextArea_Columns();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CalendarImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ComboBoxImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '<em><b>Key Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__KEY_SELECTOR = eINSTANCE.getComboBox_KeySelector();

		/**
		 * The meta object literal for the '<em><b>Value Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__VALUE_SELECTOR = eINSTANCE.getComboBox_ValueSelector();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TableImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Column Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMN_MODEL = eINSTANCE.getTable_ColumnModel();

		/**
		 * The meta object literal for the '<em><b>Page Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__PAGE_SIZE = eINSTANCE.getTable_PageSize();

		/**
		 * The meta object literal for the '<em><b>Enable Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ENABLE_EXPORT = eINSTANCE.getTable_EnableExport();

		/**
		 * The meta object literal for the '<em><b>Custom Decorator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CUSTOM_DECORATOR = eINSTANCE.getTable_CustomDecorator();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CheckBoxImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.GUIModelImpl <em>GUI Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.GUIModelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIModel()
		 * @generated
		 */
		EClass GUI_MODEL = eINSTANCE.getGUIModel();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__STRUCTURE = eINSTANCE.getGUIModel_Structure();

		/**
		 * The meta object literal for the '<em><b>Beahviors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__BEAHVIORS = eINSTANCE.getGUIModel_Beahviors();

		/**
		 * The meta object literal for the '<em><b>Cod Prodotto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__COD_PRODOTTO = eINSTANCE.getGUIModel_CodProdotto();

		/**
		 * The meta object literal for the '<em><b>Cod Componente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__COD_COMPONENTE = eINSTANCE.getGUIModel_CodComponente();

		/**
		 * The meta object literal for the '<em><b>Versione Prodotto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__VERSIONE_PRODOTTO = eINSTANCE.getGUIModel_VersioneProdotto();

		/**
		 * The meta object literal for the '<em><b>Versione Componente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__VERSIONE_COMPONENTE = eINSTANCE.getGUIModel_VersioneComponente();

		/**
		 * The meta object literal for the '<em><b>Typedefs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__TYPEDEFS = eINSTANCE.getGUIModel_Typedefs();

		/**
		 * The meta object literal for the '<em><b>App Data Defs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__APP_DATA_DEFS = eINSTANCE.getGUIModel_AppDataDefs();

		/**
		 * The meta object literal for the '<em><b>Portale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_MODEL__PORTALE = eINSTANCE.getGUIModel_Portale();

		/**
		 * The meta object literal for the '<em><b>Security Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__SECURITY_MODEL = eINSTANCE.getGUIModel_SecurityModel();

		/**
		 * The meta object literal for the '<em><b>Target Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__TARGET_PLATFORM = eINSTANCE.getGUIModel_TargetPlatform();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.GUIStructureImpl <em>GUI Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.GUIStructureImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIStructure()
		 * @generated
		 */
		EClass GUI_STRUCTURE = eINSTANCE.getGUIStructure();

		/**
		 * The meta object literal for the '<em><b>App Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_STRUCTURE__APP_WINDOW = eINSTANCE.getGUIStructure_AppWindow();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.GUIBehaviorsImpl <em>GUI Behaviors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.GUIBehaviorsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIBehaviors()
		 * @generated
		 */
		EClass GUI_BEHAVIORS = eINSTANCE.getGUIBehaviors();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RadioButtonsImpl <em>Radio Buttons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RadioButtonsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRadioButtons()
		 * @generated
		 */
		EClass RADIO_BUTTONS = eINSTANCE.getRadioButtons();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_BUTTONS__RADIO = eINSTANCE.getRadioButtons_Radio();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RadioButtonImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__VALUE = eINSTANCE.getRadioButton_Value();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ResetButtonImpl <em>Reset Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ResetButtonImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getResetButton()
		 * @generated
		 */
		EClass RESET_BUTTON = eINSTANCE.getResetButton();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ConfirmButtonImpl <em>Confirm Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ConfirmButtonImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getConfirmButton()
		 * @generated
		 */
		EClass CONFIRM_BUTTON = eINSTANCE.getConfirmButton();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PanelLayoutImpl <em>Panel Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PanelLayoutImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelLayout()
		 * @generated
		 */
		EClass PANEL_LAYOUT = eINSTANCE.getPanelLayout();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.HorizontalFlowPanelLayoutImpl <em>Horizontal Flow Panel Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.HorizontalFlowPanelLayoutImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHorizontalFlowPanelLayout()
		 * @generated
		 */
		EClass HORIZONTAL_FLOW_PANEL_LAYOUT = eINSTANCE.getHorizontalFlowPanelLayout();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.VerticalFlowPanelLayoutImpl <em>Vertical Flow Panel Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.VerticalFlowPanelLayoutImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVerticalFlowPanelLayout()
		 * @generated
		 */
		EClass VERTICAL_FLOW_PANEL_LAYOUT = eINSTANCE.getVerticalFlowPanelLayout();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UDLRCPanelLayoutImpl <em>UDLRC Panel Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UDLRCPanelLayoutImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCPanelLayout()
		 * @generated
		 */
		EClass UDLRC_PANEL_LAYOUT = eINSTANCE.getUDLRCPanelLayout();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.WidgetLayoutSpecifierImpl <em>Widget Layout Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.WidgetLayoutSpecifierImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetLayoutSpecifier()
		 * @generated
		 */
		EClass WIDGET_LAYOUT_SPECIFIER = eINSTANCE.getWidgetLayoutSpecifier();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UDLRCWidgetLayoutSpecImpl <em>UDLRC Widget Layout Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UDLRCWidgetLayoutSpecImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCWidgetLayoutSpec()
		 * @generated
		 */
		EClass UDLRC_WIDGET_LAYOUT_SPEC = eINSTANCE.getUDLRCWidgetLayoutSpec();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDLRC_WIDGET_LAYOUT_SPEC__VALUE = eINSTANCE.getUDLRCWidgetLayoutSpec_Value();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ImageImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__IMAGE = eINSTANCE.getImage_Image();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MenuImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__NAME = eINSTANCE.getMenu_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__LABEL = eINSTANCE.getMenu_Label();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ITEM = eINSTANCE.getMenu_Item();

		/**
		 * The meta object literal for the '<em><b>Submenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__SUBMENU = eINSTANCE.getMenu_Submenu();

		/**
		 * The meta object literal for the '<em><b>Security Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__SECURITY_CONSTRAINTS = eINSTANCE.getMenu_SecurityConstraints();

		/**
		 * The meta object literal for the '<em><b>Event Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__EVENT_HANDLER = eINSTANCE.getMenu_EventHandler();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MenuItemImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuItem()
		 * @generated
		 */
		EClass MENU_ITEM = eINSTANCE.getMenuItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ITEM__NAME = eINSTANCE.getMenuItem_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ITEM__LABEL = eINSTANCE.getMenuItem_Label();

		/**
		 * The meta object literal for the '<em><b>Event Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ITEM__EVENT_HANDLER = eINSTANCE.getMenuItem_EventHandler();

		/**
		 * The meta object literal for the '<em><b>Security Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ITEM__SECURITY_CONSTRAINTS = eINSTANCE.getMenuItem_SecurityConstraints();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.DisabledComponentSetImpl <em>Disabled Component Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.DisabledComponentSetImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDisabledComponentSet()
		 * @generated
		 */
		EClass DISABLED_COMPONENT_SET = eINSTANCE.getDisabledComponentSet();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ColumnModelImpl <em>Column Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ColumnModelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getColumnModel()
		 * @generated
		 */
		EClass COLUMN_MODEL = eINSTANCE.getColumnModel();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_MODEL__COLUMNS = eINSTANCE.getColumnModel_Columns();

		/**
		 * The meta object literal for the '<em><b>Value Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_MODEL__VALUE_SELECTOR = eINSTANCE.getColumnModel_ValueSelector();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ColumnImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SELECTOR = eINSTANCE.getColumn_Selector();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__LABEL = eINSTANCE.getColumn_Label();

		/**
		 * The meta object literal for the '<em><b>Sortable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SORTABLE = eINSTANCE.getColumn_Sortable();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__EDITABLE = eINSTANCE.getColumn_Editable();

		/**
		 * The meta object literal for the '<em><b>Event Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__EVENT_ACTIVE = eINSTANCE.getColumn_EventActive();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CommandEventImpl <em>Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CommandEventImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandEvent()
		 * @generated
		 */
		EClass COMMAND_EVENT = eINSTANCE.getCommandEvent();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ONOFFCommandImpl <em>ONOFF Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ONOFFCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getONOFFCommand()
		 * @generated
		 */
		EClass ONOFF_COMMAND = eINSTANCE.getONOFFCommand();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONOFF_COMMAND__ENABLE = eINSTANCE.getONOFFCommand_Enable();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CustomCommandImpl <em>Custom Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CustomCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomCommand()
		 * @generated
		 */
		EClass CUSTOM_COMMAND = eINSTANCE.getCustomCommand();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.VisibilityCommandImpl <em>Visibility Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.VisibilityCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVisibilityCommand()
		 * @generated
		 */
		EClass VISIBILITY_COMMAND = eINSTANCE.getVisibilityCommand();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_COMMAND__SHOW = eINSTANCE.getVisibilityCommand_Show();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RefreshViewCommandImpl <em>Refresh View Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RefreshViewCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRefreshViewCommand()
		 * @generated
		 */
		EClass REFRESH_VIEW_COMMAND = eINSTANCE.getRefreshViewCommand();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.JumpCommandImpl <em>Jump Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.JumpCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpCommand()
		 * @generated
		 */
		EClass JUMP_COMMAND = eINSTANCE.getJumpCommand();

		/**
		 * The meta object literal for the '<em><b>Jump To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_COMMAND__JUMP_TO = eINSTANCE.getJumpCommand_JumpTo();

		/**
		 * The meta object literal for the '<em><b>Push Current Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_COMMAND__PUSH_CURRENT_PAGE = eINSTANCE.getJumpCommand_PushCurrentPage();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ExecCommandImpl <em>Exec Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ExecCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExecCommand()
		 * @generated
		 */
		EClass EXEC_COMMAND = eINSTANCE.getExecCommand();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_COMMAND__RESULTS = eINSTANCE.getExecCommand_Results();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_COMMAND__METHOD_NAME = eINSTANCE.getExecCommand_MethodName();

		/**
		 * The meta object literal for the '<em><b>Post Exec Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_COMMAND__POST_EXEC_DATA = eINSTANCE.getExecCommand_PostExecData();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.EventHandlerImpl <em>Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.EventHandlerImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEventHandler()
		 * @generated
		 */
		EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__COMMAND = eINSTANCE.getEventHandler_Command();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_HANDLER__EVENT_TYPE = eINSTANCE.getEventHandler_EventType();

		/**
		 * The meta object literal for the '<em><b>Skip Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_HANDLER__SKIP_VALIDATION = eINSTANCE.getEventHandler_SkipValidation();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.WidgetTargetAction <em>Widget Target Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.WidgetTargetAction
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetTargetAction()
		 * @generated
		 */
		EClass WIDGET_TARGET_ACTION = eINSTANCE.getWidgetTargetAction();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CommandOnWidgetsImpl <em>Command On Widgets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CommandOnWidgetsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOnWidgets()
		 * @generated
		 */
		EClass COMMAND_ON_WIDGETS = eINSTANCE.getCommandOnWidgets();

		/**
		 * The meta object literal for the '<em><b>Target Widgets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_ON_WIDGETS__TARGET_WIDGETS = eINSTANCE.getCommandOnWidgets_TargetWidgets();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.DialogPanelImpl <em>Dialog Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.DialogPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDialogPanel()
		 * @generated
		 */
		EClass DIALOG_PANEL = eINSTANCE.getDialogPanel();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_PANEL__COMMANDS = eINSTANCE.getDialogPanel_Commands();

		/**
		 * The meta object literal for the '<em><b>Msg Boxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_PANEL__MSG_BOXES = eINSTANCE.getDialogPanel_MsgBoxes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ShowDialogCommandImpl <em>Show Dialog Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ShowDialogCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getShowDialogCommand()
		 * @generated
		 */
		EClass SHOW_DIALOG_COMMAND = eINSTANCE.getShowDialogCommand();

		/**
		 * The meta object literal for the '<em><b>Dialog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_DIALOG_COMMAND__DIALOG = eINSTANCE.getShowDialogCommand_Dialog();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CommandOutcomeImpl <em>Command Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CommandOutcomeImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOutcome()
		 * @generated
		 */
		EClass COMMAND_OUTCOME = eINSTANCE.getCommandOutcome();

		/**
		 * The meta object literal for the '<em><b>Result Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_OUTCOME__RESULT_CODE = eINSTANCE.getCommandOutcome_ResultCode();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_OUTCOME__COMMAND = eINSTANCE.getCommandOutcome_Command();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CommandOnPanelsImpl <em>Command On Panels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CommandOnPanelsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOnPanels()
		 * @generated
		 */
		EClass COMMAND_ON_PANELS = eINSTANCE.getCommandOnPanels();

		/**
		 * The meta object literal for the '<em><b>Target Panels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_ON_PANELS__TARGET_PANELS = eINSTANCE.getCommandOnPanels_TargetPanels();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.HeaderImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Cod Canale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__COD_CANALE = eINSTANCE.getHeader_CodCanale();

		/**
		 * The meta object literal for the '<em><b>Cod Applicativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__COD_APPLICATIVO = eINSTANCE.getHeader_CodApplicativo();

		/**
		 * The meta object literal for the '<em><b>Nome Canale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__NOME_CANALE = eINSTANCE.getHeader_NomeCanale();

		/**
		 * The meta object literal for the '<em><b>Link Canale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__LINK_CANALE = eINSTANCE.getHeader_LinkCanale();

		/**
		 * The meta object literal for the '<em><b>Nome Applicativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__NOME_APPLICATIVO = eINSTANCE.getHeader_NomeApplicativo();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.FooterImpl <em>Footer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.FooterImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFooter()
		 * @generated
		 */
		EClass FOOTER = eINSTANCE.getFooter();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AppWindowImpl <em>App Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AppWindowImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppWindow()
		 * @generated
		 */
		EClass APP_WINDOW = eINSTANCE.getAppWindow();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_WINDOW__FOOTER = eINSTANCE.getAppWindow_Footer();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_WINDOW__HEADER = eINSTANCE.getAppWindow_Header();

		/**
		 * The meta object literal for the '<em><b>App Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_WINDOW__APP_AREA = eINSTANCE.getAppWindow_AppArea();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.StaticLinksImpl <em>Static Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.StaticLinksImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStaticLinks()
		 * @generated
		 */
		EClass STATIC_LINKS = eINSTANCE.getStaticLinks();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.SequenceCommandImpl <em>Sequence Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.SequenceCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSequenceCommand()
		 * @generated
		 */
		EClass SEQUENCE_COMMAND = eINSTANCE.getSequenceCommand();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_COMMAND__COMMANDS = eINSTANCE.getSequenceCommand_Commands();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.JumpBackCommandImpl <em>Jump Back Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.JumpBackCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpBackCommand()
		 * @generated
		 */
		EClass JUMP_BACK_COMMAND = eINSTANCE.getJumpBackCommand();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ApplicationDataImpl <em>Application Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ApplicationDataImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationData()
		 * @generated
		 */
		EClass APPLICATION_DATA = eINSTANCE.getApplicationData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DATA__NAME = eINSTANCE.getApplicationData_Name();

		/**
		 * The meta object literal for the '<em><b>Lifetime Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DATA__LIFETIME_EXTENT = eINSTANCE.getApplicationData_LifetimeExtent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA__TYPE = eINSTANCE.getApplicationData_Type();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AppDataBindingImpl <em>App Data Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AppDataBindingImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataBinding()
		 * @generated
		 */
		EClass APP_DATA_BINDING = eINSTANCE.getAppDataBinding();

		/**
		 * The meta object literal for the '<em><b>App Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DATA_BINDING__APP_DATA = eINSTANCE.getAppDataBinding_AppData();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_DATA_BINDING__PATH = eINSTANCE.getAppDataBinding_Path();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MultiDataWidgetImpl <em>Multi Data Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MultiDataWidgetImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMultiDataWidget()
		 * @generated
		 */
		EClass MULTI_DATA_WIDGET = eINSTANCE.getMultiDataWidget();

		/**
		 * The meta object literal for the '<em><b>Multi Data Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DATA_WIDGET__MULTI_DATA_BINDING = eINSTANCE.getMultiDataWidget_MultiDataBinding();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TypedefsImpl <em>Typedefs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TypedefsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypedefs()
		 * @generated
		 */
		EClass TYPEDEFS = eINSTANCE.getTypedefs();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEFS__TYPES = eINSTANCE.getTypedefs_Types();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEFS__NAMESPACES = eINSTANCE.getTypedefs_Namespaces();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TypeImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.SimpleTypeImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__CODE = eINSTANCE.getSimpleType_Code();

		/**
		 * The meta object literal for the '<em><b>Nillable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__NILLABLE = eINSTANCE.getSimpleType_Nillable();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ComplexTypeImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__FIELDS = eINSTANCE.getComplexType_Fields();

		/**
		 * The meta object literal for the '<em><b>Init Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__INIT_FIELDS = eINSTANCE.getComplexType_InitFields();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TypedArrayImpl <em>Typed Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TypedArrayImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypedArray()
		 * @generated
		 */
		EClass TYPED_ARRAY = eINSTANCE.getTypedArray();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ARRAY__COMPONENT_TYPE = eINSTANCE.getTypedArray_ComponentType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.FieldImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__REQUIRED = eINSTANCE.getField_Required();

		/**
		 * The meta object literal for the '<em><b>Data Type Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DATA_TYPE_MODIFIER = eINSTANCE.getField_DataTypeModifier();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl <em>Application Data Defs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationDataDefs()
		 * @generated
		 */
		EClass APPLICATION_DATA_DEFS = eINSTANCE.getApplicationDataDefs();

		/**
		 * The meta object literal for the '<em><b>App Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA_DEFS__APP_DATA = eINSTANCE.getApplicationDataDefs_AppData();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA_DEFS__GROUPS = eINSTANCE.getApplicationDataDefs_Groups();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TreeViewImpl <em>Tree View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TreeViewImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTreeView()
		 * @generated
		 */
		EClass TREE_VIEW = eINSTANCE.getTreeView();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PlainTextImpl <em>Plain Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PlainTextImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPlainText()
		 * @generated
		 */
		EClass PLAIN_TEXT = eINSTANCE.getPlainText();

		/**
		 * The meta object literal for the '<em><b>Static Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXT__STATIC_TEXT = eINSTANCE.getPlainText_StaticText();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MenuViewImpl <em>Menu View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MenuViewImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuView()
		 * @generated
		 */
		EClass MENU_VIEW = eINSTANCE.getMenuView();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.GridPanelLayoutImpl <em>Grid Panel Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.GridPanelLayoutImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGridPanelLayout()
		 * @generated
		 */
		EClass GRID_PANEL_LAYOUT = eINSTANCE.getGridPanelLayout();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_PANEL_LAYOUT__COLUMNS = eINSTANCE.getGridPanelLayout_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_PANEL_LAYOUT__ROWS = eINSTANCE.getGridPanelLayout_Rows();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl <em>Grid Widget Layout Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGridWidgetLayoutSpec()
		 * @generated
		 */
		EClass GRID_WIDGET_LAYOUT_SPEC = eINSTANCE.getGridWidgetLayoutSpec();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_WIDGET_LAYOUT_SPEC__ROW = eINSTANCE.getGridWidgetLayoutSpec_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_WIDGET_LAYOUT_SPEC__COLUMN = eINSTANCE.getGridWidgetLayoutSpec_Column();

		/**
		 * The meta object literal for the '<em><b>Hspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_WIDGET_LAYOUT_SPEC__HSPAN = eINSTANCE.getGridWidgetLayoutSpec_Hspan();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CommandPanelImpl <em>Command Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CommandPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandPanel()
		 * @generated
		 */
		EClass COMMAND_PANEL = eINSTANCE.getCommandPanel();

		/**
		 * The meta object literal for the '<em><b>Cmd Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PANEL__CMD_STYLE = eINSTANCE.getCommandPanel_CmdStyle();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MenuPanelImpl <em>Menu Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MenuPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuPanel()
		 * @generated
		 */
		EClass MENU_PANEL = eINSTANCE.getMenuPanel();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.HiddenValueImpl <em>Hidden Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.HiddenValueImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHiddenValue()
		 * @generated
		 */
		EClass HIDDEN_VALUE = eINSTANCE.getHiddenValue();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UserDefinedWidgetImpl <em>User Defined Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UserDefinedWidgetImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserDefinedWidget()
		 * @generated
		 */
		EClass USER_DEFINED_WIDGET = eINSTANCE.getUserDefinedWidget();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MultiPanelImpl <em>Multi Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MultiPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMultiPanel()
		 * @generated
		 */
		EClass MULTI_PANEL = eINSTANCE.getMultiPanel();

		/**
		 * The meta object literal for the '<em><b>Panels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PANEL__PANELS = eINSTANCE.getMultiPanel_Panels();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActivateMultiPanelItemCommandImpl <em>Activate Multi Panel Item Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActivateMultiPanelItemCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActivateMultiPanelItemCommand()
		 * @generated
		 */
		EClass ACTIVATE_MULTI_PANEL_ITEM_COMMAND = eINSTANCE.getActivateMultiPanelItemCommand();

		/**
		 * The meta object literal for the '<em><b>Multipanel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL = eINSTANCE.getActivateMultiPanelItemCommand_Multipanel();

		/**
		 * The meta object literal for the '<em><b>Active Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM = eINSTANCE.getActivateMultiPanelItemCommand_ActiveItem();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AutenticationMethodImpl <em>Autentication Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AutenticationMethodImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAutenticationMethod()
		 * @generated
		 */
		EClass AUTENTICATION_METHOD = eINSTANCE.getAutenticationMethod();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UISecurityConstraintImpl <em>UI Security Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UISecurityConstraintImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUISecurityConstraint()
		 * @generated
		 */
		EClass UI_SECURITY_CONSTRAINT = eINSTANCE.getUISecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_SECURITY_CONSTRAINT__VISIBLE = eINSTANCE.getUISecurityConstraint_Visible();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_SECURITY_CONSTRAINT__ENABLED = eINSTANCE.getUISecurityConstraint_Enabled();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UCBasedSecurityConstraintImpl <em>UC Based Security Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UCBasedSecurityConstraintImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUCBasedSecurityConstraint()
		 * @generated
		 */
		EClass UC_BASED_SECURITY_CONSTRAINT = eINSTANCE.getUCBasedSecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_BASED_SECURITY_CONSTRAINT__USE_CASE = eINSTANCE.getUCBasedSecurityConstraint_UseCase();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.SecurityModelImpl <em>Security Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.SecurityModelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSecurityModel()
		 * @generated
		 */
		EClass SECURITY_MODEL = eINSTANCE.getSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Autentication Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__AUTENTICATION_METHOD = eINSTANCE.getSecurityModel_AutenticationMethod();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__ACTORS = eINSTANCE.getSecurityModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Use Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__USE_CASES = eINSTANCE.getSecurityModel_UseCases();

		/**
		 * The meta object literal for the '<em><b>Security App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__SECURITY_APP_ID = eINSTANCE.getSecurityModel_SecurityAppID();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActorImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__CODE = eINSTANCE.getActor_Code();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UseCaseImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__PERMISSION = eINSTANCE.getUseCase_Permission();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__CODE = eINSTANCE.getUseCase_Code();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActorBasedSecurityConstraintImpl <em>Actor Based Security Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActorBasedSecurityConstraintImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActorBasedSecurityConstraint()
		 * @generated
		 */
		EClass ACTOR_BASED_SECURITY_CONSTRAINT = eINSTANCE.getActorBasedSecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_BASED_SECURITY_CONSTRAINT__ACTOR = eINSTANCE.getActorBasedSecurityConstraint_Actor();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CustomSecurityConstraintImpl <em>Custom Security Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CustomSecurityConstraintImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomSecurityConstraint()
		 * @generated
		 */
		EClass CUSTOM_SECURITY_CONSTRAINT = eINSTANCE.getCustomSecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Method Name Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX = eINSTANCE.getCustomSecurityConstraint_MethodNameSuffix();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.OPAUTHSSOImpl <em>OPAUTHSSO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.OPAUTHSSOImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getOPAUTHSSO()
		 * @generated
		 */
		EClass OPAUTHSSO = eINSTANCE.getOPAUTHSSO();

		/**
		 * The meta object literal for the '<em><b>Min Auth Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAUTHSSO__MIN_AUTH_LEVEL = eINSTANCE.getOPAUTHSSO_MinAuthLevel();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.SSOBARTSSOImpl <em>SSOBARTSSO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.SSOBARTSSOImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSSOBARTSSO()
		 * @generated
		 */
		EClass SSOBARTSSO = eINSTANCE.getSSOBARTSSO();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CustomAuthenticationImpl <em>Custom Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CustomAuthenticationImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomAuthentication()
		 * @generated
		 */
		EClass CUSTOM_AUTHENTICATION = eINSTANCE.getCustomAuthentication();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.StdMessagePanelImpl <em>Std Message Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.StdMessagePanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStdMessagePanel()
		 * @generated
		 */
		EClass STD_MESSAGE_PANEL = eINSTANCE.getStdMessagePanel();

		/**
		 * The meta object literal for the '<em><b>Show Global Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES = eINSTANCE.getStdMessagePanel_ShowGlobalMessages();

		/**
		 * The meta object literal for the '<em><b>Show Field Error Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS = eINSTANCE.getStdMessagePanel_ShowFieldErrorDetails();

		/**
		 * The meta object literal for the '<em><b>Show Field Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS = eINSTANCE.getStdMessagePanel_ShowFieldErrors();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.JumpExtCommandImpl <em>Jump Ext Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.JumpExtCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpExtCommand()
		 * @generated
		 */
		EClass JUMP_EXT_COMMAND = eINSTANCE.getJumpExtCommand();

		/**
		 * The meta object literal for the '<em><b>Static Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_EXT_COMMAND__STATIC_URL = eINSTANCE.getJumpExtCommand_StaticUrl();

		/**
		 * The meta object literal for the '<em><b>Runtime Url Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER = eINSTANCE.getJumpExtCommand_RuntimeUrlProvider();

		/**
		 * The meta object literal for the '<em><b>Location Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_EXT_COMMAND__LOCATION_CODE = eINSTANCE.getJumpExtCommand_LocationCode();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl <em>Target Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TargetPlatformImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTargetPlatform()
		 * @generated
		 */
		EClass TARGET_PLATFORM = eINSTANCE.getTargetPlatform();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PLATFORM__CODE = eINSTANCE.getTargetPlatform_Code();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UserInfoPanelImpl <em>User Info Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UserInfoPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserInfoPanel()
		 * @generated
		 */
		EClass USER_INFO_PANEL = eINSTANCE.getUserInfoPanel();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UserDefinedPanelImpl <em>User Defined Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UserDefinedPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserDefinedPanel()
		 * @generated
		 */
		EClass USER_DEFINED_PANEL = eINSTANCE.getUserDefinedPanel();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.WizardPanelImpl <em>Wizard Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.WizardPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWizardPanel()
		 * @generated
		 */
		EClass WIZARD_PANEL = eINSTANCE.getWizardPanel();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AppModuleImpl <em>App Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AppModuleImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppModule()
		 * @generated
		 */
		EClass APP_MODULE = eINSTANCE.getAppModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MODULE__NAME = eINSTANCE.getAppModule_Name();

		/**
		 * The meta object literal for the '<em><b>Content Panels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_MODULE__CONTENT_PANELS = eINSTANCE.getAppModule_ContentPanels();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TypeNamespaceImpl <em>Type Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TypeNamespaceImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeNamespace()
		 * @generated
		 */
		EClass TYPE_NAMESPACE = eINSTANCE.getTypeNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAMESPACE__NAME = eINSTANCE.getTypeNamespace_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_NAMESPACE__TYPES = eINSTANCE.getTypeNamespace_Types();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AppDataGroupImpl <em>App Data Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AppDataGroupImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataGroup()
		 * @generated
		 */
		EClass APP_DATA_GROUP = eINSTANCE.getAppDataGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_DATA_GROUP__NAME = eINSTANCE.getAppDataGroup_Name();

		/**
		 * The meta object literal for the '<em><b>App Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DATA_GROUP__APP_DATA = eINSTANCE.getAppDataGroup_AppData();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MsgBoxPanelImpl <em>Msg Box Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MsgBoxPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMsgBoxPanel()
		 * @generated
		 */
		EClass MSG_BOX_PANEL = eINSTANCE.getMsgBoxPanel();

		/**
		 * The meta object literal for the '<em><b>Message Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_PANEL__MESSAGE_SEVERITY = eINSTANCE.getMsgBoxPanel_MessageSeverity();

		/**
		 * The meta object literal for the '<em><b>Text Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_BOX_PANEL__TEXT_MESSAGES = eINSTANCE.getMsgBoxPanel_TextMessages();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.NOPCommandImpl <em>NOP Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.NOPCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getNOPCommand()
		 * @generated
		 */
		EClass NOP_COMMAND = eINSTANCE.getNOPCommand();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.WidgetsPanelImpl <em>Widgets Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.WidgetsPanelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetsPanel()
		 * @generated
		 */
		EClass WIDGETS_PANEL = eINSTANCE.getWidgetsPanel();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGETS_PANEL__WIDGETS = eINSTANCE.getWidgetsPanel_Widgets();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.WidgetDataType <em>Widget Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.WidgetDataType
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetDataType()
		 * @generated
		 */
		EEnum WIDGET_DATA_TYPE = eINSTANCE.getWidgetDataType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.UDLRCSpecConstants <em>UDLRC Spec Constants</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.UDLRCSpecConstants
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCSpecConstants()
		 * @generated
		 */
		EEnum UDLRC_SPEC_CONSTANTS = eINSTANCE.getUDLRCSpecConstants();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.EventTypes <em>Event Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.EventTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEventTypes()
		 * @generated
		 */
		EEnum EVENT_TYPES = eINSTANCE.getEventTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.DataLifetimeType <em>Data Lifetime Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.DataLifetimeType
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDataLifetimeType()
		 * @generated
		 */
		EEnum DATA_LIFETIME_TYPE = eINSTANCE.getDataLifetimeType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.SimpleTypeCodes <em>Simple Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.SimpleTypeCodes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSimpleTypeCodes()
		 * @generated
		 */
		EEnum SIMPLE_TYPE_CODES = eINSTANCE.getSimpleTypeCodes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.PortalNames <em>Portal Names</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.PortalNames
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPortalNames()
		 * @generated
		 */
		EEnum PORTAL_NAMES = eINSTANCE.getPortalNames();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.TargetPlatformCodes <em>Target Platform Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.TargetPlatformCodes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTargetPlatformCodes()
		 * @generated
		 */
		EEnum TARGET_PLATFORM_CODES = eINSTANCE.getTargetPlatformCodes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.MessageSeverity <em>Message Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.MessageSeverity
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMessageSeverity()
		 * @generated
		 */
		EEnum MESSAGE_SEVERITY = eINSTANCE.getMessageSeverity();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.CommandStyles <em>Command Styles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.CommandStyles
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandStyles()
		 * @generated
		 */
		EEnum COMMAND_STYLES = eINSTANCE.getCommandStyles();

	}

} //GuigenPackage
