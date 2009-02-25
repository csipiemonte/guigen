/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.ActivateMultiPanelItemCommand;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.genutils.GenUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivateMultiPanelItemCommandItemProvider
	extends CommandItemProvider
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
	public ActivateMultiPanelItemCommandItemProvider(AdapterFactory adapterFactory) {
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

			addMultipanelPropertyDescriptor(object);
			addActiveItemPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Multipanel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipanelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivateMultiPanelItemCommand_multipanel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivateMultiPanelItemCommand_multipanel_feature", "_UI_ActivateMultiPanelItemCommand_type"),
				 GuigenPackage.Literals.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addActiveItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_ActivateMultiPanelItemCommand_activeItem_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ActivateMultiPanelItemCommand_activeItem_feature",
						"_UI_ActivateMultiPanelItemCommand_type"),
				//GuigenPackage.eINSTANCE.getCommandOnWidgets_TargetWidgets(),
				GuigenPackage.eINSTANCE.getActivateMultiPanelItemCommand_ActiveItem(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				//ContentPanel containerOfAction = GenUtils.findParentContentPanel((Command)object);
				ActivateMultiPanelItemCommand cmd = (ActivateMultiPanelItemCommand)object;
				ArrayList<FormPanel> result = new ArrayList<FormPanel>();
				if (cmd.getMultipanel()!=null){
					// rendi selezionabili solo gli item del multipanel selezionato
					Iterator<Panel> it_p = cmd.getMultipanel().getPanels().iterator();
					while(it_p.hasNext()){
						Panel currP = it_p.next();
						if (currP instanceof FormPanel)
							result.add((FormPanel)currP);
					}
				}
					
				return result;
			}
		});
		
	}

	/**
	 * This returns ActivateMultiPanelItemCommand.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivateMultiPanelItemCommand"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label="Activate Multipanel Item ";
		ActivateMultiPanelItemCommand actCmd = (ActivateMultiPanelItemCommand)object;
		label+=(actCmd.getMultipanel()!=null?actCmd.getMultipanel().getName():"<???>");
		label+=(actCmd.getActiveItem()!=null?actCmd.getActiveItem().getName():"<???>");
		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		switch (notification.getFeatureID(ActivateMultiPanelItemCommand.class)) {
		case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__ACTIVE_ITEM:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GuigenPackage.ACTIVATE_MULTI_PANEL_ITEM_COMMAND__MULTIPANEL:
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
	}

}
