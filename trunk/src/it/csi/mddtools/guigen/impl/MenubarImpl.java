/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Menu;
import it.csi.mddtools.guigen.Menubar;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menubar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MenubarImpl#getTopLevelMenu <em>Top Level Menu</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MenubarImpl#isRemoteInfoBox <em>Remote Info Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenubarImpl extends EObjectImpl implements Menubar {
	/**
	 * The cached value of the '{@link #getTopLevelMenu() <em>Top Level Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> topLevelMenu;

	/**
	 * The default value of the '{@link #isRemoteInfoBox() <em>Remote Info Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInfoBox()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_INFO_BOX_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRemoteInfoBox() <em>Remote Info Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInfoBox()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteInfoBox = REMOTE_INFO_BOX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenubarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.MENUBAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getTopLevelMenu() {
		if (topLevelMenu == null) {
			topLevelMenu = new EObjectContainmentEList<Menu>(Menu.class, this, GuigenPackage.MENUBAR__TOP_LEVEL_MENU);
		}
		return topLevelMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteInfoBox() {
		return remoteInfoBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteInfoBox(boolean newRemoteInfoBox) {
		boolean oldRemoteInfoBox = remoteInfoBox;
		remoteInfoBox = newRemoteInfoBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MENUBAR__REMOTE_INFO_BOX, oldRemoteInfoBox, remoteInfoBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.MENUBAR__TOP_LEVEL_MENU:
				return ((InternalEList<?>)getTopLevelMenu()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.MENUBAR__TOP_LEVEL_MENU:
				return getTopLevelMenu();
			case GuigenPackage.MENUBAR__REMOTE_INFO_BOX:
				return isRemoteInfoBox();
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
			case GuigenPackage.MENUBAR__TOP_LEVEL_MENU:
				getTopLevelMenu().clear();
				getTopLevelMenu().addAll((Collection<? extends Menu>)newValue);
				return;
			case GuigenPackage.MENUBAR__REMOTE_INFO_BOX:
				setRemoteInfoBox((Boolean)newValue);
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
			case GuigenPackage.MENUBAR__TOP_LEVEL_MENU:
				getTopLevelMenu().clear();
				return;
			case GuigenPackage.MENUBAR__REMOTE_INFO_BOX:
				setRemoteInfoBox(REMOTE_INFO_BOX_EDEFAULT);
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
			case GuigenPackage.MENUBAR__TOP_LEVEL_MENU:
				return topLevelMenu != null && !topLevelMenu.isEmpty();
			case GuigenPackage.MENUBAR__REMOTE_INFO_BOX:
				return remoteInfoBox != REMOTE_INFO_BOX_EDEFAULT;
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
		result.append(" (remoteInfoBox: ");
		result.append(remoteInfoBox);
		result.append(')');
		return result.toString();
	}

} //MenubarImpl
