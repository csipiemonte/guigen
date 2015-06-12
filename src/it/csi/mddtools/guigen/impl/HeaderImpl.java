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
import it.csi.mddtools.guigen.Header;

import it.csi.mddtools.guigen.HeaderMetaAttr;
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
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getCodCanale <em>Cod Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getCodApplicativo <em>Cod Applicativo</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getNomeCanale <em>Nome Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getLinkCanale <em>Link Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getNomeApplicativo <em>Nome Applicativo</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.HeaderImpl#getMetaAttributes <em>Meta Attributes</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getNomeCanale() <em>Nome Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeCanale()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_CANALE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNomeCanale() <em>Nome Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeCanale()
	 * @generated
	 * @ordered
	 */
	protected String nomeCanale = NOME_CANALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLinkCanale() <em>Link Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCanale()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_CANALE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLinkCanale() <em>Link Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCanale()
	 * @generated
	 * @ordered
	 */
	protected String linkCanale = LINK_CANALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNomeApplicativo() <em>Nome Applicativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeApplicativo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_APPLICATIVO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNomeApplicativo() <em>Nome Applicativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeApplicativo()
	 * @generated
	 * @ordered
	 */
	protected String nomeApplicativo = NOME_APPLICATIVO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMetaAttributes() <em>Meta Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<HeaderMetaAttr> metaAttributes;

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
	public String getNomeCanale() {
		return nomeCanale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeCanale(String newNomeCanale) {
		String oldNomeCanale = nomeCanale;
		nomeCanale = newNomeCanale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.HEADER__NOME_CANALE, oldNomeCanale, nomeCanale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkCanale() {
		return linkCanale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkCanale(String newLinkCanale) {
		String oldLinkCanale = linkCanale;
		linkCanale = newLinkCanale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.HEADER__LINK_CANALE, oldLinkCanale, linkCanale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeApplicativo() {
		return nomeApplicativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeApplicativo(String newNomeApplicativo) {
		String oldNomeApplicativo = nomeApplicativo;
		nomeApplicativo = newNomeApplicativo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.HEADER__NOME_APPLICATIVO, oldNomeApplicativo, nomeApplicativo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.HEADER__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderMetaAttr> getMetaAttributes() {
		if (metaAttributes == null) {
			metaAttributes = new EObjectContainmentEList<HeaderMetaAttr>(HeaderMetaAttr.class, this, GuigenPackage.HEADER__META_ATTRIBUTES);
		}
		return metaAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.HEADER__META_ATTRIBUTES:
				return ((InternalEList<?>)getMetaAttributes()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.HEADER__COD_CANALE:
				return getCodCanale();
			case GuigenPackage.HEADER__COD_APPLICATIVO:
				return getCodApplicativo();
			case GuigenPackage.HEADER__NOME_CANALE:
				return getNomeCanale();
			case GuigenPackage.HEADER__LINK_CANALE:
				return getLinkCanale();
			case GuigenPackage.HEADER__NOME_APPLICATIVO:
				return getNomeApplicativo();
			case GuigenPackage.HEADER__TITLE:
				return getTitle();
			case GuigenPackage.HEADER__META_ATTRIBUTES:
				return getMetaAttributes();
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
			case GuigenPackage.HEADER__COD_CANALE:
				setCodCanale((String)newValue);
				return;
			case GuigenPackage.HEADER__COD_APPLICATIVO:
				setCodApplicativo((String)newValue);
				return;
			case GuigenPackage.HEADER__NOME_CANALE:
				setNomeCanale((String)newValue);
				return;
			case GuigenPackage.HEADER__LINK_CANALE:
				setLinkCanale((String)newValue);
				return;
			case GuigenPackage.HEADER__NOME_APPLICATIVO:
				setNomeApplicativo((String)newValue);
				return;
			case GuigenPackage.HEADER__TITLE:
				setTitle((String)newValue);
				return;
			case GuigenPackage.HEADER__META_ATTRIBUTES:
				getMetaAttributes().clear();
				getMetaAttributes().addAll((Collection<? extends HeaderMetaAttr>)newValue);
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
			case GuigenPackage.HEADER__NOME_CANALE:
				setNomeCanale(NOME_CANALE_EDEFAULT);
				return;
			case GuigenPackage.HEADER__LINK_CANALE:
				setLinkCanale(LINK_CANALE_EDEFAULT);
				return;
			case GuigenPackage.HEADER__NOME_APPLICATIVO:
				setNomeApplicativo(NOME_APPLICATIVO_EDEFAULT);
				return;
			case GuigenPackage.HEADER__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GuigenPackage.HEADER__META_ATTRIBUTES:
				getMetaAttributes().clear();
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
			case GuigenPackage.HEADER__NOME_CANALE:
				return NOME_CANALE_EDEFAULT == null ? nomeCanale != null : !NOME_CANALE_EDEFAULT.equals(nomeCanale);
			case GuigenPackage.HEADER__LINK_CANALE:
				return LINK_CANALE_EDEFAULT == null ? linkCanale != null : !LINK_CANALE_EDEFAULT.equals(linkCanale);
			case GuigenPackage.HEADER__NOME_APPLICATIVO:
				return NOME_APPLICATIVO_EDEFAULT == null ? nomeApplicativo != null : !NOME_APPLICATIVO_EDEFAULT.equals(nomeApplicativo);
			case GuigenPackage.HEADER__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GuigenPackage.HEADER__META_ATTRIBUTES:
				return metaAttributes != null && !metaAttributes.isEmpty();
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
		result.append(", nomeCanale: ");
		result.append(nomeCanale);
		result.append(", linkCanale: ");
		result.append(linkCanale);
		result.append(", nomeApplicativo: ");
		result.append(nomeApplicativo);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
