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
import it.csi.mddtools.guigen.DataWidget;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.DataWidgetImpl#getDataTypeModifier <em>Data Type Modifier</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.DataWidgetImpl#getDatabinding <em>Databinding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.DataWidgetImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.DataWidgetImpl#isRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataWidgetImpl extends WidgetImpl implements DataWidget {
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
	 * The cached value of the '{@link #getDatabinding() <em>Databinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabinding()
	 * @generated
	 * @ordered
	 */
	protected AppDataBinding databinding;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Type dataType;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

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
	public Type getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (Type)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.DATA_WIDGET__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(Type newDataType) {
		Type oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.DATA_WIDGET__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.DATA_WIDGET__REQUIRED, oldRequired, required));
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
	public AppDataBinding getDatabinding() {
		return databinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabinding(AppDataBinding newDatabinding, NotificationChain msgs) {
		AppDataBinding oldDatabinding = databinding;
		databinding = newDatabinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.DATA_WIDGET__DATABINDING, oldDatabinding, newDatabinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabinding(AppDataBinding newDatabinding) {
		if (newDatabinding != databinding) {
			NotificationChain msgs = null;
			if (databinding != null)
				msgs = ((InternalEObject)databinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.DATA_WIDGET__DATABINDING, null, msgs);
			if (newDatabinding != null)
				msgs = ((InternalEObject)newDatabinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.DATA_WIDGET__DATABINDING, null, msgs);
			msgs = basicSetDatabinding(newDatabinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.DATA_WIDGET__DATABINDING, newDatabinding, newDatabinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.DATA_WIDGET__DATABINDING:
				return basicSetDatabinding(null, msgs);
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
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				return getDataTypeModifier();
			case GuigenPackage.DATA_WIDGET__DATABINDING:
				return getDatabinding();
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case GuigenPackage.DATA_WIDGET__REQUIRED:
				return isRequired();
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
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				setDataTypeModifier((String)newValue);
				return;
			case GuigenPackage.DATA_WIDGET__DATABINDING:
				setDatabinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				setDataType((Type)newValue);
				return;
			case GuigenPackage.DATA_WIDGET__REQUIRED:
				setRequired((Boolean)newValue);
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
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				setDataTypeModifier(DATA_TYPE_MODIFIER_EDEFAULT);
				return;
			case GuigenPackage.DATA_WIDGET__DATABINDING:
				setDatabinding((AppDataBinding)null);
				return;
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				setDataType((Type)null);
				return;
			case GuigenPackage.DATA_WIDGET__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case GuigenPackage.DATA_WIDGET__DATA_TYPE_MODIFIER:
				return DATA_TYPE_MODIFIER_EDEFAULT == null ? dataTypeModifier != null : !DATA_TYPE_MODIFIER_EDEFAULT.equals(dataTypeModifier);
			case GuigenPackage.DATA_WIDGET__DATABINDING:
				return databinding != null;
			case GuigenPackage.DATA_WIDGET__DATA_TYPE:
				return dataType != null;
			case GuigenPackage.DATA_WIDGET__REQUIRED:
				return required != REQUIRED_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataTypeModifier: ");
		result.append(dataTypeModifier);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //DataWidgetImpl
