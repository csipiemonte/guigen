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
 * A representation of the model object '<em><b>WAYF Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.WAYFProfile#getRequestAdapter <em>Request Adapter</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWAYFProfile()
 * @model
 * @generated
 */
public interface WAYFProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Adapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Adapter</em>' containment reference.
	 * @see #setRequestAdapter(WAYFRequestAdapter)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWAYFProfile_RequestAdapter()
	 * @model containment="true"
	 * @generated
	 */
	WAYFRequestAdapter getRequestAdapter();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WAYFProfile#getRequestAdapter <em>Request Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Adapter</em>' containment reference.
	 * @see #getRequestAdapter()
	 * @generated
	 */
	void setRequestAdapter(WAYFRequestAdapter value);

} // WAYFProfile
