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
 * A representation of the model object '<em><b>Map View Gadgets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#isLayerSwitcher <em>Layer Switcher</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapMapServiceName <em>Background Map Map Service Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapSwitcherLabel <em>Background Map Switcher Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialMapServiceName <em>Background Photo Aerial Map Service Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialSwitcherLabel <em>Background Photo Aerial Switcher Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#isPointEditingActive <em>Point Editing Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#isLineEditingActive <em>Line Editing Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#isPolygonEditingActive <em>Polygon Editing Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.MapViewGadgets#isModifyEditingActive <em>Modify Editing Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets()
 * @model annotation="logicpkg pkg='ui.widgets.mapview'"
 * @generated
 */
public interface MapViewGadgets extends EObject {
	/**
	 * Returns the value of the '<em><b>Layer Switcher</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Switcher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Switcher</em>' attribute.
	 * @see #setLayerSwitcher(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_LayerSwitcher()
	 * @model default="false"
	 * @generated
	 */
	boolean isLayerSwitcher();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#isLayerSwitcher <em>Layer Switcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Switcher</em>' attribute.
	 * @see #isLayerSwitcher()
	 * @generated
	 */
	void setLayerSwitcher(boolean value);

	/**
	 * Returns the value of the '<em><b>Background Map Map Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Map Map Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Map Map Service Name</em>' attribute.
	 * @see #setBackgroundMapMapServiceName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_BackgroundMapMapServiceName()
	 * @model
	 * @generated
	 */
	String getBackgroundMapMapServiceName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapMapServiceName <em>Background Map Map Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Map Map Service Name</em>' attribute.
	 * @see #getBackgroundMapMapServiceName()
	 * @generated
	 */
	void setBackgroundMapMapServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Background Map Switcher Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Map Switcher Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Map Switcher Label</em>' attribute.
	 * @see #setBackgroundMapSwitcherLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_BackgroundMapSwitcherLabel()
	 * @model
	 * @generated
	 */
	String getBackgroundMapSwitcherLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundMapSwitcherLabel <em>Background Map Switcher Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Map Switcher Label</em>' attribute.
	 * @see #getBackgroundMapSwitcherLabel()
	 * @generated
	 */
	void setBackgroundMapSwitcherLabel(String value);

	/**
	 * Returns the value of the '<em><b>Background Photo Aerial Map Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Photo Aerial Map Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Photo Aerial Map Service Name</em>' attribute.
	 * @see #setBackgroundPhotoAerialMapServiceName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_BackgroundPhotoAerialMapServiceName()
	 * @model
	 * @generated
	 */
	String getBackgroundPhotoAerialMapServiceName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialMapServiceName <em>Background Photo Aerial Map Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Photo Aerial Map Service Name</em>' attribute.
	 * @see #getBackgroundPhotoAerialMapServiceName()
	 * @generated
	 */
	void setBackgroundPhotoAerialMapServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Background Photo Aerial Switcher Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Photo Aerial Switcher Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Photo Aerial Switcher Label</em>' attribute.
	 * @see #setBackgroundPhotoAerialSwitcherLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_BackgroundPhotoAerialSwitcherLabel()
	 * @model
	 * @generated
	 */
	String getBackgroundPhotoAerialSwitcherLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#getBackgroundPhotoAerialSwitcherLabel <em>Background Photo Aerial Switcher Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Photo Aerial Switcher Label</em>' attribute.
	 * @see #getBackgroundPhotoAerialSwitcherLabel()
	 * @generated
	 */
	void setBackgroundPhotoAerialSwitcherLabel(String value);

	/**
	 * Returns the value of the '<em><b>Point Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Editing Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Editing Active</em>' attribute.
	 * @see #setPointEditingActive(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_PointEditingActive()
	 * @model
	 * @generated
	 */
	boolean isPointEditingActive();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#isPointEditingActive <em>Point Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Editing Active</em>' attribute.
	 * @see #isPointEditingActive()
	 * @generated
	 */
	void setPointEditingActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Line Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Editing Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Editing Active</em>' attribute.
	 * @see #setLineEditingActive(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_LineEditingActive()
	 * @model
	 * @generated
	 */
	boolean isLineEditingActive();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#isLineEditingActive <em>Line Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Editing Active</em>' attribute.
	 * @see #isLineEditingActive()
	 * @generated
	 */
	void setLineEditingActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Polygon Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Editing Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Editing Active</em>' attribute.
	 * @see #setPolygonEditingActive(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_PolygonEditingActive()
	 * @model
	 * @generated
	 */
	boolean isPolygonEditingActive();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#isPolygonEditingActive <em>Polygon Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Editing Active</em>' attribute.
	 * @see #isPolygonEditingActive()
	 * @generated
	 */
	void setPolygonEditingActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Modify Editing Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Editing Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Editing Active</em>' attribute.
	 * @see #setModifyEditingActive(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMapViewGadgets_ModifyEditingActive()
	 * @model
	 * @generated
	 */
	boolean isModifyEditingActive();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MapViewGadgets#isModifyEditingActive <em>Modify Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Editing Active</em>' attribute.
	 * @see #isModifyEditingActive()
	 * @generated
	 */
	void setModifyEditingActive(boolean value);

} // MapViewGadgets
