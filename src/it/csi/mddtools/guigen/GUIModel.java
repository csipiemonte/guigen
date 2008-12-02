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
 * A representation of the model object '<em><b>GUI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getStructure <em>Structure</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getBeahviors <em>Beahviors</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel()
 * @model
 * @generated
 */
public interface GUIModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(GUIStructure)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_Structure()
	 * @model containment="true"
	 * @generated
	 */
	GUIStructure getStructure();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(GUIStructure value);

	/**
	 * Returns the value of the '<em><b>Beahviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beahviors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beahviors</em>' containment reference.
	 * @see #setBeahviors(GUIBehaviors)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_Beahviors()
	 * @model containment="true"
	 * @generated
	 */
	GUIBehaviors getBeahviors();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getBeahviors <em>Beahviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beahviors</em>' containment reference.
	 * @see #getBeahviors()
	 * @generated
	 */
	void setBeahviors(GUIBehaviors value);

} // GUIModel
