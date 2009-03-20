/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.CustomSecurityConstraint;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Security Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.CustomSecurityConstraintImpl#getMethodNameSuffix <em>Method Name Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomSecurityConstraintImpl extends UISecurityConstraintImpl implements CustomSecurityConstraint {
	/**
	 * The default value of the '{@link #getMethodNameSuffix() <em>Method Name Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodNameSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_SUFFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMethodNameSuffix() <em>Method Name Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodNameSuffix()
	 * @generated
	 * @ordered
	 */
	protected String methodNameSuffix = METHOD_NAME_SUFFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomSecurityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.CUSTOM_SECURITY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodNameSuffix() {
		return methodNameSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodNameSuffix(String newMethodNameSuffix) {
		String oldMethodNameSuffix = methodNameSuffix;
		methodNameSuffix = newMethodNameSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX, oldMethodNameSuffix, methodNameSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX:
				return getMethodNameSuffix();
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
			case GuigenPackage.CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX:
				setMethodNameSuffix((String)newValue);
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
			case GuigenPackage.CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX:
				setMethodNameSuffix(METHOD_NAME_SUFFIX_EDEFAULT);
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
			case GuigenPackage.CUSTOM_SECURITY_CONSTRAINT__METHOD_NAME_SUFFIX:
				return METHOD_NAME_SUFFIX_EDEFAULT == null ? methodNameSuffix != null : !METHOD_NAME_SUFFIX_EDEFAULT.equals(methodNameSuffix);
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
		result.append(" (methodNameSuffix: ");
		result.append(methodNameSuffix);
		result.append(')');
		return result.toString();
	}

} //CustomSecurityConstraintImpl
