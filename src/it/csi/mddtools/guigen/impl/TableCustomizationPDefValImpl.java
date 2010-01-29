/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.Column;
import it.csi.mddtools.guigen.ExtraColumn;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.TableCustomizationPDefVal;

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
 * An implementation of the model object '<em><b>Table Customization PDef Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableCustomizationPDefValImpl#getExtraCols <em>Extra Cols</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableCustomizationPDefValImpl#getHiddenCols <em>Hidden Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableCustomizationPDefValImpl extends PDefParamValImpl implements TableCustomizationPDefVal {
	/**
	 * The cached value of the '{@link #getExtraCols() <em>Extra Cols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraCols()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtraColumn> extraCols;

	/**
	 * The cached value of the '{@link #getHiddenCols() <em>Hidden Cols</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenCols()
	 * @generated
	 * @ordered
	 */
	protected Column hiddenCols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCustomizationPDefValImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TABLE_CUSTOMIZATION_PDEF_VAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtraColumn> getExtraCols() {
		if (extraCols == null) {
			extraCols = new EObjectContainmentEList<ExtraColumn>(ExtraColumn.class, this, GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS);
		}
		return extraCols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getHiddenCols() {
		if (hiddenCols != null && hiddenCols.eIsProxy()) {
			InternalEObject oldHiddenCols = (InternalEObject)hiddenCols;
			hiddenCols = (Column)eResolveProxy(oldHiddenCols);
			if (hiddenCols != oldHiddenCols) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS, oldHiddenCols, hiddenCols));
			}
		}
		return hiddenCols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetHiddenCols() {
		return hiddenCols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenCols(Column newHiddenCols) {
		Column oldHiddenCols = hiddenCols;
		hiddenCols = newHiddenCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS, oldHiddenCols, hiddenCols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS:
				return ((InternalEList<?>)getExtraCols()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS:
				return getExtraCols();
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS:
				if (resolve) return getHiddenCols();
				return basicGetHiddenCols();
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
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS:
				getExtraCols().clear();
				getExtraCols().addAll((Collection<? extends ExtraColumn>)newValue);
				return;
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS:
				setHiddenCols((Column)newValue);
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
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS:
				getExtraCols().clear();
				return;
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS:
				setHiddenCols((Column)null);
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
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__EXTRA_COLS:
				return extraCols != null && !extraCols.isEmpty();
			case GuigenPackage.TABLE_CUSTOMIZATION_PDEF_VAL__HIDDEN_COLS:
				return hiddenCols != null;
		}
		return super.eIsSet(featureID);
	}

} //TableCustomizationPDefValImpl
