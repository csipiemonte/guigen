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
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Struttura dati definita da utente. 
 * Nel caso di questa sottoclasse di <b>Type</b> l'attributo <i>name</i>
 * deve essere un identificativo valido per java.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ComplexType#getFields <em>Fields</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComplexType#isInitFields <em>Init Fields</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComplexType#getExtends <em>Extends</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComplexType#getTypeAnnotation <em>Type Annotation</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType()
 * @model annotation="logicpkg pkg='mdl.types'"
 * @generated
 */
public interface ComplexType extends Type {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme dei campi di cui &egrave; costituita la struttura dati.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Init Fields</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true, i field di tipo complex sono inizializzati
	 * (con struttura vuota al momento dell'istaziazione di oggetti di questo tipo).
	 * Es. Se un tipo "Persona" contiene un field "residenza" di tipo "Indirizzo" e <i>initFields</i>
	 *  &egrave; impostato a true, allora il field "residenza" viene impostato con
	 * un'oggetto di tipo "Indirizzo".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Fields</em>' attribute.
	 * @see #setInitFields(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType_InitFields()
	 * @model default="false"
	 * @generated
	 */
	boolean isInitFields();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComplexType#isInitFields <em>Init Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Fields</em>' attribute.
	 * @see #isInitFields()
	 * @generated
	 */
	void setInitFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(ComplexType)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType_Extends()
	 * @model
	 * @generated
	 */
	ComplexType getExtends();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComplexType#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(ComplexType value);

	/**
	 * Returns the value of the '<em><b>Type Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.TypeAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Annotation</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComplexType_TypeAnnotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAnnotation> getTypeAnnotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Field> getAllFields();

} // ComplexType
