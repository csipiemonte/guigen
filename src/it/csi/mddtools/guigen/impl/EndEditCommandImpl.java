/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.EndEditCommand;
import it.csi.mddtools.guigen.GuigenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Edit Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.EndEditCommandImpl#getDataEdited <em>Data Edited</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.EndEditCommandImpl#isUndo <em>Undo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndEditCommandImpl extends CommandImpl implements EndEditCommand {
	/**
	 * The cached value of the '{@link #getDataEdited() <em>Data Edited</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEdited()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationData> dataEdited;

	/**
	 * The default value of the '{@link #isUndo() <em>Undo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDO_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUndo() <em>Undo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndo()
	 * @generated
	 * @ordered
	 */
	protected boolean undo = UNDO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEditCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.END_EDIT_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getDataEdited() {
		if (dataEdited == null) {
			dataEdited = new EObjectResolvingEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.END_EDIT_COMMAND__DATA_EDITED);
		}
		return dataEdited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUndo() {
		return undo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndo(boolean newUndo) {
		boolean oldUndo = undo;
		undo = newUndo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.END_EDIT_COMMAND__UNDO, oldUndo, undo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.END_EDIT_COMMAND__DATA_EDITED:
				return getDataEdited();
			case GuigenPackage.END_EDIT_COMMAND__UNDO:
				return isUndo();
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
			case GuigenPackage.END_EDIT_COMMAND__DATA_EDITED:
				getDataEdited().clear();
				getDataEdited().addAll((Collection<? extends ApplicationData>)newValue);
				return;
			case GuigenPackage.END_EDIT_COMMAND__UNDO:
				setUndo((Boolean)newValue);
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
			case GuigenPackage.END_EDIT_COMMAND__DATA_EDITED:
				getDataEdited().clear();
				return;
			case GuigenPackage.END_EDIT_COMMAND__UNDO:
				setUndo(UNDO_EDEFAULT);
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
			case GuigenPackage.END_EDIT_COMMAND__DATA_EDITED:
				return dataEdited != null && !dataEdited.isEmpty();
			case GuigenPackage.END_EDIT_COMMAND__UNDO:
				return undo != UNDO_EDEFAULT;
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
		result.append(" (undo: ");
		result.append(undo);
		result.append(')');
		return result.toString();
	}

} //EndEditCommandImpl
