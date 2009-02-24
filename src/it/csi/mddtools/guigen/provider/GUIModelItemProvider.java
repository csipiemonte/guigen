/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.GUIModel;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.GUIModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GUIModelItemProvider
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
	public GUIModelItemProvider(AdapterFactory adapterFactory) {
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

			addCodProdottoPropertyDescriptor(object);
			addCodComponentePropertyDescriptor(object);
			addVersioneProdottoPropertyDescriptor(object);
			addVersioneComponentePropertyDescriptor(object);
			addPortalePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cod Prodotto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodProdottoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GUIModel_codProdotto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_codProdotto_feature", "_UI_GUIModel_type"),
				 GuigenPackage.Literals.GUI_MODEL__COD_PRODOTTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cod Componente feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodComponentePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GUIModel_codComponente_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_codComponente_feature", "_UI_GUIModel_type"),
				 GuigenPackage.Literals.GUI_MODEL__COD_COMPONENTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versione Prodotto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersioneProdottoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GUIModel_versioneProdotto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_versioneProdotto_feature", "_UI_GUIModel_type"),
				 GuigenPackage.Literals.GUI_MODEL__VERSIONE_PRODOTTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versione Componente feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersioneComponentePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GUIModel_versioneComponente_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_versioneComponente_feature", "_UI_GUIModel_type"),
				 GuigenPackage.Literals.GUI_MODEL__VERSIONE_COMPONENTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Portale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GUIModel_portale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GUIModel_portale_feature", "_UI_GUIModel_type"),
				 GuigenPackage.Literals.GUI_MODEL__PORTALE,
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
			childrenFeatures.add(GuigenPackage.Literals.GUI_MODEL__STRUCTURE);
			childrenFeatures.add(GuigenPackage.Literals.GUI_MODEL__BEAHVIORS);
			childrenFeatures.add(GuigenPackage.Literals.GUI_MODEL__TYPEDEFS);
			childrenFeatures.add(GuigenPackage.Literals.GUI_MODEL__APP_DATA_DEFS);
			childrenFeatures.add(GuigenPackage.Literals.GUI_MODEL__SECURITY_MODEL);
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
	 * This returns GUIModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GUIModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GUIModel)object).getCodProdotto();
		return label == null || label.length() == 0 ?
			getString("_UI_GUIModel_type") :
			getString("_UI_GUIModel_type") + " " + label;
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

		switch (notification.getFeatureID(GUIModel.class)) {
			case GuigenPackage.GUI_MODEL__COD_PRODOTTO:
			case GuigenPackage.GUI_MODEL__COD_COMPONENTE:
			case GuigenPackage.GUI_MODEL__VERSIONE_PRODOTTO:
			case GuigenPackage.GUI_MODEL__VERSIONE_COMPONENTE:
			case GuigenPackage.GUI_MODEL__PORTALE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.GUI_MODEL__STRUCTURE:
			case GuigenPackage.GUI_MODEL__BEAHVIORS:
			case GuigenPackage.GUI_MODEL__TYPEDEFS:
			case GuigenPackage.GUI_MODEL__APP_DATA_DEFS:
			case GuigenPackage.GUI_MODEL__SECURITY_MODEL:
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
				(GuigenPackage.Literals.GUI_MODEL__STRUCTURE,
				 GuigenFactory.eINSTANCE.createGUIStructure()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.GUI_MODEL__BEAHVIORS,
				 GuigenFactory.eINSTANCE.createGUIBehaviors()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.GUI_MODEL__TYPEDEFS,
				 GuigenFactory.eINSTANCE.createTypedefs()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.GUI_MODEL__APP_DATA_DEFS,
				 GuigenFactory.eINSTANCE.createApplicationDataDefs()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.GUI_MODEL__SECURITY_MODEL,
				 GuigenFactory.eINSTANCE.createSecurityModel()));
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
