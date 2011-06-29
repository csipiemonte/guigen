/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Envelope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MapEnvelope#getNorthEast <em>North East</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapEnvelope#getSouthWest <em>South West</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMapEnvelope()
 * @model annotation="logicpkg pkg='ui.widgets.mapview'"
 * @generated
 */
public interface MapEnvelope extends EObject {
	/**
	 * Returns the value of the '<em><b>North East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>North East</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North East</em>' containment reference.
	 * @see #setNorthEast(Point)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapEnvelope_NorthEast()
	 * @model containment="true"
	 * @generated
	 */
	Point getNorthEast();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapEnvelope#getNorthEast <em>North East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North East</em>' containment reference.
	 * @see #getNorthEast()
	 * @generated
	 */
	void setNorthEast(Point value);

	/**
	 * Returns the value of the '<em><b>South West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>South West</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South West</em>' containment reference.
	 * @see #setSouthWest(Point)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapEnvelope_SouthWest()
	 * @model containment="true"
	 * @generated
	 */
	Point getSouthWest();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapEnvelope#getSouthWest <em>South West</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South West</em>' containment reference.
	 * @see #getSouthWest()
	 * @generated
	 */
	void setSouthWest(Point value);

} // MapEnvelope
