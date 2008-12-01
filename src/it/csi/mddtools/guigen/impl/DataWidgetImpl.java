/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.WidgetDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.DataWidgetImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.DataWidgetImpl#getDataTypeModifier <em>Data Type Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataWidgetImpl extends WidgetImpl implements DataWidget {
	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final WidgetDataType DATA_TYPE_EDEFAULT = WidgetDataType.STRINGA;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected WidgetDataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataTypeModifier() <em>Data Type Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataTypeModifier() <em>Data Type Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeModifier()
	 * @generated
	 * @ordered
	 */
	protected String dataTypeModifier = DATA_TYPE_MODIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.DATA_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetDataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(WidgetDataType newDataType) {
		WidgetDataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.DATA_WIDGET__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataTypeModifier() {
		return dataTypeModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeModifier(String newDataTypeModifier) {
		String oldDataTypeModifier = dataTypeModifier;
		dataTypeModifier = newDataTypeModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER, oldDataTypeModifier, dataTypeModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				return getDataType();
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				return getDataTypeModifier();
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
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				setDataType((WidgetDataType)newValue);
				return;
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				setDataTypeModifier((String)newValue);
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
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				setDataTypeModifier(DATA_TYPE_MODIFIER_EDEFAULT);
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
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				return DATA_TYPE_MODIFIER_EDEFAULT == null ? dataTypeModifier != null : !DATA_TYPE_MODIFIER_EDEFAULT.equals(dataTypeModifier);
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
		result.append(" (dataType: ");
		result.append(dataType);
		result.append(", dataTypeModifier: ");
		result.append(dataTypeModifier);
		result.append(')');
		return result.toString();
	}

} //DataWidgetImpl
