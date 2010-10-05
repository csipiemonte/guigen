/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.ComboBox;
import it.csi.mddtools.guigen.GuigenPackage;

import it.csi.mddtools.guigen.MultiDataWidget;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComboBoxImpl#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComboBoxImpl#getKeySelector <em>Key Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComboBoxImpl#getValueSelector <em>Value Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComboBoxImpl#isOmitHeaderValue <em>Omit Header Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComboBoxImpl extends DataWidgetImpl implements ComboBox {
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
	 * The default value of the '{@link #getKeySelector() <em>Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySelector()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_SELECTOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKeySelector() <em>Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySelector()
	 * @generated
	 * @ordered
	 */
	protected String keySelector = KEY_SELECTOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getValueSelector() <em>Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SELECTOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValueSelector() <em>Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSelector()
	 * @generated
	 * @ordered
	 */
	protected String valueSelector = VALUE_SELECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitHeaderValue() <em>Omit Header Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitHeaderValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_HEADER_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitHeaderValue() <em>Omit Header Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitHeaderValue()
	 * @generated
	 * @ordered
	 */
	protected boolean omitHeaderValue = OMIT_HEADER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.COMBO_BOX;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING, oldMultiDataBinding, newMultiDataBinding);
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
				msgs = ((InternalEObject)multiDataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING, null, msgs);
			if (newMultiDataBinding != null)
				msgs = ((InternalEObject)newMultiDataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING, null, msgs);
			msgs = basicSetMultiDataBinding(newMultiDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING, newMultiDataBinding, newMultiDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeySelector() {
		return keySelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeySelector(String newKeySelector) {
		String oldKeySelector = keySelector;
		keySelector = newKeySelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COMBO_BOX__KEY_SELECTOR, oldKeySelector, keySelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSelector() {
		return valueSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSelector(String newValueSelector) {
		String oldValueSelector = valueSelector;
		valueSelector = newValueSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COMBO_BOX__VALUE_SELECTOR, oldValueSelector, valueSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitHeaderValue() {
		return omitHeaderValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitHeaderValue(boolean newOmitHeaderValue) {
		boolean oldOmitHeaderValue = omitHeaderValue;
		omitHeaderValue = newOmitHeaderValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COMBO_BOX__OMIT_HEADER_VALUE, oldOmitHeaderValue, omitHeaderValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING:
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
			case GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING:
				return getMultiDataBinding();
			case GuigenPackage.COMBO_BOX__KEY_SELECTOR:
				return getKeySelector();
			case GuigenPackage.COMBO_BOX__VALUE_SELECTOR:
				return getValueSelector();
			case GuigenPackage.COMBO_BOX__OMIT_HEADER_VALUE:
				return isOmitHeaderValue();
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
			case GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.COMBO_BOX__KEY_SELECTOR:
				setKeySelector((String)newValue);
				return;
			case GuigenPackage.COMBO_BOX__VALUE_SELECTOR:
				setValueSelector((String)newValue);
				return;
			case GuigenPackage.COMBO_BOX__OMIT_HEADER_VALUE:
				setOmitHeaderValue((Boolean)newValue);
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
			case GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)null);
				return;
			case GuigenPackage.COMBO_BOX__KEY_SELECTOR:
				setKeySelector(KEY_SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COMBO_BOX__VALUE_SELECTOR:
				setValueSelector(VALUE_SELECTOR_EDEFAULT);
				return;
			case GuigenPackage.COMBO_BOX__OMIT_HEADER_VALUE:
				setOmitHeaderValue(OMIT_HEADER_VALUE_EDEFAULT);
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
			case GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING:
				return multiDataBinding != null;
			case GuigenPackage.COMBO_BOX__KEY_SELECTOR:
				return KEY_SELECTOR_EDEFAULT == null ? keySelector != null : !KEY_SELECTOR_EDEFAULT.equals(keySelector);
			case GuigenPackage.COMBO_BOX__VALUE_SELECTOR:
				return VALUE_SELECTOR_EDEFAULT == null ? valueSelector != null : !VALUE_SELECTOR_EDEFAULT.equals(valueSelector);
			case GuigenPackage.COMBO_BOX__OMIT_HEADER_VALUE:
				return omitHeaderValue != OMIT_HEADER_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiDataWidget.class) {
			switch (derivedFeatureID) {
				case GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING: return GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiDataWidget.class) {
			switch (baseFeatureID) {
				case GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING: return GuigenPackage.COMBO_BOX__MULTI_DATA_BINDING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (keySelector: ");
		result.append(keySelector);
		result.append(", valueSelector: ");
		result.append(valueSelector);
		result.append(", omitHeaderValue: ");
		result.append(omitHeaderValue);
		result.append(')');
		return result.toString();
	}

} //ComboBoxImpl
