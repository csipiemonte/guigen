/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Buttons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.RadioButtons#getRadio <em>Radio</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons()
 * @model
 * @generated
 */
public interface RadioButtons extends DataWidget {
	/**
	 * Returns the value of the '<em><b>Radio</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.RadioButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons_Radio()
	 * @model containment="true"
	 * @generated
	 */
	EList<RadioButton> getRadio();

} // RadioButtons
