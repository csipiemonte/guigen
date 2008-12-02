/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getLayoutSpec <em>Layout Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getEventHandlers <em>Event Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget()
 * @model abstract="true"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getName <em>Name</em>}' attribute.
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
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Spec</em>' containment reference.
	 * @see #setLayoutSpec(WidgetLayoutSpecifier)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_LayoutSpec()
	 * @model containment="true"
	 * @generated
	 */
	WidgetLayoutSpecifier getLayoutSpec();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getLayoutSpec <em>Layout Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Spec</em>' containment reference.
	 * @see #getLayoutSpec()
	 * @generated
	 */
	void setLayoutSpec(WidgetLayoutSpecifier value);

	/**
	 * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.EventHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Handlers</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_EventHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventHandler> getEventHandlers();

} // Widget
