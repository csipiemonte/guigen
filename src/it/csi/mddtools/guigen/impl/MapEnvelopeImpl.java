/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MapEnvelope;
import it.csi.mddtools.guigen.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Envelope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapEnvelopeImpl#getNorthEast <em>North East</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapEnvelopeImpl#getSouthWest <em>South West</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapEnvelopeImpl extends EObjectImpl implements MapEnvelope {
	/**
	 * The cached value of the '{@link #getNorthEast() <em>North East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorthEast()
	 * @generated
	 * @ordered
	 */
	protected Point northEast;

	/**
	 * The cached value of the '{@link #getSouthWest() <em>South West</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouthWest()
	 * @generated
	 * @ordered
	 */
	protected Point southWest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapEnvelopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.MAP_ENVELOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getNorthEast() {
		return northEast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNorthEast(Point newNorthEast, NotificationChain msgs) {
		Point oldNorthEast = northEast;
		northEast = newNorthEast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_ENVELOPE__NORTH_EAST, oldNorthEast, newNorthEast);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorthEast(Point newNorthEast) {
		if (newNorthEast != northEast) {
			NotificationChain msgs = null;
			if (northEast != null)
				msgs = ((InternalEObject)northEast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_ENVELOPE__NORTH_EAST, null, msgs);
			if (newNorthEast != null)
				msgs = ((InternalEObject)newNorthEast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_ENVELOPE__NORTH_EAST, null, msgs);
			msgs = basicSetNorthEast(newNorthEast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_ENVELOPE__NORTH_EAST, newNorthEast, newNorthEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getSouthWest() {
		return southWest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouthWest(Point newSouthWest, NotificationChain msgs) {
		Point oldSouthWest = southWest;
		southWest = newSouthWest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_ENVELOPE__SOUTH_WEST, oldSouthWest, newSouthWest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouthWest(Point newSouthWest) {
		if (newSouthWest != southWest) {
			NotificationChain msgs = null;
			if (southWest != null)
				msgs = ((InternalEObject)southWest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_ENVELOPE__SOUTH_WEST, null, msgs);
			if (newSouthWest != null)
				msgs = ((InternalEObject)newSouthWest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_ENVELOPE__SOUTH_WEST, null, msgs);
			msgs = basicSetSouthWest(newSouthWest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_ENVELOPE__SOUTH_WEST, newSouthWest, newSouthWest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.MAP_ENVELOPE__NORTH_EAST:
				return basicSetNorthEast(null, msgs);
			case GuigenPackage.MAP_ENVELOPE__SOUTH_WEST:
				return basicSetSouthWest(null, msgs);
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
			case GuigenPackage.MAP_ENVELOPE__NORTH_EAST:
				return getNorthEast();
			case GuigenPackage.MAP_ENVELOPE__SOUTH_WEST:
				return getSouthWest();
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
			case GuigenPackage.MAP_ENVELOPE__NORTH_EAST:
				setNorthEast((Point)newValue);
				return;
			case GuigenPackage.MAP_ENVELOPE__SOUTH_WEST:
				setSouthWest((Point)newValue);
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
			case GuigenPackage.MAP_ENVELOPE__NORTH_EAST:
				setNorthEast((Point)null);
				return;
			case GuigenPackage.MAP_ENVELOPE__SOUTH_WEST:
				setSouthWest((Point)null);
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
			case GuigenPackage.MAP_ENVELOPE__NORTH_EAST:
				return northEast != null;
			case GuigenPackage.MAP_ENVELOPE__SOUTH_WEST:
				return southWest != null;
		}
		return super.eIsSet(featureID);
	}

} //MapEnvelopeImpl
