/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MapEnvelope;
import it.csi.mddtools.guigen.MapView;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getMapId <em>Map Id</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getStartEnvelopeSpec <em>Start Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getMaxEnvelopeSpec <em>Max Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getScaleEnvelopeSpec <em>Scale Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getNumLevels <em>Num Levels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapViewImpl extends DataWidgetImpl implements MapView {
	/**
	 * The default value of the '{@link #getMapId() <em>Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapId() <em>Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapId()
	 * @generated
	 * @ordered
	 */
	protected String mapId = MAP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartEnvelopeSpec() <em>Start Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEnvelopeSpec()
	 * @generated
	 * @ordered
	 */
	protected MapEnvelope startEnvelopeSpec;

	/**
	 * The cached value of the '{@link #getMaxEnvelopeSpec() <em>Max Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEnvelopeSpec()
	 * @generated
	 * @ordered
	 */
	protected MapEnvelope maxEnvelopeSpec;

	/**
	 * The cached value of the '{@link #getScaleEnvelopeSpec() <em>Scale Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleEnvelopeSpec()
	 * @generated
	 * @ordered
	 */
	protected MapEnvelope scaleEnvelopeSpec;

	/**
	 * The default value of the '{@link #getNumLevels() <em>Num Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLevels()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_LEVELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumLevels() <em>Num Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLevels()
	 * @generated
	 * @ordered
	 */
	protected int numLevels = NUM_LEVELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.MAP_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapId() {
		return mapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapId(String newMapId) {
		String oldMapId = mapId;
		mapId = newMapId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MAP_ID, oldMapId, mapId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapEnvelope getStartEnvelopeSpec() {
		return startEnvelopeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartEnvelopeSpec(MapEnvelope newStartEnvelopeSpec, NotificationChain msgs) {
		MapEnvelope oldStartEnvelopeSpec = startEnvelopeSpec;
		startEnvelopeSpec = newStartEnvelopeSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, oldStartEnvelopeSpec, newStartEnvelopeSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEnvelopeSpec(MapEnvelope newStartEnvelopeSpec) {
		if (newStartEnvelopeSpec != startEnvelopeSpec) {
			NotificationChain msgs = null;
			if (startEnvelopeSpec != null)
				msgs = ((InternalEObject)startEnvelopeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, null, msgs);
			if (newStartEnvelopeSpec != null)
				msgs = ((InternalEObject)newStartEnvelopeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, null, msgs);
			msgs = basicSetStartEnvelopeSpec(newStartEnvelopeSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, newStartEnvelopeSpec, newStartEnvelopeSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapEnvelope getMaxEnvelopeSpec() {
		return maxEnvelopeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxEnvelopeSpec(MapEnvelope newMaxEnvelopeSpec, NotificationChain msgs) {
		MapEnvelope oldMaxEnvelopeSpec = maxEnvelopeSpec;
		maxEnvelopeSpec = newMaxEnvelopeSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, oldMaxEnvelopeSpec, newMaxEnvelopeSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEnvelopeSpec(MapEnvelope newMaxEnvelopeSpec) {
		if (newMaxEnvelopeSpec != maxEnvelopeSpec) {
			NotificationChain msgs = null;
			if (maxEnvelopeSpec != null)
				msgs = ((InternalEObject)maxEnvelopeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, null, msgs);
			if (newMaxEnvelopeSpec != null)
				msgs = ((InternalEObject)newMaxEnvelopeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, null, msgs);
			msgs = basicSetMaxEnvelopeSpec(newMaxEnvelopeSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, newMaxEnvelopeSpec, newMaxEnvelopeSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapEnvelope getScaleEnvelopeSpec() {
		return scaleEnvelopeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleEnvelopeSpec(MapEnvelope newScaleEnvelopeSpec, NotificationChain msgs) {
		MapEnvelope oldScaleEnvelopeSpec = scaleEnvelopeSpec;
		scaleEnvelopeSpec = newScaleEnvelopeSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, oldScaleEnvelopeSpec, newScaleEnvelopeSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleEnvelopeSpec(MapEnvelope newScaleEnvelopeSpec) {
		if (newScaleEnvelopeSpec != scaleEnvelopeSpec) {
			NotificationChain msgs = null;
			if (scaleEnvelopeSpec != null)
				msgs = ((InternalEObject)scaleEnvelopeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, null, msgs);
			if (newScaleEnvelopeSpec != null)
				msgs = ((InternalEObject)newScaleEnvelopeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, null, msgs);
			msgs = basicSetScaleEnvelopeSpec(newScaleEnvelopeSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, newScaleEnvelopeSpec, newScaleEnvelopeSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumLevels() {
		return numLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumLevels(int newNumLevels) {
		int oldNumLevels = numLevels;
		numLevels = newNumLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__NUM_LEVELS, oldNumLevels, numLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				return basicSetStartEnvelopeSpec(null, msgs);
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				return basicSetMaxEnvelopeSpec(null, msgs);
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				return basicSetScaleEnvelopeSpec(null, msgs);
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
			case GuigenPackage.MAP_VIEW__MAP_ID:
				return getMapId();
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				return getStartEnvelopeSpec();
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				return getMaxEnvelopeSpec();
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				return getScaleEnvelopeSpec();
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				return getNumLevels();
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
			case GuigenPackage.MAP_VIEW__MAP_ID:
				setMapId((String)newValue);
				return;
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				setStartEnvelopeSpec((MapEnvelope)newValue);
				return;
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				setMaxEnvelopeSpec((MapEnvelope)newValue);
				return;
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				setScaleEnvelopeSpec((MapEnvelope)newValue);
				return;
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				setNumLevels((Integer)newValue);
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
			case GuigenPackage.MAP_VIEW__MAP_ID:
				setMapId(MAP_ID_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				setStartEnvelopeSpec((MapEnvelope)null);
				return;
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				setMaxEnvelopeSpec((MapEnvelope)null);
				return;
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				setScaleEnvelopeSpec((MapEnvelope)null);
				return;
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				setNumLevels(NUM_LEVELS_EDEFAULT);
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
			case GuigenPackage.MAP_VIEW__MAP_ID:
				return MAP_ID_EDEFAULT == null ? mapId != null : !MAP_ID_EDEFAULT.equals(mapId);
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				return startEnvelopeSpec != null;
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				return maxEnvelopeSpec != null;
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				return scaleEnvelopeSpec != null;
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				return numLevels != NUM_LEVELS_EDEFAULT;
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
		result.append(" (mapId: ");
		result.append(mapId);
		result.append(", numLevels: ");
		result.append(numLevels);
		result.append(')');
		return result.toString();
	}

} //MapViewImpl
