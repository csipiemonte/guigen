/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.WizardPanel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.WizardPanelImpl#isNavigatorActive <em>Navigator Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WizardPanelImpl extends MultiPanelImpl implements WizardPanel {
	/**
	 * The default value of the '{@link #isNavigatorActive() <em>Navigator Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigatorActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGATOR_ACTIVE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isNavigatorActive() <em>Navigator Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigatorActive()
	 * @generated
	 * @ordered
	 */
	protected boolean navigatorActive = NAVIGATOR_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.WIZARD_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigatorActive() {
		return navigatorActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigatorActive(boolean newNavigatorActive) {
		boolean oldNavigatorActive = navigatorActive;
		navigatorActive = newNavigatorActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE, oldNavigatorActive, navigatorActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				return isNavigatorActive();
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
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				setNavigatorActive((Boolean)newValue);
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
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				setNavigatorActive(NAVIGATOR_ACTIVE_EDEFAULT);
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
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				return navigatorActive != NAVIGATOR_ACTIVE_EDEFAULT;
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
		result.append(" (navigatorActive: ");
		result.append(navigatorActive);
		result.append(')');
		return result.toString();
	}

} //WizardPanelImpl
