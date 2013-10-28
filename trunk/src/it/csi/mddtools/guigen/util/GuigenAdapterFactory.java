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
package it.csi.mddtools.guigen.util;

import it.csi.mddtools.guigen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage
 * @generated
 */
public class GuigenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuigenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GuigenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuigenSwitch<Adapter> modelSwitch =
		new GuigenSwitch<Adapter>() {
			@Override
			public Adapter caseApplicationArea(ApplicationArea object) {
				return createApplicationAreaAdapter();
			}
			@Override
			public Adapter caseMenubar(Menubar object) {
				return createMenubarAdapter();
			}
			@Override
			public Adapter caseStatusbar(Statusbar object) {
				return createStatusbarAdapter();
			}
			@Override
			public Adapter caseTitlebar(Titlebar object) {
				return createTitlebarAdapter();
			}
			@Override
			public Adapter caseContentPanel(ContentPanel object) {
				return createContentPanelAdapter();
			}
			@Override
			public Adapter casePanel(Panel object) {
				return createPanelAdapter();
			}
			@Override
			public Adapter caseFormPanel(FormPanel object) {
				return createFormPanelAdapter();
			}
			@Override
			public Adapter caseMultiPanel(MultiPanel object) {
				return createMultiPanelAdapter();
			}
			@Override
			public Adapter caseTabSetPanel(TabSetPanel object) {
				return createTabSetPanelAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseCommandWidget(CommandWidget object) {
				return createCommandWidgetAdapter();
			}
			@Override
			public Adapter caseDataWidget(DataWidget object) {
				return createDataWidgetAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseTextField(TextField object) {
				return createTextFieldAdapter();
			}
			@Override
			public Adapter caseTextArea(TextArea object) {
				return createTextAreaAdapter();
			}
			@Override
			public Adapter caseCalendar(Calendar object) {
				return createCalendarAdapter();
			}
			@Override
			public Adapter caseComboBox(ComboBox object) {
				return createComboBoxAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseGUIModel(GUIModel object) {
				return createGUIModelAdapter();
			}
			@Override
			public Adapter caseGUIStructure(GUIStructure object) {
				return createGUIStructureAdapter();
			}
			@Override
			public Adapter caseGUIBehaviors(GUIBehaviors object) {
				return createGUIBehaviorsAdapter();
			}
			@Override
			public Adapter caseRadioButtons(RadioButtons object) {
				return createRadioButtonsAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseResetButton(ResetButton object) {
				return createResetButtonAdapter();
			}
			@Override
			public Adapter caseConfirmButton(ConfirmButton object) {
				return createConfirmButtonAdapter();
			}
			@Override
			public Adapter casePanelLayout(PanelLayout object) {
				return createPanelLayoutAdapter();
			}
			@Override
			public Adapter caseHorizontalFlowPanelLayout(HorizontalFlowPanelLayout object) {
				return createHorizontalFlowPanelLayoutAdapter();
			}
			@Override
			public Adapter caseVerticalFlowPanelLayout(VerticalFlowPanelLayout object) {
				return createVerticalFlowPanelLayoutAdapter();
			}
			@Override
			public Adapter caseUDLRCPanelLayout(UDLRCPanelLayout object) {
				return createUDLRCPanelLayoutAdapter();
			}
			@Override
			public Adapter caseWidgetLayoutSpecifier(WidgetLayoutSpecifier object) {
				return createWidgetLayoutSpecifierAdapter();
			}
			@Override
			public Adapter caseUDLRCWidgetLayoutSpec(UDLRCWidgetLayoutSpec object) {
				return createUDLRCWidgetLayoutSpecAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuItem(MenuItem object) {
				return createMenuItemAdapter();
			}
			@Override
			public Adapter caseDisabledComponentSet(DisabledComponentSet object) {
				return createDisabledComponentSetAdapter();
			}
			@Override
			public Adapter caseColumnModel(ColumnModel object) {
				return createColumnModelAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseCommandEvent(CommandEvent object) {
				return createCommandEventAdapter();
			}
			@Override
			public Adapter caseONOFFCommand(ONOFFCommand object) {
				return createONOFFCommandAdapter();
			}
			@Override
			public Adapter caseCustomCommand(CustomCommand object) {
				return createCustomCommandAdapter();
			}
			@Override
			public Adapter caseVisibilityCommand(VisibilityCommand object) {
				return createVisibilityCommandAdapter();
			}
			@Override
			public Adapter caseRefreshViewCommand(RefreshViewCommand object) {
				return createRefreshViewCommandAdapter();
			}
			@Override
			public Adapter caseJumpCommand(JumpCommand object) {
				return createJumpCommandAdapter();
			}
			@Override
			public Adapter caseExecCommand(ExecCommand object) {
				return createExecCommandAdapter();
			}
			@Override
			public Adapter caseEventHandler(EventHandler object) {
				return createEventHandlerAdapter();
			}
			@Override
			public Adapter caseWidgetTargetAction(WidgetTargetAction object) {
				return createWidgetTargetActionAdapter();
			}
			@Override
			public Adapter caseCommandOnWidgets(CommandOnWidgets object) {
				return createCommandOnWidgetsAdapter();
			}
			@Override
			public Adapter caseDialogPanel(DialogPanel object) {
				return createDialogPanelAdapter();
			}
			@Override
			public Adapter caseShowDialogCommand(ShowDialogCommand object) {
				return createShowDialogCommandAdapter();
			}
			@Override
			public Adapter caseCommandOutcome(CommandOutcome object) {
				return createCommandOutcomeAdapter();
			}
			@Override
			public Adapter caseCommandOnPanels(CommandOnPanels object) {
				return createCommandOnPanelsAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseHeaderMetaAttr(HeaderMetaAttr object) {
				return createHeaderMetaAttrAdapter();
			}
			@Override
			public Adapter caseFooter(Footer object) {
				return createFooterAdapter();
			}
			@Override
			public Adapter caseAppWindow(AppWindow object) {
				return createAppWindowAdapter();
			}
			@Override
			public Adapter caseStaticLinks(StaticLinks object) {
				return createStaticLinksAdapter();
			}
			@Override
			public Adapter caseSequenceCommand(SequenceCommand object) {
				return createSequenceCommandAdapter();
			}
			@Override
			public Adapter caseJumpBackCommand(JumpBackCommand object) {
				return createJumpBackCommandAdapter();
			}
			@Override
			public Adapter caseApplicationData(ApplicationData object) {
				return createApplicationDataAdapter();
			}
			@Override
			public Adapter caseAppDataBinding(AppDataBinding object) {
				return createAppDataBindingAdapter();
			}
			@Override
			public Adapter caseMultiDataWidget(MultiDataWidget object) {
				return createMultiDataWidgetAdapter();
			}
			@Override
			public Adapter caseTypedefs(Typedefs object) {
				return createTypedefsAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseSimpleType(SimpleType object) {
				return createSimpleTypeAdapter();
			}
			@Override
			public Adapter caseComplexType(ComplexType object) {
				return createComplexTypeAdapter();
			}
			@Override
			public Adapter caseTypeAnnotation(TypeAnnotation object) {
				return createTypeAnnotationAdapter();
			}
			@Override
			public Adapter caseTypedArray(TypedArray object) {
				return createTypedArrayAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseApplicationDataDefs(ApplicationDataDefs object) {
				return createApplicationDataDefsAdapter();
			}
			@Override
			public Adapter caseTreeView(TreeView object) {
				return createTreeViewAdapter();
			}
			@Override
			public Adapter casePlainText(PlainText object) {
				return createPlainTextAdapter();
			}
			@Override
			public Adapter caseMenuView(MenuView object) {
				return createMenuViewAdapter();
			}
			@Override
			public Adapter caseGridPanelLayout(GridPanelLayout object) {
				return createGridPanelLayoutAdapter();
			}
			@Override
			public Adapter caseGridWidgetLayoutSpec(GridWidgetLayoutSpec object) {
				return createGridWidgetLayoutSpecAdapter();
			}
			@Override
			public Adapter caseCommandPanel(CommandPanel object) {
				return createCommandPanelAdapter();
			}
			@Override
			public Adapter caseMenuPanel(MenuPanel object) {
				return createMenuPanelAdapter();
			}
			@Override
			public Adapter caseHiddenValue(HiddenValue object) {
				return createHiddenValueAdapter();
			}
			@Override
			public Adapter caseUserDefinedWidget(UserDefinedWidget object) {
				return createUserDefinedWidgetAdapter();
			}
			@Override
			public Adapter caseActivateMultiPanelItemCommand(ActivateMultiPanelItemCommand object) {
				return createActivateMultiPanelItemCommandAdapter();
			}
			@Override
			public Adapter caseAutenticationMethod(AutenticationMethod object) {
				return createAutenticationMethodAdapter();
			}
			@Override
			public Adapter caseUISecurityConstraint(UISecurityConstraint object) {
				return createUISecurityConstraintAdapter();
			}
			@Override
			public Adapter caseUCBasedSecurityConstraint(UCBasedSecurityConstraint object) {
				return createUCBasedSecurityConstraintAdapter();
			}
			@Override
			public Adapter caseSecurityModel(SecurityModel object) {
				return createSecurityModelAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseUseCase(UseCase object) {
				return createUseCaseAdapter();
			}
			@Override
			public Adapter caseActorBasedSecurityConstraint(ActorBasedSecurityConstraint object) {
				return createActorBasedSecurityConstraintAdapter();
			}
			@Override
			public Adapter caseCustomSecurityConstraint(CustomSecurityConstraint object) {
				return createCustomSecurityConstraintAdapter();
			}
			@Override
			public Adapter caseOPAUTHSSO(OPAUTHSSO object) {
				return createOPAUTHSSOAdapter();
			}
			@Override
			public Adapter caseSSOBARTSSO(SSOBARTSSO object) {
				return createSSOBARTSSOAdapter();
			}
			@Override
			public Adapter caseCustomAuthentication(CustomAuthentication object) {
				return createCustomAuthenticationAdapter();
			}
			@Override
			public Adapter caseStdMessagePanel(StdMessagePanel object) {
				return createStdMessagePanelAdapter();
			}
			@Override
			public Adapter caseJumpExtCommand(JumpExtCommand object) {
				return createJumpExtCommandAdapter();
			}
			@Override
			public Adapter caseTargetPlatform(TargetPlatform object) {
				return createTargetPlatformAdapter();
			}
			@Override
			public Adapter caseUserInfoPanel(UserInfoPanel object) {
				return createUserInfoPanelAdapter();
			}
			@Override
			public Adapter caseUserDefinedPanel(UserDefinedPanel object) {
				return createUserDefinedPanelAdapter();
			}
			@Override
			public Adapter caseWizardPanel(WizardPanel object) {
				return createWizardPanelAdapter();
			}
			@Override
			public Adapter caseAppModule(AppModule object) {
				return createAppModuleAdapter();
			}
			@Override
			public Adapter caseTypeNamespace(TypeNamespace object) {
				return createTypeNamespaceAdapter();
			}
			@Override
			public Adapter caseAppDataGroup(AppDataGroup object) {
				return createAppDataGroupAdapter();
			}
			@Override
			public Adapter caseMsgBoxPanel(MsgBoxPanel object) {
				return createMsgBoxPanelAdapter();
			}
			@Override
			public Adapter caseNOPCommand(NOPCommand object) {
				return createNOPCommandAdapter();
			}
			@Override
			public Adapter caseWidgetsPanel(WidgetsPanel object) {
				return createWidgetsPanelAdapter();
			}
			@Override
			public Adapter caseScreenState(ScreenState object) {
				return createScreenStateAdapter();
			}
			@Override
			public Adapter caseScreenStates(ScreenStates object) {
				return createScreenStatesAdapter();
			}
			@Override
			public Adapter caseScreenStateCommand(ScreenStateCommand object) {
				return createScreenStateCommandAdapter();
			}
			@Override
			public Adapter caseShibbolethSSO(ShibbolethSSO object) {
				return createShibbolethSSOAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleBasedSecurityConstraint(RoleBasedSecurityConstraint object) {
				return createRoleBasedSecurityConstraintAdapter();
			}
			@Override
			public Adapter caseFileUpload(FileUpload object) {
				return createFileUploadAdapter();
			}
			@Override
			public Adapter caseTabSwitcher(TabSwitcher object) {
				return createTabSwitcherAdapter();
			}
			@Override
			public Adapter casePanelDef(PanelDef object) {
				return createPanelDefAdapter();
			}
			@Override
			public Adapter casePDefParam(PDefParam object) {
				return createPDefParamAdapter();
			}
			@Override
			public Adapter caseAppDataMappingParam(AppDataMappingParam object) {
				return createAppDataMappingParamAdapter();
			}
			@Override
			public Adapter caseTypeDefMappingParam(TypeDefMappingParam object) {
				return createTypeDefMappingParamAdapter();
			}
			@Override
			public Adapter caseUseCaseMappingParam(UseCaseMappingParam object) {
				return createUseCaseMappingParamAdapter();
			}
			@Override
			public Adapter caseRoleMappingParam(RoleMappingParam object) {
				return createRoleMappingParamAdapter();
			}
			@Override
			public Adapter caseActorMappingParam(ActorMappingParam object) {
				return createActorMappingParamAdapter();
			}
			@Override
			public Adapter casePanelDefUse(PanelDefUse object) {
				return createPanelDefUseAdapter();
			}
			@Override
			public Adapter casePDefParamVal(PDefParamVal object) {
				return createPDefParamValAdapter();
			}
			@Override
			public Adapter caseAppDataMappingPDefVal(AppDataMappingPDefVal object) {
				return createAppDataMappingPDefValAdapter();
			}
			@Override
			public Adapter caseTypeDefMappingPDefVal(TypeDefMappingPDefVal object) {
				return createTypeDefMappingPDefValAdapter();
			}
			@Override
			public Adapter caseUCMappingPDefVal(UCMappingPDefVal object) {
				return createUCMappingPDefValAdapter();
			}
			@Override
			public Adapter caseRoleMappingPDefVal(RoleMappingPDefVal object) {
				return createRoleMappingPDefValAdapter();
			}
			@Override
			public Adapter caseActorMappingPDefVal(ActorMappingPDefVal object) {
				return createActorMappingPDefValAdapter();
			}
			@Override
			public Adapter casePDefUseConfig(PDefUseConfig object) {
				return createPDefUseConfigAdapter();
			}
			@Override
			public Adapter caseActivationModel(ActivationModel object) {
				return createActivationModelAdapter();
			}
			@Override
			public Adapter caseActivationParam(ActivationParam object) {
				return createActivationParamAdapter();
			}
			@Override
			public Adapter caseBeginEditCommand(BeginEditCommand object) {
				return createBeginEditCommandAdapter();
			}
			@Override
			public Adapter caseEndEditCommand(EndEditCommand object) {
				return createEndEditCommandAdapter();
			}
			@Override
			public Adapter caseChkEditStatusCommand(ChkEditStatusCommand object) {
				return createChkEditStatusCommandAdapter();
			}
			@Override
			public Adapter casePanelDefState(PanelDefState object) {
				return createPanelDefStateAdapter();
			}
			@Override
			public Adapter casePDefStateCommand(PDefStateCommand object) {
				return createPDefStateCommandAdapter();
			}
			@Override
			public Adapter casePanelDefStates(PanelDefStates object) {
				return createPanelDefStatesAdapter();
			}
			@Override
			public Adapter caseTableCustomizationParam(TableCustomizationParam object) {
				return createTableCustomizationParamAdapter();
			}
			@Override
			public Adapter caseExtraColumn(ExtraColumn object) {
				return createExtraColumnAdapter();
			}
			@Override
			public Adapter caseTableCustomizationPDefVal(TableCustomizationPDefVal object) {
				return createTableCustomizationPDefValAdapter();
			}
			@Override
			public Adapter caseCustomCartridge(CustomCartridge object) {
				return createCustomCartridgeAdapter();
			}
			@Override
			public Adapter caseCustomTemplate(CustomTemplate object) {
				return createCustomTemplateAdapter();
			}
			@Override
			public Adapter caseModelSlotDef(ModelSlotDef object) {
				return createModelSlotDefAdapter();
			}
			@Override
			public Adapter caseModelSlot(ModelSlot object) {
				return createModelSlotAdapter();
			}
			@Override
			public Adapter caseClearAppdataCommand(ClearAppdataCommand object) {
				return createClearAppdataCommandAdapter();
			}
			@Override
			public Adapter caseMapView(MapView object) {
				return createMapViewAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseMapEnvelope(MapEnvelope object) {
				return createMapEnvelopeAdapter();
			}
			@Override
			public Adapter casePortalProfile(PortalProfile object) {
				return createPortalProfileAdapter();
			}
			@Override
			public Adapter caseWebResourceModule(WebResourceModule object) {
				return createWebResourceModuleAdapter();
			}
			@Override
			public Adapter caseStdWebResourceModule(StdWebResourceModule object) {
				return createStdWebResourceModuleAdapter();
			}
			@Override
			public Adapter caseRepartArtifact(RepartArtifact object) {
				return createRepartArtifactAdapter();
			}
			@Override
			public Adapter caseRepartModule(RepartModule object) {
				return createRepartModuleAdapter();
			}
			@Override
			public Adapter caseBreadcrumb(Breadcrumb object) {
				return createBreadcrumbAdapter();
			}
			@Override
			public Adapter caseMapViewGadgets(MapViewGadgets object) {
				return createMapViewGadgetsAdapter();
			}
			@Override
			public Adapter casePortalExposition(PortalExposition object) {
				return createPortalExpositionAdapter();
			}
			@Override
			public Adapter caseCPCommand(CPCommand object) {
				return createCPCommandAdapter();
			}
			@Override
			public Adapter caseCPCommands(CPCommands object) {
				return createCPCommandsAdapter();
			}
			@Override
			public Adapter caseSecurityProfile(SecurityProfile object) {
				return createSecurityProfileAdapter();
			}
			@Override
			public Adapter caseExternalAuthenticationGuard(ExternalAuthenticationGuard object) {
				return createExternalAuthenticationGuardAdapter();
			}
			@Override
			public Adapter caseInternalAuthenticationGuard(InternalAuthenticationGuard object) {
				return createInternalAuthenticationGuardAdapter();
			}
			@Override
			public Adapter caseWAYFRequestAdapter(WAYFRequestAdapter object) {
				return createWAYFRequestAdapterAdapter();
			}
			@Override
			public Adapter caseWAYFProfile(WAYFProfile object) {
				return createWAYFProfileAdapter();
			}
			@Override
			public Adapter caseLoginUI(LoginUI object) {
				return createLoginUIAdapter();
			}
			@Override
			public Adapter caseLoginModule(LoginModule object) {
				return createLoginModuleAdapter();
			}
			@Override
			public Adapter caseIdentityAdapter(IdentityAdapter object) {
				return createIdentityAdapterAdapter();
			}
			@Override
			public Adapter caseEnvConfigParam(EnvConfigParam object) {
				return createEnvConfigParamAdapter();
			}
			@Override
			public Adapter caseEnvConfigParams(EnvConfigParams object) {
				return createEnvConfigParamsAdapter();
			}
			@Override
			public Adapter casePEPImplementation(PEPImplementation object) {
				return createPEPImplementationAdapter();
			}
			@Override
			public Adapter caseInlineCodeSnippet(InlineCodeSnippet object) {
				return createInlineCodeSnippetAdapter();
			}
			@Override
			public Adapter caseAnnotatedElement(AnnotatedElement object) {
				return createAnnotatedElementAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationDetail(AnnotationDetail object) {
				return createAnnotationDetailAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ApplicationArea <em>Application Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ApplicationArea
	 * @generated
	 */
	public Adapter createApplicationAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Menubar <em>Menubar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Menubar
	 * @generated
	 */
	public Adapter createMenubarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Statusbar <em>Statusbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Statusbar
	 * @generated
	 */
	public Adapter createStatusbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Titlebar <em>Titlebar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Titlebar
	 * @generated
	 */
	public Adapter createTitlebarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ContentPanel <em>Content Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ContentPanel
	 * @generated
	 */
	public Adapter createContentPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.FormPanel <em>Form Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.FormPanel
	 * @generated
	 */
	public Adapter createFormPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TabSetPanel <em>Tab Set Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TabSetPanel
	 * @generated
	 */
	public Adapter createTabSetPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CommandWidget <em>Command Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CommandWidget
	 * @generated
	 */
	public Adapter createCommandWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.DataWidget <em>Data Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.DataWidget
	 * @generated
	 */
	public Adapter createDataWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TextField
	 * @generated
	 */
	public Adapter createTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TextArea
	 * @generated
	 */
	public Adapter createTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ComboBox
	 * @generated
	 */
	public Adapter createComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.GUIModel <em>GUI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.GUIModel
	 * @generated
	 */
	public Adapter createGUIModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.GUIStructure <em>GUI Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.GUIStructure
	 * @generated
	 */
	public Adapter createGUIStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.GUIBehaviors <em>GUI Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.GUIBehaviors
	 * @generated
	 */
	public Adapter createGUIBehaviorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RadioButtons <em>Radio Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RadioButtons
	 * @generated
	 */
	public Adapter createRadioButtonsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ResetButton <em>Reset Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ResetButton
	 * @generated
	 */
	public Adapter createResetButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ConfirmButton <em>Confirm Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ConfirmButton
	 * @generated
	 */
	public Adapter createConfirmButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PanelLayout <em>Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PanelLayout
	 * @generated
	 */
	public Adapter createPanelLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.HorizontalFlowPanelLayout <em>Horizontal Flow Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.HorizontalFlowPanelLayout
	 * @generated
	 */
	public Adapter createHorizontalFlowPanelLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.VerticalFlowPanelLayout <em>Vertical Flow Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.VerticalFlowPanelLayout
	 * @generated
	 */
	public Adapter createVerticalFlowPanelLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UDLRCPanelLayout <em>UDLRC Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UDLRCPanelLayout
	 * @generated
	 */
	public Adapter createUDLRCPanelLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.WidgetLayoutSpecifier <em>Widget Layout Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.WidgetLayoutSpecifier
	 * @generated
	 */
	public Adapter createWidgetLayoutSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec <em>UDLRC Widget Layout Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec
	 * @generated
	 */
	public Adapter createUDLRCWidgetLayoutSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.DisabledComponentSet <em>Disabled Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.DisabledComponentSet
	 * @generated
	 */
	public Adapter createDisabledComponentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ColumnModel <em>Column Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ColumnModel
	 * @generated
	 */
	public Adapter createColumnModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CommandEvent
	 * @generated
	 */
	public Adapter createCommandEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ONOFFCommand <em>ONOFF Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ONOFFCommand
	 * @generated
	 */
	public Adapter createONOFFCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CustomCommand <em>Custom Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CustomCommand
	 * @generated
	 */
	public Adapter createCustomCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.VisibilityCommand <em>Visibility Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.VisibilityCommand
	 * @generated
	 */
	public Adapter createVisibilityCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RefreshViewCommand <em>Refresh View Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RefreshViewCommand
	 * @generated
	 */
	public Adapter createRefreshViewCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.JumpCommand <em>Jump Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.JumpCommand
	 * @generated
	 */
	public Adapter createJumpCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ExecCommand <em>Exec Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ExecCommand
	 * @generated
	 */
	public Adapter createExecCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.EventHandler
	 * @generated
	 */
	public Adapter createEventHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.WidgetTargetAction <em>Widget Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.WidgetTargetAction
	 * @generated
	 */
	public Adapter createWidgetTargetActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CommandOnWidgets <em>Command On Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CommandOnWidgets
	 * @generated
	 */
	public Adapter createCommandOnWidgetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.DialogPanel <em>Dialog Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.DialogPanel
	 * @generated
	 */
	public Adapter createDialogPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ShowDialogCommand <em>Show Dialog Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ShowDialogCommand
	 * @generated
	 */
	public Adapter createShowDialogCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CommandOutcome <em>Command Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CommandOutcome
	 * @generated
	 */
	public Adapter createCommandOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CommandOnPanels <em>Command On Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CommandOnPanels
	 * @generated
	 */
	public Adapter createCommandOnPanelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.HeaderMetaAttr <em>Header Meta Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.HeaderMetaAttr
	 * @generated
	 */
	public Adapter createHeaderMetaAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Footer <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Footer
	 * @generated
	 */
	public Adapter createFooterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AppWindow <em>App Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AppWindow
	 * @generated
	 */
	public Adapter createAppWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.StaticLinks <em>Static Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.StaticLinks
	 * @generated
	 */
	public Adapter createStaticLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.SequenceCommand <em>Sequence Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.SequenceCommand
	 * @generated
	 */
	public Adapter createSequenceCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.JumpBackCommand <em>Jump Back Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.JumpBackCommand
	 * @generated
	 */
	public Adapter createJumpBackCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ApplicationData <em>Application Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ApplicationData
	 * @generated
	 */
	public Adapter createApplicationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AppDataBinding <em>App Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AppDataBinding
	 * @generated
	 */
	public Adapter createAppDataBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MultiDataWidget <em>Multi Data Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MultiDataWidget
	 * @generated
	 */
	public Adapter createMultiDataWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Typedefs <em>Typedefs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Typedefs
	 * @generated
	 */
	public Adapter createTypedefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.SimpleType
	 * @generated
	 */
	public Adapter createSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TypeAnnotation <em>Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TypeAnnotation
	 * @generated
	 */
	public Adapter createTypeAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TypedArray <em>Typed Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TypedArray
	 * @generated
	 */
	public Adapter createTypedArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ApplicationDataDefs <em>Application Data Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ApplicationDataDefs
	 * @generated
	 */
	public Adapter createApplicationDataDefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TreeView <em>Tree View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TreeView
	 * @generated
	 */
	public Adapter createTreeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PlainText <em>Plain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PlainText
	 * @generated
	 */
	public Adapter createPlainTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MenuView
	 * @generated
	 */
	public Adapter createMenuViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.GridPanelLayout <em>Grid Panel Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.GridPanelLayout
	 * @generated
	 */
	public Adapter createGridPanelLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.GridWidgetLayoutSpec <em>Grid Widget Layout Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.GridWidgetLayoutSpec
	 * @generated
	 */
	public Adapter createGridWidgetLayoutSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CommandPanel <em>Command Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CommandPanel
	 * @generated
	 */
	public Adapter createCommandPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MenuPanel <em>Menu Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MenuPanel
	 * @generated
	 */
	public Adapter createMenuPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.HiddenValue <em>Hidden Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.HiddenValue
	 * @generated
	 */
	public Adapter createHiddenValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UserDefinedWidget <em>User Defined Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UserDefinedWidget
	 * @generated
	 */
	public Adapter createUserDefinedWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MultiPanel <em>Multi Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MultiPanel
	 * @generated
	 */
	public Adapter createMultiPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand <em>Activate Multi Panel Item Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ActivateMultiPanelItemCommand
	 * @generated
	 */
	public Adapter createActivateMultiPanelItemCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AutenticationMethod <em>Autentication Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AutenticationMethod
	 * @generated
	 */
	public Adapter createAutenticationMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UISecurityConstraint <em>UI Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UISecurityConstraint
	 * @generated
	 */
	public Adapter createUISecurityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UCBasedSecurityConstraint <em>UC Based Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UCBasedSecurityConstraint
	 * @generated
	 */
	public Adapter createUCBasedSecurityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.SecurityModel <em>Security Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.SecurityModel
	 * @generated
	 */
	public Adapter createSecurityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ActorBasedSecurityConstraint <em>Actor Based Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ActorBasedSecurityConstraint
	 * @generated
	 */
	public Adapter createActorBasedSecurityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CustomSecurityConstraint <em>Custom Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CustomSecurityConstraint
	 * @generated
	 */
	public Adapter createCustomSecurityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.OPAUTHSSO <em>OPAUTHSSO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.OPAUTHSSO
	 * @generated
	 */
	public Adapter createOPAUTHSSOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.SSOBARTSSO <em>SSOBARTSSO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.SSOBARTSSO
	 * @generated
	 */
	public Adapter createSSOBARTSSOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CustomAuthentication <em>Custom Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CustomAuthentication
	 * @generated
	 */
	public Adapter createCustomAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.StdMessagePanel <em>Std Message Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.StdMessagePanel
	 * @generated
	 */
	public Adapter createStdMessagePanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.JumpExtCommand <em>Jump Ext Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.JumpExtCommand
	 * @generated
	 */
	public Adapter createJumpExtCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TargetPlatform
	 * @generated
	 */
	public Adapter createTargetPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UserInfoPanel <em>User Info Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UserInfoPanel
	 * @generated
	 */
	public Adapter createUserInfoPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UserDefinedPanel <em>User Defined Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UserDefinedPanel
	 * @generated
	 */
	public Adapter createUserDefinedPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.WizardPanel <em>Wizard Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.WizardPanel
	 * @generated
	 */
	public Adapter createWizardPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AppModule <em>App Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AppModule
	 * @generated
	 */
	public Adapter createAppModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TypeNamespace <em>Type Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TypeNamespace
	 * @generated
	 */
	public Adapter createTypeNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AppDataGroup <em>App Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AppDataGroup
	 * @generated
	 */
	public Adapter createAppDataGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MsgBoxPanel <em>Msg Box Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MsgBoxPanel
	 * @generated
	 */
	public Adapter createMsgBoxPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.NOPCommand <em>NOP Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.NOPCommand
	 * @generated
	 */
	public Adapter createNOPCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.WidgetsPanel <em>Widgets Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.WidgetsPanel
	 * @generated
	 */
	public Adapter createWidgetsPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ScreenState <em>Screen State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ScreenState
	 * @generated
	 */
	public Adapter createScreenStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ScreenStates <em>Screen States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ScreenStates
	 * @generated
	 */
	public Adapter createScreenStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ScreenStateCommand <em>Screen State Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ScreenStateCommand
	 * @generated
	 */
	public Adapter createScreenStateCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ShibbolethSSO <em>Shibboleth SSO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ShibbolethSSO
	 * @generated
	 */
	public Adapter createShibbolethSSOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RoleBasedSecurityConstraint <em>Role Based Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RoleBasedSecurityConstraint
	 * @generated
	 */
	public Adapter createRoleBasedSecurityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.FileUpload <em>File Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.FileUpload
	 * @generated
	 */
	public Adapter createFileUploadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TabSwitcher <em>Tab Switcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TabSwitcher
	 * @generated
	 */
	public Adapter createTabSwitcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PanelDef <em>Panel Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PanelDef
	 * @generated
	 */
	public Adapter createPanelDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PDefParam <em>PDef Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PDefParam
	 * @generated
	 */
	public Adapter createPDefParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AppDataMappingParam <em>App Data Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AppDataMappingParam
	 * @generated
	 */
	public Adapter createAppDataMappingParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TypeDefMappingParam <em>Type Def Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TypeDefMappingParam
	 * @generated
	 */
	public Adapter createTypeDefMappingParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UseCaseMappingParam <em>Use Case Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UseCaseMappingParam
	 * @generated
	 */
	public Adapter createUseCaseMappingParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RoleMappingParam <em>Role Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RoleMappingParam
	 * @generated
	 */
	public Adapter createRoleMappingParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ActorMappingParam <em>Actor Mapping Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ActorMappingParam
	 * @generated
	 */
	public Adapter createActorMappingParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PanelDefUse <em>Panel Def Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PanelDefUse
	 * @generated
	 */
	public Adapter createPanelDefUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PDefParamVal <em>PDef Param Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PDefParamVal
	 * @generated
	 */
	public Adapter createPDefParamValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AppDataMappingPDefVal <em>App Data Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AppDataMappingPDefVal
	 * @generated
	 */
	public Adapter createAppDataMappingPDefValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TypeDefMappingPDefVal <em>Type Def Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TypeDefMappingPDefVal
	 * @generated
	 */
	public Adapter createTypeDefMappingPDefValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.UCMappingPDefVal <em>UC Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.UCMappingPDefVal
	 * @generated
	 */
	public Adapter createUCMappingPDefValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RoleMappingPDefVal <em>Role Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RoleMappingPDefVal
	 * @generated
	 */
	public Adapter createRoleMappingPDefValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ActorMappingPDefVal <em>Actor Mapping PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ActorMappingPDefVal
	 * @generated
	 */
	public Adapter createActorMappingPDefValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PDefUseConfig <em>PDef Use Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PDefUseConfig
	 * @generated
	 */
	public Adapter createPDefUseConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ActivationModel <em>Activation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ActivationModel
	 * @generated
	 */
	public Adapter createActivationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ActivationParam <em>Activation Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ActivationParam
	 * @generated
	 */
	public Adapter createActivationParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.BeginEditCommand <em>Begin Edit Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.BeginEditCommand
	 * @generated
	 */
	public Adapter createBeginEditCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.EndEditCommand <em>End Edit Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.EndEditCommand
	 * @generated
	 */
	public Adapter createEndEditCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ChkEditStatusCommand <em>Chk Edit Status Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ChkEditStatusCommand
	 * @generated
	 */
	public Adapter createChkEditStatusCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PanelDefState <em>Panel Def State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PanelDefState
	 * @generated
	 */
	public Adapter createPanelDefStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PDefStateCommand <em>PDef State Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PDefStateCommand
	 * @generated
	 */
	public Adapter createPDefStateCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PanelDefStates <em>Panel Def States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PanelDefStates
	 * @generated
	 */
	public Adapter createPanelDefStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TableCustomizationParam <em>Table Customization Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TableCustomizationParam
	 * @generated
	 */
	public Adapter createTableCustomizationParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ExtraColumn <em>Extra Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ExtraColumn
	 * @generated
	 */
	public Adapter createExtraColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.TableCustomizationPDefVal <em>Table Customization PDef Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.TableCustomizationPDefVal
	 * @generated
	 */
	public Adapter createTableCustomizationPDefValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CustomCartridge <em>Custom Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CustomCartridge
	 * @generated
	 */
	public Adapter createCustomCartridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CustomTemplate <em>Custom Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CustomTemplate
	 * @generated
	 */
	public Adapter createCustomTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ModelSlotDef <em>Model Slot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ModelSlotDef
	 * @generated
	 */
	public Adapter createModelSlotDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ModelSlot <em>Model Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ModelSlot
	 * @generated
	 */
	public Adapter createModelSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ClearAppdataCommand <em>Clear Appdata Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ClearAppdataCommand
	 * @generated
	 */
	public Adapter createClearAppdataCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MapView <em>Map View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MapView
	 * @generated
	 */
	public Adapter createMapViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MapEnvelope <em>Map Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MapEnvelope
	 * @generated
	 */
	public Adapter createMapEnvelopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PortalProfile <em>Portal Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PortalProfile
	 * @generated
	 */
	public Adapter createPortalProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.WebResourceModule <em>Web Resource Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.WebResourceModule
	 * @generated
	 */
	public Adapter createWebResourceModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.StdWebResourceModule <em>Std Web Resource Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.StdWebResourceModule
	 * @generated
	 */
	public Adapter createStdWebResourceModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RepartArtifact <em>Repart Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RepartArtifact
	 * @generated
	 */
	public Adapter createRepartArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.RepartModule <em>Repart Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.RepartModule
	 * @generated
	 */
	public Adapter createRepartModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Breadcrumb <em>Breadcrumb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Breadcrumb
	 * @generated
	 */
	public Adapter createBreadcrumbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.MapViewGadgets <em>Map View Gadgets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.MapViewGadgets
	 * @generated
	 */
	public Adapter createMapViewGadgetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PortalExposition <em>Portal Exposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PortalExposition
	 * @generated
	 */
	public Adapter createPortalExpositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CPCommand <em>CP Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CPCommand
	 * @generated
	 */
	public Adapter createCPCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.CPCommands <em>CP Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.CPCommands
	 * @generated
	 */
	public Adapter createCPCommandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.SecurityProfile <em>Security Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.SecurityProfile
	 * @generated
	 */
	public Adapter createSecurityProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.ExternalAuthenticationGuard <em>External Authentication Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.ExternalAuthenticationGuard
	 * @generated
	 */
	public Adapter createExternalAuthenticationGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.InternalAuthenticationGuard <em>Internal Authentication Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.InternalAuthenticationGuard
	 * @generated
	 */
	public Adapter createInternalAuthenticationGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.WAYFRequestAdapter <em>WAYF Request Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.WAYFRequestAdapter
	 * @generated
	 */
	public Adapter createWAYFRequestAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.WAYFProfile <em>WAYF Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.WAYFProfile
	 * @generated
	 */
	public Adapter createWAYFProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.LoginUI <em>Login UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.LoginUI
	 * @generated
	 */
	public Adapter createLoginUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.LoginModule <em>Login Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.LoginModule
	 * @generated
	 */
	public Adapter createLoginModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.IdentityAdapter <em>Identity Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.IdentityAdapter
	 * @generated
	 */
	public Adapter createIdentityAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.EnvConfigParam <em>Env Config Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.EnvConfigParam
	 * @generated
	 */
	public Adapter createEnvConfigParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.EnvConfigParams <em>Env Config Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.EnvConfigParams
	 * @generated
	 */
	public Adapter createEnvConfigParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.PEPImplementation <em>PEP Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.PEPImplementation
	 * @generated
	 */
	public Adapter createPEPImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.InlineCodeSnippet <em>Inline Code Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.InlineCodeSnippet
	 * @generated
	 */
	public Adapter createInlineCodeSnippetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.guigen.AnnotationDetail <em>Annotation Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.guigen.AnnotationDetail
	 * @generated
	 */
	public Adapter createAnnotationDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GuigenAdapterFactory
