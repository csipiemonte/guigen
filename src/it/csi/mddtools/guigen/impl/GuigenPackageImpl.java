/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;


import it.csi.mddtools.guigen.ActivateMultiPanelItemCommand;
import it.csi.mddtools.guigen.ActivationModel;
import it.csi.mddtools.guigen.ActivationParam;
import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.ActorBasedSecurityConstraint;
import it.csi.mddtools.guigen.ActorMappingPDefVal;
import it.csi.mddtools.guigen.ActorMappingParam;
import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.AppDataGroup;
import it.csi.mddtools.guigen.AppDataMappingPDefVal;
import it.csi.mddtools.guigen.AppDataMappingParam;
import it.csi.mddtools.guigen.AppModule;
import it.csi.mddtools.guigen.AppWindow;
import it.csi.mddtools.guigen.ApplicationArea;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ApplicationDataDefs;
import it.csi.mddtools.guigen.AutenticationMethod;
import it.csi.mddtools.guigen.BeginEditCommand;
import it.csi.mddtools.guigen.Breadcrumb;
import it.csi.mddtools.guigen.Button;
import it.csi.mddtools.guigen.Calendar;
import it.csi.mddtools.guigen.CheckBox;
import it.csi.mddtools.guigen.ChkEditStatusCommand;
import it.csi.mddtools.guigen.ClearAppdataCommand;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.ColumnModel;
import it.csi.mddtools.guigen.ComboBox;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.CommandEvent;
import it.csi.mddtools.guigen.CommandFunctions;
import it.csi.mddtools.guigen.CommandOnPanels;
import it.csi.mddtools.guigen.CommandOnWidgets;
import it.csi.mddtools.guigen.CommandOutcome;
import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.CommandStyles;
import it.csi.mddtools.guigen.CommandWidget;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.ConfirmButton;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.CustomAuthentication;
import it.csi.mddtools.guigen.CustomCartridge;
import it.csi.mddtools.guigen.CustomCartridgeID;
import it.csi.mddtools.guigen.CustomCommand;
import it.csi.mddtools.guigen.CustomSecurityConstraint;
import it.csi.mddtools.guigen.CustomTemplate;
import it.csi.mddtools.guigen.DataLifetimeType;
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.DisabledComponentSet;
import it.csi.mddtools.guigen.EndEditCommand;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.EventTypes;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.ExtraColumn;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.FileUpload;
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
import it.csi.mddtools.guigen.HeaderMetaAttr;
import it.csi.mddtools.guigen.HiddenValue;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.Image;
import it.csi.mddtools.guigen.JumpBackCommand;
import it.csi.mddtools.guigen.JumpCommand;
import it.csi.mddtools.guigen.JumpExtCommand;
import it.csi.mddtools.guigen.LogicAggregationTypes;
import it.csi.mddtools.guigen.MapEnvelope;
import it.csi.mddtools.guigen.MapView;
import it.csi.mddtools.guigen.MapViewGadgets;
import it.csi.mddtools.guigen.Menu;
import it.csi.mddtools.guigen.MenuItem;
import it.csi.mddtools.guigen.MenuPanel;
import it.csi.mddtools.guigen.MenuView;
import it.csi.mddtools.guigen.Menubar;
import it.csi.mddtools.guigen.MessageSeverity;
import it.csi.mddtools.guigen.MethodProtectionTypes;
import it.csi.mddtools.guigen.ModelSlot;
import it.csi.mddtools.guigen.ModelSlotDef;
import it.csi.mddtools.guigen.MsgBoxPanel;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.NOPCommand;
import it.csi.mddtools.guigen.ONOFFCommand;
import it.csi.mddtools.guigen.PDefParam;
import it.csi.mddtools.guigen.PDefParamVal;
import it.csi.mddtools.guigen.PDefStateCommand;
import it.csi.mddtools.guigen.PDefUseConfig;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelDef;
import it.csi.mddtools.guigen.PanelDefState;
import it.csi.mddtools.guigen.PanelDefStates;
import it.csi.mddtools.guigen.PanelDefUse;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.PlainText;
import it.csi.mddtools.guigen.Point;
import it.csi.mddtools.guigen.PortalNames;
import it.csi.mddtools.guigen.PortalProfile;
import it.csi.mddtools.guigen.RadioButton;
import it.csi.mddtools.guigen.RadioButtons;
import it.csi.mddtools.guigen.RefreshViewCommand;
import it.csi.mddtools.guigen.RepartArtifact;
import it.csi.mddtools.guigen.RepartModule;
import it.csi.mddtools.guigen.RepartModuleTypes;
import it.csi.mddtools.guigen.ResetButton;
import it.csi.mddtools.guigen.Role;
import it.csi.mddtools.guigen.RoleBasedSecurityConstraint;
import it.csi.mddtools.guigen.RoleMappingPDefVal;
import it.csi.mddtools.guigen.RoleMappingParam;
import it.csi.mddtools.guigen.ScreenState;
import it.csi.mddtools.guigen.ScreenStateCommand;
import it.csi.mddtools.guigen.ScreenStates;
import it.csi.mddtools.guigen.SecurityModel;
import it.csi.mddtools.guigen.SequenceCommand;
import it.csi.mddtools.guigen.ShibbolethSSO;
import it.csi.mddtools.guigen.ShowDialogCommand;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;
import it.csi.mddtools.guigen.StaticLinks;
import it.csi.mddtools.guigen.Statusbar;
import it.csi.mddtools.guigen.StdMessagePanel;
import it.csi.mddtools.guigen.StdWebResModuleNames;
import it.csi.mddtools.guigen.StdWebResourceModule;
import it.csi.mddtools.guigen.TabSetPanel;
import it.csi.mddtools.guigen.TabSwitcher;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TableCustomizationPDefVal;
import it.csi.mddtools.guigen.TableCustomizationParam;
import it.csi.mddtools.guigen.TargetPlatform;
import it.csi.mddtools.guigen.TargetPlatformCodes;
import it.csi.mddtools.guigen.TextArea;
import it.csi.mddtools.guigen.TextField;
import it.csi.mddtools.guigen.Titlebar;
import it.csi.mddtools.guigen.TreeView;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypeAnnotation;
import it.csi.mddtools.guigen.TypeDefMappingPDefVal;
import it.csi.mddtools.guigen.TypeDefMappingParam;
import it.csi.mddtools.guigen.TypeNamespace;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.Typedefs;
import it.csi.mddtools.guigen.UCBasedSecurityConstraint;
import it.csi.mddtools.guigen.UCMappingPDefVal;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.UISecurityConstraint;
import it.csi.mddtools.guigen.UseCase;
import it.csi.mddtools.guigen.UseCaseMappingParam;
import it.csi.mddtools.guigen.UserDefinedPanel;
import it.csi.mddtools.guigen.UserDefinedWidget;
import it.csi.mddtools.guigen.UserInfoPanel;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.VisibilityCommand;
import it.csi.mddtools.guigen.WebResModuleDeployTypes;
import it.csi.mddtools.guigen.WebResourceModule;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WidgetDataType;
import it.csi.mddtools.guigen.WidgetLayoutSpecifier;
import it.csi.mddtools.guigen.WidgetTargetAction;

