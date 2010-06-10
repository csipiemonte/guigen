/**
 * <copyright>
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
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getTypes <em>Types</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getExtNamespaces <em>Ext Namespaces</em>}</li>
 * </ul>
 * </p>
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
