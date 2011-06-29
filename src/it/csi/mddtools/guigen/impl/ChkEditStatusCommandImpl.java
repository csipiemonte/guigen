/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ChkEditStatusCommand;
import it.csi.mddtools.guigen.CommandOutcome;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.LogicAggregationTypes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Edit Status Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl#getDataChecked <em>Data Checked</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl#getCheckAggregation <em>Check Aggregation</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl#getDoIfChanged <em>Do If Changed</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ChkEditStatusCommandImpl#getDoIfNotChanged <em>Do If Not Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChkEditStatusCommandImpl extends CommandImpl implements ChkEditStatusCommand {
	/**
	 * The cached value of the '{@link #getDataChecked() <em>Data Checked</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataChecked()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationData> dataChecked;

	/**
	 * The default value of the '{@link #getCheckAggregation() <em>Check Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final LogicAggregationTypes CHECK_AGGREGATION_EDEFAULT = LogicAggregationTypes.OR;

	/**
	 * The cached value of the '{@link #getCheckAggregation() <em>Check Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckAggregation()
	 * @generated
	 * @ordered
	 */
	protected LogicAggregationTypes checkAggregation = CHECK_AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoIfChanged() <em>Do If Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoIfChanged()
	 * @generated
	 * @ordered
	 */
	protected CommandOutcome doIfChanged;

	/**
	 * The cached value of the '{@link #getDoIfNotChanged() <em>Do If Not Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoIfNotChanged()
	 * @generated
	 * @ordered
	 */
	protected CommandOutcome doIfNotChanged;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChkEditStatusCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getDataChecked() {
		if (dataChecked == null) {
			dataChecked = new EObjectResolvingEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.CHK_EDIT_STATUS_COMMAND__DATA_CHECKED);
		}
		return dataChecked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicAggregationTypes getCheckAggregation() {
		return checkAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckAggregation(LogicAggregationTypes newCheckAggregation) {
		LogicAggregationTypes oldCheckAggregation = checkAggregation;
		checkAggregation = newCheckAggregation == null ? CHECK_AGGREGATION_EDEFAULT : newCheckAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION, oldCheckAggregation, checkAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandOutcome getDoIfChanged() {
		return doIfChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoIfChanged(CommandOutcome newDoIfChanged, NotificationChain msgs) {
		CommandOutcome oldDoIfChanged = doIfChanged;
		doIfChanged = newDoIfChanged;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED, oldDoIfChanged, newDoIfChanged);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoIfChanged(CommandOutcome newDoIfChanged) {
		if (newDoIfChanged != doIfChanged) {
			NotificationChain msgs = null;
			if (doIfChanged != null)
				msgs = ((InternalEObject)doIfChanged).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED, null, msgs);
			if (newDoIfChanged != null)
				msgs = ((InternalEObject)newDoIfChanged).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED, null, msgs);
			msgs = basicSetDoIfChanged(newDoIfChanged, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED, newDoIfChanged, newDoIfChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandOutcome getDoIfNotChanged() {
		return doIfNotChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoIfNotChanged(CommandOutcome newDoIfNotChanged, NotificationChain msgs) {
		CommandOutcome oldDoIfNotChanged = doIfNotChanged;
		doIfNotChanged = newDoIfNotChanged;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED, oldDoIfNotChanged, newDoIfNotChanged);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoIfNotChanged(CommandOutcome newDoIfNotChanged) {
		if (newDoIfNotChanged != doIfNotChanged) {
			NotificationChain msgs = null;
			if (doIfNotChanged != null)
				msgs = ((InternalEObject)doIfNotChanged).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED, null, msgs);
			if (newDoIfNotChanged != null)
				msgs = ((InternalEObject)newDoIfNotChanged).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED, null, msgs);
			msgs = basicSetDoIfNotChanged(newDoIfNotChanged, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED, newDoIfNotChanged, newDoIfNotChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED:
				return basicSetDoIfChanged(null, msgs);
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED:
				return basicSetDoIfNotChanged(null, msgs);
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
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DATA_CHECKED:
				return getDataChecked();
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION:
				return getCheckAggregation();
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED:
				return getDoIfChanged();
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED:
				return getDoIfNotChanged();
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
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DATA_CHECKED:
				getDataChecked().clear();
				getDataChecked().addAll((Collection<? extends ApplicationData>)newValue);
				return;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION:
				setCheckAggregation((LogicAggregationTypes)newValue);
				return;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED:
				setDoIfChanged((CommandOutcome)newValue);
				return;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED:
				setDoIfNotChanged((CommandOutcome)newValue);
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
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DATA_CHECKED:
				getDataChecked().clear();
				return;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION:
				setCheckAggregation(CHECK_AGGREGATION_EDEFAULT);
				return;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED:
				setDoIfChanged((CommandOutcome)null);
				return;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED:
				setDoIfNotChanged((CommandOutcome)null);
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
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DATA_CHECKED:
				return dataChecked != null && !dataChecked.isEmpty();
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION:
				return checkAggregation != CHECK_AGGREGATION_EDEFAULT;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED:
				return doIfChanged != null;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED:
				return doIfNotChanged != null;
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
		result.append(" (checkAggregation: ");
		result.append(checkAggregation);
		result.append(')');
		return result.toString();
	}

} //ChkEditStatusCommandImpl
