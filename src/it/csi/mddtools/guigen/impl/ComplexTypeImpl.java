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

import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.Field;
import it.csi.mddtools.guigen.GuigenPackage;

import it.csi.mddtools.guigen.TypeAnnotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComplexTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComplexTypeImpl#isInitFields <em>Init Fields</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComplexTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ComplexTypeImpl#getTypeAnnotation <em>Type Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeImpl extends TypeImpl implements ComplexType {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The default value of the '{@link #isInitFields() <em>Init Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_FIELDS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInitFields() <em>Init Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitFields()
	 * @generated
	 * @ordered
	 */
	protected boolean initFields = INIT_FIELDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected ComplexType extends_;

	/**
	 * The cached value of the '{@link #getTypeAnnotation() <em>Type Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAnnotation> typeAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.COMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, GuigenPackage.COMPLEX_TYPE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitFields() {
		return initFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitFields(boolean newInitFields) {
		boolean oldInitFields = initFields;
		initFields = newInitFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COMPLEX_TYPE__INIT_FIELDS, oldInitFields, initFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (ComplexType)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuigenPackage.COMPLEX_TYPE__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(ComplexType newExtends) {
		ComplexType oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.COMPLEX_TYPE__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAnnotation> getTypeAnnotation() {
		if (typeAnnotation == null) {
			typeAnnotation = new EObjectContainmentEList<TypeAnnotation>(TypeAnnotation.class, this, GuigenPackage.COMPLEX_TYPE__TYPE_ANNOTATION);
		}
		return typeAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Restituisce l'elenco completo dei field definiti in questo complex type e nei super-tipi
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Field> getAllFields() {
		EList<Field> allFlds = getAllFieldsInternal(this, new ArrayList<ComplexType>());
		return allFlds;
	}

	/**
	 * 
	 * @param type
	 * @param alreadyVisited
	 * @return
	 * @generated NOT
	 */
	private EList<Field> getAllFieldsInternal(ComplexType type, ArrayList<ComplexType> alreadyVisited){
		EList<Field> ris = new BasicEList<Field>();
		if (alreadyVisited.contains(type)){
			// LOOP detected!!!
			return ris;
		}
		else{
			// field diretti
			ris.addAll(type.getFields());
			// field indiretti
			if (type.getExtends()!=null){
				alreadyVisited.add(type);
				ris.addAll(getAllFieldsInternal(type.getExtends(), alreadyVisited));
			}
			return ris;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.COMPLEX_TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case GuigenPackage.COMPLEX_TYPE__TYPE_ANNOTATION:
				return ((InternalEList<?>)getTypeAnnotation()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.COMPLEX_TYPE__FIELDS:
				return getFields();
			case GuigenPackage.COMPLEX_TYPE__INIT_FIELDS:
				return isInitFields();
			case GuigenPackage.COMPLEX_TYPE__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case GuigenPackage.COMPLEX_TYPE__TYPE_ANNOTATION:
				return getTypeAnnotation();
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
			case GuigenPackage.COMPLEX_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case GuigenPackage.COMPLEX_TYPE__INIT_FIELDS:
				setInitFields((Boolean)newValue);
				return;
			case GuigenPackage.COMPLEX_TYPE__EXTENDS:
				setExtends((ComplexType)newValue);
				return;
			case GuigenPackage.COMPLEX_TYPE__TYPE_ANNOTATION:
				getTypeAnnotation().clear();
				getTypeAnnotation().addAll((Collection<? extends TypeAnnotation>)newValue);
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
			case GuigenPackage.COMPLEX_TYPE__FIELDS:
				getFields().clear();
				return;
			case GuigenPackage.COMPLEX_TYPE__INIT_FIELDS:
				setInitFields(INIT_FIELDS_EDEFAULT);
				return;
			case GuigenPackage.COMPLEX_TYPE__EXTENDS:
				setExtends((ComplexType)null);
				return;
			case GuigenPackage.COMPLEX_TYPE__TYPE_ANNOTATION:
				getTypeAnnotation().clear();
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
			case GuigenPackage.COMPLEX_TYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case GuigenPackage.COMPLEX_TYPE__INIT_FIELDS:
				return initFields != INIT_FIELDS_EDEFAULT;
			case GuigenPackage.COMPLEX_TYPE__EXTENDS:
				return extends_ != null;
			case GuigenPackage.COMPLEX_TYPE__TYPE_ANNOTATION:
				return typeAnnotation != null && !typeAnnotation.isEmpty();
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
		result.append(" (initFields: ");
		result.append(initFields);
		result.append(')');
		return result.toString();
	}

} //ComplexTypeImpl
