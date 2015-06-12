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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedefs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Insieme dei tipi definiti nell'applicazione
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getTypes <em>Types</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getExtNamespaces <em>Ext Namespaces</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedefs()
 * @model annotation="logicpkg pkg='mdl.types'"
 * @generated
 */
public interface Typedefs extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEPRECATO: utilizzare tipi definiti in <b>TypeNamespace</b> esterni
	 * e referenziati in <i>extNamespaces</i>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedefs_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.TypeNamespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEPRECATO: utilizzare <i>extNamespaces</i>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedefs_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeNamespace> getNamespaces();

	/**
	 * Returns the value of the '<em><b>Ext Namespaces</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.TypeNamespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Namespaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Riferimento ai <b>TypeNamespace</b> utilizzati nell'applicazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Namespaces</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedefs_ExtNamespaces()
	 * @model
	 * @generated
	 */
	EList<TypeNamespace> getExtNamespaces();

} // Typedefs
