/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GUIBehaviors;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GUIStructure;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GUI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getBeahviors <em>Beahviors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GUIModelImpl extends EObjectImpl implements GUIModel {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected GUIStructure structure;

	/**
	 * The cached value of the '{@link #getBeahviors() <em>Beahviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeahviors()
	 * @generated
	 * @ordered
	 */
	protected GUIBehaviors beahviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.GUI_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(GUIStructure newStructure, NotificationChain msgs) {
		GUIStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(GUIStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIBehaviors getBeahviors() {
		return beahviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeahviors(GUIBehaviors newBeahviors, NotificationChain msgs) {
		GUIBehaviors oldBeahviors = beahviors;
		beahviors = newBeahviors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__BEAHVIORS, oldBeahviors, newBeahviors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeahviors(GUIBehaviors newBeahviors) {
		if (newBeahviors != beahviors) {
			NotificationChain msgs = null;
			if (beahviors != null)
				msgs = ((InternalEObject)beahviors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__BEAHVIORS, null, msgs);
			if (newBeahviors != null)
				msgs = ((InternalEObject)newBeahviors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__BEAHVIORS, null, msgs);
			msgs = basicSetBeahviors(newBeahviors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__BEAHVIORS, newBeahviors, newBeahviors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				return basicSetStructure(null, msgs);
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				return basicSetBeahviors(null, msgs);
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				return getStructure();
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				return getBeahviors();
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				setStructure((GUIStructure)newValue);
				return;
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				setBeahviors((GUIBehaviors)newValue);
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				setStructure((GUIStructure)null);
				return;
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				setBeahviors((GUIBehaviors)null);
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				return structure != null;
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				return beahviors != null;
		}
		return super.eIsSet(featureID);
	}

} //GUIModelImpl
