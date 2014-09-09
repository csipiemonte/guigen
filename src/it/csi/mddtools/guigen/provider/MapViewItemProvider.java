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


import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MapView;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.MapView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapViewItemProvider
	extends DataWidgetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewItemProvider(AdapterFactory adapterFactory) {
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

			addMapIdPropertyDescriptor(object);
			addNumLevelsPropertyDescriptor(object);
			addNoClickWhenDisabledPropertyDescriptor(object);
			addNoEditWhenDisabledPropertyDescriptor(object);
			addNoZoomWhenDisabledPropertyDescriptor(object);
			addNoPanWhenDisabledPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Map Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMapIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapView_mapId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapView_mapId_feature", "_UI_MapView_type"),
				 GuigenPackage.Literals.MAP_VIEW__MAP_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_mapserviceconfigPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Levels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumLevelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapView_numLevels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapView_numLevels_feature", "_UI_MapView_type"),
				 GuigenPackage.Literals.MAP_VIEW__NUM_LEVELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_mapserviceconfigPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the No Click When Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoClickWhenDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapView_noClickWhenDisabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapView_noClickWhenDisabled_feature", "_UI_MapView_type"),
				 GuigenPackage.Literals.MAP_VIEW__NO_CLICK_WHEN_DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_whendisabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the No Edit When Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoEditWhenDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapView_noEditWhenDisabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapView_noEditWhenDisabled_feature", "_UI_MapView_type"),
				 GuigenPackage.Literals.MAP_VIEW__NO_EDIT_WHEN_DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_whendisabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the No Zoom When Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoZoomWhenDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapView_noZoomWhenDisabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapView_noZoomWhenDisabled_feature", "_UI_MapView_type"),
				 GuigenPackage.Literals.MAP_VIEW__NO_ZOOM_WHEN_DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_whendisabledPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the No Pan When Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoPanWhenDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapView_noPanWhenDisabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapView_noPanWhenDisabled_feature", "_UI_MapView_type"),
				 GuigenPackage.Literals.MAP_VIEW__NO_PAN_WHEN_DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_whendisabledPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GuigenPackage.Literals.MULTI_DATA_WIDGET__MULTI_DATA_BINDING);
			childrenFeatures.add(GuigenPackage.Literals.MAP_VIEW__START_ENVELOPE_SPEC);
			childrenFeatures.add(GuigenPackage.Literals.MAP_VIEW__MAX_ENVELOPE_SPEC);
			childrenFeatures.add(GuigenPackage.Literals.MAP_VIEW__SCALE_ENVELOPE_SPEC);
			childrenFeatures.add(GuigenPackage.Literals.MAP_VIEW__EDIT_DATA_BINDING);
			childrenFeatures.add(GuigenPackage.Literals.MAP_VIEW__GADGETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MapView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MapView"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MapView)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MapView_type") :
			getString("_UI_MapView_type") + " " + label;
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

		switch (notification.getFeatureID(MapView.class)) {
			case GuigenPackage.MAP_VIEW__MAP_ID:
			case GuigenPackage.MAP_VIEW__NUM_LEVELS:
			case GuigenPackage.MAP_VIEW__NO_CLICK_WHEN_DISABLED:
			case GuigenPackage.MAP_VIEW__NO_EDIT_WHEN_DISABLED:
			case GuigenPackage.MAP_VIEW__NO_ZOOM_WHEN_DISABLED:
			case GuigenPackage.MAP_VIEW__NO_PAN_WHEN_DISABLED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.MAP_VIEW__MULTI_DATA_BINDING:
			case GuigenPackage.MAP_VIEW__START_ENVELOPE_SPEC:
			case GuigenPackage.MAP_VIEW__MAX_ENVELOPE_SPEC:
			case GuigenPackage.MAP_VIEW__SCALE_ENVELOPE_SPEC:
			case GuigenPackage.MAP_VIEW__EDIT_DATA_BINDING:
			case GuigenPackage.MAP_VIEW__GADGETS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MULTI_DATA_WIDGET__MULTI_DATA_BINDING,
				 GuigenFactory.eINSTANCE.createAppDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MAP_VIEW__START_ENVELOPE_SPEC,
				 GuigenFactory.eINSTANCE.createMapEnvelope()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MAP_VIEW__MAX_ENVELOPE_SPEC,
				 GuigenFactory.eINSTANCE.createMapEnvelope()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MAP_VIEW__SCALE_ENVELOPE_SPEC,
				 GuigenFactory.eINSTANCE.createMapEnvelope()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MAP_VIEW__EDIT_DATA_BINDING,
				 GuigenFactory.eINSTANCE.createAppDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MAP_VIEW__GADGETS,
				 GuigenFactory.eINSTANCE.createMapViewGadgets()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GuigenPackage.Literals.DATA_WIDGET__DATABINDING ||
			childFeature == GuigenPackage.Literals.MULTI_DATA_WIDGET__MULTI_DATA_BINDING ||
			childFeature == GuigenPackage.Literals.MAP_VIEW__EDIT_DATA_BINDING ||
			childFeature == GuigenPackage.Literals.MAP_VIEW__START_ENVELOPE_SPEC ||
			childFeature == GuigenPackage.Literals.MAP_VIEW__MAX_ENVELOPE_SPEC ||
			childFeature == GuigenPackage.Literals.MAP_VIEW__SCALE_ENVELOPE_SPEC;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
