/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#isSortable <em>Sortable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#isEventActive <em>Event Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getEditableFlagSelector <em>Editable Flag Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getMultidataKeySelector <em>Multidata Key Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getMultidataValueSelector <em>Multidata Value Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getMultidataPropertySelector <em>Multidata Property Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getActiveFlagSelector <em>Active Flag Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getFieldMaxLength <em>Field Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected String selector = SELECTOR_EDEFAULT;

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
	 * The default value of the '{@link #isSortable() <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SORTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSortable() <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortable()
	 * @generated
	 * @ordered
	 */
	protected boolean sortable = SORTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEventActive() <em>Event Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVENT_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEventActive() <em>Event Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventActive()
	 * @generated
	 * @ordered
	 */
	protected boolean eventActive = EVENT_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditableFlagSelector() <em>Editable Flag Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditableFlagSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITABLE_FLAG_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditableFlagSelector() <em>Editable Flag Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditableFlagSelector()
	 * @generated
	 * @ordered
	 */
	protected String editableFlagSelector = EDITABLE_FLAG_SELECTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiDataBinding() <em>Multi Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiDataBinding()
	 * @generated
	 * @ordered
	 */
	protected AppDataBinding multiDataBinding;

	/**
	 * The default value of the '{@link #getMultidataKeySelector() <em>Multidata Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultidataKeySelector()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIDATA_KEY_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultidataKeySelector() <em>Multidata Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultidataKeySelector()
	 * @generated
	 * @ordered
	 */
	protected String multidataKeySelector = MULTIDATA_KEY_SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultidataValueSelector() <em>Multidata Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultidataValueSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIDATA_VALUE_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultidataValueSelector() <em>Multidata Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultidataValueSelector()
	 * @generated
	 * @ordered
	 */
	protected String multidataValueSelector = MULTIDATA_VALUE_SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultidataPropertySelector() <em>Multidata Property Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultidataPropertySelector()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIDATA_PROPERTY_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultidataPropertySelector() <em>Multidata Property Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultidataPropertySelector()
	 * @generated
	 * @ordered
	 */
	protected String multidataPropertySelector = MULTIDATA_PROPERTY_SELECTOR_EDEFAULT;

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
	 * The default value of the '{@link #getActiveFlagSelector() <em>Active Flag Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFlagSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_FLAG_SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveFlagSelector() <em>Active Flag Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFlagSelector()
	 * @generated
	 * @ordered
	 */
	protected String activeFlagSelector = ACTIVE_FLAG_SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldMaxLength() <em>Field Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int FIELD_MAX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFieldMaxLength() <em>Field Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int fieldMaxLength = FIELD_MAX_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		String oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__SELECTOR, oldSelector, selector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSortable() {
		return sortable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortable(boolean newSortable) {
		boolean oldSortable = sortable;
		sortable = newSortable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__SORTABLE, oldSortable, sortable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEventActive() {
		return eventActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventActive(boolean newEventActive) {
		boolean oldEventActive = eventActive;
		eventActive = newEventActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__EVENT_ACTIVE, oldEventActive, eventActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditableFlagSelector() {
		return editableFlagSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditableFlagSelector(String newEditableFlagSelector) {
		String oldEditableFlagSelector = editableFlagSelector;
		editableFlagSelector = newEditableFlagSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__EDITABLE_FLAG_SELECTOR, oldEditableFlagSelector, editableFlagSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDataBinding getMultiDataBinding() {
		return multiDataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiDataBinding(AppDataBinding newMultiDataBinding, NotificationChain msgs) {
		AppDataBinding oldMultiDataBinding = multiDataBinding;
		multiDataBinding = newMultiDataBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__MULTI_DATA_BINDING, oldMultiDataBinding, newMultiDataBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiDataBinding(AppDataBinding newMultiDataBinding) {
		if (newMultiDataBinding != multiDataBinding) {
			NotificationChain msgs = null;
			if (multiDataBinding != null)
				msgs = ((InternalEObject)multiDataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.COLUMN__MULTI_DATA_BINDING, null, msgs);
			if (newMultiDataBinding != null)
				msgs = ((InternalEObject)newMultiDataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.COLUMN__MULTI_DATA_BINDING, null, msgs);
			msgs = basicSetMultiDataBinding(newMultiDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__MULTI_DATA_BINDING, newMultiDataBinding, newMultiDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultidataKeySelector() {
		return multidataKeySelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultidataKeySelector(String newMultidataKeySelector) {
		String oldMultidataKeySelector = multidataKeySelector;
		multidataKeySelector = newMultidataKeySelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__MULTIDATA_KEY_SELECTOR, oldMultidataKeySelector, multidataKeySelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultidataValueSelector() {
		return multidataValueSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultidataValueSelector(String newMultidataValueSelector) {
		String oldMultidataValueSelector = multidataValueSelector;
		multidataValueSelector = newMultidataValueSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__MULTIDATA_VALUE_SELECTOR, oldMultidataValueSelector, multidataValueSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultidataPropertySelector() {
		return multidataPropertySelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultidataPropertySelector(String newMultidataPropertySelector) {
		String oldMultidataPropertySelector = multidataPropertySelector;
		multidataPropertySelector = newMultidataPropertySelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__MULTIDATA_PROPERTY_SELECTOR, oldMultidataPropertySelector, multidataPropertySelector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiveFlagSelector() {
		return activeFlagSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveFlagSelector(String newActiveFlagSelector) {
		String oldActiveFlagSelector = activeFlagSelector;
		activeFlagSelector = newActiveFlagSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__ACTIVE_FLAG_SELECTOR, oldActiveFlagSelector, activeFlagSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFieldMaxLength() {
		return fieldMaxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldMaxLength(int newFieldMaxLength) {
		int oldFieldMaxLength = fieldMaxLength;
		fieldMaxLength = newFieldMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__FIELD_MAX_LENGTH, oldFieldMaxLength, fieldMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.COLUMN__MULTI_DATA_BINDING:
				return basicSetMultiDataBinding(null, msgs);
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
			case GuigenPackage.COLUMN__SELECTOR:
				return getSelector();
			case GuigenPackage.COLUMN__LABEL:
				return getLabel();
			case GuigenPackage.COLUMN__SORTABLE:
				return isSortable();
			case GuigenPackage.COLUMN__EDITABLE:
				return isEditable();
			case GuigenPackage.COLUMN__EVENT_ACTIVE:
				return isEventActive();
			case GuigenPackage.COLUMN__EDITABLE_FLAG_SELECTOR:
				return getEditableFlagSelector();
			case GuigenPackage.COLUMN__MULTI_DATA_BINDING:
				return getMultiDataBinding();
			case GuigenPackage.COLUMN__MULTIDATA_KEY_SELECTOR:
				return getMultidataKeySelector();
			case GuigenPackage.COLUMN__MULTIDATA_VALUE_SELECTOR:
				return getMultidataValueSelector();
			case GuigenPackage.COLUMN__MULTIDATA_PROPERTY_SELECTOR:
				return getMultidataPropertySelector();
			case GuigenPackage.COLUMN__TOOLTIP:
				return getTooltip();
			case GuigenPackage.COLUMN__ACTIVE_FLAG_SELECTOR:
				return getActiveFlagSelector();
			case GuigenPackage.COLUMN__FIELD_MAX_LENGTH:
				return getFieldMaxLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigenPackage.COLUMN__SELECTOR:
				setSelector((String)newValue);
				return;
			case GuigenPackage.COLUMN__LABEL:
				setLabel((String)newValue);
				return;
			case GuigenPackage.COLUMN__SORTABLE:
				setSortable((Boolean)newValue);
				return;
			case GuigenPackage.COLUMN__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case GuigenPackage.COLUMN__EVENT_ACTIVE:
				setEventActive((Boolean)newValue);
				return;
			case GuigenPackage.COLUMN__EDITABLE_FLAG_SELECTOR:
				setEditableFlagSelector((String)newValue);
				return;
			case GuigenPackage.COLUMN__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.COLUMN__MULTIDATA_KEY_SELECTOR:
				setMultidataKeySelector((String)newValue);
				return;
			case GuigenPackage.COLUMN__MULTIDATA_VALUE_SELECTOR:
				setMultidataValueSelector((String)newValue);
				return;
			case GuigenPackage.COLUMN__MULTIDATA_PROPERTY_SELECTOR:
				setMultidataPropertySelector((String)newValue);
				return;
			case GuigenPackage.COLUMN__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case GuigenPackage.COLUMN__ACTIVE_FLAG_SELECTOR:
				setActiveFlagSelector((String)newValue);
				return;
			case GuigenPackage.COLUMN__FIELD_MAX_LENGTH:
				setFieldMaxLength((Integer)newValue);
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
			case GuigenPackage.COLUMN__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__SORTABLE:
				setSortable(SORTABLE_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__EVENT_ACTIVE:
				setEventActive(EVENT_ACTIVE_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__EDITABLE_FLAG_SELECTOR:
				setEditableFlagSelector(EDITABLE_FLAG_SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)null);
				return;
			case GuigenPackage.COLUMN__MULTIDATA_KEY_SELECTOR:
				setMultidataKeySelector(MULTIDATA_KEY_SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__MULTIDATA_VALUE_SELECTOR:
				setMultidataValueSelector(MULTIDATA_VALUE_SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__MULTIDATA_PROPERTY_SELECTOR:
				setMultidataPropertySelector(MULTIDATA_PROPERTY_SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__ACTIVE_FLAG_SELECTOR:
				setActiveFlagSelector(ACTIVE_FLAG_SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COLUMN__FIELD_MAX_LENGTH:
				setFieldMaxLength(FIELD_MAX_LENGTH_EDEFAULT);
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
			case GuigenPackage.COLUMN__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case GuigenPackage.COLUMN__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case GuigenPackage.COLUMN__SORTABLE:
				return sortable != SORTABLE_EDEFAULT;
			case GuigenPackage.COLUMN__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case GuigenPackage.COLUMN__EVENT_ACTIVE:
				return eventActive != EVENT_ACTIVE_EDEFAULT;
			case GuigenPackage.COLUMN__EDITABLE_FLAG_SELECTOR:
				return EDITABLE_FLAG_SELECTOR_EDEFAULT == null ? editableFlagSelector != null : !EDITABLE_FLAG_SELECTOR_EDEFAULT.equals(editableFlagSelector);
			case GuigenPackage.COLUMN__MULTI_DATA_BINDING:
				return multiDataBinding != null;
			case GuigenPackage.COLUMN__MULTIDATA_KEY_SELECTOR:
				return MULTIDATA_KEY_SELECTOR_EDEFAULT == null ? multidataKeySelector != null : !MULTIDATA_KEY_SELECTOR_EDEFAULT.equals(multidataKeySelector);
			case GuigenPackage.COLUMN__MULTIDATA_VALUE_SELECTOR:
				return MULTIDATA_VALUE_SELECTOR_EDEFAULT == null ? multidataValueSelector != null : !MULTIDATA_VALUE_SELECTOR_EDEFAULT.equals(multidataValueSelector);
			case GuigenPackage.COLUMN__MULTIDATA_PROPERTY_SELECTOR:
				return MULTIDATA_PROPERTY_SELECTOR_EDEFAULT == null ? multidataPropertySelector != null : !MULTIDATA_PROPERTY_SELECTOR_EDEFAULT.equals(multidataPropertySelector);
			case GuigenPackage.COLUMN__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case GuigenPackage.COLUMN__ACTIVE_FLAG_SELECTOR:
				return ACTIVE_FLAG_SELECTOR_EDEFAULT == null ? activeFlagSelector != null : !ACTIVE_FLAG_SELECTOR_EDEFAULT.equals(activeFlagSelector);
			case GuigenPackage.COLUMN__FIELD_MAX_LENGTH:
				return fieldMaxLength != FIELD_MAX_LENGTH_EDEFAULT;
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
		result.append(" (selector: ");
		result.append(selector);
		result.append(", label: ");
		result.append(label);
		result.append(", sortable: ");
		result.append(sortable);
		result.append(", editable: ");
		result.append(editable);
		result.append(", eventActive: ");
		result.append(eventActive);
		result.append(", editableFlagSelector: ");
		result.append(editableFlagSelector);
		result.append(", multidataKeySelector: ");
		result.append(multidataKeySelector);
		result.append(", multidataValueSelector: ");
		result.append(multidataValueSelector);
		result.append(", multidataPropertySelector: ");
		result.append(multidataPropertySelector);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", activeFlagSelector: ");
		result.append(activeFlagSelector);
		result.append(", fieldMaxLength: ");
		result.append(fieldMaxLength);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
