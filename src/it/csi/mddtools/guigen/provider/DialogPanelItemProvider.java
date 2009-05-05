/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.Widget;

import it.csi.mddtools.guigen.GuigenPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.DialogPanel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DialogPanelItemProvider
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
	public DialogPanelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT);
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
	 * This returns DialogPanel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DialogPanel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label="["+((Panel)object).getName()+"]-"+((Panel)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_DialogPanel_type") :
			getString("_UI_DialogPanel_type") + " " + label;
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

		switch (notification.getFeatureID(DialogPanel.class)) {
			case GuigenPackage.DIALOG_PANEL__DIALOG_CONTENT:
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
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createFormPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createMultiPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createTabSetPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createDialogPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createCommandPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createMenuPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createStdMessagePanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createUserInfoPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createUserDefinedPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createWizardPanel()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.DIALOG_PANEL__DIALOG_CONTENT,
				 GuigenFactory.eINSTANCE.createMsgBoxPanel()));
	}

}
