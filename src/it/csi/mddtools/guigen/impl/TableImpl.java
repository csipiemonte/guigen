/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.ColumnModel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableImpl#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableImpl#getColumnModel <em>Column Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableImpl#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableImpl#isEnableExport <em>Enable Export</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.TableImpl#isCustomDecorator <em>Custom Decorator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends DataWidgetImpl implements Table {
	/**
	 * The cached value of the '{@link #getMultiDataBinding() <em>Multi Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiDataBinding()
	 * @generated
	 * @ordered
	 */
	protected AppDataBinding multiDataBinding;
	/**
	 * The cached value of the '{@link #getColumnModel() <em>Column Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnModel()
	 * @generated
	 * @ordered
	 */
	protected ColumnModel columnModel;

	/**
	 * The default value of the '{@link #getPageSize() <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPageSize() <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSize()
	 * @generated
	 * @ordered
	 */
	protected int pageSize = PAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableExport() <em>Enable Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableExport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_EXPORT_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnableExport() <em>Enable Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableExport()
	 * @generated
	 * @ordered
	 */
	protected boolean enableExport = ENABLE_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCustomDecorator() <em>Custom Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomDecorator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOM_DECORATOR_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCustomDecorator() <em>Custom Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomDecorator()
	 * @generated
	 * @ordered
	 */
	protected boolean customDecorator = CUSTOM_DECORATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDataBinding getMultiDataBinding() {
		return multiDataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiDataBinding(AppDataBinding newMultiDataBinding, NotificationChain msgs) {
		AppDataBinding oldMultiDataBinding = multiDataBinding;
		multiDataBinding = newMultiDataBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__MULTI_DATA_BINDING, oldMultiDataBinding, newMultiDataBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiDataBinding(AppDataBinding newMultiDataBinding) {
		if (newMultiDataBinding != multiDataBinding) {
			NotificationChain msgs = null;
			if (multiDataBinding != null)
				msgs = ((InternalEObject)multiDataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TABLE__MULTI_DATA_BINDING, null, msgs);
			if (newMultiDataBinding != null)
				msgs = ((InternalEObject)newMultiDataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TABLE__MULTI_DATA_BINDING, null, msgs);
			msgs = basicSetMultiDataBinding(newMultiDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__MULTI_DATA_BINDING, newMultiDataBinding, newMultiDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnModel getColumnModel() {
		return columnModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnModel(ColumnModel newColumnModel, NotificationChain msgs) {
		ColumnModel oldColumnModel = columnModel;
		columnModel = newColumnModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__COLUMN_MODEL, oldColumnModel, newColumnModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnModel(ColumnModel newColumnModel) {
		if (newColumnModel != columnModel) {
			NotificationChain msgs = null;
			if (columnModel != null)
				msgs = ((InternalEObject)columnModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TABLE__COLUMN_MODEL, null, msgs);
			if (newColumnModel != null)
				msgs = ((InternalEObject)newColumnModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.TABLE__COLUMN_MODEL, null, msgs);
			msgs = basicSetColumnModel(newColumnModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__COLUMN_MODEL, newColumnModel, newColumnModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageSize(int newPageSize) {
		int oldPageSize = pageSize;
		pageSize = newPageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__PAGE_SIZE, oldPageSize, pageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableExport() {
		return enableExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableExport(boolean newEnableExport) {
		boolean oldEnableExport = enableExport;
		enableExport = newEnableExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__ENABLE_EXPORT, oldEnableExport, enableExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomDecorator() {
		return customDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomDecorator(boolean newCustomDecorator) {
		boolean oldCustomDecorator = customDecorator;
		customDecorator = newCustomDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.TABLE__CUSTOM_DECORATOR, oldCustomDecorator, customDecorator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.TABLE__MULTI_DATA_BINDING:
				return basicSetMultiDataBinding(null, msgs);
			case GuigenPackage.TABLE__COLUMN_MODEL:
				return basicSetColumnModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.TABLE__MULTI_DATA_BINDING:
				return getMultiDataBinding();
			case GuigenPackage.TABLE__COLUMN_MODEL:
				return getColumnModel();
			case GuigenPackage.TABLE__PAGE_SIZE:
				return new Integer(getPageSize());
			case GuigenPackage.TABLE__ENABLE_EXPORT:
				return isEnableExport() ? Boolean.TRUE : Boolean.FALSE;
			case GuigenPackage.TABLE__CUSTOM_DECORATOR:
				return isCustomDecorator() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigenPackage.TABLE__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.TABLE__COLUMN_MODEL:
				setColumnModel((ColumnModel)newValue);
				return;
			case GuigenPackage.TABLE__PAGE_SIZE:
				setPageSize(((Integer)newValue).intValue());
				return;
			case GuigenPackage.TABLE__ENABLE_EXPORT:
				setEnableExport(((Boolean)newValue).booleanValue());
				return;
			case GuigenPackage.TABLE__CUSTOM_DECORATOR:
				setCustomDecorator(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuigenPackage.TABLE__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)null);
				return;
			case GuigenPackage.TABLE__COLUMN_MODEL:
				setColumnModel((ColumnModel)null);
				return;
			case GuigenPackage.TABLE__PAGE_SIZE:
				setPageSize(PAGE_SIZE_EDEFAULT);
				return;
			case GuigenPackage.TABLE__ENABLE_EXPORT:
				setEnableExport(ENABLE_EXPORT_EDEFAULT);
				return;
			case GuigenPackage.TABLE__CUSTOM_DECORATOR:
				setCustomDecorator(CUSTOM_DECORATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuigenPackage.TABLE__MULTI_DATA_BINDING:
				return multiDataBinding != null;
			case GuigenPackage.TABLE__COLUMN_MODEL:
				return columnModel != null;
			case GuigenPackage.TABLE__PAGE_SIZE:
				return pageSize != PAGE_SIZE_EDEFAULT;
			case GuigenPackage.TABLE__ENABLE_EXPORT:
				return enableExport != ENABLE_EXPORT_EDEFAULT;
			case GuigenPackage.TABLE__CUSTOM_DECORATOR:
				return customDecorator != CUSTOM_DECORATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiDataWidget.class) {
			switch (derivedFeatureID) {
				case GuigenPackage.TABLE__MULTI_DATA_BINDING: return GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiDataWidget.class) {
			switch (baseFeatureID) {
				case GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING: return GuigenPackage.TABLE__MULTI_DATA_BINDING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pageSize: ");
		result.append(pageSize);
		result.append(", enableExport: ");
		result.append(enableExport);
		result.append(", customDecorator: ");
		result.append(customDecorator);
		result.append(')');
		return result.toString();
	}

} //TableImpl
