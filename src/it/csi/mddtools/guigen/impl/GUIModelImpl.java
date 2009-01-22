/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationDataDefs;
import it.csi.mddtools.guigen.GUIBehaviors;
import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GUIStructure;
import it.csi.mddtools.guigen.GuigenPackage;

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
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getBeahviors <em>Beahviors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getCodComponente <em>Cod Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getVersioneProdotto <em>Versione Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getVersioneComponente <em>Versione Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getTypedefs <em>Typedefs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GUIModelImpl#getAppDataDefs <em>App Data Defs</em>}</li>
 * </ul>
 * </p>
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
		result.append(" (codProdotto: ");
		result.append(codProdotto);
		result.append(", codComponente: ");
		result.append(codComponente);
		result.append(", versioneProdotto: ");
		result.append(versioneProdotto);
		result.append(", versioneComponente: ");
		result.append(versioneComponente);
		result.append(')');
		return result.toString();
	}

} //GUIModelImpl
