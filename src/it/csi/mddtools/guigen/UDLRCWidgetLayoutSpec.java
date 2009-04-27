/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDLRC Widget Layout Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getUDLRCWidgetLayoutSpec()
 * @model
 * @generated
 */
public interface UDLRCWidgetLayoutSpec extends WidgetLayoutSpecifier {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.UDLRCSpecConstants}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see it.csi.mddtools.guigen.UDLRCSpecConstants
	 * @see #setValue(UDLRCSpecConstants)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getUDLRCWidgetLayoutSpec_Value()
	 * @model
	 * @generated
	 */
	UDLRCSpecConstants getValue();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see it.csi.mddtools.guigen.UDLRCSpecConstants
	 * @see #getValue()
	 * @generated
	 */
	void setValue(UDLRCSpecConstants value);

} // UDLRCWidgetLayoutSpec
