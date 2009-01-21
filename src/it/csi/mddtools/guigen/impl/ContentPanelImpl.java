/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Panel;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getPanels <em>Panels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ContentPanelImpl#getAppData <em>App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentPanelImpl extends EObjectImpl implements ContentPanel {
	/**
	 * The cached value of the '{@link #getPanels() <em>Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanels()
	 * @generated
	 * @ordered
	 */
	protected Panel panels;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.CONTENT_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel getPanels() {
		return panels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPanels(Panel newPanels, NotificationChain msgs) {
		Panel oldPanels = panels;
		panels = newPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__PANELS, oldPanels, newPanels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanels(Panel newPanels) {
		if (newPanels != panels) {
			NotificationChain msgs = null;
			if (panels != null)
				msgs = ((InternalEObject)panels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__PANELS, null, msgs);
			if (newPanels != null)
				msgs = ((InternalEObject)newPanels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.CONTENT_PANEL__PANELS, null, msgs);
			msgs = basicSetPanels(newPanels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__PANELS, newPanels, newPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CONTENT_PANEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getAppData() {
		if (appData == null) {
			appData = new EObjectContainmentEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.CONTENT_PANEL__APP_DATA);
		}
		return appData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.CONTENT_PANEL__PANELS:
				return basicSetPanels(null, msgs);
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				return ((InternalEList<?>)getAppData()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.CONTENT_PANEL__PANELS:
				return getPanels();
			case GuigenPackage.CONTENT_PANEL__NAME:
				return getName();
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				return getAppData();
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
			case GuigenPackage.CONTENT_PANEL__PANELS:
				setPanels((Panel)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				getAppData().clear();
				getAppData().addAll((Collection<? extends ApplicationData>)newValue);
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
			case GuigenPackage.CONTENT_PANEL__PANELS:
				setPanels((Panel)null);
				return;
			case GuigenPackage.CONTENT_PANEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				getAppData().clear();
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
			case GuigenPackage.CONTENT_PANEL__PANELS:
				return panels != null;
			case GuigenPackage.CONTENT_PANEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.CONTENT_PANEL__APP_DATA:
				return appData != null && !appData.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContentPanelImpl
