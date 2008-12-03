/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.GuigenPackage;

import it.csi.mddtools.guigen.Panel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.DialogPanelImpl#getDialogContent <em>Dialog Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogPanelImpl extends PanelImpl implements DialogPanel {
	/**
	 * The cached value of the '{@link #getDialogContent() <em>Dialog Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogContent()
	 * @generated
	 * @ordered
	 */
	protected Panel dialogContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.DIALOG_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel getDialogContent() {
		return dialogContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDialogContent(Panel newDialogContent, NotificationChain msgs) {
		Panel oldDialogContent = dialogContent;
		dialogContent = newDialogContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT, oldDialogContent, newDialogContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogContent(Panel newDialogContent) {
		if (newDialogContent != dialogContent) {
			NotificationChain msgs = null;
			if (dialogContent != null)
				msgs = ((InternalEObject)dialogContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT, null, msgs);
			if (newDialogContent != null)
				msgs = ((InternalEObject)newDialogContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT, null, msgs);
			msgs = basicSetDialogContent(newDialogContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT, newDialogContent, newDialogContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT:
				return basicSetDialogContent(null, msgs);
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
			case GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT:
				return getDialogContent();
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
			case GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT:
				setDialogContent((Panel)newValue);
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
			case GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT:
				setDialogContent((Panel)null);
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
			case GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT:
				return dialogContent != null;
		}
		return super.eIsSet(featureID);
	}

} //DialogPanelImpl
