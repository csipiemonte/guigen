/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Panel;

import it.csi.mddtools.guigen.ScreenState;
import it.csi.mddtools.guigen.ScreenStates;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getPanels <em>Panels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getAppData <em>App Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getOnRefreshCommand <em>On Refresh Command</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getDialogs <em>Dialogs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getStates <em>States</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getDefaultState <em>Default State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentPanelImpl extends EObjectImpl implements ContentPanel {
	/**
	 * The cached value of the '{@link #getPanels() <em>Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanels()
	 * @generated
	 * @ordered
	 */
	protected Panel panels;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppData() <em>App Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppData()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationData> appData;

	/**
	 * The cached value of the '{@link #getOnRefreshCommand() <em>On Refresh Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRefreshCommand()
	 * @generated
	 * @ordered
	 */
	protected Command onRefreshCommand;

	/**
	 * The cached value of the '{@link #getDialogs() <em>Dialogs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogs()
	 * @generated
	 * @ordered
	 */
	protected EList<DialogPanel> dialogs;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected ScreenStates states;

	/**
	 * The cached value of the '{@link #getDefaultState() <em>Default State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultState()
	 * @generated
	 * @ordered
	 */
	protected ScreenState defaultState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.CONTENT_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel getPanels() {
		return panels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPanels(Panel newPanels, NotificationChain msgs) {
		Panel oldPanels = panels;
		panels = newPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__PANELS, oldPanels, newPanels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanels(Panel newPanels) {
		if (newPanels != panels) {
			NotificationChain msgs = null;
			if (panels != null)
				msgs = ((InternalEObject)panels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__PANELS, null, msgs);
			if (newPanels != null)
				msgs = ((InternalEObject)newPanels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__PANELS, null, msgs);
			msgs = basicSetPanels(newPanels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__PANELS, newPanels, newPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getAppData() {
		if (appData == null) {
			appData = new EObjectResolvingEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.CONTENT_PANEL__APP_DATA);
		}
		return appData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getOnRefreshCommand() {
		return onRefreshCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnRefreshCommand(Command newOnRefreshCommand, NotificationChain msgs) {
		Command oldOnRefreshCommand = onRefreshCommand;
		onRefreshCommand = newOnRefreshCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND, oldOnRefreshCommand, newOnRefreshCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnRefreshCommand(Command newOnRefreshCommand) {
		if (newOnRefreshCommand != onRefreshCommand) {
			NotificationChain msgs = null;
			if (onRefreshCommand != null)
				msgs = ((InternalEObject)onRefreshCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND, null, msgs);
			if (newOnRefreshCommand != null)
				msgs = ((InternalEObject)newOnRefreshCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND, null, msgs);
			msgs = basicSetOnRefreshCommand(newOnRefreshCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND, newOnRefreshCommand, newOnRefreshCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DialogPanel> getDialogs() {
		if (dialogs == null) {
			dialogs = new EObjectContainmentEList<DialogPanel>(DialogPanel.class, this, GuigenPackage.CONTENT_PANEL__DIALOGS);
		}
		return dialogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenStates getStates() {
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStates(ScreenStates newStates, NotificationChain msgs) {
		ScreenStates oldStates = states;
		states = newStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__STATES, oldStates, newStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStates(ScreenStates newStates) {
		if (newStates != states) {
			NotificationChain msgs = null;
			if (states != null)
				msgs = ((InternalEObject)states).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__STATES, null, msgs);
			if (newStates != null)
				msgs = ((InternalEObject)newStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__STATES, null, msgs);
			msgs = basicSetStates(newStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__STATES, newStates, newStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenState getDefaultState() {
		if (defaultState != null && defaultState.eIsProxy()) {
			InternalEObject oldDefaultState = (InternalEObject)defaultState;
			defaultState = (ScreenState)eResolveProxy(oldDefaultState);
			if (defaultState != oldDefaultState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.CONTENT_PANEL__DEFAULT_STATE, oldDefaultState, defaultState));
			}
		}
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenState basicGetDefaultState() {
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultState(ScreenState newDefaultState) {
		ScreenState oldDefaultState = defaultState;
		defaultState = newDefaultState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__DEFAULT_STATE, oldDefaultState, defaultState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.CONTENT_PANEL__PANELS:
				return basicSetPanels(null, msgs);
			case GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND:
				return basicSetOnRefreshCommand(null, msgs);
			case GuigenPackage.CONTENT_PANEL__DIALOGS:
				return ((InternalEList<?>)getDialogs()).basicRemove(otherEnd, msgs);
			case GuigenPackage.CONTENT_PANEL__STATES:
				return basicSetStates(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.CONTENT_PANEL__PANELS:
				return getPanels();
			case GuigenPackage.CONTENT_PANEL__NAME:
				return getName();
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				return getAppData();
			case GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND:
				return getOnRefreshCommand();
			case GuigenPackage.CONTENT_PANEL__DIALOGS:
				return getDialogs();
			case GuigenPackage.CONTENT_PANEL__STATES:
				return getStates();
			case GuigenPackage.CONTENT_PANEL__DEFAULT_STATE:
				if (resolve) return getDefaultState();
				return basicGetDefaultState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigenPackage.CONTENT_PANEL__PANELS:
				setPanels((Panel)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				getAppData().clear();
				getAppData().addAll((Collection<? extends ApplicationData>)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND:
				setOnRefreshCommand((Command)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__DIALOGS:
				getDialogs().clear();
				getDialogs().addAll((Collection<? extends DialogPanel>)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__STATES:
				setStates((ScreenStates)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__DEFAULT_STATE:
				setDefaultState((ScreenState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuigenPackage.CONTENT_PANEL__PANELS:
				setPanels((Panel)null);
				return;
			case GuigenPackage.CONTENT_PANEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				getAppData().clear();
				return;
			case GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND:
				setOnRefreshCommand((Command)null);
				return;
			case GuigenPackage.CONTENT_PANEL__DIALOGS:
				getDialogs().clear();
				return;
			case GuigenPackage.CONTENT_PANEL__STATES:
				setStates((ScreenStates)null);
				return;
			case GuigenPackage.CONTENT_PANEL__DEFAULT_STATE:
				setDefaultState((ScreenState)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuigenPackage.CONTENT_PANEL__PANELS:
				return panels != null;
			case GuigenPackage.CONTENT_PANEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				return appData != null && !appData.isEmpty();
			case GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND:
				return onRefreshCommand != null;
			case GuigenPackage.CONTENT_PANEL__DIALOGS:
				return dialogs != null && !dialogs.isEmpty();
			case GuigenPackage.CONTENT_PANEL__STATES:
				return states != null;
			case GuigenPackage.CONTENT_PANEL__DEFAULT_STATE:
				return defaultState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContentPanelImpl
