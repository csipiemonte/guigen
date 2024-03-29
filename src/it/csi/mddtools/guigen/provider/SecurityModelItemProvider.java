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
import it.csi.mddtools.guigen.SecurityModel;

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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.SecurityModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityModelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityModelItemProvider(AdapterFactory adapterFactory) {
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

			addSecurityAppIDPropertyDescriptor(object);
			addUserInfoLogoutActionPropertyDescriptor(object);
			addAskForConfirmationOnLogoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Security App ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityAppIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityModel_securityAppID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityModel_securityAppID_feature", "_UI_SecurityModel_type"),
				 GuigenPackage.Literals.SECURITY_MODEL__SECURITY_APP_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Info Logout Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserInfoLogoutActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityModel_userInfoLogoutAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityModel_userInfoLogoutAction_feature", "_UI_SecurityModel_type"),
				 GuigenPackage.Literals.SECURITY_MODEL__USER_INFO_LOGOUT_ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ask For Confirmation On Logout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAskForConfirmationOnLogoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityModel_askForConfirmationOnLogout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityModel_askForConfirmationOnLogout_feature", "_UI_SecurityModel_type"),
				 GuigenPackage.Literals.SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(GuigenPackage.Literals.SECURITY_MODEL__AUTENTICATION_METHOD);
			childrenFeatures.add(GuigenPackage.Literals.SECURITY_MODEL__ACTORS);
			childrenFeatures.add(GuigenPackage.Literals.SECURITY_MODEL__USE_CASES);
			childrenFeatures.add(GuigenPackage.Literals.SECURITY_MODEL__ROLES);
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
	 * This returns SecurityModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SecurityModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SecurityModel)object).getSecurityAppID();
		return label == null || label.length() == 0 ?
			getString("_UI_SecurityModel_type") :
			getString("_UI_SecurityModel_type") + " " + label;
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

		switch (notification.getFeatureID(SecurityModel.class)) {
			case GuigenPackage.SECURITY_MODEL__SECURITY_APP_ID:
			case GuigenPackage.SECURITY_MODEL__USER_INFO_LOGOUT_ACTION:
			case GuigenPackage.SECURITY_MODEL__ASK_FOR_CONFIRMATION_ON_LOGOUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.SECURITY_MODEL__AUTENTICATION_METHOD:
			case GuigenPackage.SECURITY_MODEL__ACTORS:
			case GuigenPackage.SECURITY_MODEL__USE_CASES:
			case GuigenPackage.SECURITY_MODEL__ROLES:
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
				(GuigenPackage.Literals.SECURITY_MODEL__AUTENTICATION_METHOD,
				 GuigenFactory.eINSTANCE.createOPAUTHSSO()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.SECURITY_MODEL__AUTENTICATION_METHOD,
				 GuigenFactory.eINSTANCE.createSSOBARTSSO()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.SECURITY_MODEL__AUTENTICATION_METHOD,
				 GuigenFactory.eINSTANCE.createCustomAuthentication()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.SECURITY_MODEL__AUTENTICATION_METHOD,
				 GuigenFactory.eINSTANCE.createShibbolethSSO()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.SECURITY_MODEL__ACTORS,
				 GuigenFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.SECURITY_MODEL__USE_CASES,
				 GuigenFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.SECURITY_MODEL__ROLES,
				 GuigenFactory.eINSTANCE.createRole()));
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
