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


import it.csi.mddtools.guigen.ApplicationArea;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.ApplicationArea} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationAreaItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAreaItemProvider(AdapterFactory adapterFactory) {
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

			addExtModulesPropertyDescriptor(object);
			addHomePagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ext Modules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtModulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicationArea_extModules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicationArea_extModules_feature", "_UI_ApplicationArea_type"),
				 GuigenPackage.Literals.APPLICATION_AREA__EXT_MODULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Home Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHomePagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicationArea_homePage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicationArea_homePage_feature", "_UI_ApplicationArea_type"),
				 GuigenPackage.Literals.APPLICATION_AREA__HOME_PAGE,
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
			childrenFeatures.add(GuigenPackage.Literals.APPLICATION_AREA__MENUBAR);
			childrenFeatures.add(GuigenPackage.Literals.APPLICATION_AREA__TITLEBAR);
			childrenFeatures.add(GuigenPackage.Literals.APPLICATION_AREA__STATUSBAR);
			childrenFeatures.add(GuigenPackage.Literals.APPLICATION_AREA__CONTENT_PANELS);
			childrenFeatures.add(GuigenPackage.Literals.APPLICATION_AREA__STATIC_LINKS);
			childrenFeatures.add(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND);
			childrenFeatures.add(GuigenPackage.Literals.APPLICATION_AREA__MODULES);
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
	 * This returns ApplicationArea.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApplicationArea"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ApplicationArea_type");
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

		switch (notification.getFeatureID(ApplicationArea.class)) {
			case GuigenPackage.APPLICATION_AREA__MENUBAR:
			case GuigenPackage.APPLICATION_AREA__TITLEBAR:
			case GuigenPackage.APPLICATION_AREA__STATUSBAR:
			case GuigenPackage.APPLICATION_AREA__CONTENT_PANELS:
			case GuigenPackage.APPLICATION_AREA__STATIC_LINKS:
			case GuigenPackage.APPLICATION_AREA__ON_INIT_COMMAND:
			case GuigenPackage.APPLICATION_AREA__MODULES:
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
				(GuigenPackage.Literals.APPLICATION_AREA__MENUBAR,
				 GuigenFactory.eINSTANCE.createMenubar()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__TITLEBAR,
				 GuigenFactory.eINSTANCE.createTitlebar()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__STATUSBAR,
				 GuigenFactory.eINSTANCE.createStatusbar()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__CONTENT_PANELS,
				 GuigenFactory.eINSTANCE.createContentPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__STATIC_LINKS,
				 GuigenFactory.eINSTANCE.createStaticLinks()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createONOFFCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createCustomCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createVisibilityCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createRefreshViewCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createExecCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createShowDialogCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createSequenceCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpBackCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createActivateMultiPanelItemCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpExtCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createNOPCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createScreenStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createBeginEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createEndEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createChkEditStatusCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createPDefStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__ON_INIT_COMMAND,
				 GuigenFactory.eINSTANCE.createClearAppdataCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.APPLICATION_AREA__MODULES,
				 GuigenFactory.eINSTANCE.createAppModule()));
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
