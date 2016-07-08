/**
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Slider#getUseCollectionDataAs <em>Use Collection Data As</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Slider#getStaticLowerBound <em>Static Lower Bound</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Slider#getStaticUpperBound <em>Static Upper Bound</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider()
 * @model
 * @generated
 */
public interface Slider extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Use Collection Data As</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Collection Data As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Collection Data As</em>' attribute.
	 * @see it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes
	 * @see #setUseCollectionDataAs(SliderCollectionValuesUsageTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider_UseCollectionDataAs()
	 * @model
	 * @generated
	 */
	SliderCollectionValuesUsageTypes getUseCollectionDataAs();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Slider#getUseCollectionDataAs <em>Use Collection Data As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Collection Data As</em>' attribute.
	 * @see it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes
	 * @see #getUseCollectionDataAs()
	 * @generated
	 */
	void setUseCollectionDataAs(SliderCollectionValuesUsageTypes value);

	/**
	 * Returns the value of the '<em><b>Static Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Lower Bound</em>' attribute.
	 * @see #setStaticLowerBound(Integer)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider_StaticLowerBound()
	 * @model
	 * @generated
	 */
	Integer getStaticLowerBound();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Slider#getStaticLowerBound <em>Static Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Lower Bound</em>' attribute.
	 * @see #getStaticLowerBound()
	 * @generated
	 */
	void setStaticLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Static Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Upper Bound</em>' attribute.
	 * @see #setStaticUpperBound(Integer)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider_StaticUpperBound()
	 * @model
	 * @generated
	 */
	Integer getStaticUpperBound();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Slider#getStaticUpperBound <em>Static Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Upper Bound</em>' attribute.
	 * @see #getStaticUpperBound()
	 * @generated
	 */
	void setStaticUpperBound(Integer value);

} // Slider
