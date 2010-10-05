/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.UseCase;
import it.csi.mddtools.guigen.UseCaseMappingParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.UseCaseMappingParamImpl#getDefUseCase <em>Def Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseMappingParamImpl extends PDefParamImpl implements UseCaseMappingParam {
	/**
	 * The cached value of the '{@link #getDefUseCase() <em>Def Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefUseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase defUseCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseMappingParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.USE_CASE_MAPPING_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getDefUseCase() {
		if (defUseCase != null && defUseCase.eIsProxy()) {
			InternalEObject oldDefUseCase = (InternalEObject)defUseCase;
			defUseCase = (UseCase)eResolveProxy(oldDefUseCase);
			if (defUseCase != oldDefUseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.USE_CASE_MAPPING_PARAM__DEF_USE_CASE, oldDefUseCase, defUseCase));
			}
		}
		return defUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetDefUseCase() {
		return defUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefUseCase(UseCase newDefUseCase) {
		UseCase oldDefUseCase = defUseCase;
		defUseCase = newDefUseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.USE_CASE_MAPPING_PARAM__DEF_USE_CASE, oldDefUseCase, defUseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.USE_CASE_MAPPING_PARAM__DEF_USE_CASE:
				if (resolve) return getDefUseCase();
				return basicGetDefUseCase();
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
			case GuigenPackage.USE_CASE_MAPPING_PARAM__DEF_USE_CASE:
				setDefUseCase((UseCase)newValue);
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
			case GuigenPackage.USE_CASE_MAPPING_PARAM__DEF_USE_CASE:
				setDefUseCase((UseCase)null);
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
			case GuigenPackage.USE_CASE_MAPPING_PARAM__DEF_USE_CASE:
				return defUseCase != null;
		}
		return super.eIsSet(featureID);
	}

} //UseCaseMappingParamImpl
