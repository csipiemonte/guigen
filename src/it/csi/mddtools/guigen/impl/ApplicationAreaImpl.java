/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationArea;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Menubar;
import it.csi.mddtools.guigen.StaticLinks;
import it.csi.mddtools.guigen.Statusbar;
import it.csi.mddtools.guigen.Titlebar;

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
 * An implementation of the model object '<em><b>Application Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationAreaImpl#getMenubar <em>Menubar</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationAreaImpl#getTitlebar <em>Titlebar</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationAreaImpl#getStatusbar <em>Statusbar</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationAreaImpl#getContentPanels <em>Content Panels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ApplicationAreaImpl#getStaticLinks <em>Static Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationAreaImpl extends EObjectImpl implements ApplicationArea {
	/**
	 * The cached value of the '{@link #getMenubar() <em>Menubar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenubar()
	 * @generated
	 * @ordered
	 */
	protected Menubar menubar;

	/**
	 * The cached value of the '{@link #getTitlebar() <em>Titlebar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitlebar()
	 * @generated
	 * @ordered
	 */
	protected Titlebar titlebar;

	/**
	 * The cached value of the '{@link #getStatusbar() <em>Statusbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusbar()
	 * @generated
	 * @ordered
	 */
	protected Statusbar statusbar;

	/**
	 * The cached value of the '{@link #getContentPanels() <em>Content Panels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPanels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentPanel> contentPanels;

	/**
	 * The cached value of the '{@link #getStaticLinks() <em>Static Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticLinks()
	 * @generated
	 * @ordered
	 */
	protected StaticLinks staticLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.APPLICATION_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menubar getMenubar() {
		return menubar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenubar(Menubar newMenubar, NotificationChain msgs) {
		Menubar oldMenubar = menubar;
		menubar = newMenubar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__MENUBAR, oldMenubar, newMenubar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenubar(Menubar newMenubar) {
		if (newMenubar != menubar) {
			NotificationChain msgs = null;
			if (menubar != null)
				msgs = ((InternalEObject)menubar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__MENUBAR, null, msgs);
			if (newMenubar != null)
				msgs = ((InternalEObject)newMenubar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__MENUBAR, null, msgs);
			msgs = basicSetMenubar(newMenubar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__MENUBAR, newMenubar, newMenubar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titlebar getTitlebar() {
		return titlebar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitlebar(Titlebar newTitlebar, NotificationChain msgs) {
		Titlebar oldTitlebar = titlebar;
		titlebar = newTitlebar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__TITLEBAR, oldTitlebar, newTitlebar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitlebar(Titlebar newTitlebar) {
		if (newTitlebar != titlebar) {
			NotificationChain msgs = null;
			if (titlebar != null)
				msgs = ((InternalEObject)titlebar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__TITLEBAR, null, msgs);
			if (newTitlebar != null)
				msgs = ((InternalEObject)newTitlebar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__TITLEBAR, null, msgs);
			msgs = basicSetTitlebar(newTitlebar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__TITLEBAR, newTitlebar, newTitlebar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statusbar getStatusbar() {
		return statusbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusbar(Statusbar newStatusbar, NotificationChain msgs) {
		Statusbar oldStatusbar = statusbar;
		statusbar = newStatusbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__STATUSBAR, oldStatusbar, newStatusbar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusbar(Statusbar newStatusbar) {
		if (newStatusbar != statusbar) {
			NotificationChain msgs = null;
			if (statusbar != null)
				msgs = ((InternalEObject)statusbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__STATUSBAR, null, msgs);
			if (newStatusbar != null)
				msgs = ((InternalEObject)newStatusbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__STATUSBAR, null, msgs);
			msgs = basicSetStatusbar(newStatusbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__STATUSBAR, newStatusbar, newStatusbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentPanel> getContentPanels() {
		if (contentPanels == null) {
			contentPanels = new EObjectContainmentEList<ContentPanel>(ContentPanel.class, this, GuigenPackage.APPLICATION_AREA__CONTENT_PANELS);
		}
		return contentPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticLinks getStaticLinks() {
		return staticLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticLinks(StaticLinks newStaticLinks, NotificationChain msgs) {
		StaticLinks oldStaticLinks = staticLinks;
		staticLinks = newStaticLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__STATIC_LINKS, oldStaticLinks, newStaticLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticLinks(StaticLinks newStaticLinks) {
		if (newStaticLinks != staticLinks) {
			NotificationChain msgs = null;
			if (staticLinks != null)
				msgs = ((InternalEObject)staticLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__STATIC_LINKS, null, msgs);
			if (newStaticLinks != null)
				msgs = ((InternalEObject)newStaticLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.APPLICATION_AREA__STATIC_LINKS, null, msgs);
			msgs = basicSetStaticLinks(newStaticLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.APPLICATION_AREA__STATIC_LINKS, newStaticLinks, newStaticLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.APPLICATION_AREA__MENUBAR:
				return basicSetMenubar(null, msgs);
			case GuigenPackage.APPLICATION_AREA__TITLEBAR:
				return basicSetTitlebar(null, msgs);
			case GuigenPackage.APPLICATION_AREA__STATUSBAR:
				return basicSetStatusbar(null, msgs);
			case GuigenPackage.APPLICATION_AREA__CONTENT_PANELS:
				return ((InternalEList<?>)getContentPanels()).basicRemove(otherEnd, msgs);
			case GuigenPackage.APPLICATION_AREA__STATIC_LINKS:
				return basicSetStaticLinks(null, msgs);
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
			case GuigenPackage.APPLICATION_AREA__MENUBAR:
				return getMenubar();
			case GuigenPackage.APPLICATION_AREA__TITLEBAR:
				return getTitlebar();
			case GuigenPackage.APPLICATION_AREA__STATUSBAR:
				return getStatusbar();
			case GuigenPackage.APPLICATION_AREA__CONTENT_PANELS:
				return getContentPanels();
			case GuigenPackage.APPLICATION_AREA__STATIC_LINKS:
				return getStaticLinks();
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
			case GuigenPackage.APPLICATION_AREA__MENUBAR:
				setMenubar((Menubar)newValue);
				return;
			case GuigenPackage.APPLICATION_AREA__TITLEBAR:
				setTitlebar((Titlebar)newValue);
				return;
			case GuigenPackage.APPLICATION_AREA__STATUSBAR:
				setStatusbar((Statusbar)newValue);
				return;
			case GuigenPackage.APPLICATION_AREA__CONTENT_PANELS:
				getContentPanels().clear();
				getContentPanels().addAll((Collection<? extends ContentPanel>)newValue);
				return;
			case GuigenPackage.APPLICATION_AREA__STATIC_LINKS:
				setStaticLinks((StaticLinks)newValue);
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
			case GuigenPackage.APPLICATION_AREA__MENUBAR:
				setMenubar((Menubar)null);
				return;
			case GuigenPackage.APPLICATION_AREA__TITLEBAR:
				setTitlebar((Titlebar)null);
				return;
			case GuigenPackage.APPLICATION_AREA__STATUSBAR:
				setStatusbar((Statusbar)null);
				return;
			case GuigenPackage.APPLICATION_AREA__CONTENT_PANELS:
				getContentPanels().clear();
				return;
			case GuigenPackage.APPLICATION_AREA__STATIC_LINKS:
				setStaticLinks((StaticLinks)null);
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
			case GuigenPackage.APPLICATION_AREA__MENUBAR:
				return menubar != null;
			case GuigenPackage.APPLICATION_AREA__TITLEBAR:
				return titlebar != null;
			case GuigenPackage.APPLICATION_AREA__STATUSBAR:
				return statusbar != null;
			case GuigenPackage.APPLICATION_AREA__CONTENT_PANELS:
				return contentPanels != null && !contentPanels.isEmpty();
			case GuigenPackage.APPLICATION_AREA__STATIC_LINKS:
				return staticLinks != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationAreaImpl
