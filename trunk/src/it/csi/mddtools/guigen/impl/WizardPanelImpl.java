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

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.TabSwitcher;
import it.csi.mddtools.guigen.WizardNumberingTypes;
import it.csi.mddtools.guigen.WizardPanel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.WizardPanelImpl#isNavigatorActive <em>Navigator Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WizardPanelImpl#getSwitcher <em>Switcher</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.WizardPanelImpl#getNumberingSchema <em>Numbering Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WizardPanelImpl extends MultiPanelImpl implements WizardPanel {
	/**
	 * The default value of the '{@link #isNavigatorActive() <em>Navigator Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigatorActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGATOR_ACTIVE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isNavigatorActive() <em>Navigator Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigatorActive()
	 * @generated
	 * @ordered
	 */
	protected boolean navigatorActive = NAVIGATOR_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitcher() <em>Switcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitcher()
	 * @generated
	 * @ordered
	 */
	protected TabSwitcher switcher;

	/**
	 * The default value of the '{@link #getNumberingSchema() <em>Numbering Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberingSchema()
	 * @generated
	 * @ordered
	 */
	protected static final WizardNumberingTypes NUMBERING_SCHEMA_EDEFAULT = WizardNumberingTypes.NO_NUMBERING;
	/**
	 * The cached value of the '{@link #getNumberingSchema() <em>Numbering Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberingSchema()
	 * @generated
	 * @ordered
	 */
	protected WizardNumberingTypes numberingSchema = NUMBERING_SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.WIZARD_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigatorActive() {
		return navigatorActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigatorActive(boolean newNavigatorActive) {
		boolean oldNavigatorActive = navigatorActive;
		navigatorActive = newNavigatorActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE, oldNavigatorActive, navigatorActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabSwitcher getSwitcher() {
		return switcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitcher(TabSwitcher newSwitcher, NotificationChain msgs) {
		TabSwitcher oldSwitcher = switcher;
		switcher = newSwitcher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.WIZARD_PANEL__SWITCHER, oldSwitcher, newSwitcher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitcher(TabSwitcher newSwitcher) {
		if (newSwitcher != switcher) {
			NotificationChain msgs = null;
			if (switcher != null)
				msgs = ((InternalEObject)switcher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WIZARD_PANEL__SWITCHER, null, msgs);
			if (newSwitcher != null)
				msgs = ((InternalEObject)newSwitcher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.WIZARD_PANEL__SWITCHER, null, msgs);
			msgs = basicSetSwitcher(newSwitcher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIZARD_PANEL__SWITCHER, newSwitcher, newSwitcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardNumberingTypes getNumberingSchema() {
		return numberingSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberingSchema(WizardNumberingTypes newNumberingSchema) {
		WizardNumberingTypes oldNumberingSchema = numberingSchema;
		numberingSchema = newNumberingSchema == null ? NUMBERING_SCHEMA_EDEFAULT : newNumberingSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.WIZARD_PANEL__NUMBERING_SCHEMA, oldNumberingSchema, numberingSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.WIZARD_PANEL__SWITCHER:
				return basicSetSwitcher(null, msgs);
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
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				return isNavigatorActive();
			case GuigenPackage.WIZARD_PANEL__SWITCHER:
				return getSwitcher();
			case GuigenPackage.WIZARD_PANEL__NUMBERING_SCHEMA:
				return getNumberingSchema();
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
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				setNavigatorActive((Boolean)newValue);
				return;
			case GuigenPackage.WIZARD_PANEL__SWITCHER:
				setSwitcher((TabSwitcher)newValue);
				return;
			case GuigenPackage.WIZARD_PANEL__NUMBERING_SCHEMA:
				setNumberingSchema((WizardNumberingTypes)newValue);
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
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				setNavigatorActive(NAVIGATOR_ACTIVE_EDEFAULT);
				return;
			case GuigenPackage.WIZARD_PANEL__SWITCHER:
				setSwitcher((TabSwitcher)null);
				return;
			case GuigenPackage.WIZARD_PANEL__NUMBERING_SCHEMA:
				setNumberingSchema(NUMBERING_SCHEMA_EDEFAULT);
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
			case GuigenPackage.WIZARD_PANEL__NAVIGATOR_ACTIVE:
				return navigatorActive != NAVIGATOR_ACTIVE_EDEFAULT;
			case GuigenPackage.WIZARD_PANEL__SWITCHER:
				return switcher != null;
			case GuigenPackage.WIZARD_PANEL__NUMBERING_SCHEMA:
				return numberingSchema != NUMBERING_SCHEMA_EDEFAULT;
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
		result.append(" (navigatorActive: ");
		result.append(navigatorActive);
		result.append(", numberingSchema: ");
		result.append(numberingSchema);
		result.append(')');
		return result.toString();
	}

} //WizardPanelImpl
