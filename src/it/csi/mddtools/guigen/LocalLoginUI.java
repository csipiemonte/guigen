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
 * A representation of the model object '<em><b>Local Login UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.LocalLoginUI#getUiType <em>Ui Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getLocalLoginUI()
 * @model
 * @generated
 */
public interface LocalLoginUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Ui Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.LoginUITypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.LoginUITypes
	 * @see #setUiType(LoginUITypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getLocalLoginUI_UiType()
	 * @model
	 * @generated
	 */
	LoginUITypes getUiType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.LocalLoginUI#getUiType <em>Ui Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.LoginUITypes
	 * @see #getUiType()
	 * @generated
	 */
	void setUiType(LoginUITypes value);

} // LocalLoginUI