import it.csi.mddtools.guigen.WidgetsPanel;
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
	private EClass headerMetaAttrEClass = null;

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
	private EClass typeAnnotationEClass = null;

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
	private EClass appModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appDataGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msgBoxPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nopCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetsPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenStateCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shibbolethSSOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBasedSecurityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileUploadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabSwitcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pDefParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appDataMappingParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefMappingParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseMappingParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleMappingParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorMappingParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelDefUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pDefParamValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appDataMappingPDefValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefMappingPDefValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucMappingPDefValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleMappingPDefValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorMappingPDefValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pDefUseConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beginEditCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEditCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chkEditStatusCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelDefStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pDefStateCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelDefStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCustomizationParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCustomizationPDefValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customCartridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSlotDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAppdataCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEnvelopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portalProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webResourceModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdWebResourceModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repartArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repartModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breadcrumbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapViewGadgetsEClass = null;

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
	private EEnum methodProtectionTypesEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandStylesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicAggregationTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum customCartridgeIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandFunctionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webResModuleDeployTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stdWebResModuleNamesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repartModuleTypesEEnum = null;

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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GuigenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
		GuigenPackageImpl theGuigenPackage = (GuigenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuigenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuigenPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGuigenPackage.createPackageContents();

		// Initialize created meta-data
		theGuigenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGuigenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GuigenPackage.eNS_URI, theGuigenPackage);
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
	public EReference getApplicationArea_Modules() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_ExtModules() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArea_HomePage() {
		return (EReference)applicationAreaEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getMenubar_RemoteInfoBox() {
		return (EAttribute)menubarEClass.getEStructuralFeatures().get(1);
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
	public EReference getContentPanel_Dialogs() {
		return (EReference)contentPanelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentPanel_States() {
		return (EReference)contentPanelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentPanel_DefaultState() {
		return (EReference)contentPanelEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getFormPanel_Collapsible() {
		return (EAttribute)formPanelEClass.getEStructuralFeatures().get(2);
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
	public EReference getTabSetPanel_Switcher() {
		return (EReference)tabSetPanelEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPanel_Scrollable() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getWidget_Tooltip() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_EnableEnrichment() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getCommandWidget_FunctionSpecifier() {
		return (EAttribute)commandWidgetEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTextField_FieldMaxLength() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getComboBox_OmitHeaderValue() {
		return (EAttribute)comboBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboBox_FieldLength() {
		return (EAttribute)comboBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboBox_VisibleLines() {
		return (EAttribute)comboBoxEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getTable_CustomDecorator() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Summary() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
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
	public EReference getGUIModel_ExtSecurityModel() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_TargetPlatform() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUIModel_ActivationModel() {
		return (EReference)guiModelEClass.getEStructuralFeatures().get(12);
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
	public EAttribute getRadioButton_Value() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPanelLayout_ColumnSizes() {
		return (EAttribute)panelLayoutEClass.getEStructuralFeatures().get(0);
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
	public EReference getMenu_EventHandler() {
		return (EReference)menuEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getColumn_EditableFlagSelector() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_MultiDataBinding() {
		return (EReference)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_MultidataKeySelector() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_MultidataValueSelector() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_MultidataPropertySelector() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Tooltip() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_ActiveFlagSelector() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_FieldMaxLength() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(12);
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
	public EReference getExecCommand_CustomTemplate() {
		return (EReference)execCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecCommand_ExtraModels() {
		return (EReference)execCommandEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getEventHandler_MethodProtection() {
		return (EAttribute)eventHandlerEClass.getEStructuralFeatures().get(3);
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
	public EReference getDialogPanel_Commands() {
		return (EReference)dialogPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogPanel_MsgBoxes() {
		return (EReference)dialogPanelEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getHeader_NomeCanale() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_LinkCanale() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_NomeApplicativo() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Title() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_MetaAttributes() {
		return (EReference)headerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderMetaAttr() {
		return headerMetaAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderMetaAttr_Name() {
		return (EAttribute)headerMetaAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderMetaAttr_Value() {
		return (EAttribute)headerMetaAttrEClass.getEStructuralFeatures().get(1);
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
	public EReference getTypedefs_Namespaces() {
		return (EReference)typedefsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedefs_ExtNamespaces() {
		return (EReference)typedefsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSimpleType_UserDefined() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_DataTypeModifiers() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_EditHintMsg() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getComplexType_Extends() {
		return (EReference)complexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_TypeAnnotation() {
		return (EReference)complexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAnnotation() {
		return typeAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAnnotation_Language() {
		return (EAttribute)typeAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAnnotation_Fqn() {
		return (EAttribute)typeAnnotationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getField_Required() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_DataTypeModifier() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
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
	public EReference getApplicationDataDefs_Groups() {
		return (EReference)applicationDataDefsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDataDefs_ExtGroups() {
		return (EReference)applicationDataDefsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getGridWidgetLayoutSpec_Vspan() {
		return (EAttribute)gridWidgetLayoutSpecEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getCommandPanel_CmdStyle() {
		return (EAttribute)commandPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandPanel_Widgets() {
		return (EReference)commandPanelEClass.getEStructuralFeatures().get(1);
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
	public EReference getMenuPanel_Widgets() {
		return (EReference)menuPanelEClass.getEStructuralFeatures().get(0);
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
	public EReference getSecurityModel_Roles() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(4);
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
	public EReference getActor_Roles() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTargetPlatform_EnableRichUIBehavior() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPlatform_EnableFatClient() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_PortalProfiles() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getWizardPanel_NavigatorActive() {
		return (EAttribute)wizardPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizardPanel_Switcher() {
		return (EReference)wizardPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppModule() {
		return appModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppModule_Name() {
		return (EAttribute)appModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppModule_ContentPanels() {
		return (EReference)appModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppModule_ExtSecurityModel() {
		return (EReference)appModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeNamespace() {
		return typeNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeNamespace_Name() {
		return (EAttribute)typeNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeNamespace_Types() {
		return (EReference)typeNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppDataGroup() {
		return appDataGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppDataGroup_Name() {
		return (EAttribute)appDataGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDataGroup_AppData() {
		return (EReference)appDataGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMsgBoxPanel() {
		return msgBoxPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMsgBoxPanel_MessageSeverity() {
		return (EAttribute)msgBoxPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMsgBoxPanel_TextMessages() {
		return (EReference)msgBoxPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOPCommand() {
		return nopCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetsPanel() {
		return widgetsPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetsPanel_Widgets() {
		return (EReference)widgetsPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetsPanel_Summary() {
		return (EAttribute)widgetsPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetsPanel_Collapsible() {
		return (EAttribute)widgetsPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenState() {
		return screenStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenState_Name() {
		return (EAttribute)screenStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenState_WidgetsOn() {
		return (EReference)screenStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenState_WidgetsVisible() {
		return (EReference)screenStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenStates() {
		return screenStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenStates_States() {
		return (EReference)screenStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenStateCommand() {
		return screenStateCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenStateCommand_GoTo() {
		return (EReference)screenStateCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShibbolethSSO() {
		return shibbolethSSOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Code() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_DomainCode() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleBasedSecurityConstraint() {
		return roleBasedSecurityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBasedSecurityConstraint_Role() {
		return (EReference)roleBasedSecurityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileUpload() {
		return fileUploadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabSwitcher() {
		return tabSwitcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanelDef() {
		return panelDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanelDef_Name() {
		return (EAttribute)panelDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_Panel() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_Params() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_AppDataDefs() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_TypeDefs() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_Roles() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_Actors() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_UseCases() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_OnRefreshCommand() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_States() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDef_DefaultState() {
		return (EReference)panelDefEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDefParam() {
		return pDefParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPDefParam_Name() {
		return (EAttribute)pDefParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppDataMappingParam() {
		return appDataMappingParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDataMappingParam_DefAppData() {
		return (EReference)appDataMappingParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefMappingParam() {
		return typeDefMappingParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefMappingParam_DefTypeDef() {
		return (EReference)typeDefMappingParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCaseMappingParam() {
		return useCaseMappingParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseMappingParam_DefUseCase() {
		return (EReference)useCaseMappingParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleMappingParam() {
		return roleMappingParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleMappingParam_DefRole() {
		return (EReference)roleMappingParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorMappingParam() {
		return actorMappingParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorMappingParam_DefActor() {
		return (EReference)actorMappingParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanelDefUse() {
		return panelDefUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDefUse_PanelDef() {
		return (EReference)panelDefUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDefUse_Config() {
		return (EReference)panelDefUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDefParamVal() {
		return pDefParamValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDefParamVal_Param() {
		return (EReference)pDefParamValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppDataMappingPDefVal() {
		return appDataMappingPDefValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDataMappingPDefVal_ActualAppData() {
		return (EReference)appDataMappingPDefValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefMappingPDefVal() {
		return typeDefMappingPDefValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefMappingPDefVal_ActualTypeDef() {
		return (EReference)typeDefMappingPDefValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCMappingPDefVal() {
		return ucMappingPDefValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMappingPDefVal_ActualUseCase() {
		return (EReference)ucMappingPDefValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleMappingPDefVal() {
		return roleMappingPDefValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleMappingPDefVal_ActualRole() {
		return (EReference)roleMappingPDefValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorMappingPDefVal() {
		return actorMappingPDefValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorMappingPDefVal_ActualActor() {
		return (EReference)actorMappingPDefValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDefUseConfig() {
		return pDefUseConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDefUseConfig_ParamValues() {
		return (EReference)pDefUseConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationModel() {
		return activationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationModel_ActivationParams() {
		return (EReference)activationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationParam() {
		return activationParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationParam_Name() {
		return (EAttribute)activationParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationParam_Type() {
		return (EReference)activationParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeginEditCommand() {
		return beginEditCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeginEditCommand_DataEdited() {
		return (EReference)beginEditCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEditCommand() {
		return endEditCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndEditCommand_DataEdited() {
		return (EReference)endEditCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndEditCommand_Undo() {
		return (EAttribute)endEditCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChkEditStatusCommand() {
		return chkEditStatusCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChkEditStatusCommand_DataChecked() {
		return (EReference)chkEditStatusCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChkEditStatusCommand_CheckAggregation() {
		return (EAttribute)chkEditStatusCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChkEditStatusCommand_DoIfChanged() {
		return (EReference)chkEditStatusCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChkEditStatusCommand_DoIfNotChanged() {
		return (EReference)chkEditStatusCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanelDefState() {
		return panelDefStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanelDefState_Name() {
		return (EAttribute)panelDefStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDefState_WidgetsOn() {
		return (EReference)panelDefStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDefState_WidgetsVisible() {
		return (EReference)panelDefStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDefStateCommand() {
		return pDefStateCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDefStateCommand_GoTo() {
		return (EReference)pDefStateCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDefStateCommand_PDefUse() {
		return (EReference)pDefStateCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanelDefStates() {
		return panelDefStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanelDefStates_States() {
		return (EReference)panelDefStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCustomizationParam() {
		return tableCustomizationParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableCustomizationParam_BaseTable() {
		return (EReference)tableCustomizationParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraColumn() {
		return extraColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraColumn_InsertAfter() {
		return (EReference)extraColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCustomizationPDefVal() {
		return tableCustomizationPDefValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableCustomizationPDefVal_ExtraCols() {
		return (EReference)tableCustomizationPDefValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableCustomizationPDefVal_HiddenCols() {
		return (EReference)tableCustomizationPDefValEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCartridge() {
		return customCartridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomCartridge_Name() {
		return (EAttribute)customCartridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomCartridge_CrtID() {
		return (EAttribute)customCartridgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomCartridge_Templates() {
		return (EReference)customCartridgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTemplate() {
		return customTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTemplate_TplID() {
		return (EAttribute)customTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTemplate_Name() {
		return (EAttribute)customTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomTemplate_ModelSlots() {
		return (EReference)customTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSlotDef() {
		return modelSlotDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelSlotDef_Name() {
		return (EAttribute)modelSlotDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelSlotDef_ModelClass() {
		return (EAttribute)modelSlotDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSlot() {
		return modelSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSlot_Def() {
		return (EReference)modelSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSlot_Val() {
		return (EReference)modelSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAppdataCommand() {
		return clearAppdataCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAppdataCommand_AppData() {
		return (EReference)clearAppdataCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapView() {
		return mapViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapView_MapId() {
		return (EAttribute)mapViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapView_StartEnvelopeSpec() {
		return (EReference)mapViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapView_MaxEnvelopeSpec() {
		return (EReference)mapViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapView_ScaleEnvelopeSpec() {
		return (EReference)mapViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapView_NumLevels() {
		return (EAttribute)mapViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapView_EditDataBinding() {
		return (EReference)mapViewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapView_Gadgets() {
		return (EReference)mapViewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapView_NoClickWhenDisabled() {
		return (EAttribute)mapViewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapView_NoEditWhenDisabled() {
		return (EAttribute)mapViewEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapView_NoZoomWhenDisabled() {
		return (EAttribute)mapViewEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapView_NoPanWhenDisabled() {
		return (EAttribute)mapViewEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapEnvelope() {
		return mapEnvelopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapEnvelope_NorthEast() {
		return (EReference)mapEnvelopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapEnvelope_SouthWest() {
		return (EReference)mapEnvelopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortalProfile() {
		return portalProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortalProfile_Name() {
		return (EAttribute)portalProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortalProfile_ResModules() {
		return (EReference)portalProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebResourceModule() {
		return webResourceModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceModule_Name() {
		return (EAttribute)webResourceModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceModule_Version() {
		return (EAttribute)webResourceModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebResourceModule_RepartModule() {
		return (EReference)webResourceModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebResourceModule_DeploymentType() {
		return (EAttribute)webResourceModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStdWebResourceModule() {
		return stdWebResourceModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdWebResourceModule_StdName() {
		return (EAttribute)stdWebResourceModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepartArtifact() {
		return repartArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepartArtifact_Name() {
		return (EAttribute)repartArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepartArtifact_Type() {
		return (EAttribute)repartArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepartModule() {
		return repartModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepartModule_Organization() {
		return (EAttribute)repartModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepartModule_Name() {
		return (EAttribute)repartModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepartModule_Version() {
		return (EAttribute)repartModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepartModule_Type() {
		return (EAttribute)repartModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepartModule_Artifacts() {
		return (EReference)repartModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreadcrumb() {
		return breadcrumbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapViewGadgets() {
		return mapViewGadgetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_LayerSwitcher() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_BackgroundMapMapServiceName() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_BackgroundMapSwitcherLabel() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_BackgroundPhotoAerialMapServiceName() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_BackgroundPhotoAerialSwitcherLabel() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_PointEditingActive() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_LineEditingActive() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_PolygonEditingActive() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapViewGadgets_ModifyEditingActive() {
		return (EAttribute)mapViewGadgetsEClass.getEStructuralFeatures().get(8);
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
	public EEnum getMethodProtectionTypes() {
		return methodProtectionTypesEEnum;
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
	public EEnum getMessageSeverity() {
		return messageSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandStyles() {
		return commandStylesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicAggregationTypes() {
		return logicAggregationTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCustomCartridgeID() {
		return customCartridgeIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandFunctions() {
		return commandFunctionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWebResModuleDeployTypes() {
		return webResModuleDeployTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStdWebResModuleNames() {
		return stdWebResModuleNamesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepartModuleTypes() {
		return repartModuleTypesEEnum;
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
		createEReference(applicationAreaEClass, APPLICATION_AREA__MODULES);
		createEReference(applicationAreaEClass, APPLICATION_AREA__EXT_MODULES);
		createEReference(applicationAreaEClass, APPLICATION_AREA__HOME_PAGE);

		menubarEClass = createEClass(MENUBAR);
		createEReference(menubarEClass, MENUBAR__TOP_LEVEL_MENU);
		createEAttribute(menubarEClass, MENUBAR__REMOTE_INFO_BOX);

		statusbarEClass = createEClass(STATUSBAR);

		titlebarEClass = createEClass(TITLEBAR);

		contentPanelEClass = createEClass(CONTENT_PANEL);
		createEReference(contentPanelEClass, CONTENT_PANEL__PANELS);
		createEAttribute(contentPanelEClass, CONTENT_PANEL__NAME);
		createEReference(contentPanelEClass, CONTENT_PANEL__APP_DATA);
		createEReference(contentPanelEClass, CONTENT_PANEL__ON_REFRESH_COMMAND);
		createEReference(contentPanelEClass, CONTENT_PANEL__DIALOGS);
		createEReference(contentPanelEClass, CONTENT_PANEL__STATES);
		createEReference(contentPanelEClass, CONTENT_PANEL__DEFAULT_STATE);

		panelEClass = createEClass(PANEL);
		createEAttribute(panelEClass, PANEL__NAME);
		createEAttribute(panelEClass, PANEL__LABEL);
		createEReference(panelEClass, PANEL__LAYOUT);
		createEReference(panelEClass, PANEL__LAYOUT_SPEC);
		createEAttribute(panelEClass, PANEL__SCROLLABLE);

		formPanelEClass = createEClass(FORM_PANEL);
		createEReference(formPanelEClass, FORM_PANEL__SUBPANELS);
		createEReference(formPanelEClass, FORM_PANEL__WIDGETS);
		createEAttribute(formPanelEClass, FORM_PANEL__COLLAPSIBLE);

		multiPanelEClass = createEClass(MULTI_PANEL);
		createEReference(multiPanelEClass, MULTI_PANEL__PANELS);

		tabSetPanelEClass = createEClass(TAB_SET_PANEL);
		createEReference(tabSetPanelEClass, TAB_SET_PANEL__SWITCHER);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__NAME);
		createEAttribute(widgetEClass, WIDGET__LABEL);
		createEReference(widgetEClass, WIDGET__LAYOUT_SPEC);
		createEReference(widgetEClass, WIDGET__EVENT_HANDLERS);
		createEReference(widgetEClass, WIDGET__SECURITY_CONSTRAINTS);
		createEAttribute(widgetEClass, WIDGET__DEFAULT_VISIBLE);
		createEAttribute(widgetEClass, WIDGET__DEFAULT_ENABLED);
		createEAttribute(widgetEClass, WIDGET__TOOLTIP);
		createEAttribute(widgetEClass, WIDGET__ENABLE_ENRICHMENT);

		commandWidgetEClass = createEClass(COMMAND_WIDGET);
		createEAttribute(commandWidgetEClass, COMMAND_WIDGET__FUNCTION_SPECIFIER);

		dataWidgetEClass = createEClass(DATA_WIDGET);
		createEAttribute(dataWidgetEClass, DATA_WIDGET__DATA_TYPE_MODIFIER);
		createEReference(dataWidgetEClass, DATA_WIDGET__DATABINDING);
		createEReference(dataWidgetEClass, DATA_WIDGET__DATA_TYPE);
		createEAttribute(dataWidgetEClass, DATA_WIDGET__REQUIRED);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__IMAGE);

		textFieldEClass = createEClass(TEXT_FIELD);
		createEAttribute(textFieldEClass, TEXT_FIELD__FIELD_LENGTH);
		createEAttribute(textFieldEClass, TEXT_FIELD__FIELD_MAX_LENGTH);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__ROWS);
		createEAttribute(textAreaEClass, TEXT_AREA__COLUMNS);

		calendarEClass = createEClass(CALENDAR);

		comboBoxEClass = createEClass(COMBO_BOX);
		createEAttribute(comboBoxEClass, COMBO_BOX__KEY_SELECTOR);
		createEAttribute(comboBoxEClass, COMBO_BOX__VALUE_SELECTOR);
		createEAttribute(comboBoxEClass, COMBO_BOX__OMIT_HEADER_VALUE);
		createEAttribute(comboBoxEClass, COMBO_BOX__FIELD_LENGTH);
		createEAttribute(comboBoxEClass, COMBO_BOX__VISIBLE_LINES);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMN_MODEL);
		createEAttribute(tableEClass, TABLE__PAGE_SIZE);
		createEAttribute(tableEClass, TABLE__ENABLE_EXPORT);
		createEAttribute(tableEClass, TABLE__CUSTOM_DECORATOR);
		createEAttribute(tableEClass, TABLE__SUMMARY);

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
		createEReference(guiModelEClass, GUI_MODEL__EXT_SECURITY_MODEL);
		createEReference(guiModelEClass, GUI_MODEL__TARGET_PLATFORM);
		createEReference(guiModelEClass, GUI_MODEL__ACTIVATION_MODEL);

		guiStructureEClass = createEClass(GUI_STRUCTURE);
		createEReference(guiStructureEClass, GUI_STRUCTURE__APP_WINDOW);

		guiBehaviorsEClass = createEClass(GUI_BEHAVIORS);

		radioButtonsEClass = createEClass(RADIO_BUTTONS);
		createEReference(radioButtonsEClass, RADIO_BUTTONS__RADIO);

		radioButtonEClass = createEClass(RADIO_BUTTON);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__VALUE);

		resetButtonEClass = createEClass(RESET_BUTTON);

		confirmButtonEClass = createEClass(CONFIRM_BUTTON);

		panelLayoutEClass = createEClass(PANEL_LAYOUT);
		createEAttribute(panelLayoutEClass, PANEL_LAYOUT__COLUMN_SIZES);

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
		createEReference(menuEClass, MENU__EVENT_HANDLER);

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
		createEAttribute(columnEClass, COLUMN__EDITABLE_FLAG_SELECTOR);
		createEReference(columnEClass, COLUMN__MULTI_DATA_BINDING);
		createEAttribute(columnEClass, COLUMN__MULTIDATA_KEY_SELECTOR);
		createEAttribute(columnEClass, COLUMN__MULTIDATA_VALUE_SELECTOR);
		createEAttribute(columnEClass, COLUMN__MULTIDATA_PROPERTY_SELECTOR);
		createEAttribute(columnEClass, COLUMN__TOOLTIP);
		createEAttribute(columnEClass, COLUMN__ACTIVE_FLAG_SELECTOR);
		createEAttribute(columnEClass, COLUMN__FIELD_MAX_LENGTH);

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
		createEReference(execCommandEClass, EXEC_COMMAND__CUSTOM_TEMPLATE);
		createEReference(execCommandEClass, EXEC_COMMAND__EXTRA_MODELS);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEReference(eventHandlerEClass, EVENT_HANDLER__COMMAND);
		createEAttribute(eventHandlerEClass, EVENT_HANDLER__EVENT_TYPE);
		createEAttribute(eventHandlerEClass, EVENT_HANDLER__SKIP_VALIDATION);
		createEAttribute(eventHandlerEClass, EVENT_HANDLER__METHOD_PROTECTION);

		widgetTargetActionEClass = createEClass(WIDGET_TARGET_ACTION);

		commandOnWidgetsEClass = createEClass(COMMAND_ON_WIDGETS);
		createEReference(commandOnWidgetsEClass, COMMAND_ON_WIDGETS__TARGET_WIDGETS);

		dialogPanelEClass = createEClass(DIALOG_PANEL);
		createEReference(dialogPanelEClass, DIALOG_PANEL__COMMANDS);
		createEReference(dialogPanelEClass, DIALOG_PANEL__MSG_BOXES);

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
		createEAttribute(headerEClass, HEADER__NOME_CANALE);
		createEAttribute(headerEClass, HEADER__LINK_CANALE);
		createEAttribute(headerEClass, HEADER__NOME_APPLICATIVO);
		createEAttribute(headerEClass, HEADER__TITLE);
		createEReference(headerEClass, HEADER__META_ATTRIBUTES);

		headerMetaAttrEClass = createEClass(HEADER_META_ATTR);
		createEAttribute(headerMetaAttrEClass, HEADER_META_ATTR__NAME);
		createEAttribute(headerMetaAttrEClass, HEADER_META_ATTR__VALUE);

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
		createEReference(typedefsEClass, TYPEDEFS__NAMESPACES);
		createEReference(typedefsEClass, TYPEDEFS__EXT_NAMESPACES);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__CODE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__NILLABLE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__USER_DEFINED);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__DATA_TYPE_MODIFIERS);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__EDIT_HINT_MSG);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEReference(complexTypeEClass, COMPLEX_TYPE__FIELDS);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__INIT_FIELDS);
		createEReference(complexTypeEClass, COMPLEX_TYPE__EXTENDS);
		createEReference(complexTypeEClass, COMPLEX_TYPE__TYPE_ANNOTATION);

		typeAnnotationEClass = createEClass(TYPE_ANNOTATION);
		createEAttribute(typeAnnotationEClass, TYPE_ANNOTATION__LANGUAGE);
		createEAttribute(typeAnnotationEClass, TYPE_ANNOTATION__FQN);

		typedArrayEClass = createEClass(TYPED_ARRAY);
		createEReference(typedArrayEClass, TYPED_ARRAY__COMPONENT_TYPE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__TYPE);
		createEAttribute(fieldEClass, FIELD__REQUIRED);
		createEAttribute(fieldEClass, FIELD__DATA_TYPE_MODIFIER);

		applicationDataDefsEClass = createEClass(APPLICATION_DATA_DEFS);
		createEReference(applicationDataDefsEClass, APPLICATION_DATA_DEFS__APP_DATA);
		createEReference(applicationDataDefsEClass, APPLICATION_DATA_DEFS__GROUPS);
		createEReference(applicationDataDefsEClass, APPLICATION_DATA_DEFS__EXT_GROUPS);

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
		createEAttribute(gridWidgetLayoutSpecEClass, GRID_WIDGET_LAYOUT_SPEC__VSPAN);

		commandPanelEClass = createEClass(COMMAND_PANEL);
		createEAttribute(commandPanelEClass, COMMAND_PANEL__CMD_STYLE);
		createEReference(commandPanelEClass, COMMAND_PANEL__WIDGETS);

		menuPanelEClass = createEClass(MENU_PANEL);
		createEReference(menuPanelEClass, MENU_PANEL__WIDGETS);

		hiddenValueEClass = createEClass(HIDDEN_VALUE);

		userDefinedWidgetEClass = createEClass(USER_DEFINED_WIDGET);

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
		createEReference(securityModelEClass, SECURITY_MODEL__ROLES);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__CODE);
		createEReference(actorEClass, ACTOR__ROLES);

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
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__ENABLE_RICH_UI_BEHAVIOR);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__ENABLE_FAT_CLIENT);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__PORTAL_PROFILES);

		userInfoPanelEClass = createEClass(USER_INFO_PANEL);

		userDefinedPanelEClass = createEClass(USER_DEFINED_PANEL);

		wizardPanelEClass = createEClass(WIZARD_PANEL);
		createEAttribute(wizardPanelEClass, WIZARD_PANEL__NAVIGATOR_ACTIVE);
		createEReference(wizardPanelEClass, WIZARD_PANEL__SWITCHER);

		appModuleEClass = createEClass(APP_MODULE);
		createEAttribute(appModuleEClass, APP_MODULE__NAME);
		createEReference(appModuleEClass, APP_MODULE__CONTENT_PANELS);
		createEReference(appModuleEClass, APP_MODULE__EXT_SECURITY_MODEL);

		typeNamespaceEClass = createEClass(TYPE_NAMESPACE);
		createEAttribute(typeNamespaceEClass, TYPE_NAMESPACE__NAME);
		createEReference(typeNamespaceEClass, TYPE_NAMESPACE__TYPES);

		appDataGroupEClass = createEClass(APP_DATA_GROUP);
		createEAttribute(appDataGroupEClass, APP_DATA_GROUP__NAME);
		createEReference(appDataGroupEClass, APP_DATA_GROUP__APP_DATA);

		msgBoxPanelEClass = createEClass(MSG_BOX_PANEL);
		createEAttribute(msgBoxPanelEClass, MSG_BOX_PANEL__MESSAGE_SEVERITY);
		createEReference(msgBoxPanelEClass, MSG_BOX_PANEL__TEXT_MESSAGES);

		nopCommandEClass = createEClass(NOP_COMMAND);

		widgetsPanelEClass = createEClass(WIDGETS_PANEL);
		createEReference(widgetsPanelEClass, WIDGETS_PANEL__WIDGETS);
		createEAttribute(widgetsPanelEClass, WIDGETS_PANEL__SUMMARY);
		createEAttribute(widgetsPanelEClass, WIDGETS_PANEL__COLLAPSIBLE);

		screenStateEClass = createEClass(SCREEN_STATE);
		createEAttribute(screenStateEClass, SCREEN_STATE__NAME);
		createEReference(screenStateEClass, SCREEN_STATE__WIDGETS_ON);
		createEReference(screenStateEClass, SCREEN_STATE__WIDGETS_VISIBLE);

		screenStatesEClass = createEClass(SCREEN_STATES);
		createEReference(screenStatesEClass, SCREEN_STATES__STATES);

		screenStateCommandEClass = createEClass(SCREEN_STATE_COMMAND);
		createEReference(screenStateCommandEClass, SCREEN_STATE_COMMAND__GO_TO);

		shibbolethSSOEClass = createEClass(SHIBBOLETH_SSO);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__CODE);
		createEAttribute(roleEClass, ROLE__DOMAIN_CODE);

		roleBasedSecurityConstraintEClass = createEClass(ROLE_BASED_SECURITY_CONSTRAINT);
		createEReference(roleBasedSecurityConstraintEClass, ROLE_BASED_SECURITY_CONSTRAINT__ROLE);

		fileUploadEClass = createEClass(FILE_UPLOAD);

		tabSwitcherEClass = createEClass(TAB_SWITCHER);

		panelDefEClass = createEClass(PANEL_DEF);
		createEAttribute(panelDefEClass, PANEL_DEF__NAME);
		createEReference(panelDefEClass, PANEL_DEF__PANEL);
		createEReference(panelDefEClass, PANEL_DEF__PARAMS);
		createEReference(panelDefEClass, PANEL_DEF__APP_DATA_DEFS);
		createEReference(panelDefEClass, PANEL_DEF__TYPE_DEFS);
		createEReference(panelDefEClass, PANEL_DEF__ROLES);
		createEReference(panelDefEClass, PANEL_DEF__ACTORS);
		createEReference(panelDefEClass, PANEL_DEF__USE_CASES);
		createEReference(panelDefEClass, PANEL_DEF__ON_REFRESH_COMMAND);
		createEReference(panelDefEClass, PANEL_DEF__STATES);
		createEReference(panelDefEClass, PANEL_DEF__DEFAULT_STATE);

		pDefParamEClass = createEClass(PDEF_PARAM);
		createEAttribute(pDefParamEClass, PDEF_PARAM__NAME);

		appDataMappingParamEClass = createEClass(APP_DATA_MAPPING_PARAM);
		createEReference(appDataMappingParamEClass, APP_DATA_MAPPING_PARAM__DEF_APP_DATA);

		typeDefMappingParamEClass = createEClass(TYPE_DEF_MAPPING_PARAM);
		createEReference(typeDefMappingParamEClass, TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF);

		useCaseMappingParamEClass = createEClass(USE_CASE_MAPPING_PARAM);
		createEReference(useCaseMappingParamEClass, USE_CASE_MAPPING_PARAM__DEF_USE_CASE);

		roleMappingParamEClass = createEClass(ROLE_MAPPING_PARAM);
		createEReference(roleMappingParamEClass, ROLE_MAPPING_PARAM__DEF_ROLE);

		actorMappingParamEClass = createEClass(ACTOR_MAPPING_PARAM);
		createEReference(actorMappingParamEClass, ACTOR_MAPPING_PARAM__DEF_ACTOR);

		panelDefUseEClass = createEClass(PANEL_DEF_USE);
		createEReference(panelDefUseEClass, PANEL_DEF_USE__PANEL_DEF);
		createEReference(panelDefUseEClass, PANEL_DEF_USE__CONFIG);

		pDefParamValEClass = createEClass(PDEF_PARAM_VAL);
		createEReference(pDefParamValEClass, PDEF_PARAM_VAL__PARAM);

		appDataMappingPDefValEClass = createEClass(APP_DATA_MAPPING_PDEF_VAL);
		createEReference(appDataMappingPDefValEClass, APP_DATA_MAPPING_PDEF_VAL__ACTUAL_APP_DATA);

		typeDefMappingPDefValEClass = createEClass(TYPE_DEF_MAPPING_PDEF_VAL);
		createEReference(typeDefMappingPDefValEClass, TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF);

		ucMappingPDefValEClass = createEClass(UC_MAPPING_PDEF_VAL);
		createEReference(ucMappingPDefValEClass, UC_MAPPING_PDEF_VAL__ACTUAL_USE_CASE);

		roleMappingPDefValEClass = createEClass(ROLE_MAPPING_PDEF_VAL);
		createEReference(roleMappingPDefValEClass, ROLE_MAPPING_PDEF_VAL__ACTUAL_ROLE);

		actorMappingPDefValEClass = createEClass(ACTOR_MAPPING_PDEF_VAL);
		createEReference(actorMappingPDefValEClass, ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR);

		pDefUseConfigEClass = createEClass(PDEF_USE_CONFIG);
		createEReference(pDefUseConfigEClass, PDEF_USE_CONFIG__PARAM_VALUES);

		activationModelEClass = createEClass(ACTIVATION_MODEL);
		createEReference(activationModelEClass, ACTIVATION_MODEL__ACTIVATION_PARAMS);

		activationParamEClass = createEClass(ACTIVATION_PARAM);
		createEAttribute(activationParamEClass, ACTIVATION_PARAM__NAME);
		createEReference(activationParamEClass, ACTIVATION_PARAM__TYPE);

		beginEditCommandEClass = createEClass(BEGIN_EDIT_COMMAND);
		createEReference(beginEditCommandEClass, BEGIN_EDIT_COMMAND__DATA_EDITED);

		endEditCommandEClass = createEClass(END_EDIT_COMMAND);
		createEReference(endEditCommandEClass, END_EDIT_COMMAND__DATA_EDITED);
		createEAttribute(endEditCommandEClass, END_EDIT_COMMAND__UNDO);

		chkEditStatusCommandEClass = createEClass(CHK_EDIT_STATUS_COMMAND);
		createEReference(chkEditStatusCommandEClass, CHK_EDIT_STATUS_COMMAND__DATA_CHECKED);
		createEAttribute(chkEditStatusCommandEClass, CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION);
		createEReference(chkEditStatusCommandEClass, CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED);
		createEReference(chkEditStatusCommandEClass, CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED);

		panelDefStateEClass = createEClass(PANEL_DEF_STATE);
		createEAttribute(panelDefStateEClass, PANEL_DEF_STATE__NAME);
		createEReference(panelDefStateEClass, PANEL_DEF_STATE__WIDGETS_ON);
		createEReference(panelDefStateEClass, PANEL_DEF_STATE__WIDGETS_VISIBLE);

		pDefStateCommandEClass = createEClass(PDEF_STATE_COMMAND);
		createEReference(pDefStateCommandEClass, PDEF_STATE_COMMAND__GO_TO);
		createEReference(pDefStateCommandEClass, PDEF_STATE_COMMAND__PDEF_USE);

		panelDefStatesEClass = createEClass(PANEL_DEF_STATES);
		createEReference(panelDefStatesEClass, PANEL_DEF_STATES__STATES);

		tableCustomizationParamEClass = createEClass(TABLE_CUSTOMIZATION_PARAM);
		createEReference(tableCustomizationParamEClass, TABLE_CUSTOMIZATION_PARAM__BASE_TABLE);

		extraColumnEClass = createEClass(EXTRA_COLUMN);
		createEReference(extraColumnEClass, EXTRA_COLUMN__INSERT_AFTER);

		tableCustomizationPDefValEClass = createEClass(TABLE_CUSTOMIZATION_PDEF_VAL);
		createEReference(tableCustomizationPDefValEClass, TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS);
		createEReference(tableCustomizationPDefValEClass, TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS);

		customCartridgeEClass = createEClass(CUSTOM_CARTRIDGE);
		createEAttribute(customCartridgeEClass, CUSTOM_CARTRIDGE__NAME);
		createEAttribute(customCartridgeEClass, CUSTOM_CARTRIDGE__CRT_ID);
		createEReference(customCartridgeEClass, CUSTOM_CARTRIDGE__TEMPLATES);

		customTemplateEClass = createEClass(CUSTOM_TEMPLATE);
		createEAttribute(customTemplateEClass, CUSTOM_TEMPLATE__TPL_ID);
		createEAttribute(customTemplateEClass, CUSTOM_TEMPLATE__NAME);
		createEReference(customTemplateEClass, CUSTOM_TEMPLATE__MODEL_SLOTS);

		modelSlotDefEClass = createEClass(MODEL_SLOT_DEF);
		createEAttribute(modelSlotDefEClass, MODEL_SLOT_DEF__NAME);
		createEAttribute(modelSlotDefEClass, MODEL_SLOT_DEF__MODEL_CLASS);

		modelSlotEClass = createEClass(MODEL_SLOT);
		createEReference(modelSlotEClass, MODEL_SLOT__DEF);
		createEReference(modelSlotEClass, MODEL_SLOT__VAL);

		clearAppdataCommandEClass = createEClass(CLEAR_APPDATA_COMMAND);
		createEReference(clearAppdataCommandEClass, CLEAR_APPDATA_COMMAND__APP_DATA);

		mapViewEClass = createEClass(MAP_VIEW);
		createEAttribute(mapViewEClass, MAP_VIEW__MAP_ID);
		createEReference(mapViewEClass, MAP_VIEW__START_ENVELOPE_SPEC);
		createEReference(mapViewEClass, MAP_VIEW__MAX_ENVELOPE_SPEC);
		createEReference(mapViewEClass, MAP_VIEW__SCALE_ENVELOPE_SPEC);
		createEAttribute(mapViewEClass, MAP_VIEW__NUM_LEVELS);
		createEReference(mapViewEClass, MAP_VIEW__EDIT_DATA_BINDING);
		createEReference(mapViewEClass, MAP_VIEW__GADGETS);
		createEAttribute(mapViewEClass, MAP_VIEW__NO_CLICK_WHEN_DISABLED);
		createEAttribute(mapViewEClass, MAP_VIEW__NO_EDIT_WHEN_DISABLED);
		createEAttribute(mapViewEClass, MAP_VIEW__NO_ZOOM_WHEN_DISABLED);
		createEAttribute(mapViewEClass, MAP_VIEW__NO_PAN_WHEN_DISABLED);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		mapEnvelopeEClass = createEClass(MAP_ENVELOPE);
		createEReference(mapEnvelopeEClass, MAP_ENVELOPE__NORTH_EAST);
		createEReference(mapEnvelopeEClass, MAP_ENVELOPE__SOUTH_WEST);

		portalProfileEClass = createEClass(PORTAL_PROFILE);
		createEAttribute(portalProfileEClass, PORTAL_PROFILE__NAME);
		createEReference(portalProfileEClass, PORTAL_PROFILE__RES_MODULES);

		webResourceModuleEClass = createEClass(WEB_RESOURCE_MODULE);
		createEAttribute(webResourceModuleEClass, WEB_RESOURCE_MODULE__NAME);
		createEAttribute(webResourceModuleEClass, WEB_RESOURCE_MODULE__VERSION);
		createEAttribute(webResourceModuleEClass, WEB_RESOURCE_MODULE__DEPLOYMENT_TYPE);
		createEReference(webResourceModuleEClass, WEB_RESOURCE_MODULE__REPART_MODULE);

		stdWebResourceModuleEClass = createEClass(STD_WEB_RESOURCE_MODULE);
		createEAttribute(stdWebResourceModuleEClass, STD_WEB_RESOURCE_MODULE__STD_NAME);

		repartArtifactEClass = createEClass(REPART_ARTIFACT);
		createEAttribute(repartArtifactEClass, REPART_ARTIFACT__NAME);
		createEAttribute(repartArtifactEClass, REPART_ARTIFACT__TYPE);

		repartModuleEClass = createEClass(REPART_MODULE);
		createEAttribute(repartModuleEClass, REPART_MODULE__ORGANIZATION);
		createEAttribute(repartModuleEClass, REPART_MODULE__NAME);
		createEAttribute(repartModuleEClass, REPART_MODULE__VERSION);
		createEAttribute(repartModuleEClass, REPART_MODULE__TYPE);
		createEReference(repartModuleEClass, REPART_MODULE__ARTIFACTS);

		breadcrumbEClass = createEClass(BREADCRUMB);

		mapViewGadgetsEClass = createEClass(MAP_VIEW_GADGETS);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__LAYER_SWITCHER);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE);
		createEAttribute(mapViewGadgetsEClass, MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE);

		// Create enums
		widgetDataTypeEEnum = createEEnum(WIDGET_DATA_TYPE);
		udlrcSpecConstantsEEnum = createEEnum(UDLRC_SPEC_CONSTANTS);
		methodProtectionTypesEEnum = createEEnum(METHOD_PROTECTION_TYPES);
		eventTypesEEnum = createEEnum(EVENT_TYPES);
		dataLifetimeTypeEEnum = createEEnum(DATA_LIFETIME_TYPE);
		simpleTypeCodesEEnum = createEEnum(SIMPLE_TYPE_CODES);
		portalNamesEEnum = createEEnum(PORTAL_NAMES);
		targetPlatformCodesEEnum = createEEnum(TARGET_PLATFORM_CODES);
		messageSeverityEEnum = createEEnum(MESSAGE_SEVERITY);
		commandStylesEEnum = createEEnum(COMMAND_STYLES);
		logicAggregationTypesEEnum = createEEnum(LOGIC_AGGREGATION_TYPES);
		customCartridgeIDEEnum = createEEnum(CUSTOM_CARTRIDGE_ID);
		commandFunctionsEEnum = createEEnum(COMMAND_FUNCTIONS);
		webResModuleDeployTypesEEnum = createEEnum(WEB_RES_MODULE_DEPLOY_TYPES);
		stdWebResModuleNamesEEnum = createEEnum(STD_WEB_RES_MODULE_NAMES);
		repartModuleTypesEEnum = createEEnum(REPART_MODULE_TYPES);
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
		multiPanelEClass.getESuperTypes().add(this.getPanel());
		tabSetPanelEClass.getESuperTypes().add(this.getMultiPanel());
		commandWidgetEClass.getESuperTypes().add(this.getWidget());
		dataWidgetEClass.getESuperTypes().add(this.getWidget());
		buttonEClass.getESuperTypes().add(this.getCommandWidget());
		textFieldEClass.getESuperTypes().add(this.getDataWidget());
		textFieldEClass.getESuperTypes().add(this.getMultiDataWidget());
		textAreaEClass.getESuperTypes().add(this.getDataWidget());
		calendarEClass.getESuperTypes().add(this.getDataWidget());
		comboBoxEClass.getESuperTypes().add(this.getDataWidget());
		comboBoxEClass.getESuperTypes().add(this.getMultiDataWidget());
		tableEClass.getESuperTypes().add(this.getDataWidget());
		tableEClass.getESuperTypes().add(this.getMultiDataWidget());
		checkBoxEClass.getESuperTypes().add(this.getDataWidget());
		radioButtonsEClass.getESuperTypes().add(this.getDataWidget());
		radioButtonEClass.getESuperTypes().add(this.getWidget());
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
		commandPanelEClass.getESuperTypes().add(this.getPanel());
		menuPanelEClass.getESuperTypes().add(this.getPanel());
		hiddenValueEClass.getESuperTypes().add(this.getDataWidget());
		userDefinedWidgetEClass.getESuperTypes().add(this.getWidget());
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
		msgBoxPanelEClass.getESuperTypes().add(this.getPanel());
		nopCommandEClass.getESuperTypes().add(this.getCommand());
		widgetsPanelEClass.getESuperTypes().add(this.getPanel());
		screenStateCommandEClass.getESuperTypes().add(this.getCommand());
		shibbolethSSOEClass.getESuperTypes().add(this.getAutenticationMethod());
		roleBasedSecurityConstraintEClass.getESuperTypes().add(this.getUISecurityConstraint());
		fileUploadEClass.getESuperTypes().add(this.getWidget());
		tabSwitcherEClass.getESuperTypes().add(this.getCommandWidget());
		appDataMappingParamEClass.getESuperTypes().add(this.getPDefParam());
		typeDefMappingParamEClass.getESuperTypes().add(this.getPDefParam());
		useCaseMappingParamEClass.getESuperTypes().add(this.getPDefParam());
		roleMappingParamEClass.getESuperTypes().add(this.getPDefParam());
		actorMappingParamEClass.getESuperTypes().add(this.getPDefParam());
		panelDefUseEClass.getESuperTypes().add(this.getPanel());
		appDataMappingPDefValEClass.getESuperTypes().add(this.getPDefParamVal());
		typeDefMappingPDefValEClass.getESuperTypes().add(this.getPDefParamVal());
		ucMappingPDefValEClass.getESuperTypes().add(this.getPDefParamVal());
		roleMappingPDefValEClass.getESuperTypes().add(this.getPDefParamVal());
		actorMappingPDefValEClass.getESuperTypes().add(this.getPDefParamVal());
		beginEditCommandEClass.getESuperTypes().add(this.getCommand());
		endEditCommandEClass.getESuperTypes().add(this.getCommand());
		chkEditStatusCommandEClass.getESuperTypes().add(this.getCommand());
		pDefStateCommandEClass.getESuperTypes().add(this.getCommand());
		tableCustomizationParamEClass.getESuperTypes().add(this.getPDefParam());
		extraColumnEClass.getESuperTypes().add(this.getColumn());
		tableCustomizationPDefValEClass.getESuperTypes().add(this.getPDefParamVal());
		clearAppdataCommandEClass.getESuperTypes().add(this.getCommand());
		mapViewEClass.getESuperTypes().add(this.getDataWidget());
		mapViewEClass.getESuperTypes().add(this.getMultiDataWidget());
		stdWebResourceModuleEClass.getESuperTypes().add(this.getWebResourceModule());
		breadcrumbEClass.getESuperTypes().add(this.getPanel());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationAreaEClass, ApplicationArea.class, "ApplicationArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationArea_Menubar(), this.getMenubar(), null, "menubar", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_Titlebar(), this.getTitlebar(), null, "titlebar", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_Statusbar(), this.getStatusbar(), null, "statusbar", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_ContentPanels(), this.getContentPanel(), null, "contentPanels", null, 0, -1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_StaticLinks(), this.getStaticLinks(), null, "staticLinks", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_OnInitCommand(), this.getCommand(), null, "onInitCommand", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_Modules(), this.getAppModule(), null, "modules", null, 0, -1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_ExtModules(), this.getAppModule(), null, "extModules", null, 0, -1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArea_HomePage(), this.getContentPanel(), null, "homePage", null, 0, 1, ApplicationArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menubarEClass, Menubar.class, "Menubar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenubar_TopLevelMenu(), this.getMenu(), null, "topLevelMenu", null, 0, -1, Menubar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenubar_RemoteInfoBox(), ecorePackage.getEBoolean(), "remoteInfoBox", null, 0, 1, Menubar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusbarEClass, Statusbar.class, "Statusbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(titlebarEClass, Titlebar.class, "Titlebar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentPanelEClass, ContentPanel.class, "ContentPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentPanel_Panels(), this.getPanel(), null, "panels", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentPanel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentPanel_AppData(), this.getApplicationData(), null, "appData", null, 0, -1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentPanel_OnRefreshCommand(), this.getCommand(), null, "onRefreshCommand", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentPanel_Dialogs(), this.getDialogPanel(), null, "dialogs", null, 0, -1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentPanel_States(), this.getScreenStates(), null, "states", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentPanel_DefaultState(), this.getScreenState(), null, "defaultState", null, 0, 1, ContentPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_Label(), ecorePackage.getEString(), "label", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanel_Layout(), this.getPanelLayout(), null, "layout", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanel_LayoutSpec(), this.getWidgetLayoutSpecifier(), null, "layoutSpec", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_Scrollable(), ecorePackage.getEBoolean(), "scrollable", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formPanelEClass, FormPanel.class, "FormPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormPanel_Subpanels(), this.getPanel(), null, "subpanels", null, 0, -1, FormPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormPanel_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, FormPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormPanel_Collapsible(), ecorePackage.getEBoolean(), "collapsible", "false", 0, 1, FormPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPanelEClass, MultiPanel.class, "MultiPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiPanel_Panels(), this.getPanel(), null, "panels", null, 0, -1, MultiPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabSetPanelEClass, TabSetPanel.class, "TabSetPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabSetPanel_Switcher(), this.getTabSwitcher(), null, "switcher", null, 0, 1, TabSetPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Name(), ecorePackage.getEString(), "name", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Label(), ecorePackage.getEString(), "label", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_LayoutSpec(), this.getWidgetLayoutSpecifier(), null, "layoutSpec", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_EventHandlers(), this.getEventHandler(), null, "eventHandlers", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_SecurityConstraints(), this.getUISecurityConstraint(), null, "securityConstraints", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_DefaultVisible(), ecorePackage.getEBoolean(), "defaultVisible", "true", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_DefaultEnabled(), ecorePackage.getEBoolean(), "defaultEnabled", "true", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Tooltip(), ecorePackage.getEString(), "tooltip", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_EnableEnrichment(), ecorePackage.getEBooleanObject(), "enableEnrichment", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandWidgetEClass, CommandWidget.class, "CommandWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandWidget_FunctionSpecifier(), this.getCommandFunctions(), "functionSpecifier", "0", 0, 1, CommandWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataWidgetEClass, DataWidget.class, "DataWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataWidget_DataTypeModifier(), ecorePackage.getEString(), "dataTypeModifier", null, 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWidget_Databinding(), this.getAppDataBinding(), null, "databinding", null, 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWidget_DataType(), this.getType(), null, "dataType", null, 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWidget_Required(), ecorePackage.getEBoolean(), "required", "false", 0, 1, DataWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Image(), ecorePackage.getEString(), "image", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextField_FieldLength(), ecorePackage.getEInt(), "fieldLength", "15", 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextField_FieldMaxLength(), ecorePackage.getEInt(), "fieldMaxLength", null, 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_Rows(), ecorePackage.getEInt(), "rows", "10", 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Columns(), ecorePackage.getEInt(), "columns", "30", 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComboBox_KeySelector(), ecorePackage.getEString(), "keySelector", null, 0, 1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboBox_ValueSelector(), ecorePackage.getEString(), "valueSelector", null, 0, 1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboBox_OmitHeaderValue(), ecorePackage.getEBoolean(), "omitHeaderValue", "false", 0, 1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboBox_FieldLength(), ecorePackage.getEInt(), "fieldLength", "15", 0, 1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboBox_VisibleLines(), ecorePackage.getEInt(), "visibleLines", null, 0, 1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_ColumnModel(), this.getColumnModel(), null, "columnModel", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_PageSize(), ecorePackage.getEInt(), "pageSize", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_EnableExport(), ecorePackage.getEBoolean(), "enableExport", "true", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_CustomDecorator(), ecorePackage.getEBoolean(), "customDecorator", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getGUIModel_ExtSecurityModel(), this.getSecurityModel(), null, "extSecurityModel", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_TargetPlatform(), this.getTargetPlatform(), null, "targetPlatform", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGUIModel_ActivationModel(), this.getActivationModel(), null, "activationModel", null, 0, 1, GUIModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiStructureEClass, GUIStructure.class, "GUIStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUIStructure_AppWindow(), this.getAppWindow(), null, "appWindow", null, 0, 1, GUIStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiBehaviorsEClass, GUIBehaviors.class, "GUIBehaviors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonsEClass, RadioButtons.class, "RadioButtons", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRadioButtons_Radio(), this.getRadioButton(), null, "radio", null, 0, -1, RadioButtons.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioButton_Value(), ecorePackage.getEString(), "value", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetButtonEClass, ResetButton.class, "ResetButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(confirmButtonEClass, ConfirmButton.class, "ConfirmButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panelLayoutEClass, PanelLayout.class, "PanelLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanelLayout_ColumnSizes(), ecorePackage.getEString(), "columnSizes", null, 0, 1, PanelLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getMenu_EventHandler(), this.getEventHandler(), null, "eventHandler", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getColumn_EditableFlagSelector(), ecorePackage.getEString(), "editableFlagSelector", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_MultiDataBinding(), this.getAppDataBinding(), null, "multiDataBinding", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_MultidataKeySelector(), ecorePackage.getEString(), "multidataKeySelector", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_MultidataValueSelector(), ecorePackage.getEString(), "multidataValueSelector", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_MultidataPropertySelector(), ecorePackage.getEString(), "multidataPropertySelector", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Tooltip(), ecorePackage.getEString(), "tooltip", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ActiveFlagSelector(), ecorePackage.getEString(), "activeFlagSelector", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_FieldMaxLength(), ecorePackage.getEInt(), "fieldMaxLength", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getExecCommand_CustomTemplate(), this.getCustomTemplate(), null, "customTemplate", null, 0, 1, ExecCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecCommand_ExtraModels(), ecorePackage.getEObject(), null, "extraModels", null, 0, -1, ExecCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHandler_Command(), this.getCommand(), null, "command", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventHandler_EventType(), this.getEventTypes(), "eventType", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventHandler_SkipValidation(), ecorePackage.getEBoolean(), "skipValidation", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventHandler_MethodProtection(), this.getMethodProtectionTypes(), "methodProtection", "REJECT_SAME", 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetTargetActionEClass, WidgetTargetAction.class, "WidgetTargetAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandOnWidgetsEClass, CommandOnWidgets.class, "CommandOnWidgets", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandOnWidgets_TargetWidgets(), this.getWidget(), null, "targetWidgets", null, 1, -1, CommandOnWidgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogPanelEClass, DialogPanel.class, "DialogPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogPanel_Commands(), this.getCommandPanel(), null, "commands", null, 0, 1, DialogPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogPanel_MsgBoxes(), this.getMsgBoxPanel(), null, "msgBoxes", null, 0, -1, DialogPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getHeader_NomeCanale(), ecorePackage.getEString(), "nomeCanale", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_LinkCanale(), ecorePackage.getEString(), "linkCanale", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_NomeApplicativo(), ecorePackage.getEString(), "nomeApplicativo", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_Title(), ecorePackage.getEString(), "title", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeader_MetaAttributes(), this.getHeaderMetaAttr(), null, "metaAttributes", null, 0, -1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerMetaAttrEClass, HeaderMetaAttr.class, "HeaderMetaAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderMetaAttr_Name(), ecorePackage.getEString(), "name", null, 0, 1, HeaderMetaAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderMetaAttr_Value(), ecorePackage.getEString(), "value", null, 0, 1, HeaderMetaAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getTypedefs_Namespaces(), this.getTypeNamespace(), null, "namespaces", null, 0, -1, Typedefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedefs_ExtNamespaces(), this.getTypeNamespace(), null, "extNamespaces", null, 0, -1, Typedefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleType_Code(), this.getSimpleTypeCodes(), "code", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Nillable(), ecorePackage.getEBoolean(), "nillable", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_UserDefined(), ecorePackage.getEBoolean(), "userDefined", "false", 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_DataTypeModifiers(), ecorePackage.getEString(), "dataTypeModifiers", null, 0, -1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_EditHintMsg(), ecorePackage.getEString(), "editHintMsg", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexType_Fields(), this.getField(), null, "fields", null, 0, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexType_InitFields(), ecorePackage.getEBoolean(), "initFields", "false", 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_Extends(), this.getComplexType(), null, "extends", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_TypeAnnotation(), this.getTypeAnnotation(), null, "typeAnnotation", null, 0, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(complexTypeEClass, this.getField(), "getAllFields", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeAnnotationEClass, TypeAnnotation.class, "TypeAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeAnnotation_Language(), ecorePackage.getEString(), "language", null, 0, 1, TypeAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeAnnotation_Fqn(), ecorePackage.getEString(), "fqn", null, 0, 1, TypeAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedArrayEClass, TypedArray.class, "TypedArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedArray_ComponentType(), this.getType(), null, "componentType", null, 0, 1, TypedArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getType(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_DataTypeModifier(), ecorePackage.getEString(), "dataTypeModifier", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationDataDefsEClass, ApplicationDataDefs.class, "ApplicationDataDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationDataDefs_AppData(), this.getApplicationData(), null, "appData", null, 0, -1, ApplicationDataDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationDataDefs_Groups(), this.getAppDataGroup(), null, "groups", null, 0, -1, ApplicationDataDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationDataDefs_ExtGroups(), this.getAppDataGroup(), null, "extGroups", null, 0, -1, ApplicationDataDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getGridWidgetLayoutSpec_Vspan(), ecorePackage.getEInt(), "vspan", null, 0, 1, GridWidgetLayoutSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandPanelEClass, CommandPanel.class, "CommandPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandPanel_CmdStyle(), this.getCommandStyles(), "cmdStyle", null, 0, 1, CommandPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandPanel_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, CommandPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuPanelEClass, MenuPanel.class, "MenuPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuPanel_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, MenuPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hiddenValueEClass, HiddenValue.class, "HiddenValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDefinedWidgetEClass, UserDefinedWidget.class, "UserDefinedWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		initEReference(getSecurityModel_Roles(), this.getRole(), null, "roles", null, 0, -1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Code(), ecorePackage.getEString(), "code", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Roles(), this.getRole(), null, "roles", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getTargetPlatform_EnableRichUIBehavior(), ecorePackage.getEBoolean(), "enableRichUIBehavior", "false", 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPlatform_EnableFatClient(), ecorePackage.getEBoolean(), "enableFatClient", "false", 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_PortalProfiles(), this.getPortalProfile(), null, "portalProfiles", null, 0, -1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInfoPanelEClass, UserInfoPanel.class, "UserInfoPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDefinedPanelEClass, UserDefinedPanel.class, "UserDefinedPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wizardPanelEClass, WizardPanel.class, "WizardPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWizardPanel_NavigatorActive(), ecorePackage.getEBoolean(), "navigatorActive", "true", 0, 1, WizardPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizardPanel_Switcher(), this.getTabSwitcher(), null, "switcher", null, 0, 1, WizardPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appModuleEClass, AppModule.class, "AppModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, AppModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppModule_ContentPanels(), this.getContentPanel(), null, "contentPanels", null, 0, -1, AppModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppModule_ExtSecurityModel(), this.getSecurityModel(), null, "extSecurityModel", null, 0, 1, AppModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeNamespaceEClass, TypeNamespace.class, "TypeNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeNamespace_Types(), this.getType(), null, "types", null, 0, -1, TypeNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appDataGroupEClass, AppDataGroup.class, "AppDataGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppDataGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, AppDataGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppDataGroup_AppData(), this.getApplicationData(), null, "appData", null, 0, -1, AppDataGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msgBoxPanelEClass, MsgBoxPanel.class, "MsgBoxPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMsgBoxPanel_MessageSeverity(), this.getMessageSeverity(), "messageSeverity", null, 0, 1, MsgBoxPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMsgBoxPanel_TextMessages(), this.getPlainText(), null, "textMessages", null, 0, -1, MsgBoxPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nopCommandEClass, NOPCommand.class, "NOPCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetsPanelEClass, WidgetsPanel.class, "WidgetsPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetsPanel_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, WidgetsPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetsPanel_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, WidgetsPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetsPanel_Collapsible(), ecorePackage.getEBoolean(), "collapsible", "false", 0, 1, WidgetsPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenStateEClass, ScreenState.class, "ScreenState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScreenState_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScreenState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenState_WidgetsOn(), this.getWidget(), null, "widgetsOn", null, 0, -1, ScreenState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenState_WidgetsVisible(), this.getWidget(), null, "widgetsVisible", null, 0, -1, ScreenState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenStatesEClass, ScreenStates.class, "ScreenStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreenStates_States(), this.getScreenState(), null, "states", null, 0, -1, ScreenStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenStateCommandEClass, ScreenStateCommand.class, "ScreenStateCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreenStateCommand_GoTo(), this.getScreenState(), null, "goTo", null, 0, 1, ScreenStateCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shibbolethSSOEClass, ShibbolethSSO.class, "ShibbolethSSO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Code(), ecorePackage.getEString(), "code", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_DomainCode(), ecorePackage.getEString(), "domainCode", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleBasedSecurityConstraintEClass, RoleBasedSecurityConstraint.class, "RoleBasedSecurityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleBasedSecurityConstraint_Role(), this.getRole(), null, "role", null, 0, 1, RoleBasedSecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileUploadEClass, FileUpload.class, "FileUpload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabSwitcherEClass, TabSwitcher.class, "TabSwitcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panelDefEClass, PanelDef.class, "PanelDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanelDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_Panel(), this.getPanel(), null, "panel", null, 0, 1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_Params(), this.getPDefParam(), null, "params", null, 0, -1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_AppDataDefs(), this.getApplicationDataDefs(), null, "appDataDefs", null, 0, 1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_TypeDefs(), this.getTypedefs(), null, "typeDefs", null, 0, 1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_Roles(), this.getRole(), null, "roles", null, 0, -1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_Actors(), this.getActor(), null, "actors", null, 0, -1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_UseCases(), this.getUseCase(), null, "useCases", null, 0, -1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_OnRefreshCommand(), this.getCommand(), null, "onRefreshCommand", null, 0, 1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_States(), this.getPanelDefStates(), null, "states", null, 0, 1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDef_DefaultState(), this.getPanelDefState(), null, "defaultState", null, 0, 1, PanelDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pDefParamEClass, PDefParam.class, "PDefParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPDefParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, PDefParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appDataMappingParamEClass, AppDataMappingParam.class, "AppDataMappingParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppDataMappingParam_DefAppData(), this.getApplicationData(), null, "defAppData", null, 0, 1, AppDataMappingParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefMappingParamEClass, TypeDefMappingParam.class, "TypeDefMappingParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefMappingParam_DefTypeDef(), this.getType(), null, "defTypeDef", null, 0, 1, TypeDefMappingParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseMappingParamEClass, UseCaseMappingParam.class, "UseCaseMappingParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCaseMappingParam_DefUseCase(), this.getUseCase(), null, "defUseCase", null, 0, 1, UseCaseMappingParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleMappingParamEClass, RoleMappingParam.class, "RoleMappingParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleMappingParam_DefRole(), this.getRole(), null, "defRole", null, 0, 1, RoleMappingParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorMappingParamEClass, ActorMappingParam.class, "ActorMappingParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorMappingParam_DefActor(), this.getActor(), null, "defActor", null, 0, 1, ActorMappingParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelDefUseEClass, PanelDefUse.class, "PanelDefUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPanelDefUse_PanelDef(), this.getPanelDef(), null, "panelDef", null, 0, 1, PanelDefUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDefUse_Config(), this.getPDefUseConfig(), null, "config", null, 0, 1, PanelDefUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pDefParamValEClass, PDefParamVal.class, "PDefParamVal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDefParamVal_Param(), this.getPDefParam(), null, "param", null, 0, 1, PDefParamVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appDataMappingPDefValEClass, AppDataMappingPDefVal.class, "AppDataMappingPDefVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppDataMappingPDefVal_ActualAppData(), this.getApplicationData(), null, "actualAppData", null, 0, 1, AppDataMappingPDefVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefMappingPDefValEClass, TypeDefMappingPDefVal.class, "TypeDefMappingPDefVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefMappingPDefVal_ActualTypeDef(), this.getType(), null, "actualTypeDef", null, 0, 1, TypeDefMappingPDefVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucMappingPDefValEClass, UCMappingPDefVal.class, "UCMappingPDefVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUCMappingPDefVal_ActualUseCase(), this.getUseCase(), null, "actualUseCase", null, 0, 1, UCMappingPDefVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleMappingPDefValEClass, RoleMappingPDefVal.class, "RoleMappingPDefVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleMappingPDefVal_ActualRole(), this.getRole(), null, "actualRole", null, 0, 1, RoleMappingPDefVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorMappingPDefValEClass, ActorMappingPDefVal.class, "ActorMappingPDefVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorMappingPDefVal_ActualActor(), this.getActor(), null, "actualActor", null, 0, 1, ActorMappingPDefVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pDefUseConfigEClass, PDefUseConfig.class, "PDefUseConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDefUseConfig_ParamValues(), this.getPDefParamVal(), null, "paramValues", null, 0, -1, PDefUseConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationModelEClass, ActivationModel.class, "ActivationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivationModel_ActivationParams(), this.getActivationParam(), null, "activationParams", null, 0, -1, ActivationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationParamEClass, ActivationParam.class, "ActivationParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivationParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivationParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationParam_Type(), this.getSimpleType(), null, "type", null, 0, 1, ActivationParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beginEditCommandEClass, BeginEditCommand.class, "BeginEditCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeginEditCommand_DataEdited(), this.getApplicationData(), null, "dataEdited", null, 0, -1, BeginEditCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEditCommandEClass, EndEditCommand.class, "EndEditCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndEditCommand_DataEdited(), this.getApplicationData(), null, "dataEdited", null, 0, -1, EndEditCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndEditCommand_Undo(), ecorePackage.getEBoolean(), "undo", null, 0, 1, EndEditCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chkEditStatusCommandEClass, ChkEditStatusCommand.class, "ChkEditStatusCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChkEditStatusCommand_DataChecked(), this.getApplicationData(), null, "dataChecked", null, 0, -1, ChkEditStatusCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChkEditStatusCommand_CheckAggregation(), this.getLogicAggregationTypes(), "checkAggregation", "OR", 0, 1, ChkEditStatusCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChkEditStatusCommand_DoIfChanged(), this.getCommandOutcome(), null, "doIfChanged", null, 0, 1, ChkEditStatusCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChkEditStatusCommand_DoIfNotChanged(), this.getCommandOutcome(), null, "doIfNotChanged", null, 0, 1, ChkEditStatusCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelDefStateEClass, PanelDefState.class, "PanelDefState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanelDefState_Name(), ecorePackage.getEString(), "name", null, 0, 1, PanelDefState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDefState_WidgetsOn(), this.getWidget(), null, "widgetsOn", null, 0, -1, PanelDefState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanelDefState_WidgetsVisible(), this.getWidget(), null, "widgetsVisible", null, 0, -1, PanelDefState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pDefStateCommandEClass, PDefStateCommand.class, "PDefStateCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDefStateCommand_GoTo(), this.getPanelDefState(), null, "goTo", null, 0, 1, PDefStateCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDefStateCommand_PDefUse(), this.getPanelDefUse(), null, "pDefUse", null, 0, 1, PDefStateCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelDefStatesEClass, PanelDefStates.class, "PanelDefStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPanelDefStates_States(), this.getPanelDefState(), null, "states", null, 0, -1, PanelDefStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCustomizationParamEClass, TableCustomizationParam.class, "TableCustomizationParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableCustomizationParam_BaseTable(), this.getTable(), null, "baseTable", null, 0, 1, TableCustomizationParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extraColumnEClass, ExtraColumn.class, "ExtraColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtraColumn_InsertAfter(), this.getColumn(), null, "insertAfter", null, 0, 1, ExtraColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCustomizationPDefValEClass, TableCustomizationPDefVal.class, "TableCustomizationPDefVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableCustomizationPDefVal_ExtraCols(), this.getExtraColumn(), null, "extraCols", null, 0, -1, TableCustomizationPDefVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableCustomizationPDefVal_HiddenCols(), this.getColumn(), null, "hiddenCols", null, 0, -1, TableCustomizationPDefVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customCartridgeEClass, CustomCartridge.class, "CustomCartridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomCartridge_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomCartridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomCartridge_CrtID(), this.getCustomCartridgeID(), "crtID", null, 0, 1, CustomCartridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomCartridge_Templates(), this.getCustomTemplate(), null, "templates", null, 0, -1, CustomCartridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customTemplateEClass, CustomTemplate.class, "CustomTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomTemplate_TplID(), ecorePackage.getEString(), "tplID", null, 0, 1, CustomTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomTemplate_ModelSlots(), this.getModelSlotDef(), null, "modelSlots", null, 0, -1, CustomTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelSlotDefEClass, ModelSlotDef.class, "ModelSlotDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelSlotDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelSlotDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelSlotDef_ModelClass(), ecorePackage.getEString(), "modelClass", null, 0, 1, ModelSlotDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelSlotEClass, ModelSlot.class, "ModelSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelSlot_Def(), this.getModelSlotDef(), null, "def", null, 0, 1, ModelSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelSlot_Val(), ecorePackage.getEObject(), null, "val", null, 0, 1, ModelSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearAppdataCommandEClass, ClearAppdataCommand.class, "ClearAppdataCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearAppdataCommand_AppData(), this.getApplicationData(), null, "appData", null, 0, -1, ClearAppdataCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapViewEClass, MapView.class, "MapView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapView_MapId(), ecorePackage.getEString(), "mapId", null, 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapView_StartEnvelopeSpec(), this.getMapEnvelope(), null, "startEnvelopeSpec", null, 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapView_MaxEnvelopeSpec(), this.getMapEnvelope(), null, "maxEnvelopeSpec", null, 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapView_ScaleEnvelopeSpec(), this.getMapEnvelope(), null, "scaleEnvelopeSpec", null, 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapView_NumLevels(), ecorePackage.getEInt(), "numLevels", null, 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapView_EditDataBinding(), this.getAppDataBinding(), null, "editDataBinding", null, 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapView_Gadgets(), this.getMapViewGadgets(), null, "gadgets", null, 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapView_NoClickWhenDisabled(), ecorePackage.getEBoolean(), "noClickWhenDisabled", "true", 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapView_NoEditWhenDisabled(), ecorePackage.getEBoolean(), "noEditWhenDisabled", "true", 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapView_NoZoomWhenDisabled(), ecorePackage.getEBoolean(), "noZoomWhenDisabled", "false", 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapView_NoPanWhenDisabled(), ecorePackage.getEBoolean(), "noPanWhenDisabled", "false", 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEnvelopeEClass, MapEnvelope.class, "MapEnvelope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapEnvelope_NorthEast(), this.getPoint(), null, "northEast", null, 0, 1, MapEnvelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapEnvelope_SouthWest(), this.getPoint(), null, "southWest", null, 0, 1, MapEnvelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portalProfileEClass, PortalProfile.class, "PortalProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortalProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, PortalProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortalProfile_ResModules(), this.getWebResourceModule(), null, "resModules", null, 0, -1, PortalProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webResourceModuleEClass, WebResourceModule.class, "WebResourceModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebResourceModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, WebResourceModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebResourceModule_Version(), ecorePackage.getEString(), "version", null, 0, 1, WebResourceModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebResourceModule_DeploymentType(), this.getWebResModuleDeployTypes(), "deploymentType", null, 0, 1, WebResourceModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebResourceModule_RepartModule(), this.getRepartModule(), null, "repartModule", null, 0, 1, WebResourceModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stdWebResourceModuleEClass, StdWebResourceModule.class, "StdWebResourceModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStdWebResourceModule_StdName(), this.getStdWebResModuleNames(), "stdName", null, 0, 1, StdWebResourceModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repartArtifactEClass, RepartArtifact.class, "RepartArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepartArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, RepartArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepartArtifact_Type(), ecorePackage.getEString(), "type", null, 0, 1, RepartArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repartModuleEClass, RepartModule.class, "RepartModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepartModule_Organization(), ecorePackage.getEString(), "organization", null, 1, 1, RepartModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepartModule_Name(), ecorePackage.getEString(), "name", null, 1, 1, RepartModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepartModule_Version(), ecorePackage.getEString(), "version", null, 1, 1, RepartModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepartModule_Type(), this.getRepartModuleTypes(), "type", null, 1, 1, RepartModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepartModule_Artifacts(), this.getRepartArtifact(), null, "artifacts", null, 1, -1, RepartModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breadcrumbEClass, Breadcrumb.class, "Breadcrumb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapViewGadgetsEClass, MapViewGadgets.class, "MapViewGadgets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapViewGadgets_LayerSwitcher(), ecorePackage.getEBoolean(), "layerSwitcher", "false", 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_BackgroundMapMapServiceName(), ecorePackage.getEString(), "backgroundMapMapServiceName", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_BackgroundMapSwitcherLabel(), ecorePackage.getEString(), "backgroundMapSwitcherLabel", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_BackgroundPhotoAerialMapServiceName(), ecorePackage.getEString(), "backgroundPhotoAerialMapServiceName", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_BackgroundPhotoAerialSwitcherLabel(), ecorePackage.getEString(), "backgroundPhotoAerialSwitcherLabel", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_PointEditingActive(), ecorePackage.getEBoolean(), "pointEditingActive", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_LineEditingActive(), ecorePackage.getEBoolean(), "lineEditingActive", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_PolygonEditingActive(), ecorePackage.getEBoolean(), "polygonEditingActive", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewGadgets_ModifyEditingActive(), ecorePackage.getEBoolean(), "modifyEditingActive", null, 0, 1, MapViewGadgets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(methodProtectionTypesEEnum, MethodProtectionTypes.class, "MethodProtectionTypes");
		addEEnumLiteral(methodProtectionTypesEEnum, MethodProtectionTypes.REJECT_SAME);
		addEEnumLiteral(methodProtectionTypesEEnum, MethodProtectionTypes.ALLOW_ALL);
		addEEnumLiteral(methodProtectionTypesEEnum, MethodProtectionTypes.REJECT_ALL);

		initEEnum(eventTypesEEnum, EventTypes.class, "EventTypes");
		addEEnumLiteral(eventTypesEEnum, EventTypes.CLICKED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.VALUE_CHANGED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.FOCUS_GAINED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.FOCUS_LOST);
		addEEnumLiteral(eventTypesEEnum, EventTypes.KEY_PRESSED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.NODE_EXPANDED);
		addEEnumLiteral(eventTypesEEnum, EventTypes.EDIT_COMMITTED);

		initEEnum(dataLifetimeTypeEEnum, DataLifetimeType.class, "DataLifetimeType");
		addEEnumLiteral(dataLifetimeTypeEEnum, DataLifetimeType.USER_ACTION);
		addEEnumLiteral(dataLifetimeTypeEEnum, DataLifetimeType.USER_SESSION);
		addEEnumLiteral(dataLifetimeTypeEEnum, DataLifetimeType.SAME_PAGE);

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
		addEEnumLiteral(portalNamesEEnum, PortalNames.NEUTRAL);

		initEEnum(targetPlatformCodesEEnum, TargetPlatformCodes.class, "TargetPlatformCodes");
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.WLS92);
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.JBOSS43);

		initEEnum(messageSeverityEEnum, MessageSeverity.class, "MessageSeverity");
		addEEnumLiteral(messageSeverityEEnum, MessageSeverity.INFO);
		addEEnumLiteral(messageSeverityEEnum, MessageSeverity.WARN);
		addEEnumLiteral(messageSeverityEEnum, MessageSeverity.ERROR);

		initEEnum(commandStylesEEnum, CommandStyles.class, "CommandStyles");
		addEEnumLiteral(commandStylesEEnum, CommandStyles.FUNCTIONAL);
		addEEnumLiteral(commandStylesEEnum, CommandStyles.NAVIGATION);

		initEEnum(logicAggregationTypesEEnum, LogicAggregationTypes.class, "LogicAggregationTypes");
		addEEnumLiteral(logicAggregationTypesEEnum, LogicAggregationTypes.OR);
		addEEnumLiteral(logicAggregationTypesEEnum, LogicAggregationTypes.AND);
		addEEnumLiteral(logicAggregationTypesEEnum, LogicAggregationTypes.XOR);

		initEEnum(customCartridgeIDEEnum, CustomCartridgeID.class, "CustomCartridgeID");
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.PLATF_1);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.PLATF_2);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.PLATF_3);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.PLATF_4);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.PLATF_5);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.CUSTOM_1);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.CUSTOM_2);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.CUSTOM_3);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.TECH_1);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.TECH_2);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.TECH_3);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.TECH_4);
		addEEnumLiteral(customCartridgeIDEEnum, CustomCartridgeID.TECH_5);

		initEEnum(commandFunctionsEEnum, CommandFunctions.class, "CommandFunctions");
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.UNSPECIFIED);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.ADD_ITEM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.EDIT_ITEM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.DELETE_ITEM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.SEARCH);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.SAVE);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.LOAD);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.DETAIL);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.LOOKUP);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.NEXT_ITEM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.PREVIOUS_ITEM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.FIRST_ITEM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.LAST_ITEM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.CONFIRM);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.CANCEL);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.FORWARD);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.BACK);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.SHOW_REPORT);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.SHOW_HELP);
		addEEnumLiteral(commandFunctionsEEnum, CommandFunctions.SEND_MESSAGE);

		initEEnum(webResModuleDeployTypesEEnum, WebResModuleDeployTypes.class, "WebResModuleDeployTypes");
		addEEnumLiteral(webResModuleDeployTypesEEnum, WebResModuleDeployTypes.APPSERVER);
		addEEnumLiteral(webResModuleDeployTypesEEnum, WebResModuleDeployTypes.WEBSERVER_GLOBAL);
		addEEnumLiteral(webResModuleDeployTypesEEnum, WebResModuleDeployTypes.WEBSERVER_LOCAL);

		initEEnum(stdWebResModuleNamesEEnum, StdWebResModuleNames.class, "StdWebResModuleNames");
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.EXT_ALL);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.OPENLAYERS);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.EXTJSCSICORE);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.EXTJSCSIENRICHER);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.EXTJSCSIMDD);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.EXTLIBSTHEME);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.XSTRUCTURE);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.AREABRAND);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.EXTLIBSAREABRAND);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.OPENLAYERSTHEME);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.OPENLAYERSAREABRAND);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.ENRICHMENTS);
		addEEnumLiteral(stdWebResModuleNamesEEnum, StdWebResModuleNames.GLOBALINCLUSIONS);

		initEEnum(repartModuleTypesEEnum, RepartModuleTypes.class, "RepartModuleTypes");
		addEEnumLiteral(repartModuleTypesEEnum, RepartModuleTypes.JAVA);
		addEEnumLiteral(repartModuleTypesEEnum, RepartModuleTypes.WEBRES);
		addEEnumLiteral(repartModuleTypesEEnum, RepartModuleTypes.JAVASCRIPT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// logicpkg
		createLogicpkgAnnotations();
		// uipaneldoc
		createUipaneldocAnnotations();
		// uiwidgetdoc
		createUiwidgetdocAnnotations();
		// uilayoutdoc
		createUilayoutdocAnnotations();
	}

	/**
	 * Initializes the annotations for <b>logicpkg</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLogicpkgAnnotations() {
		String source = "logicpkg";				
		addAnnotation
		  (applicationAreaEClass, 
		   source, 
		   new String[] {
			 "pkg", "app"
		   });												
		addAnnotation
		  (menubarEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.menu"
		   });						
		addAnnotation
		  (contentPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });										
		addAnnotation
		  (panelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });									
		addAnnotation
		  (formPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });							
		addAnnotation
		  (multiPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });					
		addAnnotation
		  (tabSetPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });				
		addAnnotation
		  (widgetEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });												
		addAnnotation
		  (commandWidgetEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });			
		addAnnotation
		  (dataWidgetEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });								
		addAnnotation
		  (buttonEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });					
		addAnnotation
		  (textFieldEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });						
		addAnnotation
		  (textAreaEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });					
		addAnnotation
		  (widgetDataTypeEEnum, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });				
		addAnnotation
		  (calendarEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });				
		addAnnotation
		  (comboBoxEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });									
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });								
		addAnnotation
		  (checkBoxEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });																				
		addAnnotation
		  (radioButtonsEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });				
		addAnnotation
		  (radioButtonEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });					
		addAnnotation
		  (resetButtonEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });			
		addAnnotation
		  (confirmButtonEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });			
		addAnnotation
		  (panelLayoutEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });					
		addAnnotation
		  (horizontalFlowPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });				
		addAnnotation
		  (verticalFlowPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });				
		addAnnotation
		  (udlrcPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });			
		addAnnotation
		  (widgetLayoutSpecifierEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });			
		addAnnotation
		  (udlrcWidgetLayoutSpecEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });				
		addAnnotation
		  (udlrcSpecConstantsEEnum, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });			
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });				
		addAnnotation
		  (menuEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.menu"
		   });														
		addAnnotation
		  (columnModelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets.table"
		   });					
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets.table"
		   });																
		addAnnotation
		  (commandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (onoffCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (customCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });			
		addAnnotation
		  (visibilityCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (refreshViewCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });			
		addAnnotation
		  (jumpCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });					
		addAnnotation
		  (execCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });							
		addAnnotation
		  (eventHandlerEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.event"
		   });						
		addAnnotation
		  (methodProtectionTypesEEnum, 
		   source, 
		   new String[] {
			 "pkg", "ui.event"
		   });			
		addAnnotation
		  (eventTypesEEnum, 
		   source, 
		   new String[] {
			 "pkg", "ui.event"
		   });										
		addAnnotation
		  (commandOnWidgetsEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });					
		addAnnotation
		  (dialogPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });					
		addAnnotation
		  (showDialogCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (commandOutcomeEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });					
		addAnnotation
		  (commandOnPanelsEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });											
		addAnnotation
		  (appWindowEClass, 
		   source, 
		   new String[] {
			 "pkg", "app"
		   });							
		addAnnotation
		  (sequenceCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (jumpBackCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });			
		addAnnotation
		  (applicationDataEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.data"
		   });						
		addAnnotation
		  (dataLifetimeTypeEEnum, 
		   source, 
		   new String[] {
			 "pkg", "mdl.data"
		   });						
		addAnnotation
		  (appDataBindingEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.data"
		   });					
		addAnnotation
		  (multiDataWidgetEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });				
		addAnnotation
		  (typedefsEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });						
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });				
		addAnnotation
		  (simpleTypeEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });								
		addAnnotation
		  (complexTypeEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });					
		addAnnotation
		  (typedArrayEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });				
		addAnnotation
		  (simpleTypeCodesEEnum, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });				
		addAnnotation
		  (fieldEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });							
		addAnnotation
		  (applicationDataDefsEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.data"
		   });								
		addAnnotation
		  (treeViewEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });				
		addAnnotation
		  (plainTextEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });					
		addAnnotation
		  (menuViewEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });				
		addAnnotation
		  (gridPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });					
		addAnnotation
		  (gridWidgetLayoutSpecEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.layout"
		   });								
		addAnnotation
		  (commandPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });						
		addAnnotation
		  (menuPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });					
		addAnnotation
		  (userDefinedWidgetEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });			
		addAnnotation
		  (activateMultiPanelItemCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });					
		addAnnotation
		  (autenticationMethodEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });			
		addAnnotation
		  (uiSecurityConstraintEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });					
		addAnnotation
		  (ucBasedSecurityConstraintEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });				
		addAnnotation
		  (securityModelEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });								
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });					
		addAnnotation
		  (useCaseEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });					
		addAnnotation
		  (actorBasedSecurityConstraintEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });				
		addAnnotation
		  (customSecurityConstraintEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });				
		addAnnotation
		  (opauthssoEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });				
		addAnnotation
		  (ssobartssoEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });			
		addAnnotation
		  (customAuthenticationEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });				
		addAnnotation
		  (stdMessagePanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });						
		addAnnotation
		  (jumpExtCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });												
		addAnnotation
		  (userInfoPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });			
		addAnnotation
		  (userDefinedPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });				
		addAnnotation
		  (wizardPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });									
		addAnnotation
		  (typeNamespaceEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.types"
		   });					
		addAnnotation
		  (appDataGroupEClass, 
		   source, 
		   new String[] {
			 "pkg", "mdl.data"
		   });					
		addAnnotation
		  (msgBoxPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });					
		addAnnotation
		  (nopCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (widgetsPanelEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.panels"
		   });					
		addAnnotation
		  (screenStateEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.state"
		   });						
		addAnnotation
		  (screenStatesEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.state"
		   });			
		addAnnotation
		  (screenStateCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (shibbolethSSOEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });			
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });					
		addAnnotation
		  (roleBasedSecurityConstraintEClass, 
		   source, 
		   new String[] {
			 "pkg", "security"
		   });					
		addAnnotation
		  (fileUploadEClass, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });																			
		addAnnotation
		  (activationModelEClass, 
		   source, 
		   new String[] {
			 "pkg", "app"
		   });			
		addAnnotation
		  (activationParamEClass, 
		   source, 
		   new String[] {
			 "pkg", "app"
		   });			
		addAnnotation
		  (beginEditCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });				
		addAnnotation
		  (endEditCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });					
		addAnnotation
		  (chkEditStatusCommandEClass, 
		   source, 
		   new String[] {
			 "pkg", "cmd"
		   });																																				
		addAnnotation
		  (commandFunctionsEEnum, 
		   source, 
		   new String[] {
			 "pkg", "ui.widgets"
		   });																																									
	}

	/**
	 * Initializes the annotations for <b>uipaneldoc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUipaneldocAnnotations() {
		String source = "uipaneldoc";																																				
		addAnnotation
		  (formPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>FormPanel</b> &egrave; un pannello utilizzato principalmente per\r\ncreare la macro struttura della schermata. E\'un pannello destinato a \r\ncontenere altri pannelli con lo scopo di organizzarli in struttura secondo i vari\r\nlayout disponibili. <br/>\r\nIl <b>FormPanel</b> tipicamente si colloca:\r\n<ul>\r\n<li>come pannello principale (pi&ugrave; esterno) della schermata;</li>\r\n<li>come pannello principale del singolo quadrante all\'interno di un <b>FormPanel</b>\r\ncon layout a quadranti (UDLRC)</li>\r\n<li>come contenitore di ciascun <i>item</i> di un pannello a <i>tab</i>\r\no <i>wizard</i></li>\r\n<li>per ogni <i>item</i> di un <b>MultiPanel</b></li>\r\n</ul>\r\nIl <b>FormPanel</b> pu&ograve; essere dotato di <i>titolo</i>. Nel caso di\r\n<b>FormPanel</b> utilizzato all\'interno di un <b>TabSetPanel</b> tale titolo \r\n&egrave; utilizzato come etichetta del tab corrispondente, mentre nel caso in cui sia\r\nutilizzato all\'interno di un <b>WizardPanel</b> il titolo viene visualizzato come\r\nnome dello <i>step</i> corrispondente.\r\nIl <b>FormPanel</b> non pu&ograve; contenere widget, ma solo sottopannelli.\r\n</p>"
		   });							
		addAnnotation
		  (multiPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>MultiPanel</b> &egrave; un pannello utilizzato per realizzare pannelli <i>mutevoli</i>, ovvero che \r\nassumono programmaticamente le sembianze di uno tra <i>n</i> pannelli possibili. Esiste anche la \r\npossibilit&agrave; di non visualizzare nessun pannello: in quesot cao il <b>MultiPanel</b> non produce nessuna\r\nstruttura visualizzata. Il <b>MultiPanel</b> &egrave; lo strumento principale da utilizzare nel caso in cui sia \r\nnecessaria la scomparsa di un intero pannello (cosa che non &egravE; possibile realizzare esclusivamente\r\ncon i comandi di visibilit&agrave; sui <b>Widget</b>).\r\n<br/>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pannello disponibili.\r\n</p>"
		   });					
		addAnnotation
		  (tabSetPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>TabSetPanel</b> &egrave; un pannello utilizzato realizzare strutture organizzate\r\na <i>tab</i>. Prevede due sezioni visibili:\r\n<ol>\r\n<li>la lista di &quot; linguette &quot; che servono per attivare i vari <i>tab</i> \r\n(con evidenza visiva del tab correntemente selezionato)</li>\r\n<li>la sezione in cui viene visualizzato il contenuto del <i>tab</i> correntemente selezionato.</li>\r\n</ol>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pannello disponibili.\r\n</p>"
		   });																																																																																																																																																																																									
		addAnnotation
		  (dialogPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>DialogPanel</b> &egrave; un pannello utilizzato per realizzare funzioni di feedback utente\r\n(messaggi informativi, dichieste di conferme). E\'associato all\'intera schermata e, quando &egrave; \r\nattivato, mostra all\'utente i messaggi previsti sostituendo completamente la schermata operativa.\r\n<br/>\r\nAll\'interno del singolo tab &egrave; possibile inserire solo quelle tipologie di pannelli che servono per:\r\n<ul>\r\n<li>mostrare messaggi formattati all\'utente (<b>MsgBoxPanel</b>)</li>\r\n<li>fornire all\'utente i comandi per &quot;rispondere&quot; al feedback, ovvero uno o pi&ugrave;\r\npulsanti di conferma o cancellazione (<b>CommandPanel</b>)</li>\r\n</ul>\r\n</p>"
		   });																																																																																																													
		addAnnotation
		  (commandPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>CommandPanel</b> &egrave; un pannello utilizzato per realizzare pulsantiere,\r\novvero gruppi di <b>Button</b> destinati ad eseguire funzioni di business.\r\n<br/>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pulsanti disponibili.\r\n</p>"
		   });						
		addAnnotation
		  (menuPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>MenuPanel</b> &egrave; un pannello privo di visualizzazione grafica propria, da utilizzarsi\r\nesclusivamente per contenere il widget <b>MenuView</b>.\r\n</p>"
		   });																																																	
		addAnnotation
		  (stdMessagePanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nLo <b>stdMessagePanel</b> &egrave; un pannello di tipo informativo utilizzato per mostrare \r\nall\'utente eventuali messaggi di errore o informativi.\r\nSe, durante l\'elaborazione, si verificano degli errori oppure se la business logic inserisce dei messaggi\r\ninformativi il pannello mostra tali messaggi.\r\nSe invece non si verifica almeno una di queste due condizioni, il pannello non ha nessuna evidenza\r\ngrafica.\r\nLe tipologie di messaggio visualizzabili sono:\r\n<ul>\r\n<li>messaggi informativi</li>\r\n<li>messaggi di errore globali</li>\r\n<li>messaggi di errore relativi a campi specifici</li>\r\n</ul>\r\n<br/>\r\n</p>"
		   });																	
		addAnnotation
		  (userInfoPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nLo <b>UserInfoPanel</b> &egrave; un pannello utilizzato per visualizzare le informazioni\r\nrelative all\'utente selezionato, che tipicamente sono:\r\n<ol>\r\n<li>il nome ed il cognome dell\'utente</li>\r\n<li>il codice fiscale dell\'utente</li>\r\n<li>l\'ente di appartenenza</li>\r\n<li>il ruolo</li>\r\n</ol>\r\n<br/>\r\n</p>"
		   });						
		addAnnotation
		  (wizardPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>WizardPanel</b> &egrave; un pannello utilizzato realizzare strutture organizzate\r\na <i>wizard</i>:\r\nPrevede due sezioni visibili:\r\n<ol>\r\n<li>la lista di &quot; etichette &quot; che servono per attivare i vari <i>step</i> \r\n(con evidenza visiva dello step correntemente selezionato)</li>\r\n<li>la sezione in cui viene visualizzato il contenuto dello <i>step</i> corrente.</li>\r\n</ol>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pannello disponibili.\r\nIl <b>WizardPanel</b> pu&ograve; funzionare in tre differenti modalit&agrave;:\r\n<ol>\r\n<li>wizard <b>passivo</b>: la navigazione tra gli step deve essere comandata dalla business\r\nlogic (es. tasti di &quot;avanti&quot; o &quot;indietro&quot; all\'interno dello step)</li>\r\n<li>wizard <b>attivo</b>: la navigazione tra gli step pu&ograve; essere comandata sia dalla\r\nbusiness logic (es. tasti di &quot;avanti&quot; o &quot;indietro&quot; all\'interno dello step) sia\r\ntramite click sulle etichette dei vari step.</li>\r\n</ol>\r\n</p>"
		   });																	
		addAnnotation
		  (msgBoxPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>MsgBoxPanel</b> &egrave; un pannello utilizzabile per mostrare all\'utente\r\ndel testo in sola lettura, eventualmente formattato. Il testo pu&ograve; essere statico\r\n(definito a tempo di modellazione) o dinamico (calcolato a runtime).\r\nE\' il meccanismo preferenziale da utilizzare in tutti quei casi in cui non sia sufficiente\r\nutilizzare lo <b>StdMessagePanel</b>, che &egrave; orientato principalmente a brevi\r\nmessaggi testuali.\r\n<br/>\r\nData la natura del pannello, &egrave; possibile inserire esclusivamente dei widget di\r\nvisualizzazione di testo (<b>PlainText</b>).\r\n</p>"
		   });								
		addAnnotation
		  (widgetsPanelEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>widgetsPanel</b> &egrave; il pannello principale utilizzabile per la realizzazione di\r\n<i>form</i> di immissione/visualizzazione dati. Al suo interno &egrave; possibile inserire, secondo\r\ni vari layout disponibili, praticamente tutti i <b>Widget</b>. L\'effetto grafico &egrave; quello di un\r\ninsieme di widget organizzati verticalmente, orizzontalmente oppure a griglia. Ciascun\r\nwidget &egrave; dotato di label. Il pannello stesso pu&ograve;, opzionalmente, essere dotato di\r\n&quot;titolo&quot; che viene visualzzato in testa al pannello.\r\n<br/>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di widget disponibili, ad esclusione\r\ndel <b>MenuView</b> che deve invece essere obbligatoriamente inserito in un <b>MenuPanel</b>.\r\n</p>"
		   });																																																																																																																																		
	}

	/**
	 * Initializes the annotations for <b>uiwidgetdoc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUiwidgetdocAnnotations() {
		String source = "uiwidgetdoc";																																																																					
		addAnnotation
		  (buttonEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico pulsante di comando utilizzabile per comandare l\'esecuzione\r\ndelle varie funzioni applicative (ricerca, inserimento, verifica, conferma, ....)\r\nIl <b>Button</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)</li>\r\n<li>CommandPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario\r\nrealizzare una \"pulsantiera\" costituita da soli <b>Button</b></li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del Button prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la possibilit&agrave; di associare al pulsante uno <i>specificatore di funzione</i>,\r\nche pu&ograve; essere utilizzato per connotare la funzione che eseguir&agrave;\r\ntale pulsante, con l\'effetto, ad esempio di permettere l\'associazione di uno\r\nstile specifico o di un\'icona rappresentativa della funzone stessa.\r\nL\'elenco delle funzioni specificabili &egrave il seguente:\r\n\t<ul>\r\n\t<li>ADD_ITEM: aggiunta di un elemento ad un insieme di dati/tabella</li>\r\n\t<li>BACK: ritorno ad una schermata precedente</li>\r\n\t<li>CANCEL: risposta negativa ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>CONFIRM: risposta positiva ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>DELETE_ITEM: eliminazione di un elemento da un insieme di dati/tabella</li>\r\n\t<li>DETAIL: visualizzazione del dettaglio di una entit&agrave;</li>\r\n\t<li>EDIT_ITEM: inizio delle attivit&agrave; di modifica di un\'entit&agrave;</li>\r\n\t<li>FIRST_ITEM: posizionamento sul primo elemento di un elenco di dati</li>\r\n\t<li>FORWARD: prosecuzione al prossimo passo di una serie di passi guidati</li>\r\n\t<li>LAST_ITEM: posizionamento sull\'ultimo elemento di un elenco di dati</li>\r\n\t<li>LOAD: caricamento di un record</li>\r\n\t<li>NEXT_ITEM: posizionamento sul prossimo elemento di un elenco di dati</li>\r\n\t<li>PREVIOUS_ITEM: posizionamento sull\'elemento precedente a quello corrente\r\n\t\t all\'interno di un elenco di dati</li>\r\n\t<li>SAVE: salvataggio dei dati immessi</li>\r\n\t<li>SEARCH: effettuazione della ricerca</li>\r\n\t<li>SEND_MESSAGE: invio di un messaggio (es. email)</li>\r\n\t<li>SHOW_HELP: visualizzazione di una pagina di aiuto</li>\r\n\t<li>SHOW_REPORT: visualizzazione di un report</li>\r\n\t<li>UNSPECIFIED: funzione generica</li>\r\n\t</ul>\r\n</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>possibilit&agrave; di effettuare un refresh parziale della schermata \r\na fronte dell\'esecuzione del comando associato alla pressione del pulsante</li>\r\n</ul>",
			 "event-clicked", "<p>Il pulsante pu&ograve ricevere un evento di pressione da parte \r\ndell\'utente e, a fronte di questo evento &egrave; possibile eseguire logica\r\ndi business. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAlla pressione del pulsante viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla pressione del pulsante viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>"
		   });					
		addAnnotation
		  (textFieldEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico widget di immissione di dati testuali a riga singola.\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>TextField</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TextField prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di specificare il numero massimo di caratteri\r\naccettabili</li>\r\n<li>la possibilit&agrave; di specificare la dimensione massima dell\'area editabile\r\n(che &egrave; utilizzata in modi differenti a seconda della cartuccia/skin)</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (es. solo caratteri numerici per tipi numerici)</li>\r\n<li>verifiche client side al momento della digitazione di rispetto della dimensione massima del dato</li>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\nInoltre &egrave; possibile, se esplicitamente modellato, associare al <b>TextField</b> la\r\nfunzionalit&agrave; di <i>suggestion</i> che consiste nel fornire, man mano che si digitano i \r\ncaratteri nel campo di testo, una lista di voci che corrispondono nella loro parte iniziale alla stringa\r\ndi caratteri immessa fino a quel momento (la logica di costruzione progressiva della lista di \r\nsuggerimenti &egrave; a carico dello sviluppatore).",
			 "event-key-pressed", "<p>L\'evento <b>KeyPressed</b>, utilizzabile solo in modalit&agrave; ricca, \r\npermette di ottenere la funzione di <i>suggestion</i>\r\n</p>"
		   });						
		addAnnotation
		  (textAreaEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico widget di immissione di dati testuali a riga multipla.\r\nIl widget completo prevede una <i>label</i> ed l\'area di immissione associata.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nLa <b>TextArea</b> pu&ograve; essere utilizzata all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento: standard e ricca.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base della TextArea prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di specificare la dimensione in righe/colonne\r\ndell\'area editabile</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<!-- <li>verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (es. solo caratteri numerici per tipi numerici)</li>\r\n<li>verifiche client side al momento della digitazione di rispetto della dimensione massima del dato</li> -->\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>"
		   });								
		addAnnotation
		  (calendarEClass, 
		   source, 
		   new String[] {
			 "description", "E\' un campo utilizzabile per l\'immissione di date (nel formato gg/mm/aaaa).\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>Calendar</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del Calnedar prevede:\r\n<ul>\r\n<li>la limitazione automatica del numero di caratteri digitabili (gg/mm/aaa=10)</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (che deve necessariamente essere di tipo \"DATA\")</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>verifiche client side al momento della digitazione di aderenza dei caratteri immessi al tipo\r\ndi dato previsto (maschera GG/MM/AAAA)</li>\r\n<li><i>date-picker</i>: strumento di selezione della data a partire da mini-calendario</li>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>"
		   });				
		addAnnotation
		  (comboBoxEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il widget di selezione di uno (o pi&ugrave;) dati a partire da una lista di dati precaricata.\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>ComboBox</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TextField prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di specificare per ogni elemento della lista,\r\nun valore visualizzato e la corrispondente chiave, utilizzata come valore\r\neffettivamente seleizonato e utilizzabile dalla logica applicativa</li>\r\n<li>la scelta tra selezione singola o multipla</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>funzione di <i>autocomplete</i> (restrizione dell\'elenco di opzioni a fronte dell\'immissione \r\nprogressiva dei caratteri iniziali della selezione stessa)</li>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\n<!-- Inoltre &egrave; possibile, se esplicitamente modellato, associare alla <b>ComboBox</b> la\r\nfunzionalit&agrave; di <i>suggestion</i> che consiste nel fornire, man mano che si digitano i \r\ncaratteri nel campo di testo, una lista di voci che corrispondono nella loro parte iniziale alla stringa\r\ndi caratteri immessa fino a quel momento (la logica di costruzione progressiva della lista di \r\nsuggerimenti &egrave; a carico dello sviluppatore). -->",
			 "event-value-changed", "<p>E\'possibile, a fronte della selezione da parte dell\'utente di una delle\r\nopzioni presenti nella lista, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>"
		   });									
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico widget di visualizzazione/editing di dati in formato tabellare.\r\n<!--Il widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.-->\r\nLa <b>Table</b> pu&ograve; essere utilizzata all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia; N.B: deve\r\nessere l\'unico widget all\'interno del pannello</li>\r\n</ul>\r\nPrevede tre modalit&agrave; di funzionamento, una <i>standard/visualizzazione</i>,\r\nuna <i>standard/editing</i> ed una <i>ricca</i>.\r\n<h4>modalit&agrave; standard/visualizzazione</h4>\r\nIl funzionamento di base della Table prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di visualizzare le informazioni contenute in una \r\ncollezione di record, con formattazioen dell\'informazione coerente con il tipo di dato\r\ndi ciascuna colonna</li>\r\n<li>la possibilit&agrave; (opzionale) di effettuare l\'ordinamento delle righe in base ai valori\r\ncontenuti in una colonna</li>\r\n<li>la possibilit&agrave; (opzionale) di <b>paginare</b> i risultati (con dimensione della pagina impostabile)</li>\r\n<li>la possibilit&agrave; (opzionale) di effettuare l\'<b>export</b> dei dati della tabella in formato excel o pdf</li>\r\n<li>la possibilit&agrave; (opzionale) di <b>selezione</b> singola o multipla delle righe della Tabella, allo scopo\r\ndi eseguire logiche applicative sulle righe selezionate (l\'esecuzione della logica deve essere comandata in un momento\r\nsuccessivo alla selezione da un <b>Button</b> posto nella stessa schermata)</li>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso a seconda del tipo di dato associato \r\nal campo e di alcuni ulteriori specifiche</li>\r\n<li>la possibilit&agrave; di essere disabilitata a comando</li>\r\n<li>la possibilit&agrave; di essere resa invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitata/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<!--<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>-->\r\n</ul>\r\n<h4>modalit&agrave; standard/editing</h4>\r\nRipsetto alla modalit&agrave; <i>standard/visualizzazione</i> la modalit&agrave; <i>standard/editing</i>\r\nprevede alcune possibilit&agrave; aggiuntive:\r\n<ul>\r\n<li><b>editing <i>in place</i></b> delle celle di una colonna:\r\n\t<ul>\r\n\t<li>il <b>widget di editing</b> della cella dipende dal tipo di dato associato alla colonna:\r\n\t\t<ul>\r\n\t\t<li><b>Calendar</b> in caso di tipo DATA</li>\r\n\t\t<li><b>CheckBox</b> in caso di tipo BOOLEAN</li>\r\n\t\t<li><b>TextField</b> in tutti gli altri casi</li>\r\n\t\t</ul>\r\n\t</li>\r\n\t<li>&egrave; possibile selezionare il valore di una cella da una <b>lista di valori</b> (in questo caso il widget utilizzato\r\n\t\tper l\'immissione &egrave; la <b>ComboBox</b>); l\'elenco dei valori selezionabili pu&ograve; essere comune a tutte le\r\n\t\trighe oppure specifico per ciascuna riga\r\n\t</li>\r\n\t<li>&egrave; possibile, nell\'ambito di una colonna dichiarata <i>editabile</i>, decidere a runtime l\'editabilit&agrave;\r\n\t\tdella singola cella (nel qual caso il widget corrispondente apparir&agrave; disabilitato)\r\n\t</li>\r\n\t</ul>\r\n</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sull\'intestazione delle colonne</li>\r\n<li>refresh della sola area della tabella in caso di esecuzione delle funzioni di ordinamento e paginazione</li>\r\n<li>possibilit&agrave; di ridimensionare/cambiare l\'ordine/nascondere le colonne della tabella interattivamente</li>\r\n</ul>",
			 "event-clicked", "<p>In una tabella &egrave; possibile rendere \"attive\" le celle di alcune\r\ncolonne (purch\u00e8 esse non siano editabili). L\'evento \"clicked\" &egrave; proprio il \"click\" dell\'utente \r\nsu tali celle. \r\nE\'possibile, a fronte ddi questo evento, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAl click di una cella viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla click di una cella viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>"
		   });								
		addAnnotation
		  (checkBoxEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico widget di selezione di un valore booleano (si/no).\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>CheckBox</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del CheckBox prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (es . campo required)</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\n"
		   });																				
		addAnnotation
		  (radioButtonsEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico widget di selezione di una opzione tra un insieme finito (e definito a tempo di sviluppo) di possibilit&agrave;.\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato, che &egrave; a sua volta costituito\r\nda un elenco di pulsanti la cui selezione &egrave; mutualmente esclusiva.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>RadioButtons</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del RadioButtons prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (es. verifica di campo required)</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\n",
			 "event-clicked", "<p>E\'possibile, a fronte della selezione da parte dell\'utente di una delle opzioni visualizzate, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>"
		   });								
		addAnnotation
		  (resetButtonEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico pulsante di reset utilizzabile per ripulire la forma utente, riportandola allo stato \r\niniziale.\r\nIl <b>ResetButton</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)</li>\r\n<li>CommandPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario\r\nrealizzare una \"pulsantiera\" costituita da soli <b>Button</b></li>\r\n</ul>\r\nPrevede una sola modalit&agrave; di funzionamento: <i>standard</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del ResetButton prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la possibilit&agrave; di associare al pulsante uno <i>specificatore di funzione</i>,\r\nche pu&ograve; essere utilizzato per connotare la funzione che eseguir&agrave;\r\ntale pulsante, con l\'effetto, ad esempio di permettere l\'associazione di uno\r\nstile specifico o di un\'icona rappresentativa della funzone stessa.\r\nL\'elenco delle funzioni specificabili &egrave il seguente:\r\n\t<ul>\r\n\t<li>ADD_ITEM: aggiunta di un elemento ad un insieme di dati/tabella</li>\r\n\t<li>BACK: ritorno ad una schermata precedente</li>\r\n\t<li>CANCEL: risposta negativa ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>CONFIRM: risposta positiva ad una richiesta di conferma di esecuzione di comando</li>\r\n\t<li>DELETE_ITEM: eliminazione di un elemento da un insieme di dati/tabella</li>\r\n\t<li>DETAIL: visualizzazione del dettaglio di una entit&agrave;</li>\r\n\t<li>EDIT_ITEM: inizio delle attivit&agrave; di modifica di un\'entit&agrave;</li>\r\n\t<li>FIRST_ITEM: posizionamento sul primo elemento di un elenco di dati</li>\r\n\t<li>FORWARD: prosecuzione al prossimo passo di una serie di passi guidati</li>\r\n\t<li>LAST_ITEM: posizionamento sull\'ultimo elemento di un elenco di dati</li>\r\n\t<li>LOAD: caricamento di un record</li>\r\n\t<li>NEXT_ITEM: posizionamento sul prossimo elemento di un elenco di dati</li>\r\n\t<li>PREVIOUS_ITEM: posizionamento sull\'elemento precedente a quello corrente\r\n\t\t all\'interno di un elenco di dati</li>\r\n\t<li>SAVE: salvataggio dei dati immessi</li>\r\n\t<li>SEARCH: effettuazione della ricerca</li>\r\n\t<li>SEND_MESSAGE: invio di un messaggio (es. email)</li>\r\n\t<li>SHOW_HELP: visualizzazione di una pagina di aiuto</li>\r\n\t<li>SHOW_REPORT: visualizzazione di un report</li>\r\n\t<li>UNSPECIFIED: funzione generica</li>\r\n\t</ul>\r\n</li>\r\n</ul>\r\n",
			 "event-clicked", "<p>Il pulsante pu&ograve; ricevere un evento di pressione da parte \r\ndell\'utente che scatena il reset della schermata.\r\nQuesto evento &egrave; implicito (non occorre definire un <b>EventHandler</b>\r\nper attivarlo). A fronte di questo evento <b>non</b> &egrave; perci&ograve; \r\npossibile eseguire logica di business. \r\n</p>"
		   });																																																																																																																																																																																													
		addAnnotation
		  (treeViewEClass, 
		   source, 
		   new String[] {
			 "description", "E\' un widget utilizzabile per la visualizzazione di una struttura ad albero.\r\nIl <b>TreeView</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento: <i>standard</i> e <i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TreeView prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di visualizzare una struttura ad albero in termini di testo sintetico descrittivo\r\ndel contenuto di ciascun nodo.</li>\r\n<li>la possibilit&agrave; di espandere un nodo non foglia per mostrarne i nodi figli</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>",
			 "event-clicked", "<p>Il <b>TreeView</b> pu&ograve; ricevere un evento di pressione da parte \r\ndell\'utente che agisce in due modi a seconda che il nodo selezionato sia un nodo\r\nfoglia o intermedio.\r\n<ol>\r\n<li>in caso di nodo intermedio l\'evento &egrave; implicito (non occorre definire un \r\n<b>EventHandler</b>per attivarlo) e l\'effetto della selezione &egrave; l\'espansione \r\no la chiusura del nodo</li>\r\n<li>in caso di nodo foglia &egrave; possibile eseguire della logica server-side; tale\r\nlogica avr&agrave, a disposizione l\'informazione che permette di risalire al nodo selezionato.</li>\r\n</ol>\r\n</p>"
		   });				
		addAnnotation
		  (plainTextEClass, 
		   source, 
		   new String[] {
			 "description", "E\' un widget di visualizzazione di dati testuali.\r\nIl widget completo prevede una <i>label</i> ed il campo di visualizzazione associato, che\r\n&egrave; semplicemente il testo corrispondente al valore associato al widget\r\n(da qui il nome di <b>PlainText</b>).\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>TextField</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n<li>DialogPanel, per la visualizzazione del testo del dialog</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del PlainText prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\n"
		   });					
		addAnnotation
		  (menuViewEClass, 
		   source, 
		   new String[] {
			 "description", "Questo widget &egrave; un segnaposto utilizzabile per la visualizzazione della struttura\r\ndel menu. \r\nIl <b>MenuView</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>MenuPanel, con layout Verticale</li>\r\n</ul>\r\nPrevede una sola modalit&agrave; di funzionamento: <i>standard</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del TreeView prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n</ul>\r\nPer ciascuna voce di menu, inoltre &egrave; possibile replicare gli stessi comportamenti di \r\nvisibilit&agrave;/abilitazione.\r\n",
			 "event-clicked", "<p>Il <b>MenuView</b> pu&ograve; ricevere un evento di selezione della voce\r\ndi menu corrispondente, alla quale &egrave, possibile associare una logica\r\ndi business da eseguire.\r\n</p>"
		   });																																																																																																																																								
		addAnnotation
		  (fileUploadEClass, 
		   source, 
		   new String[] {
			 "description", "E\' il classico widget utilizzabile per la selezione di un <i>file</i> che dovr&agrave; essere inviato\r\nal server (funzione di <i>file upload</i>).\r\nIl <b>FileUpload</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia, nel caso sia necessario associare il\r\npulsante ad altri widget (es. pulsanti di lookup)</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento: <i>standard</i> e <i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del FileUpload prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di selezionare da file system un file mediante <i>browsing</i> sulle cartelle\r\nlocali alla postazione client</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>",
			 "event-clicked", "<p>Il widget <b>FileUpload</b> contiene un pulsante che pu&ograve; ricevere un evento di pressione \r\nda parte dell\'utente a fronte del quale viene visualizzato il <i>dialog</i> di selezione del file da sottomettere al\r\nserver. \r\nQuesto evento &egrave; implicito (non occorre definire un <b>EventHandler</b> per attivarlo). \r\nA fronte di questo evento <b>non</b> &egrave; per&ograve; possibile eseguire logica di business. \r\n</p>"
		   });																																																																																																										
	}

	/**
	 * Initializes the annotations for <b>uilayoutdoc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUilayoutdocAnnotations() {
		String source = "uilayoutdoc";																																																																																																																																									
		addAnnotation
		  (horizontalFlowPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nL\' <b>HorizontalFlowPanelLayout</b> (layout sequenziale a sviluppo\r\norizzontale) prevede che gli elementi contenuti nel pannello che possiede\r\nquesto layout siano visualizzati uno dopo l\'altro in una sequenza \r\norizzontale, all\'interno dell\'area disponibile per il pannello contenitore.\r\nDi fatto, se il numero di widget inseriti nel pannello &egrave; <i>n</i>, \r\nrappresenta un layout con <i>n</i> colonne logiche (una per widget) e\r\n<i>2*n</i> colonne fisiche (una per la label ed una per il campo effettivo, \r\nil tutto moltiplicato per il numero di widget).\r\nE\' possibile regolare le percentuali di occupazione della componente label\r\ne della componente widget di ciascuno dei widget.\r\nLe percentuali sono relative allo spazio a disposizione dell\'interno pannello.\r\n</p>"
		   });				
		addAnnotation
		  (verticalFlowPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>VerticalFlowPanelLayout</b> (layout sequenziale a sviluppo\r\nverticale) prevede che gli elementi contenuti nel pannello che possiede\r\nquesto layout siano visualizzati uno dopo l\'altro in una sequenza \r\nverticale, all\'interno dell\'area disponibile per il pannello contenitore.\r\nDi fatto rappresenta un layout ad una colonna logica (un solo widget) e\r\ndue colonne fisiche (una per la label ed una per il campo effettivo).\r\nE\' possibile regolare le percentuali di occupazione della componente label\r\ne della componente widget. Le percentuali sono relative allo spazio a\r\ndisposizione dell\'interno pannello.\r\n</p>"
		   });				
		addAnnotation
		  (udlrcPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nL\' <b>UDLRCPanelLayout</b> (layout a cinque quadranti Up, Down, Left,\r\nRight, Center)  prevede che gli elementi contenuti nel pannello che possiede\r\nquesto layout siano visualizzati in uno dei quadranti. realizzando in questo modo\r\nstutture di posizionamento relativo molto flessibili.\r\nTipicamente questo layout &egrave; utilizzato nella disposizione di sotto-pannelli.\r\nIl layout pu&ograve; anche essere utilizzato per la disposizione di pulsanti all\'interno\r\ndi un <b>CommandPanel</b>.\r\n</p>"
		   });																																																																																																																																																																																									
		addAnnotation
		  (gridPanelLayoutEClass, 
		   source, 
		   new String[] {
			 "description", "<p>\r\nIl <b>GridPanelLayout</b> (layout a grigia) &egrave; applicabile esclusivamente\r\nal pannello <b>WidgetsPanel</b> e prevede che gli elementi contenuti nel pannello\r\nche possiede questo layout (widget) siano visualizzati in una struttura a griglia.\r\nE\' necessario specificare le dimensioni orizzontali e verticali della griglia e ciascuna cella\r\ndella griglia pu&ograve; contenere al massimo un solo <b>Widget</b>.\r\nIn aggiunta un widget pu&ograve; estendersi orizzontalmente per pi&ugrave; di una cella\r\n(<i>hspan</i>),\r\nDi fatto, se il numero di colonne previste dal layout  &egrave; <i>n</i>, \r\noccorre tenere in considerazione una struttura costituita da <i>n</i> colonne logiche\r\ne <i>2*n</i> colonne fisiche (una per la label ed una per il campo effettivo, \r\nil tutto moltiplicato per il numero colonne logiche).\r\nE\' possibile regolare le percentuali di occupazione della componente label\r\ne della componente widget di ciascuna delle colonne logiche. \r\nLe percentuali sono relative allo spazio a disposizione dell\'interno pannello.\r\nNel clacolo occorre inoltre tenere in considerazione anche casi &quot; degeneri &quot; quali:\r\n<ul>\r\n<li>label non valorizzate</li>\r\n<li>span orizzontali maggiori di 1</li>\r\n</ul>\r\n</p>"
		   });																																																																																																																																																																																																																																														
	}

} //GuigenPackageImpl
