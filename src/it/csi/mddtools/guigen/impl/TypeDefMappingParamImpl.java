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
import it.csi.mddtools.guigen.TypeDefMappingParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Def Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TypeDefMappingParamImpl#getDefTypeDef <em>Def Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefMappingParamImpl extends PDefParamImpl implements TypeDefMappingParam {
	/**
	 * The cached value of the '{@link #getDefTypeDef() <em>Def Type Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefTypeDef()
	 * @generated
	 * @ordered
	 */
	protected Type defTypeDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefMappingParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TYPE_DEF_MAPPING_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDefTypeDef() {
		if (defTypeDef != null && defTypeDef.eIsProxy()) {
			InternalEObject oldDefTypeDef = (InternalEObject)defTypeDef;
			defTypeDef = (Type)eResolveProxy(oldDefTypeDef);
			if (defTypeDef != oldDefTypeDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF, oldDefTypeDef, defTypeDef));
			}
		}
		return defTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetDefTypeDef() {
		return defTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefTypeDef(Type newDefTypeDef) {
		Type oldDefTypeDef = defTypeDef;
		defTypeDef = newDefTypeDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF, oldDefTypeDef, defTypeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF:
				if (resolve) return getDefTypeDef();
				return basicGetDefTypeDef();
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
			case GuigenPackage.TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF:
				setDefTypeDef((Type)newValue);
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
			case GuigenPackage.TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF:
				setDefTypeDef((Type)null);
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
			case GuigenPackage.TYPE_DEF_MAPPING_PARAM__DEF_TYPE_DEF:
				return defTypeDef != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeDefMappingParamImpl
