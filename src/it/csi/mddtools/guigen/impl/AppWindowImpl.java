/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppWindow;
import it.csi.mddtools.guigen.ApplicationArea;
import it.csi.mddtools.guigen.Footer;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Header;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppWindowImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppWindowImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.AppWindowImpl#getAppArea <em>App Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppWindowImpl extends EObjectImpl implements AppWindow {
	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected Footer footer;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The cached value of the '{@link #getAppArea() <em>App Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppArea()
	 * @generated
	 * @ordered
	 */
	protected ApplicationArea appArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.APP_WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Footer getFooter() {
		if (footer != null && footer.eIsProxy()) {
			InternalEObject oldFooter = (InternalEObject)footer;
			footer = (Footer)eResolveProxy(oldFooter);
			if (footer != oldFooter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.APP_WINDOW__FOOTER, oldFooter, footer));
			}
		}
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Footer basicGetFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(Footer newFooter) {
		Footer oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_WINDOW__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		if (header != null && header.eIsProxy()) {
			InternalEObject oldHeader = (InternalEObject)header;
			header = (Header)eResolveProxy(oldHeader);
			if (header != oldHeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.APP_WINDOW__HEADER, oldHeader, header));
			}
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header basicGetHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_WINDOW__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationArea getAppArea() {
		return appArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppArea(ApplicationArea newAppArea, NotificationChain msgs) {
		ApplicationArea oldAppArea = appArea;
		appArea = newAppArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_WINDOW__APP_AREA, oldAppArea, newAppArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppArea(ApplicationArea newAppArea) {
		if (newAppArea != appArea) {
			NotificationChain msgs = null;
			if (appArea != null)
				msgs = ((InternalEObject)appArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APP_WINDOW__APP_AREA, null, msgs);
			if (newAppArea != null)
				msgs = ((InternalEObject)newAppArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APP_WINDOW__APP_AREA, null, msgs);
			msgs = basicSetAppArea(newAppArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APP_WINDOW__APP_AREA, newAppArea, newAppArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.APP_WINDOW__APP_AREA:
				return basicSetAppArea(null, msgs);
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
			case GuigenPackage.APP_WINDOW__FOOTER:
				if (resolve) return getFooter();
				return basicGetFooter();
			case GuigenPackage.APP_WINDOW__HEADER:
				if (resolve) return getHeader();
				return basicGetHeader();
			case GuigenPackage.APP_WINDOW__APP_AREA:
				return getAppArea();
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
			case GuigenPackage.APP_WINDOW__FOOTER:
				setFooter((Footer)newValue);
				return;
			case GuigenPackage.APP_WINDOW__HEADER:
				setHeader((Header)newValue);
				return;
			case GuigenPackage.APP_WINDOW__APP_AREA:
				setAppArea((ApplicationArea)newValue);
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
			case GuigenPackage.APP_WINDOW__FOOTER:
				setFooter((Footer)null);
				return;
			case GuigenPackage.APP_WINDOW__HEADER:
				setHeader((Header)null);
				return;
			case GuigenPackage.APP_WINDOW__APP_AREA:
				setAppArea((ApplicationArea)null);
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
			case GuigenPackage.APP_WINDOW__FOOTER:
				return footer != null;
			case GuigenPackage.APP_WINDOW__HEADER:
				return header != null;
			case GuigenPackage.APP_WINDOW__APP_AREA:
				return appArea != null;
		}
		return super.eIsSet(featureID);
	}

} //AppWindowImpl
