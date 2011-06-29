/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.CommandOnPanels;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Panel;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command On Panels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.CommandOnPanelsImpl#getTargetPanels <em>Target Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommandOnPanelsImpl extends CommandImpl implements CommandOnPanels {
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
	protected CommandOnPanelsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.COMMAND_ON_PANELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Panel> getTargetPanels() {
		if (targetPanels == null) {
			targetPanels = new EObjectResolvingEList<Panel>(Panel.class, this, GuigenPackage.COMMAND_ON_PANELS__TARGET_PANELS);
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
			case GuigenPackage.COMMAND_ON_PANELS__TARGET_PANELS:
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
			case GuigenPackage.COMMAND_ON_PANELS__TARGET_PANELS:
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
			case GuigenPackage.COMMAND_ON_PANELS__TARGET_PANELS:
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
			case GuigenPackage.COMMAND_ON_PANELS__TARGET_PANELS:
				return targetPanels != null && !targetPanels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandOnPanelsImpl
