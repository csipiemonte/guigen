/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.EnvConfigParams;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.IdentityAdapter;
import it.csi.mddtools.guigen.InfoSourceTypes;

import it.csi.mddtools.guigen.InlineCodeSnippet;
import it.csi.mddtools.guigen.TicketVerifyMethod;
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
 * An implementation of the model object '<em><b>Identity Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl#getInfoSourceName <em>Info Source Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl#getTicketVerifyMethod <em>Ticket Verify Method</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl#getInlineCodeSnippets <em>Inline Code Snippets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.IdentityAdapterImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentityAdapterImpl extends EObjectImpl implements IdentityAdapter {
	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final InfoSourceTypes SOURCE_TYPE_EDEFAULT = InfoSourceTypes.REQUEST_PARAM;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected InfoSourceTypes sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoSourceName() <em>Info Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoSourceName() <em>Info Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoSourceName()
	 * @generated
	 * @ordered
	 */
	protected String infoSourceName = INFO_SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTicketVerifyMethod() <em>Ticket Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketVerifyMethod()
	 * @generated
	 * @ordered
	 */
	protected static final TicketVerifyMethod TICKET_VERIFY_METHOD_EDEFAULT = TicketVerifyMethod.LOCAL;

	/**
	 * The cached value of the '{@link #getTicketVerifyMethod() <em>Ticket Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketVerifyMethod()
	 * @generated
	 * @ordered
	 */
	protected TicketVerifyMethod ticketVerifyMethod = TICKET_VERIFY_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInlineCodeSnippets() <em>Inline Code Snippets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineCodeSnippets()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineCodeSnippet> inlineCodeSnippets;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EnvConfigParams params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.IDENTITY_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoSourceTypes getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(InfoSourceTypes newSourceType) {
		InfoSourceTypes oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoSourceName() {
		return infoSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoSourceName(String newInfoSourceName) {
		String oldInfoSourceName = infoSourceName;
		infoSourceName = newInfoSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME, oldInfoSourceName, infoSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketVerifyMethod getTicketVerifyMethod() {
		return ticketVerifyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTicketVerifyMethod(TicketVerifyMethod newTicketVerifyMethod) {
		TicketVerifyMethod oldTicketVerifyMethod = ticketVerifyMethod;
		ticketVerifyMethod = newTicketVerifyMethod == null ? TICKET_VERIFY_METHOD_EDEFAULT : newTicketVerifyMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.IDENTITY_ADAPTER__TICKET_VERIFY_METHOD, oldTicketVerifyMethod, ticketVerifyMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InlineCodeSnippet> getInlineCodeSnippets() {
		if (inlineCodeSnippets == null) {
			inlineCodeSnippets = new EObjectContainmentEList<InlineCodeSnippet>(InlineCodeSnippet.class, this, GuigenPackage.IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS);
		}
		return inlineCodeSnippets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvConfigParams getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(EnvConfigParams newParams, NotificationChain msgs) {
		EnvConfigParams oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.IDENTITY_ADAPTER__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(EnvConfigParams newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.IDENTITY_ADAPTER__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.IDENTITY_ADAPTER__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.IDENTITY_ADAPTER__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS:
				return ((InternalEList<?>)getInlineCodeSnippets()).basicRemove(otherEnd, msgs);
			case GuigenPackage.IDENTITY_ADAPTER__PARAMS:
				return basicSetParams(null, msgs);
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
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				return getSourceType();
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				return getInfoSourceName();
			case GuigenPackage.IDENTITY_ADAPTER__TICKET_VERIFY_METHOD:
				return getTicketVerifyMethod();
			case GuigenPackage.IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS:
				return getInlineCodeSnippets();
			case GuigenPackage.IDENTITY_ADAPTER__PARAMS:
				return getParams();
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
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				setSourceType((InfoSourceTypes)newValue);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				setInfoSourceName((String)newValue);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__TICKET_VERIFY_METHOD:
				setTicketVerifyMethod((TicketVerifyMethod)newValue);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS:
				getInlineCodeSnippets().clear();
				getInlineCodeSnippets().addAll((Collection<? extends InlineCodeSnippet>)newValue);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__PARAMS:
				setParams((EnvConfigParams)newValue);
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
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				setInfoSourceName(INFO_SOURCE_NAME_EDEFAULT);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__TICKET_VERIFY_METHOD:
				setTicketVerifyMethod(TICKET_VERIFY_METHOD_EDEFAULT);
				return;
			case GuigenPackage.IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS:
				getInlineCodeSnippets().clear();
				return;
			case GuigenPackage.IDENTITY_ADAPTER__PARAMS:
				setParams((EnvConfigParams)null);
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
			case GuigenPackage.IDENTITY_ADAPTER__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case GuigenPackage.IDENTITY_ADAPTER__INFO_SOURCE_NAME:
				return INFO_SOURCE_NAME_EDEFAULT == null ? infoSourceName != null : !INFO_SOURCE_NAME_EDEFAULT.equals(infoSourceName);
			case GuigenPackage.IDENTITY_ADAPTER__TICKET_VERIFY_METHOD:
				return ticketVerifyMethod != TICKET_VERIFY_METHOD_EDEFAULT;
			case GuigenPackage.IDENTITY_ADAPTER__INLINE_CODE_SNIPPETS:
				return inlineCodeSnippets != null && !inlineCodeSnippets.isEmpty();
			case GuigenPackage.IDENTITY_ADAPTER__PARAMS:
				return params != null;
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
		result.append(" (sourceType: ");
		result.append(sourceType);
		result.append(", infoSourceName: ");
		result.append(infoSourceName);
		result.append(", ticketVerifyMethod: ");
		result.append(ticketVerifyMethod);
		result.append(')');
		return result.toString();
	}

} //IdentityAdapterImpl
