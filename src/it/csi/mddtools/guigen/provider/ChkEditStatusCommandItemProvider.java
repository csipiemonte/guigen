/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.ChkEditStatusCommand;
import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.LogicAggregationTypes;
import it.csi.mddtools.guigen.genutils.EditUtils;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.ChkEditStatusCommand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChkEditStatusCommandItemProvider
	extends CommandItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChkEditStatusCommandItemProvider(AdapterFactory adapterFactory) {
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

			addDataCheckedPropertyDescriptor(object);
			addCheckAggregationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Checked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataCheckedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChkEditStatusCommand_dataChecked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChkEditStatusCommand_dataChecked_feature", "_UI_ChkEditStatusCommand_type"),
				 GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__DATA_CHECKED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckAggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChkEditStatusCommand_checkAggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChkEditStatusCommand_checkAggregation_feature", "_UI_ChkEditStatusCommand_type"),
				 GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION,
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
			childrenFeatures.add(GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED);
			childrenFeatures.add(GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED);
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
	 * This returns ChkEditStatusCommand.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChkEditStatusCommand"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		ChkEditStatusCommand cmd = (ChkEditStatusCommand)object;
		String label = "check changes for ";
		if (cmd.getCheckAggregation().equals(LogicAggregationTypes.OR))
			label+=" one of ";
		else if (cmd.getCheckAggregation().equals(LogicAggregationTypes.AND))
			label+=" all ";
		else if (cmd.getCheckAggregation().equals(LogicAggregationTypes.XOR))
			label+=" only one of ";
		label+="{";
		if (cmd.getDataChecked().size()>0){
			for(int i=0; i<cmd.getDataChecked().size();i++){
				label+=EditUtils.formatAppDataFQN(cmd.getDataChecked().get(i));
				if (i<cmd.getDataChecked().size()-1)
					label+=",";
			}
		}
		label+="}";
		return getString("_UI_ChkEditStatusCommand_type") + ": " + label;
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

		switch (notification.getFeatureID(ChkEditStatusCommand.class)) {
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DATA_CHECKED:
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__CHECK_AGGREGATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED:
			case GuigenPackage.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED:
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
				(GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED,
				 GuigenFactory.eINSTANCE.createCommandOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED,
				 GuigenFactory.eINSTANCE.createCommandOutcome()));
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
			childFeature == GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__DO_IF_CHANGED ||
			childFeature == GuigenPackage.Literals.CHK_EDIT_STATUS_COMMAND__DO_IF_NOT_CHANGED;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
