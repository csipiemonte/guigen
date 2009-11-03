/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.ApplicationDataDefs;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.PDefParam;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelDef;

import it.csi.mddtools.guigen.Role;
import it.csi.mddtools.guigen.Typedefs;
import it.csi.mddtools.guigen.UseCase;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getPanel <em>Panel</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getParams <em>Params</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getAppDataDefs <em>App Data Defs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getTypeDefs <em>Type Defs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefImpl#getOnRefreshCommand <em>On Refresh Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PanelDefImpl extends EObjectImpl implements PanelDef {
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
	 * The cached value of the '{@link #getPanel() <em>Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel()
	 * @generated
	 * @ordered
	 */
	protected Panel panel;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<PDefParam> params;

	/**
	 * The cached value of the '{@link #getAppDataDefs() <em>App Data Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppDataDefs()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDataDefs appDataDefs;

	/**
	 * The cached value of the '{@link #getTypeDefs() <em>Type Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefs()
	 * @generated
	 * @ordered
	 */
	protected Typedefs typeDefs;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected Role roles;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected Actor actors;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected UseCase useCases;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanelDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.PANEL_DEF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel getPanel() {
		return panel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPanel(Panel newPanel, NotificationChain msgs) {
		Panel oldPanel = panel;
		panel = newPanel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__PANEL, oldPanel, newPanel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel(Panel newPanel) {
		if (newPanel != panel) {
			NotificationChain msgs = null;
			if (panel != null)
				msgs = ((InternalEObject)panel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__PANEL, null, msgs);
			if (newPanel != null)
				msgs = ((InternalEObject)newPanel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__PANEL, null, msgs);
			msgs = basicSetPanel(newPanel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__PANEL, newPanel, newPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDefParam> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<PDefParam>(PDefParam.class, this, GuigenPackage.PANEL_DEF__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataDefs getAppDataDefs() {
		return appDataDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppDataDefs(ApplicationDataDefs newAppDataDefs, NotificationChain msgs) {
		ApplicationDataDefs oldAppDataDefs = appDataDefs;
		appDataDefs = newAppDataDefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__APP_DATA_DEFS, oldAppDataDefs, newAppDataDefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppDataDefs(ApplicationDataDefs newAppDataDefs) {
		if (newAppDataDefs != appDataDefs) {
			NotificationChain msgs = null;
			if (appDataDefs != null)
				msgs = ((InternalEObject)appDataDefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__APP_DATA_DEFS, null, msgs);
			if (newAppDataDefs != null)
				msgs = ((InternalEObject)newAppDataDefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__APP_DATA_DEFS, null, msgs);
			msgs = basicSetAppDataDefs(newAppDataDefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__APP_DATA_DEFS, newAppDataDefs, newAppDataDefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Typedefs getTypeDefs() {
		return typeDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefs(Typedefs newTypeDefs, NotificationChain msgs) {
		Typedefs oldTypeDefs = typeDefs;
		typeDefs = newTypeDefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__TYPE_DEFS, oldTypeDefs, newTypeDefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefs(Typedefs newTypeDefs) {
		if (newTypeDefs != typeDefs) {
			NotificationChain msgs = null;
			if (typeDefs != null)
				msgs = ((InternalEObject)typeDefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__TYPE_DEFS, null, msgs);
			if (newTypeDefs != null)
				msgs = ((InternalEObject)newTypeDefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__TYPE_DEFS, null, msgs);
			msgs = basicSetTypeDefs(newTypeDefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__TYPE_DEFS, newTypeDefs, newTypeDefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(Role newRoles, NotificationChain msgs) {
		Role oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(Role newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActors() {
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActors(Actor newActors, NotificationChain msgs) {
		Actor oldActors = actors;
		actors = newActors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__ACTORS, oldActors, newActors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActors(Actor newActors) {
		if (newActors != actors) {
			NotificationChain msgs = null;
			if (actors != null)
				msgs = ((InternalEObject)actors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__ACTORS, null, msgs);
			if (newActors != null)
				msgs = ((InternalEObject)newActors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__ACTORS, null, msgs);
			msgs = basicSetActors(newActors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__ACTORS, newActors, newActors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCases() {
		return useCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCases(UseCase newUseCases, NotificationChain msgs) {
		UseCase oldUseCases = useCases;
		useCases = newUseCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__USE_CASES, oldUseCases, newUseCases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCases(UseCase newUseCases) {
		if (newUseCases != useCases) {
			NotificationChain msgs = null;
			if (useCases != null)
				msgs = ((InternalEObject)useCases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__USE_CASES, null, msgs);
			if (newUseCases != null)
				msgs = ((InternalEObject)newUseCases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__USE_CASES, null, msgs);
			msgs = basicSetUseCases(newUseCases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__USE_CASES, newUseCases, newUseCases));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND, oldOnRefreshCommand, newOnRefreshCommand);
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
				msgs = ((InternalEObject)onRefreshCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND, null, msgs);
			if (newOnRefreshCommand != null)
				msgs = ((InternalEObject)newOnRefreshCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND, null, msgs);
			msgs = basicSetOnRefreshCommand(newOnRefreshCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND, newOnRefreshCommand, newOnRefreshCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.PANEL_DEF__PANEL:
				return basicSetPanel(null, msgs);
			case GuigenPackage.PANEL_DEF__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case GuigenPackage.PANEL_DEF__APP_DATA_DEFS:
				return basicSetAppDataDefs(null, msgs);
			case GuigenPackage.PANEL_DEF__TYPE_DEFS:
				return basicSetTypeDefs(null, msgs);
			case GuigenPackage.PANEL_DEF__ROLES:
				return basicSetRoles(null, msgs);
			case GuigenPackage.PANEL_DEF__ACTORS:
				return basicSetActors(null, msgs);
			case GuigenPackage.PANEL_DEF__USE_CASES:
				return basicSetUseCases(null, msgs);
			case GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND:
				return basicSetOnRefreshCommand(null, msgs);
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
			case GuigenPackage.PANEL_DEF__NAME:
				return getName();
			case GuigenPackage.PANEL_DEF__PANEL:
				return getPanel();
			case GuigenPackage.PANEL_DEF__PARAMS:
				return getParams();
			case GuigenPackage.PANEL_DEF__APP_DATA_DEFS:
				return getAppDataDefs();
			case GuigenPackage.PANEL_DEF__TYPE_DEFS:
				return getTypeDefs();
			case GuigenPackage.PANEL_DEF__ROLES:
				return getRoles();
			case GuigenPackage.PANEL_DEF__ACTORS:
				return getActors();
			case GuigenPackage.PANEL_DEF__USE_CASES:
				return getUseCases();
			case GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND:
				return getOnRefreshCommand();
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
			case GuigenPackage.PANEL_DEF__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.PANEL_DEF__PANEL:
				setPanel((Panel)newValue);
				return;
			case GuigenPackage.PANEL_DEF__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends PDefParam>)newValue);
				return;
			case GuigenPackage.PANEL_DEF__APP_DATA_DEFS:
				setAppDataDefs((ApplicationDataDefs)newValue);
				return;
			case GuigenPackage.PANEL_DEF__TYPE_DEFS:
				setTypeDefs((Typedefs)newValue);
				return;
			case GuigenPackage.PANEL_DEF__ROLES:
				setRoles((Role)newValue);
				return;
			case GuigenPackage.PANEL_DEF__ACTORS:
				setActors((Actor)newValue);
				return;
			case GuigenPackage.PANEL_DEF__USE_CASES:
				setUseCases((UseCase)newValue);
				return;
			case GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND:
				setOnRefreshCommand((Command)newValue);
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
			case GuigenPackage.PANEL_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.PANEL_DEF__PANEL:
				setPanel((Panel)null);
				return;
			case GuigenPackage.PANEL_DEF__PARAMS:
				getParams().clear();
				return;
			case GuigenPackage.PANEL_DEF__APP_DATA_DEFS:
				setAppDataDefs((ApplicationDataDefs)null);
				return;
			case GuigenPackage.PANEL_DEF__TYPE_DEFS:
				setTypeDefs((Typedefs)null);
				return;
			case GuigenPackage.PANEL_DEF__ROLES:
				setRoles((Role)null);
				return;
			case GuigenPackage.PANEL_DEF__ACTORS:
				setActors((Actor)null);
				return;
			case GuigenPackage.PANEL_DEF__USE_CASES:
				setUseCases((UseCase)null);
				return;
			case GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND:
				setOnRefreshCommand((Command)null);
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
			case GuigenPackage.PANEL_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.PANEL_DEF__PANEL:
				return panel != null;
			case GuigenPackage.PANEL_DEF__PARAMS:
				return params != null && !params.isEmpty();
			case GuigenPackage.PANEL_DEF__APP_DATA_DEFS:
				return appDataDefs != null;
			case GuigenPackage.PANEL_DEF__TYPE_DEFS:
				return typeDefs != null;
			case GuigenPackage.PANEL_DEF__ROLES:
				return roles != null;
			case GuigenPackage.PANEL_DEF__ACTORS:
				return actors != null;
			case GuigenPackage.PANEL_DEF__USE_CASES:
				return useCases != null;
			case GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND:
				return onRefreshCommand != null;
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

} //PanelDefImpl
