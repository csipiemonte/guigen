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
import it.csi.mddtools.guigen.PanelDef;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TableCustomizationParam;
import it.csi.mddtools.guigen.Widget;
import it.csi.mddtools.guigen.genutils.GenUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.guigen.TableCustomizationParam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableCustomizationParamItemProvider
	extends PDefParamItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCustomizationParamItemProvider(AdapterFactory adapterFactory) {
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

			addBaseTablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addBaseTablePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_TableCustomizationParam_baseTable_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_TableCustomizationParam_baseTable_feature", "_UI_TableCustomizationParam_type"),
//				 GuigenPackage.Literals.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_TableCustomizationParam_baseTable_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_TableCustomizationParam_baseTable_feature",
						"_UI_TableCustomizationParam_type"),
				GuigenPackage.eINSTANCE.getTableCustomizationParam_BaseTable(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				ArrayList<Table> result = new ArrayList<Table>();
				TableCustomizationParam param = (TableCustomizationParam)object;
				PanelDef parentPDef = (PanelDef)(param.eContainer());
				ArrayList<Widget> allWidgets = GenUtils.findAllWidgetsInPanel(parentPDef.getPanel());
				Iterator<Widget> it_w = allWidgets.iterator();
				Widget w;
				while(it_w.hasNext()){
					w = it_w.next();
					if (w instanceof Table){
						result.add((Table)w);
					}
				}
				return result;
			}
		});
	}

	/**
	 * This returns TableCustomizationParam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TableCustomizationParam"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		TableCustomizationParam param = ((TableCustomizationParam)object); 
		String label = ""+(param.getName()==null || "".equals(param.getName())? "<???>" : param.getName());
		label += "(";
		label += (param.getBaseTable()!=null? 
				(param.getBaseTable().getName()==null || "".equals(param.getBaseTable().getName()) ? "<?unspecified table?>" : param.getName())
				: "<?unspecified table?>");
		label +=")";
		return getString("_UI_TableCustomizationParam_type") + " " + label;
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

		switch (notification.getFeatureID(TableCustomizationParam.class)) {
			case GuigenPackage.TABLE_CUSTOMIZATION_PARAM__BASE_TABLE:
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
