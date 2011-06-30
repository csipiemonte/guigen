/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
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
 *   <li>{@link it.csi.mddtools.guigen.MapView#getEditDataBinding <em>Edit Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#getGadgets <em>Gadgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#isNoClickWhenDisabled <em>No Click When Disabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#isNoEditWhenDisabled <em>No Edit When Disabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#isNoZoomWhenDisabled <em>No Zoom When Disabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapView#isNoPanWhenDisabled <em>No Pan When Disabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView()
 * @model annotation="logicpkg pkg='ui.widgets'"
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

	/**
	 * Returns the value of the '<em><b>Edit Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Data Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Data Binding</em>' containment reference.
	 * @see #setEditDataBinding(AppDataBinding)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_EditDataBinding()
	 * @model containment="true"
	 * @generated
	 */
	AppDataBinding getEditDataBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#getEditDataBinding <em>Edit Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Data Binding</em>' containment reference.
	 * @see #getEditDataBinding()
	 * @generated
	 */
	void setEditDataBinding(AppDataBinding value);

	/**
	 * Returns the value of the '<em><b>Gadgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gadgets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gadgets</em>' containment reference.
	 * @see #setGadgets(MapViewGadgets)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_Gadgets()
	 * @model containment="true"
	 * @generated
	 */
	MapViewGadgets getGadgets();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#getGadgets <em>Gadgets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gadgets</em>' containment reference.
	 * @see #getGadgets()
	 * @generated
	 */
	void setGadgets(MapViewGadgets value);

	/**
	 * Returns the value of the '<em><b>No Click When Disabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a <i>true</i> quando il widget &egrave; disabilitato viene disabilitato
	 * anche un eventuale possibilit&agrave; di scatenare un evento di <i>click</i>
	 * sulla mappa
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Click When Disabled</em>' attribute.
	 * @see #setNoClickWhenDisabled(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_NoClickWhenDisabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isNoClickWhenDisabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#isNoClickWhenDisabled <em>No Click When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Click When Disabled</em>' attribute.
	 * @see #isNoClickWhenDisabled()
	 * @generated
	 */
	void setNoClickWhenDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>No Edit When Disabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a <i>true</i> quando il widget &egrave; disabilitato viene disabilitato
	 * anche un eventuale possibilit&agrave; di effettuare editing di geometrie
	 * sulla mappa
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Edit When Disabled</em>' attribute.
	 * @see #setNoEditWhenDisabled(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_NoEditWhenDisabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isNoEditWhenDisabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#isNoEditWhenDisabled <em>No Edit When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Edit When Disabled</em>' attribute.
	 * @see #isNoEditWhenDisabled()
	 * @generated
	 */
	void setNoEditWhenDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>No Zoom When Disabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a <i>true</i> quando il widget &egrave; disabilitato viene disabilitata
	 * la funzione di <i>zoom</i> a comando utente (in tutte le sue modalit&agrave;)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Zoom When Disabled</em>' attribute.
	 * @see #setNoZoomWhenDisabled(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_NoZoomWhenDisabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoZoomWhenDisabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#isNoZoomWhenDisabled <em>No Zoom When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Zoom When Disabled</em>' attribute.
	 * @see #isNoZoomWhenDisabled()
	 * @generated
	 */
	void setNoZoomWhenDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>No Pan When Disabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a <i>true</i> quando il widget &egrave; disabilitato viene disabilitata
	 * la funzione di <i>pan</i> a comando utente (in tutte le sue modalit&agrave;)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Pan When Disabled</em>' attribute.
	 * @see #setNoPanWhenDisabled(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapView_NoPanWhenDisabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoPanWhenDisabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapView#isNoPanWhenDisabled <em>No Pan When Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Pan When Disabled</em>' attribute.
	 * @see #isNoPanWhenDisabled()
	 * @generated
	 */
	void setNoPanWhenDisabled(boolean value);

} // MapView
