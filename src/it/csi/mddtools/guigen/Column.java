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
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Column#getSelector <em>Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#isSortable <em>Sortable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#isEditable <em>Editable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#isEventActive <em>Event Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getEditableFlagSelector <em>Editable Flag Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultidataKeySelector <em>Multidata Key Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultidataValueSelector <em>Multidata Value Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultidataPropertySelector <em>Multidata Property Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Selector()
	 * @model
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

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
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sortable</em>' attribute.
	 * @see #setSortable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Sortable()
	 * @model
	 * @generated
	 */
	boolean isSortable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#isSortable <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortable</em>' attribute.
	 * @see #isSortable()
	 * @generated
	 */
	void setSortable(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Editable()
	 * @model
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Active</em>' attribute.
	 * @see #setEventActive(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_EventActive()
	 * @model
	 * @generated
	 */
	boolean isEventActive();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#isEventActive <em>Event Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Active</em>' attribute.
	 * @see #isEventActive()
	 * @generated
	 */
	void setEventActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable Flag Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable Flag Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable Flag Selector</em>' attribute.
	 * @see #setEditableFlagSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_EditableFlagSelector()
	 * @model
	 * @generated
	 */
	String getEditableFlagSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getEditableFlagSelector <em>Editable Flag Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable Flag Selector</em>' attribute.
	 * @see #getEditableFlagSelector()
	 * @generated
	 */
	void setEditableFlagSelector(String value);

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
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultiDataBinding()
	 * @model containment="true"
	 * @generated
	 */
	AppDataBinding getMultiDataBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultiDataBinding <em>Multi Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Data Binding</em>' containment reference.
	 * @see #getMultiDataBinding()
	 * @generated
	 */
	void setMultiDataBinding(AppDataBinding value);

	/**
	 * Returns the value of the '<em><b>Multidata Key Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multidata Key Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multidata Key Selector</em>' attribute.
	 * @see #setMultidataKeySelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultidataKeySelector()
	 * @model
	 * @generated
	 */
	String getMultidataKeySelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultidataKeySelector <em>Multidata Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multidata Key Selector</em>' attribute.
	 * @see #getMultidataKeySelector()
	 * @generated
	 */
	void setMultidataKeySelector(String value);

	/**
	 * Returns the value of the '<em><b>Multidata Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multidata Value Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multidata Value Selector</em>' attribute.
	 * @see #setMultidataValueSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultidataValueSelector()
	 * @model
	 * @generated
	 */
	String getMultidataValueSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultidataValueSelector <em>Multidata Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multidata Value Selector</em>' attribute.
	 * @see #getMultidataValueSelector()
	 * @generated
	 */
	void setMultidataValueSelector(String value);

	/**
	 * Returns the value of the '<em><b>Multidata Property Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multidata Property Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multidata Property Selector</em>' attribute.
	 * @see #setMultidataPropertySelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultidataPropertySelector()
	 * @model
	 * @generated
	 */
	String getMultidataPropertySelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultidataPropertySelector <em>Multidata Property Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multidata Property Selector</em>' attribute.
	 * @see #getMultidataPropertySelector()
	 * @generated
	 */
	void setMultidataPropertySelector(String value);

} // Column
