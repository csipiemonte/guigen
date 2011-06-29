/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.JumpCommand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.JumpCommandImpl#getJumpTo <em>Jump To</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.JumpCommandImpl#isPushCurrentPage <em>Push Current Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpCommandImpl extends CommandImpl implements JumpCommand {
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
	 * The default value of the '{@link #isPushCurrentPage() <em>Push Current Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPushCurrentPage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUSH_CURRENT_PAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPushCurrentPage() <em>Push Current Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPushCurrentPage()
	 * @generated
	 * @ordered
	 */
	protected boolean pushCurrentPage = PUSH_CURRENT_PAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.JUMP_COMMAND;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.JUMP_COMMAND__JUMP_TO, oldJumpTo, jumpTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.JUMP_COMMAND__JUMP_TO, oldJumpTo, jumpTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPushCurrentPage() {
		return pushCurrentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPushCurrentPage(boolean newPushCurrentPage) {
		boolean oldPushCurrentPage = pushCurrentPage;
		pushCurrentPage = newPushCurrentPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.JUMP_COMMAND__PUSH_CURRENT_PAGE, oldPushCurrentPage, pushCurrentPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.JUMP_COMMAND__JUMP_TO:
				if (resolve) return getJumpTo();
				return basicGetJumpTo();
			case GuigenPackage.JUMP_COMMAND__PUSH_CURRENT_PAGE:
				return isPushCurrentPage();
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
			case GuigenPackage.JUMP_COMMAND__JUMP_TO:
				setJumpTo((ContentPanel)newValue);
				return;
			case GuigenPackage.JUMP_COMMAND__PUSH_CURRENT_PAGE:
				setPushCurrentPage((Boolean)newValue);
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
			case GuigenPackage.JUMP_COMMAND__JUMP_TO:
				setJumpTo((ContentPanel)null);
				return;
			case GuigenPackage.JUMP_COMMAND__PUSH_CURRENT_PAGE:
				setPushCurrentPage(PUSH_CURRENT_PAGE_EDEFAULT);
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
			case GuigenPackage.JUMP_COMMAND__JUMP_TO:
				return jumpTo != null;
			case GuigenPackage.JUMP_COMMAND__PUSH_CURRENT_PAGE:
				return pushCurrentPage != PUSH_CURRENT_PAGE_EDEFAULT;
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
		result.append(" (pushCurrentPage: ");
		result.append(pushCurrentPage);
		result.append(')');
		return result.toString();
	}

} //JumpCommandImpl
