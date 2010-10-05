/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActorMappingPDefVal#getActualActor <em>Actual Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActorMappingPDefVal()
 * @model
 * @generated
 */
public interface ActorMappingPDefVal extends PDefParamVal {
	/**
	 * Returns the value of the '<em><b>Actual Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Actor</em>' reference.
	 * @see #setActualActor(Actor)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActorMappingPDefVal_ActualActor()
	 * @model
	 * @generated
	 */
	Actor getActualActor();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActorMappingPDefVal#getActualActor <em>Actual Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Actor</em>' reference.
	 * @see #getActualActor()
	 * @generated
	 */
	void setActualActor(Actor value);

} // ActorMappingPDefVal
