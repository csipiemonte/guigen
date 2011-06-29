/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.CommandOnPanels;
import it.csi.mddtools.guigen.CommandOnWidgets;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.RefreshViewCommand;
import it.csi.mddtools.guigen.Widget;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refresh View Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.RefreshViewCommandImpl#getTargetWidgets <em>Target Widgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.RefreshViewCommandImpl#getTargetPanels <em>Target Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefreshViewCommandImpl extends CommandImpl implements RefreshViewCommand {
	/**
	 * The cached value of the '{@link #getTargetWidgets() <em>Target Widgets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> targetWidgets;

	/**
	 * The cached value of the '{@link #getTargetPanels() <em>Target Panels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPanels()
	 * @generated
	 * @ordered
	 */
	protected EList<Panel> targetPanels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefreshViewCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.REFRESH_VIEW_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getTargetWidgets() {
		if (targetWidgets == null) {
			targetWidgets = new EObjectResolvingEList<Widget>(Widget.class, this, GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_WIDGETS);
		}
		return targetWidgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Panel> getTargetPanels() {
		if (targetPanels == null) {
			targetPanels = new EObjectResolvingEList<Panel>(Panel.class, this, GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_PANELS);
		}
		return targetPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_WIDGETS:
				return getTargetWidgets();
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_PANELS:
				return getTargetPanels();
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
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_WIDGETS:
				getTargetWidgets().clear();
				getTargetWidgets().addAll((Collection<? extends Widget>)newValue);
				return;
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_PANELS:
				getTargetPanels().clear();
				getTargetPanels().addAll((Collection<? extends Panel>)newValue);
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
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_WIDGETS:
				getTargetWidgets().clear();
				return;
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_PANELS:
				getTargetPanels().clear();
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
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_WIDGETS:
				return targetWidgets != null && !targetWidgets.isEmpty();
			case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_PANELS:
				return targetPanels != null && !targetPanels.isEmpty();
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
		if (baseClass == CommandOnWidgets.class) {
			switch (derivedFeatureID) {
				case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_WIDGETS: return GuigenPackage.COMMAND_ON_WIDGETS__TARGET_WIDGETS;
				default: return -1;
			}
		}
		if (baseClass == CommandOnPanels.class) {
			switch (derivedFeatureID) {
				case GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_PANELS: return GuigenPackage.COMMAND_ON_PANELS__TARGET_PANELS;
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
		if (baseClass == CommandOnWidgets.class) {
			switch (baseFeatureID) {
				case GuigenPackage.COMMAND_ON_WIDGETS__TARGET_WIDGETS: return GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_WIDGETS;
				default: return -1;
			}
		}
		if (baseClass == CommandOnPanels.class) {
			switch (baseFeatureID) {
				case GuigenPackage.COMMAND_ON_PANELS__TARGET_PANELS: return GuigenPackage.REFRESH_VIEW_COMMAND__TARGET_PANELS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RefreshViewCommandImpl
