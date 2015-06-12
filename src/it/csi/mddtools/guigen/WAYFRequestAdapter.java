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
 * A representation of the model object '<em><b>WAYF Request Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.WAYFRequestAdapter#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.WAYFRequestAdapter#getInfoSourceName <em>Info Source Name</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWAYFRequestAdapter()
 * @model
 * @generated
 */
public interface WAYFRequestAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.InfoSourceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.InfoSourceTypes
	 * @see #setSourceType(InfoSourceTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWAYFRequestAdapter_SourceType()
	 * @model
	 * @generated
	 */
	InfoSourceTypes getSourceType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WAYFRequestAdapter#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.InfoSourceTypes
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(InfoSourceTypes value);

	/**
	 * Returns the value of the '<em><b>Info Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Source Name</em>' attribute.
	 * @see #setInfoSourceName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWAYFRequestAdapter_InfoSourceName()
	 * @model
	 * @generated
	 */
	String getInfoSourceName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.WAYFRequestAdapter#getInfoSourceName <em>Info Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Source Name</em>' attribute.
	 * @see #getInfoSourceName()
	 * @generated
	 */
	void setInfoSourceName(String value);

} // WAYFRequestAdapter
