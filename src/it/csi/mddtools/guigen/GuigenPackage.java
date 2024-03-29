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
 * Contiene le classi con cui è possibile modellare l'applicazione.
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
	 * The feature id for the '<em><b>Ext Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__EXT_MODULES = 7;

	/**
	 * The feature id for the '<em><b>Home Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__HOME_PAGE = 8;

	/**
	 * The number of structural features of the '<em>Application Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Remote Info Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUBAR__REMOTE_INFO_BOX = 1;

	/**
	 * The number of structural features of the '<em>Menubar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUBAR_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__STATES = 5;

	/**
	 * The feature id for the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__DEFAULT_STATE = 6;

	/**
	 * The feature id for the '<em><b>Cp Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL__CP_COMMANDS = 7;

	/**
	 * The number of structural features of the '<em>Content Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 5;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__SCROLLABLE = 4;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.FormPanelImpl <em>Form Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.FormPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFormPanel()
	 * @generated
	 */
	int FORM_PANEL = 6;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

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
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL__COLLAPSIBLE = PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Form Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TabSetPanelImpl <em>Tab Set Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TabSetPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTabSetPanel()
	 * @generated
	 */
	int TAB_SET_PANEL = 8;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 9;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandWidgetImpl <em>Command Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandWidget()
	 * @generated
	 */
	int COMMAND_WIDGET = 10;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.DataWidgetImpl <em>Data Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.DataWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDataWidget()
	 * @generated
	 */
	int DATA_WIDGET = 11;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 12;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TextFieldImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 13;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TextAreaImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 14;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CalendarImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 15;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ComboBoxImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 16;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TableImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 17;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CheckBoxImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 18;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GUIModelImpl <em>GUI Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GUIModelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIModel()
	 * @generated
	 */
	int GUI_MODEL = 19;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GUIStructureImpl <em>GUI Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GUIStructureImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIStructure()
	 * @generated
	 */
	int GUI_STRUCTURE = 20;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GUIBehaviorsImpl <em>GUI Behaviors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GUIBehaviorsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIBehaviors()
	 * @generated
	 */
	int GUI_BEHAVIORS = 21;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RadioButtonsImpl <em>Radio Buttons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RadioButtonsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRadioButtons()
	 * @generated
	 */
	int RADIO_BUTTONS = 22;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RadioButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 23;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ResetButtonImpl <em>Reset Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ResetButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getResetButton()
	 * @generated
	 */
	int RESET_BUTTON = 24;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ConfirmButtonImpl <em>Confirm Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ConfirmButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getConfirmButton()
	 * @generated
	 */
	int CONFIRM_BUTTON = 25;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelLayoutImpl <em>Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelLayout()
	 * @generated
	 */
	int PANEL_LAYOUT = 26;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.HorizontalFlowPanelLayoutImpl <em>Horizontal Flow Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.HorizontalFlowPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHorizontalFlowPanelLayout()
	 * @generated
	 */
	int HORIZONTAL_FLOW_PANEL_LAYOUT = 27;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.VerticalFlowPanelLayoutImpl <em>Vertical Flow Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.VerticalFlowPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVerticalFlowPanelLayout()
	 * @generated
	 */
	int VERTICAL_FLOW_PANEL_LAYOUT = 28;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UDLRCPanelLayoutImpl <em>UDLRC Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UDLRCPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCPanelLayout()
	 * @generated
	 */
	int UDLRC_PANEL_LAYOUT = 29;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WidgetLayoutSpecifierImpl <em>Widget Layout Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WidgetLayoutSpecifierImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetLayoutSpecifier()
	 * @generated
	 */
	int WIDGET_LAYOUT_SPECIFIER = 30;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UDLRCWidgetLayoutSpecImpl <em>UDLRC Widget Layout Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UDLRCWidgetLayoutSpecImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCWidgetLayoutSpec()
	 * @generated
	 */
	int UDLRC_WIDGET_LAYOUT_SPEC = 31;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ImageImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 32;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 33;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuItemImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 34;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.DisabledComponentSetImpl <em>Disabled Component Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.DisabledComponentSetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDisabledComponentSet()
	 * @generated
	 */
	int DISABLED_COMPONENT_SET = 35;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ColumnModelImpl <em>Column Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ColumnModelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getColumnModel()
	 * @generated
	 */
	int COLUMN_MODEL = 36;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ColumnImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 37;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 38;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandEventImpl <em>Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandEventImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandEvent()
	 * @generated
	 */
	int COMMAND_EVENT = 39;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ONOFFCommandImpl <em>ONOFF Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ONOFFCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getONOFFCommand()
	 * @generated
	 */
	int ONOFF_COMMAND = 40;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CustomCommandImpl <em>Custom Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CustomCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomCommand()
	 * @generated
	 */
	int CUSTOM_COMMAND = 41;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.VisibilityCommandImpl <em>Visibility Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.VisibilityCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVisibilityCommand()
	 * @generated
	 */
	int VISIBILITY_COMMAND = 42;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RefreshViewCommandImpl <em>Refresh View Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RefreshViewCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRefreshViewCommand()
	 * @generated
	 */
	int REFRESH_VIEW_COMMAND = 43;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.JumpCommandImpl <em>Jump Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.JumpCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpCommand()
	 * @generated
	 */
	int JUMP_COMMAND = 44;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ExecCommandImpl <em>Exec Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ExecCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExecCommand()
	 * @generated
	 */
	int EXEC_COMMAND = 45;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.EventHandlerImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 46;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.WidgetTargetAction <em>Widget Target Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.WidgetTargetAction
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetTargetAction()
	 * @generated
	 */
	int WIDGET_TARGET_ACTION = 47;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandOnWidgetsImpl <em>Command On Widgets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandOnWidgetsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOnWidgets()
	 * @generated
	 */
	int COMMAND_ON_WIDGETS = 48;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.DialogPanelImpl <em>Dialog Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.DialogPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDialogPanel()
	 * @generated
	 */
	int DIALOG_PANEL = 49;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ShowDialogCommandImpl <em>Show Dialog Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ShowDialogCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getShowDialogCommand()
	 * @generated
	 */
	int SHOW_DIALOG_COMMAND = 50;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandOutcomeImpl <em>Command Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandOutcomeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOutcome()
	 * @generated
	 */
	int COMMAND_OUTCOME = 51;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandOnPanelsImpl <em>Command On Panels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandOnPanelsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandOnPanels()
	 * @generated
	 */
	int COMMAND_ON_PANELS = 52;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.HeaderImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 53;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.FooterImpl <em>Footer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.FooterImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFooter()
	 * @generated
	 */
	int FOOTER = 55;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppWindowImpl <em>App Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppWindowImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppWindow()
	 * @generated
	 */
	int APP_WINDOW = 56;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.StaticLinksImpl <em>Static Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.StaticLinksImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStaticLinks()
	 * @generated
	 */
	int STATIC_LINKS = 57;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SequenceCommandImpl <em>Sequence Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SequenceCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSequenceCommand()
	 * @generated
	 */
	int SEQUENCE_COMMAND = 58;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.JumpBackCommandImpl <em>Jump Back Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.JumpBackCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpBackCommand()
	 * @generated
	 */
	int JUMP_BACK_COMMAND = 59;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ApplicationDataImpl <em>Application Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ApplicationDataImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationData()
	 * @generated
	 */
	int APPLICATION_DATA = 60;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppDataBindingImpl <em>App Data Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppDataBindingImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataBinding()
	 * @generated
	 */
	int APP_DATA_BINDING = 61;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MultiDataWidgetImpl <em>Multi Data Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MultiDataWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMultiDataWidget()
	 * @generated
	 */
	int MULTI_DATA_WIDGET = 62;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypedefsImpl <em>Typedefs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypedefsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypedefs()
	 * @generated
	 */
	int TYPEDEFS = 63;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 64;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SimpleTypeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 65;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ComplexTypeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 66;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypedArrayImpl <em>Typed Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypedArrayImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypedArray()
	 * @generated
	 */
	int TYPED_ARRAY = 68;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.FieldImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 69;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl <em>Application Data Defs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getApplicationDataDefs()
	 * @generated
	 */
	int APPLICATION_DATA_DEFS = 70;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TreeViewImpl <em>Tree View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TreeViewImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTreeView()
	 * @generated
	 */
	int TREE_VIEW = 71;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PlainTextImpl <em>Plain Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PlainTextImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPlainText()
	 * @generated
	 */
	int PLAIN_TEXT = 72;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuViewImpl <em>Menu View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuViewImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuView()
	 * @generated
	 */
	int MENU_VIEW = 73;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GridPanelLayoutImpl <em>Grid Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GridPanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGridPanelLayout()
	 * @generated
	 */
	int GRID_PANEL_LAYOUT = 74;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl <em>Grid Widget Layout Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGridWidgetLayoutSpec()
	 * @generated
	 */
	int GRID_WIDGET_LAYOUT_SPEC = 75;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CommandPanelImpl <em>Command Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CommandPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandPanel()
	 * @generated
	 */
	int COMMAND_PANEL = 76;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuPanelImpl <em>Menu Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenuPanel()
	 * @generated
	 */
	int MENU_PANEL = 77;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.HiddenValueImpl <em>Hidden Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.HiddenValueImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHiddenValue()
	 * @generated
	 */
	int HIDDEN_VALUE = 78;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UserDefinedWidgetImpl <em>User Defined Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UserDefinedWidgetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserDefinedWidget()
	 * @generated
	 */
	int USER_DEFINED_WIDGET = 79;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MultiPanelImpl <em>Multi Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MultiPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMultiPanel()
	 * @generated
	 */
	int MULTI_PANEL = 7;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__SCROLLABLE = MULTI_PANEL__SCROLLABLE;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__PANELS = MULTI_PANEL__PANELS;

	/**
	 * The feature id for the '<em><b>Switcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__SWITCHER = MULTI_PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab Set Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL_FEATURE_COUNT = MULTI_PANEL_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TOOLTIP = 7;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ENABLE_ENRICHMENT = 8;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Function Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET__FUNCTION_SPECIFIER = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TOOLTIP = COMMAND_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ENABLE_ENRICHMENT = COMMAND_WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Function Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__FUNCTION_SPECIFIER = COMMAND_WIDGET__FUNCTION_SPECIFIER;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MULTI_DATA_BINDING = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__FIELD_LENGTH = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__FIELD_MAX_LENGTH = DATA_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Select Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__SELECT_YEAR = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__SELECT_MONTH = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Select Year Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__SELECT_YEAR_RANGE = DATA_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Omit Header Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__OMIT_HEADER_VALUE = DATA_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Field Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__FIELD_LENGTH = DATA_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Visible Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__VISIBLE_LINES = DATA_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SUMMARY = DATA_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Ext Security Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__EXT_SECURITY_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Target Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__TARGET_PLATFORM = 11;

	/**
	 * The feature id for the '<em><b>Activation Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL__ACTIVATION_MODEL = 12;

	/**
	 * The number of structural features of the '<em>GUI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL_FEATURE_COUNT = 13;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__LAYOUT = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Radio Buttons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__TOOLTIP = BUTTON__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__ENABLE_ENRICHMENT = BUTTON__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Function Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__FUNCTION_SPECIFIER = BUTTON__FUNCTION_SPECIFIER;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__TOOLTIP = BUTTON__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__ENABLE_ENRICHMENT = BUTTON__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Function Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_BUTTON__FUNCTION_SPECIFIER = BUTTON__FUNCTION_SPECIFIER;

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
	 * The feature id for the '<em><b>Column Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_LAYOUT__COLUMN_SIZES = 0;

	/**
	 * The number of structural features of the '<em>Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Column Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_FLOW_PANEL_LAYOUT__COLUMN_SIZES = PANEL_LAYOUT__COLUMN_SIZES;

	/**
	 * The number of structural features of the '<em>Horizontal Flow Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_FLOW_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FLOW_PANEL_LAYOUT__COLUMN_SIZES = PANEL_LAYOUT__COLUMN_SIZES;

	/**
	 * The number of structural features of the '<em>Vertical Flow Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FLOW_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDLRC_PANEL_LAYOUT__COLUMN_SIZES = PANEL_LAYOUT__COLUMN_SIZES;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Editable Flag Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__EDITABLE_FLAG_SELECTOR = 5;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MULTI_DATA_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Multidata Key Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MULTIDATA_KEY_SELECTOR = 7;

	/**
	 * The feature id for the '<em><b>Multidata Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MULTIDATA_VALUE_SELECTOR = 8;

	/**
	 * The feature id for the '<em><b>Multidata Property Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MULTIDATA_PROPERTY_SELECTOR = 9;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TOOLTIP = 10;

	/**
	 * The feature id for the '<em><b>Active Flag Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ACTIVE_FLAG_SELECTOR = 11;

	/**
	 * The feature id for the '<em><b>Field Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FIELD_MAX_LENGTH = 12;

	/**
	 * The feature id for the '<em><b>Custom Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CUSTOM_DECORATOR = 13;

	/**
	 * The feature id for the '<em><b>Custom Sort Property Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CUSTOM_SORT_PROPERTY_SELECTOR = 14;

	/**
	 * The feature id for the '<em><b>Field Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FIELD_LENGTH = 15;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 16;

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
	 * The feature id for the '<em><b>Target Menu Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_COMMAND__TARGET_MENU_ELEMENT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_COMMAND__ENABLE = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ONOFF Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Target Menu Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_COMMAND__TARGET_MENU_ELEMENT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_COMMAND__SHOW = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Visibility Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_COMMAND__TARGET_WIDGETS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Menu Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_COMMAND__TARGET_MENU_ELEMENT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Panels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_COMMAND__TARGET_PANELS = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Refresh View Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Custom Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND__CUSTOM_TEMPLATE = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extra Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND__EXTRA_MODELS = COMMAND_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inline Code Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND__INLINE_CODE_SNIPPETS = COMMAND_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Exec Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Method Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__METHOD_PROTECTION = 3;

	/**
	 * The feature id for the '<em><b>Event Specifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__EVENT_SPECIFIERS = 4;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Target Menu Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ON_WIDGETS__TARGET_MENU_ELEMENT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command On Widgets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ON_WIDGETS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Meta Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__META_ATTRIBUTES = 6;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.HeaderMetaAttrImpl <em>Header Meta Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.HeaderMetaAttrImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHeaderMetaAttr()
	 * @generated
	 */
	int HEADER_META_ATTR = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_META_ATTR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_META_ATTR__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Use Http Equiv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_META_ATTR__USE_HTTP_EQUIV = 2;

	/**
	 * The number of structural features of the '<em>Header Meta Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_META_ATTR_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DATA_WIDGET__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Ext Namespaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEFS__EXT_NAMESPACES = 2;

	/**
	 * The number of structural features of the '<em>Typedefs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEFS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.AnnotatedElement <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.AnnotatedElement
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 169;

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
	 * The feature id for the '<em><b>User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__USER_DEFINED = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Type Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__DATA_TYPE_MODIFIERS = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Edit Hint Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__EDIT_HINT_MSG = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__EXTENDS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__TYPE_ANNOTATION = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypeAnnotationImpl <em>Type Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypeAnnotationImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeAnnotation()
	 * @generated
	 */
	int TYPE_ANNOTATION = 67;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Fqn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__FQN = 1;

	/**
	 * The number of structural features of the '<em>Type Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = 4;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Ext Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_DEFS__EXT_GROUPS = 2;

	/**
	 * The number of structural features of the '<em>Application Data Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_DEFS_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Node Selection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__NODE_SELECTION_TYPE = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tree View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__TOOLTIP = COMMAND_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__ENABLE_ENRICHMENT = COMMAND_WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Function Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__FUNCTION_SPECIFIER = COMMAND_WIDGET__FUNCTION_SPECIFIER;

	/**
	 * The number of structural features of the '<em>Menu View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW_FEATURE_COUNT = COMMAND_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PANEL_LAYOUT__COLUMN_SIZES = PANEL_LAYOUT__COLUMN_SIZES;

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
	 * The feature id for the '<em><b>Vspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_WIDGET_LAYOUT_SPEC__VSPAN = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grid Widget Layout Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_WIDGET_LAYOUT_SPEC_FEATURE_COUNT = WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

	/**
	 * The feature id for the '<em><b>Cmd Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__CMD_STYLE = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL__WIDGETS = PANEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL__WIDGETS = PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_VALUE__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

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
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_WIDGET__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

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
	int ACTIVATE_MULTI_PANEL_ITEM_COMMAND = 80;

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
	int AUTENTICATION_METHOD = 81;

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
	int UI_SECURITY_CONSTRAINT = 82;

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
	int UC_BASED_SECURITY_CONSTRAINT = 83;

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
	int SECURITY_MODEL = 84;

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
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__ROLES = 4;

	/**
	 * The feature id for the '<em><b>User Info Logout Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__USER_INFO_LOGOUT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Ask For Confirmation On Logout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT = 6;

	/**
	 * The number of structural features of the '<em>Security Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActorImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 85;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLES = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UseCaseImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 86;

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
	int ACTOR_BASED_SECURITY_CONSTRAINT = 87;

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
	int CUSTOM_SECURITY_CONSTRAINT = 88;

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
	int OPAUTHSSO = 89;

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
	int SSOBARTSSO = 90;

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
	int CUSTOM_AUTHENTICATION = 91;

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
	int STD_MESSAGE_PANEL = 92;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_MESSAGE_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

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
	int JUMP_EXT_COMMAND = 93;

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
	 * The feature id for the '<em><b>Binary Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EXT_COMMAND__BINARY_STREAM = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Jump Ext Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EXT_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TargetPlatformImpl <em>Target Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TargetPlatformImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTargetPlatform()
	 * @generated
	 */
	int TARGET_PLATFORM = 94;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__CODE = 0;

	/**
	 * The feature id for the '<em><b>Enable Rich UI Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>Enable Fat Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__ENABLE_FAT_CLIENT = 2;

	/**
	 * The feature id for the '<em><b>Portal Expositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__PORTAL_EXPOSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Wayf Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__WAYF_PROFILE = 4;

	/**
	 * The feature id for the '<em><b>Security Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__SECURITY_PROFILE = 5;

	/**
	 * The number of structural features of the '<em>Target Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UserInfoPanelImpl <em>User Info Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UserInfoPanelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUserInfoPanel()
	 * @generated
	 */
	int USER_INFO_PANEL = 95;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

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
	int USER_DEFINED_PANEL = 96;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

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
	int WIZARD_PANEL = 97;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__SCROLLABLE = MULTI_PANEL__SCROLLABLE;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__PANELS = MULTI_PANEL__PANELS;

	/**
	 * The feature id for the '<em><b>Navigator Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__NAVIGATOR_ACTIVE = MULTI_PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__SWITCHER = MULTI_PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numbering Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL__NUMBERING_SCHEMA = MULTI_PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wizard Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_PANEL_FEATURE_COUNT = MULTI_PANEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppModuleImpl <em>App Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppModuleImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppModule()
	 * @generated
	 */
	int APP_MODULE = 98;

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
	 * The feature id for the '<em><b>Ext Security Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MODULE__EXT_SECURITY_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MODULE__SECURE = 3;

	/**
	 * The number of structural features of the '<em>App Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MODULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypeNamespaceImpl <em>Type Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypeNamespaceImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeNamespace()
	 * @generated
	 */
	int TYPE_NAMESPACE = 99;

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
	int APP_DATA_GROUP = 100;

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
	int MSG_BOX_PANEL = 101;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

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
	 * The feature id for the '<em><b>Show Std Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL__SHOW_STD_LEGEND = PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Msg Box Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.NOPCommandImpl <em>NOP Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.NOPCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getNOPCommand()
	 * @generated
	 */
	int NOP_COMMAND = 102;

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
	int WIDGETS_PANEL = 103;

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
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__SCROLLABLE = PANEL__SCROLLABLE;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__WIDGETS = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__SUMMARY = PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL__COLLAPSIBLE = PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Widgets Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGETS_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ScreenStateImpl <em>Screen State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ScreenStateImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getScreenState()
	 * @generated
	 */
	int SCREEN_STATE = 104;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Widgets On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATE__WIDGETS_ON = 1;

	/**
	 * The feature id for the '<em><b>Widgets Visible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATE__WIDGETS_VISIBLE = 2;

	/**
	 * The number of structural features of the '<em>Screen State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ScreenStatesImpl <em>Screen States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ScreenStatesImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getScreenStates()
	 * @generated
	 */
	int SCREEN_STATES = 105;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATES__STATES = 0;

	/**
	 * The number of structural features of the '<em>Screen States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ScreenStateCommandImpl <em>Screen State Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ScreenStateCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getScreenStateCommand()
	 * @generated
	 */
	int SCREEN_STATE_COMMAND = 106;

	/**
	 * The feature id for the '<em><b>Go To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATE_COMMAND__GO_TO = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Screen State Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_STATE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ShibbolethSSOImpl <em>Shibboleth SSO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ShibbolethSSOImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getShibbolethSSO()
	 * @generated
	 */
	int SHIBBOLETH_SSO = 107;

	/**
	 * The number of structural features of the '<em>Shibboleth SSO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIBBOLETH_SSO_FEATURE_COUNT = AUTENTICATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RoleImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 108;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Domain Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOMAIN_CODE = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RoleBasedSecurityConstraintImpl <em>Role Based Security Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RoleBasedSecurityConstraintImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRoleBasedSecurityConstraint()
	 * @generated
	 */
	int ROLE_BASED_SECURITY_CONSTRAINT = 109;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BASED_SECURITY_CONSTRAINT__VISIBLE = UI_SECURITY_CONSTRAINT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BASED_SECURITY_CONSTRAINT__ENABLED = UI_SECURITY_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BASED_SECURITY_CONSTRAINT__ROLE = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Based Security Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BASED_SECURITY_CONSTRAINT_FEATURE_COUNT = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.DeclarativeUIConstraintImpl <em>Declarative UI Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.DeclarativeUIConstraintImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDeclarativeUIConstraint()
	 * @generated
	 */
	int DECLARATIVE_UI_CONSTRAINT = 110;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_UI_CONSTRAINT__VISIBLE = UI_SECURITY_CONSTRAINT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_UI_CONSTRAINT__ENABLED = UI_SECURITY_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_UI_CONSTRAINT__LANGUAGE = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_UI_CONSTRAINT__SCRIPT = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declarative UI Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_UI_CONSTRAINT_FEATURE_COUNT = UI_SECURITY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.FileUploadImpl <em>File Upload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.FileUploadImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFileUpload()
	 * @generated
	 */
	int FILE_UPLOAD = 111;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD__MULTIPLE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Upload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UPLOAD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TabSwitcherImpl <em>Tab Switcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TabSwitcherImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTabSwitcher()
	 * @generated
	 */
	int TAB_SWITCHER = 112;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__NAME = COMMAND_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__LABEL = COMMAND_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__LAYOUT_SPEC = COMMAND_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__EVENT_HANDLERS = COMMAND_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__SECURITY_CONSTRAINTS = COMMAND_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__DEFAULT_VISIBLE = COMMAND_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__DEFAULT_ENABLED = COMMAND_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__TOOLTIP = COMMAND_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__ENABLE_ENRICHMENT = COMMAND_WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Function Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER__FUNCTION_SPECIFIER = COMMAND_WIDGET__FUNCTION_SPECIFIER;

	/**
	 * The number of structural features of the '<em>Tab Switcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SWITCHER_FEATURE_COUNT = COMMAND_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelDefImpl <em>Panel Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelDefImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDef()
	 * @generated
	 */
	int PANEL_DEF = 113;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__PANEL = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__PARAMS = 2;

	/**
	 * The feature id for the '<em><b>App Data Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__APP_DATA_DEFS = 3;

	/**
	 * The feature id for the '<em><b>Type Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__TYPE_DEFS = 4;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__ROLES = 5;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__ACTORS = 6;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__USE_CASES = 7;

	/**
	 * The feature id for the '<em><b>On Refresh Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__ON_REFRESH_COMMAND = 8;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__STATES = 9;

	/**
	 * The feature id for the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF__DEFAULT_STATE = 10;

	/**
	 * The number of structural features of the '<em>Panel Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PDefParamImpl <em>PDef Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PDefParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefParam()
	 * @generated
	 */
	int PDEF_PARAM = 114;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_PARAM__NAME = 0;

	/**
	 * The number of structural features of the '<em>PDef Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_PARAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppDataMappingParamImpl <em>App Data Mapping Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppDataMappingParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataMappingParam()
	 * @generated
	 */
	int APP_DATA_MAPPING_PARAM = 115;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_MAPPING_PARAM__NAME = PDEF_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Def App Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_MAPPING_PARAM__DEF_APP_DATA = PDEF_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App Data Mapping Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_MAPPING_PARAM_FEATURE_COUNT = PDEF_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypeDefMappingParamImpl <em>Type Def Mapping Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypeDefMappingParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeDefMappingParam()
	 * @generated
	 */
	int TYPE_DEF_MAPPING_PARAM = 116;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_MAPPING_PARAM__NAME = PDEF_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Def Type Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF = PDEF_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Def Mapping Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_MAPPING_PARAM_FEATURE_COUNT = PDEF_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UseCaseMappingParamImpl <em>Use Case Mapping Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UseCaseMappingParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUseCaseMappingParam()
	 * @generated
	 */
	int USE_CASE_MAPPING_PARAM = 117;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MAPPING_PARAM__NAME = PDEF_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Def Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MAPPING_PARAM__DEF_USE_CASE = PDEF_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Use Case Mapping Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MAPPING_PARAM_FEATURE_COUNT = PDEF_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RoleMappingParamImpl <em>Role Mapping Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RoleMappingParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRoleMappingParam()
	 * @generated
	 */
	int ROLE_MAPPING_PARAM = 118;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPING_PARAM__NAME = PDEF_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Def Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPING_PARAM__DEF_ROLE = PDEF_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Mapping Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPING_PARAM_FEATURE_COUNT = PDEF_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActorMappingParamImpl <em>Actor Mapping Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActorMappingParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActorMappingParam()
	 * @generated
	 */
	int ACTOR_MAPPING_PARAM = 119;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_MAPPING_PARAM__NAME = PDEF_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Def Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_MAPPING_PARAM__DEF_ACTOR = PDEF_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Mapping Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_MAPPING_PARAM_FEATURE_COUNT = PDEF_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelDefUseImpl <em>Panel Def Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelDefUseImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDefUse()
	 * @generated
	 */
	int PANEL_DEF_USE = 120;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE__SCROLLABLE = PANEL__SCROLLABLE;

	/**
	 * The feature id for the '<em><b>Panel Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE__PANEL_DEF = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE__CONFIG = PANEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Panel Def Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_USE_FEATURE_COUNT = PANEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PDefParamValImpl <em>PDef Param Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PDefParamValImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefParamVal()
	 * @generated
	 */
	int PDEF_PARAM_VAL = 121;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_PARAM_VAL__PARAM = 0;

	/**
	 * The number of structural features of the '<em>PDef Param Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_PARAM_VAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AppDataMappingPDefValImpl <em>App Data Mapping PDef Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AppDataMappingPDefValImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataMappingPDefVal()
	 * @generated
	 */
	int APP_DATA_MAPPING_PDEF_VAL = 122;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_MAPPING_PDEF_VAL__PARAM = PDEF_PARAM_VAL__PARAM;

	/**
	 * The feature id for the '<em><b>Actual App Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA = PDEF_PARAM_VAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>App Data Mapping PDef Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DATA_MAPPING_PDEF_VAL_FEATURE_COUNT = PDEF_PARAM_VAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TypeDefMappingPDefValImpl <em>Type Def Mapping PDef Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TypeDefMappingPDefValImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeDefMappingPDefVal()
	 * @generated
	 */
	int TYPE_DEF_MAPPING_PDEF_VAL = 123;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_MAPPING_PDEF_VAL__PARAM = PDEF_PARAM_VAL__PARAM;

	/**
	 * The feature id for the '<em><b>Actual Type Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF = PDEF_PARAM_VAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Def Mapping PDef Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_MAPPING_PDEF_VAL_FEATURE_COUNT = PDEF_PARAM_VAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.UCMappingPDefValImpl <em>UC Mapping PDef Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.UCMappingPDefValImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUCMappingPDefVal()
	 * @generated
	 */
	int UC_MAPPING_PDEF_VAL = 124;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MAPPING_PDEF_VAL__PARAM = PDEF_PARAM_VAL__PARAM;

	/**
	 * The feature id for the '<em><b>Actual Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE = PDEF_PARAM_VAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UC Mapping PDef Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MAPPING_PDEF_VAL_FEATURE_COUNT = PDEF_PARAM_VAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RoleMappingPDefValImpl <em>Role Mapping PDef Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RoleMappingPDefValImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRoleMappingPDefVal()
	 * @generated
	 */
	int ROLE_MAPPING_PDEF_VAL = 125;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPING_PDEF_VAL__PARAM = PDEF_PARAM_VAL__PARAM;

	/**
	 * The feature id for the '<em><b>Actual Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE = PDEF_PARAM_VAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Mapping PDef Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MAPPING_PDEF_VAL_FEATURE_COUNT = PDEF_PARAM_VAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActorMappingPDefValImpl <em>Actor Mapping PDef Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActorMappingPDefValImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActorMappingPDefVal()
	 * @generated
	 */
	int ACTOR_MAPPING_PDEF_VAL = 126;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_MAPPING_PDEF_VAL__PARAM = PDEF_PARAM_VAL__PARAM;

	/**
	 * The feature id for the '<em><b>Actual Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR = PDEF_PARAM_VAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Mapping PDef Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_MAPPING_PDEF_VAL_FEATURE_COUNT = PDEF_PARAM_VAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PDefUseConfigImpl <em>PDef Use Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PDefUseConfigImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefUseConfig()
	 * @generated
	 */
	int PDEF_USE_CONFIG = 127;

	/**
	 * The feature id for the '<em><b>Param Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_USE_CONFIG__PARAM_VALUES = 0;

	/**
	 * The number of structural features of the '<em>PDef Use Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_USE_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActivationModelImpl <em>Activation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActivationModelImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActivationModel()
	 * @generated
	 */
	int ACTIVATION_MODEL = 128;

	/**
	 * The feature id for the '<em><b>Activation Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_MODEL__ACTIVATION_PARAMS = 0;

	/**
	 * The number of structural features of the '<em>Activation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActivationParamImpl <em>Activation Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActivationParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActivationParam()
	 * @generated
	 */
	int ACTIVATION_PARAM = 129;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PARAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Activation Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.BeginEditCommandImpl <em>Begin Edit Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.BeginEditCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getBeginEditCommand()
	 * @generated
	 */
	int BEGIN_EDIT_COMMAND = 130;

	/**
	 * The feature id for the '<em><b>Data Edited</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_EDIT_COMMAND__DATA_EDITED = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Begin Edit Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_EDIT_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.EndEditCommandImpl <em>End Edit Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.EndEditCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEndEditCommand()
	 * @generated
	 */
	int END_EDIT_COMMAND = 131;

	/**
	 * The feature id for the '<em><b>Data Edited</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EDIT_COMMAND__DATA_EDITED = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EDIT_COMMAND__UNDO = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End Edit Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EDIT_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl <em>Chk Edit Status Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getChkEditStatusCommand()
	 * @generated
	 */
	int CHK_EDIT_STATUS_COMMAND = 132;

	/**
	 * The feature id for the '<em><b>Data Checked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHK_EDIT_STATUS_COMMAND__DATA_CHECKED = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Do If Changed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do If Not Changed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Chk Edit Status Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHK_EDIT_STATUS_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelDefStateImpl <em>Panel Def State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelDefStateImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDefState()
	 * @generated
	 */
	int PANEL_DEF_STATE = 133;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Widgets On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_STATE__WIDGETS_ON = 1;

	/**
	 * The feature id for the '<em><b>Widgets Visible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_STATE__WIDGETS_VISIBLE = 2;

	/**
	 * The number of structural features of the '<em>Panel Def State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PDefStateCommandImpl <em>PDef State Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PDefStateCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefStateCommand()
	 * @generated
	 */
	int PDEF_STATE_COMMAND = 134;

	/**
	 * The feature id for the '<em><b>Go To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_STATE_COMMAND__GO_TO = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PDef Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_STATE_COMMAND__PDEF_USE = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PDef State Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEF_STATE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelDefStatesImpl <em>Panel Def States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelDefStatesImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDefStates()
	 * @generated
	 */
	int PANEL_DEF_STATES = 135;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_STATES__STATES = 0;

	/**
	 * The number of structural features of the '<em>Panel Def States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_DEF_STATES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TableCustomizationParamImpl <em>Table Customization Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TableCustomizationParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTableCustomizationParam()
	 * @generated
	 */
	int TABLE_CUSTOMIZATION_PARAM = 136;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CUSTOMIZATION_PARAM__NAME = PDEF_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Base Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CUSTOMIZATION_PARAM__BASE_TABLE = PDEF_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Customization Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CUSTOMIZATION_PARAM_FEATURE_COUNT = PDEF_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ExtraColumnImpl <em>Extra Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ExtraColumnImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExtraColumn()
	 * @generated
	 */
	int EXTRA_COLUMN = 137;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__SELECTOR = COLUMN__SELECTOR;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__LABEL = COLUMN__LABEL;

	/**
	 * The feature id for the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__SORTABLE = COLUMN__SORTABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__EDITABLE = COLUMN__EDITABLE;

	/**
	 * The feature id for the '<em><b>Event Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__EVENT_ACTIVE = COLUMN__EVENT_ACTIVE;

	/**
	 * The feature id for the '<em><b>Editable Flag Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__EDITABLE_FLAG_SELECTOR = COLUMN__EDITABLE_FLAG_SELECTOR;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__MULTI_DATA_BINDING = COLUMN__MULTI_DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Multidata Key Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__MULTIDATA_KEY_SELECTOR = COLUMN__MULTIDATA_KEY_SELECTOR;

	/**
	 * The feature id for the '<em><b>Multidata Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__MULTIDATA_VALUE_SELECTOR = COLUMN__MULTIDATA_VALUE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Multidata Property Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__MULTIDATA_PROPERTY_SELECTOR = COLUMN__MULTIDATA_PROPERTY_SELECTOR;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__TOOLTIP = COLUMN__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Active Flag Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__ACTIVE_FLAG_SELECTOR = COLUMN__ACTIVE_FLAG_SELECTOR;

	/**
	 * The feature id for the '<em><b>Field Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__FIELD_MAX_LENGTH = COLUMN__FIELD_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Custom Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__CUSTOM_DECORATOR = COLUMN__CUSTOM_DECORATOR;

	/**
	 * The feature id for the '<em><b>Custom Sort Property Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__CUSTOM_SORT_PROPERTY_SELECTOR = COLUMN__CUSTOM_SORT_PROPERTY_SELECTOR;

	/**
	 * The feature id for the '<em><b>Field Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__FIELD_LENGTH = COLUMN__FIELD_LENGTH;

	/**
	 * The feature id for the '<em><b>Insert After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN__INSERT_AFTER = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extra Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TableCustomizationPDefValImpl <em>Table Customization PDef Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TableCustomizationPDefValImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTableCustomizationPDefVal()
	 * @generated
	 */
	int TABLE_CUSTOMIZATION_PDEF_VAL = 138;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CUSTOMIZATION_PDEF_VAL__PARAM = PDEF_PARAM_VAL__PARAM;

	/**
	 * The feature id for the '<em><b>Extra Cols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS = PDEF_PARAM_VAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden Cols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS = PDEF_PARAM_VAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Customization PDef Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CUSTOMIZATION_PDEF_VAL_FEATURE_COUNT = PDEF_PARAM_VAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CustomCartridgeImpl <em>Custom Cartridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CustomCartridgeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomCartridge()
	 * @generated
	 */
	int CUSTOM_CARTRIDGE = 139;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CARTRIDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Crt ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CARTRIDGE__CRT_ID = 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CARTRIDGE__TEMPLATES = 2;

	/**
	 * The number of structural features of the '<em>Custom Cartridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CARTRIDGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CustomTemplateImpl <em>Custom Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CustomTemplateImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomTemplate()
	 * @generated
	 */
	int CUSTOM_TEMPLATE = 140;

	/**
	 * The feature id for the '<em><b>Tpl ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TEMPLATE__TPL_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TEMPLATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Model Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TEMPLATE__MODEL_SLOTS = 2;

	/**
	 * The number of structural features of the '<em>Custom Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ModelSlotDefImpl <em>Model Slot Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ModelSlotDefImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getModelSlotDef()
	 * @generated
	 */
	int MODEL_SLOT_DEF = 141;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SLOT_DEF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SLOT_DEF__MODEL_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Model Slot Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SLOT_DEF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ModelSlotImpl <em>Model Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ModelSlotImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getModelSlot()
	 * @generated
	 */
	int MODEL_SLOT = 142;

	/**
	 * The feature id for the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SLOT__DEF = 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SLOT__VAL = 1;

	/**
	 * The number of structural features of the '<em>Model Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SLOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ClearAppdataCommandImpl <em>Clear Appdata Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ClearAppdataCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getClearAppdataCommand()
	 * @generated
	 */
	int CLEAR_APPDATA_COMMAND = 143;

	/**
	 * The feature id for the '<em><b>App Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_APPDATA_COMMAND__APP_DATA = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clear Appdata Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_APPDATA_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MapViewImpl <em>Map View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MapViewImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMapView()
	 * @generated
	 */
	int MAP_VIEW = 144;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__MULTI_DATA_BINDING = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__MAP_ID = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Envelope Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__START_ENVELOPE_SPEC = DATA_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Envelope Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__MAX_ENVELOPE_SPEC = DATA_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale Envelope Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__SCALE_ENVELOPE_SPEC = DATA_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__NUM_LEVELS = DATA_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Edit Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__EDIT_DATA_BINDING = DATA_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gadgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__GADGETS = DATA_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>No Click When Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__NO_CLICK_WHEN_DISABLED = DATA_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>No Edit When Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__NO_EDIT_WHEN_DISABLED = DATA_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>No Zoom When Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__NO_ZOOM_WHEN_DISABLED = DATA_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>No Pan When Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__NO_PAN_WHEN_DISABLED = DATA_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Map View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PointImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 145;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MapEnvelopeImpl <em>Map Envelope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MapEnvelopeImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMapEnvelope()
	 * @generated
	 */
	int MAP_ENVELOPE = 146;

	/**
	 * The feature id for the '<em><b>North East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENVELOPE__NORTH_EAST = 0;

	/**
	 * The feature id for the '<em><b>South West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENVELOPE__SOUTH_WEST = 1;

	/**
	 * The number of structural features of the '<em>Map Envelope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENVELOPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PortalProfileImpl <em>Portal Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PortalProfileImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPortalProfile()
	 * @generated
	 */
	int PORTAL_PROFILE = 147;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PROFILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Res Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PROFILE__RES_MODULES = 1;

	/**
	 * The feature id for the '<em><b>Where Are You From Portal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PROFILE__WHERE_ARE_YOU_FROM_PORTAL_CODE = 2;

	/**
	 * The feature id for the '<em><b>Resource Provider Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PROFILE__RESOURCE_PROVIDER_CODE = 3;

	/**
	 * The number of structural features of the '<em>Portal Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_PROFILE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WebResourceModuleImpl <em>Web Resource Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WebResourceModuleImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWebResourceModule()
	 * @generated
	 */
	int WEB_RESOURCE_MODULE = 148;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_MODULE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Deployment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Repart Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_MODULE__REPART_MODULE = 3;

	/**
	 * The number of structural features of the '<em>Web Resource Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RESOURCE_MODULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.StdWebResourceModuleImpl <em>Std Web Resource Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.StdWebResourceModuleImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStdWebResourceModule()
	 * @generated
	 */
	int STD_WEB_RESOURCE_MODULE = 149;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_WEB_RESOURCE_MODULE__NAME = WEB_RESOURCE_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_WEB_RESOURCE_MODULE__VERSION = WEB_RESOURCE_MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Deployment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE = WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Repart Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_WEB_RESOURCE_MODULE__REPART_MODULE = WEB_RESOURCE_MODULE__REPART_MODULE;

	/**
	 * The feature id for the '<em><b>Std Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_WEB_RESOURCE_MODULE__STD_NAME = WEB_RESOURCE_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Std Web Resource Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_WEB_RESOURCE_MODULE_FEATURE_COUNT = WEB_RESOURCE_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RepartArtifactImpl <em>Repart Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RepartArtifactImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRepartArtifact()
	 * @generated
	 */
	int REPART_ARTIFACT = 150;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_ARTIFACT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Repart Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RepartModuleImpl <em>Repart Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RepartModuleImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRepartModule()
	 * @generated
	 */
	int REPART_MODULE = 151;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_MODULE__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_MODULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_MODULE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_MODULE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_MODULE__ARTIFACTS = 4;

	/**
	 * The number of structural features of the '<em>Repart Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPART_MODULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.BreadcrumbImpl <em>Breadcrumb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.BreadcrumbImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getBreadcrumb()
	 * @generated
	 */
	int BREADCRUMB = 152;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__SCROLLABLE = PANEL__SCROLLABLE;

	/**
	 * The number of structural features of the '<em>Breadcrumb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_FEATURE_COUNT = PANEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl <em>Map View Gadgets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MapViewGadgetsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMapViewGadgets()
	 * @generated
	 */
	int MAP_VIEW_GADGETS = 153;

	/**
	 * The feature id for the '<em><b>Layer Switcher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__LAYER_SWITCHER = 0;

	/**
	 * The feature id for the '<em><b>Background Map Map Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Background Map Switcher Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Background Photo Aerial Map Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Background Photo Aerial Switcher Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Point Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE = 5;

	/**
	 * The feature id for the '<em><b>Line Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE = 6;

	/**
	 * The feature id for the '<em><b>Polygon Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE = 7;

	/**
	 * The feature id for the '<em><b>Modify Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE = 8;

	/**
	 * The number of structural features of the '<em>Map View Gadgets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_GADGETS_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PortalExpositionImpl <em>Portal Exposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PortalExpositionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPortalExposition()
	 * @generated
	 */
	int PORTAL_EXPOSITION = 154;

	/**
	 * The feature id for the '<em><b>Portal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_EXPOSITION__PORTAL = 0;

	/**
	 * The feature id for the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_EXPOSITION__AREA_CODE = 1;

	/**
	 * The number of structural features of the '<em>Portal Exposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTAL_EXPOSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CPCommandImpl <em>CP Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CPCommandImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCPCommand()
	 * @generated
	 */
	int CP_COMMAND = 155;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_COMMAND__EXECUTE = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_COMMAND__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>CP Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CPCommandsImpl <em>CP Commands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CPCommandsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCPCommands()
	 * @generated
	 */
	int CP_COMMANDS = 156;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_COMMANDS__COMMANDS = 0;

	/**
	 * The number of structural features of the '<em>CP Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_COMMANDS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SecurityProfileImpl <em>Security Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SecurityProfileImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSecurityProfile()
	 * @generated
	 */
	int SECURITY_PROFILE = 157;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROFILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ext Auth Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROFILE__EXT_AUTH_GUARD = 1;

	/**
	 * The feature id for the '<em><b>Int Auth Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROFILE__INT_AUTH_GUARD = 2;

	/**
	 * The feature id for the '<em><b>Id Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROFILE__ID_ADAPTER = 3;

	/**
	 * The feature id for the '<em><b>Pep Impl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROFILE__PEP_IMPL = 4;

	/**
	 * The number of structural features of the '<em>Security Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROFILE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ExternalAuthenticationGuardImpl <em>External Authentication Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ExternalAuthenticationGuardImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExternalAuthenticationGuard()
	 * @generated
	 */
	int EXTERNAL_AUTHENTICATION_GUARD = 158;

	/**
	 * The number of structural features of the '<em>External Authentication Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_AUTHENTICATION_GUARD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.InternalAuthenticationGuardImpl <em>Internal Authentication Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.InternalAuthenticationGuardImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInternalAuthenticationGuard()
	 * @generated
	 */
	int INTERNAL_AUTHENTICATION_GUARD = 159;

	/**
	 * The feature id for the '<em><b>Login Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_AUTHENTICATION_GUARD__PARAMS = 1;

	/**
	 * The number of structural features of the '<em>Internal Authentication Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_AUTHENTICATION_GUARD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WAYFRequestAdapterImpl <em>WAYF Request Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WAYFRequestAdapterImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWAYFRequestAdapter()
	 * @generated
	 */
	int WAYF_REQUEST_ADAPTER = 160;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYF_REQUEST_ADAPTER__SOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Info Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYF_REQUEST_ADAPTER__INFO_SOURCE_NAME = 1;

	/**
	 * The number of structural features of the '<em>WAYF Request Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYF_REQUEST_ADAPTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.WAYFProfileImpl <em>WAYF Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.WAYFProfileImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWAYFProfile()
	 * @generated
	 */
	int WAYF_PROFILE = 161;

	/**
	 * The feature id for the '<em><b>Request Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYF_PROFILE__REQUEST_ADAPTER = 0;

	/**
	 * The number of structural features of the '<em>WAYF Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYF_PROFILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.LoginUIImpl <em>Login UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.LoginUIImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLoginUI()
	 * @generated
	 */
	int LOGIN_UI = 162;

	/**
	 * The feature id for the '<em><b>Ui Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UI__UI_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Login UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UI_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.LoginModuleImpl <em>Login Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.LoginModuleImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLoginModule()
	 * @generated
	 */
	int LOGIN_MODULE = 163;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_MODULE__INTERNAL = 0;

	/**
	 * The feature id for the '<em><b>Login UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_MODULE__LOGIN_UI = 1;

	/**
	 * The number of structural features of the '<em>Login Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_MODULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl <em>Identity Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.IdentityAdapterImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getIdentityAdapter()
	 * @generated
	 */
	int IDENTITY_ADAPTER = 164;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ADAPTER__SOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Info Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ADAPTER__INFO_SOURCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ticket Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ADAPTER__TICKET_VERIFY_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Inline Code Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS = 3;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ADAPTER__PARAMS = 4;

	/**
	 * The number of structural features of the '<em>Identity Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ADAPTER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.EnvConfigParamImpl <em>Env Config Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.EnvConfigParamImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEnvConfigParam()
	 * @generated
	 */
	int ENV_CONFIG_PARAM = 165;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONFIG_PARAM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Env Config Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONFIG_PARAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.EnvConfigParamsImpl <em>Env Config Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.EnvConfigParamsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEnvConfigParams()
	 * @generated
	 */
	int ENV_CONFIG_PARAMS = 166;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONFIG_PARAMS__PARAMS = 0;

	/**
	 * The number of structural features of the '<em>Env Config Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONFIG_PARAMS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PEPImplementationImpl <em>PEP Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PEPImplementationImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPEPImplementation()
	 * @generated
	 */
	int PEP_IMPLEMENTATION = 167;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEP_IMPLEMENTATION__PARAMS = 0;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEP_IMPLEMENTATION__CUSTOM = 1;

	/**
	 * The feature id for the '<em><b>Inline Code Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS = 2;

	/**
	 * The number of structural features of the '<em>PEP Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEP_IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl <em>Inline Code Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInlineCodeSnippet()
	 * @generated
	 */
	int INLINE_CODE_SNIPPET = 168;

	/**
	 * The feature id for the '<em><b>Snippet Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_SNIPPET__SNIPPET_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Snippet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_SNIPPET__SNIPPET_NAME = 1;

	/**
	 * The feature id for the '<em><b>Snippet Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_SNIPPET__SNIPPET_CODE = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_SNIPPET__LANG = 3;

	/**
	 * The number of structural features of the '<em>Inline Code Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_SNIPPET_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AnnotationImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 170;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.AnnotationDetailImpl <em>Annotation Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.AnnotationDetailImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAnnotationDetail()
	 * @generated
	 */
	int ANNOTATION_DETAIL = 171;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_DETAIL__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_DETAIL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_DETAIL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CaptchaImpl <em>Captcha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CaptchaImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCaptcha()
	 * @generated
	 */
	int CAPTCHA = 172;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__LAYOUT_SPEC = WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__EVENT_HANDLERS = WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__SECURITY_CONSTRAINTS = WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__DEFAULT_VISIBLE = WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__DEFAULT_ENABLED = WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__TOOLTIP = WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA__ENABLE_ENRICHMENT = WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The number of structural features of the '<em>Captcha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SliderImpl <em>Slider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SliderImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSlider()
	 * @generated
	 */
	int SLIDER = 173;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__NAME = DATA_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__LABEL = DATA_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__LAYOUT_SPEC = DATA_WIDGET__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__EVENT_HANDLERS = DATA_WIDGET__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Security Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__SECURITY_CONSTRAINTS = DATA_WIDGET__SECURITY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Default Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__DEFAULT_VISIBLE = DATA_WIDGET__DEFAULT_VISIBLE;

	/**
	 * The feature id for the '<em><b>Default Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__DEFAULT_ENABLED = DATA_WIDGET__DEFAULT_ENABLED;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__TOOLTIP = DATA_WIDGET__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__ENABLE_ENRICHMENT = DATA_WIDGET__ENABLE_ENRICHMENT;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__DATABINDING = DATA_WIDGET__DATABINDING;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__REQUIRED = DATA_WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__MULTI_DATA_BINDING = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Collection Data As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__USE_COLLECTION_DATA_AS = DATA_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__STATIC_LOWER_BOUND = DATA_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Static Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__STATIC_UPPER_BOUND = DATA_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Static Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__STATIC_STEP = DATA_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Slider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.WidgetDataType <em>Widget Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.WidgetDataType
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetDataType()
	 * @generated
	 */
	int WIDGET_DATA_TYPE = 174;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.UDLRCSpecConstants <em>UDLRC Spec Constants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.UDLRCSpecConstants
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCSpecConstants()
	 * @generated
	 */
	int UDLRC_SPEC_CONSTANTS = 175;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.MethodProtectionTypes <em>Method Protection Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.MethodProtectionTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMethodProtectionTypes()
	 * @generated
	 */
	int METHOD_PROTECTION_TYPES = 176;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.EventTypes <em>Event Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEventTypes()
	 * @generated
	 */
	int EVENT_TYPES = 177;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.DataLifetimeType <em>Data Lifetime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.DataLifetimeType
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDataLifetimeType()
	 * @generated
	 */
	int DATA_LIFETIME_TYPE = 178;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.SimpleTypeCodes <em>Simple Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.SimpleTypeCodes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSimpleTypeCodes()
	 * @generated
	 */
	int SIMPLE_TYPE_CODES = 179;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.PortalNames <em>Portal Names</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.PortalNames
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPortalNames()
	 * @generated
	 */
	int PORTAL_NAMES = 180;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.LogoutActionTypes <em>Logout Action Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.LogoutActionTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLogoutActionTypes()
	 * @generated
	 */
	int LOGOUT_ACTION_TYPES = 181;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.TargetPlatformCodes <em>Target Platform Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.TargetPlatformCodes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTargetPlatformCodes()
	 * @generated
	 */
	int TARGET_PLATFORM_CODES = 182;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.MessageSeverity <em>Message Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.MessageSeverity
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMessageSeverity()
	 * @generated
	 */
	int MESSAGE_SEVERITY = 183;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.CommandStyles <em>Command Styles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.CommandStyles
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandStyles()
	 * @generated
	 */
	int COMMAND_STYLES = 184;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.InlineScriptingLanguage <em>Inline Scripting Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.InlineScriptingLanguage
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInlineScriptingLanguage()
	 * @generated
	 */
	int INLINE_SCRIPTING_LANGUAGE = 185;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.LogicAggregationTypes <em>Logic Aggregation Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.LogicAggregationTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLogicAggregationTypes()
	 * @generated
	 */
	int LOGIC_AGGREGATION_TYPES = 186;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.CustomCartridgeID <em>Custom Cartridge ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.CustomCartridgeID
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomCartridgeID()
	 * @generated
	 */
	int CUSTOM_CARTRIDGE_ID = 187;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.CommandFunctions <em>Command Functions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.CommandFunctions
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandFunctions()
	 * @generated
	 */
	int COMMAND_FUNCTIONS = 188;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.WebResModuleDeployTypes <em>Web Res Module Deploy Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.WebResModuleDeployTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWebResModuleDeployTypes()
	 * @generated
	 */
	int WEB_RES_MODULE_DEPLOY_TYPES = 189;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.StdWebResModuleNames <em>Std Web Res Module Names</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.StdWebResModuleNames
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStdWebResModuleNames()
	 * @generated
	 */
	int STD_WEB_RES_MODULE_NAMES = 190;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.RepartModuleTypes <em>Repart Module Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.RepartModuleTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRepartModuleTypes()
	 * @generated
	 */
	int REPART_MODULE_TYPES = 191;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.WizardNumberingTypes <em>Wizard Numbering Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.WizardNumberingTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWizardNumberingTypes()
	 * @generated
	 */
	int WIZARD_NUMBERING_TYPES = 192;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.CPCommandExecutionTypes <em>CP Command Execution Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.CPCommandExecutionTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCPCommandExecutionTypes()
	 * @generated
	 */
	int CP_COMMAND_EXECUTION_TYPES = 193;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.TicketVerifyMethod <em>Ticket Verify Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.TicketVerifyMethod
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTicketVerifyMethod()
	 * @generated
	 */
	int TICKET_VERIFY_METHOD = 194;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.LoginUITypes <em>Login UI Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.LoginUITypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLoginUITypes()
	 * @generated
	 */
	int LOGIN_UI_TYPES = 195;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.InfoSourceTypes <em>Info Source Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.InfoSourceTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInfoSourceTypes()
	 * @generated
	 */
	int INFO_SOURCE_TYPES = 196;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.TreeSelectionTypes <em>Tree Selection Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.TreeSelectionTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTreeSelectionTypes()
	 * @generated
	 */
	int TREE_SELECTION_TYPES = 197;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes <em>Slider Collection Values Usage Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSliderCollectionValuesUsageTypes()
	 * @generated
	 */
	int SLIDER_COLLECTION_VALUES_USAGE_TYPES = 198;


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
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ApplicationArea#getExtModules <em>Ext Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ext Modules</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getExtModules()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_ExtModules();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ApplicationArea#getHomePage <em>Home Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home Page</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getHomePage()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_HomePage();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Menubar#isRemoteInfoBox <em>Remote Info Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Info Box</em>'.
	 * @see it.csi.mddtools.guigen.Menubar#isRemoteInfoBox()
	 * @see #getMenubar()
	 * @generated
	 */
	EAttribute getMenubar_RemoteInfoBox();

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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ContentPanel#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>States</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getStates()
	 * @see #getContentPanel()
	 * @generated
	 */
	EReference getContentPanel_States();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ContentPanel#getDefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default State</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getDefaultState()
	 * @see #getContentPanel()
	 * @generated
	 */
	EReference getContentPanel_DefaultState();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ContentPanel#getCpCommands <em>Cp Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cp Commands</em>'.
	 * @see it.csi.mddtools.guigen.ContentPanel#getCpCommands()
	 * @see #getContentPanel()
	 * @generated
	 */
	EReference getContentPanel_CpCommands();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.FormPanel#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see it.csi.mddtools.guigen.FormPanel#isCollapsible()
	 * @see #getFormPanel()
	 * @generated
	 */
	EAttribute getFormPanel_Collapsible();

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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.TabSetPanel#getSwitcher <em>Switcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switcher</em>'.
	 * @see it.csi.mddtools.guigen.TabSetPanel#getSwitcher()
	 * @see #getTabSetPanel()
	 * @generated
	 */
	EReference getTabSetPanel_Switcher();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Panel#isScrollable <em>Scrollable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrollable</em>'.
	 * @see it.csi.mddtools.guigen.Panel#isScrollable()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Scrollable();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Widget#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see it.csi.mddtools.guigen.Widget#getTooltip()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Widget#getEnableEnrichment <em>Enable Enrichment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Enrichment</em>'.
	 * @see it.csi.mddtools.guigen.Widget#getEnableEnrichment()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_EnableEnrichment();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CommandWidget#getFunctionSpecifier <em>Function Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Specifier</em>'.
	 * @see it.csi.mddtools.guigen.CommandWidget#getFunctionSpecifier()
	 * @see #getCommandWidget()
	 * @generated
	 */
	EAttribute getCommandWidget_FunctionSpecifier();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TextField#getFieldMaxLength <em>Field Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Max Length</em>'.
	 * @see it.csi.mddtools.guigen.TextField#getFieldMaxLength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_FieldMaxLength();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Calendar#isSelectYear <em>Select Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Year</em>'.
	 * @see it.csi.mddtools.guigen.Calendar#isSelectYear()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_SelectYear();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Calendar#isSelectMonth <em>Select Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Month</em>'.
	 * @see it.csi.mddtools.guigen.Calendar#isSelectMonth()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_SelectMonth();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Calendar#getSelectYearRange <em>Select Year Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Year Range</em>'.
	 * @see it.csi.mddtools.guigen.Calendar#getSelectYearRange()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_SelectYearRange();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ComboBox#isOmitHeaderValue <em>Omit Header Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Header Value</em>'.
	 * @see it.csi.mddtools.guigen.ComboBox#isOmitHeaderValue()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_OmitHeaderValue();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ComboBox#getFieldLength <em>Field Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Length</em>'.
	 * @see it.csi.mddtools.guigen.ComboBox#getFieldLength()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_FieldLength();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ComboBox#getVisibleLines <em>Visible Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible Lines</em>'.
	 * @see it.csi.mddtools.guigen.ComboBox#getVisibleLines()
	 * @see #getComboBox()
	 * @generated
	 */
	EAttribute getComboBox_VisibleLines();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Table#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see it.csi.mddtools.guigen.Table#getSummary()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Summary();

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
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.GUIModel#getExtSecurityModel <em>Ext Security Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ext Security Model</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getExtSecurityModel()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_ExtSecurityModel();

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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.GUIModel#getActivationModel <em>Activation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Model</em>'.
	 * @see it.csi.mddtools.guigen.GUIModel#getActivationModel()
	 * @see #getGUIModel()
	 * @generated
	 */
	EReference getGUIModel_ActivationModel();

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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.RadioButtons#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see it.csi.mddtools.guigen.RadioButtons#getLayout()
	 * @see #getRadioButtons()
	 * @generated
	 */
	EReference getRadioButtons_Layout();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PanelLayout#getColumnSizes <em>Column Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Sizes</em>'.
	 * @see it.csi.mddtools.guigen.PanelLayout#getColumnSizes()
	 * @see #getPanelLayout()
	 * @generated
	 */
	EAttribute getPanelLayout_ColumnSizes();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getEditableFlagSelector <em>Editable Flag Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable Flag Selector</em>'.
	 * @see it.csi.mddtools.guigen.Column#getEditableFlagSelector()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_EditableFlagSelector();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.Column#getMultiDataBinding <em>Multi Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Data Binding</em>'.
	 * @see it.csi.mddtools.guigen.Column#getMultiDataBinding()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_MultiDataBinding();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getMultidataKeySelector <em>Multidata Key Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multidata Key Selector</em>'.
	 * @see it.csi.mddtools.guigen.Column#getMultidataKeySelector()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_MultidataKeySelector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getMultidataValueSelector <em>Multidata Value Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multidata Value Selector</em>'.
	 * @see it.csi.mddtools.guigen.Column#getMultidataValueSelector()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_MultidataValueSelector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getMultidataPropertySelector <em>Multidata Property Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multidata Property Selector</em>'.
	 * @see it.csi.mddtools.guigen.Column#getMultidataPropertySelector()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_MultidataPropertySelector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see it.csi.mddtools.guigen.Column#getTooltip()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getActiveFlagSelector <em>Active Flag Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Flag Selector</em>'.
	 * @see it.csi.mddtools.guigen.Column#getActiveFlagSelector()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ActiveFlagSelector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getFieldMaxLength <em>Field Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Max Length</em>'.
	 * @see it.csi.mddtools.guigen.Column#getFieldMaxLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_FieldMaxLength();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#isCustomDecorator <em>Custom Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Decorator</em>'.
	 * @see it.csi.mddtools.guigen.Column#isCustomDecorator()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_CustomDecorator();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getCustomSortPropertySelector <em>Custom Sort Property Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Sort Property Selector</em>'.
	 * @see it.csi.mddtools.guigen.Column#getCustomSortPropertySelector()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_CustomSortPropertySelector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getFieldLength <em>Field Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Length</em>'.
	 * @see it.csi.mddtools.guigen.Column#getFieldLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_FieldLength();

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
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ExecCommand#getCustomTemplate <em>Custom Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Template</em>'.
	 * @see it.csi.mddtools.guigen.ExecCommand#getCustomTemplate()
	 * @see #getExecCommand()
	 * @generated
	 */
	EReference getExecCommand_CustomTemplate();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ExecCommand#getExtraModels <em>Extra Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extra Models</em>'.
	 * @see it.csi.mddtools.guigen.ExecCommand#getExtraModels()
	 * @see #getExecCommand()
	 * @generated
	 */
	EReference getExecCommand_ExtraModels();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ExecCommand#getInlineCodeSnippets <em>Inline Code Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inline Code Snippets</em>'.
	 * @see it.csi.mddtools.guigen.ExecCommand#getInlineCodeSnippets()
	 * @see #getExecCommand()
	 * @generated
	 */
	EReference getExecCommand_InlineCodeSnippets();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.EventHandler#getMethodProtection <em>Method Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Protection</em>'.
	 * @see it.csi.mddtools.guigen.EventHandler#getMethodProtection()
	 * @see #getEventHandler()
	 * @generated
	 */
	EAttribute getEventHandler_MethodProtection();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.guigen.EventHandler#getEventSpecifiers <em>Event Specifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Specifiers</em>'.
	 * @see it.csi.mddtools.guigen.EventHandler#getEventSpecifiers()
	 * @see #getEventHandler()
	 * @generated
	 */
	EAttribute getEventHandler_EventSpecifiers();

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
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.CommandOnWidgets#getTargetMenuElement <em>Target Menu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Menu Element</em>'.
	 * @see it.csi.mddtools.guigen.CommandOnWidgets#getTargetMenuElement()
	 * @see #getCommandOnWidgets()
	 * @generated
	 */
	EReference getCommandOnWidgets_TargetMenuElement();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Header#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see it.csi.mddtools.guigen.Header#getTitle()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Header#getMetaAttributes <em>Meta Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Attributes</em>'.
	 * @see it.csi.mddtools.guigen.Header#getMetaAttributes()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_MetaAttributes();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.HeaderMetaAttr <em>Header Meta Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Meta Attr</em>'.
	 * @see it.csi.mddtools.guigen.HeaderMetaAttr
	 * @generated
	 */
	EClass getHeaderMetaAttr();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.HeaderMetaAttr#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.HeaderMetaAttr#getName()
	 * @see #getHeaderMetaAttr()
	 * @generated
	 */
	EAttribute getHeaderMetaAttr_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.HeaderMetaAttr#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.guigen.HeaderMetaAttr#getValue()
	 * @see #getHeaderMetaAttr()
	 * @generated
	 */
	EAttribute getHeaderMetaAttr_Value();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.HeaderMetaAttr#isUseHttpEquiv <em>Use Http Equiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Http Equiv</em>'.
	 * @see it.csi.mddtools.guigen.HeaderMetaAttr#isUseHttpEquiv()
	 * @see #getHeaderMetaAttr()
	 * @generated
	 */
	EAttribute getHeaderMetaAttr_UseHttpEquiv();

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
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.Typedefs#getExtNamespaces <em>Ext Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ext Namespaces</em>'.
	 * @see it.csi.mddtools.guigen.Typedefs#getExtNamespaces()
	 * @see #getTypedefs()
	 * @generated
	 */
	EReference getTypedefs_ExtNamespaces();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SimpleType#isUserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Defined</em>'.
	 * @see it.csi.mddtools.guigen.SimpleType#isUserDefined()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_UserDefined();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.guigen.SimpleType#getDataTypeModifiers <em>Data Type Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Type Modifiers</em>'.
	 * @see it.csi.mddtools.guigen.SimpleType#getDataTypeModifiers()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_DataTypeModifiers();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SimpleType#getEditHintMsg <em>Edit Hint Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Hint Msg</em>'.
	 * @see it.csi.mddtools.guigen.SimpleType#getEditHintMsg()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_EditHintMsg();

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
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ComplexType#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see it.csi.mddtools.guigen.ComplexType#getExtends()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ComplexType#getTypeAnnotation <em>Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Annotation</em>'.
	 * @see it.csi.mddtools.guigen.ComplexType#getTypeAnnotation()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_TypeAnnotation();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TypeAnnotation <em>Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Annotation</em>'.
	 * @see it.csi.mddtools.guigen.TypeAnnotation
	 * @generated
	 */
	EClass getTypeAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TypeAnnotation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see it.csi.mddtools.guigen.TypeAnnotation#getLanguage()
	 * @see #getTypeAnnotation()
	 * @generated
	 */
	EAttribute getTypeAnnotation_Language();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TypeAnnotation#getFqn <em>Fqn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fqn</em>'.
	 * @see it.csi.mddtools.guigen.TypeAnnotation#getFqn()
	 * @see #getTypeAnnotation()
	 * @generated
	 */
	EAttribute getTypeAnnotation_Fqn();

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
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Field#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see it.csi.mddtools.guigen.Field#getAnnotations()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Annotations();

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
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ApplicationDataDefs#getExtGroups <em>Ext Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ext Groups</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationDataDefs#getExtGroups()
	 * @see #getApplicationDataDefs()
	 * @generated
	 */
	EReference getApplicationDataDefs_ExtGroups();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TreeView#getNodeSelectionType <em>Node Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Selection Type</em>'.
	 * @see it.csi.mddtools.guigen.TreeView#getNodeSelectionType()
	 * @see #getTreeView()
	 * @generated
	 */
	EAttribute getTreeView_NodeSelectionType();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec#getVspan <em>Vspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vspan</em>'.
	 * @see it.csi.mddtools.guigen.GridWidgetLayoutSpec#getVspan()
	 * @see #getGridWidgetLayoutSpec()
	 * @generated
	 */
	EAttribute getGridWidgetLayoutSpec_Vspan();

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
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.CommandPanel#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see it.csi.mddtools.guigen.CommandPanel#getWidgets()
	 * @see #getCommandPanel()
	 * @generated
	 */
	EReference getCommandPanel_Widgets();

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
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.MenuPanel#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see it.csi.mddtools.guigen.MenuPanel#getWidgets()
	 * @see #getMenuPanel()
	 * @generated
	 */
	EReference getMenuPanel_Widgets();

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
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.SecurityModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel#getRoles()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Roles();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SecurityModel#getUserInfoLogoutAction <em>User Info Logout Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Info Logout Action</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel#getUserInfoLogoutAction()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_UserInfoLogoutAction();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SecurityModel#isAskForConfirmationOnLogout <em>Ask For Confirmation On Logout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ask For Confirmation On Logout</em>'.
	 * @see it.csi.mddtools.guigen.SecurityModel#isAskForConfirmationOnLogout()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_AskForConfirmationOnLogout();

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
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see it.csi.mddtools.guigen.Actor#getRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Roles();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.JumpExtCommand#isBinaryStream <em>Binary Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Stream</em>'.
	 * @see it.csi.mddtools.guigen.JumpExtCommand#isBinaryStream()
	 * @see #getJumpExtCommand()
	 * @generated
	 */
	EAttribute getJumpExtCommand_BinaryStream();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TargetPlatform#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Rich UI Behavior</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatform#isEnableRichUIBehavior()
	 * @see #getTargetPlatform()
	 * @generated
	 */
	EAttribute getTargetPlatform_EnableRichUIBehavior();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.TargetPlatform#isEnableFatClient <em>Enable Fat Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Fat Client</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatform#isEnableFatClient()
	 * @see #getTargetPlatform()
	 * @generated
	 */
	EAttribute getTargetPlatform_EnableFatClient();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.TargetPlatform#getPortalExpositions <em>Portal Expositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portal Expositions</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatform#getPortalExpositions()
	 * @see #getTargetPlatform()
	 * @generated
	 */
	EReference getTargetPlatform_PortalExpositions();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.TargetPlatform#getWayfProfile <em>Wayf Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wayf Profile</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatform#getWayfProfile()
	 * @see #getTargetPlatform()
	 * @generated
	 */
	EReference getTargetPlatform_WayfProfile();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.TargetPlatform#getSecurityProfile <em>Security Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Profile</em>'.
	 * @see it.csi.mddtools.guigen.TargetPlatform#getSecurityProfile()
	 * @see #getTargetPlatform()
	 * @generated
	 */
	EReference getTargetPlatform_SecurityProfile();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WizardPanel#isNavigatorActive <em>Navigator Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigator Active</em>'.
	 * @see it.csi.mddtools.guigen.WizardPanel#isNavigatorActive()
	 * @see #getWizardPanel()
	 * @generated
	 */
	EAttribute getWizardPanel_NavigatorActive();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.WizardPanel#getSwitcher <em>Switcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switcher</em>'.
	 * @see it.csi.mddtools.guigen.WizardPanel#getSwitcher()
	 * @see #getWizardPanel()
	 * @generated
	 */
	EReference getWizardPanel_Switcher();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WizardPanel#getNumberingSchema <em>Numbering Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbering Schema</em>'.
	 * @see it.csi.mddtools.guigen.WizardPanel#getNumberingSchema()
	 * @see #getWizardPanel()
	 * @generated
	 */
	EAttribute getWizardPanel_NumberingSchema();

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
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.AppModule#getExtSecurityModel <em>Ext Security Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ext Security Model</em>'.
	 * @see it.csi.mddtools.guigen.AppModule#getExtSecurityModel()
	 * @see #getAppModule()
	 * @generated
	 */
	EReference getAppModule_ExtSecurityModel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.AppModule#isSecure <em>Secure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure</em>'.
	 * @see it.csi.mddtools.guigen.AppModule#isSecure()
	 * @see #getAppModule()
	 * @generated
	 */
	EAttribute getAppModule_Secure();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MsgBoxPanel#isShowStdLegend <em>Show Std Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Std Legend</em>'.
	 * @see it.csi.mddtools.guigen.MsgBoxPanel#isShowStdLegend()
	 * @see #getMsgBoxPanel()
	 * @generated
	 */
	EAttribute getMsgBoxPanel_ShowStdLegend();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WidgetsPanel#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see it.csi.mddtools.guigen.WidgetsPanel#getSummary()
	 * @see #getWidgetsPanel()
	 * @generated
	 */
	EAttribute getWidgetsPanel_Summary();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WidgetsPanel#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see it.csi.mddtools.guigen.WidgetsPanel#isCollapsible()
	 * @see #getWidgetsPanel()
	 * @generated
	 */
	EAttribute getWidgetsPanel_Collapsible();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ScreenState <em>Screen State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen State</em>'.
	 * @see it.csi.mddtools.guigen.ScreenState
	 * @generated
	 */
	EClass getScreenState();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ScreenState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.ScreenState#getName()
	 * @see #getScreenState()
	 * @generated
	 */
	EAttribute getScreenState_Name();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ScreenState#getWidgetsOn <em>Widgets On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgets On</em>'.
	 * @see it.csi.mddtools.guigen.ScreenState#getWidgetsOn()
	 * @see #getScreenState()
	 * @generated
	 */
	EReference getScreenState_WidgetsOn();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ScreenState#getWidgetsVisible <em>Widgets Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgets Visible</em>'.
	 * @see it.csi.mddtools.guigen.ScreenState#getWidgetsVisible()
	 * @see #getScreenState()
	 * @generated
	 */
	EReference getScreenState_WidgetsVisible();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ScreenStates <em>Screen States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen States</em>'.
	 * @see it.csi.mddtools.guigen.ScreenStates
	 * @generated
	 */
	EClass getScreenStates();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ScreenStates#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see it.csi.mddtools.guigen.ScreenStates#getStates()
	 * @see #getScreenStates()
	 * @generated
	 */
	EReference getScreenStates_States();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ScreenStateCommand <em>Screen State Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen State Command</em>'.
	 * @see it.csi.mddtools.guigen.ScreenStateCommand
	 * @generated
	 */
	EClass getScreenStateCommand();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ScreenStateCommand#getGoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go To</em>'.
	 * @see it.csi.mddtools.guigen.ScreenStateCommand#getGoTo()
	 * @see #getScreenStateCommand()
	 * @generated
	 */
	EReference getScreenStateCommand_GoTo();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ShibbolethSSO <em>Shibboleth SSO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shibboleth SSO</em>'.
	 * @see it.csi.mddtools.guigen.ShibbolethSSO
	 * @generated
	 */
	EClass getShibbolethSSO();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see it.csi.mddtools.guigen.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Role#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.guigen.Role#getCode()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Code();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Role#getDomainCode <em>Domain Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Code</em>'.
	 * @see it.csi.mddtools.guigen.Role#getDomainCode()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_DomainCode();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RoleBasedSecurityConstraint <em>Role Based Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Based Security Constraint</em>'.
	 * @see it.csi.mddtools.guigen.RoleBasedSecurityConstraint
	 * @generated
	 */
	EClass getRoleBasedSecurityConstraint();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.RoleBasedSecurityConstraint#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see it.csi.mddtools.guigen.RoleBasedSecurityConstraint#getRole()
	 * @see #getRoleBasedSecurityConstraint()
	 * @generated
	 */
	EReference getRoleBasedSecurityConstraint_Role();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.DeclarativeUIConstraint <em>Declarative UI Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarative UI Constraint</em>'.
	 * @see it.csi.mddtools.guigen.DeclarativeUIConstraint
	 * @generated
	 */
	EClass getDeclarativeUIConstraint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.DeclarativeUIConstraint#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see it.csi.mddtools.guigen.DeclarativeUIConstraint#getLanguage()
	 * @see #getDeclarativeUIConstraint()
	 * @generated
	 */
	EAttribute getDeclarativeUIConstraint_Language();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.DeclarativeUIConstraint#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see it.csi.mddtools.guigen.DeclarativeUIConstraint#getScript()
	 * @see #getDeclarativeUIConstraint()
	 * @generated
	 */
	EAttribute getDeclarativeUIConstraint_Script();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.FileUpload <em>File Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Upload</em>'.
	 * @see it.csi.mddtools.guigen.FileUpload
	 * @generated
	 */
	EClass getFileUpload();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.FileUpload#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see it.csi.mddtools.guigen.FileUpload#isMultiple()
	 * @see #getFileUpload()
	 * @generated
	 */
	EAttribute getFileUpload_Multiple();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TabSwitcher <em>Tab Switcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Switcher</em>'.
	 * @see it.csi.mddtools.guigen.TabSwitcher
	 * @generated
	 */
	EClass getTabSwitcher();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PanelDef <em>Panel Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel Def</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef
	 * @generated
	 */
	EClass getPanelDef();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PanelDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getName()
	 * @see #getPanelDef()
	 * @generated
	 */
	EAttribute getPanelDef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.PanelDef#getPanel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Panel</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getPanel()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_Panel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PanelDef#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getParams()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_Params();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.PanelDef#getAppDataDefs <em>App Data Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App Data Defs</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getAppDataDefs()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_AppDataDefs();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.PanelDef#getTypeDefs <em>Type Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Defs</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getTypeDefs()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_TypeDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PanelDef#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getRoles()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PanelDef#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getActors()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PanelDef#getUseCases <em>Use Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Cases</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getUseCases()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_UseCases();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.PanelDef#getOnRefreshCommand <em>On Refresh Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Refresh Command</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getOnRefreshCommand()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_OnRefreshCommand();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.PanelDef#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>States</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getStates()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_States();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.PanelDef#getDefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default State</em>'.
	 * @see it.csi.mddtools.guigen.PanelDef#getDefaultState()
	 * @see #getPanelDef()
	 * @generated
	 */
	EReference getPanelDef_DefaultState();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PDefParam <em>PDef Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDef Param</em>'.
	 * @see it.csi.mddtools.guigen.PDefParam
	 * @generated
	 */
	EClass getPDefParam();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PDefParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.PDefParam#getName()
	 * @see #getPDefParam()
	 * @generated
	 */
	EAttribute getPDefParam_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AppDataMappingParam <em>App Data Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Data Mapping Param</em>'.
	 * @see it.csi.mddtools.guigen.AppDataMappingParam
	 * @generated
	 */
	EClass getAppDataMappingParam();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.AppDataMappingParam#getDefAppData <em>Def App Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def App Data</em>'.
	 * @see it.csi.mddtools.guigen.AppDataMappingParam#getDefAppData()
	 * @see #getAppDataMappingParam()
	 * @generated
	 */
	EReference getAppDataMappingParam_DefAppData();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TypeDefMappingParam <em>Type Def Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def Mapping Param</em>'.
	 * @see it.csi.mddtools.guigen.TypeDefMappingParam
	 * @generated
	 */
	EClass getTypeDefMappingParam();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.TypeDefMappingParam#getDefTypeDef <em>Def Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Type Def</em>'.
	 * @see it.csi.mddtools.guigen.TypeDefMappingParam#getDefTypeDef()
	 * @see #getTypeDefMappingParam()
	 * @generated
	 */
	EReference getTypeDefMappingParam_DefTypeDef();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UseCaseMappingParam <em>Use Case Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case Mapping Param</em>'.
	 * @see it.csi.mddtools.guigen.UseCaseMappingParam
	 * @generated
	 */
	EClass getUseCaseMappingParam();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.UseCaseMappingParam#getDefUseCase <em>Def Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Use Case</em>'.
	 * @see it.csi.mddtools.guigen.UseCaseMappingParam#getDefUseCase()
	 * @see #getUseCaseMappingParam()
	 * @generated
	 */
	EReference getUseCaseMappingParam_DefUseCase();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RoleMappingParam <em>Role Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Mapping Param</em>'.
	 * @see it.csi.mddtools.guigen.RoleMappingParam
	 * @generated
	 */
	EClass getRoleMappingParam();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.RoleMappingParam#getDefRole <em>Def Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Role</em>'.
	 * @see it.csi.mddtools.guigen.RoleMappingParam#getDefRole()
	 * @see #getRoleMappingParam()
	 * @generated
	 */
	EReference getRoleMappingParam_DefRole();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActorMappingParam <em>Actor Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Mapping Param</em>'.
	 * @see it.csi.mddtools.guigen.ActorMappingParam
	 * @generated
	 */
	EClass getActorMappingParam();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ActorMappingParam#getDefActor <em>Def Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Actor</em>'.
	 * @see it.csi.mddtools.guigen.ActorMappingParam#getDefActor()
	 * @see #getActorMappingParam()
	 * @generated
	 */
	EReference getActorMappingParam_DefActor();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PanelDefUse <em>Panel Def Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel Def Use</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefUse
	 * @generated
	 */
	EClass getPanelDefUse();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.PanelDefUse#getPanelDef <em>Panel Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Panel Def</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefUse#getPanelDef()
	 * @see #getPanelDefUse()
	 * @generated
	 */
	EReference getPanelDefUse_PanelDef();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.PanelDefUse#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefUse#getConfig()
	 * @see #getPanelDefUse()
	 * @generated
	 */
	EReference getPanelDefUse_Config();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PDefParamVal <em>PDef Param Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDef Param Val</em>'.
	 * @see it.csi.mddtools.guigen.PDefParamVal
	 * @generated
	 */
	EClass getPDefParamVal();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.PDefParamVal#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see it.csi.mddtools.guigen.PDefParamVal#getParam()
	 * @see #getPDefParamVal()
	 * @generated
	 */
	EReference getPDefParamVal_Param();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AppDataMappingPDefVal <em>App Data Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Data Mapping PDef Val</em>'.
	 * @see it.csi.mddtools.guigen.AppDataMappingPDefVal
	 * @generated
	 */
	EClass getAppDataMappingPDefVal();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.AppDataMappingPDefVal#getActualAppData <em>Actual App Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual App Data</em>'.
	 * @see it.csi.mddtools.guigen.AppDataMappingPDefVal#getActualAppData()
	 * @see #getAppDataMappingPDefVal()
	 * @generated
	 */
	EReference getAppDataMappingPDefVal_ActualAppData();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TypeDefMappingPDefVal <em>Type Def Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def Mapping PDef Val</em>'.
	 * @see it.csi.mddtools.guigen.TypeDefMappingPDefVal
	 * @generated
	 */
	EClass getTypeDefMappingPDefVal();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.TypeDefMappingPDefVal#getActualTypeDef <em>Actual Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Type Def</em>'.
	 * @see it.csi.mddtools.guigen.TypeDefMappingPDefVal#getActualTypeDef()
	 * @see #getTypeDefMappingPDefVal()
	 * @generated
	 */
	EReference getTypeDefMappingPDefVal_ActualTypeDef();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.UCMappingPDefVal <em>UC Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Mapping PDef Val</em>'.
	 * @see it.csi.mddtools.guigen.UCMappingPDefVal
	 * @generated
	 */
	EClass getUCMappingPDefVal();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.UCMappingPDefVal#getActualUseCase <em>Actual Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Use Case</em>'.
	 * @see it.csi.mddtools.guigen.UCMappingPDefVal#getActualUseCase()
	 * @see #getUCMappingPDefVal()
	 * @generated
	 */
	EReference getUCMappingPDefVal_ActualUseCase();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RoleMappingPDefVal <em>Role Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Mapping PDef Val</em>'.
	 * @see it.csi.mddtools.guigen.RoleMappingPDefVal
	 * @generated
	 */
	EClass getRoleMappingPDefVal();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.RoleMappingPDefVal#getActualRole <em>Actual Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Role</em>'.
	 * @see it.csi.mddtools.guigen.RoleMappingPDefVal#getActualRole()
	 * @see #getRoleMappingPDefVal()
	 * @generated
	 */
	EReference getRoleMappingPDefVal_ActualRole();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActorMappingPDefVal <em>Actor Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Mapping PDef Val</em>'.
	 * @see it.csi.mddtools.guigen.ActorMappingPDefVal
	 * @generated
	 */
	EClass getActorMappingPDefVal();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ActorMappingPDefVal#getActualActor <em>Actual Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Actor</em>'.
	 * @see it.csi.mddtools.guigen.ActorMappingPDefVal#getActualActor()
	 * @see #getActorMappingPDefVal()
	 * @generated
	 */
	EReference getActorMappingPDefVal_ActualActor();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PDefUseConfig <em>PDef Use Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDef Use Config</em>'.
	 * @see it.csi.mddtools.guigen.PDefUseConfig
	 * @generated
	 */
	EClass getPDefUseConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PDefUseConfig#getParamValues <em>Param Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Values</em>'.
	 * @see it.csi.mddtools.guigen.PDefUseConfig#getParamValues()
	 * @see #getPDefUseConfig()
	 * @generated
	 */
	EReference getPDefUseConfig_ParamValues();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActivationModel <em>Activation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Model</em>'.
	 * @see it.csi.mddtools.guigen.ActivationModel
	 * @generated
	 */
	EClass getActivationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ActivationModel#getActivationParams <em>Activation Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Params</em>'.
	 * @see it.csi.mddtools.guigen.ActivationModel#getActivationParams()
	 * @see #getActivationModel()
	 * @generated
	 */
	EReference getActivationModel_ActivationParams();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActivationParam <em>Activation Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Param</em>'.
	 * @see it.csi.mddtools.guigen.ActivationParam
	 * @generated
	 */
	EClass getActivationParam();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ActivationParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.ActivationParam#getName()
	 * @see #getActivationParam()
	 * @generated
	 */
	EAttribute getActivationParam_Name();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ActivationParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.csi.mddtools.guigen.ActivationParam#getType()
	 * @see #getActivationParam()
	 * @generated
	 */
	EReference getActivationParam_Type();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.BeginEditCommand <em>Begin Edit Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begin Edit Command</em>'.
	 * @see it.csi.mddtools.guigen.BeginEditCommand
	 * @generated
	 */
	EClass getBeginEditCommand();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.BeginEditCommand#getDataEdited <em>Data Edited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Edited</em>'.
	 * @see it.csi.mddtools.guigen.BeginEditCommand#getDataEdited()
	 * @see #getBeginEditCommand()
	 * @generated
	 */
	EReference getBeginEditCommand_DataEdited();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.EndEditCommand <em>End Edit Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Edit Command</em>'.
	 * @see it.csi.mddtools.guigen.EndEditCommand
	 * @generated
	 */
	EClass getEndEditCommand();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.EndEditCommand#getDataEdited <em>Data Edited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Edited</em>'.
	 * @see it.csi.mddtools.guigen.EndEditCommand#getDataEdited()
	 * @see #getEndEditCommand()
	 * @generated
	 */
	EReference getEndEditCommand_DataEdited();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.EndEditCommand#isUndo <em>Undo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undo</em>'.
	 * @see it.csi.mddtools.guigen.EndEditCommand#isUndo()
	 * @see #getEndEditCommand()
	 * @generated
	 */
	EAttribute getEndEditCommand_Undo();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ChkEditStatusCommand <em>Chk Edit Status Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chk Edit Status Command</em>'.
	 * @see it.csi.mddtools.guigen.ChkEditStatusCommand
	 * @generated
	 */
	EClass getChkEditStatusCommand();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDataChecked <em>Data Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Checked</em>'.
	 * @see it.csi.mddtools.guigen.ChkEditStatusCommand#getDataChecked()
	 * @see #getChkEditStatusCommand()
	 * @generated
	 */
	EReference getChkEditStatusCommand_DataChecked();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getCheckAggregation <em>Check Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Aggregation</em>'.
	 * @see it.csi.mddtools.guigen.ChkEditStatusCommand#getCheckAggregation()
	 * @see #getChkEditStatusCommand()
	 * @generated
	 */
	EAttribute getChkEditStatusCommand_CheckAggregation();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfChanged <em>Do If Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do If Changed</em>'.
	 * @see it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfChanged()
	 * @see #getChkEditStatusCommand()
	 * @generated
	 */
	EReference getChkEditStatusCommand_DoIfChanged();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfNotChanged <em>Do If Not Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do If Not Changed</em>'.
	 * @see it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfNotChanged()
	 * @see #getChkEditStatusCommand()
	 * @generated
	 */
	EReference getChkEditStatusCommand_DoIfNotChanged();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PanelDefState <em>Panel Def State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel Def State</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefState
	 * @generated
	 */
	EClass getPanelDefState();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PanelDefState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefState#getName()
	 * @see #getPanelDefState()
	 * @generated
	 */
	EAttribute getPanelDefState_Name();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.PanelDefState#getWidgetsOn <em>Widgets On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgets On</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefState#getWidgetsOn()
	 * @see #getPanelDefState()
	 * @generated
	 */
	EReference getPanelDefState_WidgetsOn();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.PanelDefState#getWidgetsVisible <em>Widgets Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgets Visible</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefState#getWidgetsVisible()
	 * @see #getPanelDefState()
	 * @generated
	 */
	EReference getPanelDefState_WidgetsVisible();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PDefStateCommand <em>PDef State Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDef State Command</em>'.
	 * @see it.csi.mddtools.guigen.PDefStateCommand
	 * @generated
	 */
	EClass getPDefStateCommand();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.PDefStateCommand#getGoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go To</em>'.
	 * @see it.csi.mddtools.guigen.PDefStateCommand#getGoTo()
	 * @see #getPDefStateCommand()
	 * @generated
	 */
	EReference getPDefStateCommand_GoTo();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.PDefStateCommand#getPDefUse <em>PDef Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PDef Use</em>'.
	 * @see it.csi.mddtools.guigen.PDefStateCommand#getPDefUse()
	 * @see #getPDefStateCommand()
	 * @generated
	 */
	EReference getPDefStateCommand_PDefUse();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PanelDefStates <em>Panel Def States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel Def States</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefStates
	 * @generated
	 */
	EClass getPanelDefStates();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PanelDefStates#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see it.csi.mddtools.guigen.PanelDefStates#getStates()
	 * @see #getPanelDefStates()
	 * @generated
	 */
	EReference getPanelDefStates_States();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TableCustomizationParam <em>Table Customization Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Customization Param</em>'.
	 * @see it.csi.mddtools.guigen.TableCustomizationParam
	 * @generated
	 */
	EClass getTableCustomizationParam();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.TableCustomizationParam#getBaseTable <em>Base Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Table</em>'.
	 * @see it.csi.mddtools.guigen.TableCustomizationParam#getBaseTable()
	 * @see #getTableCustomizationParam()
	 * @generated
	 */
	EReference getTableCustomizationParam_BaseTable();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ExtraColumn <em>Extra Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Column</em>'.
	 * @see it.csi.mddtools.guigen.ExtraColumn
	 * @generated
	 */
	EClass getExtraColumn();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ExtraColumn#getInsertAfter <em>Insert After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insert After</em>'.
	 * @see it.csi.mddtools.guigen.ExtraColumn#getInsertAfter()
	 * @see #getExtraColumn()
	 * @generated
	 */
	EReference getExtraColumn_InsertAfter();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.TableCustomizationPDefVal <em>Table Customization PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Customization PDef Val</em>'.
	 * @see it.csi.mddtools.guigen.TableCustomizationPDefVal
	 * @generated
	 */
	EClass getTableCustomizationPDefVal();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.TableCustomizationPDefVal#getExtraCols <em>Extra Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extra Cols</em>'.
	 * @see it.csi.mddtools.guigen.TableCustomizationPDefVal#getExtraCols()
	 * @see #getTableCustomizationPDefVal()
	 * @generated
	 */
	EReference getTableCustomizationPDefVal_ExtraCols();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.TableCustomizationPDefVal#getHiddenCols <em>Hidden Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden Cols</em>'.
	 * @see it.csi.mddtools.guigen.TableCustomizationPDefVal#getHiddenCols()
	 * @see #getTableCustomizationPDefVal()
	 * @generated
	 */
	EReference getTableCustomizationPDefVal_HiddenCols();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CustomCartridge <em>Custom Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Cartridge</em>'.
	 * @see it.csi.mddtools.guigen.CustomCartridge
	 * @generated
	 */
	EClass getCustomCartridge();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CustomCartridge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.CustomCartridge#getName()
	 * @see #getCustomCartridge()
	 * @generated
	 */
	EAttribute getCustomCartridge_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CustomCartridge#getCrtID <em>Crt ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crt ID</em>'.
	 * @see it.csi.mddtools.guigen.CustomCartridge#getCrtID()
	 * @see #getCustomCartridge()
	 * @generated
	 */
	EAttribute getCustomCartridge_CrtID();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.CustomCartridge#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see it.csi.mddtools.guigen.CustomCartridge#getTemplates()
	 * @see #getCustomCartridge()
	 * @generated
	 */
	EReference getCustomCartridge_Templates();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CustomTemplate <em>Custom Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Template</em>'.
	 * @see it.csi.mddtools.guigen.CustomTemplate
	 * @generated
	 */
	EClass getCustomTemplate();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CustomTemplate#getTplID <em>Tpl ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tpl ID</em>'.
	 * @see it.csi.mddtools.guigen.CustomTemplate#getTplID()
	 * @see #getCustomTemplate()
	 * @generated
	 */
	EAttribute getCustomTemplate_TplID();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CustomTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.CustomTemplate#getName()
	 * @see #getCustomTemplate()
	 * @generated
	 */
	EAttribute getCustomTemplate_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.CustomTemplate#getModelSlots <em>Model Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Slots</em>'.
	 * @see it.csi.mddtools.guigen.CustomTemplate#getModelSlots()
	 * @see #getCustomTemplate()
	 * @generated
	 */
	EReference getCustomTemplate_ModelSlots();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ModelSlotDef <em>Model Slot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Slot Def</em>'.
	 * @see it.csi.mddtools.guigen.ModelSlotDef
	 * @generated
	 */
	EClass getModelSlotDef();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ModelSlotDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.ModelSlotDef#getName()
	 * @see #getModelSlotDef()
	 * @generated
	 */
	EAttribute getModelSlotDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ModelSlotDef#getModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Class</em>'.
	 * @see it.csi.mddtools.guigen.ModelSlotDef#getModelClass()
	 * @see #getModelSlotDef()
	 * @generated
	 */
	EAttribute getModelSlotDef_ModelClass();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ModelSlot <em>Model Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Slot</em>'.
	 * @see it.csi.mddtools.guigen.ModelSlot
	 * @generated
	 */
	EClass getModelSlot();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ModelSlot#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def</em>'.
	 * @see it.csi.mddtools.guigen.ModelSlot#getDef()
	 * @see #getModelSlot()
	 * @generated
	 */
	EReference getModelSlot_Def();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ModelSlot#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Val</em>'.
	 * @see it.csi.mddtools.guigen.ModelSlot#getVal()
	 * @see #getModelSlot()
	 * @generated
	 */
	EReference getModelSlot_Val();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ClearAppdataCommand <em>Clear Appdata Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Appdata Command</em>'.
	 * @see it.csi.mddtools.guigen.ClearAppdataCommand
	 * @generated
	 */
	EClass getClearAppdataCommand();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ClearAppdataCommand#getAppData <em>App Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>App Data</em>'.
	 * @see it.csi.mddtools.guigen.ClearAppdataCommand#getAppData()
	 * @see #getClearAppdataCommand()
	 * @generated
	 */
	EReference getClearAppdataCommand_AppData();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MapView <em>Map View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View</em>'.
	 * @see it.csi.mddtools.guigen.MapView
	 * @generated
	 */
	EClass getMapView();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapView#getMapId <em>Map Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Id</em>'.
	 * @see it.csi.mddtools.guigen.MapView#getMapId()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_MapId();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MapView#getStartEnvelopeSpec <em>Start Envelope Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Envelope Spec</em>'.
	 * @see it.csi.mddtools.guigen.MapView#getStartEnvelopeSpec()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_StartEnvelopeSpec();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MapView#getMaxEnvelopeSpec <em>Max Envelope Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Envelope Spec</em>'.
	 * @see it.csi.mddtools.guigen.MapView#getMaxEnvelopeSpec()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_MaxEnvelopeSpec();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MapView#getScaleEnvelopeSpec <em>Scale Envelope Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale Envelope Spec</em>'.
	 * @see it.csi.mddtools.guigen.MapView#getScaleEnvelopeSpec()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_ScaleEnvelopeSpec();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapView#getNumLevels <em>Num Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Levels</em>'.
	 * @see it.csi.mddtools.guigen.MapView#getNumLevels()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_NumLevels();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MapView#getEditDataBinding <em>Edit Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edit Data Binding</em>'.
	 * @see it.csi.mddtools.guigen.MapView#getEditDataBinding()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_EditDataBinding();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MapView#getGadgets <em>Gadgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gadgets</em>'.
	 * @see it.csi.mddtools.guigen.MapView#getGadgets()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_Gadgets();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapView#isNoClickWhenDisabled <em>No Click When Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Click When Disabled</em>'.
	 * @see it.csi.mddtools.guigen.MapView#isNoClickWhenDisabled()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_NoClickWhenDisabled();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapView#isNoEditWhenDisabled <em>No Edit When Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Edit When Disabled</em>'.
	 * @see it.csi.mddtools.guigen.MapView#isNoEditWhenDisabled()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_NoEditWhenDisabled();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapView#isNoZoomWhenDisabled <em>No Zoom When Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Zoom When Disabled</em>'.
	 * @see it.csi.mddtools.guigen.MapView#isNoZoomWhenDisabled()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_NoZoomWhenDisabled();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapView#isNoPanWhenDisabled <em>No Pan When Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Pan When Disabled</em>'.
	 * @see it.csi.mddtools.guigen.MapView#isNoPanWhenDisabled()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_NoPanWhenDisabled();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see it.csi.mddtools.guigen.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see it.csi.mddtools.guigen.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see it.csi.mddtools.guigen.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MapEnvelope <em>Map Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Envelope</em>'.
	 * @see it.csi.mddtools.guigen.MapEnvelope
	 * @generated
	 */
	EClass getMapEnvelope();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MapEnvelope#getNorthEast <em>North East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>North East</em>'.
	 * @see it.csi.mddtools.guigen.MapEnvelope#getNorthEast()
	 * @see #getMapEnvelope()
	 * @generated
	 */
	EReference getMapEnvelope_NorthEast();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.MapEnvelope#getSouthWest <em>South West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>South West</em>'.
	 * @see it.csi.mddtools.guigen.MapEnvelope#getSouthWest()
	 * @see #getMapEnvelope()
	 * @generated
	 */
	EReference getMapEnvelope_SouthWest();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PortalProfile <em>Portal Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portal Profile</em>'.
	 * @see it.csi.mddtools.guigen.PortalProfile
	 * @generated
	 */
	EClass getPortalProfile();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PortalProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.PortalProfile#getName()
	 * @see #getPortalProfile()
	 * @generated
	 */
	EAttribute getPortalProfile_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PortalProfile#getResModules <em>Res Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Res Modules</em>'.
	 * @see it.csi.mddtools.guigen.PortalProfile#getResModules()
	 * @see #getPortalProfile()
	 * @generated
	 */
	EReference getPortalProfile_ResModules();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PortalProfile#getWhereAreYouFromPortalCode <em>Where Are You From Portal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where Are You From Portal Code</em>'.
	 * @see it.csi.mddtools.guigen.PortalProfile#getWhereAreYouFromPortalCode()
	 * @see #getPortalProfile()
	 * @generated
	 */
	EAttribute getPortalProfile_WhereAreYouFromPortalCode();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PortalProfile#getResourceProviderCode <em>Resource Provider Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Provider Code</em>'.
	 * @see it.csi.mddtools.guigen.PortalProfile#getResourceProviderCode()
	 * @see #getPortalProfile()
	 * @generated
	 */
	EAttribute getPortalProfile_ResourceProviderCode();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WebResourceModule <em>Web Resource Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Resource Module</em>'.
	 * @see it.csi.mddtools.guigen.WebResourceModule
	 * @generated
	 */
	EClass getWebResourceModule();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WebResourceModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.WebResourceModule#getName()
	 * @see #getWebResourceModule()
	 * @generated
	 */
	EAttribute getWebResourceModule_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WebResourceModule#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.csi.mddtools.guigen.WebResourceModule#getVersion()
	 * @see #getWebResourceModule()
	 * @generated
	 */
	EAttribute getWebResourceModule_Version();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.WebResourceModule#getRepartModule <em>Repart Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repart Module</em>'.
	 * @see it.csi.mddtools.guigen.WebResourceModule#getRepartModule()
	 * @see #getWebResourceModule()
	 * @generated
	 */
	EReference getWebResourceModule_RepartModule();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WebResourceModule#getDeploymentType <em>Deployment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Type</em>'.
	 * @see it.csi.mddtools.guigen.WebResourceModule#getDeploymentType()
	 * @see #getWebResourceModule()
	 * @generated
	 */
	EAttribute getWebResourceModule_DeploymentType();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.StdWebResourceModule <em>Std Web Resource Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Web Resource Module</em>'.
	 * @see it.csi.mddtools.guigen.StdWebResourceModule
	 * @generated
	 */
	EClass getStdWebResourceModule();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.StdWebResourceModule#getStdName <em>Std Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Name</em>'.
	 * @see it.csi.mddtools.guigen.StdWebResourceModule#getStdName()
	 * @see #getStdWebResourceModule()
	 * @generated
	 */
	EAttribute getStdWebResourceModule_StdName();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RepartArtifact <em>Repart Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repart Artifact</em>'.
	 * @see it.csi.mddtools.guigen.RepartArtifact
	 * @generated
	 */
	EClass getRepartArtifact();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.RepartArtifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.RepartArtifact#getName()
	 * @see #getRepartArtifact()
	 * @generated
	 */
	EAttribute getRepartArtifact_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.RepartArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.csi.mddtools.guigen.RepartArtifact#getType()
	 * @see #getRepartArtifact()
	 * @generated
	 */
	EAttribute getRepartArtifact_Type();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RepartModule <em>Repart Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repart Module</em>'.
	 * @see it.csi.mddtools.guigen.RepartModule
	 * @generated
	 */
	EClass getRepartModule();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.RepartModule#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see it.csi.mddtools.guigen.RepartModule#getOrganization()
	 * @see #getRepartModule()
	 * @generated
	 */
	EAttribute getRepartModule_Organization();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.RepartModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.RepartModule#getName()
	 * @see #getRepartModule()
	 * @generated
	 */
	EAttribute getRepartModule_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.RepartModule#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.csi.mddtools.guigen.RepartModule#getVersion()
	 * @see #getRepartModule()
	 * @generated
	 */
	EAttribute getRepartModule_Version();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.RepartModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.csi.mddtools.guigen.RepartModule#getType()
	 * @see #getRepartModule()
	 * @generated
	 */
	EAttribute getRepartModule_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.RepartModule#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see it.csi.mddtools.guigen.RepartModule#getArtifacts()
	 * @see #getRepartModule()
	 * @generated
	 */
	EReference getRepartModule_Artifacts();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Breadcrumb <em>Breadcrumb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breadcrumb</em>'.
	 * @see it.csi.mddtools.guigen.Breadcrumb
	 * @generated
	 */
	EClass getBreadcrumb();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.MapViewGadgets <em>Map View Gadgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Gadgets</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets
	 * @generated
	 */
	EClass getMapViewGadgets();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#isLayerSwitcher <em>Layer Switcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer Switcher</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#isLayerSwitcher()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_LayerSwitcher();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapMapServiceName <em>Background Map Map Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Map Map Service Name</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapMapServiceName()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_BackgroundMapMapServiceName();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapSwitcherLabel <em>Background Map Switcher Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Map Switcher Label</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapSwitcherLabel()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_BackgroundMapSwitcherLabel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialMapServiceName <em>Background Photo Aerial Map Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Photo Aerial Map Service Name</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialMapServiceName()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_BackgroundPhotoAerialMapServiceName();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialSwitcherLabel <em>Background Photo Aerial Switcher Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Photo Aerial Switcher Label</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialSwitcherLabel()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_BackgroundPhotoAerialSwitcherLabel();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#isPointEditingActive <em>Point Editing Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Editing Active</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#isPointEditingActive()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_PointEditingActive();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#isLineEditingActive <em>Line Editing Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Editing Active</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#isLineEditingActive()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_LineEditingActive();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#isPolygonEditingActive <em>Polygon Editing Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polygon Editing Active</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#isPolygonEditingActive()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_PolygonEditingActive();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.MapViewGadgets#isModifyEditingActive <em>Modify Editing Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modify Editing Active</em>'.
	 * @see it.csi.mddtools.guigen.MapViewGadgets#isModifyEditingActive()
	 * @see #getMapViewGadgets()
	 * @generated
	 */
	EAttribute getMapViewGadgets_ModifyEditingActive();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PortalExposition <em>Portal Exposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portal Exposition</em>'.
	 * @see it.csi.mddtools.guigen.PortalExposition
	 * @generated
	 */
	EClass getPortalExposition();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.PortalExposition#getPortal <em>Portal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portal</em>'.
	 * @see it.csi.mddtools.guigen.PortalExposition#getPortal()
	 * @see #getPortalExposition()
	 * @generated
	 */
	EReference getPortalExposition_Portal();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PortalExposition#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see it.csi.mddtools.guigen.PortalExposition#getAreaCode()
	 * @see #getPortalExposition()
	 * @generated
	 */
	EAttribute getPortalExposition_AreaCode();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CPCommand <em>CP Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP Command</em>'.
	 * @see it.csi.mddtools.guigen.CPCommand
	 * @generated
	 */
	EClass getCPCommand();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.CPCommand#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute</em>'.
	 * @see it.csi.mddtools.guigen.CPCommand#getExecute()
	 * @see #getCPCommand()
	 * @generated
	 */
	EAttribute getCPCommand_Execute();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.CPCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see it.csi.mddtools.guigen.CPCommand#getCommand()
	 * @see #getCPCommand()
	 * @generated
	 */
	EReference getCPCommand_Command();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CPCommands <em>CP Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP Commands</em>'.
	 * @see it.csi.mddtools.guigen.CPCommands
	 * @generated
	 */
	EClass getCPCommands();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.CPCommands#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see it.csi.mddtools.guigen.CPCommands#getCommands()
	 * @see #getCPCommands()
	 * @generated
	 */
	EReference getCPCommands_Commands();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.SecurityProfile <em>Security Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Profile</em>'.
	 * @see it.csi.mddtools.guigen.SecurityProfile
	 * @generated
	 */
	EClass getSecurityProfile();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.SecurityProfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.SecurityProfile#getName()
	 * @see #getSecurityProfile()
	 * @generated
	 */
	EAttribute getSecurityProfile_Name();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.SecurityProfile#getExtAuthGuard <em>Ext Auth Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext Auth Guard</em>'.
	 * @see it.csi.mddtools.guigen.SecurityProfile#getExtAuthGuard()
	 * @see #getSecurityProfile()
	 * @generated
	 */
	EReference getSecurityProfile_ExtAuthGuard();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.SecurityProfile#getIntAuthGuard <em>Int Auth Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int Auth Guard</em>'.
	 * @see it.csi.mddtools.guigen.SecurityProfile#getIntAuthGuard()
	 * @see #getSecurityProfile()
	 * @generated
	 */
	EReference getSecurityProfile_IntAuthGuard();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.SecurityProfile#getIdAdapter <em>Id Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Adapter</em>'.
	 * @see it.csi.mddtools.guigen.SecurityProfile#getIdAdapter()
	 * @see #getSecurityProfile()
	 * @generated
	 */
	EReference getSecurityProfile_IdAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.SecurityProfile#getPepImpl <em>Pep Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pep Impl</em>'.
	 * @see it.csi.mddtools.guigen.SecurityProfile#getPepImpl()
	 * @see #getSecurityProfile()
	 * @generated
	 */
	EReference getSecurityProfile_PepImpl();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ExternalAuthenticationGuard <em>External Authentication Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Authentication Guard</em>'.
	 * @see it.csi.mddtools.guigen.ExternalAuthenticationGuard
	 * @generated
	 */
	EClass getExternalAuthenticationGuard();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.InternalAuthenticationGuard <em>Internal Authentication Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Authentication Guard</em>'.
	 * @see it.csi.mddtools.guigen.InternalAuthenticationGuard
	 * @generated
	 */
	EClass getInternalAuthenticationGuard();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.InternalAuthenticationGuard#getLoginModule <em>Login Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login Module</em>'.
	 * @see it.csi.mddtools.guigen.InternalAuthenticationGuard#getLoginModule()
	 * @see #getInternalAuthenticationGuard()
	 * @generated
	 */
	EReference getInternalAuthenticationGuard_LoginModule();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.InternalAuthenticationGuard#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see it.csi.mddtools.guigen.InternalAuthenticationGuard#getParams()
	 * @see #getInternalAuthenticationGuard()
	 * @generated
	 */
	EReference getInternalAuthenticationGuard_Params();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WAYFRequestAdapter <em>WAYF Request Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WAYF Request Adapter</em>'.
	 * @see it.csi.mddtools.guigen.WAYFRequestAdapter
	 * @generated
	 */
	EClass getWAYFRequestAdapter();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WAYFRequestAdapter#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see it.csi.mddtools.guigen.WAYFRequestAdapter#getSourceType()
	 * @see #getWAYFRequestAdapter()
	 * @generated
	 */
	EAttribute getWAYFRequestAdapter_SourceType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.WAYFRequestAdapter#getInfoSourceName <em>Info Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Source Name</em>'.
	 * @see it.csi.mddtools.guigen.WAYFRequestAdapter#getInfoSourceName()
	 * @see #getWAYFRequestAdapter()
	 * @generated
	 */
	EAttribute getWAYFRequestAdapter_InfoSourceName();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WAYFProfile <em>WAYF Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WAYF Profile</em>'.
	 * @see it.csi.mddtools.guigen.WAYFProfile
	 * @generated
	 */
	EClass getWAYFProfile();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.WAYFProfile#getRequestAdapter <em>Request Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Adapter</em>'.
	 * @see it.csi.mddtools.guigen.WAYFProfile#getRequestAdapter()
	 * @see #getWAYFProfile()
	 * @generated
	 */
	EReference getWAYFProfile_RequestAdapter();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.LoginUI <em>Login UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login UI</em>'.
	 * @see it.csi.mddtools.guigen.LoginUI
	 * @generated
	 */
	EClass getLoginUI();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.LoginUI#getUiType <em>Ui Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Type</em>'.
	 * @see it.csi.mddtools.guigen.LoginUI#getUiType()
	 * @see #getLoginUI()
	 * @generated
	 */
	EAttribute getLoginUI_UiType();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.LoginModule <em>Login Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Module</em>'.
	 * @see it.csi.mddtools.guigen.LoginModule
	 * @generated
	 */
	EClass getLoginModule();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.LoginModule#isInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal</em>'.
	 * @see it.csi.mddtools.guigen.LoginModule#isInternal()
	 * @see #getLoginModule()
	 * @generated
	 */
	EAttribute getLoginModule_Internal();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.LoginModule#getLoginUI <em>Login UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Login UI</em>'.
	 * @see it.csi.mddtools.guigen.LoginModule#getLoginUI()
	 * @see #getLoginModule()
	 * @generated
	 */
	EReference getLoginModule_LoginUI();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.IdentityAdapter <em>Identity Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Adapter</em>'.
	 * @see it.csi.mddtools.guigen.IdentityAdapter
	 * @generated
	 */
	EClass getIdentityAdapter();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.IdentityAdapter#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see it.csi.mddtools.guigen.IdentityAdapter#getSourceType()
	 * @see #getIdentityAdapter()
	 * @generated
	 */
	EAttribute getIdentityAdapter_SourceType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.IdentityAdapter#getInfoSourceName <em>Info Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Source Name</em>'.
	 * @see it.csi.mddtools.guigen.IdentityAdapter#getInfoSourceName()
	 * @see #getIdentityAdapter()
	 * @generated
	 */
	EAttribute getIdentityAdapter_InfoSourceName();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.IdentityAdapter#getTicketVerifyMethod <em>Ticket Verify Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket Verify Method</em>'.
	 * @see it.csi.mddtools.guigen.IdentityAdapter#getTicketVerifyMethod()
	 * @see #getIdentityAdapter()
	 * @generated
	 */
	EAttribute getIdentityAdapter_TicketVerifyMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.IdentityAdapter#getInlineCodeSnippets <em>Inline Code Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inline Code Snippets</em>'.
	 * @see it.csi.mddtools.guigen.IdentityAdapter#getInlineCodeSnippets()
	 * @see #getIdentityAdapter()
	 * @generated
	 */
	EReference getIdentityAdapter_InlineCodeSnippets();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.IdentityAdapter#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see it.csi.mddtools.guigen.IdentityAdapter#getParams()
	 * @see #getIdentityAdapter()
	 * @generated
	 */
	EReference getIdentityAdapter_Params();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.EnvConfigParam <em>Env Config Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Config Param</em>'.
	 * @see it.csi.mddtools.guigen.EnvConfigParam
	 * @generated
	 */
	EClass getEnvConfigParam();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.EnvConfigParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.EnvConfigParam#getName()
	 * @see #getEnvConfigParam()
	 * @generated
	 */
	EAttribute getEnvConfigParam_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.EnvConfigParams <em>Env Config Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Config Params</em>'.
	 * @see it.csi.mddtools.guigen.EnvConfigParams
	 * @generated
	 */
	EClass getEnvConfigParams();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.EnvConfigParams#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see it.csi.mddtools.guigen.EnvConfigParams#getParams()
	 * @see #getEnvConfigParams()
	 * @generated
	 */
	EReference getEnvConfigParams_Params();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.PEPImplementation <em>PEP Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PEP Implementation</em>'.
	 * @see it.csi.mddtools.guigen.PEPImplementation
	 * @generated
	 */
	EClass getPEPImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PEPImplementation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see it.csi.mddtools.guigen.PEPImplementation#getParams()
	 * @see #getPEPImplementation()
	 * @generated
	 */
	EReference getPEPImplementation_Params();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.PEPImplementation#isCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom</em>'.
	 * @see it.csi.mddtools.guigen.PEPImplementation#isCustom()
	 * @see #getPEPImplementation()
	 * @generated
	 */
	EAttribute getPEPImplementation_Custom();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.PEPImplementation#getInlineCodeSnippets <em>Inline Code Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inline Code Snippets</em>'.
	 * @see it.csi.mddtools.guigen.PEPImplementation#getInlineCodeSnippets()
	 * @see #getPEPImplementation()
	 * @generated
	 */
	EReference getPEPImplementation_InlineCodeSnippets();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.InlineCodeSnippet <em>Inline Code Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Code Snippet</em>'.
	 * @see it.csi.mddtools.guigen.InlineCodeSnippet
	 * @generated
	 */
	EClass getInlineCodeSnippet();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetPosition <em>Snippet Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippet Position</em>'.
	 * @see it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetPosition()
	 * @see #getInlineCodeSnippet()
	 * @generated
	 */
	EAttribute getInlineCodeSnippet_SnippetPosition();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetName <em>Snippet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippet Name</em>'.
	 * @see it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetName()
	 * @see #getInlineCodeSnippet()
	 * @generated
	 */
	EAttribute getInlineCodeSnippet_SnippetName();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetCode <em>Snippet Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippet Code</em>'.
	 * @see it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetCode()
	 * @see #getInlineCodeSnippet()
	 * @generated
	 */
	EAttribute getInlineCodeSnippet_SnippetCode();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see it.csi.mddtools.guigen.InlineCodeSnippet#getLang()
	 * @see #getInlineCodeSnippet()
	 * @generated
	 */
	EAttribute getInlineCodeSnippet_Lang();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see it.csi.mddtools.guigen.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.AnnotatedElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see it.csi.mddtools.guigen.AnnotatedElement#getAnnotations()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_Annotations();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see it.csi.mddtools.guigen.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Annotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see it.csi.mddtools.guigen.Annotation#getSource()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.Annotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see it.csi.mddtools.guigen.Annotation#getDetails()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Details();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.AnnotationDetail <em>Annotation Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Detail</em>'.
	 * @see it.csi.mddtools.guigen.AnnotationDetail
	 * @generated
	 */
	EClass getAnnotationDetail();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.AnnotationDetail#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.csi.mddtools.guigen.AnnotationDetail#getKey()
	 * @see #getAnnotationDetail()
	 * @generated
	 */
	EAttribute getAnnotationDetail_Key();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.AnnotationDetail#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.guigen.AnnotationDetail#getValue()
	 * @see #getAnnotationDetail()
	 * @generated
	 */
	EAttribute getAnnotationDetail_Value();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Captcha <em>Captcha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Captcha</em>'.
	 * @see it.csi.mddtools.guigen.Captcha
	 * @generated
	 */
	EClass getCaptcha();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Slider <em>Slider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider</em>'.
	 * @see it.csi.mddtools.guigen.Slider
	 * @generated
	 */
	EClass getSlider();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Slider#getUseCollectionDataAs <em>Use Collection Data As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Collection Data As</em>'.
	 * @see it.csi.mddtools.guigen.Slider#getUseCollectionDataAs()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_UseCollectionDataAs();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Slider#getStaticLowerBound <em>Static Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Lower Bound</em>'.
	 * @see it.csi.mddtools.guigen.Slider#getStaticLowerBound()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_StaticLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Slider#getStaticUpperBound <em>Static Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Upper Bound</em>'.
	 * @see it.csi.mddtools.guigen.Slider#getStaticUpperBound()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_StaticUpperBound();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Slider#getStaticStep <em>Static Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Step</em>'.
	 * @see it.csi.mddtools.guigen.Slider#getStaticStep()
	 * @see #getSlider()
	 * @generated
	 */
	EAttribute getSlider_StaticStep();

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
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.MethodProtectionTypes <em>Method Protection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Protection Types</em>'.
	 * @see it.csi.mddtools.guigen.MethodProtectionTypes
	 * @generated
	 */
	EEnum getMethodProtectionTypes();

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
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.LogoutActionTypes <em>Logout Action Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logout Action Types</em>'.
	 * @see it.csi.mddtools.guigen.LogoutActionTypes
	 * @generated
	 */
	EEnum getLogoutActionTypes();

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
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.InlineScriptingLanguage <em>Inline Scripting Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inline Scripting Language</em>'.
	 * @see it.csi.mddtools.guigen.InlineScriptingLanguage
	 * @generated
	 */
	EEnum getInlineScriptingLanguage();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.LogicAggregationTypes <em>Logic Aggregation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Aggregation Types</em>'.
	 * @see it.csi.mddtools.guigen.LogicAggregationTypes
	 * @generated
	 */
	EEnum getLogicAggregationTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.CustomCartridgeID <em>Custom Cartridge ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Custom Cartridge ID</em>'.
	 * @see it.csi.mddtools.guigen.CustomCartridgeID
	 * @generated
	 */
	EEnum getCustomCartridgeID();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.CommandFunctions <em>Command Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Functions</em>'.
	 * @see it.csi.mddtools.guigen.CommandFunctions
	 * @generated
	 */
	EEnum getCommandFunctions();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.WebResModuleDeployTypes <em>Web Res Module Deploy Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Web Res Module Deploy Types</em>'.
	 * @see it.csi.mddtools.guigen.WebResModuleDeployTypes
	 * @generated
	 */
	EEnum getWebResModuleDeployTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.StdWebResModuleNames <em>Std Web Res Module Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Std Web Res Module Names</em>'.
	 * @see it.csi.mddtools.guigen.StdWebResModuleNames
	 * @generated
	 */
	EEnum getStdWebResModuleNames();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.RepartModuleTypes <em>Repart Module Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repart Module Types</em>'.
	 * @see it.csi.mddtools.guigen.RepartModuleTypes
	 * @generated
	 */
	EEnum getRepartModuleTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.WizardNumberingTypes <em>Wizard Numbering Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wizard Numbering Types</em>'.
	 * @see it.csi.mddtools.guigen.WizardNumberingTypes
	 * @generated
	 */
	EEnum getWizardNumberingTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.CPCommandExecutionTypes <em>CP Command Execution Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CP Command Execution Types</em>'.
	 * @see it.csi.mddtools.guigen.CPCommandExecutionTypes
	 * @generated
	 */
	EEnum getCPCommandExecutionTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.TicketVerifyMethod <em>Ticket Verify Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ticket Verify Method</em>'.
	 * @see it.csi.mddtools.guigen.TicketVerifyMethod
	 * @generated
	 */
	EEnum getTicketVerifyMethod();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.LoginUITypes <em>Login UI Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Login UI Types</em>'.
	 * @see it.csi.mddtools.guigen.LoginUITypes
	 * @generated
	 */
	EEnum getLoginUITypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.InfoSourceTypes <em>Info Source Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Info Source Types</em>'.
	 * @see it.csi.mddtools.guigen.InfoSourceTypes
	 * @generated
	 */
	EEnum getInfoSourceTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.TreeSelectionTypes <em>Tree Selection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tree Selection Types</em>'.
	 * @see it.csi.mddtools.guigen.TreeSelectionTypes
	 * @generated
	 */
	EEnum getTreeSelectionTypes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes <em>Slider Collection Values Usage Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slider Collection Values Usage Types</em>'.
	 * @see it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes
	 * @generated
	 */
	EEnum getSliderCollectionValuesUsageTypes();

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
		 * The meta object literal for the '<em><b>Ext Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__EXT_MODULES = eINSTANCE.getApplicationArea_ExtModules();

		/**
		 * The meta object literal for the '<em><b>Home Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__HOME_PAGE = eINSTANCE.getApplicationArea_HomePage();

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
		 * The meta object literal for the '<em><b>Remote Info Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENUBAR__REMOTE_INFO_BOX = eINSTANCE.getMenubar_RemoteInfoBox();

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
		 * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PANEL__STATES = eINSTANCE.getContentPanel_States();

		/**
		 * The meta object literal for the '<em><b>Default State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PANEL__DEFAULT_STATE = eINSTANCE.getContentPanel_DefaultState();

		/**
		 * The meta object literal for the '<em><b>Cp Commands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_PANEL__CP_COMMANDS = eINSTANCE.getContentPanel_CpCommands();

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
		 * The meta object literal for the '<em><b>Collapsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_PANEL__COLLAPSIBLE = eINSTANCE.getFormPanel_Collapsible();

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
		 * The meta object literal for the '<em><b>Switcher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_SET_PANEL__SWITCHER = eINSTANCE.getTabSetPanel_Switcher();

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
		 * The meta object literal for the '<em><b>Scrollable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__SCROLLABLE = eINSTANCE.getPanel_Scrollable();

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
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TOOLTIP = eINSTANCE.getWidget_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Enable Enrichment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ENABLE_ENRICHMENT = eINSTANCE.getWidget_EnableEnrichment();

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
		 * The meta object literal for the '<em><b>Function Specifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_WIDGET__FUNCTION_SPECIFIER = eINSTANCE.getCommandWidget_FunctionSpecifier();

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
		 * The meta object literal for the '<em><b>Field Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__FIELD_MAX_LENGTH = eINSTANCE.getTextField_FieldMaxLength();

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
		 * The meta object literal for the '<em><b>Select Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__SELECT_YEAR = eINSTANCE.getCalendar_SelectYear();

		/**
		 * The meta object literal for the '<em><b>Select Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__SELECT_MONTH = eINSTANCE.getCalendar_SelectMonth();

		/**
		 * The meta object literal for the '<em><b>Select Year Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__SELECT_YEAR_RANGE = eINSTANCE.getCalendar_SelectYearRange();

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
		 * The meta object literal for the '<em><b>Omit Header Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__OMIT_HEADER_VALUE = eINSTANCE.getComboBox_OmitHeaderValue();

		/**
		 * The meta object literal for the '<em><b>Field Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__FIELD_LENGTH = eINSTANCE.getComboBox_FieldLength();

		/**
		 * The meta object literal for the '<em><b>Visible Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_BOX__VISIBLE_LINES = eINSTANCE.getComboBox_VisibleLines();

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
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SUMMARY = eINSTANCE.getTable_Summary();

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
		 * The meta object literal for the '<em><b>Ext Security Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__EXT_SECURITY_MODEL = eINSTANCE.getGUIModel_ExtSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Target Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__TARGET_PLATFORM = eINSTANCE.getGUIModel_TargetPlatform();

		/**
		 * The meta object literal for the '<em><b>Activation Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_MODEL__ACTIVATION_MODEL = eINSTANCE.getGUIModel_ActivationModel();

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
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_BUTTONS__LAYOUT = eINSTANCE.getRadioButtons_Layout();

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
		 * The meta object literal for the '<em><b>Column Sizes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL_LAYOUT__COLUMN_SIZES = eINSTANCE.getPanelLayout_ColumnSizes();

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
		 * The meta object literal for the '<em><b>Editable Flag Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__EDITABLE_FLAG_SELECTOR = eINSTANCE.getColumn_EditableFlagSelector();

		/**
		 * The meta object literal for the '<em><b>Multi Data Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__MULTI_DATA_BINDING = eINSTANCE.getColumn_MultiDataBinding();

		/**
		 * The meta object literal for the '<em><b>Multidata Key Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__MULTIDATA_KEY_SELECTOR = eINSTANCE.getColumn_MultidataKeySelector();

		/**
		 * The meta object literal for the '<em><b>Multidata Value Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__MULTIDATA_VALUE_SELECTOR = eINSTANCE.getColumn_MultidataValueSelector();

		/**
		 * The meta object literal for the '<em><b>Multidata Property Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__MULTIDATA_PROPERTY_SELECTOR = eINSTANCE.getColumn_MultidataPropertySelector();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TOOLTIP = eINSTANCE.getColumn_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Active Flag Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ACTIVE_FLAG_SELECTOR = eINSTANCE.getColumn_ActiveFlagSelector();

		/**
		 * The meta object literal for the '<em><b>Field Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__FIELD_MAX_LENGTH = eINSTANCE.getColumn_FieldMaxLength();

		/**
		 * The meta object literal for the '<em><b>Custom Decorator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__CUSTOM_DECORATOR = eINSTANCE.getColumn_CustomDecorator();

		/**
		 * The meta object literal for the '<em><b>Custom Sort Property Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__CUSTOM_SORT_PROPERTY_SELECTOR = eINSTANCE.getColumn_CustomSortPropertySelector();

		/**
		 * The meta object literal for the '<em><b>Field Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__FIELD_LENGTH = eINSTANCE.getColumn_FieldLength();

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
		 * The meta object literal for the '<em><b>Custom Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_COMMAND__CUSTOM_TEMPLATE = eINSTANCE.getExecCommand_CustomTemplate();

		/**
		 * The meta object literal for the '<em><b>Extra Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_COMMAND__EXTRA_MODELS = eINSTANCE.getExecCommand_ExtraModels();

		/**
		 * The meta object literal for the '<em><b>Inline Code Snippets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_COMMAND__INLINE_CODE_SNIPPETS = eINSTANCE.getExecCommand_InlineCodeSnippets();

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
		 * The meta object literal for the '<em><b>Method Protection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_HANDLER__METHOD_PROTECTION = eINSTANCE.getEventHandler_MethodProtection();

		/**
		 * The meta object literal for the '<em><b>Event Specifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_HANDLER__EVENT_SPECIFIERS = eINSTANCE.getEventHandler_EventSpecifiers();

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
		 * The meta object literal for the '<em><b>Target Menu Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_ON_WIDGETS__TARGET_MENU_ELEMENT = eINSTANCE.getCommandOnWidgets_TargetMenuElement();

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
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TITLE = eINSTANCE.getHeader_Title();

		/**
		 * The meta object literal for the '<em><b>Meta Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__META_ATTRIBUTES = eINSTANCE.getHeader_MetaAttributes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.HeaderMetaAttrImpl <em>Header Meta Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.HeaderMetaAttrImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getHeaderMetaAttr()
		 * @generated
		 */
		EClass HEADER_META_ATTR = eINSTANCE.getHeaderMetaAttr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_META_ATTR__NAME = eINSTANCE.getHeaderMetaAttr_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_META_ATTR__VALUE = eINSTANCE.getHeaderMetaAttr_Value();

		/**
		 * The meta object literal for the '<em><b>Use Http Equiv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_META_ATTR__USE_HTTP_EQUIV = eINSTANCE.getHeaderMetaAttr_UseHttpEquiv();

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
		 * The meta object literal for the '<em><b>Ext Namespaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEFS__EXT_NAMESPACES = eINSTANCE.getTypedefs_ExtNamespaces();

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
		 * The meta object literal for the '<em><b>User Defined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__USER_DEFINED = eINSTANCE.getSimpleType_UserDefined();

		/**
		 * The meta object literal for the '<em><b>Data Type Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__DATA_TYPE_MODIFIERS = eINSTANCE.getSimpleType_DataTypeModifiers();

		/**
		 * The meta object literal for the '<em><b>Edit Hint Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__EDIT_HINT_MSG = eINSTANCE.getSimpleType_EditHintMsg();

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
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__EXTENDS = eINSTANCE.getComplexType_Extends();

		/**
		 * The meta object literal for the '<em><b>Type Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__TYPE_ANNOTATION = eINSTANCE.getComplexType_TypeAnnotation();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TypeAnnotationImpl <em>Type Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TypeAnnotationImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeAnnotation()
		 * @generated
		 */
		EClass TYPE_ANNOTATION = eINSTANCE.getTypeAnnotation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ANNOTATION__LANGUAGE = eINSTANCE.getTypeAnnotation_Language();

		/**
		 * The meta object literal for the '<em><b>Fqn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ANNOTATION__FQN = eINSTANCE.getTypeAnnotation_Fqn();

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
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__ANNOTATIONS = eINSTANCE.getField_Annotations();

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
		 * The meta object literal for the '<em><b>Ext Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA_DEFS__EXT_GROUPS = eINSTANCE.getApplicationDataDefs_ExtGroups();

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
		 * The meta object literal for the '<em><b>Node Selection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_VIEW__NODE_SELECTION_TYPE = eINSTANCE.getTreeView_NodeSelectionType();

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
		 * The meta object literal for the '<em><b>Vspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_WIDGET_LAYOUT_SPEC__VSPAN = eINSTANCE.getGridWidgetLayoutSpec_Vspan();

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
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PANEL__WIDGETS = eINSTANCE.getCommandPanel_Widgets();

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
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_PANEL__WIDGETS = eINSTANCE.getMenuPanel_Widgets();

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
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__ROLES = eINSTANCE.getSecurityModel_Roles();

		/**
		 * The meta object literal for the '<em><b>User Info Logout Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__USER_INFO_LOGOUT_ACTION = eINSTANCE.getSecurityModel_UserInfoLogoutAction();

		/**
		 * The meta object literal for the '<em><b>Ask For Confirmation On Logout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT = eINSTANCE.getSecurityModel_AskForConfirmationOnLogout();

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
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ROLES = eINSTANCE.getActor_Roles();

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
		 * The meta object literal for the '<em><b>Binary Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_EXT_COMMAND__BINARY_STREAM = eINSTANCE.getJumpExtCommand_BinaryStream();

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
		 * The meta object literal for the '<em><b>Enable Rich UI Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR = eINSTANCE.getTargetPlatform_EnableRichUIBehavior();

		/**
		 * The meta object literal for the '<em><b>Enable Fat Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PLATFORM__ENABLE_FAT_CLIENT = eINSTANCE.getTargetPlatform_EnableFatClient();

		/**
		 * The meta object literal for the '<em><b>Portal Expositions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM__PORTAL_EXPOSITIONS = eINSTANCE.getTargetPlatform_PortalExpositions();

		/**
		 * The meta object literal for the '<em><b>Wayf Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM__WAYF_PROFILE = eINSTANCE.getTargetPlatform_WayfProfile();

		/**
		 * The meta object literal for the '<em><b>Security Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM__SECURITY_PROFILE = eINSTANCE.getTargetPlatform_SecurityProfile();

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
		 * The meta object literal for the '<em><b>Navigator Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PANEL__NAVIGATOR_ACTIVE = eINSTANCE.getWizardPanel_NavigatorActive();

		/**
		 * The meta object literal for the '<em><b>Switcher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD_PANEL__SWITCHER = eINSTANCE.getWizardPanel_Switcher();

		/**
		 * The meta object literal for the '<em><b>Numbering Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD_PANEL__NUMBERING_SCHEMA = eINSTANCE.getWizardPanel_NumberingSchema();

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
		 * The meta object literal for the '<em><b>Ext Security Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_MODULE__EXT_SECURITY_MODEL = eINSTANCE.getAppModule_ExtSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Secure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MODULE__SECURE = eINSTANCE.getAppModule_Secure();

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
		 * The meta object literal for the '<em><b>Show Std Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_PANEL__SHOW_STD_LEGEND = eINSTANCE.getMsgBoxPanel_ShowStdLegend();

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
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGETS_PANEL__SUMMARY = eINSTANCE.getWidgetsPanel_Summary();

		/**
		 * The meta object literal for the '<em><b>Collapsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGETS_PANEL__COLLAPSIBLE = eINSTANCE.getWidgetsPanel_Collapsible();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ScreenStateImpl <em>Screen State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ScreenStateImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getScreenState()
		 * @generated
		 */
		EClass SCREEN_STATE = eINSTANCE.getScreenState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_STATE__NAME = eINSTANCE.getScreenState_Name();

		/**
		 * The meta object literal for the '<em><b>Widgets On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_STATE__WIDGETS_ON = eINSTANCE.getScreenState_WidgetsOn();

		/**
		 * The meta object literal for the '<em><b>Widgets Visible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_STATE__WIDGETS_VISIBLE = eINSTANCE.getScreenState_WidgetsVisible();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ScreenStatesImpl <em>Screen States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ScreenStatesImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getScreenStates()
		 * @generated
		 */
		EClass SCREEN_STATES = eINSTANCE.getScreenStates();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_STATES__STATES = eINSTANCE.getScreenStates_States();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ScreenStateCommandImpl <em>Screen State Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ScreenStateCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getScreenStateCommand()
		 * @generated
		 */
		EClass SCREEN_STATE_COMMAND = eINSTANCE.getScreenStateCommand();

		/**
		 * The meta object literal for the '<em><b>Go To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_STATE_COMMAND__GO_TO = eINSTANCE.getScreenStateCommand_GoTo();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ShibbolethSSOImpl <em>Shibboleth SSO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ShibbolethSSOImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getShibbolethSSO()
		 * @generated
		 */
		EClass SHIBBOLETH_SSO = eINSTANCE.getShibbolethSSO();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RoleImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__CODE = eINSTANCE.getRole_Code();

		/**
		 * The meta object literal for the '<em><b>Domain Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DOMAIN_CODE = eINSTANCE.getRole_DomainCode();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RoleBasedSecurityConstraintImpl <em>Role Based Security Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RoleBasedSecurityConstraintImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRoleBasedSecurityConstraint()
		 * @generated
		 */
		EClass ROLE_BASED_SECURITY_CONSTRAINT = eINSTANCE.getRoleBasedSecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BASED_SECURITY_CONSTRAINT__ROLE = eINSTANCE.getRoleBasedSecurityConstraint_Role();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.DeclarativeUIConstraintImpl <em>Declarative UI Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.DeclarativeUIConstraintImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getDeclarativeUIConstraint()
		 * @generated
		 */
		EClass DECLARATIVE_UI_CONSTRAINT = eINSTANCE.getDeclarativeUIConstraint();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATIVE_UI_CONSTRAINT__LANGUAGE = eINSTANCE.getDeclarativeUIConstraint_Language();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATIVE_UI_CONSTRAINT__SCRIPT = eINSTANCE.getDeclarativeUIConstraint_Script();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.FileUploadImpl <em>File Upload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.FileUploadImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getFileUpload()
		 * @generated
		 */
		EClass FILE_UPLOAD = eINSTANCE.getFileUpload();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_UPLOAD__MULTIPLE = eINSTANCE.getFileUpload_Multiple();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TabSwitcherImpl <em>Tab Switcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TabSwitcherImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTabSwitcher()
		 * @generated
		 */
		EClass TAB_SWITCHER = eINSTANCE.getTabSwitcher();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PanelDefImpl <em>Panel Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PanelDefImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDef()
		 * @generated
		 */
		EClass PANEL_DEF = eINSTANCE.getPanelDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL_DEF__NAME = eINSTANCE.getPanelDef_Name();

		/**
		 * The meta object literal for the '<em><b>Panel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__PANEL = eINSTANCE.getPanelDef_Panel();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__PARAMS = eINSTANCE.getPanelDef_Params();

		/**
		 * The meta object literal for the '<em><b>App Data Defs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__APP_DATA_DEFS = eINSTANCE.getPanelDef_AppDataDefs();

		/**
		 * The meta object literal for the '<em><b>Type Defs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__TYPE_DEFS = eINSTANCE.getPanelDef_TypeDefs();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__ROLES = eINSTANCE.getPanelDef_Roles();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__ACTORS = eINSTANCE.getPanelDef_Actors();

		/**
		 * The meta object literal for the '<em><b>Use Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__USE_CASES = eINSTANCE.getPanelDef_UseCases();

		/**
		 * The meta object literal for the '<em><b>On Refresh Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__ON_REFRESH_COMMAND = eINSTANCE.getPanelDef_OnRefreshCommand();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__STATES = eINSTANCE.getPanelDef_States();

		/**
		 * The meta object literal for the '<em><b>Default State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF__DEFAULT_STATE = eINSTANCE.getPanelDef_DefaultState();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PDefParamImpl <em>PDef Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PDefParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefParam()
		 * @generated
		 */
		EClass PDEF_PARAM = eINSTANCE.getPDefParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDEF_PARAM__NAME = eINSTANCE.getPDefParam_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AppDataMappingParamImpl <em>App Data Mapping Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AppDataMappingParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataMappingParam()
		 * @generated
		 */
		EClass APP_DATA_MAPPING_PARAM = eINSTANCE.getAppDataMappingParam();

		/**
		 * The meta object literal for the '<em><b>Def App Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DATA_MAPPING_PARAM__DEF_APP_DATA = eINSTANCE.getAppDataMappingParam_DefAppData();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TypeDefMappingParamImpl <em>Type Def Mapping Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TypeDefMappingParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeDefMappingParam()
		 * @generated
		 */
		EClass TYPE_DEF_MAPPING_PARAM = eINSTANCE.getTypeDefMappingParam();

		/**
		 * The meta object literal for the '<em><b>Def Type Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF = eINSTANCE.getTypeDefMappingParam_DefTypeDef();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UseCaseMappingParamImpl <em>Use Case Mapping Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UseCaseMappingParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUseCaseMappingParam()
		 * @generated
		 */
		EClass USE_CASE_MAPPING_PARAM = eINSTANCE.getUseCaseMappingParam();

		/**
		 * The meta object literal for the '<em><b>Def Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MAPPING_PARAM__DEF_USE_CASE = eINSTANCE.getUseCaseMappingParam_DefUseCase();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RoleMappingParamImpl <em>Role Mapping Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RoleMappingParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRoleMappingParam()
		 * @generated
		 */
		EClass ROLE_MAPPING_PARAM = eINSTANCE.getRoleMappingParam();

		/**
		 * The meta object literal for the '<em><b>Def Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MAPPING_PARAM__DEF_ROLE = eINSTANCE.getRoleMappingParam_DefRole();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActorMappingParamImpl <em>Actor Mapping Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActorMappingParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActorMappingParam()
		 * @generated
		 */
		EClass ACTOR_MAPPING_PARAM = eINSTANCE.getActorMappingParam();

		/**
		 * The meta object literal for the '<em><b>Def Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_MAPPING_PARAM__DEF_ACTOR = eINSTANCE.getActorMappingParam_DefActor();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PanelDefUseImpl <em>Panel Def Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PanelDefUseImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDefUse()
		 * @generated
		 */
		EClass PANEL_DEF_USE = eINSTANCE.getPanelDefUse();

		/**
		 * The meta object literal for the '<em><b>Panel Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF_USE__PANEL_DEF = eINSTANCE.getPanelDefUse_PanelDef();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF_USE__CONFIG = eINSTANCE.getPanelDefUse_Config();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PDefParamValImpl <em>PDef Param Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PDefParamValImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefParamVal()
		 * @generated
		 */
		EClass PDEF_PARAM_VAL = eINSTANCE.getPDefParamVal();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDEF_PARAM_VAL__PARAM = eINSTANCE.getPDefParamVal_Param();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AppDataMappingPDefValImpl <em>App Data Mapping PDef Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AppDataMappingPDefValImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAppDataMappingPDefVal()
		 * @generated
		 */
		EClass APP_DATA_MAPPING_PDEF_VAL = eINSTANCE.getAppDataMappingPDefVal();

		/**
		 * The meta object literal for the '<em><b>Actual App Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA = eINSTANCE.getAppDataMappingPDefVal_ActualAppData();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TypeDefMappingPDefValImpl <em>Type Def Mapping PDef Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TypeDefMappingPDefValImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTypeDefMappingPDefVal()
		 * @generated
		 */
		EClass TYPE_DEF_MAPPING_PDEF_VAL = eINSTANCE.getTypeDefMappingPDefVal();

		/**
		 * The meta object literal for the '<em><b>Actual Type Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF = eINSTANCE.getTypeDefMappingPDefVal_ActualTypeDef();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.UCMappingPDefValImpl <em>UC Mapping PDef Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.UCMappingPDefValImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUCMappingPDefVal()
		 * @generated
		 */
		EClass UC_MAPPING_PDEF_VAL = eINSTANCE.getUCMappingPDefVal();

		/**
		 * The meta object literal for the '<em><b>Actual Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE = eINSTANCE.getUCMappingPDefVal_ActualUseCase();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RoleMappingPDefValImpl <em>Role Mapping PDef Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RoleMappingPDefValImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRoleMappingPDefVal()
		 * @generated
		 */
		EClass ROLE_MAPPING_PDEF_VAL = eINSTANCE.getRoleMappingPDefVal();

		/**
		 * The meta object literal for the '<em><b>Actual Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE = eINSTANCE.getRoleMappingPDefVal_ActualRole();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActorMappingPDefValImpl <em>Actor Mapping PDef Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActorMappingPDefValImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActorMappingPDefVal()
		 * @generated
		 */
		EClass ACTOR_MAPPING_PDEF_VAL = eINSTANCE.getActorMappingPDefVal();

		/**
		 * The meta object literal for the '<em><b>Actual Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR = eINSTANCE.getActorMappingPDefVal_ActualActor();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PDefUseConfigImpl <em>PDef Use Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PDefUseConfigImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefUseConfig()
		 * @generated
		 */
		EClass PDEF_USE_CONFIG = eINSTANCE.getPDefUseConfig();

		/**
		 * The meta object literal for the '<em><b>Param Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDEF_USE_CONFIG__PARAM_VALUES = eINSTANCE.getPDefUseConfig_ParamValues();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActivationModelImpl <em>Activation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActivationModelImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActivationModel()
		 * @generated
		 */
		EClass ACTIVATION_MODEL = eINSTANCE.getActivationModel();

		/**
		 * The meta object literal for the '<em><b>Activation Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_MODEL__ACTIVATION_PARAMS = eINSTANCE.getActivationModel_ActivationParams();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActivationParamImpl <em>Activation Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActivationParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActivationParam()
		 * @generated
		 */
		EClass ACTIVATION_PARAM = eINSTANCE.getActivationParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_PARAM__NAME = eINSTANCE.getActivationParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_PARAM__TYPE = eINSTANCE.getActivationParam_Type();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.BeginEditCommandImpl <em>Begin Edit Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.BeginEditCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getBeginEditCommand()
		 * @generated
		 */
		EClass BEGIN_EDIT_COMMAND = eINSTANCE.getBeginEditCommand();

		/**
		 * The meta object literal for the '<em><b>Data Edited</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEGIN_EDIT_COMMAND__DATA_EDITED = eINSTANCE.getBeginEditCommand_DataEdited();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.EndEditCommandImpl <em>End Edit Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.EndEditCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEndEditCommand()
		 * @generated
		 */
		EClass END_EDIT_COMMAND = eINSTANCE.getEndEditCommand();

		/**
		 * The meta object literal for the '<em><b>Data Edited</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_EDIT_COMMAND__DATA_EDITED = eINSTANCE.getEndEditCommand_DataEdited();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_EDIT_COMMAND__UNDO = eINSTANCE.getEndEditCommand_Undo();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl <em>Chk Edit Status Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getChkEditStatusCommand()
		 * @generated
		 */
		EClass CHK_EDIT_STATUS_COMMAND = eINSTANCE.getChkEditStatusCommand();

		/**
		 * The meta object literal for the '<em><b>Data Checked</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHK_EDIT_STATUS_COMMAND__DATA_CHECKED = eINSTANCE.getChkEditStatusCommand_DataChecked();

		/**
		 * The meta object literal for the '<em><b>Check Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION = eINSTANCE.getChkEditStatusCommand_CheckAggregation();

		/**
		 * The meta object literal for the '<em><b>Do If Changed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED = eINSTANCE.getChkEditStatusCommand_DoIfChanged();

		/**
		 * The meta object literal for the '<em><b>Do If Not Changed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED = eINSTANCE.getChkEditStatusCommand_DoIfNotChanged();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PanelDefStateImpl <em>Panel Def State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PanelDefStateImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDefState()
		 * @generated
		 */
		EClass PANEL_DEF_STATE = eINSTANCE.getPanelDefState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL_DEF_STATE__NAME = eINSTANCE.getPanelDefState_Name();

		/**
		 * The meta object literal for the '<em><b>Widgets On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF_STATE__WIDGETS_ON = eINSTANCE.getPanelDefState_WidgetsOn();

		/**
		 * The meta object literal for the '<em><b>Widgets Visible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF_STATE__WIDGETS_VISIBLE = eINSTANCE.getPanelDefState_WidgetsVisible();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PDefStateCommandImpl <em>PDef State Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PDefStateCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPDefStateCommand()
		 * @generated
		 */
		EClass PDEF_STATE_COMMAND = eINSTANCE.getPDefStateCommand();

		/**
		 * The meta object literal for the '<em><b>Go To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDEF_STATE_COMMAND__GO_TO = eINSTANCE.getPDefStateCommand_GoTo();

		/**
		 * The meta object literal for the '<em><b>PDef Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDEF_STATE_COMMAND__PDEF_USE = eINSTANCE.getPDefStateCommand_PDefUse();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PanelDefStatesImpl <em>Panel Def States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PanelDefStatesImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelDefStates()
		 * @generated
		 */
		EClass PANEL_DEF_STATES = eINSTANCE.getPanelDefStates();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL_DEF_STATES__STATES = eINSTANCE.getPanelDefStates_States();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TableCustomizationParamImpl <em>Table Customization Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TableCustomizationParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTableCustomizationParam()
		 * @generated
		 */
		EClass TABLE_CUSTOMIZATION_PARAM = eINSTANCE.getTableCustomizationParam();

		/**
		 * The meta object literal for the '<em><b>Base Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CUSTOMIZATION_PARAM__BASE_TABLE = eINSTANCE.getTableCustomizationParam_BaseTable();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ExtraColumnImpl <em>Extra Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ExtraColumnImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExtraColumn()
		 * @generated
		 */
		EClass EXTRA_COLUMN = eINSTANCE.getExtraColumn();

		/**
		 * The meta object literal for the '<em><b>Insert After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRA_COLUMN__INSERT_AFTER = eINSTANCE.getExtraColumn_InsertAfter();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.TableCustomizationPDefValImpl <em>Table Customization PDef Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.TableCustomizationPDefValImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTableCustomizationPDefVal()
		 * @generated
		 */
		EClass TABLE_CUSTOMIZATION_PDEF_VAL = eINSTANCE.getTableCustomizationPDefVal();

		/**
		 * The meta object literal for the '<em><b>Extra Cols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS = eINSTANCE.getTableCustomizationPDefVal_ExtraCols();

		/**
		 * The meta object literal for the '<em><b>Hidden Cols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS = eINSTANCE.getTableCustomizationPDefVal_HiddenCols();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CustomCartridgeImpl <em>Custom Cartridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CustomCartridgeImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomCartridge()
		 * @generated
		 */
		EClass CUSTOM_CARTRIDGE = eINSTANCE.getCustomCartridge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CARTRIDGE__NAME = eINSTANCE.getCustomCartridge_Name();

		/**
		 * The meta object literal for the '<em><b>Crt ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CARTRIDGE__CRT_ID = eINSTANCE.getCustomCartridge_CrtID();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_CARTRIDGE__TEMPLATES = eINSTANCE.getCustomCartridge_Templates();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CustomTemplateImpl <em>Custom Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CustomTemplateImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomTemplate()
		 * @generated
		 */
		EClass CUSTOM_TEMPLATE = eINSTANCE.getCustomTemplate();

		/**
		 * The meta object literal for the '<em><b>Tpl ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TEMPLATE__TPL_ID = eINSTANCE.getCustomTemplate_TplID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TEMPLATE__NAME = eINSTANCE.getCustomTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Model Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TEMPLATE__MODEL_SLOTS = eINSTANCE.getCustomTemplate_ModelSlots();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ModelSlotDefImpl <em>Model Slot Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ModelSlotDefImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getModelSlotDef()
		 * @generated
		 */
		EClass MODEL_SLOT_DEF = eINSTANCE.getModelSlotDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SLOT_DEF__NAME = eINSTANCE.getModelSlotDef_Name();

		/**
		 * The meta object literal for the '<em><b>Model Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SLOT_DEF__MODEL_CLASS = eINSTANCE.getModelSlotDef_ModelClass();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ModelSlotImpl <em>Model Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ModelSlotImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getModelSlot()
		 * @generated
		 */
		EClass MODEL_SLOT = eINSTANCE.getModelSlot();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SLOT__DEF = eINSTANCE.getModelSlot_Def();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_SLOT__VAL = eINSTANCE.getModelSlot_Val();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ClearAppdataCommandImpl <em>Clear Appdata Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ClearAppdataCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getClearAppdataCommand()
		 * @generated
		 */
		EClass CLEAR_APPDATA_COMMAND = eINSTANCE.getClearAppdataCommand();

		/**
		 * The meta object literal for the '<em><b>App Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_APPDATA_COMMAND__APP_DATA = eINSTANCE.getClearAppdataCommand_AppData();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MapViewImpl <em>Map View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MapViewImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMapView()
		 * @generated
		 */
		EClass MAP_VIEW = eINSTANCE.getMapView();

		/**
		 * The meta object literal for the '<em><b>Map Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__MAP_ID = eINSTANCE.getMapView_MapId();

		/**
		 * The meta object literal for the '<em><b>Start Envelope Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__START_ENVELOPE_SPEC = eINSTANCE.getMapView_StartEnvelopeSpec();

		/**
		 * The meta object literal for the '<em><b>Max Envelope Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__MAX_ENVELOPE_SPEC = eINSTANCE.getMapView_MaxEnvelopeSpec();

		/**
		 * The meta object literal for the '<em><b>Scale Envelope Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__SCALE_ENVELOPE_SPEC = eINSTANCE.getMapView_ScaleEnvelopeSpec();

		/**
		 * The meta object literal for the '<em><b>Num Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__NUM_LEVELS = eINSTANCE.getMapView_NumLevels();

		/**
		 * The meta object literal for the '<em><b>Edit Data Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__EDIT_DATA_BINDING = eINSTANCE.getMapView_EditDataBinding();

		/**
		 * The meta object literal for the '<em><b>Gadgets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__GADGETS = eINSTANCE.getMapView_Gadgets();

		/**
		 * The meta object literal for the '<em><b>No Click When Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__NO_CLICK_WHEN_DISABLED = eINSTANCE.getMapView_NoClickWhenDisabled();

		/**
		 * The meta object literal for the '<em><b>No Edit When Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__NO_EDIT_WHEN_DISABLED = eINSTANCE.getMapView_NoEditWhenDisabled();

		/**
		 * The meta object literal for the '<em><b>No Zoom When Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__NO_ZOOM_WHEN_DISABLED = eINSTANCE.getMapView_NoZoomWhenDisabled();

		/**
		 * The meta object literal for the '<em><b>No Pan When Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__NO_PAN_WHEN_DISABLED = eINSTANCE.getMapView_NoPanWhenDisabled();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PointImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MapEnvelopeImpl <em>Map Envelope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MapEnvelopeImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMapEnvelope()
		 * @generated
		 */
		EClass MAP_ENVELOPE = eINSTANCE.getMapEnvelope();

		/**
		 * The meta object literal for the '<em><b>North East</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ENVELOPE__NORTH_EAST = eINSTANCE.getMapEnvelope_NorthEast();

		/**
		 * The meta object literal for the '<em><b>South West</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ENVELOPE__SOUTH_WEST = eINSTANCE.getMapEnvelope_SouthWest();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PortalProfileImpl <em>Portal Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PortalProfileImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPortalProfile()
		 * @generated
		 */
		EClass PORTAL_PROFILE = eINSTANCE.getPortalProfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PROFILE__NAME = eINSTANCE.getPortalProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Res Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_PROFILE__RES_MODULES = eINSTANCE.getPortalProfile_ResModules();

		/**
		 * The meta object literal for the '<em><b>Where Are You From Portal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PROFILE__WHERE_ARE_YOU_FROM_PORTAL_CODE = eINSTANCE.getPortalProfile_WhereAreYouFromPortalCode();

		/**
		 * The meta object literal for the '<em><b>Resource Provider Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_PROFILE__RESOURCE_PROVIDER_CODE = eINSTANCE.getPortalProfile_ResourceProviderCode();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.WebResourceModuleImpl <em>Web Resource Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.WebResourceModuleImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWebResourceModule()
		 * @generated
		 */
		EClass WEB_RESOURCE_MODULE = eINSTANCE.getWebResourceModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RESOURCE_MODULE__NAME = eINSTANCE.getWebResourceModule_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RESOURCE_MODULE__VERSION = eINSTANCE.getWebResourceModule_Version();

		/**
		 * The meta object literal for the '<em><b>Repart Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RESOURCE_MODULE__REPART_MODULE = eINSTANCE.getWebResourceModule_RepartModule();

		/**
		 * The meta object literal for the '<em><b>Deployment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE = eINSTANCE.getWebResourceModule_DeploymentType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.StdWebResourceModuleImpl <em>Std Web Resource Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.StdWebResourceModuleImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStdWebResourceModule()
		 * @generated
		 */
		EClass STD_WEB_RESOURCE_MODULE = eINSTANCE.getStdWebResourceModule();

		/**
		 * The meta object literal for the '<em><b>Std Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STD_WEB_RESOURCE_MODULE__STD_NAME = eINSTANCE.getStdWebResourceModule_StdName();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RepartArtifactImpl <em>Repart Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RepartArtifactImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRepartArtifact()
		 * @generated
		 */
		EClass REPART_ARTIFACT = eINSTANCE.getRepartArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPART_ARTIFACT__NAME = eINSTANCE.getRepartArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPART_ARTIFACT__TYPE = eINSTANCE.getRepartArtifact_Type();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RepartModuleImpl <em>Repart Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RepartModuleImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRepartModule()
		 * @generated
		 */
		EClass REPART_MODULE = eINSTANCE.getRepartModule();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPART_MODULE__ORGANIZATION = eINSTANCE.getRepartModule_Organization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPART_MODULE__NAME = eINSTANCE.getRepartModule_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPART_MODULE__VERSION = eINSTANCE.getRepartModule_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPART_MODULE__TYPE = eINSTANCE.getRepartModule_Type();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPART_MODULE__ARTIFACTS = eINSTANCE.getRepartModule_Artifacts();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.BreadcrumbImpl <em>Breadcrumb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.BreadcrumbImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getBreadcrumb()
		 * @generated
		 */
		EClass BREADCRUMB = eINSTANCE.getBreadcrumb();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl <em>Map View Gadgets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.MapViewGadgetsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMapViewGadgets()
		 * @generated
		 */
		EClass MAP_VIEW_GADGETS = eINSTANCE.getMapViewGadgets();

		/**
		 * The meta object literal for the '<em><b>Layer Switcher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__LAYER_SWITCHER = eINSTANCE.getMapViewGadgets_LayerSwitcher();

		/**
		 * The meta object literal for the '<em><b>Background Map Map Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME = eINSTANCE.getMapViewGadgets_BackgroundMapMapServiceName();

		/**
		 * The meta object literal for the '<em><b>Background Map Switcher Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL = eINSTANCE.getMapViewGadgets_BackgroundMapSwitcherLabel();

		/**
		 * The meta object literal for the '<em><b>Background Photo Aerial Map Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME = eINSTANCE.getMapViewGadgets_BackgroundPhotoAerialMapServiceName();

		/**
		 * The meta object literal for the '<em><b>Background Photo Aerial Switcher Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL = eINSTANCE.getMapViewGadgets_BackgroundPhotoAerialSwitcherLabel();

		/**
		 * The meta object literal for the '<em><b>Point Editing Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE = eINSTANCE.getMapViewGadgets_PointEditingActive();

		/**
		 * The meta object literal for the '<em><b>Line Editing Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE = eINSTANCE.getMapViewGadgets_LineEditingActive();

		/**
		 * The meta object literal for the '<em><b>Polygon Editing Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE = eINSTANCE.getMapViewGadgets_PolygonEditingActive();

		/**
		 * The meta object literal for the '<em><b>Modify Editing Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE = eINSTANCE.getMapViewGadgets_ModifyEditingActive();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PortalExpositionImpl <em>Portal Exposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PortalExpositionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPortalExposition()
		 * @generated
		 */
		EClass PORTAL_EXPOSITION = eINSTANCE.getPortalExposition();

		/**
		 * The meta object literal for the '<em><b>Portal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTAL_EXPOSITION__PORTAL = eINSTANCE.getPortalExposition_Portal();

		/**
		 * The meta object literal for the '<em><b>Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTAL_EXPOSITION__AREA_CODE = eINSTANCE.getPortalExposition_AreaCode();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CPCommandImpl <em>CP Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CPCommandImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCPCommand()
		 * @generated
		 */
		EClass CP_COMMAND = eINSTANCE.getCPCommand();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP_COMMAND__EXECUTE = eINSTANCE.getCPCommand_Execute();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP_COMMAND__COMMAND = eINSTANCE.getCPCommand_Command();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CPCommandsImpl <em>CP Commands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CPCommandsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCPCommands()
		 * @generated
		 */
		EClass CP_COMMANDS = eINSTANCE.getCPCommands();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP_COMMANDS__COMMANDS = eINSTANCE.getCPCommands_Commands();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.SecurityProfileImpl <em>Security Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.SecurityProfileImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSecurityProfile()
		 * @generated
		 */
		EClass SECURITY_PROFILE = eINSTANCE.getSecurityProfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_PROFILE__NAME = eINSTANCE.getSecurityProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Ext Auth Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PROFILE__EXT_AUTH_GUARD = eINSTANCE.getSecurityProfile_ExtAuthGuard();

		/**
		 * The meta object literal for the '<em><b>Int Auth Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PROFILE__INT_AUTH_GUARD = eINSTANCE.getSecurityProfile_IntAuthGuard();

		/**
		 * The meta object literal for the '<em><b>Id Adapter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PROFILE__ID_ADAPTER = eINSTANCE.getSecurityProfile_IdAdapter();

		/**
		 * The meta object literal for the '<em><b>Pep Impl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PROFILE__PEP_IMPL = eINSTANCE.getSecurityProfile_PepImpl();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ExternalAuthenticationGuardImpl <em>External Authentication Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ExternalAuthenticationGuardImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExternalAuthenticationGuard()
		 * @generated
		 */
		EClass EXTERNAL_AUTHENTICATION_GUARD = eINSTANCE.getExternalAuthenticationGuard();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.InternalAuthenticationGuardImpl <em>Internal Authentication Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.InternalAuthenticationGuardImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInternalAuthenticationGuard()
		 * @generated
		 */
		EClass INTERNAL_AUTHENTICATION_GUARD = eINSTANCE.getInternalAuthenticationGuard();

		/**
		 * The meta object literal for the '<em><b>Login Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_AUTHENTICATION_GUARD__LOGIN_MODULE = eINSTANCE.getInternalAuthenticationGuard_LoginModule();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_AUTHENTICATION_GUARD__PARAMS = eINSTANCE.getInternalAuthenticationGuard_Params();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.WAYFRequestAdapterImpl <em>WAYF Request Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.WAYFRequestAdapterImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWAYFRequestAdapter()
		 * @generated
		 */
		EClass WAYF_REQUEST_ADAPTER = eINSTANCE.getWAYFRequestAdapter();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAYF_REQUEST_ADAPTER__SOURCE_TYPE = eINSTANCE.getWAYFRequestAdapter_SourceType();

		/**
		 * The meta object literal for the '<em><b>Info Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAYF_REQUEST_ADAPTER__INFO_SOURCE_NAME = eINSTANCE.getWAYFRequestAdapter_InfoSourceName();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.WAYFProfileImpl <em>WAYF Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.WAYFProfileImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWAYFProfile()
		 * @generated
		 */
		EClass WAYF_PROFILE = eINSTANCE.getWAYFProfile();

		/**
		 * The meta object literal for the '<em><b>Request Adapter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAYF_PROFILE__REQUEST_ADAPTER = eINSTANCE.getWAYFProfile_RequestAdapter();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.LoginUIImpl <em>Login UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.LoginUIImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLoginUI()
		 * @generated
		 */
		EClass LOGIN_UI = eINSTANCE.getLoginUI();

		/**
		 * The meta object literal for the '<em><b>Ui Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_UI__UI_TYPE = eINSTANCE.getLoginUI_UiType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.LoginModuleImpl <em>Login Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.LoginModuleImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLoginModule()
		 * @generated
		 */
		EClass LOGIN_MODULE = eINSTANCE.getLoginModule();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_MODULE__INTERNAL = eINSTANCE.getLoginModule_Internal();

		/**
		 * The meta object literal for the '<em><b>Login UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_MODULE__LOGIN_UI = eINSTANCE.getLoginModule_LoginUI();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl <em>Identity Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.IdentityAdapterImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getIdentityAdapter()
		 * @generated
		 */
		EClass IDENTITY_ADAPTER = eINSTANCE.getIdentityAdapter();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY_ADAPTER__SOURCE_TYPE = eINSTANCE.getIdentityAdapter_SourceType();

		/**
		 * The meta object literal for the '<em><b>Info Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY_ADAPTER__INFO_SOURCE_NAME = eINSTANCE.getIdentityAdapter_InfoSourceName();

		/**
		 * The meta object literal for the '<em><b>Ticket Verify Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY_ADAPTER__TICKET_VERIFY_METHOD = eINSTANCE.getIdentityAdapter_TicketVerifyMethod();

		/**
		 * The meta object literal for the '<em><b>Inline Code Snippets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS = eINSTANCE.getIdentityAdapter_InlineCodeSnippets();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY_ADAPTER__PARAMS = eINSTANCE.getIdentityAdapter_Params();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.EnvConfigParamImpl <em>Env Config Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.EnvConfigParamImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEnvConfigParam()
		 * @generated
		 */
		EClass ENV_CONFIG_PARAM = eINSTANCE.getEnvConfigParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_CONFIG_PARAM__NAME = eINSTANCE.getEnvConfigParam_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.EnvConfigParamsImpl <em>Env Config Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.EnvConfigParamsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEnvConfigParams()
		 * @generated
		 */
		EClass ENV_CONFIG_PARAMS = eINSTANCE.getEnvConfigParams();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_CONFIG_PARAMS__PARAMS = eINSTANCE.getEnvConfigParams_Params();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.PEPImplementationImpl <em>PEP Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.PEPImplementationImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPEPImplementation()
		 * @generated
		 */
		EClass PEP_IMPLEMENTATION = eINSTANCE.getPEPImplementation();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEP_IMPLEMENTATION__PARAMS = eINSTANCE.getPEPImplementation_Params();

		/**
		 * The meta object literal for the '<em><b>Custom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEP_IMPLEMENTATION__CUSTOM = eINSTANCE.getPEPImplementation_Custom();

		/**
		 * The meta object literal for the '<em><b>Inline Code Snippets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS = eINSTANCE.getPEPImplementation_InlineCodeSnippets();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl <em>Inline Code Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInlineCodeSnippet()
		 * @generated
		 */
		EClass INLINE_CODE_SNIPPET = eINSTANCE.getInlineCodeSnippet();

		/**
		 * The meta object literal for the '<em><b>Snippet Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CODE_SNIPPET__SNIPPET_POSITION = eINSTANCE.getInlineCodeSnippet_SnippetPosition();

		/**
		 * The meta object literal for the '<em><b>Snippet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CODE_SNIPPET__SNIPPET_NAME = eINSTANCE.getInlineCodeSnippet_SnippetName();

		/**
		 * The meta object literal for the '<em><b>Snippet Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CODE_SNIPPET__SNIPPET_CODE = eINSTANCE.getInlineCodeSnippet_SnippetCode();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CODE_SNIPPET__LANG = eINSTANCE.getInlineCodeSnippet_Lang();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.AnnotatedElement <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.AnnotatedElement
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_ELEMENT__ANNOTATIONS = eINSTANCE.getAnnotatedElement_Annotations();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AnnotationImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__SOURCE = eINSTANCE.getAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__DETAILS = eINSTANCE.getAnnotation_Details();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.AnnotationDetailImpl <em>Annotation Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.AnnotationDetailImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAnnotationDetail()
		 * @generated
		 */
		EClass ANNOTATION_DETAIL = eINSTANCE.getAnnotationDetail();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_DETAIL__KEY = eINSTANCE.getAnnotationDetail_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_DETAIL__VALUE = eINSTANCE.getAnnotationDetail_Value();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CaptchaImpl <em>Captcha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CaptchaImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCaptcha()
		 * @generated
		 */
		EClass CAPTCHA = eINSTANCE.getCaptcha();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.SliderImpl <em>Slider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.SliderImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSlider()
		 * @generated
		 */
		EClass SLIDER = eINSTANCE.getSlider();

		/**
		 * The meta object literal for the '<em><b>Use Collection Data As</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__USE_COLLECTION_DATA_AS = eINSTANCE.getSlider_UseCollectionDataAs();

		/**
		 * The meta object literal for the '<em><b>Static Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__STATIC_LOWER_BOUND = eINSTANCE.getSlider_StaticLowerBound();

		/**
		 * The meta object literal for the '<em><b>Static Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__STATIC_UPPER_BOUND = eINSTANCE.getSlider_StaticUpperBound();

		/**
		 * The meta object literal for the '<em><b>Static Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER__STATIC_STEP = eINSTANCE.getSlider_StaticStep();

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
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.MethodProtectionTypes <em>Method Protection Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.MethodProtectionTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMethodProtectionTypes()
		 * @generated
		 */
		EEnum METHOD_PROTECTION_TYPES = eINSTANCE.getMethodProtectionTypes();

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
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.LogoutActionTypes <em>Logout Action Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.LogoutActionTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLogoutActionTypes()
		 * @generated
		 */
		EEnum LOGOUT_ACTION_TYPES = eINSTANCE.getLogoutActionTypes();

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

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.InlineScriptingLanguage <em>Inline Scripting Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.InlineScriptingLanguage
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInlineScriptingLanguage()
		 * @generated
		 */
		EEnum INLINE_SCRIPTING_LANGUAGE = eINSTANCE.getInlineScriptingLanguage();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.LogicAggregationTypes <em>Logic Aggregation Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.LogicAggregationTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLogicAggregationTypes()
		 * @generated
		 */
		EEnum LOGIC_AGGREGATION_TYPES = eINSTANCE.getLogicAggregationTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.CustomCartridgeID <em>Custom Cartridge ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.CustomCartridgeID
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomCartridgeID()
		 * @generated
		 */
		EEnum CUSTOM_CARTRIDGE_ID = eINSTANCE.getCustomCartridgeID();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.CommandFunctions <em>Command Functions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.CommandFunctions
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCommandFunctions()
		 * @generated
		 */
		EEnum COMMAND_FUNCTIONS = eINSTANCE.getCommandFunctions();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.WebResModuleDeployTypes <em>Web Res Module Deploy Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.WebResModuleDeployTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWebResModuleDeployTypes()
		 * @generated
		 */
		EEnum WEB_RES_MODULE_DEPLOY_TYPES = eINSTANCE.getWebResModuleDeployTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.StdWebResModuleNames <em>Std Web Res Module Names</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.StdWebResModuleNames
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStdWebResModuleNames()
		 * @generated
		 */
		EEnum STD_WEB_RES_MODULE_NAMES = eINSTANCE.getStdWebResModuleNames();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.RepartModuleTypes <em>Repart Module Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.RepartModuleTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRepartModuleTypes()
		 * @generated
		 */
		EEnum REPART_MODULE_TYPES = eINSTANCE.getRepartModuleTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.WizardNumberingTypes <em>Wizard Numbering Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.WizardNumberingTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWizardNumberingTypes()
		 * @generated
		 */
		EEnum WIZARD_NUMBERING_TYPES = eINSTANCE.getWizardNumberingTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.CPCommandExecutionTypes <em>CP Command Execution Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.CPCommandExecutionTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCPCommandExecutionTypes()
		 * @generated
		 */
		EEnum CP_COMMAND_EXECUTION_TYPES = eINSTANCE.getCPCommandExecutionTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.TicketVerifyMethod <em>Ticket Verify Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.TicketVerifyMethod
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTicketVerifyMethod()
		 * @generated
		 */
		EEnum TICKET_VERIFY_METHOD = eINSTANCE.getTicketVerifyMethod();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.LoginUITypes <em>Login UI Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.LoginUITypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getLoginUITypes()
		 * @generated
		 */
		EEnum LOGIN_UI_TYPES = eINSTANCE.getLoginUITypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.InfoSourceTypes <em>Info Source Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.InfoSourceTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getInfoSourceTypes()
		 * @generated
		 */
		EEnum INFO_SOURCE_TYPES = eINSTANCE.getInfoSourceTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.TreeSelectionTypes <em>Tree Selection Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.TreeSelectionTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTreeSelectionTypes()
		 * @generated
		 */
		EEnum TREE_SELECTION_TYPES = eINSTANCE.getTreeSelectionTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes <em>Slider Collection Values Usage Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSliderCollectionValuesUsageTypes()
		 * @generated
		 */
		EEnum SLIDER_COLLECTION_VALUES_USAGE_TYPES = eINSTANCE.getSliderCollectionValuesUsageTypes();

	}

} //GuigenPackage
