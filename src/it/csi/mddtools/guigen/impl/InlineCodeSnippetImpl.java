/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.InlineCodeSnippet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Code Snippet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl#getSnippetPosition <em>Snippet Position</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl#getSnippetName <em>Snippet Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl#getSnippetCode <em>Snippet Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.InlineCodeSnippetImpl#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineCodeSnippetImpl extends EObjectImpl implements InlineCodeSnippet {
	/**
	 * The default value of the '{@link #getSnippetPosition() <em>Snippet Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippetPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String SNIPPET_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnippetPosition() <em>Snippet Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippetPosition()
	 * @generated
	 * @ordered
	 */
	protected String snippetPosition = SNIPPET_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnippetName() <em>Snippet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SNIPPET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnippetName() <em>Snippet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippetName()
	 * @generated
	 * @ordered
	 */
	protected String snippetName = SNIPPET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnippetCode() <em>Snippet Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippetCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SNIPPET_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnippetCode() <em>Snippet Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippetCode()
	 * @generated
	 * @ordered
	 */
	protected String snippetCode = SNIPPET_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineCodeSnippetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.INLINE_CODE_SNIPPET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSnippetPosition() {
		return snippetPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnippetPosition(String newSnippetPosition) {
		String oldSnippetPosition = snippetPosition;
		snippetPosition = newSnippetPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_POSITION, oldSnippetPosition, snippetPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSnippetName() {
		return snippetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnippetName(String newSnippetName) {
		String oldSnippetName = snippetName;
		snippetName = newSnippetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_NAME, oldSnippetName, snippetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSnippetCode() {
		return snippetCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnippetCode(String newSnippetCode) {
		String oldSnippetCode = snippetCode;
		snippetCode = newSnippetCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_CODE, oldSnippetCode, snippetCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.INLINE_CODE_SNIPPET__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_POSITION:
				return getSnippetPosition();
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_NAME:
				return getSnippetName();
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_CODE:
				return getSnippetCode();
			case GuigenPackage.INLINE_CODE_SNIPPET__LANG:
				return getLang();
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
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_POSITION:
				setSnippetPosition((String)newValue);
				return;
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_NAME:
				setSnippetName((String)newValue);
				return;
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_CODE:
				setSnippetCode((String)newValue);
				return;
			case GuigenPackage.INLINE_CODE_SNIPPET__LANG:
				setLang((String)newValue);
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
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_POSITION:
				setSnippetPosition(SNIPPET_POSITION_EDEFAULT);
				return;
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_NAME:
				setSnippetName(SNIPPET_NAME_EDEFAULT);
				return;
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_CODE:
				setSnippetCode(SNIPPET_CODE_EDEFAULT);
				return;
			case GuigenPackage.INLINE_CODE_SNIPPET__LANG:
				setLang(LANG_EDEFAULT);
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
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_POSITION:
				return SNIPPET_POSITION_EDEFAULT == null ? snippetPosition != null : !SNIPPET_POSITION_EDEFAULT.equals(snippetPosition);
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_NAME:
				return SNIPPET_NAME_EDEFAULT == null ? snippetName != null : !SNIPPET_NAME_EDEFAULT.equals(snippetName);
			case GuigenPackage.INLINE_CODE_SNIPPET__SNIPPET_CODE:
				return SNIPPET_CODE_EDEFAULT == null ? snippetCode != null : !SNIPPET_CODE_EDEFAULT.equals(snippetCode);
			case GuigenPackage.INLINE_CODE_SNIPPET__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
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
		result.append(" (snippetPosition: ");
		result.append(snippetPosition);
		result.append(", snippetName: ");
		result.append(snippetName);
		result.append(", snippetCode: ");
		result.append(snippetCode);
		result.append(", lang: ");
		result.append(lang);
		result.append(')');
		return result.toString();
	}

} //InlineCodeSnippetImpl
