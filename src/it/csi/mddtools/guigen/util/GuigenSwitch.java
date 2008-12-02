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
			case GuigenPackage.FORM_PANEL: {
				FormPanel formPanel = (FormPanel)theEObject;
				T result = caseFormPanel(formPanel);
				if (result == null) result = casePanel(formPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TAB_SET_PANEL: {
				TabSetPanel tabSetPanel = (TabSetPanel)theEObject;
				T result = caseTabSetPanel(tabSetPanel);
				if (result == null) result = casePanel(tabSetPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
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
				if (result == null) result = caseWidget(comboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseDataWidget(table);
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
			case GuigenPackage.GUI_FLOW: {
				GUIFlow guiFlow = (GUIFlow)theEObject;
				T result = caseGUIFlow(guiFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.FLOW_STATE: {
				FlowState flowState = (FlowState)theEObject;
				T result = caseFlowState(flowState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.FLOW_TRANSITION: {
				FlowTransition flowTransition = (FlowTransition)theEObject;
				T result = caseFlowTransition(flowTransition);
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
			case GuigenPackage.GLOBAL_FLOW_TRANSITION: {
				GlobalFlowTransition globalFlowTransition = (GlobalFlowTransition)theEObject;
				T result = caseGlobalFlowTransition(globalFlowTransition);
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
			case GuigenPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTION_EVENT: {
				ActionEvent actionEvent = (ActionEvent)theEObject;
				T result = caseActionEvent(actionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ONOFF_ACTION: {
				ONOFFAction onoffAction = (ONOFFAction)theEObject;
				T result = caseONOFFAction(onoffAction);
				if (result == null) result = caseAction(onoffAction);
				if (result == null) result = caseActionOnWidgets(onoffAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.CUSTOM_ACTION: {
				CustomAction customAction = (CustomAction)theEObject;
				T result = caseCustomAction(customAction);
				if (result == null) result = caseAction(customAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.VISIBILITY_ACTION: {
				VisibilityAction visibilityAction = (VisibilityAction)theEObject;
				T result = caseVisibilityAction(visibilityAction);
				if (result == null) result = caseAction(visibilityAction);
				if (result == null) result = caseActionOnWidgets(visibilityAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.REFRESH_VIEW_ACTION: {
				RefreshViewAction refreshViewAction = (RefreshViewAction)theEObject;
				T result = caseRefreshViewAction(refreshViewAction);
				if (result == null) result = caseAction(refreshViewAction);
				if (result == null) result = caseActionOnWidgets(refreshViewAction);
				if (result == null) result = caseActionOnPanels(refreshViewAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.JUMP_ACTION: {
				JumpAction jumpAction = (JumpAction)theEObject;
				T result = caseJumpAction(jumpAction);
				if (result == null) result = caseAction(jumpAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.EXEC_ACTION: {
				ExecAction execAction = (ExecAction)theEObject;
				T result = caseExecAction(execAction);
				if (result == null) result = caseAction(execAction);
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
			case GuigenPackage.ACTION_ON_WIDGETS: {
				ActionOnWidgets actionOnWidgets = (ActionOnWidgets)theEObject;
				T result = caseActionOnWidgets(actionOnWidgets);
				if (result == null) result = caseAction(actionOnWidgets);
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
			case GuigenPackage.SHOW_DIALOG_ACTION: {
				ShowDialogAction showDialogAction = (ShowDialogAction)theEObject;
				T result = caseShowDialogAction(showDialogAction);
				if (result == null) result = caseAction(showDialogAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTION_RESULT: {
				ActionResult actionResult = (ActionResult)theEObject;
				T result = caseActionResult(actionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.ACTION_ON_PANELS: {
				ActionOnPanels actionOnPanels = (ActionOnPanels)theEObject;
				T result = caseActionOnPanels(actionOnPanels);
				if (result == null) result = caseAction(actionOnPanels);
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
			case GuigenPackage.SEQUENCE_ACTION: {
				SequenceAction sequenceAction = (SequenceAction)theEObject;
				T result = caseSequenceAction(sequenceAction);
				if (result == null) result = caseAction(sequenceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuigenPackage.JUMP_BACK_ACTION: {
				JumpBackAction jumpBackAction = (JumpBackAction)theEObject;
				T result = caseJumpBackAction(jumpBackAction);
				if (result == null) result = caseAction(jumpBackAction);
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
	 * Returns the result of interpreting the object as an instance of '<em>GUI Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIFlow(GUIFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowState(FlowState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowTransition(FlowTransition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Global Flow Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Flow Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalFlowTransition(GlobalFlowTransition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEvent(ActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ONOFF Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ONOFF Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseONOFFAction(ONOFFAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomAction(CustomAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityAction(VisibilityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refresh View Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refresh View Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefreshViewAction(RefreshViewAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpAction(JumpAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exec Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exec Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecAction(ExecAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action On Widgets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action On Widgets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionOnWidgets(ActionOnWidgets object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Show Dialog Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show Dialog Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowDialogAction(ShowDialogAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionResult(ActionResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action On Panels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action On Panels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionOnPanels(ActionOnPanels object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceAction(SequenceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Back Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Back Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpBackAction(JumpBackAction object) {
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
