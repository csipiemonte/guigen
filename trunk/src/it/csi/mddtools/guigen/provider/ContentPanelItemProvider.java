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


import it.csi.mddtools.guigen.ContentPanel;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.ContentPanel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentPanelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPanelItemProvider(AdapterFactory adapterFactory) {
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
			addAppDataPropertyDescriptor(object);
			addDefaultStatePropertyDescriptor(object);
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
				 getString("_UI_ContentPanel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentPanel_name_feature", "_UI_ContentPanel_type"),
				 GuigenPackage.Literals.CONTENT_PANEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the App Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentPanel_appData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentPanel_appData_feature", "_UI_ContentPanel_type"),
				 GuigenPackage.Literals.CONTENT_PANEL__APP_DATA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentPanel_defaultState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentPanel_defaultState_feature", "_UI_ContentPanel_type"),
				 GuigenPackage.Literals.CONTENT_PANEL__DEFAULT_STATE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(GuigenPackage.Literals.CONTENT_PANEL__PANELS);
			childrenFeatures.add(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND);
			childrenFeatures.add(GuigenPackage.Literals.CONTENT_PANEL__DIALOGS);
			childrenFeatures.add(GuigenPackage.Literals.CONTENT_PANEL__STATES);
			childrenFeatures.add(GuigenPackage.Literals.CONTENT_PANEL__CP_COMMANDS);
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
	 * This returns ContentPanel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentPanel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label="["+((ContentPanel)object).getName()+"]";
		return label == null || label.length() == 0 ?
			getString("_UI_ContentPanel_type") :
			getString("_UI_ContentPanel_type") + " " + label;
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

		switch (notification.getFeatureID(ContentPanel.class)) {
			case GuigenPackage.CONTENT_PANEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.CONTENT_PANEL__PANELS:
			case GuigenPackage.CONTENT_PANEL__ON_REFRESH_COMMAND:
			case GuigenPackage.CONTENT_PANEL__DIALOGS:
			case GuigenPackage.CONTENT_PANEL__STATES:
			case GuigenPackage.CONTENT_PANEL__CP_COMMANDS:
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
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createFormPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createMultiPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createTabSetPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createDialogPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createCommandPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createMenuPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createStdMessagePanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createUserInfoPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createUserDefinedPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createWizardPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createMsgBoxPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createWidgetsPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createPanelDefUse()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__PANELS,
				 GuigenFactory.eINSTANCE.createBreadcrumb()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createONOFFCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createCustomCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createVisibilityCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createRefreshViewCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createExecCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createShowDialogCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createSequenceCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpBackCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createActivateMultiPanelItemCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpExtCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createNOPCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createScreenStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createBeginEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createEndEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createChkEditStatusCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createPDefStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createClearAppdataCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__DIALOGS,
				 GuigenFactory.eINSTANCE.createDialogPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__STATES,
				 GuigenFactory.eINSTANCE.createScreenStates()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CONTENT_PANEL__CP_COMMANDS,
				 GuigenFactory.eINSTANCE.createCPCommands()));
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
			childFeature == GuigenPackage.Literals.CONTENT_PANEL__PANELS ||
			childFeature == GuigenPackage.Literals.CONTENT_PANEL__DIALOGS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
