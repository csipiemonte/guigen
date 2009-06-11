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
 * A representation of the model object '<em><b>Command Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[TODO: add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.CommandPanel#getCmdStyle <em>Cmd Style</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.CommandPanel#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandPanel()
 * @model
 * @generated
 */
public interface CommandPanel extends Panel {

	/**
	 * Returns the value of the '<em><b>Cmd Style</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.CommandStyles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Style</em>' attribute.
	 * @see it.csi.mddtools.guigen.CommandStyles
	 * @see #setCmdStyle(CommandStyles)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandPanel_CmdStyle()
	 * @model
	 * @generated
	 */
	CommandStyles getCmdStyle();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.CommandPanel#getCmdStyle <em>Cmd Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Style</em>' attribute.
	 * @see it.csi.mddtools.guigen.CommandStyles
	 * @see #getCmdStyle()
	 * @generated
	 */
	void setCmdStyle(CommandStyles value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandPanel_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();
} // CommandPanel
