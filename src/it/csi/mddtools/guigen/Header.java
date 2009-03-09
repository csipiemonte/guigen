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
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Header#getCodCanale <em>Cod Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Header#getCodApplicativo <em>Cod Applicativo</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {

	/**
	 * Returns the value of the '<em><b>Cod Canale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Canale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Canale</em>' attribute.
	 * @see #setCodCanale(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_CodCanale()
	 * @model
	 * @generated
	 */
	String getCodCanale();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getCodCanale <em>Cod Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Canale</em>' attribute.
	 * @see #getCodCanale()
	 * @generated
	 */
	void setCodCanale(String value);

	/**
	 * Returns the value of the '<em><b>Cod Applicativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Applicativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Applicativo</em>' attribute.
	 * @see #setCodApplicativo(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_CodApplicativo()
	 * @model
	 * @generated
	 */
	String getCodApplicativo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getCodApplicativo <em>Cod Applicativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Applicativo</em>' attribute.
	 * @see #getCodApplicativo()
	 * @generated
	 */
	void setCodApplicativo(String value);
} // Header
