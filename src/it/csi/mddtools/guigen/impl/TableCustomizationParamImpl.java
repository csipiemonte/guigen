/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TableCustomizationParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Customization Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableCustomizationParamImpl#getBaseTable <em>Base Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableCustomizationParamImpl extends PDefParamImpl implements TableCustomizationParam {
	/**
	 * The cached value of the '{@link #getBaseTable() <em>Base Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTable()
	 * @generated
	 * @ordered
	 */
	protected Table baseTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCustomizationParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TABLE_CUSTOMIZATION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getBaseTable() {
		if (baseTable != null && baseTable.eIsProxy()) {
			InternalEObject oldBaseTable = (InternalEObject)baseTable;
			baseTable = (Table)eResolveProxy(oldBaseTable);
			if (baseTable != oldBaseTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE, oldBaseTable, baseTable));
			}
		}
		return baseTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetBaseTable() {
		return baseTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTable(Table newBaseTable) {
		Table oldBaseTable = baseTable;
		baseTable = newBaseTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE, oldBaseTable, baseTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE:
				if (resolve) return getBaseTable();
				return basicGetBaseTable();
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
			case GuigenPackage.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE:
				setBaseTable((Table)newValue);
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
			case GuigenPackage.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE:
				setBaseTable((Table)null);
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
			case GuigenPackage.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE:
				return baseTable != null;
		}
		return super.eIsSet(featureID);
	}

} //TableCustomizationParamImpl
