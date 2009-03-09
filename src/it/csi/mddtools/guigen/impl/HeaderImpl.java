/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Header;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getCodCanale <em>Cod Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getCodApplicativo <em>Cod Applicativo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderImpl extends EObjectImpl implements Header {
	/**
	 * The default value of the '{@link #getCodCanale() <em>Cod Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodCanale()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_CANALE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCodCanale() <em>Cod Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodCanale()
	 * @generated
	 * @ordered
	 */
	protected String codCanale = COD_CANALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCodApplicativo() <em>Cod Applicativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodApplicativo()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_APPLICATIVO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCodApplicativo() <em>Cod Applicativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodApplicativo()
	 * @generated
	 * @ordered
	 */
	protected String codApplicativo = COD_APPLICATIVO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodCanale() {
		return codCanale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodCanale(String newCodCanale) {
		String oldCodCanale = codCanale;
		codCanale = newCodCanale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.HEADER__COD_CANALE, oldCodCanale, codCanale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodApplicativo() {
		return codApplicativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodApplicativo(String newCodApplicativo) {
		String oldCodApplicativo = codApplicativo;
		codApplicativo = newCodApplicativo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.HEADER__COD_APPLICATIVO, oldCodApplicativo, codApplicativo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.HEADER__COD_CANALE:
				return getCodCanale();
			case GuigenPackage.HEADER__COD_APPLICATIVO:
				return getCodApplicativo();
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
			case GuigenPackage.HEADER__COD_CANALE:
				setCodCanale((String)newValue);
				return;
			case GuigenPackage.HEADER__COD_APPLICATIVO:
				setCodApplicativo((String)newValue);
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
			case GuigenPackage.HEADER__COD_CANALE:
				setCodCanale(COD_CANALE_EDEFAULT);
				return;
			case GuigenPackage.HEADER__COD_APPLICATIVO:
				setCodApplicativo(COD_APPLICATIVO_EDEFAULT);
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
			case GuigenPackage.HEADER__COD_CANALE:
				return COD_CANALE_EDEFAULT == null ? codCanale != null : !COD_CANALE_EDEFAULT.equals(codCanale);
			case GuigenPackage.HEADER__COD_APPLICATIVO:
				return COD_APPLICATIVO_EDEFAULT == null ? codApplicativo != null : !COD_APPLICATIVO_EDEFAULT.equals(codApplicativo);
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
		result.append(" (codCanale: ");
		result.append(codCanale);
		result.append(", codApplicativo: ");
		result.append(codApplicativo);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
