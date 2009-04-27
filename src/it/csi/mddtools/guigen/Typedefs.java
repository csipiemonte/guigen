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
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getTypes <em>Types</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Typedefs#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedefs()
 * @model
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
	 * [[TODO: add documentation here]]
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
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTypedefs_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeNamespace> getNamespaces();

} // Typedefs
