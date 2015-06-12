/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypeDefMappingPDefVal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Def Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TypeDefMappingPDefValImpl#getActualTypeDef <em>Actual Type Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDefMappingPDefValImpl extends PDefParamValImpl implements TypeDefMappingPDefVal {
	/**
	 * The cached value of the '{@link #getActualTypeDef() <em>Actual Type Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTypeDef()
	 * @generated
	 * @ordered
	 */
	protected Type actualTypeDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefMappingPDefValImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TYPE_DEF_MAPPING_PDEF_VAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getActualTypeDef() {
		if (actualTypeDef != null && actualTypeDef.eIsProxy()) {
			InternalEObject oldActualTypeDef = (InternalEObject)actualTypeDef;
			actualTypeDef = (Type)eResolveProxy(oldActualTypeDef);
			if (actualTypeDef != oldActualTypeDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF, oldActualTypeDef, actualTypeDef));
			}
		}
		return actualTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetActualTypeDef() {
		return actualTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualTypeDef(Type newActualTypeDef) {
		Type oldActualTypeDef = actualTypeDef;
		actualTypeDef = newActualTypeDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF, oldActualTypeDef, actualTypeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF:
				if (resolve) return getActualTypeDef();
				return basicGetActualTypeDef();
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
			case GuigenPackage.TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF:
				setActualTypeDef((Type)newValue);
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
			case GuigenPackage.TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF:
				setActualTypeDef((Type)null);
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
			case GuigenPackage.TYPE_DEF_MAPPING_PDEF_VAL__ACTUAL_TYPE_DEF:
				return actualTypeDef != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeDefMappingPDefValImpl
