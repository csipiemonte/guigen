/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Based Security Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Security constraint basato sull'impersonificazione dell'utente corrente di un particolare Actor
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ActorBasedSecurityConstraint#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getActorBasedSecurityConstraint()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface ActorBasedSecurityConstraint extends UISecurityConstraint {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'Actor di riferimento
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getActorBasedSecurityConstraint_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ActorBasedSecurityConstraint#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

} // ActorBasedSecurityConstraint
