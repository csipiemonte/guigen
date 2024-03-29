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


import it.csi.mddtools.guigen.ActivateMultiPanelItemCommand;
import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.ContentPanel;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MultiPanel;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.PanelDef;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.ActivateMultiPanelItemCommand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivateMultiPanelItemCommandItemProvider
	extends CommandItemProvider {
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
	 * @generated NOT
	 */
	protected void addMultipanelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_ActivateMultiPanelItemCommand_multipanel_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ActivateMultiPanelItemCommand_multipanel_feature",
						"_UI_ActivateMultiPanelItemCommand_type"),
				GuigenPackage.eINSTANCE.getActivateMultiPanelItemCommand_Multipanel(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				ContentPanel containerOfAction = GenUtils.findParentContentPanel((Command)object);
				if (containerOfAction != null){
					ArrayList<Panel> result = GenUtils.getAllChildPanels(containerOfAction);
					// filtra i soli MultiPanel
					ArrayList<Panel> result2 = new ArrayList<Panel>();
					Iterator<Panel> it_p = result.iterator();
					while (it_p.hasNext()) {
						Panel currCandidate = (Panel) it_p.next();
						if (currCandidate instanceof MultiPanel)
							result2.add(currCandidate);
					}
					return result2;
				}
				else {
					PanelDef parentPDef = GenUtils.findParentPanelDef((Command)object);
					if (parentPDef != null){
						ArrayList<Panel> result = GenUtils.getAllChildPanels(parentPDef);
						// filtra i soli MultiPanel
						ArrayList<Panel> result2 = new ArrayList<Panel>();
						Iterator<Panel> it_p = result.iterator();
						while (it_p.hasNext()) {
							Panel currCandidate = (Panel) it_p.next();
							if (currCandidate instanceof MultiPanel)
								result2.add(currCandidate);
						}
						return result2;
					}
					else throw new IllegalArgumentException("impossibile trovare parent panel def o parent content panel del comando");
				}
			}
		});
		
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
				ArrayList<Panel> result = new ArrayList<Panel>();
				if (cmd.getMultipanel()!=null){
					// rendi selezionabili solo gli item del multipanel selezionato
					Iterator<Panel> it_p = cmd.getMultipanel().getPanels().iterator();
					while(it_p.hasNext()){
						Panel currP = it_p.next();
							result.add((Panel)currP);
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
		label+="."+(actCmd.getMultipanel()!=null?actCmd.getMultipanel().getName():"<???>");
		label+="."+(actCmd.getActiveItem()!=null?actCmd.getActiveItem().getName():"<???>");
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
