/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.WidgetsPanel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widgets Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetsPanelImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetsPanelImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WidgetsPanelImpl#isCollapsible <em>Collapsible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetsPanelImpl extends PanelImpl implements WidgetsPanel {
	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgets;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected boolean collapsible = COLLAPSIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetsPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.WIDGETS_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<Widget>(Widget.class, this, GuigenPackage.WIDGETS_PANEL__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGETS_PANEL__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsible() {
		return collapsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsible(boolean newCollapsible) {
		boolean oldCollapsible = collapsible;
		collapsible = newCollapsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIDGETS_PANEL__COLLAPSIBLE, oldCollapsible, collapsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.WIDGETS_PANEL__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.WIDGETS_PANEL__WIDGETS:
				return getWidgets();
			case GuigenPackage.WIDGETS_PANEL__SUMMARY:
				return getSummary();
			case GuigenPackage.WIDGETS_PANEL__COLLAPSIBLE:
				return isCollapsible();
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
			case GuigenPackage.WIDGETS_PANEL__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
				return;
			case GuigenPackage.WIDGETS_PANEL__SUMMARY:
				setSummary((String)newValue);
				return;
			case GuigenPackage.WIDGETS_PANEL__COLLAPSIBLE:
				setCollapsible((Boolean)newValue);
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
			case GuigenPackage.WIDGETS_PANEL__WIDGETS:
				getWidgets().clear();
				return;
			case GuigenPackage.WIDGETS_PANEL__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case GuigenPackage.WIDGETS_PANEL__COLLAPSIBLE:
				setCollapsible(COLLAPSIBLE_EDEFAULT);
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
			case GuigenPackage.WIDGETS_PANEL__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case GuigenPackage.WIDGETS_PANEL__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case GuigenPackage.WIDGETS_PANEL__COLLAPSIBLE:
				return collapsible != COLLAPSIBLE_EDEFAULT;
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
		result.append(" (summary: ");
		result.append(summary);
		result.append(", collapsible: ");
		result.append(collapsible);
		result.append(')');
		return result.toString();
	}

} //WidgetsPanelImpl
