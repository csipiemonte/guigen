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
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypeNamespace;
import it.csi.mddtools.guigen.Typedefs;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typedefs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TypedefsImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TypedefsImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TypedefsImpl#getExtNamespaces <em>Ext Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedefsImpl extends EObjectImpl implements Typedefs {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeNamespace> namespaces;

	/**
	 * The cached value of the '{@link #getExtNamespaces() <em>Ext Namespaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeNamespace> extNamespaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedefsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TYPEDEFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, GuigenPackage.TYPEDEFS__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeNamespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentEList<TypeNamespace>(TypeNamespace.class, this, GuigenPackage.TYPEDEFS__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeNamespace> getExtNamespaces() {
		if (extNamespaces == null) {
			extNamespaces = new EObjectResolvingEList<TypeNamespace>(TypeNamespace.class, this, GuigenPackage.TYPEDEFS__EXT_NAMESPACES);
		}
		return extNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.TYPEDEFS__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case GuigenPackage.TYPEDEFS__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.TYPEDEFS__TYPES:
				return getTypes();
			case GuigenPackage.TYPEDEFS__NAMESPACES:
				return getNamespaces();
			case GuigenPackage.TYPEDEFS__EXT_NAMESPACES:
				return getExtNamespaces();
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
			case GuigenPackage.TYPEDEFS__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case GuigenPackage.TYPEDEFS__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends TypeNamespace>)newValue);
				return;
			case GuigenPackage.TYPEDEFS__EXT_NAMESPACES:
				getExtNamespaces().clear();
				getExtNamespaces().addAll((Collection<? extends TypeNamespace>)newValue);
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
			case GuigenPackage.TYPEDEFS__TYPES:
				getTypes().clear();
				return;
			case GuigenPackage.TYPEDEFS__NAMESPACES:
				getNamespaces().clear();
				return;
			case GuigenPackage.TYPEDEFS__EXT_NAMESPACES:
				getExtNamespaces().clear();
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
			case GuigenPackage.TYPEDEFS__TYPES:
				return types != null && !types.isEmpty();
			case GuigenPackage.TYPEDEFS__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case GuigenPackage.TYPEDEFS__EXT_NAMESPACES:
				return extNamespaces != null && !extNamespaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypedefsImpl
