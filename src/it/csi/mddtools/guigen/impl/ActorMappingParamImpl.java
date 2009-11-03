/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.ActorMappingParam;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ActorMappingParamImpl#getDefActor <em>Def Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorMappingParamImpl extends PDefParamImpl implements ActorMappingParam {
	/**
	 * The cached value of the '{@link #getDefActor() <em>Def Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefActor()
	 * @generated
	 * @ordered
	 */
	protected Actor defActor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorMappingParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.ACTOR_MAPPING_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getDefActor() {
		if (defActor != null && defActor.eIsProxy()) {
			InternalEObject oldDefActor = (InternalEObject)defActor;
			defActor = (Actor)eResolveProxy(oldDefActor);
			if (defActor != oldDefActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.ACTOR_MAPPING_PARAM__DEF_ACTOR, oldDefActor, defActor));
			}
		}
		return defActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetDefActor() {
		return defActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefActor(Actor newDefActor) {
		Actor oldDefActor = defActor;
		defActor = newDefActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.ACTOR_MAPPING_PARAM__DEF_ACTOR, oldDefActor, defActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.ACTOR_MAPPING_PARAM__DEF_ACTOR:
				if (resolve) return getDefActor();
				return basicGetDefActor();
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
			case GuigenPackage.ACTOR_MAPPING_PARAM__DEF_ACTOR:
				setDefActor((Actor)newValue);
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
			case GuigenPackage.ACTOR_MAPPING_PARAM__DEF_ACTOR:
				setDefActor((Actor)null);
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
			case GuigenPackage.ACTOR_MAPPING_PARAM__DEF_ACTOR:
				return defActor != null;
		}
		return super.eIsSet(featureID);
	}

} //ActorMappingParamImpl
