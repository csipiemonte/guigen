/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActorMappingParam#getDefActor <em>Def Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActorMappingParam()
 * @model
 * @generated
 */
public interface ActorMappingParam extends PDefParam {
	/**
	 * Returns the value of the '<em><b>Def Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Actor</em>' reference.
	 * @see #setDefActor(Actor)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActorMappingParam_DefActor()
	 * @model
	 * @generated
	 */
	Actor getDefActor();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActorMappingParam#getDefActor <em>Def Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Actor</em>' reference.
	 * @see #getDefActor()
	 * @generated
	 */
	void setDefActor(Actor value);

} // ActorMappingParam
