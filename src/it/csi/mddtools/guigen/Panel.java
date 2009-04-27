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
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Panel#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Panel#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Panel#getLayout <em>Layout</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Panel#getLayoutSpec <em>Layout Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPanel()
 * @model abstract="true"
 * @generated
 */
public interface Panel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Panel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanel_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Panel#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(PanelLayout)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanel_Layout()
	 * @model containment="true"
	 * @generated
	 */
	PanelLayout getLayout();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Panel#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(PanelLayout value);

	/**
	 * Returns the value of the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout Spec</em>' containment reference.
	 * @see #setLayoutSpec(WidgetLayoutSpecifier)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanel_LayoutSpec()
	 * @model containment="true"
	 * @generated
	 */
	WidgetLayoutSpecifier getLayoutSpec();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Panel#getLayoutSpec <em>Layout Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Spec</em>' containment reference.
	 * @see #getLayoutSpec()
	 * @generated
	 */
	void setLayoutSpec(WidgetLayoutSpecifier value);

} // Panel
