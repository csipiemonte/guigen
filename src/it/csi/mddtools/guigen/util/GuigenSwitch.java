/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.util;

import it.csi.mddtools.guigen.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage
 * @generated
 */
public class GuigenSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuigenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigenSwitch() {
		if (modelPackage == null) {
			modelPackage = GuigenPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GuigenPackage.APPLICATION_AREA: {
				ApplicationArea applicationArea = (ApplicationArea)theEObject;
				T result = caseApplicationArea(applicationArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MENUBAR: {
				Menubar menubar = (Menubar)theEObject;
				T result = caseMenubar(menubar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.STATUSBAR: {
				Statusbar statusbar = (Statusbar)theEObject;
				T result = caseStatusbar(statusbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TITLEBAR: {
				Titlebar titlebar = (Titlebar)theEObject;
				T result = caseTitlebar(titlebar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CONTENT_PANEL: {
				ContentPanel contentPanel = (ContentPanel)theEObject;
				T result = caseContentPanel(contentPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.FORM_PANEL: {
				FormPanel formPanel = (FormPanel)theEObject;
				T result = caseFormPanel(formPanel);
				if (result == null) result = casePanel(formPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MULTI_PANEL: {
				MultiPanel multiPanel = (MultiPanel)theEObject;
				T result = caseMultiPanel(multiPanel);
				if (result == null) result = casePanel(multiPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TAB_SET_PANEL: {
				TabSetPanel tabSetPanel = (TabSetPanel)theEObject;
				T result = caseTabSetPanel(tabSetPanel);
				if (result == null) result = caseMultiPanel(tabSetPanel);
				if (result == null) result = casePanel(tabSetPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMMAND_WIDGET: {
				CommandWidget commandWidget = (CommandWidget)theEObject;
				T result = caseCommandWidget(commandWidget);
				if (result == null) result = caseWidget(commandWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.DATA_WIDGET: {
				DataWidget dataWidget = (DataWidget)theEObject;
				T result = caseDataWidget(dataWidget);
				if (result == null) result = caseWidget(dataWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseCommandWidget(button);
				if (result == null) result = caseWidget(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TEXT_FIELD: {
				TextField textField = (TextField)theEObject;
				T result = caseTextField(textField);
				if (result == null) result = caseDataWidget(textField);
				if (result == null) result = caseMultiDataWidget(textField);
				if (result == null) result = caseWidget(textField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseDataWidget(textArea);
				if (result == null) result = caseWidget(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CALENDAR: {
				Calendar calendar = (Calendar)theEObject;
				T result = caseCalendar(calendar);
				if (result == null) result = caseDataWidget(calendar);
				if (result == null) result = caseWidget(calendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMBO_BOX: {
				ComboBox comboBox = (ComboBox)theEObject;
				T result = caseComboBox(comboBox);
				if (result == null) result = caseDataWidget(comboBox);
				if (result == null) result = caseMultiDataWidget(comboBox);
				if (result == null) result = caseWidget(comboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseDataWidget(table);
				if (result == null) result = caseMultiDataWidget(table);
				if (result == null) result = caseWidget(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CHECK_BOX: {
				CheckBox checkBox = (CheckBox)theEObject;
				T result = caseCheckBox(checkBox);
				if (result == null) result = caseDataWidget(checkBox);
				if (result == null) result = caseWidget(checkBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.GUI_MODEL: {
				GUIModel guiModel = (GUIModel)theEObject;
				T result = caseGUIModel(guiModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.GUI_STRUCTURE: {
				GUIStructure guiStructure = (GUIStructure)theEObject;
				T result = caseGUIStructure(guiStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.GUI_BEHAVIORS: {
				GUIBehaviors guiBehaviors = (GUIBehaviors)theEObject;
				T result = caseGUIBehaviors(guiBehaviors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.RADIO_BUTTONS: {
				RadioButtons radioButtons = (RadioButtons)theEObject;
				T result = caseRadioButtons(radioButtons);
				if (result == null) result = caseDataWidget(radioButtons);
				if (result == null) result = caseWidget(radioButtons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.RADIO_BUTTON: {
				RadioButton radioButton = (RadioButton)theEObject;
				T result = caseRadioButton(radioButton);
				if (result == null) result = caseWidget(radioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.RESET_BUTTON: {
				ResetButton resetButton = (ResetButton)theEObject;
				T result = caseResetButton(resetButton);
				if (result == null) result = caseButton(resetButton);
				if (result == null) result = caseCommandWidget(resetButton);
				if (result == null) result = caseWidget(resetButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CONFIRM_BUTTON: {
				ConfirmButton confirmButton = (ConfirmButton)theEObject;
				T result = caseConfirmButton(confirmButton);
				if (result == null) result = caseButton(confirmButton);
				if (result == null) result = caseCommandWidget(confirmButton);
				if (result == null) result = caseWidget(confirmButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PANEL_LAYOUT: {
				PanelLayout panelLayout = (PanelLayout)theEObject;
				T result = casePanelLayout(panelLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.HORIZONTAL_FLOW_PANEL_LAYOUT: {
				HorizontalFlowPanelLayout horizontalFlowPanelLayout = (HorizontalFlowPanelLayout)theEObject;
				T result = caseHorizontalFlowPanelLayout(horizontalFlowPanelLayout);
				if (result == null) result = casePanelLayout(horizontalFlowPanelLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.VERTICAL_FLOW_PANEL_LAYOUT: {
				VerticalFlowPanelLayout verticalFlowPanelLayout = (VerticalFlowPanelLayout)theEObject;
				T result = caseVerticalFlowPanelLayout(verticalFlowPanelLayout);
				if (result == null) result = casePanelLayout(verticalFlowPanelLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.UDLRC_PANEL_LAYOUT: {
				UDLRCPanelLayout udlrcPanelLayout = (UDLRCPanelLayout)theEObject;
				T result = caseUDLRCPanelLayout(udlrcPanelLayout);
				if (result == null) result = casePanelLayout(udlrcPanelLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.WIDGET_LAYOUT_SPECIFIER: {
				WidgetLayoutSpecifier widgetLayoutSpecifier = (WidgetLayoutSpecifier)theEObject;
				T result = caseWidgetLayoutSpecifier(widgetLayoutSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.UDLRC_WIDGET_LAYOUT_SPEC: {
				UDLRCWidgetLayoutSpec udlrcWidgetLayoutSpec = (UDLRCWidgetLayoutSpec)theEObject;
				T result = caseUDLRCWidgetLayoutSpec(udlrcWidgetLayoutSpec);
				if (result == null) result = caseWidgetLayoutSpecifier(udlrcWidgetLayoutSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseWidget(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MENU_ITEM: {
				MenuItem menuItem = (MenuItem)theEObject;
				T result = caseMenuItem(menuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.DISABLED_COMPONENT_SET: {
				DisabledComponentSet disabledComponentSet = (DisabledComponentSet)theEObject;
				T result = caseDisabledComponentSet(disabledComponentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COLUMN_MODEL: {
				ColumnModel columnModel = (ColumnModel)theEObject;
				T result = caseColumnModel(columnModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMMAND_EVENT: {
				CommandEvent commandEvent = (CommandEvent)theEObject;
				T result = caseCommandEvent(commandEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ONOFF_COMMAND: {
				ONOFFCommand onoffCommand = (ONOFFCommand)theEObject;
				T result = caseONOFFCommand(onoffCommand);
				if (result == null) result = caseCommandOnWidgets(onoffCommand);
				if (result == null) result = caseCommand(onoffCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CUSTOM_COMMAND: {
				CustomCommand customCommand = (CustomCommand)theEObject;
				T result = caseCustomCommand(customCommand);
				if (result == null) result = caseCommand(customCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.VISIBILITY_COMMAND: {
				VisibilityCommand visibilityCommand = (VisibilityCommand)theEObject;
				T result = caseVisibilityCommand(visibilityCommand);
				if (result == null) result = caseCommandOnWidgets(visibilityCommand);
				if (result == null) result = caseCommand(visibilityCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.REFRESH_VIEW_COMMAND: {
				RefreshViewCommand refreshViewCommand = (RefreshViewCommand)theEObject;
				T result = caseRefreshViewCommand(refreshViewCommand);
				if (result == null) result = caseCommandOnWidgets(refreshViewCommand);
				if (result == null) result = caseCommandOnPanels(refreshViewCommand);
				if (result == null) result = caseCommand(refreshViewCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.JUMP_COMMAND: {
				JumpCommand jumpCommand = (JumpCommand)theEObject;
				T result = caseJumpCommand(jumpCommand);
				if (result == null) result = caseCommand(jumpCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.EXEC_COMMAND: {
				ExecCommand execCommand = (ExecCommand)theEObject;
				T result = caseExecCommand(execCommand);
				if (result == null) result = caseCommand(execCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.EVENT_HANDLER: {
				EventHandler eventHandler = (EventHandler)theEObject;
				T result = caseEventHandler(eventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.WIDGET_TARGET_ACTION: {
				WidgetTargetAction widgetTargetAction = (WidgetTargetAction)theEObject;
				T result = caseWidgetTargetAction(widgetTargetAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMMAND_ON_WIDGETS: {
				CommandOnWidgets commandOnWidgets = (CommandOnWidgets)theEObject;
				T result = caseCommandOnWidgets(commandOnWidgets);
				if (result == null) result = caseCommand(commandOnWidgets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.DIALOG_PANEL: {
				DialogPanel dialogPanel = (DialogPanel)theEObject;
				T result = caseDialogPanel(dialogPanel);
				if (result == null) result = casePanel(dialogPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SHOW_DIALOG_COMMAND: {
				ShowDialogCommand showDialogCommand = (ShowDialogCommand)theEObject;
				T result = caseShowDialogCommand(showDialogCommand);
				if (result == null) result = caseCommand(showDialogCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMMAND_OUTCOME: {
				CommandOutcome commandOutcome = (CommandOutcome)theEObject;
				T result = caseCommandOutcome(commandOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMMAND_ON_PANELS: {
				CommandOnPanels commandOnPanels = (CommandOnPanels)theEObject;
				T result = caseCommandOnPanels(commandOnPanels);
				if (result == null) result = caseCommand(commandOnPanels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.FOOTER: {
				Footer footer = (Footer)theEObject;
				T result = caseFooter(footer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APP_WINDOW: {
				AppWindow appWindow = (AppWindow)theEObject;
				T result = caseAppWindow(appWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.STATIC_LINKS: {
				StaticLinks staticLinks = (StaticLinks)theEObject;
				T result = caseStaticLinks(staticLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SEQUENCE_COMMAND: {
				SequenceCommand sequenceCommand = (SequenceCommand)theEObject;
				T result = caseSequenceCommand(sequenceCommand);
				if (result == null) result = caseCommand(sequenceCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.JUMP_BACK_COMMAND: {
				JumpBackCommand jumpBackCommand = (JumpBackCommand)theEObject;
				T result = caseJumpBackCommand(jumpBackCommand);
				if (result == null) result = caseCommand(jumpBackCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APPLICATION_DATA: {
				ApplicationData applicationData = (ApplicationData)theEObject;
				T result = caseApplicationData(applicationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APP_DATA_BINDING: {
				AppDataBinding appDataBinding = (AppDataBinding)theEObject;
				T result = caseAppDataBinding(appDataBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MULTI_DATA_WIDGET: {
				MultiDataWidget multiDataWidget = (MultiDataWidget)theEObject;
				T result = caseMultiDataWidget(multiDataWidget);
				if (result == null) result = caseWidget(multiDataWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TYPEDEFS: {
				Typedefs typedefs = (Typedefs)theEObject;
				T result = caseTypedefs(typedefs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SIMPLE_TYPE: {
				SimpleType simpleType = (SimpleType)theEObject;
				T result = caseSimpleType(simpleType);
				if (result == null) result = caseType(simpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = caseType(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TYPED_ARRAY: {
				TypedArray typedArray = (TypedArray)theEObject;
				T result = caseTypedArray(typedArray);
				if (result == null) result = caseType(typedArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APPLICATION_DATA_DEFS: {
				ApplicationDataDefs applicationDataDefs = (ApplicationDataDefs)theEObject;
				T result = caseApplicationDataDefs(applicationDataDefs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TREE_VIEW: {
				TreeView treeView = (TreeView)theEObject;
				T result = caseTreeView(treeView);
				if (result == null) result = caseDataWidget(treeView);
				if (result == null) result = caseMultiDataWidget(treeView);
				if (result == null) result = caseWidget(treeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PLAIN_TEXT: {
				PlainText plainText = (PlainText)theEObject;
				T result = casePlainText(plainText);
				if (result == null) result = caseDataWidget(plainText);
				if (result == null) result = caseWidget(plainText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MENU_VIEW: {
				MenuView menuView = (MenuView)theEObject;
				T result = caseMenuView(menuView);
				if (result == null) result = caseCommandWidget(menuView);
				if (result == null) result = caseWidget(menuView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.GRID_PANEL_LAYOUT: {
				GridPanelLayout gridPanelLayout = (GridPanelLayout)theEObject;
				T result = caseGridPanelLayout(gridPanelLayout);
				if (result == null) result = casePanelLayout(gridPanelLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC: {
				GridWidgetLayoutSpec gridWidgetLayoutSpec = (GridWidgetLayoutSpec)theEObject;
				T result = caseGridWidgetLayoutSpec(gridWidgetLayoutSpec);
				if (result == null) result = caseWidgetLayoutSpecifier(gridWidgetLayoutSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.COMMAND_PANEL: {
				CommandPanel commandPanel = (CommandPanel)theEObject;
				T result = caseCommandPanel(commandPanel);
				if (result == null) result = casePanel(commandPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MENU_PANEL: {
				MenuPanel menuPanel = (MenuPanel)theEObject;
				T result = caseMenuPanel(menuPanel);
				if (result == null) result = casePanel(menuPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.HIDDEN_VALUE: {
				HiddenValue hiddenValue = (HiddenValue)theEObject;
				T result = caseHiddenValue(hiddenValue);
				if (result == null) result = caseDataWidget(hiddenValue);
				if (result == null) result = caseWidget(hiddenValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.USER_DEFINED_WIDGET: {
				UserDefinedWidget userDefinedWidget = (UserDefinedWidget)theEObject;
				T result = caseUserDefinedWidget(userDefinedWidget);
				if (result == null) result = caseWidget(userDefinedWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND: {
				ActivateMultiPanelItemCommand activateMultiPanelItemCommand = (ActivateMultiPanelItemCommand)theEObject;
				T result = caseActivateMultiPanelItemCommand(activateMultiPanelItemCommand);
				if (result == null) result = caseCommand(activateMultiPanelItemCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.AUTENTICATION_METHOD: {
				AutenticationMethod autenticationMethod = (AutenticationMethod)theEObject;
				T result = caseAutenticationMethod(autenticationMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.UI_SECURITY_CONSTRAINT: {
				UISecurityConstraint uiSecurityConstraint = (UISecurityConstraint)theEObject;
				T result = caseUISecurityConstraint(uiSecurityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.UC_BASED_SECURITY_CONSTRAINT: {
				UCBasedSecurityConstraint ucBasedSecurityConstraint = (UCBasedSecurityConstraint)theEObject;
				T result = caseUCBasedSecurityConstraint(ucBasedSecurityConstraint);
				if (result == null) result = caseUISecurityConstraint(ucBasedSecurityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SECURITY_MODEL: {
				SecurityModel securityModel = (SecurityModel)theEObject;
				T result = caseSecurityModel(securityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.USE_CASE: {
				UseCase useCase = (UseCase)theEObject;
				T result = caseUseCase(useCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTOR_BASED_SECURITY_CONSTRAINT: {
				ActorBasedSecurityConstraint actorBasedSecurityConstraint = (ActorBasedSecurityConstraint)theEObject;
				T result = caseActorBasedSecurityConstraint(actorBasedSecurityConstraint);
				if (result == null) result = caseUISecurityConstraint(actorBasedSecurityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CUSTOM_SECURITY_CONSTRAINT: {
				CustomSecurityConstraint customSecurityConstraint = (CustomSecurityConstraint)theEObject;
				T result = caseCustomSecurityConstraint(customSecurityConstraint);
				if (result == null) result = caseUISecurityConstraint(customSecurityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.OPAUTHSSO: {
				OPAUTHSSO opauthsso = (OPAUTHSSO)theEObject;
				T result = caseOPAUTHSSO(opauthsso);
				if (result == null) result = caseAutenticationMethod(opauthsso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SSOBARTSSO: {
				SSOBARTSSO ssobartsso = (SSOBARTSSO)theEObject;
				T result = caseSSOBARTSSO(ssobartsso);
				if (result == null) result = caseAutenticationMethod(ssobartsso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CUSTOM_AUTHENTICATION: {
				CustomAuthentication customAuthentication = (CustomAuthentication)theEObject;
				T result = caseCustomAuthentication(customAuthentication);
				if (result == null) result = caseAutenticationMethod(customAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.STD_MESSAGE_PANEL: {
				StdMessagePanel stdMessagePanel = (StdMessagePanel)theEObject;
				T result = caseStdMessagePanel(stdMessagePanel);
				if (result == null) result = casePanel(stdMessagePanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.JUMP_EXT_COMMAND: {
				JumpExtCommand jumpExtCommand = (JumpExtCommand)theEObject;
				T result = caseJumpExtCommand(jumpExtCommand);
				if (result == null) result = caseCommand(jumpExtCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TARGET_PLATFORM: {
				TargetPlatform targetPlatform = (TargetPlatform)theEObject;
				T result = caseTargetPlatform(targetPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.USER_INFO_PANEL: {
				UserInfoPanel userInfoPanel = (UserInfoPanel)theEObject;
				T result = caseUserInfoPanel(userInfoPanel);
				if (result == null) result = casePanel(userInfoPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.USER_DEFINED_PANEL: {
				UserDefinedPanel userDefinedPanel = (UserDefinedPanel)theEObject;
				T result = caseUserDefinedPanel(userDefinedPanel);
				if (result == null) result = casePanel(userDefinedPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.WIZARD_PANEL: {
				WizardPanel wizardPanel = (WizardPanel)theEObject;
				T result = caseWizardPanel(wizardPanel);
				if (result == null) result = caseMultiPanel(wizardPanel);
				if (result == null) result = casePanel(wizardPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APP_MODULE: {
				AppModule appModule = (AppModule)theEObject;
				T result = caseAppModule(appModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TYPE_NAMESPACE: {
				TypeNamespace typeNamespace = (TypeNamespace)theEObject;
				T result = caseTypeNamespace(typeNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APP_DATA_GROUP: {
				AppDataGroup appDataGroup = (AppDataGroup)theEObject;
				T result = caseAppDataGroup(appDataGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MSG_BOX_PANEL: {
				MsgBoxPanel msgBoxPanel = (MsgBoxPanel)theEObject;
				T result = caseMsgBoxPanel(msgBoxPanel);
				if (result == null) result = casePanel(msgBoxPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.NOP_COMMAND: {
				NOPCommand nopCommand = (NOPCommand)theEObject;
				T result = caseNOPCommand(nopCommand);
				if (result == null) result = caseCommand(nopCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.WIDGETS_PANEL: {
				WidgetsPanel widgetsPanel = (WidgetsPanel)theEObject;
				T result = caseWidgetsPanel(widgetsPanel);
				if (result == null) result = casePanel(widgetsPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SCREEN_STATE: {
				ScreenState screenState = (ScreenState)theEObject;
				T result = caseScreenState(screenState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SCREEN_STATES: {
				ScreenStates screenStates = (ScreenStates)theEObject;
				T result = caseScreenStates(screenStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SCREEN_STATE_COMMAND: {
				ScreenStateCommand screenStateCommand = (ScreenStateCommand)theEObject;
				T result = caseScreenStateCommand(screenStateCommand);
				if (result == null) result = caseCommand(screenStateCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.SHIBBOLETH_SSO: {
				ShibbolethSSO shibbolethSSO = (ShibbolethSSO)theEObject;
				T result = caseShibbolethSSO(shibbolethSSO);
				if (result == null) result = caseAutenticationMethod(shibbolethSSO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ROLE_BASED_SECURITY_CONSTRAINT: {
				RoleBasedSecurityConstraint roleBasedSecurityConstraint = (RoleBasedSecurityConstraint)theEObject;
				T result = caseRoleBasedSecurityConstraint(roleBasedSecurityConstraint);
				if (result == null) result = caseUISecurityConstraint(roleBasedSecurityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.FILE_UPLOAD: {
				FileUpload fileUpload = (FileUpload)theEObject;
				T result = caseFileUpload(fileUpload);
				if (result == null) result = caseWidget(fileUpload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TAB_SWITCHER: {
				TabSwitcher tabSwitcher = (TabSwitcher)theEObject;
				T result = caseTabSwitcher(tabSwitcher);
				if (result == null) result = caseCommandWidget(tabSwitcher);
				if (result == null) result = caseWidget(tabSwitcher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PANEL_DEF: {
				PanelDef panelDef = (PanelDef)theEObject;
				T result = casePanelDef(panelDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PDEF_PARAM: {
				PDefParam pDefParam = (PDefParam)theEObject;
				T result = casePDefParam(pDefParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APP_DATA_MAPPING_PARAM: {
				AppDataMappingParam appDataMappingParam = (AppDataMappingParam)theEObject;
				T result = caseAppDataMappingParam(appDataMappingParam);
				if (result == null) result = casePDefParam(appDataMappingParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TYPE_DEF_MAPPING_PARAM: {
				TypeDefMappingParam typeDefMappingParam = (TypeDefMappingParam)theEObject;
				T result = caseTypeDefMappingParam(typeDefMappingParam);
				if (result == null) result = casePDefParam(typeDefMappingParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.USE_CASE_MAPPING_PARAM: {
				UseCaseMappingParam useCaseMappingParam = (UseCaseMappingParam)theEObject;
				T result = caseUseCaseMappingParam(useCaseMappingParam);
				if (result == null) result = casePDefParam(useCaseMappingParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ROLE_MAPPING_PARAM: {
				RoleMappingParam roleMappingParam = (RoleMappingParam)theEObject;
				T result = caseRoleMappingParam(roleMappingParam);
				if (result == null) result = casePDefParam(roleMappingParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTOR_MAPPING_PARAM: {
				ActorMappingParam actorMappingParam = (ActorMappingParam)theEObject;
				T result = caseActorMappingParam(actorMappingParam);
				if (result == null) result = casePDefParam(actorMappingParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PANEL_DEF_USE: {
				PanelDefUse panelDefUse = (PanelDefUse)theEObject;
				T result = casePanelDefUse(panelDefUse);
				if (result == null) result = casePanel(panelDefUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PDEF_PARAM_VAL: {
				PDefParamVal pDefParamVal = (PDefParamVal)theEObject;
				T result = casePDefParamVal(pDefParamVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.APP_DATA_MAPPING_PDEF_VAL: {
				AppDataMappingPDefVal appDataMappingPDefVal = (AppDataMappingPDefVal)theEObject;
				T result = caseAppDataMappingPDefVal(appDataMappingPDefVal);
				if (result == null) result = casePDefParamVal(appDataMappingPDefVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TYPE_DEF_MAPPING_PDEF_VAL: {
				TypeDefMappingPDefVal typeDefMappingPDefVal = (TypeDefMappingPDefVal)theEObject;
				T result = caseTypeDefMappingPDefVal(typeDefMappingPDefVal);
				if (result == null) result = casePDefParamVal(typeDefMappingPDefVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.UC_MAPPING_PDEF_VAL: {
				UCMappingPDefVal ucMappingPDefVal = (UCMappingPDefVal)theEObject;
				T result = caseUCMappingPDefVal(ucMappingPDefVal);
				if (result == null) result = casePDefParamVal(ucMappingPDefVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ROLE_MAPPING_PDEF_VAL: {
				RoleMappingPDefVal roleMappingPDefVal = (RoleMappingPDefVal)theEObject;
				T result = caseRoleMappingPDefVal(roleMappingPDefVal);
				if (result == null) result = casePDefParamVal(roleMappingPDefVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTOR_MAPPING_PDEF_VAL: {
				ActorMappingPDefVal actorMappingPDefVal = (ActorMappingPDefVal)theEObject;
				T result = caseActorMappingPDefVal(actorMappingPDefVal);
				if (result == null) result = casePDefParamVal(actorMappingPDefVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PDEF_USE_CONFIG: {
				PDefUseConfig pDefUseConfig = (PDefUseConfig)theEObject;
				T result = casePDefUseConfig(pDefUseConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTIVATION_MODEL: {
				ActivationModel activationModel = (ActivationModel)theEObject;
				T result = caseActivationModel(activationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTIVATION_PARAM: {
				ActivationParam activationParam = (ActivationParam)theEObject;
				T result = caseActivationParam(activationParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.BEGIN_EDIT_COMMAND: {
				BeginEditCommand beginEditCommand = (BeginEditCommand)theEObject;
				T result = caseBeginEditCommand(beginEditCommand);
				if (result == null) result = caseCommand(beginEditCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.END_EDIT_COMMAND: {
				EndEditCommand endEditCommand = (EndEditCommand)theEObject;
				T result = caseEndEditCommand(endEditCommand);
				if (result == null) result = caseCommand(endEditCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND: {
				ChkEditStatusCommand chkEditStatusCommand = (ChkEditStatusCommand)theEObject;
				T result = caseChkEditStatusCommand(chkEditStatusCommand);
				if (result == null) result = caseCommand(chkEditStatusCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PANEL_DEF_STATE: {
				PanelDefState panelDefState = (PanelDefState)theEObject;
				T result = casePanelDefState(panelDefState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PDEF_STATE_COMMAND: {
				PDefStateCommand pDefStateCommand = (PDefStateCommand)theEObject;
				T result = casePDefStateCommand(pDefStateCommand);
				if (result == null) result = caseCommand(pDefStateCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PANEL_DEF_STATES: {
				PanelDefStates panelDefStates = (PanelDefStates)theEObject;
				T result = casePanelDefStates(panelDefStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TABLE_CUSTOMIZATION_PARAM: {
				TableCustomizationParam tableCustomizationParam = (TableCustomizationParam)theEObject;
				T result = caseTableCustomizationParam(tableCustomizationParam);
				if (result == null) result = casePDefParam(tableCustomizationParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.EXTRA_COLUMN: {
				ExtraColumn extraColumn = (ExtraColumn)theEObject;
				T result = caseExtraColumn(extraColumn);
				if (result == null) result = caseColumn(extraColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL: {
				TableCustomizationPDefVal tableCustomizationPDefVal = (TableCustomizationPDefVal)theEObject;
				T result = caseTableCustomizationPDefVal(tableCustomizationPDefVal);
				if (result == null) result = casePDefParamVal(tableCustomizationPDefVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CUSTOM_CARTRIDGE: {
				CustomCartridge customCartridge = (CustomCartridge)theEObject;
				T result = caseCustomCartridge(customCartridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CUSTOM_TEMPLATE: {
				CustomTemplate customTemplate = (CustomTemplate)theEObject;
				T result = caseCustomTemplate(customTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MODEL_SLOT_DEF: {
				ModelSlotDef modelSlotDef = (ModelSlotDef)theEObject;
				T result = caseModelSlotDef(modelSlotDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MODEL_SLOT: {
				ModelSlot modelSlot = (ModelSlot)theEObject;
				T result = caseModelSlot(modelSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CLEAR_APPDATA_COMMAND: {
				ClearAppdataCommand clearAppdataCommand = (ClearAppdataCommand)theEObject;
				T result = caseClearAppdataCommand(clearAppdataCommand);
				if (result == null) result = caseCommand(clearAppdataCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MAP_VIEW: {
				MapView mapView = (MapView)theEObject;
				T result = caseMapView(mapView);
				if (result == null) result = caseDataWidget(mapView);
				if (result == null) result = caseWidget(mapView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.MAP_ENVELOPE: {
				MapEnvelope mapEnvelope = (MapEnvelope)theEObject;
				T result = caseMapEnvelope(mapEnvelope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationArea(ApplicationArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menubar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menubar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenubar(Menubar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statusbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statusbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusbar(Statusbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titlebar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titlebar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitlebar(Titlebar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentPanel(ContentPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormPanel(FormPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Set Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Set Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabSetPanel(TabSetPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandWidget(CommandWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataWidget(DataWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextField(TextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboBox(ComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBox(CheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIModel(GUIModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIStructure(GUIStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Behaviors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Behaviors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIBehaviors(GUIBehaviors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Buttons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Buttons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButtons(RadioButtons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetButton(ResetButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmButton(ConfirmButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanelLayout(PanelLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Flow Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Flow Panel Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalFlowPanelLayout(HorizontalFlowPanelLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Flow Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Flow Panel Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalFlowPanelLayout(VerticalFlowPanelLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDLRC Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDLRC Panel Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDLRCPanelLayout(UDLRCPanelLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Layout Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Layout Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetLayoutSpecifier(WidgetLayoutSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDLRC Widget Layout Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDLRC Widget Layout Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDLRCWidgetLayoutSpec(UDLRCWidgetLayoutSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuItem(MenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabled Component Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabled Component Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisabledComponentSet(DisabledComponentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnModel(ColumnModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandEvent(CommandEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ONOFF Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ONOFF Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseONOFFCommand(ONOFFCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomCommand(CustomCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityCommand(VisibilityCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refresh View Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refresh View Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefreshViewCommand(RefreshViewCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpCommand(JumpCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exec Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exec Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecCommand(ExecCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandler(EventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Target Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Target Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetTargetAction(WidgetTargetAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command On Widgets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command On Widgets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandOnWidgets(CommandOnWidgets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogPanel(DialogPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show Dialog Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowDialogCommand(ShowDialogCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandOutcome(CommandOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command On Panels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command On Panels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandOnPanels(CommandOnPanels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooter(Footer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppWindow(AppWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticLinks(StaticLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceCommand(SequenceCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Back Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Back Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpBackCommand(JumpBackCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationData(ApplicationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Data Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Data Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppDataBinding(AppDataBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Data Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Data Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiDataWidget(MultiDataWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typedefs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typedefs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedefs(Typedefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleType(SimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedArray(TypedArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Data Defs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Data Defs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDataDefs(ApplicationDataDefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeView(TreeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainText(PlainText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuView(MenuView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Panel Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Panel Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridPanelLayout(GridPanelLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Widget Layout Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Widget Layout Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridWidgetLayoutSpec(GridWidgetLayoutSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandPanel(CommandPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuPanel(MenuPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hidden Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hidden Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHiddenValue(HiddenValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedWidget(UserDefinedWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPanel(MultiPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activate Multi Panel Item Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activate Multi Panel Item Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivateMultiPanelItemCommand(ActivateMultiPanelItemCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autentication Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autentication Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutenticationMethod(AutenticationMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Security Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUISecurityConstraint(UISecurityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Based Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Based Security Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCBasedSecurityConstraint(UCBasedSecurityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityModel(SecurityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCase(UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Based Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Based Security Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorBasedSecurityConstraint(ActorBasedSecurityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Security Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomSecurityConstraint(CustomSecurityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OPAUTHSSO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OPAUTHSSO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPAUTHSSO(OPAUTHSSO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSOBARTSSO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSOBARTSSO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSOBARTSSO(SSOBARTSSO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomAuthentication(CustomAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Message Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Message Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdMessagePanel(StdMessagePanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Ext Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Ext Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpExtCommand(JumpExtCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPlatform(TargetPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Info Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Info Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInfoPanel(UserInfoPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedPanel(UserDefinedPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizard Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizard Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizardPanel(WizardPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppModule(AppModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNamespace(TypeNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Data Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Data Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppDataGroup(AppDataGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msg Box Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msg Box Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgBoxPanel(MsgBoxPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOP Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOP Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOPCommand(NOPCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widgets Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widgets Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetsPanel(WidgetsPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenState(ScreenState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenStates(ScreenStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen State Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen State Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenStateCommand(ScreenStateCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shibboleth SSO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shibboleth SSO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShibbolethSSO(ShibbolethSSO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Based Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Based Security Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBasedSecurityConstraint(RoleBasedSecurityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Upload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Upload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileUpload(FileUpload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Switcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Switcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabSwitcher(TabSwitcher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanelDef(PanelDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDef Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDef Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDefParam(PDefParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Data Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Data Mapping Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppDataMappingParam(AppDataMappingParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Def Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Def Mapping Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefMappingParam(TypeDefMappingParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case Mapping Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCaseMappingParam(UseCaseMappingParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Mapping Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleMappingParam(RoleMappingParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Mapping Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Mapping Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorMappingParam(ActorMappingParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel Def Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel Def Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanelDefUse(PanelDefUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDef Param Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDef Param Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDefParamVal(PDefParamVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Data Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Data Mapping PDef Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppDataMappingPDefVal(AppDataMappingPDefVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Def Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Def Mapping PDef Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefMappingPDefVal(TypeDefMappingPDefVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Mapping PDef Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCMappingPDefVal(UCMappingPDefVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Mapping PDef Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleMappingPDefVal(RoleMappingPDefVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Mapping PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Mapping PDef Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorMappingPDefVal(ActorMappingPDefVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDef Use Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDef Use Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDefUseConfig(PDefUseConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationModel(ActivationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationParam(ActivationParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Edit Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Edit Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginEditCommand(BeginEditCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Edit Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Edit Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEditCommand(EndEditCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chk Edit Status Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chk Edit Status Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChkEditStatusCommand(ChkEditStatusCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel Def State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel Def State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanelDefState(PanelDefState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDef State Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDef State Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDefStateCommand(PDefStateCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel Def States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel Def States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanelDefStates(PanelDefStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Customization Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Customization Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCustomizationParam(TableCustomizationParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraColumn(ExtraColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Customization PDef Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Customization PDef Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCustomizationPDefVal(TableCustomizationPDefVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Cartridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomCartridge(CustomCartridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTemplate(CustomTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Slot Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Slot Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSlotDef(ModelSlotDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSlot(ModelSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Appdata Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Appdata Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearAppdataCommand(ClearAppdataCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapView(MapView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Envelope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Envelope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapEnvelope(MapEnvelope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GuigenSwitch
