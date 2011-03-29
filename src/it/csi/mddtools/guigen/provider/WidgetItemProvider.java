/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Widget;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.Widget} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addDefaultVisiblePropertyDescriptor(object);
			addDefaultEnabledPropertyDescriptor(object);
			addTooltipPropertyDescriptor(object);
			addEnableEnrichmentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_name_feature", "_UI_Widget_type"),
				 GuigenPackage.Literals.WIDGET__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_label_feature", "_UI_Widget_type"),
				 GuigenPackage.Literals.WIDGET__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_defaultVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_defaultVisible_feature", "_UI_Widget_type"),
				 GuigenPackage.Literals.WIDGET__DEFAULT_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_defaultEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_defaultEnabled_feature", "_UI_Widget_type"),
				 GuigenPackage.Literals.WIDGET__DEFAULT_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tooltip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTooltipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_tooltip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_tooltip_feature", "_UI_Widget_type"),
				 GuigenPackage.Literals.WIDGET__TOOLTIP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Enrichment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableEnrichmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_enableEnrichment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_enableEnrichment_feature", "_UI_Widget_type"),
				 GuigenPackage.Literals.WIDGET__ENABLE_ENRICHMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(GuigenPackage.Literals.WIDGET__LAYOUT_SPEC);
			childrenFeatures.add(GuigenPackage.Literals.WIDGET__EVENT_HANDLERS);
			childrenFeatures.add(GuigenPackage.Literals.WIDGET__SECURITY_CONSTRAINTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label="["+((Widget)object).getName()+"]-"+((Widget)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_Widget_type") :
			getString("_UI_Widget_type") + " " + label;
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

		switch (notification.getFeatureID(Widget.class)) {
			case GuigenPackage.WIDGET__NAME:
			case GuigenPackage.WIDGET__LABEL:
			case GuigenPackage.WIDGET__DEFAULT_VISIBLE:
			case GuigenPackage.WIDGET__DEFAULT_ENABLED:
			case GuigenPackage.WIDGET__TOOLTIP:
			case GuigenPackage.WIDGET__ENABLE_ENRICHMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.WIDGET__LAYOUT_SPEC:
			case GuigenPackage.WIDGET__EVENT_HANDLERS:
			case GuigenPackage.WIDGET__SECURITY_CONSTRAINTS:
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
				(GuigenPackage.Literals.WIDGET__LAYOUT_SPEC,
				 GuigenFactory.eINSTANCE.createUDLRCWidgetLayoutSpec()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.WIDGET__LAYOUT_SPEC,
				 GuigenFactory.eINSTANCE.createGridWidgetLayoutSpec()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.WIDGET__EVENT_HANDLERS,
				 GuigenFactory.eINSTANCE.createEventHandler()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.WIDGET__SECURITY_CONSTRAINTS,
				 GuigenFactory.eINSTANCE.createUCBasedSecurityConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.WIDGET__SECURITY_CONSTRAINTS,
				 GuigenFactory.eINSTANCE.createActorBasedSecurityConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.WIDGET__SECURITY_CONSTRAINTS,
				 GuigenFactory.eINSTANCE.createCustomSecurityConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.WIDGET__SECURITY_CONSTRAINTS,
				 GuigenFactory.eINSTANCE.createRoleBasedSecurityConstraint()));
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
