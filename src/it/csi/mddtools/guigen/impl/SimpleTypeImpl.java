/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.SimpleTypeCodes;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl#isNillable <em>Nillable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl#isUserDefined <em>User Defined</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl#getDataTypeModifiers <em>Data Type Modifiers</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SimpleTypeImpl#getEditHintMsg <em>Edit Hint Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTypeImpl extends TypeImpl implements SimpleType {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleTypeCodes CODE_EDEFAULT = SimpleTypeCodes.INT;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected SimpleTypeCodes code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NILLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected boolean nillable = NILLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserDefined() <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_DEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserDefined() <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDefined()
	 * @generated
	 * @ordered
	 */
	protected boolean userDefined = USER_DEFINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataTypeModifiers() <em>Data Type Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataTypeModifiers;

	/**
	 * The default value of the '{@link #getEditHintMsg() <em>Edit Hint Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditHintMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_HINT_MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditHintMsg() <em>Edit Hint Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditHintMsg()
	 * @generated
	 * @ordered
	 */
	protected String editHintMsg = EDIT_HINT_MSG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeCodes getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(SimpleTypeCodes newCode) {
		SimpleTypeCodes oldCode = code;
		code = newCode == null ? CODE_EDEFAULT : newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SIMPLE_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNillable() {
		return nillable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNillable(boolean newNillable) {
		boolean oldNillable = nillable;
		nillable = newNillable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SIMPLE_TYPE__NILLABLE, oldNillable, nillable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserDefined() {
		return userDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefined(boolean newUserDefined) {
		boolean oldUserDefined = userDefined;
		userDefined = newUserDefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SIMPLE_TYPE__USER_DEFINED, oldUserDefined, userDefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDataTypeModifiers() {
		if (dataTypeModifiers == null) {
			dataTypeModifiers = new EDataTypeUniqueEList<String>(String.class, this, GuigenPackage.SIMPLE_TYPE__DATA_TYPE_MODIFIERS);
		}
		return dataTypeModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditHintMsg() {
		return editHintMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditHintMsg(String newEditHintMsg) {
		String oldEditHintMsg = editHintMsg;
		editHintMsg = newEditHintMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SIMPLE_TYPE__EDIT_HINT_MSG, oldEditHintMsg, editHintMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.SIMPLE_TYPE__CODE:
				return getCode();
			case GuigenPackage.SIMPLE_TYPE__NILLABLE:
				return isNillable();
			case GuigenPackage.SIMPLE_TYPE__USER_DEFINED:
				return isUserDefined();
			case GuigenPackage.SIMPLE_TYPE__DATA_TYPE_MODIFIERS:
				return getDataTypeModifiers();
			case GuigenPackage.SIMPLE_TYPE__EDIT_HINT_MSG:
				return getEditHintMsg();
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
			case GuigenPackage.SIMPLE_TYPE__CODE:
				setCode((SimpleTypeCodes)newValue);
				return;
			case GuigenPackage.SIMPLE_TYPE__NILLABLE:
				setNillable((Boolean)newValue);
				return;
			case GuigenPackage.SIMPLE_TYPE__USER_DEFINED:
				setUserDefined((Boolean)newValue);
				return;
			case GuigenPackage.SIMPLE_TYPE__DATA_TYPE_MODIFIERS:
				getDataTypeModifiers().clear();
				getDataTypeModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case GuigenPackage.SIMPLE_TYPE__EDIT_HINT_MSG:
				setEditHintMsg((String)newValue);
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
			case GuigenPackage.SIMPLE_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GuigenPackage.SIMPLE_TYPE__NILLABLE:
				setNillable(NILLABLE_EDEFAULT);
				return;
			case GuigenPackage.SIMPLE_TYPE__USER_DEFINED:
				setUserDefined(USER_DEFINED_EDEFAULT);
				return;
			case GuigenPackage.SIMPLE_TYPE__DATA_TYPE_MODIFIERS:
				getDataTypeModifiers().clear();
				return;
			case GuigenPackage.SIMPLE_TYPE__EDIT_HINT_MSG:
				setEditHintMsg(EDIT_HINT_MSG_EDEFAULT);
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
			case GuigenPackage.SIMPLE_TYPE__CODE:
				return code != CODE_EDEFAULT;
			case GuigenPackage.SIMPLE_TYPE__NILLABLE:
				return nillable != NILLABLE_EDEFAULT;
			case GuigenPackage.SIMPLE_TYPE__USER_DEFINED:
				return userDefined != USER_DEFINED_EDEFAULT;
			case GuigenPackage.SIMPLE_TYPE__DATA_TYPE_MODIFIERS:
				return dataTypeModifiers != null && !dataTypeModifiers.isEmpty();
			case GuigenPackage.SIMPLE_TYPE__EDIT_HINT_MSG:
				return EDIT_HINT_MSG_EDEFAULT == null ? editHintMsg != null : !EDIT_HINT_MSG_EDEFAULT.equals(editHintMsg);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", nillable: ");
		result.append(nillable);
		result.append(", userDefined: ");
		result.append(userDefined);
		result.append(", dataTypeModifiers: ");
		result.append(dataTypeModifiers);
		result.append(", editHintMsg: ");
		result.append(editHintMsg);
		result.append(')');
		return result.toString();
	}

} //SimpleTypeImpl
