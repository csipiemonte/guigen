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

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MapEnvelope;
import it.csi.mddtools.guigen.MapView;

import it.csi.mddtools.guigen.MapViewGadgets;
import it.csi.mddtools.guigen.MultiDataWidget;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getMapId <em>Map Id</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getStartEnvelopeSpec <em>Start Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getMaxEnvelopeSpec <em>Max Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getScaleEnvelopeSpec <em>Scale Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getNumLevels <em>Num Levels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getEditDataBinding <em>Edit Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#getGadgets <em>Gadgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#isNoClickWhenDisabled <em>No Click When Disabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#isNoEditWhenDisabled <em>No Edit When Disabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#isNoZoomWhenDisabled <em>No Zoom When Disabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewImpl#isNoPanWhenDisabled <em>No Pan When Disabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapViewImpl extends DataWidgetImpl implements MapView {
	/**
	 * The cached value of the '{@link #getMultiDataBinding() <em>Multi Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiDataBinding()
	 * @generated
	 * @ordered
	 */
	protected AppDataBinding multiDataBinding;

	/**
	 * The default value of the '{@link #getMapId() <em>Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapId() <em>Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapId()
	 * @generated
	 * @ordered
	 */
	protected String mapId = MAP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartEnvelopeSpec() <em>Start Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEnvelopeSpec()
	 * @generated
	 * @ordered
	 */
	protected MapEnvelope startEnvelopeSpec;

	/**
	 * The cached value of the '{@link #getMaxEnvelopeSpec() <em>Max Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEnvelopeSpec()
	 * @generated
	 * @ordered
	 */
	protected MapEnvelope maxEnvelopeSpec;

	/**
	 * The cached value of the '{@link #getScaleEnvelopeSpec() <em>Scale Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleEnvelopeSpec()
	 * @generated
	 * @ordered
	 */
	protected MapEnvelope scaleEnvelopeSpec;

	/**
	 * The default value of the '{@link #getNumLevels() <em>Num Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLevels()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_LEVELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumLevels() <em>Num Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLevels()
	 * @generated
	 * @ordered
	 */
	protected int numLevels = NUM_LEVELS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEditDataBinding() <em>Edit Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditDataBinding()
	 * @generated
	 * @ordered
	 */
	protected AppDataBinding editDataBinding;

	/**
	 * The cached value of the '{@link #getGadgets() <em>Gadgets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGadgets()
	 * @generated
	 * @ordered
	 */
	protected MapViewGadgets gadgets;

	/**
	 * The default value of the '{@link #isNoClickWhenDisabled() <em>No Click When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoClickWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_CLICK_WHEN_DISABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNoClickWhenDisabled() <em>No Click When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoClickWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean noClickWhenDisabled = NO_CLICK_WHEN_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoEditWhenDisabled() <em>No Edit When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoEditWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_EDIT_WHEN_DISABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNoEditWhenDisabled() <em>No Edit When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoEditWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean noEditWhenDisabled = NO_EDIT_WHEN_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoZoomWhenDisabled() <em>No Zoom When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoZoomWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_ZOOM_WHEN_DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoZoomWhenDisabled() <em>No Zoom When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoZoomWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean noZoomWhenDisabled = NO_ZOOM_WHEN_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoPanWhenDisabled() <em>No Pan When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoPanWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_PAN_WHEN_DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoPanWhenDisabled() <em>No Pan When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoPanWhenDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean noPanWhenDisabled = NO_PAN_WHEN_DISABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.MAP_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDataBinding getMultiDataBinding() {
		return multiDataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiDataBinding(AppDataBinding newMultiDataBinding, NotificationChain msgs) {
		AppDataBinding oldMultiDataBinding = multiDataBinding;
		multiDataBinding = newMultiDataBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING, oldMultiDataBinding, newMultiDataBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiDataBinding(AppDataBinding newMultiDataBinding) {
		if (newMultiDataBinding != multiDataBinding) {
			NotificationChain msgs = null;
			if (multiDataBinding != null)
				msgs = ((InternalEObject)multiDataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING, null, msgs);
			if (newMultiDataBinding != null)
				msgs = ((InternalEObject)newMultiDataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING, null, msgs);
			msgs = basicSetMultiDataBinding(newMultiDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING, newMultiDataBinding, newMultiDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapId() {
		return mapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapId(String newMapId) {
		String oldMapId = mapId;
		mapId = newMapId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MAP_ID, oldMapId, mapId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapEnvelope getStartEnvelopeSpec() {
		return startEnvelopeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartEnvelopeSpec(MapEnvelope newStartEnvelopeSpec, NotificationChain msgs) {
		MapEnvelope oldStartEnvelopeSpec = startEnvelopeSpec;
		startEnvelopeSpec = newStartEnvelopeSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, oldStartEnvelopeSpec, newStartEnvelopeSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEnvelopeSpec(MapEnvelope newStartEnvelopeSpec) {
		if (newStartEnvelopeSpec != startEnvelopeSpec) {
			NotificationChain msgs = null;
			if (startEnvelopeSpec != null)
				msgs = ((InternalEObject)startEnvelopeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, null, msgs);
			if (newStartEnvelopeSpec != null)
				msgs = ((InternalEObject)newStartEnvelopeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, null, msgs);
			msgs = basicSetStartEnvelopeSpec(newStartEnvelopeSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC, newStartEnvelopeSpec, newStartEnvelopeSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapEnvelope getMaxEnvelopeSpec() {
		return maxEnvelopeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxEnvelopeSpec(MapEnvelope newMaxEnvelopeSpec, NotificationChain msgs) {
		MapEnvelope oldMaxEnvelopeSpec = maxEnvelopeSpec;
		maxEnvelopeSpec = newMaxEnvelopeSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, oldMaxEnvelopeSpec, newMaxEnvelopeSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEnvelopeSpec(MapEnvelope newMaxEnvelopeSpec) {
		if (newMaxEnvelopeSpec != maxEnvelopeSpec) {
			NotificationChain msgs = null;
			if (maxEnvelopeSpec != null)
				msgs = ((InternalEObject)maxEnvelopeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, null, msgs);
			if (newMaxEnvelopeSpec != null)
				msgs = ((InternalEObject)newMaxEnvelopeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, null, msgs);
			msgs = basicSetMaxEnvelopeSpec(newMaxEnvelopeSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC, newMaxEnvelopeSpec, newMaxEnvelopeSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapEnvelope getScaleEnvelopeSpec() {
		return scaleEnvelopeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleEnvelopeSpec(MapEnvelope newScaleEnvelopeSpec, NotificationChain msgs) {
		MapEnvelope oldScaleEnvelopeSpec = scaleEnvelopeSpec;
		scaleEnvelopeSpec = newScaleEnvelopeSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, oldScaleEnvelopeSpec, newScaleEnvelopeSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleEnvelopeSpec(MapEnvelope newScaleEnvelopeSpec) {
		if (newScaleEnvelopeSpec != scaleEnvelopeSpec) {
			NotificationChain msgs = null;
			if (scaleEnvelopeSpec != null)
				msgs = ((InternalEObject)scaleEnvelopeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, null, msgs);
			if (newScaleEnvelopeSpec != null)
				msgs = ((InternalEObject)newScaleEnvelopeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, null, msgs);
			msgs = basicSetScaleEnvelopeSpec(newScaleEnvelopeSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC, newScaleEnvelopeSpec, newScaleEnvelopeSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumLevels() {
		return numLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumLevels(int newNumLevels) {
		int oldNumLevels = numLevels;
		numLevels = newNumLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__NUM_LEVELS, oldNumLevels, numLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDataBinding getEditDataBinding() {
		return editDataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditDataBinding(AppDataBinding newEditDataBinding, NotificationChain msgs) {
		AppDataBinding oldEditDataBinding = editDataBinding;
		editDataBinding = newEditDataBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING, oldEditDataBinding, newEditDataBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditDataBinding(AppDataBinding newEditDataBinding) {
		if (newEditDataBinding != editDataBinding) {
			NotificationChain msgs = null;
			if (editDataBinding != null)
				msgs = ((InternalEObject)editDataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING, null, msgs);
			if (newEditDataBinding != null)
				msgs = ((InternalEObject)newEditDataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING, null, msgs);
			msgs = basicSetEditDataBinding(newEditDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING, newEditDataBinding, newEditDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewGadgets getGadgets() {
		return gadgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGadgets(MapViewGadgets newGadgets, NotificationChain msgs) {
		MapViewGadgets oldGadgets = gadgets;
		gadgets = newGadgets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__GADGETS, oldGadgets, newGadgets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGadgets(MapViewGadgets newGadgets) {
		if (newGadgets != gadgets) {
			NotificationChain msgs = null;
			if (gadgets != null)
				msgs = ((InternalEObject)gadgets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__GADGETS, null, msgs);
			if (newGadgets != null)
				msgs = ((InternalEObject)newGadgets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.MAP_VIEW__GADGETS, null, msgs);
			msgs = basicSetGadgets(newGadgets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__GADGETS, newGadgets, newGadgets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoClickWhenDisabled() {
		return noClickWhenDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoClickWhenDisabled(boolean newNoClickWhenDisabled) {
		boolean oldNoClickWhenDisabled = noClickWhenDisabled;
		noClickWhenDisabled = newNoClickWhenDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__NO_CLICK_WHEN_DISABLED, oldNoClickWhenDisabled, noClickWhenDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoEditWhenDisabled() {
		return noEditWhenDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoEditWhenDisabled(boolean newNoEditWhenDisabled) {
		boolean oldNoEditWhenDisabled = noEditWhenDisabled;
		noEditWhenDisabled = newNoEditWhenDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__NO_EDIT_WHEN_DISABLED, oldNoEditWhenDisabled, noEditWhenDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoZoomWhenDisabled() {
		return noZoomWhenDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoZoomWhenDisabled(boolean newNoZoomWhenDisabled) {
		boolean oldNoZoomWhenDisabled = noZoomWhenDisabled;
		noZoomWhenDisabled = newNoZoomWhenDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__NO_ZOOM_WHEN_DISABLED, oldNoZoomWhenDisabled, noZoomWhenDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoPanWhenDisabled() {
		return noPanWhenDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoPanWhenDisabled(boolean newNoPanWhenDisabled) {
		boolean oldNoPanWhenDisabled = noPanWhenDisabled;
		noPanWhenDisabled = newNoPanWhenDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW__NO_PAN_WHEN_DISABLED, oldNoPanWhenDisabled, noPanWhenDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING:
				return basicSetMultiDataBinding(null, msgs);
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				return basicSetStartEnvelopeSpec(null, msgs);
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				return basicSetMaxEnvelopeSpec(null, msgs);
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				return basicSetScaleEnvelopeSpec(null, msgs);
			case GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING:
				return basicSetEditDataBinding(null, msgs);
			case GuigenPackage.MAP_VIEW__GADGETS:
				return basicSetGadgets(null, msgs);
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
			case GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING:
				return getMultiDataBinding();
			case GuigenPackage.MAP_VIEW__MAP_ID:
				return getMapId();
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				return getStartEnvelopeSpec();
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				return getMaxEnvelopeSpec();
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				return getScaleEnvelopeSpec();
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				return getNumLevels();
			case GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING:
				return getEditDataBinding();
			case GuigenPackage.MAP_VIEW__GADGETS:
				return getGadgets();
			case GuigenPackage.MAP_VIEW__NO_CLICK_WHEN_DISABLED:
				return isNoClickWhenDisabled();
			case GuigenPackage.MAP_VIEW__NO_EDIT_WHEN_DISABLED:
				return isNoEditWhenDisabled();
			case GuigenPackage.MAP_VIEW__NO_ZOOM_WHEN_DISABLED:
				return isNoZoomWhenDisabled();
			case GuigenPackage.MAP_VIEW__NO_PAN_WHEN_DISABLED:
				return isNoPanWhenDisabled();
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
			case GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.MAP_VIEW__MAP_ID:
				setMapId((String)newValue);
				return;
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				setStartEnvelopeSpec((MapEnvelope)newValue);
				return;
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				setMaxEnvelopeSpec((MapEnvelope)newValue);
				return;
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				setScaleEnvelopeSpec((MapEnvelope)newValue);
				return;
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				setNumLevels((Integer)newValue);
				return;
			case GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING:
				setEditDataBinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.MAP_VIEW__GADGETS:
				setGadgets((MapViewGadgets)newValue);
				return;
			case GuigenPackage.MAP_VIEW__NO_CLICK_WHEN_DISABLED:
				setNoClickWhenDisabled((Boolean)newValue);
				return;
			case GuigenPackage.MAP_VIEW__NO_EDIT_WHEN_DISABLED:
				setNoEditWhenDisabled((Boolean)newValue);
				return;
			case GuigenPackage.MAP_VIEW__NO_ZOOM_WHEN_DISABLED:
				setNoZoomWhenDisabled((Boolean)newValue);
				return;
			case GuigenPackage.MAP_VIEW__NO_PAN_WHEN_DISABLED:
				setNoPanWhenDisabled((Boolean)newValue);
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
			case GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)null);
				return;
			case GuigenPackage.MAP_VIEW__MAP_ID:
				setMapId(MAP_ID_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				setStartEnvelopeSpec((MapEnvelope)null);
				return;
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				setMaxEnvelopeSpec((MapEnvelope)null);
				return;
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				setScaleEnvelopeSpec((MapEnvelope)null);
				return;
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				setNumLevels(NUM_LEVELS_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING:
				setEditDataBinding((AppDataBinding)null);
				return;
			case GuigenPackage.MAP_VIEW__GADGETS:
				setGadgets((MapViewGadgets)null);
				return;
			case GuigenPackage.MAP_VIEW__NO_CLICK_WHEN_DISABLED:
				setNoClickWhenDisabled(NO_CLICK_WHEN_DISABLED_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW__NO_EDIT_WHEN_DISABLED:
				setNoEditWhenDisabled(NO_EDIT_WHEN_DISABLED_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW__NO_ZOOM_WHEN_DISABLED:
				setNoZoomWhenDisabled(NO_ZOOM_WHEN_DISABLED_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW__NO_PAN_WHEN_DISABLED:
				setNoPanWhenDisabled(NO_PAN_WHEN_DISABLED_EDEFAULT);
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
			case GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING:
				return multiDataBinding != null;
			case GuigenPackage.MAP_VIEW__MAP_ID:
				return MAP_ID_EDEFAULT == null ? mapId != null : !MAP_ID_EDEFAULT.equals(mapId);
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
				return startEnvelopeSpec != null;
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
				return maxEnvelopeSpec != null;
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
				return scaleEnvelopeSpec != null;
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
				return numLevels != NUM_LEVELS_EDEFAULT;
			case GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING:
				return editDataBinding != null;
			case GuigenPackage.MAP_VIEW__GADGETS:
				return gadgets != null;
			case GuigenPackage.MAP_VIEW__NO_CLICK_WHEN_DISABLED:
				return noClickWhenDisabled != NO_CLICK_WHEN_DISABLED_EDEFAULT;
			case GuigenPackage.MAP_VIEW__NO_EDIT_WHEN_DISABLED:
				return noEditWhenDisabled != NO_EDIT_WHEN_DISABLED_EDEFAULT;
			case GuigenPackage.MAP_VIEW__NO_ZOOM_WHEN_DISABLED:
				return noZoomWhenDisabled != NO_ZOOM_WHEN_DISABLED_EDEFAULT;
			case GuigenPackage.MAP_VIEW__NO_PAN_WHEN_DISABLED:
				return noPanWhenDisabled != NO_PAN_WHEN_DISABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiDataWidget.class) {
			switch (derivedFeatureID) {
				case GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING: return GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiDataWidget.class) {
			switch (baseFeatureID) {
				case GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING: return GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mapId: ");
		result.append(mapId);
		result.append(", numLevels: ");
		result.append(numLevels);
		result.append(", noClickWhenDisabled: ");
		result.append(noClickWhenDisabled);
		result.append(", noEditWhenDisabled: ");
		result.append(noEditWhenDisabled);
		result.append(", noZoomWhenDisabled: ");
		result.append(noZoomWhenDisabled);
		result.append(", noPanWhenDisabled: ");
		result.append(noPanWhenDisabled);
		result.append(')');
		return result.toString();
	}

} //MapViewImpl
