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
	 * The feature id for the '<em><b>On Init Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA__ON_INIT_ACTION = 5;

	/**
	 * The number of structural features of the '<em>Application Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_AREA_FEATURE_COUNT = 6;

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
	 * The number of structural features of the '<em>Content Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PANEL_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__LABEL = PANEL__LABEL;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__LAYOUT = PANEL__LAYOUT;

	/**
	 * The feature id for the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__LAYOUT_SPEC = PANEL__LAYOUT_SPEC;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL__TABS = PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab Set Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_SET_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 1;

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
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Command Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__DATA_TYPE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET__DATA_TYPE_MODIFIER = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TextFieldImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 12;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.TextAreaImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 13;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CalendarImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 14;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The feature id for the '<em><b>Column Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN_MODEL = DATA_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = DATA_WIDGET_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>GUI Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_MODEL_FEATURE_COUNT = 6;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.GUIBehaviorsImpl <em>GUI Behaviors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.GUIBehaviorsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getGUIBehaviors()
	 * @generated
	 */
	int GUI_BEHAVIORS = 20;

	/**
	 * The number of structural features of the '<em>GUI Behaviors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_BEHAVIORS_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__DATA_TYPE = DATA_WIDGET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Data Type Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTONS__DATA_TYPE_MODIFIER = DATA_WIDGET__DATA_TYPE_MODIFIER;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RadioButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 22;

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
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ConfirmButtonImpl <em>Confirm Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ConfirmButtonImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getConfirmButton()
	 * @generated
	 */
	int CONFIRM_BUTTON = 24;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.PanelLayoutImpl <em>Panel Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.PanelLayoutImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getPanelLayout()
	 * @generated
	 */
	int PANEL_LAYOUT = 25;

	/**
	 * The number of structural features of the '<em>Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_LAYOUT_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Horizontal Flow Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_FLOW_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Vertical Flow Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FLOW_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>UDLRC Panel Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDLRC_PANEL_LAYOUT_FEATURE_COUNT = PANEL_LAYOUT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Widget Layout Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT_SPECIFIER_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ImageImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 31;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.MenuImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 32;

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
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = 3;

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
	 * The number of structural features of the '<em>Disabled Component Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLED_COMPONENT_SET_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MODEL__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Column Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MODEL_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 37;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActionEventImpl <em>Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActionEventImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionEvent()
	 * @generated
	 */
	int ACTION_EVENT = 38;

	/**
	 * The number of structural features of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ONOFFActionImpl <em>ONOFF Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ONOFFActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getONOFFAction()
	 * @generated
	 */
	int ONOFF_ACTION = 39;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_ACTION__TARGET_WIDGETS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_ACTION__ENABLE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ONOFF Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONOFF_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.CustomActionImpl <em>Custom Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.CustomActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomAction()
	 * @generated
	 */
	int CUSTOM_ACTION = 40;

	/**
	 * The number of structural features of the '<em>Custom Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.VisibilityActionImpl <em>Visibility Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.VisibilityActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVisibilityAction()
	 * @generated
	 */
	int VISIBILITY_ACTION = 41;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ACTION__TARGET_WIDGETS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ACTION__SHOW = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visibility Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.RefreshViewActionImpl <em>Refresh View Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.RefreshViewActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRefreshViewAction()
	 * @generated
	 */
	int REFRESH_VIEW_ACTION = 42;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_ACTION__TARGET_WIDGETS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Panels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_ACTION__TARGET_PANELS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refresh View Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRESH_VIEW_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.JumpActionImpl <em>Jump Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.JumpActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpAction()
	 * @generated
	 */
	int JUMP_ACTION = 43;

	/**
	 * The feature id for the '<em><b>Jump To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_ACTION__JUMP_TO = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Push Current Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_ACTION__PUSH_CURRENT_PAGE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jump Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ExecActionImpl <em>Exec Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ExecActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExecAction()
	 * @generated
	 */
	int EXEC_ACTION = 44;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ACTION__RESULTS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exec Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__EVENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = 2;

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
	 * The number of structural features of the '<em>Widget Target Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TARGET_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActionOnWidgetsImpl <em>Action On Widgets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActionOnWidgetsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionOnWidgets()
	 * @generated
	 */
	int ACTION_ON_WIDGETS = 47;

	/**
	 * The feature id for the '<em><b>Target Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_WIDGETS__TARGET_WIDGETS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action On Widgets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_WIDGETS_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Dialog Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL__DIALOG_CONTENT = PANEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dialog Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ShowDialogActionImpl <em>Show Dialog Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ShowDialogActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getShowDialogAction()
	 * @generated
	 */
	int SHOW_DIALOG_ACTION = 49;

	/**
	 * The feature id for the '<em><b>Dialog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_DIALOG_ACTION__DIALOG = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Show Dialog Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_DIALOG_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActionResultImpl <em>Action Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActionResultImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionResult()
	 * @generated
	 */
	int ACTION_RESULT = 50;

	/**
	 * The feature id for the '<em><b>Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT__RESULT_CODE = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Action Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.ActionOnPanelsImpl <em>Action On Panels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.ActionOnPanelsImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionOnPanels()
	 * @generated
	 */
	int ACTION_ON_PANELS = 51;

	/**
	 * The feature id for the '<em><b>Target Panels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_PANELS__TARGET_PANELS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action On Panels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_PANELS_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

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
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.StaticLinksImpl <em>Static Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.StaticLinksImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getStaticLinks()
	 * @generated
	 */
	int STATIC_LINKS = 55;

	/**
	 * The number of structural features of the '<em>Static Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_LINKS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.SequenceActionImpl <em>Sequence Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.SequenceActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSequenceAction()
	 * @generated
	 */
	int SEQUENCE_ACTION = 56;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACTION__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.impl.JumpBackActionImpl <em>Jump Back Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.impl.JumpBackActionImpl
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpBackAction()
	 * @generated
	 */
	int JUMP_BACK_ACTION = 57;

	/**
	 * The number of structural features of the '<em>Jump Back Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_BACK_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.WidgetDataType <em>Widget Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.WidgetDataType
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getWidgetDataType()
	 * @generated
	 */
	int WIDGET_DATA_TYPE = 58;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.UDLRCSpecConstants <em>UDLRC Spec Constants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.UDLRCSpecConstants
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getUDLRCSpecConstants()
	 * @generated
	 */
	int UDLRC_SPEC_CONSTANTS = 59;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.guigen.EventTypes <em>Event Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getEventTypes()
	 * @generated
	 */
	int EVENT_TYPES = 60;


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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ApplicationArea#getOnInitAction <em>On Init Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Init Action</em>'.
	 * @see it.csi.mddtools.guigen.ApplicationArea#getOnInitAction()
	 * @see #getApplicationArea()
	 * @generated
	 */
	EReference getApplicationArea_OnInitAction();

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
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.TabSetPanel#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see it.csi.mddtools.guigen.TabSetPanel#getTabs()
	 * @see #getTabSetPanel()
	 * @generated
	 */
	EReference getTabSetPanel_Tabs();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.DataWidget#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see it.csi.mddtools.guigen.DataWidget#getDataType()
	 * @see #getDataWidget()
	 * @generated
	 */
	EAttribute getDataWidget_DataType();

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
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see it.csi.mddtools.guigen.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.guigen.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see it.csi.mddtools.guigen.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Event</em>'.
	 * @see it.csi.mddtools.guigen.ActionEvent
	 * @generated
	 */
	EClass getActionEvent();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ONOFFAction <em>ONOFF Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ONOFF Action</em>'.
	 * @see it.csi.mddtools.guigen.ONOFFAction
	 * @generated
	 */
	EClass getONOFFAction();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ONOFFAction#isEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see it.csi.mddtools.guigen.ONOFFAction#isEnable()
	 * @see #getONOFFAction()
	 * @generated
	 */
	EAttribute getONOFFAction_Enable();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.CustomAction <em>Custom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Action</em>'.
	 * @see it.csi.mddtools.guigen.CustomAction
	 * @generated
	 */
	EClass getCustomAction();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.VisibilityAction <em>Visibility Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Action</em>'.
	 * @see it.csi.mddtools.guigen.VisibilityAction
	 * @generated
	 */
	EClass getVisibilityAction();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.VisibilityAction#isShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see it.csi.mddtools.guigen.VisibilityAction#isShow()
	 * @see #getVisibilityAction()
	 * @generated
	 */
	EAttribute getVisibilityAction_Show();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.RefreshViewAction <em>Refresh View Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refresh View Action</em>'.
	 * @see it.csi.mddtools.guigen.RefreshViewAction
	 * @generated
	 */
	EClass getRefreshViewAction();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.JumpAction <em>Jump Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Action</em>'.
	 * @see it.csi.mddtools.guigen.JumpAction
	 * @generated
	 */
	EClass getJumpAction();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.JumpAction#getJumpTo <em>Jump To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jump To</em>'.
	 * @see it.csi.mddtools.guigen.JumpAction#getJumpTo()
	 * @see #getJumpAction()
	 * @generated
	 */
	EReference getJumpAction_JumpTo();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.JumpAction#isPushCurrentPage <em>Push Current Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Push Current Page</em>'.
	 * @see it.csi.mddtools.guigen.JumpAction#isPushCurrentPage()
	 * @see #getJumpAction()
	 * @generated
	 */
	EAttribute getJumpAction_PushCurrentPage();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ExecAction <em>Exec Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Action</em>'.
	 * @see it.csi.mddtools.guigen.ExecAction
	 * @generated
	 */
	EClass getExecAction();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.ExecAction#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see it.csi.mddtools.guigen.ExecAction#getResults()
	 * @see #getExecAction()
	 * @generated
	 */
	EReference getExecAction_Results();

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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.EventHandler#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see it.csi.mddtools.guigen.EventHandler#getAction()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Action();

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
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.WidgetTargetAction <em>Widget Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Target Action</em>'.
	 * @see it.csi.mddtools.guigen.WidgetTargetAction
	 * @generated
	 */
	EClass getWidgetTargetAction();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActionOnWidgets <em>Action On Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action On Widgets</em>'.
	 * @see it.csi.mddtools.guigen.ActionOnWidgets
	 * @generated
	 */
	EClass getActionOnWidgets();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ActionOnWidgets#getTargetWidgets <em>Target Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Widgets</em>'.
	 * @see it.csi.mddtools.guigen.ActionOnWidgets#getTargetWidgets()
	 * @see #getActionOnWidgets()
	 * @generated
	 */
	EReference getActionOnWidgets_TargetWidgets();

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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.DialogPanel#getDialogContent <em>Dialog Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dialog Content</em>'.
	 * @see it.csi.mddtools.guigen.DialogPanel#getDialogContent()
	 * @see #getDialogPanel()
	 * @generated
	 */
	EReference getDialogPanel_DialogContent();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ShowDialogAction <em>Show Dialog Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Dialog Action</em>'.
	 * @see it.csi.mddtools.guigen.ShowDialogAction
	 * @generated
	 */
	EClass getShowDialogAction();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.guigen.ShowDialogAction#getDialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dialog</em>'.
	 * @see it.csi.mddtools.guigen.ShowDialogAction#getDialog()
	 * @see #getShowDialogAction()
	 * @generated
	 */
	EReference getShowDialogAction_Dialog();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActionResult <em>Action Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Result</em>'.
	 * @see it.csi.mddtools.guigen.ActionResult
	 * @generated
	 */
	EClass getActionResult();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.guigen.ActionResult#getResultCode <em>Result Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Code</em>'.
	 * @see it.csi.mddtools.guigen.ActionResult#getResultCode()
	 * @see #getActionResult()
	 * @generated
	 */
	EAttribute getActionResult_ResultCode();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.guigen.ActionResult#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see it.csi.mddtools.guigen.ActionResult#getAction()
	 * @see #getActionResult()
	 * @generated
	 */
	EReference getActionResult_Action();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.ActionOnPanels <em>Action On Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action On Panels</em>'.
	 * @see it.csi.mddtools.guigen.ActionOnPanels
	 * @generated
	 */
	EClass getActionOnPanels();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.guigen.ActionOnPanels#getTargetPanels <em>Target Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Panels</em>'.
	 * @see it.csi.mddtools.guigen.ActionOnPanels#getTargetPanels()
	 * @see #getActionOnPanels()
	 * @generated
	 */
	EReference getActionOnPanels_TargetPanels();

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
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.SequenceAction <em>Sequence Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Action</em>'.
	 * @see it.csi.mddtools.guigen.SequenceAction
	 * @generated
	 */
	EClass getSequenceAction();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.guigen.SequenceAction#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see it.csi.mddtools.guigen.SequenceAction#getActions()
	 * @see #getSequenceAction()
	 * @generated
	 */
	EReference getSequenceAction_Actions();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.guigen.JumpBackAction <em>Jump Back Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Back Action</em>'.
	 * @see it.csi.mddtools.guigen.JumpBackAction
	 * @generated
	 */
	EClass getJumpBackAction();

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
		 * The meta object literal for the '<em><b>On Init Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_AREA__ON_INIT_ACTION = eINSTANCE.getApplicationArea_OnInitAction();

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
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_SET_PANEL__TABS = eINSTANCE.getTabSetPanel_Tabs();

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
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WIDGET__DATA_TYPE = eINSTANCE.getDataWidget_DataType();

		/**
		 * The meta object literal for the '<em><b>Data Type Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WIDGET__DATA_TYPE_MODIFIER = eINSTANCE.getDataWidget_DataTypeModifier();

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
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ColumnImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActionEventImpl <em>Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActionEventImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionEvent()
		 * @generated
		 */
		EClass ACTION_EVENT = eINSTANCE.getActionEvent();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ONOFFActionImpl <em>ONOFF Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ONOFFActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getONOFFAction()
		 * @generated
		 */
		EClass ONOFF_ACTION = eINSTANCE.getONOFFAction();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONOFF_ACTION__ENABLE = eINSTANCE.getONOFFAction_Enable();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.CustomActionImpl <em>Custom Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.CustomActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getCustomAction()
		 * @generated
		 */
		EClass CUSTOM_ACTION = eINSTANCE.getCustomAction();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.VisibilityActionImpl <em>Visibility Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.VisibilityActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getVisibilityAction()
		 * @generated
		 */
		EClass VISIBILITY_ACTION = eINSTANCE.getVisibilityAction();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_ACTION__SHOW = eINSTANCE.getVisibilityAction_Show();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.RefreshViewActionImpl <em>Refresh View Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.RefreshViewActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getRefreshViewAction()
		 * @generated
		 */
		EClass REFRESH_VIEW_ACTION = eINSTANCE.getRefreshViewAction();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.JumpActionImpl <em>Jump Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.JumpActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpAction()
		 * @generated
		 */
		EClass JUMP_ACTION = eINSTANCE.getJumpAction();

		/**
		 * The meta object literal for the '<em><b>Jump To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_ACTION__JUMP_TO = eINSTANCE.getJumpAction_JumpTo();

		/**
		 * The meta object literal for the '<em><b>Push Current Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_ACTION__PUSH_CURRENT_PAGE = eINSTANCE.getJumpAction_PushCurrentPage();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ExecActionImpl <em>Exec Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ExecActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getExecAction()
		 * @generated
		 */
		EClass EXEC_ACTION = eINSTANCE.getExecAction();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_ACTION__RESULTS = eINSTANCE.getExecAction_Results();

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
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__ACTION = eINSTANCE.getEventHandler_Action();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_HANDLER__EVENT_TYPE = eINSTANCE.getEventHandler_EventType();

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
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActionOnWidgetsImpl <em>Action On Widgets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActionOnWidgetsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionOnWidgets()
		 * @generated
		 */
		EClass ACTION_ON_WIDGETS = eINSTANCE.getActionOnWidgets();

		/**
		 * The meta object literal for the '<em><b>Target Widgets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ON_WIDGETS__TARGET_WIDGETS = eINSTANCE.getActionOnWidgets_TargetWidgets();

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
		 * The meta object literal for the '<em><b>Dialog Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_PANEL__DIALOG_CONTENT = eINSTANCE.getDialogPanel_DialogContent();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ShowDialogActionImpl <em>Show Dialog Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ShowDialogActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getShowDialogAction()
		 * @generated
		 */
		EClass SHOW_DIALOG_ACTION = eINSTANCE.getShowDialogAction();

		/**
		 * The meta object literal for the '<em><b>Dialog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_DIALOG_ACTION__DIALOG = eINSTANCE.getShowDialogAction_Dialog();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActionResultImpl <em>Action Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActionResultImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionResult()
		 * @generated
		 */
		EClass ACTION_RESULT = eINSTANCE.getActionResult();

		/**
		 * The meta object literal for the '<em><b>Result Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_RESULT__RESULT_CODE = eINSTANCE.getActionResult_ResultCode();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RESULT__ACTION = eINSTANCE.getActionResult_Action();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.ActionOnPanelsImpl <em>Action On Panels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.ActionOnPanelsImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getActionOnPanels()
		 * @generated
		 */
		EClass ACTION_ON_PANELS = eINSTANCE.getActionOnPanels();

		/**
		 * The meta object literal for the '<em><b>Target Panels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ON_PANELS__TARGET_PANELS = eINSTANCE.getActionOnPanels_TargetPanels();

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
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.SequenceActionImpl <em>Sequence Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.SequenceActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getSequenceAction()
		 * @generated
		 */
		EClass SEQUENCE_ACTION = eINSTANCE.getSequenceAction();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_ACTION__ACTIONS = eINSTANCE.getSequenceAction_Actions();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.guigen.impl.JumpBackActionImpl <em>Jump Back Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.guigen.impl.JumpBackActionImpl
		 * @see it.csi.mddtools.guigen.impl.GuigenPackageImpl#getJumpBackAction()
		 * @generated
		 */
		EClass JUMP_BACK_ACTION = eINSTANCE.getJumpBackAction();

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

	}

} //GuigenPackage
