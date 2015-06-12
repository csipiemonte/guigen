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
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.TextField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TextFieldImpl#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TextFieldImpl#getFieldLength <em>Field Length</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TextFieldImpl#getFieldMaxLength <em>Field Max Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFieldImpl extends DataWidgetImpl implements TextField {
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
	 * The default value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLength()
	 * @generated
	 * @ordered
	 */
	protected static final int FIELD_LENGTH_EDEFAULT = 15;

	/**
	 * The cached value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLength()
	 * @generated
	 * @ordered
	 */
	protected int fieldLength = FIELD_LENGTH_EDEFAULT;

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
	protected TextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TEXT_FIELD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING, oldMultiDataBinding, newMultiDataBinding);
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
				msgs = ((InternalEObject)multiDataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING, null, msgs);
			if (newMultiDataBinding != null)
				msgs = ((InternalEObject)newMultiDataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING, null, msgs);
			msgs = basicSetMultiDataBinding(newMultiDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING, newMultiDataBinding, newMultiDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFieldLength() {
		return fieldLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldLength(int newFieldLength) {
		int oldFieldLength = fieldLength;
		fieldLength = newFieldLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TEXT_FIELD__FIELD_LENGTH, oldFieldLength, fieldLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TEXT_FIELD__FIELD_MAX_LENGTH, oldFieldMaxLength, fieldMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING:
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
			case GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING:
				return getMultiDataBinding();
			case GuigenPackage.TEXT_FIELD__FIELD_LENGTH:
				return getFieldLength();
			case GuigenPackage.TEXT_FIELD__FIELD_MAX_LENGTH:
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
			case GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.TEXT_FIELD__FIELD_LENGTH:
				setFieldLength((Integer)newValue);
				return;
			case GuigenPackage.TEXT_FIELD__FIELD_MAX_LENGTH:
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
			case GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)null);
				return;
			case GuigenPackage.TEXT_FIELD__FIELD_LENGTH:
				setFieldLength(FIELD_LENGTH_EDEFAULT);
				return;
			case GuigenPackage.TEXT_FIELD__FIELD_MAX_LENGTH:
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
			case GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING:
				return multiDataBinding != null;
			case GuigenPackage.TEXT_FIELD__FIELD_LENGTH:
				return fieldLength != FIELD_LENGTH_EDEFAULT;
			case GuigenPackage.TEXT_FIELD__FIELD_MAX_LENGTH:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiDataWidget.class) {
			switch (derivedFeatureID) {
				case GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING: return GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING;
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
				case GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING: return GuigenPackage.TEXT_FIELD__MULTI_DATA_BINDING;
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
		result.append(" (fieldLength: ");
		result.append(fieldLength);
		result.append(", fieldMaxLength: ");
		result.append(fieldMaxLength);
		result.append(')');
		return result.toString();
	}

} //TextFieldImpl
