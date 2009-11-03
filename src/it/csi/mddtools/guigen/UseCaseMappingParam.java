/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.UseCaseMappingParam#getDefUseCase <em>Def Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getUseCaseMappingParam()
 * @model
 * @generated
 */
public interface UseCaseMappingParam extends PDefParam {
	/**
	 * Returns the value of the '<em><b>Def Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Use Case</em>' reference.
	 * @see #setDefUseCase(UseCase)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getUseCaseMappingParam_DefUseCase()
	 * @model
	 * @generated
	 */
	UseCase getDefUseCase();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.UseCaseMappingParam#getDefUseCase <em>Def Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Use Case</em>' reference.
	 * @see #getDefUseCase()
	 * @generated
	 */
	void setDefUseCase(UseCase value);

} // UseCaseMappingParam
