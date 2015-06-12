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

import it.csi.mddtools.guigen.ActivateMultiPanelItemCommand;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MultiPanel;

import it.csi.mddtools.guigen.Panel;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activate Multi Panel Item Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ActivateMultiPanelItemCommandImpl#getMultipanel <em>Multipanel</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ActivateMultiPanelItemCommandImpl#getActiveItem <em>Active Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivateMultiPanelItemCommandImpl extends CommandImpl implements ActivateMultiPanelItemCommand {
	/**
	 * The cached value of the '{@link #getMultipanel() <em>Multipanel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipanel()
	 * @generated
	 * @ordered
	 */
	protected MultiPanel multipanel;

	/**
	 * The cached value of the '{@link #getActiveItem() <em>Active Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveItem()
	 * @generated
	 * @ordered
	 */
	protected Panel activeItem;

	/**
	 * This is true if the Active Item reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activeItemESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivateMultiPanelItemCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.ACTIVATE_MULTI_PANEL_ITEM_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPanel getMultipanel() {
		if (multipanel != null && multipanel.eIsProxy()) {
			InternalEObject oldMultipanel = (InternalEObject)multipanel;
			multipanel = (MultiPanel)eResolveProxy(oldMultipanel);
			if (multipanel != oldMultipanel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL, oldMultipanel, multipanel));
			}
		}
		return multipanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPanel basicGetMultipanel() {
		return multipanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipanel(MultiPanel newMultipanel) {
		MultiPanel oldMultipanel = multipanel;
		multipanel = newMultipanel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL, oldMultipanel, multipanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel getActiveItem() {
		if (activeItem != null && activeItem.eIsProxy()) {
			InternalEObject oldActiveItem = (InternalEObject)activeItem;
			activeItem = (Panel)eResolveProxy(oldActiveItem);
			if (activeItem != oldActiveItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM, oldActiveItem, activeItem));
			}
		}
		return activeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel basicGetActiveItem() {
		return activeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveItem(Panel newActiveItem) {
		Panel oldActiveItem = activeItem;
		activeItem = newActiveItem;
		boolean oldActiveItemESet = activeItemESet;
		activeItemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM, oldActiveItem, activeItem, !oldActiveItemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActiveItem() {
		Panel oldActiveItem = activeItem;
		boolean oldActiveItemESet = activeItemESet;
		activeItem = null;
		activeItemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM, oldActiveItem, null, oldActiveItemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActiveItem() {
		return activeItemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL:
				if (resolve) return getMultipanel();
				return basicGetMultipanel();
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM:
				if (resolve) return getActiveItem();
				return basicGetActiveItem();
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
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL:
				setMultipanel((MultiPanel)newValue);
				return;
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM:
				setActiveItem((Panel)newValue);
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
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL:
				setMultipanel((MultiPanel)null);
				return;
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM:
				unsetActiveItem();
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
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL:
				return multipanel != null;
			case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM:
				return isSetActiveItem();
		}
		return super.eIsSet(featureID);
	}

} //ActivateMultiPanelItemCommandImpl
