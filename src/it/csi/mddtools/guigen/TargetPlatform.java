/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * specifica della target platform per cui deve essere generato il pacchetto, pi&ugrave; altre caratteristiche tecniche.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#isEnableRichUIBehavior <em>Enable Rich UI Behavior</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#isEnableFatClient <em>Enable Fat Client</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TargetPlatform#getPortalProfiles <em>Portal Profiles</em>}</li>
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
	 * codice della piattaforma target
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
	 * <!-- begin-model-doc -->
	 * Se impostato a true sono abilitati i comportamenti "ricchi" di User Interaction.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Enable Fat Client</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true sono abilitati i comportamenti "ricchi" di User Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Fat Client</em>' attribute.
	 * @see #setEnableFatClient(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_EnableFatClient()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnableFatClient();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TargetPlatform#isEnableFatClient <em>Enable Fat Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Fat Client</em>' attribute.
	 * @see #isEnableFatClient()
	 * @generated
	 */
	void setEnableFatClient(boolean value);

	/**
	 * Returns the value of the '<em><b>Portal Profiles</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.PortalProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Profiles</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTargetPlatform_PortalProfiles()
	 * @model
	 * @generated
	 */
	EList<PortalProfile> getPortalProfiles();

} // TargetPlatform
