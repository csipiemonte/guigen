/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.PDefParamVal;
import it.csi.mddtools.guigen.PanelDef;
import it.csi.mddtools.guigen.PanelDefUse;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel Def Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefUseImpl#getPanelDef <em>Panel Def</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelDefUseImpl#getParamValues <em>Param Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PanelDefUseImpl extends PanelImpl implements PanelDefUse {
	/**
	 * The cached value of the '{@link #getPanelDef() <em>Panel Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelDef()
	 * @generated
	 * @ordered
	 */
	protected PanelDef panelDef;

	/**
	 * The cached value of the '{@link #getParamValues() <em>Param Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PDefParamVal> paramValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanelDefUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.PANEL_DEF_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelDef getPanelDef() {
		if (panelDef != null && panelDef.eIsProxy()) {
			InternalEObject oldPanelDef = (InternalEObject)panelDef;
			panelDef = (PanelDef)eResolveProxy(oldPanelDef);
			if (panelDef != oldPanelDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.PANEL_DEF_USE__PANEL_DEF, oldPanelDef, panelDef));
			}
		}
		return panelDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelDef basicGetPanelDef() {
		return panelDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelDef(PanelDef newPanelDef) {
		PanelDef oldPanelDef = panelDef;
		panelDef = newPanelDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL_DEF_USE__PANEL_DEF, oldPanelDef, panelDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDefParamVal> getParamValues() {
		if (paramValues == null) {
			paramValues = new EObjectContainmentEList<PDefParamVal>(PDefParamVal.class, this, GuigenPackage.PANEL_DEF_USE__PARAM_VALUES);
		}
		return paramValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.PANEL_DEF_USE__PARAM_VALUES:
				return ((InternalEList<?>)getParamValues()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.PANEL_DEF_USE__PANEL_DEF:
				if (resolve) return getPanelDef();
				return basicGetPanelDef();
			case GuigenPackage.PANEL_DEF_USE__PARAM_VALUES:
				return getParamValues();
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
			case GuigenPackage.PANEL_DEF_USE__PANEL_DEF:
				setPanelDef((PanelDef)newValue);
				return;
			case GuigenPackage.PANEL_DEF_USE__PARAM_VALUES:
				getParamValues().clear();
				getParamValues().addAll((Collection<? extends PDefParamVal>)newValue);
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
			case GuigenPackage.PANEL_DEF_USE__PANEL_DEF:
				setPanelDef((PanelDef)null);
				return;
			case GuigenPackage.PANEL_DEF_USE__PARAM_VALUES:
				getParamValues().clear();
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
			case GuigenPackage.PANEL_DEF_USE__PANEL_DEF:
				return panelDef != null;
			case GuigenPackage.PANEL_DEF_USE__PARAM_VALUES:
				return paramValues != null && !paramValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PanelDefUseImpl
