/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ColumnModel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableImpl#getColumnModel <em>Column Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends DataWidgetImpl implements Table {
	/**
	 * The cached value of the '{@link #getColumnModel() <em>Column Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnModel()
	 * @generated
	 * @ordered
	 */
	protected ColumnModel columnModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnModel getColumnModel() {
		return columnModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnModel(ColumnModel newColumnModel, NotificationChain msgs) {
		ColumnModel oldColumnModel = columnModel;
		columnModel = newColumnModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__COLUMN_MODEL, oldColumnModel, newColumnModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnModel(ColumnModel newColumnModel) {
		if (newColumnModel != columnModel) {
			NotificationChain msgs = null;
			if (columnModel != null)
				msgs = ((InternalEObject)columnModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TABLE__COLUMN_MODEL, null, msgs);
			if (newColumnModel != null)
				msgs = ((InternalEObject)newColumnModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TABLE__COLUMN_MODEL, null, msgs);
			msgs = basicSetColumnModel(newColumnModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__COLUMN_MODEL, newColumnModel, newColumnModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.TABLE__COLUMN_MODEL:
				return basicSetColumnModel(null, msgs);
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
			case GuigenPackage.TABLE__COLUMN_MODEL:
				return getColumnModel();
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
			case GuigenPackage.TABLE__COLUMN_MODEL:
				setColumnModel((ColumnModel)newValue);
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
			case GuigenPackage.TABLE__COLUMN_MODEL:
				setColumnModel((ColumnModel)null);
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
			case GuigenPackage.TABLE__COLUMN_MODEL:
				return columnModel != null;
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
