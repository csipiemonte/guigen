/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.provider;


import it.csi.mddtools.guigen.GuigenFactory;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.PDefParam;
import it.csi.mddtools.guigen.PDefParamVal;
import it.csi.mddtools.guigen.PanelDefUse;
import it.csi.mddtools.guigen.genutils.EditUtils;

import java.util.Collection;
import java.util.Iterator;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.PanelDefUse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PanelDefUseItemProvider
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
	public PanelDefUseItemProvider(AdapterFactory adapterFactory) {
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

			addPanelDefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Panel Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelDefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanelDefUse_panelDef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanelDefUse_panelDef_feature", "_UI_PanelDefUse_type"),
				 GuigenPackage.Literals.PANEL_DEF_USE__PANEL_DEF,
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
			childrenFeatures.add(GuigenPackage.Literals.PANEL_DEF_USE__PARAM_VALUES);
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
	 * This returns PanelDefUse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PanelDefUse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PanelDefUse pdu = (PanelDefUse)object;
		String params = "(";
		Iterator<PDefParamVal> pvals = pdu.getParamValues().iterator();
		while(pvals.hasNext()){
			PDefParamVal curr = pvals.next();
			
			params+=EditUtils.formatPDefParamVal(curr);
			if (!curr.equals(pdu.getParamValues().get(pdu.getParamValues().size()-1))){
				params += ",";
			}
		}
		params+=")";
		String label = ((PanelDefUse)object).getName()+"="+
		(pdu.getPanelDef()!=null ? pdu.getPanelDef().getName() : "<unspecified panel def>");
		return 
			getString("_UI_PanelDefUse_type") + " " + label+params;
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

		switch (notification.getFeatureID(PanelDefUse.class)) {
			case GuigenPackage.PANEL_DEF_USE__PARAM_VALUES:
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
				(GuigenPackage.Literals.PANEL_DEF_USE__PARAM_VALUES,
				 GuigenFactory.eINSTANCE.createAppDataMappingPDefVal()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF_USE__PARAM_VALUES,
				 GuigenFactory.eINSTANCE.createTypeDefMappingPDefVal()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF_USE__PARAM_VALUES,
				 GuigenFactory.eINSTANCE.createUCMappingPDefVal()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF_USE__PARAM_VALUES,
				 GuigenFactory.eINSTANCE.createRoleMappingPDefVal()));

		newChildDescriptors.add
			(createChildParameter
				(GuigenPackage.Literals.PANEL_DEF_USE__PARAM_VALUES,
				 GuigenFactory.eINSTANCE.createActorMappingPDefVal()));
	}

}
