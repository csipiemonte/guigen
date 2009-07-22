/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.ScreenState;
import it.csi.mddtools.guigen.Widget;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ScreenStateImpl#getWidgetsOn <em>Widgets On</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ScreenStateImpl#getWidgetsVisible <em>Widgets Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenStateImpl extends EObjectImpl implements ScreenState {
	/**
	 * The cached value of the '{@link #getWidgetsOn() <em>Widgets On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgetsOn;

	/**
	 * The cached value of the '{@link #getWidgetsVisible() <em>Widgets Visible</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetsVisible()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgetsVisible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.SCREEN_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgetsOn() {
		if (widgetsOn == null) {
			widgetsOn = new EObjectResolvingEList<Widget>(Widget.class, this, GuigenPackage.SCREEN_STATE__WIDGETS_ON);
		}
		return widgetsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgetsVisible() {
		if (widgetsVisible == null) {
			widgetsVisible = new EObjectResolvingEList<Widget>(Widget.class, this, GuigenPackage.SCREEN_STATE__WIDGETS_VISIBLE);
		}
		return widgetsVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.SCREEN_STATE__WIDGETS_ON:
				return getWidgetsOn();
			case GuigenPackage.SCREEN_STATE__WIDGETS_VISIBLE:
				return getWidgetsVisible();
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
			case GuigenPackage.SCREEN_STATE__WIDGETS_ON:
				getWidgetsOn().clear();
				getWidgetsOn().addAll((Collection<? extends Widget>)newValue);
				return;
			case GuigenPackage.SCREEN_STATE__WIDGETS_VISIBLE:
				getWidgetsVisible().clear();
				getWidgetsVisible().addAll((Collection<? extends Widget>)newValue);
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
			case GuigenPackage.SCREEN_STATE__WIDGETS_ON:
				getWidgetsOn().clear();
				return;
			case GuigenPackage.SCREEN_STATE__WIDGETS_VISIBLE:
				getWidgetsVisible().clear();
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
			case GuigenPackage.SCREEN_STATE__WIDGETS_ON:
				return widgetsOn != null && !widgetsOn.isEmpty();
			case GuigenPackage.SCREEN_STATE__WIDGETS_VISIBLE:
				return widgetsVisible != null && !widgetsVisible.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScreenStateImpl
