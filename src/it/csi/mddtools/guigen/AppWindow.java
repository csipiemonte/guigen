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
 * A representation of the model object '<em><b>App Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppWindow#getFooter <em>Footer</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppWindow#getHeader <em>Header</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.AppWindow#getAppArea <em>App Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow()
 * @model
 * @generated
 */
public interface AppWindow extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow_Header()
	 * @model containment="true"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppWindow#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(Footer)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow_Footer()
	 * @model containment="true"
	 * @generated
	 */
	Footer getFooter();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppWindow#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(Footer value);

	/**
	 * Returns the value of the '<em><b>App Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Area</em>' containment reference.
	 * @see #setAppArea(ApplicationArea)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppWindow_AppArea()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationArea getAppArea();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppWindow#getAppArea <em>App Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Area</em>' containment reference.
	 * @see #getAppArea()
	 * @generated
	 */
	void setAppArea(ApplicationArea value);

} // AppWindow
