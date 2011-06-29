/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelDef;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.genutils.GenUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.RefreshViewCommand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefreshViewCommandItemProvider
	extends CommandItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshViewCommandItemProvider(AdapterFactory adapterFactory) {
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

			addTargetWidgetsPropertyDescriptor(object);
			addTargetPanelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Widgets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetWidgetsPropertyDescriptor(Object object) {	
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_CommandOnWidgets_targetWidgets_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_CommandOnWidgets_targetWidgets_feature",
						"_UI_CommandOnWidgets_type"),
				GuigenPackage.eINSTANCE.getCommandOnWidgets_TargetWidgets(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				ContentPanel containerOfAction = GenUtils.findParentContentPanel((Command)object);
				if (containerOfAction != null){
					ArrayList<Widget> result = GenUtils.findAllWidgetsInContentPanel(containerOfAction);
					return result;
				}
				else {
					PanelDef parentPDef = GenUtils.findParentPanelDef((Command)object);
					if (parentPDef != null){
						ArrayList<Widget> result = GenUtils.findAllWidgetsInPanel(parentPDef.getPanel());
						return result;
					}
					else throw new IllegalArgumentException("impossibile trovare parent panel def o parent content panel del comando");
				}
			}
		});
		
	}

	/**
	 * This adds a property descriptor for the Target Panels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPanelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_CommandOnPanels_targetPanels_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_CommandOnPanels_targetPanels_feature",
						"_UI_CommandOnPanels_type"),
				GuigenPackage.eINSTANCE.getCommandOnPanels_TargetPanels(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				ContentPanel containerOfAction = GenUtils.findParentContentPanel((Command)object);
				if (containerOfAction != null){
					ArrayList<Panel> result = GenUtils.getAllChildPanels(containerOfAction);
					return result;
				}
				else {
					PanelDef parentPDef = GenUtils.findParentPanelDef((Command)object);
					if (parentPDef != null){
						ArrayList<Panel> result = GenUtils.getAllChildPanels(parentPDef);
						return result;
					}
					else throw new IllegalArgumentException("impossibile trovare parent panel def o parent content panel del comando");
				}
			}
		});
	}

	/**
	 * This returns RefreshViewCommand.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RefreshViewCommand"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RefreshViewCommand_type");
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
