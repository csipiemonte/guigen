/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.EnvConfigParam;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.InlineCodeSnippet;
import it.csi.mddtools.guigen.PEPImplementation;

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
 * An implementation of the model object '<em><b>PEP Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.PEPImplementationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PEPImplementationImpl#isCustom <em>Custom</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.PEPImplementationImpl#getInlineCodeSnippets <em>Inline Code Snippets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PEPImplementationImpl extends EObjectImpl implements PEPImplementation {
	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvConfigParam> params;

	/**
	 * The default value of the '{@link #isCustom() <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOM_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCustom() <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustom()
	 * @generated
	 * @ordered
	 */
	protected boolean custom = CUSTOM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PEPImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.PEP_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvConfigParam> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<EnvConfigParam>(EnvConfigParam.class, this, GuigenPackage.PEP_IMPLEMENTATION__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom(boolean newCustom) {
		boolean oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.PEP_IMPLEMENTATION__CUSTOM, oldCustom, custom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InlineCodeSnippet> getInlineCodeSnippets() {
		if (inlineCodeSnippets == null) {
			inlineCodeSnippets = new EObjectContainmentEList<InlineCodeSnippet>(InlineCodeSnippet.class, this, GuigenPackage.PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS);
		}
		return inlineCodeSnippets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.PEP_IMPLEMENTATION__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case GuigenPackage.PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS:
				return ((InternalEList<?>)getInlineCodeSnippets()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.PEP_IMPLEMENTATION__PARAMS:
				return getParams();
			case GuigenPackage.PEP_IMPLEMENTATION__CUSTOM:
				return isCustom();
			case GuigenPackage.PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS:
				return getInlineCodeSnippets();
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
			case GuigenPackage.PEP_IMPLEMENTATION__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends EnvConfigParam>)newValue);
				return;
			case GuigenPackage.PEP_IMPLEMENTATION__CUSTOM:
				setCustom((Boolean)newValue);
				return;
			case GuigenPackage.PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS:
				getInlineCodeSnippets().clear();
				getInlineCodeSnippets().addAll((Collection<? extends InlineCodeSnippet>)newValue);
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
			case GuigenPackage.PEP_IMPLEMENTATION__PARAMS:
				getParams().clear();
				return;
			case GuigenPackage.PEP_IMPLEMENTATION__CUSTOM:
				setCustom(CUSTOM_EDEFAULT);
				return;
			case GuigenPackage.PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS:
				getInlineCodeSnippets().clear();
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
			case GuigenPackage.PEP_IMPLEMENTATION__PARAMS:
				return params != null && !params.isEmpty();
			case GuigenPackage.PEP_IMPLEMENTATION__CUSTOM:
				return custom != CUSTOM_EDEFAULT;
			case GuigenPackage.PEP_IMPLEMENTATION__INLINE_CODE_SNIPPETS:
				return inlineCodeSnippets != null && !inlineCodeSnippets.isEmpty();
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
		result.append(" (custom: ");
		result.append(custom);
		result.append(')');
		return result.toString();
	}

} //PEPImplementationImpl
