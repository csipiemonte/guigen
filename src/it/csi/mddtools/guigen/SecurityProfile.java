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
 * A representation of the model object '<em><b>Security Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.SecurityProfile#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityProfile#getExtAuthGuard <em>Ext Auth Guard</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityProfile#getIntAuthGuard <em>Int Auth Guard</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityProfile#getIdAdapter <em>Id Adapter</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SecurityProfile#getPepImpl <em>Pep Impl</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityProfile()
 * @model
 * @generated
 */
public interface SecurityProfile extends EObject {
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
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ext Auth Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Auth Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Auth Guard</em>' containment reference.
	 * @see #setExtAuthGuard(ExternalAuthenticationGuard)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityProfile_ExtAuthGuard()
	 * @model containment="true"
	 * @generated
	 */
	ExternalAuthenticationGuard getExtAuthGuard();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityProfile#getExtAuthGuard <em>Ext Auth Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Auth Guard</em>' containment reference.
	 * @see #getExtAuthGuard()
	 * @generated
	 */
	void setExtAuthGuard(ExternalAuthenticationGuard value);

	/**
	 * Returns the value of the '<em><b>Int Auth Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Auth Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Auth Guard</em>' containment reference.
	 * @see #setIntAuthGuard(InternalAuthenticationGuard)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityProfile_IntAuthGuard()
	 * @model containment="true"
	 * @generated
	 */
	InternalAuthenticationGuard getIntAuthGuard();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityProfile#getIntAuthGuard <em>Int Auth Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Auth Guard</em>' containment reference.
	 * @see #getIntAuthGuard()
	 * @generated
	 */
	void setIntAuthGuard(InternalAuthenticationGuard value);

	/**
	 * Returns the value of the '<em><b>Id Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Adapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Adapter</em>' containment reference.
	 * @see #setIdAdapter(IdentityAdapter)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityProfile_IdAdapter()
	 * @model containment="true"
	 * @generated
	 */
	IdentityAdapter getIdAdapter();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityProfile#getIdAdapter <em>Id Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Adapter</em>' containment reference.
	 * @see #getIdAdapter()
	 * @generated
	 */
	void setIdAdapter(IdentityAdapter value);

	/**
	 * Returns the value of the '<em><b>Pep Impl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pep Impl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pep Impl</em>' containment reference.
	 * @see #setPepImpl(PEPImplementation)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSecurityProfile_PepImpl()
	 * @model containment="true"
	 * @generated
	 */
	PEPImplementation getPepImpl();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SecurityProfile#getPepImpl <em>Pep Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pep Impl</em>' containment reference.
	 * @see #getPepImpl()
	 * @generated
	 */
	void setPepImpl(PEPImplementation value);

} // SecurityProfile
