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
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MapViewGadgets;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.MapViewGadgets} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapViewGadgetsItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewGadgetsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLayerSwitcherPropertyDescriptor(object);
			addBackgroundMapMapServiceNamePropertyDescriptor(object);
			addBackgroundMapSwitcherLabelPropertyDescriptor(object);
			addBackgroundPhotoAerialMapServiceNamePropertyDescriptor(object);
			addBackgroundPhotoAerialSwitcherLabelPropertyDescriptor(object);
			addPointEditingActivePropertyDescriptor(object);
			addLineEditingActivePropertyDescriptor(object);
			addPolygonEditingActivePropertyDescriptor(object);
			addModifyEditingActivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Layer Switcher feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayerSwitcherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_layerSwitcher_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_layerSwitcher_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__LAYER_SWITCHER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_layerSwitcherPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Map Map Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundMapMapServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_backgroundMapMapServiceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_backgroundMapMapServiceName_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_layerSwitcherPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Map Switcher Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundMapSwitcherLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_backgroundMapSwitcherLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_backgroundMapSwitcherLabel_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_layerSwitcherPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Photo Aerial Map Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundPhotoAerialMapServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_backgroundPhotoAerialMapServiceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_backgroundPhotoAerialMapServiceName_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_layerSwitcherPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Photo Aerial Switcher Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundPhotoAerialSwitcherLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_backgroundPhotoAerialSwitcherLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_backgroundPhotoAerialSwitcherLabel_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_layerSwitcherPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Editing Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointEditingActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_pointEditingActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_pointEditingActive_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_editingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Editing Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineEditingActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_lineEditingActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_lineEditingActive_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_editingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Polygon Editing Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolygonEditingActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_polygonEditingActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_polygonEditingActive_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_editingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Modify Editing Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifyEditingActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewGadgets_modifyEditingActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewGadgets_modifyEditingActive_feature", "_UI_MapViewGadgets_type"),
				 GuigenPackage.Literals.MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_editingPropertyCategory"),
				 null));
	}

	/**
	 * This returns MapViewGadgets.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MapViewGadgets"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MapViewGadgets)object).getBackgroundMapMapServiceName();
		return label == null || label.length() == 0 ?
			getString("_UI_MapViewGadgets_type") :
			getString("_UI_MapViewGadgets_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MapViewGadgets.class)) {
			case GuigenPackage.MAP_VIEW_GADGETS__LAYER_SWITCHER:
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_MAP_SERVICE_NAME:
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_MAP_SWITCHER_LABEL:
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_MAP_SERVICE_NAME:
			case GuigenPackage.MAP_VIEW_GADGETS__BACKGROUND_PHOTO_AERIAL_SWITCHER_LABEL:
			case GuigenPackage.MAP_VIEW_GADGETS__POINT_EDITING_ACTIVE:
			case GuigenPackage.MAP_VIEW_GADGETS__LINE_EDITING_ACTIVE:
			case GuigenPackage.MAP_VIEW_GADGETS__POLYGON_EDITING_ACTIVE:
			case GuigenPackage.MAP_VIEW_GADGETS__MODIFY_EDITING_ACTIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GuigenEditPlugin.INSTANCE;
	}

}
