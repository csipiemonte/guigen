/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.OPAUTHSSO;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPAUTHSSO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.OPAUTHSSOImpl#getMinAuthLevel <em>Min Auth Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPAUTHSSOImpl extends AutenticationMethodImpl implements OPAUTHSSO {
	/**
	 * The default value of the '{@link #getMinAuthLevel() <em>Min Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAuthLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_AUTH_LEVEL_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getMinAuthLevel() <em>Min Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAuthLevel()
	 * @generated
	 * @ordered
	 */
	protected int minAuthLevel = MIN_AUTH_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPAUTHSSOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.OPAUTHSSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinAuthLevel() {
		return minAuthLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAuthLevel(int newMinAuthLevel) {
		int oldMinAuthLevel = minAuthLevel;
		minAuthLevel = newMinAuthLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.OPAUTHSSO__MIN_AUTH_LEVEL, oldMinAuthLevel, minAuthLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.OPAUTHSSO__MIN_AUTH_LEVEL:
				return getMinAuthLevel();
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
			case GuigenPackage.OPAUTHSSO__MIN_AUTH_LEVEL:
				setMinAuthLevel((Integer)newValue);
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
			case GuigenPackage.OPAUTHSSO__MIN_AUTH_LEVEL:
				setMinAuthLevel(MIN_AUTH_LEVEL_EDEFAULT);
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
			case GuigenPackage.OPAUTHSSO__MIN_AUTH_LEVEL:
				return minAuthLevel != MIN_AUTH_LEVEL_EDEFAULT;
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
		result.append(" (minAuthLevel: ");
		result.append(minAuthLevel);
		result.append(')');
		return result.toString();
	}

} //OPAUTHSSOImpl
