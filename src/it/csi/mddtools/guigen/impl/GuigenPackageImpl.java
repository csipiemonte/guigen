/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;


import it.csi.mddtools.guigen.ActivateMultiPanelItemCommand;
import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.ActorBasedSecurityConstraint;
import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.AppWindow;
import it.csi.mddtools.guigen.ApplicationArea;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ApplicationDataDefs;
import it.csi.mddtools.guigen.AutenticationMethod;
import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Calendar;
import it.csi.mddtools.guigen.CheckBox;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.ColumnModel;
import it.csi.mddtools.guigen.ComboBox;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.CommandEvent;
import it.csi.mddtools.guigen.CommandOnPanels;
import it.csi.mddtools.guigen.CommandOnWidgets;
import it.csi.mddtools.guigen.CommandOutcome;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ConfirmButton;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.CustomAuthentication;
import it.csi.mddtools.guigen.CustomCommand;
import it.csi.mddtools.guigen.CustomSecurityConstraint;
import it.csi.mddtools.guigen.DataLifetimeType;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.DisabledComponentSet;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.EventTypes;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.Footer;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GUIBehaviors;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GUIStructure;
import it.csi.mddtools.guigen.GridPanelLayout;
import it.csi.mddtools.guigen.GridWidgetLayoutSpec;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Header;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.Image;
import it.csi.mddtools.guigen.JumpBackCommand;
import it.csi.mddtools.guigen.JumpCommand;
import it.csi.mddtools.guigen.JumpExtCommand;
import it.csi.mddtools.guigen.Menu;
import it.csi.mddtools.guigen.MenuItem;
import it.csi.mddtools.guigen.MenuPanel;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.Menubar;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.ONOFFCommand;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.PlainText;
import it.csi.mddtools.guigen.PortalNames;
import it.csi.mddtools.guigen.RadioButton;
import it.csi.mddtools.guigen.RadioButtons;
import it.csi.mddtools.guigen.RefreshViewCommand;
import it.csi.mddtools.guigen.ResetButton;
import it.csi.mddtools.guigen.SecurityModel;
import it.csi.mddtools.guigen.SequenceCommand;
import it.csi.mddtools.guigen.ShowDialogCommand;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.StaticLinks;
import it.csi.mddtools.guigen.Statusbar;
import it.csi.mddtools.guigen.StdMessagePanel;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TargetPlatform;
import it.csi.mddtools.guigen.TargetPlatformCodes;
import it.csi.mddtools.guigen.TextArea;
import it.csi.mddtools.guigen.TextField;
import it.csi.mddtools.guigen.Titlebar;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.Typedefs;
import it.csi.mddtools.guigen.UCBasedSecurityConstraint;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.UISecurityConstraint;
import it.csi.mddtools.guigen.UseCase;
import it.csi.mddtools.guigen.UserDefinedPanel;
import it.csi.mddtools.guigen.UserDefinedWidget;
import it.csi.mddtools.guigen.UserInfoPanel;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.VisibilityCommand;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WidgetDataType;
import it.csi.mddtools.guigen.WidgetLayoutSpecifier;
import it.csi.mddtools.guigen.WidgetTargetAction;

