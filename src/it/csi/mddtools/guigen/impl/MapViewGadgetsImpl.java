/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MapViewGadgets;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map View Gadgets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#isLayerSwitcher <em>Layer Switcher</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#getBackgroundMapMapServiceName <em>Background Map Map Service Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#getBackgroundMapSwitcherLabel <em>Background Map Switcher Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#getBackgroundPhotoAerialMapServiceName <em>Background Photo Aerial Map Service Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#getBackgroundPhotoAerialSwitcherLabel <em>Background Photo Aerial Switcher Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#isPointEditingActive <em>Point Editing Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#isLineEditingActive <em>Line Editing Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#isPolygonEditingActive <em>Polygon Editing Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MapViewGadgetsImpl#isModifyEditingActive <em>Modify Editing Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapViewGadgetsImpl extends EObjectImpl implements MapViewGadgets {
	/**
	 * The default value of the '{@link #isLayerSwitcher() <em>Layer Switcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerSwitcher()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAYER_SWITCHER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLayerSwitcher() <em>Layer Switcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayerSwitcher()
	 * @generated
	 * @ordered
	 */
	protected boolean layerSwitcher = LAYER_SWITCHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundMapMapServiceName() <em>Background Map Map Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundMapMapServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_MAP_MAP_SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundMapMapServiceName() <em>Background Map Map Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundMapMapServiceName()
	 * @generated
	 * @ordered
	 */
	protected String backgroundMapMapServiceName = BACKGROUND_MAP_MAP_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundMapSwitcherLabel() <em>Background Map Switcher Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundMapSwitcherLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_MAP_SWITCHER_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundMapSwitcherLabel() <em>Background Map Switcher Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundMapSwitcherLabel()
	 * @generated
	 * @ordered
	 */
	protected String backgroundMapSwitcherLabel = BACKGROUND_MAP_SWITCHER_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundPhotoAerialMapServiceName() <em>Background Photo Aerial Map Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPhotoAerialMapServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundPhotoAerialMapServiceName() <em>Background Photo Aerial Map Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPhotoAerialMapServiceName()
	 * @generated
	 * @ordered
	 */
	protected String backgroundPhotoAerialMapServiceName = BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundPhotoAerialSwitcherLabel() <em>Background Photo Aerial Switcher Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPhotoAerialSwitcherLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundPhotoAerialSwitcherLabel() <em>Background Photo Aerial Switcher Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPhotoAerialSwitcherLabel()
	 * @generated
	 * @ordered
	 */
	protected String backgroundPhotoAerialSwitcherLabel = BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPointEditingActive() <em>Point Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPointEditingActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POINT_EDITING_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPointEditingActive() <em>Point Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPointEditingActive()
	 * @generated
	 * @ordered
	 */
	protected boolean pointEditingActive = POINT_EDITING_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLineEditingActive() <em>Line Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLineEditingActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINE_EDITING_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLineEditingActive() <em>Line Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLineEditingActive()
	 * @generated
	 * @ordered
	 */
	protected boolean lineEditingActive = LINE_EDITING_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPolygonEditingActive() <em>Polygon Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPolygonEditingActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POLYGON_EDITING_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPolygonEditingActive() <em>Polygon Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPolygonEditingActive()
	 * @generated
	 * @ordered
	 */
	protected boolean polygonEditingActive = POLYGON_EDITING_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isModifyEditingActive() <em>Modify Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModifyEditingActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFY_EDITING_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModifyEditingActive() <em>Modify Editing Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModifyEditingActive()
	 * @generated
	 * @ordered
	 */
	protected boolean modifyEditingActive = MODIFY_EDITING_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapViewGadgetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.MAP_VIEW_GADGETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLayerSwitcher() {
		return layerSwitcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSwitcher(boolean newLayerSwitcher) {
		boolean oldLayerSwitcher = layerSwitcher;
		layerSwitcher = newLayerSwitcher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__LAYER_SWITCHER, oldLayerSwitcher, layerSwitcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundMapMapServiceName() {
		return backgroundMapMapServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundMapMapServiceName(String newBackgroundMapMapServiceName) {
		String oldBackgroundMapMapServiceName = backgroundMapMapServiceName;
		backgroundMapMapServiceName = newBackgroundMapMapServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME, oldBackgroundMapMapServiceName, backgroundMapMapServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundMapSwitcherLabel() {
		return backgroundMapSwitcherLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundMapSwitcherLabel(String newBackgroundMapSwitcherLabel) {
		String oldBackgroundMapSwitcherLabel = backgroundMapSwitcherLabel;
		backgroundMapSwitcherLabel = newBackgroundMapSwitcherLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL, oldBackgroundMapSwitcherLabel, backgroundMapSwitcherLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundPhotoAerialMapServiceName() {
		return backgroundPhotoAerialMapServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundPhotoAerialMapServiceName(String newBackgroundPhotoAerialMapServiceName) {
		String oldBackgroundPhotoAerialMapServiceName = backgroundPhotoAerialMapServiceName;
		backgroundPhotoAerialMapServiceName = newBackgroundPhotoAerialMapServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME, oldBackgroundPhotoAerialMapServiceName, backgroundPhotoAerialMapServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundPhotoAerialSwitcherLabel() {
		return backgroundPhotoAerialSwitcherLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundPhotoAerialSwitcherLabel(String newBackgroundPhotoAerialSwitcherLabel) {
		String oldBackgroundPhotoAerialSwitcherLabel = backgroundPhotoAerialSwitcherLabel;
		backgroundPhotoAerialSwitcherLabel = newBackgroundPhotoAerialSwitcherLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL, oldBackgroundPhotoAerialSwitcherLabel, backgroundPhotoAerialSwitcherLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPointEditingActive() {
		return pointEditingActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointEditingActive(boolean newPointEditingActive) {
		boolean oldPointEditingActive = pointEditingActive;
		pointEditingActive = newPointEditingActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE, oldPointEditingActive, pointEditingActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLineEditingActive() {
		return lineEditingActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineEditingActive(boolean newLineEditingActive) {
		boolean oldLineEditingActive = lineEditingActive;
		lineEditingActive = newLineEditingActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE, oldLineEditingActive, lineEditingActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPolygonEditingActive() {
		return polygonEditingActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonEditingActive(boolean newPolygonEditingActive) {
		boolean oldPolygonEditingActive = polygonEditingActive;
		polygonEditingActive = newPolygonEditingActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE, oldPolygonEditingActive, polygonEditingActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModifyEditingActive() {
		return modifyEditingActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyEditingActive(boolean newModifyEditingActive) {
		boolean oldModifyEditingActive = modifyEditingActive;
		modifyEditingActive = newModifyEditingActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE, oldModifyEditingActive, modifyEditingActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.MAP_VIEW_GADGETS__LAYER_SWITCHER:
				return isLayerSwitcher();
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME:
				return getBackgroundMapMapServiceName();
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL:
				return getBackgroundMapSwitcherLabel();
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME:
				return getBackgroundPhotoAerialMapServiceName();
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL:
				return getBackgroundPhotoAerialSwitcherLabel();
			case GuigenPackage.MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE:
				return isPointEditingActive();
			case GuigenPackage.MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE:
				return isLineEditingActive();
			case GuigenPackage.MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE:
				return isPolygonEditingActive();
			case GuigenPackage.MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE:
				return isModifyEditingActive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigenPackage.MAP_VIEW_GADGETS__LAYER_SWITCHER:
				setLayerSwitcher((Boolean)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME:
				setBackgroundMapMapServiceName((String)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL:
				setBackgroundMapSwitcherLabel((String)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME:
				setBackgroundPhotoAerialMapServiceName((String)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL:
				setBackgroundPhotoAerialSwitcherLabel((String)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE:
				setPointEditingActive((Boolean)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE:
				setLineEditingActive((Boolean)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE:
				setPolygonEditingActive((Boolean)newValue);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE:
				setModifyEditingActive((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuigenPackage.MAP_VIEW_GADGETS__LAYER_SWITCHER:
				setLayerSwitcher(LAYER_SWITCHER_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME:
				setBackgroundMapMapServiceName(BACKGROUND_MAP_MAP_SERVICE_NAME_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL:
				setBackgroundMapSwitcherLabel(BACKGROUND_MAP_SWITCHER_LABEL_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME:
				setBackgroundPhotoAerialMapServiceName(BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL:
				setBackgroundPhotoAerialSwitcherLabel(BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE:
				setPointEditingActive(POINT_EDITING_ACTIVE_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE:
				setLineEditingActive(LINE_EDITING_ACTIVE_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE:
				setPolygonEditingActive(POLYGON_EDITING_ACTIVE_EDEFAULT);
				return;
			case GuigenPackage.MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE:
				setModifyEditingActive(MODIFY_EDITING_ACTIVE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuigenPackage.MAP_VIEW_GADGETS__LAYER_SWITCHER:
				return layerSwitcher != LAYER_SWITCHER_EDEFAULT;
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME:
				return BACKGROUND_MAP_MAP_SERVICE_NAME_EDEFAULT == null ? backgroundMapMapServiceName != null : !BACKGROUND_MAP_MAP_SERVICE_NAME_EDEFAULT.equals(backgroundMapMapServiceName);
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL:
				return BACKGROUND_MAP_SWITCHER_LABEL_EDEFAULT == null ? backgroundMapSwitcherLabel != null : !BACKGROUND_MAP_SWITCHER_LABEL_EDEFAULT.equals(backgroundMapSwitcherLabel);
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME:
				return BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME_EDEFAULT == null ? backgroundPhotoAerialMapServiceName != null : !BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME_EDEFAULT.equals(backgroundPhotoAerialMapServiceName);
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL:
				return BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL_EDEFAULT == null ? backgroundPhotoAerialSwitcherLabel != null : !BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL_EDEFAULT.equals(backgroundPhotoAerialSwitcherLabel);
			case GuigenPackage.MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE:
				return pointEditingActive != POINT_EDITING_ACTIVE_EDEFAULT;
			case GuigenPackage.MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE:
				return lineEditingActive != LINE_EDITING_ACTIVE_EDEFAULT;
			case GuigenPackage.MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE:
				return polygonEditingActive != POLYGON_EDITING_ACTIVE_EDEFAULT;
			case GuigenPackage.MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE:
				return modifyEditingActive != MODIFY_EDITING_ACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (layerSwitcher: ");
		result.append(layerSwitcher);
		result.append(", backgroundMapMapServiceName: ");
		result.append(backgroundMapMapServiceName);
		result.append(", backgroundMapSwitcherLabel: ");
		result.append(backgroundMapSwitcherLabel);
		result.append(", backgroundPhotoAerialMapServiceName: ");
		result.append(backgroundPhotoAerialMapServiceName);
		result.append(", backgroundPhotoAerialSwitcherLabel: ");
		result.append(backgroundPhotoAerialSwitcherLabel);
		result.append(", pointEditingActive: ");
		result.append(pointEditingActive);
		result.append(", lineEditingActive: ");
		result.append(lineEditingActive);
		result.append(", polygonEditingActive: ");
		result.append(polygonEditingActive);
		result.append(", modifyEditingActive: ");
		result.append(modifyEditingActive);
		result.append(')');
		return result.toString();
	}

} //MapViewGadgetsImpl
