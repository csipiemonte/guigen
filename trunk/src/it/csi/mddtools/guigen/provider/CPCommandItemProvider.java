/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.CPCommand;
import it.csi.mddtools.guigen.CPCommandExecutionTypes;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.CPCommand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CPCommandItemProvider
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
	public CPCommandItemProvider(AdapterFactory adapterFactory) {
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

			addExecutePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Execute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CPCommand_execute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CPCommand_execute_feature", "_UI_CPCommand_type"),
				 GuigenPackage.Literals.CP_COMMAND__EXECUTE,
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
			childrenFeatures.add(GuigenPackage.Literals.CP_COMMAND__COMMAND);
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
	 * This returns CPCommand.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CPCommand"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		CPCommand cmd = (CPCommand)object;
		CPCommandExecutionTypes labelValue = cmd.getExecute();
		String label = labelValue == null ? null : " executed "+labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CPCommand_type") :
			getString("_UI_CPCommand_type") + " " + label;
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

		switch (notification.getFeatureID(CPCommand.class)) {
			case GuigenPackage.CP_COMMAND__EXECUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.CP_COMMAND__COMMAND:
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
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createONOFFCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createCustomCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createVisibilityCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createRefreshViewCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createJumpCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createExecCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createShowDialogCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createSequenceCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createJumpBackCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createActivateMultiPanelItemCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createJumpExtCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createNOPCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createScreenStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createBeginEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createEndEditCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createChkEditStatusCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
				 GuigenFactory.eINSTANCE.createPDefStateCommand()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CP_COMMAND__COMMAND,
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
