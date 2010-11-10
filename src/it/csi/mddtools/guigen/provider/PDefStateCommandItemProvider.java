/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.PDefStateCommand;
import it.csi.mddtools.guigen.PanelDef;
import it.csi.mddtools.guigen.PanelDefUse;
import it.csi.mddtools.guigen.ScreenStateCommand;
import it.csi.mddtools.guigen.genutils.GenUtils;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.PDefStateCommand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PDefStateCommandItemProvider
	extends CommandItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDefStateCommandItemProvider(AdapterFactory adapterFactory) {
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

			addGoToPropertyDescriptor(object);
			addPDefUsePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Go To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addGoToPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_PDefStateCommand_goTo_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_PDefStateCommand_goTo_feature", "_UI_PDefStateCommand_type"),
//				 GuigenPackage.Literals.PDEF_STATE_COMMAND__GO_TO,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_PDefStateCommand_goTo_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_PDefStateCommand_goTo_feature",
						"_UI_PDefStateCommand_type"),
				GuigenPackage.eINSTANCE.getPDefStateCommand_GoTo(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				PDefStateCommand ssc = (PDefStateCommand)object;
				ContentPanel parent = GenUtils.findParentContentPanel(ssc);
				PanelDef parentPDef = GenUtils.findParentPanelDef(ssc);
				if (parent!=null){
					// comando inserito in content panel: specificare prima il PDU
					if (ssc.getPDefUse()!=null){
						if (ssc.getPDefUse().getPanelDef()!=null &&
								ssc.getPDefUse().getPanelDef().getStates()!=null
							){
							return ssc.getPDefUse().getPanelDef().getStates().getStates();
						}
						else
							return null;
					}
					else
						return null;
						
				}
				else if (parentPDef != null){
					// comando inserito in Panel Def
					if (parentPDef.getStates()!=null){
						return parentPDef.getStates().getStates();
					}
					else
						return null; 
				}
				else 
					return null;
			}
		});
	}

	/**
	 * This adds a property descriptor for the PDef Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPDefUsePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_PDefStateCommand_pDefUse_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_PDefStateCommand_pDefUse_feature", "_UI_PDefStateCommand_type"),
//				 GuigenPackage.Literals.PDEF_STATE_COMMAND__PDEF_USE,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_PDefStateCommand_pDefUse_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_PDefStateCommand_pDefUse_feature",
						"_UI_PDefStateCommand_type"),
				GuigenPackage.eINSTANCE.getPDefStateCommand_PDefUse(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				PDefStateCommand ssc = (PDefStateCommand)object;
				ContentPanel parent = GenUtils.findParentContentPanel(ssc);
				if (parent!=null){
					List<PanelDefUse> allPDUs = GenUtils.getAllPanelDefUses(parent);
					return allPDUs;
				}
				else 
					return null;
			}
		});
	
	}

	/**
	 * This returns PDefStateCommand.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PDefStateCommand"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PDefStateCommand st = (PDefStateCommand)object;
		String label = ": state->"
			+(st.getPDefUse()!=null ? st.getPDefUse().getName()+"." : "")
			+(st.getGoTo()!=null?st.getGoTo().getName():"???");
		return getString("_UI_PDefStateCommand_type")+label;
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

		switch (notification.getFeatureID(PDefStateCommand.class)) {
			case GuigenPackage.PDEF_STATE_COMMAND__GO_TO:
			case GuigenPackage.PDEF_STATE_COMMAND__PDEF_USE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
