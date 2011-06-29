/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.UCMappingPDefVal#getActualUseCase <em>Actual Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getUCMappingPDefVal()
 * @model
 * @generated
 */
public interface UCMappingPDefVal extends PDefParamVal {
	/**
	 * Returns the value of the '<em><b>Actual Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Use Case</em>' reference.
	 * @see #setActualUseCase(UseCase)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getUCMappingPDefVal_ActualUseCase()
	 * @model
	 * @generated
	 */
	UseCase getActualUseCase();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.UCMappingPDefVal#getActualUseCase <em>Actual Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Use Case</em>' reference.
	 * @see #getActualUseCase()
	 * @generated
	 */
	void setActualUseCase(UseCase value);

} // UCMappingPDefVal
