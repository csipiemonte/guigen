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
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelLayout;
import it.csi.mddtools.guigen.WidgetLayoutSpecifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelImpl#getLayoutSpec <em>Layout Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PanelImpl#isScrollable <em>Scrollable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PanelImpl extends EObjectImpl implements Panel {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected PanelLayout layout;

	/**
	 * The cached value of the '{@link #getLayoutSpec() <em>Layout Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutSpec()
	 * @generated
	 * @ordered
	 */
	protected WidgetLayoutSpecifier layoutSpec;

	/**
	 * The default value of the '{@link #isScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrollable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCROLLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrollable()
	 * @generated
	 * @ordered
	 */
	protected boolean scrollable = SCROLLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.PANEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelLayout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(PanelLayout newLayout, NotificationChain msgs) {
		PanelLayout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(PanelLayout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetLayoutSpecifier getLayoutSpec() {
		return layoutSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutSpec(WidgetLayoutSpecifier newLayoutSpec, NotificationChain msgs) {
		WidgetLayoutSpecifier oldLayoutSpec = layoutSpec;
		layoutSpec = newLayoutSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL__LAYOUT_SPEC, oldLayoutSpec, newLayoutSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutSpec(WidgetLayoutSpecifier newLayoutSpec) {
		if (newLayoutSpec != layoutSpec) {
			NotificationChain msgs = null;
			if (layoutSpec != null)
				msgs = ((InternalEObject)layoutSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL__LAYOUT_SPEC, null, msgs);
			if (newLayoutSpec != null)
				msgs = ((InternalEObject)newLayoutSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.PANEL__LAYOUT_SPEC, null, msgs);
			msgs = basicSetLayoutSpec(newLayoutSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL__LAYOUT_SPEC, newLayoutSpec, newLayoutSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScrollable() {
		return scrollable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollable(boolean newScrollable) {
		boolean oldScrollable = scrollable;
		scrollable = newScrollable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PANEL__SCROLLABLE, oldScrollable, scrollable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.PANEL__LAYOUT:
				return basicSetLayout(null, msgs);
			case GuigenPackage.PANEL__LAYOUT_SPEC:
				return basicSetLayoutSpec(null, msgs);
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
			case GuigenPackage.PANEL__NAME:
				return getName();
			case GuigenPackage.PANEL__LABEL:
				return getLabel();
			case GuigenPackage.PANEL__LAYOUT:
				return getLayout();
			case GuigenPackage.PANEL__LAYOUT_SPEC:
				return getLayoutSpec();
			case GuigenPackage.PANEL__SCROLLABLE:
				return isScrollable();
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
			case GuigenPackage.PANEL__NAME:
				setName((String)newValue);
				return;
			case GuigenPackage.PANEL__LABEL:
				setLabel((String)newValue);
				return;
			case GuigenPackage.PANEL__LAYOUT:
				setLayout((PanelLayout)newValue);
				return;
			case GuigenPackage.PANEL__LAYOUT_SPEC:
				setLayoutSpec((WidgetLayoutSpecifier)newValue);
				return;
			case GuigenPackage.PANEL__SCROLLABLE:
				setScrollable((Boolean)newValue);
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
			case GuigenPackage.PANEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuigenPackage.PANEL__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GuigenPackage.PANEL__LAYOUT:
				setLayout((PanelLayout)null);
				return;
			case GuigenPackage.PANEL__LAYOUT_SPEC:
				setLayoutSpec((WidgetLayoutSpecifier)null);
				return;
			case GuigenPackage.PANEL__SCROLLABLE:
				setScrollable(SCROLLABLE_EDEFAULT);
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
			case GuigenPackage.PANEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuigenPackage.PANEL__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case GuigenPackage.PANEL__LAYOUT:
				return layout != null;
			case GuigenPackage.PANEL__LAYOUT_SPEC:
				return layoutSpec != null;
			case GuigenPackage.PANEL__SCROLLABLE:
				return scrollable != SCROLLABLE_EDEFAULT;
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
		result.append(", label: ");
		result.append(label);
		result.append(", scrollable: ");
		result.append(scrollable);
		result.append(')');
		return result.toString();
	}

} //PanelImpl
