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


import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.EventTypes;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.EventHandler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventHandlerItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlerItemProvider(AdapterFactory adapterFactory) {
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

			addEventTypePropertyDescriptor(object);
			addSkipValidationPropertyDescriptor(object);
			addMethodProtectionPropertyDescriptor(object);
			addEventSpecifiersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Event Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventHandler_eventType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventHandler_eventType_feature", "_UI_EventHandler_type"),
				 GuigenPackage.Literals.EVENT_HANDLER__EVENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skip Validation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkipValidationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventHandler_skipValidation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventHandler_skipValidation_feature", "_UI_EventHandler_type"),
				 GuigenPackage.Literals.EVENT_HANDLER__SKIP_VALIDATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Method Protection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodProtectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventHandler_methodProtection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventHandler_methodProtection_feature", "_UI_EventHandler_type"),
				 GuigenPackage.Literals.EVENT_HANDLER__METHOD_PROTECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Specifiers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventSpecifiersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventHandler_eventSpecifiers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventHandler_eventSpecifiers_feature", "_UI_EventHandler_type"),
				 GuigenPackage.Literals.EVENT_HANDLER__EVENT_SPECIFIERS,
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
			childrenFeatures.add(GuigenPackage.Literals.EVENT_HANDLER__COMMAND);
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
	 * This returns EventHandler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EventHandler"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EventTypes labelValue = ((EventHandler)object).getEventType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EventHandler_type") :
			getString("_UI_EventHandler_type") + " " + label;
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

		switch (notification.getFeatureID(EventHandler.class)) {
			case GuigenPackage.EVENT_HANDLER__EVENT_TYPE:
			case GuigenPackage.EVENT_HANDLER__SKIP_VALIDATION:
			case GuigenPackage.EVENT_HANDLER__METHOD_PROTECTION:
			case GuigenPackage.EVENT_HANDLER__EVENT_SPECIFIERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.EVENT_HANDLER__COMMAND:
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
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createONOFFCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createCustomCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createVisibilityCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createRefreshViewCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createJumpCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createExecCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createShowDialogCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createSequenceCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createJumpBackCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createActivateMultiPanelItemCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createJumpExtCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createNOPCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createScreenStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createBeginEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createEndEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createChkEditStatusCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createPDefStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.EVENT_HANDLER__COMMAND,
				 GuigenFactory.eINSTANCE.createClearAppdataCommand()));
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
