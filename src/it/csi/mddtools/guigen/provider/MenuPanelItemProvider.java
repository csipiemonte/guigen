/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MenuPanel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.MenuPanel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuPanelItemProvider
	extends PanelItemProvider
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
	public MenuPanelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GuigenPackage.Literals.MENU_PANEL__WIDGETS);
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
	 * This returns MenuPanel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MenuPanel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MenuPanel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MenuPanel_type") :
			getString("_UI_MenuPanel_type") + " " + label;
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

		switch (notification.getFeatureID(MenuPanel.class)) {
			case GuigenPackage.MENU_PANEL__WIDGETS:
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
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createCommandWidget()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createDataWidget()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createTextArea()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createRadioButtons()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createResetButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createConfirmButton()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createMultiDataWidget()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createTreeView()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createPlainText()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createMenuView()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createHiddenValue()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.MENU_PANEL__WIDGETS,
				 GuigenFactory.eINSTANCE.createUserDefinedWidget()));
	}

}
