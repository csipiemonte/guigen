/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.JumpAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.JumpActionImpl#getJumpTo <em>Jump To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpActionImpl extends ActionImpl implements JumpAction {
	/**
	 * The cached value of the '{@link #getJumpTo() <em>Jump To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpTo()
	 * @generated
	 * @ordered
	 */
	protected ContentPanel jumpTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.JUMP_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPanel getJumpTo() {
		if (jumpTo != null && jumpTo.eIsProxy()) {
			InternalEObject oldJumpTo = (InternalEObject)jumpTo;
			jumpTo = (ContentPanel)eResolveProxy(oldJumpTo);
			if (jumpTo != oldJumpTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.JUMP_ACTION__JUMP_TO, oldJumpTo, jumpTo));
			}
		}
		return jumpTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPanel basicGetJumpTo() {
		return jumpTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpTo(ContentPanel newJumpTo) {
		ContentPanel oldJumpTo = jumpTo;
		jumpTo = newJumpTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.JUMP_ACTION__JUMP_TO, oldJumpTo, jumpTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.JUMP_ACTION__JUMP_TO:
				if (resolve) return getJumpTo();
				return basicGetJumpTo();
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
			case GuigenPackage.JUMP_ACTION__JUMP_TO:
				setJumpTo((ContentPanel)newValue);
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
			case GuigenPackage.JUMP_ACTION__JUMP_TO:
				setJumpTo((ContentPanel)null);
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
			case GuigenPackage.JUMP_ACTION__JUMP_TO:
				return jumpTo != null;
		}
		return super.eIsSet(featureID);
	}

} //JumpActionImpl
