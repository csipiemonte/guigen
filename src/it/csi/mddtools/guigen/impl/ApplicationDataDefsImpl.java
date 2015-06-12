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

import it.csi.mddtools.guigen.AppDataGroup;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ApplicationDataDefs;
import it.csi.mddtools.guigen.GuigenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Data Defs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl#getAppData <em>App Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationDataDefsImpl#getExtGroups <em>Ext Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationDataDefsImpl extends EObjectImpl implements ApplicationDataDefs {
	/**
	 * The cached value of the '{@link #getAppData() <em>App Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppData()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationData> appData;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<AppDataGroup> groups;

	/**
	 * The cached value of the '{@link #getExtGroups() <em>Ext Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<AppDataGroup> extGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDataDefsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.APPLICATION_DATA_DEFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getAppData() {
		if (appData == null) {
			appData = new EObjectContainmentEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.APPLICATION_DATA_DEFS__APP_DATA);
		}
		return appData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppDataGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<AppDataGroup>(AppDataGroup.class, this, GuigenPackage.APPLICATION_DATA_DEFS__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppDataGroup> getExtGroups() {
		if (extGroups == null) {
			extGroups = new EObjectResolvingEList<AppDataGroup>(AppDataGroup.class, this, GuigenPackage.APPLICATION_DATA_DEFS__EXT_GROUPS);
		}
		return extGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.APPLICATION_DATA_DEFS__APP_DATA:
				return ((InternalEList<?>)getAppData()).basicRemove(otherEnd, msgs);
			case GuigenPackage.APPLICATION_DATA_DEFS__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.APPLICATION_DATA_DEFS__APP_DATA:
				return getAppData();
			case GuigenPackage.APPLICATION_DATA_DEFS__GROUPS:
				return getGroups();
			case GuigenPackage.APPLICATION_DATA_DEFS__EXT_GROUPS:
				return getExtGroups();
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
			case GuigenPackage.APPLICATION_DATA_DEFS__APP_DATA:
				getAppData().clear();
				getAppData().addAll((Collection<? extends ApplicationData>)newValue);
				return;
			case GuigenPackage.APPLICATION_DATA_DEFS__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends AppDataGroup>)newValue);
				return;
			case GuigenPackage.APPLICATION_DATA_DEFS__EXT_GROUPS:
				getExtGroups().clear();
				getExtGroups().addAll((Collection<? extends AppDataGroup>)newValue);
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
			case GuigenPackage.APPLICATION_DATA_DEFS__APP_DATA:
				getAppData().clear();
				return;
			case GuigenPackage.APPLICATION_DATA_DEFS__GROUPS:
				getGroups().clear();
				return;
			case GuigenPackage.APPLICATION_DATA_DEFS__EXT_GROUPS:
				getExtGroups().clear();
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
			case GuigenPackage.APPLICATION_DATA_DEFS__APP_DATA:
				return appData != null && !appData.isEmpty();
			case GuigenPackage.APPLICATION_DATA_DEFS__GROUPS:
				return groups != null && !groups.isEmpty();
			case GuigenPackage.APPLICATION_DATA_DEFS__EXT_GROUPS:
				return extGroups != null && !extGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationDataDefsImpl
