/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link it.csi.mddtools.guigen.impl.ColumnImpl#getEditable <em>Editable</em>}</li>
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
	 * The default value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected String editable = EDITABLE_EDEFAULT;

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
	public String getEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(String newEditable) {
		String oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COLUMN__EDITABLE, oldEditable, editable));
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
				return isSortable() ? Boolean.TRUE : Boolean.FALSE;
			case GuigenPackage.COLUMN__EDITABLE:
				return getEditable();
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
				setSortable(((Boolean)newValue).booleanValue());
				return;
			case GuigenPackage.COLUMN__EDITABLE:
				setEditable((String)newValue);
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
				return EDITABLE_EDEFAULT == null ? editable != null : !EDITABLE_EDEFAULT.equals(editable);
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
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
