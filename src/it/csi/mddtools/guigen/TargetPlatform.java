/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform()
 * @model
 * @generated
 */
public interface TargetPlatform extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.TargetPlatformCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.TargetPlatformCodes
	 * @see #setCode(TargetPlatformCodes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_Code()
	 * @model
	 * @generated
	 */
	TargetPlatformCodes getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.TargetPlatformCodes
	 * @see #getCode()
	 * @generated
	 */
	void setCode(TargetPlatformCodes value);

	/**
	 * Returns the value of the '<em><b>Enable Rich UI Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Rich UI Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Rich UI Behavior</em>' attribute.
	 * @see #setEnableRichUIBehavior(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_EnableRichUIBehavior()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnableRichUIBehavior();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Rich UI Behavior</em>' attribute.
	 * @see #isEnableRichUIBehavior()
	 * @generated
	 */
	void setEnableRichUIBehavior(boolean value);

} // TargetPlatform