import it.csi.mddtools.guigen.WizardPanel;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuigenPackageImpl extends EPackageImpl implements GuigenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menubarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titlebarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabSetPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiBehaviorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalFlowPanelLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalFlowPanelLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udlrcPanelLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetLayoutSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udlrcWidgetLayoutSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disabledComponentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onoffCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refreshViewCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetTargetActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandOnWidgetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showDialogCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandOnPanelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticLinksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpBackCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appDataBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiDataWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDataDefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridPanelLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridWidgetLayoutSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hiddenValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activateMultiPanelItemCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autenticationMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSecurityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucBasedSecurityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorBasedSecurityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customSecurityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opauthssoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssobartssoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdMessagePanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpExtCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInfoPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum widgetDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum udlrcSpecConstantsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataLifetimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portalNamesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetPlatformCodesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.csi.mddtools.guigen.GuigenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GuigenPackageImpl() {
		super(eNS_URI, GuigenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GuigenPackage init() {
		if (isInited) return (GuigenPackage)EPackage.Registry.INSTANCE.getEPackage(GuigenPackage.eNS_URI);

		// Obtain or create and register package
		GuigenPackageImpl theGuigenPackage = (GuigenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GuigenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GuigenPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGuigenPackage.createPackageContents();

		// Initialize created meta-data
		theGuigenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGuigenPackage.freeze();

		return theGuigenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationArea() {
		return applicationAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_Menubar() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_Titlebar() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_Statusbar() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_ContentPanels() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_StaticLinks() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_OnInitCommand() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenubar() {
		return menubarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenubar_TopLevelMenu() {
		return (EReference)menubarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusbar() {
		return statusbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitlebar() {
		return titlebarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentPanel() {
		return contentPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentPanel_Panels() {
		return (EReference)contentPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentPanel_Name() {
		return (EAttribute)contentPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentPanel_AppData() {
		return (EReference)contentPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentPanel_OnRefreshCommand() {
		return (EReference)contentPanelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormPanel() {
		return formPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPanel_Subpanels() {
		return (EReference)formPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPanel_Widgets() {
		return (EReference)formPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabSetPanel() {
		return tabSetPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Name() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Label() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_Layout() {
		return (EReference)panelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_LayoutSpec() {
		return (EReference)panelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Name() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Label() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_LayoutSpec() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_EventHandlers() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_SecurityConstraints() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_DefaultVisible() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_DefaultEnabled() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandWidget() {
		return commandWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataWidget() {
		return dataWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWidget_DataType() {
		return (EReference)dataWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataWidget_Required() {
		return (EAttribute)dataWidgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataWidget_DataTypeModifier() {
		return (EAttribute)dataWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWidget_Databinding() {
		return (EReference)dataWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Image() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_FieldLength() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Rows() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Columns() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendar() {
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboBox() {
		return comboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboBox_KeySelector() {
		return (EAttribute)comboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboBox_ValueSelector() {
		return (EAttribute)comboBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_ColumnModel() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_PageSize() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_EnableExport() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIModel() {
		return guiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Structure() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Beahviors() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_CodProdotto() {
		return (EAttribute)guiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_CodComponente() {
		return (EAttribute)guiModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_VersioneProdotto() {
		return (EAttribute)guiModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_VersioneComponente() {
		return (EAttribute)guiModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_Typedefs() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_AppDataDefs() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIModel_Portale() {
		return (EAttribute)guiModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_SecurityModel() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_TargetPlatform() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIStructure() {
		return guiStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIStructure_AppWindow() {
		return (EReference)guiStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIBehaviors() {
		return guiBehaviorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButtons() {
		return radioButtonsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRadioButtons_Radio() {
		return (EReference)radioButtonsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetButton() {
		return resetButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmButton() {
		return confirmButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanelLayout() {
		return panelLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalFlowPanelLayout() {
		return horizontalFlowPanelLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalFlowPanelLayout() {
		return verticalFlowPanelLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDLRCPanelLayout() {
		return udlrcPanelLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetLayoutSpecifier() {
		return widgetLayoutSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDLRCWidgetLayoutSpec() {
		return udlrcWidgetLayoutSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDLRCWidgetLayoutSpec_Value() {
		return (EAttribute)udlrcWidgetLayoutSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Image() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Name() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Label() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Item() {
		return (EReference)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Submenu() {
		return (EReference)menuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_SecurityConstraints() {
		return (EReference)menuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuItem() {
		return menuItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuItem_Name() {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuItem_Label() {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuItem_EventHandler() {
		return (EReference)menuItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuItem_SecurityConstraints() {
		return (EReference)menuItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisabledComponentSet() {
		return disabledComponentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnModel() {
		return columnModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnModel_Columns() {
		return (EReference)columnModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnModel_ValueSelector() {
		return (EAttribute)columnModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Selector() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Label() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Sortable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Editable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_EventActive() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandEvent() {
		return commandEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getONOFFCommand() {
		return onoffCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getONOFFCommand_Enable() {
		return (EAttribute)onoffCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCommand() {
		return customCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityCommand() {
		return visibilityCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityCommand_Show() {
		return (EAttribute)visibilityCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefreshViewCommand() {
		return refreshViewCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpCommand() {
		return jumpCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJumpCommand_JumpTo() {
		return (EReference)jumpCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJumpCommand_PushCurrentPage() {
		return (EAttribute)jumpCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecCommand() {
		return execCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecCommand_Results() {
		return (EReference)execCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecCommand_MethodName() {
		return (EAttribute)execCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecCommand_PostExecData() {
		return (EReference)execCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHandler() {
		return eventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_Command() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventHandler_EventType() {
		return (EAttribute)eventHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventHandler_SkipValidation() {
		return (EAttribute)eventHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetTargetAction() {
		return widgetTargetActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandOnWidgets() {
		return commandOnWidgetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandOnWidgets_TargetWidgets() {
		return (EReference)commandOnWidgetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogPanel() {
		return dialogPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogPanel_DialogContent() {
		return (EReference)dialogPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShowDialogCommand() {
		return showDialogCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShowDialogCommand_Dialog() {
		return (EReference)showDialogCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandOutcome() {
		return commandOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandOutcome_ResultCode() {
		return (EAttribute)commandOutcomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandOutcome_Command() {
		return (EReference)commandOutcomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandOnPanels() {
		return commandOnPanelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandOnPanels_TargetPanels() {
		return (EReference)commandOnPanelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_CodCanale() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_CodApplicativo() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFooter() {
		return footerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppWindow() {
		return appWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppWindow_Footer() {
		return (EReference)appWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppWindow_Header() {
		return (EReference)appWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppWindow_AppArea() {
		return (EReference)appWindowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticLinks() {
		return staticLinksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceCommand() {
		return sequenceCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceCommand_Commands() {
		return (EReference)sequenceCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpBackCommand() {
		return jumpBackCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationData() {
		return applicationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationData_Name() {
		return (EAttribute)applicationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationData_LifetimeExtent() {
		return (EAttribute)applicationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationData_Type() {
		return (EReference)applicationDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppDataBinding() {
		return appDataBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDataBinding_AppData() {
		return (EReference)appDataBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppDataBinding_Path() {
		return (EAttribute)appDataBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiDataWidget() {
		return multiDataWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiDataWidget_MultiDataBinding() {
		return (EReference)multiDataWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedefs() {
		return typedefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedefs_Types() {
		return (EReference)typedefsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Code() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Nillable() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_Fields() {
		return (EReference)complexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexType_InitFields() {
		return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedArray() {
		return typedArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedArray_ComponentType() {
		return (EReference)typedArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDataDefs() {
		return applicationDataDefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDataDefs_AppData() {
		return (EReference)applicationDataDefsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeView() {
		return treeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainText() {
		return plainTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainText_StaticText() {
		return (EAttribute)plainTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuView() {
		return menuViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridPanelLayout() {
		return gridPanelLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridPanelLayout_Columns() {
		return (EAttribute)gridPanelLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridPanelLayout_Rows() {
		return (EAttribute)gridPanelLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridWidgetLayoutSpec() {
		return gridWidgetLayoutSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridWidgetLayoutSpec_Row() {
		return (EAttribute)gridWidgetLayoutSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridWidgetLayoutSpec_Column() {
		return (EAttribute)gridWidgetLayoutSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridWidgetLayoutSpec_Hspan() {
		return (EAttribute)gridWidgetLayoutSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandPanel() {
		return commandPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuPanel() {
		return menuPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHiddenValue() {
		return hiddenValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedWidget() {
		return userDefinedWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPanel() {
		return multiPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPanel_Panels() {
		return (EReference)multiPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivateMultiPanelItemCommand() {
		return activateMultiPanelItemCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateMultiPanelItemCommand_Multipanel() {
		return (EReference)activateMultiPanelItemCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateMultiPanelItemCommand_ActiveItem() {
		return (EReference)activateMultiPanelItemCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutenticationMethod() {
		return autenticationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUISecurityConstraint() {
		return uiSecurityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISecurityConstraint_Visible() {
		return (EAttribute)uiSecurityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISecurityConstraint_Enabled() {
		return (EAttribute)uiSecurityConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCBasedSecurityConstraint() {
		return ucBasedSecurityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCBasedSecurityConstraint_UseCase() {
		return (EReference)ucBasedSecurityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityModel() {
		return securityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_AutenticationMethod() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_Actors() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_UseCases() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityModel_SecurityAppID() {
		return (EAttribute)securityModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Code() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Permission() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Code() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorBasedSecurityConstraint() {
		return actorBasedSecurityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorBasedSecurityConstraint_Actor() {
		return (EReference)actorBasedSecurityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomSecurityConstraint() {
		return customSecurityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomSecurityConstraint_MethodNameSuffix() {
		return (EAttribute)customSecurityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPAUTHSSO() {
		return opauthssoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPAUTHSSO_MinAuthLevel() {
		return (EAttribute)opauthssoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSOBARTSSO() {
		return ssobartssoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomAuthentication() {
		return customAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStdMessagePanel() {
		return stdMessagePanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdMessagePanel_ShowGlobalMessages() {
		return (EAttribute)stdMessagePanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdMessagePanel_ShowFieldErrorDetails() {
		return (EAttribute)stdMessagePanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdMessagePanel_ShowFieldErrors() {
		return (EAttribute)stdMessagePanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpExtCommand() {
		return jumpExtCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJumpExtCommand_StaticUrl() {
		return (EAttribute)jumpExtCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJumpExtCommand_RuntimeUrlProvider() {
		return (EReference)jumpExtCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJumpExtCommand_LocationCode() {
		return (EAttribute)jumpExtCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetPlatform() {
		return targetPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPlatform_Code() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserInfoPanel() {
		return userInfoPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedPanel() {
		return userDefinedPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizardPanel() {
		return wizardPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWidgetDataType() {
		return widgetDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUDLRCSpecConstants() {
		return udlrcSpecConstantsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventTypes() {
		return eventTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataLifetimeType() {
		return dataLifetimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimpleTypeCodes() {
		return simpleTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortalNames() {
		return portalNamesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetPlatformCodes() {
		return targetPlatformCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigenFactory getGuigenFactory() {
		return (GuigenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationAreaEClass = createEClass(APPLICATION_AREA);
		createEReference(applicationAreaEClass, APPLICATION_AREA__MENUBAR);
		createEReference(applicationAreaEClass, APPLICATION_AREA__TITLEBAR);
		createEReference(applicationAreaEClass, APPLICATION_AREA__STATUSBAR);
		createEReference(applicationAreaEClass, APPLICATION_AREA__CONTENT_PANELS);
		createEReference(applicationAreaEClass, APPLICATION_AREA__STATIC_LINKS);
		createEReference(applicationAreaEClass, APPLICATION_AREA__ON_INIT_COMMAND);

		menubarEClass = createEClass(MENUBAR);
		createEReference(menubarEClass, MENUBAR__TOP_LEVEL_MENU);

		statusbarEClass = createEClass(STATUSBAR);

		titlebarEClass = createEClass(TITLEBAR);

		contentPanelEClass = createEClass(CONTENT_PANEL);
		createEReference(contentPanelEClass, CONTENT_PANEL__PANELS);
		createEAttribute(contentPanelEClass, CONTENT_PANEL__NAME);
		createEReference(contentPanelEClass, CONTENT_PANEL__APP_DATA);
		createEReference(contentPanelEClass, CONTENT_PANEL__ON_REFRESH_COMMAND);

		formPanelEClass = createEClass(FORM_PANEL);
		createEReference(formPanelEClass, FORM_PANEL__SUBPANELS);
		createEReference(formPanelEClass, FORM_PANEL__WIDGETS);

		tabSetPanelEClass = createEClass(TAB_SET_PANEL);

		panelEClass = createEClass(PANEL);
		createEAttribute(panelEClass, PANEL__NAME);
		createEAttribute(panelEClass, PANEL__LABEL);
		createEReference(panelEClass, PANEL__LAYOUT);
		createEReference(panelEClass, PANEL__LAYOUT_SPEC);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__NAME);
		createEAttribute(widgetEClass, WIDGET__LABEL);
		createEReference(widgetEClass, WIDGET__LAYOUT_SPEC);
		createEReference(widgetEClass, WIDGET__EVENT_HANDLERS);
		createEReference(widgetEClass, WIDGET__SECURITY_CONSTRAINTS);
		createEAttribute(widgetEClass, WIDGET__DEFAULT_VISIBLE);
		createEAttribute(widgetEClass, WIDGET__DEFAULT_ENABLED);

		commandWidgetEClass = createEClass(COMMAND_WIDGET);

		dataWidgetEClass = createEClass(DATA_WIDGET);
		createEAttribute(dataWidgetEClass, DATA_WIDGET__DATA_TYPE_MODIFIER);
		createEReference(dataWidgetEClass, DATA_WIDGET__DATABINDING);
		createEReference(dataWidgetEClass, DATA_WIDGET__DATA_TYPE);
		createEAttribute(dataWidgetEClass, DATA_WIDGET__REQUIRED);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__IMAGE);

		textFieldEClass = createEClass(TEXT_FIELD);
		createEAttribute(textFieldEClass, TEXT_FIELD__FIELD_LENGTH);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__ROWS);
		createEAttribute(textAreaEClass, TEXT_AREA__COLUMNS);

		calendarEClass = createEClass(CALENDAR);

		comboBoxEClass = createEClass(COMBO_BOX);
		createEAttribute(comboBoxEClass, COMBO_BOX__KEY_SELECTOR);
		createEAttribute(comboBoxEClass, COMBO_BOX__VALUE_SELECTOR);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMN_MODEL);
		createEAttribute(tableEClass, TABLE__PAGE_SIZE);
		createEAttribute(tableEClass, TABLE__ENABLE_EXPORT);

		checkBoxEClass = createEClass(CHECK_BOX);

		guiModelEClass = createEClass(GUI_MODEL);
		createEReference(guiModelEClass, GUI_MODEL__STRUCTURE);
		createEReference(guiModelEClass, GUI_MODEL__BEAHVIORS);
		createEAttribute(guiModelEClass, GUI_MODEL__COD_PRODOTTO);
		createEAttribute(guiModelEClass, GUI_MODEL__COD_COMPONENTE);
		createEAttribute(guiModelEClass, GUI_MODEL__VERSIONE_PRODOTTO);
		createEAttribute(guiModelEClass, GUI_MODEL__VERSIONE_COMPONENTE);
		createEReference(guiModelEClass, GUI_MODEL__TYPEDEFS);
		createEReference(guiModelEClass, GUI_MODEL__APP_DATA_DEFS);
		createEAttribute(guiModelEClass, GUI_MODEL__PORTALE);
		createEReference(guiModelEClass, GUI_MODEL__SECURITY_MODEL);
		createEReference(guiModelEClass, GUI_MODEL__TARGET_PLATFORM);

		guiStructureEClass = createEClass(GUI_STRUCTURE);
		createEReference(guiStructureEClass, GUI_STRUCTURE__APP_WINDOW);

		guiBehaviorsEClass = createEClass(GUI_BEHAVIORS);

		radioButtonsEClass = createEClass(RADIO_BUTTONS);
		createEReference(radioButtonsEClass, RADIO_BUTTONS__RADIO);

		radioButtonEClass = createEClass(RADIO_BUTTON);

		resetButtonEClass = createEClass(RESET_BUTTON);

		confirmButtonEClass = createEClass(CONFIRM_BUTTON);

		panelLayoutEClass = createEClass(PANEL_LAYOUT);

		horizontalFlowPanelLayoutEClass = createEClass(HORIZONTAL_FLOW_PANEL_LAYOUT);

		verticalFlowPanelLayoutEClass = createEClass(VERTICAL_FLOW_PANEL_LAYOUT);

		udlrcPanelLayoutEClass = createEClass(UDLRC_PANEL_LAYOUT);

		widgetLayoutSpecifierEClass = createEClass(WIDGET_LAYOUT_SPECIFIER);

		udlrcWidgetLayoutSpecEClass = createEClass(UDLRC_WIDGET_LAYOUT_SPEC);
		createEAttribute(udlrcWidgetLayoutSpecEClass, UDLRC_WIDGET_LAYOUT_SPEC__VALUE);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__IMAGE);

		menuEClass = createEClass(MENU);
		createEAttribute(menuEClass, MENU__NAME);
		createEAttribute(menuEClass, MENU__LABEL);
		createEReference(menuEClass, MENU__ITEM);
		createEReference(menuEClass, MENU__SUBMENU);
		createEReference(menuEClass, MENU__SECURITY_CONSTRAINTS);

		menuItemEClass = createEClass(MENU_ITEM);
		createEAttribute(menuItemEClass, MENU_ITEM__NAME);
		createEAttribute(menuItemEClass, MENU_ITEM__LABEL);
		createEReference(menuItemEClass, MENU_ITEM__EVENT_HANDLER);
		createEReference(menuItemEClass, MENU_ITEM__SECURITY_CONSTRAINTS);

		disabledComponentSetEClass = createEClass(DISABLED_COMPONENT_SET);

		columnModelEClass = createEClass(COLUMN_MODEL);
		createEReference(columnModelEClass, COLUMN_MODEL__COLUMNS);
		createEAttribute(columnModelEClass, COLUMN_MODEL__VALUE_SELECTOR);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__SELECTOR);
		createEAttribute(columnEClass, COLUMN__LABEL);
		createEAttribute(columnEClass, COLUMN__SORTABLE);
		createEAttribute(columnEClass, COLUMN__EDITABLE);
		createEAttribute(columnEClass, COLUMN__EVENT_ACTIVE);

		commandEClass = createEClass(COMMAND);

		commandEventEClass = createEClass(COMMAND_EVENT);

		onoffCommandEClass = createEClass(ONOFF_COMMAND);
		createEAttribute(onoffCommandEClass, ONOFF_COMMAND__ENABLE);

		customCommandEClass = createEClass(CUSTOM_COMMAND);

		visibilityCommandEClass = createEClass(VISIBILITY_COMMAND);
		createEAttribute(visibilityCommandEClass, VISIBILITY_COMMAND__SHOW);

		refreshViewCommandEClass = createEClass(REFRESH_VIEW_COMMAND);

		jumpCommandEClass = createEClass(JUMP_COMMAND);
		createEReference(jumpCommandEClass, JUMP_COMMAND__JUMP_TO);
		createEAttribute(jumpCommandEClass, JUMP_COMMAND__PUSH_CURRENT_PAGE);

		execCommandEClass = createEClass(EXEC_COMMAND);
		createEReference(execCommandEClass, EXEC_COMMAND__RESULTS);
		createEAttribute(execCommandEClass, EXEC_COMMAND__METHOD_NAME);
		createEReference(execCommandEClass, EXEC_COMMAND__POST_EXEC_DATA);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEReference(eventHandlerEClass, EVENT_HANDLER__COMMAND);
		createEAttribute(eventHandlerEClass, EVENT_HANDLER__EVENT_TYPE);
		createEAttribute(eventHandlerEClass, EVENT_HANDLER__SKIP_VALIDATION);

		widgetTargetActionEClass = createEClass(WIDGET_TARGET_ACTION);

		commandOnWidgetsEClass = createEClass(COMMAND_ON_WIDGETS);
		createEReference(commandOnWidgetsEClass, COMMAND_ON_WIDGETS__TARGET_WIDGETS);

		dialogPanelEClass = createEClass(DIALOG_PANEL);
		createEReference(dialogPanelEClass, DIALOG_PANEL__DIALOG_CONTENT);

		showDialogCommandEClass = createEClass(SHOW_DIALOG_COMMAND);
		createEReference(showDialogCommandEClass, SHOW_DIALOG_COMMAND__DIALOG);

		commandOutcomeEClass = createEClass(COMMAND_OUTCOME);
		createEAttribute(commandOutcomeEClass, COMMAND_OUTCOME__RESULT_CODE);
		createEReference(commandOutcomeEClass, COMMAND_OUTCOME__COMMAND);

		commandOnPanelsEClass = createEClass(COMMAND_ON_PANELS);
		createEReference(commandOnPanelsEClass, COMMAND_ON_PANELS__TARGET_PANELS);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__COD_CANALE);
		createEAttribute(headerEClass, HEADER__COD_APPLICATIVO);

		footerEClass = createEClass(FOOTER);

		appWindowEClass = createEClass(APP_WINDOW);
		createEReference(appWindowEClass, APP_WINDOW__FOOTER);
		createEReference(appWindowEClass, APP_WINDOW__HEADER);
		createEReference(appWindowEClass, APP_WINDOW__APP_AREA);

		staticLinksEClass = createEClass(STATIC_LINKS);

		sequenceCommandEClass = createEClass(SEQUENCE_COMMAND);
		createEReference(sequenceCommandEClass, SEQUENCE_COMMAND__COMMANDS);

		jumpBackCommandEClass = createEClass(JUMP_BACK_COMMAND);

		applicationDataEClass = createEClass(APPLICATION_DATA);
		createEAttribute(applicationDataEClass, APPLICATION_DATA__NAME);
		createEAttribute(applicationDataEClass, APPLICATION_DATA__LIFETIME_EXTENT);
		createEReference(applicationDataEClass, APPLICATION_DATA__TYPE);

		appDataBindingEClass = createEClass(APP_DATA_BINDING);
		createEReference(appDataBindingEClass, APP_DATA_BINDING__APP_DATA);
		createEAttribute(appDataBindingEClass, APP_DATA_BINDING__PATH);

		multiDataWidgetEClass = createEClass(MULTI_DATA_WIDGET);
		createEReference(multiDataWidgetEClass, MULTI_DATA_WIDGET__MULTI_DATA_BINDING);

		typedefsEClass = createEClass(TYPEDEFS);
		createEReference(typedefsEClass, TYPEDEFS__TYPES);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__CODE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__NILLABLE);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEReference(complexTypeEClass, COMPLEX_TYPE__FIELDS);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__INIT_FIELDS);

		typedArrayEClass = createEClass(TYPED_ARRAY);
		createEReference(typedArrayEClass, TYPED_ARRAY__COMPONENT_TYPE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__TYPE);

		applicationDataDefsEClass = createEClass(APPLICATION_DATA_DEFS);
		createEReference(applicationDataDefsEClass, APPLICATION_DATA_DEFS__APP_DATA);

		treeViewEClass = createEClass(TREE_VIEW);

		plainTextEClass = createEClass(PLAIN_TEXT);
		createEAttribute(plainTextEClass, PLAIN_TEXT__STATIC_TEXT);

		menuViewEClass = createEClass(MENU_VIEW);

		gridPanelLayoutEClass = createEClass(GRID_PANEL_LAYOUT);
		createEAttribute(gridPanelLayoutEClass, GRID_PANEL_LAYOUT__COLUMNS);
		createEAttribute(gridPanelLayoutEClass, GRID_PANEL_LAYOUT__ROWS);

		gridWidgetLayoutSpecEClass = createEClass(GRID_WIDGET_LAYOUT_SPEC);
		createEAttribute(gridWidgetLayoutSpecEClass, GRID_WIDGET_LAYOUT_SPEC__ROW);
		createEAttribute(gridWidgetLayoutSpecEClass, GRID_WIDGET_LAYOUT_SPEC__COLUMN);
		createEAttribute(gridWidgetLayoutSpecEClass, GRID_WIDGET_LAYOUT_SPEC__HSPAN);

		commandPanelEClass = createEClass(COMMAND_PANEL);

		menuPanelEClass = createEClass(MENU_PANEL);

		hiddenValueEClass = createEClass(HIDDEN_VALUE);

		userDefinedWidgetEClass = createEClass(USER_DEFINED_WIDGET);

		multiPanelEClass = createEClass(MULTI_PANEL);
		createEReference(multiPanelEClass, MULTI_PANEL__PANELS);

		activateMultiPanelItemCommandEClass = createEClass(ACTIVATE_MULTI_PANEL_ITEM_COMMAND);
		createEReference(activateMultiPanelItemCommandEClass, ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL);
		createEReference(activateMultiPanelItemCommandEClass, ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM);

		autenticationMethodEClass = createEClass(AUTENTICATION_METHOD);

		uiSecurityConstraintEClass = createEClass(UI_SECURITY_CONSTRAINT);
		createEAttribute(uiSecurityConstraintEClass, UI_SECURITY_CONSTRAINT__VISIBLE);
		createEAttribute(uiSecurityConstraintEClass, UI_SECURITY_CONSTRAINT__ENABLED);

		ucBasedSecurityConstraintEClass = createEClass(UC_BASED_SECURITY_CONSTRAINT);
		createEReference(ucBasedSecurityConstraintEClass, UC_BASED_SECURITY_CONSTRAINT__USE_CASE);

		securityModelEClass = createEClass(SECURITY_MODEL);
		createEReference(securityModelEClass, SECURITY_MODEL__AUTENTICATION_METHOD);
		createEReference(securityModelEClass, SECURITY_MODEL__ACTORS);
		createEReference(securityModelEClass, SECURITY_MODEL__USE_CASES);
		createEAttribute(securityModelEClass, SECURITY_MODEL__SECURITY_APP_ID);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__CODE);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__PERMISSION);
		createEAttribute(useCaseEClass, USE_CASE__CODE);

		actorBasedSecurityConstraintEClass = createEClass(ACTOR_BASED_SECURITY_CONSTRAINT);
		createEReference(actorBasedSecurityConstraintEClass, ACTOR_BASED_SECURITY_CONSTRAINT__ACTOR);

		customSecurityConstraintEClass = createEClass(CUSTOM_SECURITY_CONSTRAINT);
		createEAttribute(customSecurityConstraintEClass, CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX);

		opauthssoEClass = createEClass(OPAUTHSSO);
		createEAttribute(opauthssoEClass, OPAUTHSSO__MIN_AUTH_LEVEL);

		ssobartssoEClass = createEClass(SSOBARTSSO);

		customAuthenticationEClass = createEClass(CUSTOM_AUTHENTICATION);

		stdMessagePanelEClass = createEClass(STD_MESSAGE_PANEL);
		createEAttribute(stdMessagePanelEClass, STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES);
		createEAttribute(stdMessagePanelEClass, STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS);
		createEAttribute(stdMessagePanelEClass, STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS);

		jumpExtCommandEClass = createEClass(JUMP_EXT_COMMAND);
		createEAttribute(jumpExtCommandEClass, JUMP_EXT_COMMAND__STATIC_URL);
		createEReference(jumpExtCommandEClass, JUMP_EXT_COMMAND__RUNTIME_URL_PROVIDER);
		createEAttribute(jumpExtCommandEClass, JUMP_EXT_COMMAND__LOCATION_CODE);

		targetPlatformEClass = createEClass(TARGET_PLATFORM);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__CODE);

		userInfoPanelEClass = createEClass(USER_INFO_PANEL);

		userDefinedPanelEClass = createEClass(USER_DEFINED_PANEL);

		wizardPanelEClass = createEClass(WIZARD_PANEL);

		// Create enums
		widgetDataTypeEEnum = createEEnum(WIDGET_DATA_TYPE);
		udlrcSpecConstantsEEnum = createEEnum(UDLRC_SPEC_CONSTANTS);
		eventTypesEEnum = createEEnum(EVENT_TYPES);
		dataLifetimeTypeEEnum = createEEnum(DATA_LIFETIME_TYPE);
		simpleTypeCodesEEnum = createEEnum(SIMPLE_TYPE_CODES);
		portalNamesEEnum = createEEnum(PORTAL_NAMES);
		targetPlatformCodesEEnum = createEEnum(TARGET_PLATFORM_CODES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		formPanelEClass.getESuperTypes().add(this.getPanel());
		tabSetPanelEClass.getESuperTypes().add(this.getMultiPanel());
		commandWidgetEClass.getESuperTypes().add(this.getWidget());
		dataWidgetEClass.getESuperTypes().add(this.getWidget());
		buttonEClass.getESuperTypes().add(this.getCommandWidget());
		textFieldEClass.getESuperTypes().add(this.getDataWidget());
		textAreaEClass.getESuperTypes().add(this.getDataWidget());
		calendarEClass.getESuperTypes().add(this.getDataWidget());
		comboBoxEClass.getESuperTypes().add(this.getDataWidget());
		comboBoxEClass.getESuperTypes().add(this.getMultiDataWidget());
		tableEClass.getESuperTypes().add(this.getDataWidget());
		tableEClass.getESuperTypes().add(this.getMultiDataWidget());
		checkBoxEClass.getESuperTypes().add(this.getDataWidget());
		radioButtonsEClass.getESuperTypes().add(this.getDataWidget());
		radioButtonEClass.getESuperTypes().add(this.getWidget());
		radioButtonEClass.getESuperTypes().add(this.getMultiDataWidget());
		resetButtonEClass.getESuperTypes().add(this.getButton());
		confirmButtonEClass.getESuperTypes().add(this.getButton());
		horizontalFlowPanelLayoutEClass.getESuperTypes().add(this.getPanelLayout());
		verticalFlowPanelLayoutEClass.getESuperTypes().add(this.getPanelLayout());
		udlrcPanelLayoutEClass.getESuperTypes().add(this.getPanelLayout());
		udlrcWidgetLayoutSpecEClass.getESuperTypes().add(this.getWidgetLayoutSpecifier());
		imageEClass.getESuperTypes().add(this.getWidget());
		onoffCommandEClass.getESuperTypes().add(this.getCommand());
		onoffCommandEClass.getESuperTypes().add(this.getCommandOnWidgets());
		customCommandEClass.getESuperTypes().add(this.getCommand());
		visibilityCommandEClass.getESuperTypes().add(this.getCommand());
		visibilityCommandEClass.getESuperTypes().add(this.getCommandOnWidgets());
		refreshViewCommandEClass.getESuperTypes().add(this.getCommand());
		refreshViewCommandEClass.getESuperTypes().add(this.getCommandOnWidgets());
		refreshViewCommandEClass.getESuperTypes().add(this.getCommandOnPanels());
		jumpCommandEClass.getESuperTypes().add(this.getCommand());
		execCommandEClass.getESuperTypes().add(this.getCommand());
		commandOnWidgetsEClass.getESuperTypes().add(this.getCommand());
		dialogPanelEClass.getESuperTypes().add(this.getPanel());
		showDialogCommandEClass.getESuperTypes().add(this.getCommand());
		commandOnPanelsEClass.getESuperTypes().add(this.getCommand());
		sequenceCommandEClass.getESuperTypes().add(this.getCommand());
		jumpBackCommandEClass.getESuperTypes().add(this.getCommand());
		multiDataWidgetEClass.getESuperTypes().add(this.getWidget());
		simpleTypeEClass.getESuperTypes().add(this.getType());
		complexTypeEClass.getESuperTypes().add(this.getType());
		typedArrayEClass.getESuperTypes().add(this.getType());
		treeViewEClass.getESuperTypes().add(this.getDataWidget());
		treeViewEClass.getESuperTypes().add(this.getMultiDataWidget());
		plainTextEClass.getESuperTypes().add(this.getDataWidget());
		menuViewEClass.getESuperTypes().add(this.getCommandWidget());
		gridPanelLayoutEClass.getESuperTypes().add(this.getPanelLayout());
		gridWidgetLayoutSpecEClass.getESuperTypes().add(this.getWidgetLayoutSpecifier());
		commandPanelEClass.getESuperTypes().add(this.getFormPanel());
		menuPanelEClass.getESuperTypes().add(this.getFormPanel());
		hiddenValueEClass.getESuperTypes().add(this.getDataWidget());
		userDefinedWidgetEClass.getESuperTypes().add(this.getWidget());
		multiPanelEClass.getESuperTypes().add(this.getPanel());
		activateMultiPanelItemCommandEClass.getESuperTypes().add(this.getCommand());
		ucBasedSecurityConstraintEClass.getESuperTypes().add(this.getUISecurityConstraint());
		actorBasedSecurityConstraintEClass.getESuperTypes().add(this.getUISecurityConstraint());
		customSecurityConstraintEClass.getESuperTypes().add(this.getUISecurityConstraint());
		opauthssoEClass.getESuperTypes().add(this.getAutenticationMethod());
		ssobartssoEClass.getESuperTypes().add(this.getAutenticationMethod());
		customAuthenticationEClass.getESuperTypes().add(this.getAutenticationMethod());
		stdMessagePanelEClass.getESuperTypes().add(this.getPanel());
		jumpExtCommandEClass.getESuperTypes().add(this.getCommand());
		userInfoPanelEClass.getESuperTypes().add(this.getPanel());
		userDefinedPanelEClass.getESuperTypes().add(this.getPanel());
		wizardPanelEClass.getESuperTypes().add(this.getMultiPanel());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationAreaEClass, ApplicationArea.class, "ApplicationArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationArea_Menubar(), this.getMenubar(), null, "menubar", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_Titlebar(), this.getTitlebar(), null, "titlebar", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_Statusbar(), this.getStatusbar(), null, "statusbar", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_ContentPanels(), this.getContentPanel(), null, "contentPanels", null, 0, -1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_StaticLinks(), this.getStaticLinks(), null, "staticLinks", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_OnInitCommand(), this.getCommand(), null, "onInitCommand", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menubarEClass, Menubar.class, "Menubar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenubar_TopLevelMenu(), this.getMenu(), null, "topLevelMenu", null, 0, -1, Menubar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusbarEClass, Statusbar.class, "Statusbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(titlebarEClass, Titlebar.class, "Titlebar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentPanelEClass, ContentPanel.class, "ContentPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentPanel_Panels(), this.getPanel(), null, "panels", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentPanel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentPanel_AppData(), this.getApplicationData(), null, "appData", null, 0, -1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentPanel_OnRefreshCommand(), this.getCommand(), null, "onRefreshCommand", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formPanelEClass, FormPanel.class, "FormPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormPanel_Subpanels(), this.getPanel(), null, "subpanels", null, 0, -1, FormPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormPanel_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, FormPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabSetPanelEClass, TabSetPanel.class, "TabSetPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panelEClass, Panel.class, "Panel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_Label(), ecorePackage.getEString(), "label", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanel_Layout(), this.getPanelLayout(), null, "layout", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanel_LayoutSpec(), this.getWidgetLayoutSpecifier(), null, "layoutSpec", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Name(), ecorePackage.getEString(), "name", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Label(), ecorePackage.getEString(), "label", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_LayoutSpec(), this.getWidgetLayoutSpecifier(), null, "layoutSpec", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_EventHandlers(), this.getEventHandler(), null, "eventHandlers", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_SecurityConstraints(), this.getUISecurityConstraint(), null, "securityConstraints", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_DefaultVisible(), ecorePackage.getEBoolean(), "defaultVisible", "true", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_DefaultEnabled(), ecorePackage.getEBoolean(), "defaultEnabled", "true", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandWidgetEClass, CommandWidget.class, "CommandWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataWidgetEClass, DataWidget.class, "DataWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataWidget_DataTypeModifier(), ecorePackage.getEString(), "dataTypeModifier", null, 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWidget_Databinding(), this.getAppDataBinding(), null, "databinding", null, 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWidget_DataType(), this.getType(), null, "dataType", null, 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWidget_Required(), ecorePackage.getEBoolean(), "required", "false", 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Image(), ecorePackage.getEString(), "image", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextField_FieldLength(), ecorePackage.getEInt(), "fieldLength", "15", 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_Rows(), ecorePackage.getEInt(), "rows", "10", 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Columns(), ecorePackage.getEInt(), "columns", "30", 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComboBox_KeySelector(), ecorePackage.getEString(), "keySelector", null, 0, 1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboBox_ValueSelector(), ecorePackage.getEString(), "valueSelector", null, 0, 1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_ColumnModel(), this.getColumnModel(), null, "columnModel", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_PageSize(), ecorePackage.getEInt(), "pageSize", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_EnableExport(), ecorePackage.getEBoolean(), "enableExport", "true", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiModelEClass, GUIModel.class, "GUIModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIModel_Structure(), this.getGUIStructure(), null, "structure", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Beahviors(), this.getGUIBehaviors(), null, "beahviors", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIModel_CodProdotto(), ecorePackage.getEString(), "codProdotto", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIModel_CodComponente(), ecorePackage.getEString(), "codComponente", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIModel_VersioneProdotto(), ecorePackage.getEString(), "versioneProdotto", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIModel_VersioneComponente(), ecorePackage.getEString(), "versioneComponente", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_Typedefs(), this.getTypedefs(), null, "typedefs", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_AppDataDefs(), this.getApplicationDataDefs(), null, "appDataDefs", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIModel_Portale(), this.getPortalNames(), "portale", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_SecurityModel(), this.getSecurityModel(), null, "securityModel", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_TargetPlatform(), this.getTargetPlatform(), null, "targetPlatform", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiStructureEClass, GUIStructure.class, "GUIStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIStructure_AppWindow(), this.getAppWindow(), null, "appWindow", null, 0, 1, GUIStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiBehaviorsEClass, GUIBehaviors.class, "GUIBehaviors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonsEClass, RadioButtons.class, "RadioButtons", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRadioButtons_Radio(), this.getRadioButton(), null, "radio", null, 0, -1, RadioButtons.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resetButtonEClass, ResetButton.class, "ResetButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(confirmButtonEClass, ConfirmButton.class, "ConfirmButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panelLayoutEClass, PanelLayout.class, "PanelLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(horizontalFlowPanelLayoutEClass, HorizontalFlowPanelLayout.class, "HorizontalFlowPanelLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verticalFlowPanelLayoutEClass, VerticalFlowPanelLayout.class, "VerticalFlowPanelLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(udlrcPanelLayoutEClass, UDLRCPanelLayout.class, "UDLRCPanelLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetLayoutSpecifierEClass, WidgetLayoutSpecifier.class, "WidgetLayoutSpecifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(udlrcWidgetLayoutSpecEClass, UDLRCWidgetLayoutSpec.class, "UDLRCWidgetLayoutSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUDLRCWidgetLayoutSpec_Value(), this.getUDLRCSpecConstants(), "value", null, 0, 1, UDLRCWidgetLayoutSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Image(), ecorePackage.getEString(), "image", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_Label(), ecorePackage.getEString(), "label", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Item(), this.getMenuItem(), null, "item", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Submenu(), this.getMenu(), null, "submenu", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_SecurityConstraints(), this.getUISecurityConstraint(), null, "securityConstraints", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuItemEClass, MenuItem.class, "MenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenuItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuItem_Label(), ecorePackage.getEString(), "label", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenuItem_EventHandler(), this.getEventHandler(), null, "eventHandler", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenuItem_SecurityConstraints(), this.getUISecurityConstraint(), null, "securityConstraints", null, 0, -1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disabledComponentSetEClass, DisabledComponentSet.class, "DisabledComponentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnModelEClass, ColumnModel.class, "ColumnModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnModel_Columns(), this.getColumn(), null, "columns", null, 0, -1, ColumnModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnModel_ValueSelector(), ecorePackage.getEString(), "valueSelector", null, 0, 1, ColumnModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Selector(), ecorePackage.getEString(), "selector", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Label(), ecorePackage.getEString(), "label", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Sortable(), ecorePackage.getEBoolean(), "sortable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_EventActive(), ecorePackage.getEBoolean(), "eventActive", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEventEClass, CommandEvent.class, "CommandEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onoffCommandEClass, ONOFFCommand.class, "ONOFFCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getONOFFCommand_Enable(), ecorePackage.getEBoolean(), "enable", null, 0, 1, ONOFFCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customCommandEClass, CustomCommand.class, "CustomCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visibilityCommandEClass, VisibilityCommand.class, "VisibilityCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityCommand_Show(), ecorePackage.getEBoolean(), "show", null, 0, 1, VisibilityCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refreshViewCommandEClass, RefreshViewCommand.class, "RefreshViewCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jumpCommandEClass, JumpCommand.class, "JumpCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJumpCommand_JumpTo(), this.getContentPanel(), null, "jumpTo", null, 0, 1, JumpCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJumpCommand_PushCurrentPage(), ecorePackage.getEBoolean(), "pushCurrentPage", null, 0, 1, JumpCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execCommandEClass, ExecCommand.class, "ExecCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecCommand_Results(), this.getCommandOutcome(), null, "results", null, 0, -1, ExecCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecCommand_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, ExecCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecCommand_PostExecData(), this.getApplicationData(), null, "postExecData", null, 0, -1, ExecCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHandler_Command(), this.getCommand(), null, "command", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventHandler_EventType(), this.getEventTypes(), "eventType", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventHandler_SkipValidation(), ecorePackage.getEBoolean(), "skipValidation", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetTargetActionEClass, WidgetTargetAction.class, "WidgetTargetAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandOnWidgetsEClass, CommandOnWidgets.class, "CommandOnWidgets", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandOnWidgets_TargetWidgets(), this.getWidget(), null, "targetWidgets", null, 1, -1, CommandOnWidgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogPanelEClass, DialogPanel.class, "DialogPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogPanel_DialogContent(), this.getPanel(), null, "dialogContent", null, 0, 1, DialogPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showDialogCommandEClass, ShowDialogCommand.class, "ShowDialogCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShowDialogCommand_Dialog(), this.getDialogPanel(), null, "dialog", null, 0, 1, ShowDialogCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandOutcomeEClass, CommandOutcome.class, "CommandOutcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandOutcome_ResultCode(), ecorePackage.getEString(), "resultCode", null, 0, 1, CommandOutcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandOutcome_Command(), this.getCommand(), null, "command", null, 1, 1, CommandOutcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandOnPanelsEClass, CommandOnPanels.class, "CommandOnPanels", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandOnPanels_TargetPanels(), this.getPanel(), null, "targetPanels", null, 0, -1, CommandOnPanels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_CodCanale(), ecorePackage.getEString(), "codCanale", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_CodApplicativo(), ecorePackage.getEString(), "codApplicativo", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(footerEClass, Footer.class, "Footer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appWindowEClass, AppWindow.class, "AppWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppWindow_Footer(), this.getFooter(), null, "footer", null, 0, 1, AppWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppWindow_Header(), this.getHeader(), null, "header", null, 0, 1, AppWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppWindow_AppArea(), this.getApplicationArea(), null, "appArea", null, 0, 1, AppWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticLinksEClass, StaticLinks.class, "StaticLinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceCommandEClass, SequenceCommand.class, "SequenceCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceCommand_Commands(), this.getCommand(), null, "commands", null, 0, -1, SequenceCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jumpBackCommandEClass, JumpBackCommand.class, "JumpBackCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationDataEClass, ApplicationData.class, "ApplicationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationData_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationData_LifetimeExtent(), this.getDataLifetimeType(), "lifetimeExtent", null, 0, 1, ApplicationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationData_Type(), this.getType(), null, "type", null, 0, 1, ApplicationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appDataBindingEClass, AppDataBinding.class, "AppDataBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppDataBinding_AppData(), this.getApplicationData(), null, "appData", null, 0, 1, AppDataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppDataBinding_Path(), ecorePackage.getEString(), "path", null, 0, 1, AppDataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiDataWidgetEClass, MultiDataWidget.class, "MultiDataWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiDataWidget_MultiDataBinding(), this.getAppDataBinding(), null, "multiDataBinding", null, 0, 1, MultiDataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedefsEClass, Typedefs.class, "Typedefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedefs_Types(), this.getType(), null, "types", null, 0, -1, Typedefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleType_Code(), this.getSimpleTypeCodes(), "code", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Nillable(), ecorePackage.getEBoolean(), "nillable", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexType_Fields(), this.getField(), null, "fields", null, 0, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexType_InitFields(), ecorePackage.getEBoolean(), "initFields", "false", 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedArrayEClass, TypedArray.class, "TypedArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedArray_ComponentType(), this.getType(), null, "componentType", null, 0, 1, TypedArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getType(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationDataDefsEClass, ApplicationDataDefs.class, "ApplicationDataDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationDataDefs_AppData(), this.getApplicationData(), null, "appData", null, 0, -1, ApplicationDataDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeViewEClass, TreeView.class, "TreeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plainTextEClass, PlainText.class, "PlainText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainText_StaticText(), ecorePackage.getEString(), "staticText", null, 0, 1, PlainText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuViewEClass, MenuView.class, "MenuView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridPanelLayoutEClass, GridPanelLayout.class, "GridPanelLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridPanelLayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, GridPanelLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridPanelLayout_Rows(), ecorePackage.getEInt(), "rows", null, 0, 1, GridPanelLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridWidgetLayoutSpecEClass, GridWidgetLayoutSpec.class, "GridWidgetLayoutSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridWidgetLayoutSpec_Row(), ecorePackage.getEInt(), "row", null, 0, 1, GridWidgetLayoutSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridWidgetLayoutSpec_Column(), ecorePackage.getEInt(), "column", null, 0, 1, GridWidgetLayoutSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridWidgetLayoutSpec_Hspan(), ecorePackage.getEInt(), "hspan", null, 0, 1, GridWidgetLayoutSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandPanelEClass, CommandPanel.class, "CommandPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuPanelEClass, MenuPanel.class, "MenuPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hiddenValueEClass, HiddenValue.class, "HiddenValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDefinedWidgetEClass, UserDefinedWidget.class, "UserDefinedWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiPanelEClass, MultiPanel.class, "MultiPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiPanel_Panels(), this.getPanel(), null, "panels", null, 0, -1, MultiPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activateMultiPanelItemCommandEClass, ActivateMultiPanelItemCommand.class, "ActivateMultiPanelItemCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivateMultiPanelItemCommand_Multipanel(), this.getMultiPanel(), null, "multipanel", null, 0, 1, ActivateMultiPanelItemCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivateMultiPanelItemCommand_ActiveItem(), this.getPanel(), null, "activeItem", null, 0, 1, ActivateMultiPanelItemCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autenticationMethodEClass, AutenticationMethod.class, "AutenticationMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiSecurityConstraintEClass, UISecurityConstraint.class, "UISecurityConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUISecurityConstraint_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, UISecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISecurityConstraint_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, UISecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucBasedSecurityConstraintEClass, UCBasedSecurityConstraint.class, "UCBasedSecurityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUCBasedSecurityConstraint_UseCase(), this.getUseCase(), null, "useCase", null, 0, 1, UCBasedSecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityModelEClass, SecurityModel.class, "SecurityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityModel_AutenticationMethod(), this.getAutenticationMethod(), null, "autenticationMethod", null, 0, 1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityModel_Actors(), this.getActor(), null, "actors", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityModel_UseCases(), this.getUseCase(), null, "useCases", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityModel_SecurityAppID(), ecorePackage.getEString(), "securityAppID", null, 0, 1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Code(), ecorePackage.getEString(), "code", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_Permission(), this.getActor(), null, "permission", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Code(), ecorePackage.getEString(), "code", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorBasedSecurityConstraintEClass, ActorBasedSecurityConstraint.class, "ActorBasedSecurityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorBasedSecurityConstraint_Actor(), this.getActor(), null, "actor", null, 0, 1, ActorBasedSecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customSecurityConstraintEClass, CustomSecurityConstraint.class, "CustomSecurityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomSecurityConstraint_MethodNameSuffix(), ecorePackage.getEString(), "methodNameSuffix", null, 0, 1, CustomSecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opauthssoEClass, it.csi.mddtools.guigen.OPAUTHSSO.class, "OPAUTHSSO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPAUTHSSO_MinAuthLevel(), ecorePackage.getEInt(), "minAuthLevel", "1", 0, 1, it.csi.mddtools.guigen.OPAUTHSSO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssobartssoEClass, it.csi.mddtools.guigen.SSOBARTSSO.class, "SSOBARTSSO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customAuthenticationEClass, CustomAuthentication.class, "CustomAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stdMessagePanelEClass, StdMessagePanel.class, "StdMessagePanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStdMessagePanel_ShowGlobalMessages(), ecorePackage.getEBoolean(), "showGlobalMessages", null, 0, 1, StdMessagePanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStdMessagePanel_ShowFieldErrorDetails(), ecorePackage.getEBoolean(), "showFieldErrorDetails", null, 0, 1, StdMessagePanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStdMessagePanel_ShowFieldErrors(), ecorePackage.getEBoolean(), "showFieldErrors", null, 0, 1, StdMessagePanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jumpExtCommandEClass, JumpExtCommand.class, "JumpExtCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJumpExtCommand_StaticUrl(), ecorePackage.getEString(), "staticUrl", null, 0, 1, JumpExtCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJumpExtCommand_RuntimeUrlProvider(), this.getApplicationData(), null, "runtimeUrlProvider", null, 0, 1, JumpExtCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJumpExtCommand_LocationCode(), ecorePackage.getEString(), "locationCode", null, 0, 1, JumpExtCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPlatformEClass, TargetPlatform.class, "TargetPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetPlatform_Code(), this.getTargetPlatformCodes(), "code", null, 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInfoPanelEClass, UserInfoPanel.class, "UserInfoPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDefinedPanelEClass, UserDefinedPanel.class, "UserDefinedPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wizardPanelEClass, WizardPanel.class, "WizardPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(widgetDataTypeEEnum, WidgetDataType.class, "WidgetDataType");
		addEEnumLiteral(widgetDataTypeEEnum, WidgetDataType.STRINGA);
		addEEnumLiteral(widgetDataTypeEEnum, WidgetDataType.NUMERICO);
		addEEnumLiteral(widgetDataTypeEEnum, WidgetDataType.DATA);
		addEEnumLiteral(widgetDataTypeEEnum, WidgetDataType.ORA);
		addEEnumLiteral(widgetDataTypeEEnum, WidgetDataType.DATAORA);

		initEEnum(udlrcSpecConstantsEEnum, UDLRCSpecConstants.class, "UDLRCSpecConstants");
		addEEnumLiteral(udlrcSpecConstantsEEnum, UDLRCSpecConstants.UP);
		addEEnumLiteral(udlrcSpecConstantsEEnum, UDLRCSpecConstants.DOWN);
		addEEnumLiteral(udlrcSpecConstantsEEnum, UDLRCSpecConstants.LEFT);
		addEEnumLiteral(udlrcSpecConstantsEEnum, UDLRCSpecConstants.RIGHT);
		addEEnumLiteral(udlrcSpecConstantsEEnum, UDLRCSpecConstants.CENTER);

		initEEnum(eventTypesEEnum, EventTypes.class, "EventTypes");
		addEEnumLiteral(eventTypesEEnum, EventTypes.CLICKED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.VALUE_CHANGED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.FOCUS_GAINED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.FOCUS_LOST);

		initEEnum(dataLifetimeTypeEEnum, DataLifetimeType.class, "DataLifetimeType");
		addEEnumLiteral(dataLifetimeTypeEEnum, DataLifetimeType.USER_ACTION);
		addEEnumLiteral(dataLifetimeTypeEEnum, DataLifetimeType.USER_SESSION);

		initEEnum(simpleTypeCodesEEnum, SimpleTypeCodes.class, "SimpleTypeCodes");
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.INT);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.LONG);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.FLOAT);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.DOUBLE);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.STRING);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.DATE);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.DATETIME);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.HOURS);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.BOOLEAN);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.BYTE);
		addEEnumLiteral(simpleTypeCodesEEnum, SimpleTypeCodes.TREE_NODE);

		initEEnum(portalNamesEEnum, PortalNames.class, "PortalNames");
		addEEnumLiteral(portalNamesEEnum, PortalNames.SISTEMA_PIEMONTE);
		addEEnumLiteral(portalNamesEEnum, PortalNames.INTRANET_RUPARPIEMONTE);

		initEEnum(targetPlatformCodesEEnum, TargetPlatformCodes.class, "TargetPlatformCodes");
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.WLS92);
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.JBOSS43);

		// Create resource
		createResource(eNS_URI);
	}

} //GuigenPackageImpl
