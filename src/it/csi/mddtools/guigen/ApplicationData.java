/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationData#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ApplicationData#getLifetimeExtent <em>Lifetime Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationData()
 * @model
 * @generated
 */
public interface ApplicationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lifetime Extent</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.DataLifetimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifetime Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifetime Extent</em>' attribute.
	 * @see it.csi.mddtools.guigen.DataLifetimeType
	 * @see #setLifetimeExtent(DataLifetimeType)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getApplicationData_LifetimeExtent()
	 * @model
	 * @generated
	 */
	DataLifetimeType getLifetimeExtent();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ApplicationData#getLifetimeExtent <em>Lifetime Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime Extent</em>' attribute.
	 * @see it.csi.mddtools.guigen.DataLifetimeType
	 * @see #getLifetimeExtent()
	 * @generated
	 */
	void setLifetimeExtent(DataLifetimeType value);

} // ApplicationData
