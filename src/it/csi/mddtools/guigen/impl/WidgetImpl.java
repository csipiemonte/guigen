/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.UISecurityConstraint;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WidgetLayoutSpecifier;

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
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#getLayoutSpec <em>Layout Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#getSecurityConstraints <em>Security Constraints</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#isDefaultVisible <em>Default Visible</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#isDefaultEnabled <em>Default Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetImpl#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WidgetImpl extends EObjectImpl implements Widget {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayoutSpec() <em>Layout Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutSpec()
	 * @generated
	 * @ordered
	 */
	protected WidgetLayoutSpecifier layoutSpec;

	/**
	 * The cached value of the '{@link #getEventHandlers() <em>Event Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<EventHandler> eventHandlers;

	/**
	 * The cached value of the '{@link #getSecurityConstraints() <em>Security Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<UISecurityConstraint> securityConstraints;

	/**
	 * The default value of the '{@link #isDefaultVisible() <em>Default Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDefaultVisible() <em>Default Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultVisible = DEFAULT_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultEnabled() <em>Default Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDefaultEnabled() <em>Default Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultEnabled = DEFAULT_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.WIDGET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGET__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetLayoutSpecifier getLayoutSpec() {
		return layoutSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutSpec(WidgetLayoutSpecifier newLayoutSpec, NotificationChain msgs) {
		WidgetLayoutSpecifier oldLayoutSpec = layoutSpec;
		layoutSpec = newLayoutSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGET__LAYOUT_SPEC, oldLayoutSpec, newLayoutSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutSpec(WidgetLayoutSpecifier newLayoutSpec) {
		if (newLayoutSpec != layoutSpec) {
			NotificationChain msgs = null;
			if (layoutSpec != null)
				msgs = ((InternalEObject)layoutSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WIDGET__LAYOUT_SPEC, null, msgs);
			if (newLayoutSpec != null)
				msgs = ((InternalEObject)newLayoutSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WIDGET__LAYOUT_SPEC, null, msgs);
			msgs = basicSetLayoutSpec(newLayoutSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGET__LAYOUT_SPEC, newLayoutSpec, newLayoutSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventHandler> getEventHandlers() {
		if (eventHandlers == null) {
			eventHandlers = new EObjectContainmentEList<EventHandler>(EventHandler.class, this, GuigenPackage.WIDGET__EVENT_HANDLERS);
		}
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UISecurityConstraint> getSecurityConstraints() {
		if (securityConstraints == null) {
			securityConstraints = new EObjectContainmentEList<UISecurityConstraint>(UISecurityConstraint.class, this, GuigenPackage.WIDGET__SECURITY_CONSTRAINTS);
		}
		return securityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultVisible() {
		return defaultVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultVisible(boolean newDefaultVisible) {
		boolean oldDefaultVisible = defaultVisible;
		defaultVisible = newDefaultVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGET__DEFAULT_VISIBLE, oldDefaultVisible, defaultVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultEnabled() {
		return defaultEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultEnabled(boolean newDefaultEnabled) {
		boolean oldDefaultEnabled = defaultEnabled;
		defaultEnabled = newDefaultEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGET__DEFAULT_ENABLED, oldDefaultEnabled, defaultEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGET__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.WIDGET__LAYOUT_SPEC:
				return basicSetLayoutSpec(null, msgs);
			case GuigenPackage.WIDGET__EVENT_HANDLERS:
				return ((InternalEList<?>)getEventHandlers()).basicRemove(otherEnd, msgs);
			case GuigenPackage.WIDGET__SECURITY_CONSTRAINTS:
				return ((InternalEList<?>)getSecurityConstraints()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.WIDGET__NAME:
				return getName();
			case GuigenPackage.WIDGET__LABEL:
				return getLabel();
			case GuigenPackage.WIDGET__LAYOUT_SPEC:
				return getLayoutSpec();
			case GuigenPackage.WIDGET__EVENT_HANDLERS:
				return getEventHandlers();
			case GuigenPackage.WIDGET__SECURITY_CONSTRAINTS:
				return getSecurityConstraints();
			case GuigenPackage.WIDGET__DEFAULT_VISIBLE:
				return isDefaultVisible();
			case GuigenPackage.WIDGET__DEFAULT_ENABLED:
				return isDefaultEnabled();
			case GuigenPackage.WIDGET__TOOLTIP:
				return getTooltip();
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
			case GuigenPackage.WIDGET__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.WIDGET__LABEL:
				setLabel((String)newValue);
				return;
			case GuigenPackage.WIDGET__LAYOUT_SPEC:
				setLayoutSpec((WidgetLayoutSpecifier)newValue);
				return;
			case GuigenPackage.WIDGET__EVENT_HANDLERS:
				getEventHandlers().clear();
				getEventHandlers().addAll((Collection<? extends EventHandler>)newValue);
				return;
			case GuigenPackage.WIDGET__SECURITY_CONSTRAINTS:
				getSecurityConstraints().clear();
				getSecurityConstraints().addAll((Collection<? extends UISecurityConstraint>)newValue);
				return;
			case GuigenPackage.WIDGET__DEFAULT_VISIBLE:
				setDefaultVisible((Boolean)newValue);
				return;
			case GuigenPackage.WIDGET__DEFAULT_ENABLED:
				setDefaultEnabled((Boolean)newValue);
				return;
			case GuigenPackage.WIDGET__TOOLTIP:
				setTooltip((String)newValue);
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
			case GuigenPackage.WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.WIDGET__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GuigenPackage.WIDGET__LAYOUT_SPEC:
				setLayoutSpec((WidgetLayoutSpecifier)null);
				return;
			case GuigenPackage.WIDGET__EVENT_HANDLERS:
				getEventHandlers().clear();
				return;
			case GuigenPackage.WIDGET__SECURITY_CONSTRAINTS:
				getSecurityConstraints().clear();
				return;
			case GuigenPackage.WIDGET__DEFAULT_VISIBLE:
				setDefaultVisible(DEFAULT_VISIBLE_EDEFAULT);
				return;
			case GuigenPackage.WIDGET__DEFAULT_ENABLED:
				setDefaultEnabled(DEFAULT_ENABLED_EDEFAULT);
				return;
			case GuigenPackage.WIDGET__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
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
			case GuigenPackage.WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.WIDGET__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case GuigenPackage.WIDGET__LAYOUT_SPEC:
				return layoutSpec != null;
			case GuigenPackage.WIDGET__EVENT_HANDLERS:
				return eventHandlers != null && !eventHandlers.isEmpty();
			case GuigenPackage.WIDGET__SECURITY_CONSTRAINTS:
				return securityConstraints != null && !securityConstraints.isEmpty();
			case GuigenPackage.WIDGET__DEFAULT_VISIBLE:
				return defaultVisible != DEFAULT_VISIBLE_EDEFAULT;
			case GuigenPackage.WIDGET__DEFAULT_ENABLED:
				return defaultEnabled != DEFAULT_ENABLED_EDEFAULT;
			case GuigenPackage.WIDGET__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
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
		result.append(", label: ");
		result.append(label);
		result.append(", defaultVisible: ");
		result.append(defaultVisible);
		result.append(", defaultEnabled: ");
		result.append(defaultEnabled);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
