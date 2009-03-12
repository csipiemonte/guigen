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
 * A representation of the model object '<em><b>Security Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getAutenticationMethod <em>Autentication Method</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getActors <em>Actors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityModel#getUseCases <em>Use Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel()
 * @model
 * @generated
 */
public interface SecurityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Autentication Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autentication Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autentication Method</em>' containment reference.
	 * @see #setAutenticationMethod(AutenticationMethod)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_AutenticationMethod()
	 * @model containment="true"
	 * @generated
	 */
	AutenticationMethod getAutenticationMethod();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityModel#getAutenticationMethod <em>Autentication Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autentication Method</em>' containment reference.
	 * @see #getAutenticationMethod()
	 * @generated
	 */
	void setAutenticationMethod(AutenticationMethod value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityModel_UseCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUseCases();

} // SecurityModel