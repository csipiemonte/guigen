/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.ActorMappingPDefVal;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ActorMappingPDefValImpl#getActualActor <em>Actual Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorMappingPDefValImpl extends PDefParamValImpl implements ActorMappingPDefVal {
	/**
	 * The cached value of the '{@link #getActualActor() <em>Actual Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualActor()
	 * @generated
	 * @ordered
	 */
	protected Actor actualActor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorMappingPDefValImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.ACTOR_MAPPING_PDEF_VAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActualActor() {
		if (actualActor != null && actualActor.eIsProxy()) {
			InternalEObject oldActualActor = (InternalEObject)actualActor;
			actualActor = (Actor)eResolveProxy(oldActualActor);
			if (actualActor != oldActualActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR, oldActualActor, actualActor));
			}
		}
		return actualActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActualActor() {
		return actualActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualActor(Actor newActualActor) {
		Actor oldActualActor = actualActor;
		actualActor = newActualActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR, oldActualActor, actualActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR:
				if (resolve) return getActualActor();
				return basicGetActualActor();
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
			case GuigenPackage.ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR:
				setActualActor((Actor)newValue);
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
			case GuigenPackage.ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR:
				setActualActor((Actor)null);
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
			case GuigenPackage.ACTOR_MAPPING_PDEF_VAL__ACTUAL_ACTOR:
				return actualActor != null;
		}
		return super.eIsSet(featureID);
	}

} //ActorMappingPDefValImpl
