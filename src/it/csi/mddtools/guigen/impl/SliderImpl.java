/**
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.AppDataBinding;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MultiDataWidget;
import it.csi.mddtools.guigen.Slider;
import it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.SliderImpl#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SliderImpl#getUseCollectionDataAs <em>Use Collection Data As</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SliderImpl#getStaticLowerBound <em>Static Lower Bound</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.SliderImpl#getStaticUpperBound <em>Static Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SliderImpl extends DataWidgetImpl implements Slider {
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
	 * The default value of the '{@link #getUseCollectionDataAs() <em>Use Collection Data As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCollectionDataAs()
	 * @generated
	 * @ordered
	 */
	protected static final SliderCollectionValuesUsageTypes USE_COLLECTION_DATA_AS_EDEFAULT = SliderCollectionValuesUsageTypes.RANGE_BOUNDS;

	/**
	 * The cached value of the '{@link #getUseCollectionDataAs() <em>Use Collection Data As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCollectionDataAs()
	 * @generated
	 * @ordered
	 */
	protected SliderCollectionValuesUsageTypes useCollectionDataAs = USE_COLLECTION_DATA_AS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticLowerBound() <em>Static Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATIC_LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticLowerBound() <em>Static Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer staticLowerBound = STATIC_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticUpperBound() <em>Static Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATIC_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticUpperBound() <em>Static Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer staticUpperBound = STATIC_UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.SLIDER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.SLIDER__MULTI_DATA_BINDING, oldMultiDataBinding, newMultiDataBinding);
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
				msgs = ((InternalEObject)multiDataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SLIDER__MULTI_DATA_BINDING, null, msgs);
			if (newMultiDataBinding != null)
				msgs = ((InternalEObject)newMultiDataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.SLIDER__MULTI_DATA_BINDING, null, msgs);
			msgs = basicSetMultiDataBinding(newMultiDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SLIDER__MULTI_DATA_BINDING, newMultiDataBinding, newMultiDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliderCollectionValuesUsageTypes getUseCollectionDataAs() {
		return useCollectionDataAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCollectionDataAs(SliderCollectionValuesUsageTypes newUseCollectionDataAs) {
		SliderCollectionValuesUsageTypes oldUseCollectionDataAs = useCollectionDataAs;
		useCollectionDataAs = newUseCollectionDataAs == null ? USE_COLLECTION_DATA_AS_EDEFAULT : newUseCollectionDataAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SLIDER__USE_COLLECTION_DATA_AS, oldUseCollectionDataAs, useCollectionDataAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStaticLowerBound() {
		return staticLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticLowerBound(Integer newStaticLowerBound) {
		Integer oldStaticLowerBound = staticLowerBound;
		staticLowerBound = newStaticLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SLIDER__STATIC_LOWER_BOUND, oldStaticLowerBound, staticLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStaticUpperBound() {
		return staticUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticUpperBound(Integer newStaticUpperBound) {
		Integer oldStaticUpperBound = staticUpperBound;
		staticUpperBound = newStaticUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.SLIDER__STATIC_UPPER_BOUND, oldStaticUpperBound, staticUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.SLIDER__MULTI_DATA_BINDING:
				return basicSetMultiDataBinding(null, msgs);
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
			case GuigenPackage.SLIDER__MULTI_DATA_BINDING:
				return getMultiDataBinding();
			case GuigenPackage.SLIDER__USE_COLLECTION_DATA_AS:
				return getUseCollectionDataAs();
			case GuigenPackage.SLIDER__STATIC_LOWER_BOUND:
				return getStaticLowerBound();
			case GuigenPackage.SLIDER__STATIC_UPPER_BOUND:
				return getStaticUpperBound();
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
			case GuigenPackage.SLIDER__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)newValue);
				return;
			case GuigenPackage.SLIDER__USE_COLLECTION_DATA_AS:
				setUseCollectionDataAs((SliderCollectionValuesUsageTypes)newValue);
				return;
			case GuigenPackage.SLIDER__STATIC_LOWER_BOUND:
				setStaticLowerBound((Integer)newValue);
				return;
			case GuigenPackage.SLIDER__STATIC_UPPER_BOUND:
				setStaticUpperBound((Integer)newValue);
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
			case GuigenPackage.SLIDER__MULTI_DATA_BINDING:
				setMultiDataBinding((AppDataBinding)null);
				return;
			case GuigenPackage.SLIDER__USE_COLLECTION_DATA_AS:
				setUseCollectionDataAs(USE_COLLECTION_DATA_AS_EDEFAULT);
				return;
			case GuigenPackage.SLIDER__STATIC_LOWER_BOUND:
				setStaticLowerBound(STATIC_LOWER_BOUND_EDEFAULT);
				return;
			case GuigenPackage.SLIDER__STATIC_UPPER_BOUND:
				setStaticUpperBound(STATIC_UPPER_BOUND_EDEFAULT);
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
			case GuigenPackage.SLIDER__MULTI_DATA_BINDING:
				return multiDataBinding != null;
			case GuigenPackage.SLIDER__USE_COLLECTION_DATA_AS:
				return useCollectionDataAs != USE_COLLECTION_DATA_AS_EDEFAULT;
			case GuigenPackage.SLIDER__STATIC_LOWER_BOUND:
				return STATIC_LOWER_BOUND_EDEFAULT == null ? staticLowerBound != null : !STATIC_LOWER_BOUND_EDEFAULT.equals(staticLowerBound);
			case GuigenPackage.SLIDER__STATIC_UPPER_BOUND:
				return STATIC_UPPER_BOUND_EDEFAULT == null ? staticUpperBound != null : !STATIC_UPPER_BOUND_EDEFAULT.equals(staticUpperBound);
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
				case GuigenPackage.SLIDER__MULTI_DATA_BINDING: return GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING;
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
				case GuigenPackage.MULTI_DATA_WIDGET__MULTI_DATA_BINDING: return GuigenPackage.SLIDER__MULTI_DATA_BINDING;
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
		result.append(" (useCollectionDataAs: ");
		result.append(useCollectionDataAs);
		result.append(", staticLowerBound: ");
		result.append(staticLowerBound);
		result.append(", staticUpperBound: ");
		result.append(staticUpperBound);
		result.append(')');
		return result.toString();
	}

} //SliderImpl
