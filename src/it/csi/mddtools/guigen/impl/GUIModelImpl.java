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

import it.csi.mddtools.guigen.ActivationModel;
import it.csi.mddtools.guigen.ApplicationDataDefs;
import it.csi.mddtools.guigen.GUIBehaviors;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GUIStructure;
import it.csi.mddtools.guigen.GuigenPackage;

import it.csi.mddtools.guigen.PortalNames;
import it.csi.mddtools.guigen.SecurityModel;
import it.csi.mddtools.guigen.TargetPlatform;
import it.csi.mddtools.guigen.Typedefs;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GUI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getBeahviors <em>Beahviors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getCodComponente <em>Cod Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getVersioneProdotto <em>Versione Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getVersioneComponente <em>Versione Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getTypedefs <em>Typedefs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getAppDataDefs <em>App Data Defs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getPortale <em>Portale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getSecurityModel <em>Security Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getExtSecurityModel <em>Ext Security Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getTargetPlatform <em>Target Platform</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getActivationModel <em>Activation Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GUIModelImpl extends EObjectImpl implements GUIModel {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected GUIStructure structure;

	/**
	 * The cached value of the '{@link #getBeahviors() <em>Beahviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeahviors()
	 * @generated
	 * @ordered
	 */
	protected GUIBehaviors beahviors;

	/**
	 * The default value of the '{@link #getCodProdotto() <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProdotto()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_PRODOTTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodProdotto() <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProdotto()
	 * @generated
	 * @ordered
	 */
	protected String codProdotto = COD_PRODOTTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodComponente() <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodComponente()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_COMPONENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodComponente() <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodComponente()
	 * @generated
	 * @ordered
	 */
	protected String codComponente = COD_COMPONENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersioneProdotto() <em>Versione Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneProdotto()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONE_PRODOTTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersioneProdotto() <em>Versione Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneProdotto()
	 * @generated
	 * @ordered
	 */
	protected String versioneProdotto = VERSIONE_PRODOTTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersioneComponente() <em>Versione Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneComponente()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONE_COMPONENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersioneComponente() <em>Versione Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneComponente()
	 * @generated
	 * @ordered
	 */
	protected String versioneComponente = VERSIONE_COMPONENTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedefs() <em>Typedefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedefs()
	 * @generated
	 * @ordered
	 */
	protected Typedefs typedefs;

	/**
	 * The cached value of the '{@link #getAppDataDefs() <em>App Data Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppDataDefs()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDataDefs appDataDefs;

	/**
	 * The default value of the '{@link #getPortale() <em>Portale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortale()
	 * @generated
	 * @ordered
	 */
	protected static final PortalNames PORTALE_EDEFAULT = PortalNames.SISTEMA_PIEMONTE;

	/**
	 * The cached value of the '{@link #getPortale() <em>Portale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortale()
	 * @generated
	 * @ordered
	 */
	protected PortalNames portale = PORTALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurityModel() <em>Security Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityModel()
	 * @generated
	 * @ordered
	 */
	protected SecurityModel securityModel;

	/**
	 * The cached value of the '{@link #getExtSecurityModel() <em>Ext Security Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtSecurityModel()
	 * @generated
	 * @ordered
	 */
	protected SecurityModel extSecurityModel;

	/**
	 * The cached value of the '{@link #getTargetPlatform() <em>Target Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatform()
	 * @generated
	 * @ordered
	 */
	protected TargetPlatform targetPlatform;

	/**
	 * The cached value of the '{@link #getActivationModel() <em>Activation Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationModel()
	 * @generated
	 * @ordered
	 */
	protected ActivationModel activationModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.GUI_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(GUIStructure newStructure, NotificationChain msgs) {
		GUIStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(GUIStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIBehaviors getBeahviors() {
		return beahviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeahviors(GUIBehaviors newBeahviors, NotificationChain msgs) {
		GUIBehaviors oldBeahviors = beahviors;
		beahviors = newBeahviors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__BEAHVIORS, oldBeahviors, newBeahviors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeahviors(GUIBehaviors newBeahviors) {
		if (newBeahviors != beahviors) {
			NotificationChain msgs = null;
			if (beahviors != null)
				msgs = ((InternalEObject)beahviors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__BEAHVIORS, null, msgs);
			if (newBeahviors != null)
				msgs = ((InternalEObject)newBeahviors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__BEAHVIORS, null, msgs);
			msgs = basicSetBeahviors(newBeahviors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__BEAHVIORS, newBeahviors, newBeahviors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodProdotto() {
		return codProdotto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodProdotto(String newCodProdotto) {
		String oldCodProdotto = codProdotto;
		codProdotto = newCodProdotto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__COD_PRODOTTO, oldCodProdotto, codProdotto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodComponente() {
		return codComponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodComponente(String newCodComponente) {
		String oldCodComponente = codComponente;
		codComponente = newCodComponente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__COD_COMPONENTE, oldCodComponente, codComponente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersioneProdotto() {
		return versioneProdotto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioneProdotto(String newVersioneProdotto) {
		String oldVersioneProdotto = versioneProdotto;
		versioneProdotto = newVersioneProdotto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__VERSIONE_PRODOTTO, oldVersioneProdotto, versioneProdotto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersioneComponente() {
		return versioneComponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioneComponente(String newVersioneComponente) {
		String oldVersioneComponente = versioneComponente;
		versioneComponente = newVersioneComponente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__VERSIONE_COMPONENTE, oldVersioneComponente, versioneComponente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Typedefs getTypedefs() {
		return typedefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedefs(Typedefs newTypedefs, NotificationChain msgs) {
		Typedefs oldTypedefs = typedefs;
		typedefs = newTypedefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__TYPEDEFS, oldTypedefs, newTypedefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedefs(Typedefs newTypedefs) {
		if (newTypedefs != typedefs) {
			NotificationChain msgs = null;
			if (typedefs != null)
				msgs = ((InternalEObject)typedefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__TYPEDEFS, null, msgs);
			if (newTypedefs != null)
				msgs = ((InternalEObject)newTypedefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__TYPEDEFS, null, msgs);
			msgs = basicSetTypedefs(newTypedefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__TYPEDEFS, newTypedefs, newTypedefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataDefs getAppDataDefs() {
		return appDataDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppDataDefs(ApplicationDataDefs newAppDataDefs, NotificationChain msgs) {
		ApplicationDataDefs oldAppDataDefs = appDataDefs;
		appDataDefs = newAppDataDefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__APP_DATA_DEFS, oldAppDataDefs, newAppDataDefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppDataDefs(ApplicationDataDefs newAppDataDefs) {
		if (newAppDataDefs != appDataDefs) {
			NotificationChain msgs = null;
			if (appDataDefs != null)
				msgs = ((InternalEObject)appDataDefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__APP_DATA_DEFS, null, msgs);
			if (newAppDataDefs != null)
				msgs = ((InternalEObject)newAppDataDefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__APP_DATA_DEFS, null, msgs);
			msgs = basicSetAppDataDefs(newAppDataDefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__APP_DATA_DEFS, newAppDataDefs, newAppDataDefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalNames getPortale() {
		return portale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortale(PortalNames newPortale) {
		PortalNames oldPortale = portale;
		portale = newPortale == null ? PORTALE_EDEFAULT : newPortale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__PORTALE, oldPortale, portale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModel getSecurityModel() {
		return securityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityModel(SecurityModel newSecurityModel, NotificationChain msgs) {
		SecurityModel oldSecurityModel = securityModel;
		securityModel = newSecurityModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__SECURITY_MODEL, oldSecurityModel, newSecurityModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityModel(SecurityModel newSecurityModel) {
		if (newSecurityModel != securityModel) {
			NotificationChain msgs = null;
			if (securityModel != null)
				msgs = ((InternalEObject)securityModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__SECURITY_MODEL, null, msgs);
			if (newSecurityModel != null)
				msgs = ((InternalEObject)newSecurityModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__SECURITY_MODEL, null, msgs);
			msgs = basicSetSecurityModel(newSecurityModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__SECURITY_MODEL, newSecurityModel, newSecurityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModel getExtSecurityModel() {
		if (extSecurityModel != null && extSecurityModel.eIsProxy()) {
			InternalEObject oldExtSecurityModel = (InternalEObject)extSecurityModel;
			extSecurityModel = (SecurityModel)eResolveProxy(oldExtSecurityModel);
			if (extSecurityModel != oldExtSecurityModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.GUI_MODEL__EXT_SECURITY_MODEL, oldExtSecurityModel, extSecurityModel));
			}
		}
		return extSecurityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModel basicGetExtSecurityModel() {
		return extSecurityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtSecurityModel(SecurityModel newExtSecurityModel) {
		SecurityModel oldExtSecurityModel = extSecurityModel;
		extSecurityModel = newExtSecurityModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__EXT_SECURITY_MODEL, oldExtSecurityModel, extSecurityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatform getTargetPlatform() {
		return targetPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPlatform(TargetPlatform newTargetPlatform, NotificationChain msgs) {
		TargetPlatform oldTargetPlatform = targetPlatform;
		targetPlatform = newTargetPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__TARGET_PLATFORM, oldTargetPlatform, newTargetPlatform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPlatform(TargetPlatform newTargetPlatform) {
		if (newTargetPlatform != targetPlatform) {
			NotificationChain msgs = null;
			if (targetPlatform != null)
				msgs = ((InternalEObject)targetPlatform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__TARGET_PLATFORM, null, msgs);
			if (newTargetPlatform != null)
				msgs = ((InternalEObject)newTargetPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__TARGET_PLATFORM, null, msgs);
			msgs = basicSetTargetPlatform(newTargetPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__TARGET_PLATFORM, newTargetPlatform, newTargetPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationModel getActivationModel() {
		return activationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationModel(ActivationModel newActivationModel, NotificationChain msgs) {
		ActivationModel oldActivationModel = activationModel;
		activationModel = newActivationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__ACTIVATION_MODEL, oldActivationModel, newActivationModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationModel(ActivationModel newActivationModel) {
		if (newActivationModel != activationModel) {
			NotificationChain msgs = null;
			if (activationModel != null)
				msgs = ((InternalEObject)activationModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__ACTIVATION_MODEL, null, msgs);
			if (newActivationModel != null)
				msgs = ((InternalEObject)newActivationModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.GUI_MODEL__ACTIVATION_MODEL, null, msgs);
			msgs = basicSetActivationModel(newActivationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GUI_MODEL__ACTIVATION_MODEL, newActivationModel, newActivationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				return basicSetStructure(null, msgs);
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				return basicSetBeahviors(null, msgs);
			case GuigenPackage.GUI_MODEL__TYPEDEFS:
				return basicSetTypedefs(null, msgs);
			case GuigenPackage.GUI_MODEL__APP_DATA_DEFS:
				return basicSetAppDataDefs(null, msgs);
			case GuigenPackage.GUI_MODEL__SECURITY_MODEL:
				return basicSetSecurityModel(null, msgs);
			case GuigenPackage.GUI_MODEL__TARGET_PLATFORM:
				return basicSetTargetPlatform(null, msgs);
			case GuigenPackage.GUI_MODEL__ACTIVATION_MODEL:
				return basicSetActivationModel(null, msgs);
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				return getStructure();
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				return getBeahviors();
			case GuigenPackage.GUI_MODEL__COD_PRODOTTO:
				return getCodProdotto();
			case GuigenPackage.GUI_MODEL__COD_COMPONENTE:
				return getCodComponente();
			case GuigenPackage.GUI_MODEL__VERSIONE_PRODOTTO:
				return getVersioneProdotto();
			case GuigenPackage.GUI_MODEL__VERSIONE_COMPONENTE:
				return getVersioneComponente();
			case GuigenPackage.GUI_MODEL__TYPEDEFS:
				return getTypedefs();
			case GuigenPackage.GUI_MODEL__APP_DATA_DEFS:
				return getAppDataDefs();
			case GuigenPackage.GUI_MODEL__PORTALE:
				return getPortale();
			case GuigenPackage.GUI_MODEL__SECURITY_MODEL:
				return getSecurityModel();
			case GuigenPackage.GUI_MODEL__EXT_SECURITY_MODEL:
				if (resolve) return getExtSecurityModel();
				return basicGetExtSecurityModel();
			case GuigenPackage.GUI_MODEL__TARGET_PLATFORM:
				return getTargetPlatform();
			case GuigenPackage.GUI_MODEL__ACTIVATION_MODEL:
				return getActivationModel();
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				setStructure((GUIStructure)newValue);
				return;
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				setBeahviors((GUIBehaviors)newValue);
				return;
			case GuigenPackage.GUI_MODEL__COD_PRODOTTO:
				setCodProdotto((String)newValue);
				return;
			case GuigenPackage.GUI_MODEL__COD_COMPONENTE:
				setCodComponente((String)newValue);
				return;
			case GuigenPackage.GUI_MODEL__VERSIONE_PRODOTTO:
				setVersioneProdotto((String)newValue);
				return;
			case GuigenPackage.GUI_MODEL__VERSIONE_COMPONENTE:
				setVersioneComponente((String)newValue);
				return;
			case GuigenPackage.GUI_MODEL__TYPEDEFS:
				setTypedefs((Typedefs)newValue);
				return;
			case GuigenPackage.GUI_MODEL__APP_DATA_DEFS:
				setAppDataDefs((ApplicationDataDefs)newValue);
				return;
			case GuigenPackage.GUI_MODEL__PORTALE:
				setPortale((PortalNames)newValue);
				return;
			case GuigenPackage.GUI_MODEL__SECURITY_MODEL:
				setSecurityModel((SecurityModel)newValue);
				return;
			case GuigenPackage.GUI_MODEL__EXT_SECURITY_MODEL:
				setExtSecurityModel((SecurityModel)newValue);
				return;
			case GuigenPackage.GUI_MODEL__TARGET_PLATFORM:
				setTargetPlatform((TargetPlatform)newValue);
				return;
			case GuigenPackage.GUI_MODEL__ACTIVATION_MODEL:
				setActivationModel((ActivationModel)newValue);
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				setStructure((GUIStructure)null);
				return;
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				setBeahviors((GUIBehaviors)null);
				return;
			case GuigenPackage.GUI_MODEL__COD_PRODOTTO:
				setCodProdotto(COD_PRODOTTO_EDEFAULT);
				return;
			case GuigenPackage.GUI_MODEL__COD_COMPONENTE:
				setCodComponente(COD_COMPONENTE_EDEFAULT);
				return;
			case GuigenPackage.GUI_MODEL__VERSIONE_PRODOTTO:
				setVersioneProdotto(VERSIONE_PRODOTTO_EDEFAULT);
				return;
			case GuigenPackage.GUI_MODEL__VERSIONE_COMPONENTE:
				setVersioneComponente(VERSIONE_COMPONENTE_EDEFAULT);
				return;
			case GuigenPackage.GUI_MODEL__TYPEDEFS:
				setTypedefs((Typedefs)null);
				return;
			case GuigenPackage.GUI_MODEL__APP_DATA_DEFS:
				setAppDataDefs((ApplicationDataDefs)null);
				return;
			case GuigenPackage.GUI_MODEL__PORTALE:
				setPortale(PORTALE_EDEFAULT);
				return;
			case GuigenPackage.GUI_MODEL__SECURITY_MODEL:
				setSecurityModel((SecurityModel)null);
				return;
			case GuigenPackage.GUI_MODEL__EXT_SECURITY_MODEL:
				setExtSecurityModel((SecurityModel)null);
				return;
			case GuigenPackage.GUI_MODEL__TARGET_PLATFORM:
				setTargetPlatform((TargetPlatform)null);
				return;
			case GuigenPackage.GUI_MODEL__ACTIVATION_MODEL:
				setActivationModel((ActivationModel)null);
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
			case GuigenPackage.GUI_MODEL__STRUCTURE:
				return structure != null;
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
				return beahviors != null;
			case GuigenPackage.GUI_MODEL__COD_PRODOTTO:
				return COD_PRODOTTO_EDEFAULT == null ? codProdotto != null : !COD_PRODOTTO_EDEFAULT.equals(codProdotto);
			case GuigenPackage.GUI_MODEL__COD_COMPONENTE:
				return COD_COMPONENTE_EDEFAULT == null ? codComponente != null : !COD_COMPONENTE_EDEFAULT.equals(codComponente);
			case GuigenPackage.GUI_MODEL__VERSIONE_PRODOTTO:
				return VERSIONE_PRODOTTO_EDEFAULT == null ? versioneProdotto != null : !VERSIONE_PRODOTTO_EDEFAULT.equals(versioneProdotto);
			case GuigenPackage.GUI_MODEL__VERSIONE_COMPONENTE:
				return VERSIONE_COMPONENTE_EDEFAULT == null ? versioneComponente != null : !VERSIONE_COMPONENTE_EDEFAULT.equals(versioneComponente);
			case GuigenPackage.GUI_MODEL__TYPEDEFS:
				return typedefs != null;
			case GuigenPackage.GUI_MODEL__APP_DATA_DEFS:
				return appDataDefs != null;
			case GuigenPackage.GUI_MODEL__PORTALE:
				return portale != PORTALE_EDEFAULT;
			case GuigenPackage.GUI_MODEL__SECURITY_MODEL:
				return securityModel != null;
			case GuigenPackage.GUI_MODEL__EXT_SECURITY_MODEL:
				return extSecurityModel != null;
			case GuigenPackage.GUI_MODEL__TARGET_PLATFORM:
				return targetPlatform != null;
			case GuigenPackage.GUI_MODEL__ACTIVATION_MODEL:
				return activationModel != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (codProdotto: ");
		result.append(codProdotto);
		result.append(", codComponente: ");
		result.append(codComponente);
		result.append(", versioneProdotto: ");
		result.append(versioneProdotto);
		result.append(", versioneComponente: ");
		result.append(versioneComponente);
		result.append(", portale: ");
		result.append(portale);
		result.append(')');
		return result.toString();
	}

} //GUIModelImpl
