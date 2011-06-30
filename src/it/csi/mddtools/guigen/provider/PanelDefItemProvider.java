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
import it.csi.mddtools.guigen.PDefParam;
import it.csi.mddtools.guigen.PanelDef;

import java.util.Collection;
import java.util.Iterator;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.PanelDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PanelDefItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelDefItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_PanelDef_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanelDef_name_feature", "_UI_PanelDef_type"),
				 GuigenPackage.Literals.PANEL_DEF__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_PanelDef_defaultState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanelDef_defaultState_feature", "_UI_PanelDef_type"),
				 GuigenPackage.Literals.PANEL_DEF__DEFAULT_STATE,
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
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__PANEL);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__PARAMS);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__APP_DATA_DEFS);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__TYPE_DEFS);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__ROLES);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__ACTORS);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__USE_CASES);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND);
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF__STATES);
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
	 * This returns PanelDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PanelDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PanelDef pdef = (PanelDef)object;
		String params = " (";
		if (pdef.getParams().size()>0){
			Iterator<PDefParam> pdefParams = pdef.getParams().iterator();
			while(pdefParams.hasNext()){
				PDefParam curr = pdefParams.next(); 
				params+=curr.getName();
				if (!curr.equals(pdef.getParams().get(pdef.getParams().size()-1))){
					params += ",";
				}
			}
		}
		params+=")";
		String label = ((PanelDef)object).getName()+ params;
		
		return
			getString("_UI_PanelDef_type") + " " + label;
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

		switch (notification.getFeatureID(PanelDef.class)) {
			case GuigenPackage.PANEL_DEF__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.PANEL_DEF__PANEL:
			case GuigenPackage.PANEL_DEF__PARAMS:
			case GuigenPackage.PANEL_DEF__APP_DATA_DEFS:
			case GuigenPackage.PANEL_DEF__TYPE_DEFS:
			case GuigenPackage.PANEL_DEF__ROLES:
			case GuigenPackage.PANEL_DEF__ACTORS:
			case GuigenPackage.PANEL_DEF__USE_CASES:
			case GuigenPackage.PANEL_DEF__ON_REFRESH_COMMAND:
			case GuigenPackage.PANEL_DEF__STATES:
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
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createFormPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createMultiPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createTabSetPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createDialogPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createCommandPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createMenuPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createStdMessagePanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createUserInfoPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createUserDefinedPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createWizardPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createMsgBoxPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createWidgetsPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createPanelDefUse()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PANEL,
				 GuigenFactory.eINSTANCE.createBreadcrumb()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PARAMS,
				 GuigenFactory.eINSTANCE.createAppDataMappingParam()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PARAMS,
				 GuigenFactory.eINSTANCE.createTypeDefMappingParam()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PARAMS,
				 GuigenFactory.eINSTANCE.createUseCaseMappingParam()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PARAMS,
				 GuigenFactory.eINSTANCE.createRoleMappingParam()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PARAMS,
				 GuigenFactory.eINSTANCE.createActorMappingParam()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__PARAMS,
				 GuigenFactory.eINSTANCE.createTableCustomizationParam()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__APP_DATA_DEFS,
				 GuigenFactory.eINSTANCE.createApplicationDataDefs()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__TYPE_DEFS,
				 GuigenFactory.eINSTANCE.createTypedefs()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ROLES,
				 GuigenFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ACTORS,
				 GuigenFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__USE_CASES,
				 GuigenFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createONOFFCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createCustomCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createVisibilityCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createRefreshViewCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createExecCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createShowDialogCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createSequenceCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpBackCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createActivateMultiPanelItemCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createJumpExtCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createNOPCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createScreenStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createBeginEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createEndEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createChkEditStatusCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createPDefStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__ON_REFRESH_COMMAND,
				 GuigenFactory.eINSTANCE.createClearAppdataCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF__STATES,
				 GuigenFactory.eINSTANCE.createPanelDefStates()));
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
