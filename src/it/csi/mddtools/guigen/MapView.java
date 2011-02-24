/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MapView#getMapId <em>Map Id</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#getStartEnvelopeSpec <em>Start Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#getMaxEnvelopeSpec <em>Max Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#getScaleEnvelopeSpec <em>Scale Envelope Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#getNumLevels <em>Num Levels</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView()
 * @model
 * @generated
 */
public interface MapView extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Map Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Id</em>' attribute.
	 * @see #setMapId(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_MapId()
	 * @model
	 * @generated
	 */
	String getMapId();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#getMapId <em>Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Id</em>' attribute.
	 * @see #getMapId()
	 * @generated
	 */
	void setMapId(String value);

	/**
	 * Returns the value of the '<em><b>Start Envelope Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Envelope Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Envelope Spec</em>' containment reference.
	 * @see #setStartEnvelopeSpec(MapEnvelope)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_StartEnvelopeSpec()
	 * @model containment="true"
	 * @generated
	 */
	MapEnvelope getStartEnvelopeSpec();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#getStartEnvelopeSpec <em>Start Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Envelope Spec</em>' containment reference.
	 * @see #getStartEnvelopeSpec()
	 * @generated
	 */
	void setStartEnvelopeSpec(MapEnvelope value);

	/**
	 * Returns the value of the '<em><b>Max Envelope Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Envelope Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Envelope Spec</em>' containment reference.
	 * @see #setMaxEnvelopeSpec(MapEnvelope)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_MaxEnvelopeSpec()
	 * @model containment="true"
	 * @generated
	 */
	MapEnvelope getMaxEnvelopeSpec();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#getMaxEnvelopeSpec <em>Max Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Envelope Spec</em>' containment reference.
	 * @see #getMaxEnvelopeSpec()
	 * @generated
	 */
	void setMaxEnvelopeSpec(MapEnvelope value);

	/**
	 * Returns the value of the '<em><b>Scale Envelope Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Envelope Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Envelope Spec</em>' containment reference.
	 * @see #setScaleEnvelopeSpec(MapEnvelope)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_ScaleEnvelopeSpec()
	 * @model containment="true"
	 * @generated
	 */
	MapEnvelope getScaleEnvelopeSpec();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#getScaleEnvelopeSpec <em>Scale Envelope Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Envelope Spec</em>' containment reference.
	 * @see #getScaleEnvelopeSpec()
	 * @generated
	 */
	void setScaleEnvelopeSpec(MapEnvelope value);

	/**
	 * Returns the value of the '<em><b>Num Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Levels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Levels</em>' attribute.
	 * @see #setNumLevels(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_NumLevels()
	 * @model
	 * @generated
	 */
	int getNumLevels();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#getNumLevels <em>Num Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Levels</em>' attribute.
	 * @see #getNumLevels()
	 * @generated
	 */
	void setNumLevels(int value);

} // MapView
