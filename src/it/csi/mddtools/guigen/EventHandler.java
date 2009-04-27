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
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#getCommand <em>Command</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#getEventType <em>Event Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#isSkipValidation <em>Skip Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Command)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_Command()
	 * @model containment="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EventHandler#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.EventTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @see #setEventType(EventTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_EventType()
	 * @model
	 * @generated
	 */
	EventTypes getEventType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EventHandler#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventTypes value);

	/**
	 * Returns the value of the '<em><b>Skip Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[TODO: add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Validation</em>' attribute.
	 * @see #setSkipValidation(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_SkipValidation()
	 * @model
	 * @generated
	 */
	boolean isSkipValidation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EventHandler#isSkipValidation <em>Skip Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Validation</em>' attribute.
	 * @see #isSkipValidation()
	 * @generated
	 */
	void setSkipValidation(boolean value);

} // EventHandler
