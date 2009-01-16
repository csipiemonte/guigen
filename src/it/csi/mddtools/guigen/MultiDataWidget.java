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
 * A representation of the model object '<em><b>Multi Data Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MultiDataWidget#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiDataWidget()
 * @model
 * @generated
 */
public interface MultiDataWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Data Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Data Binding</em>' containment reference.
	 * @see #setMultiDataBinding(AppDataBinding)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMultiDataWidget_MultiDataBinding()
	 * @model containment="true"
	 * @generated
	 */
	AppDataBinding getMultiDataBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.MultiDataWidget#getMultiDataBinding <em>Multi Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Data Binding</em>' containment reference.
	 * @see #getMultiDataBinding()
	 * @generated
	 */
	void setMultiDataBinding(AppDataBinding value);

} // MultiDataWidget
