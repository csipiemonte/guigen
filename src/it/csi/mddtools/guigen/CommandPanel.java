/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


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
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandPanel()
 * @model
 * @generated
 */
public interface CommandPanel extends FormPanel {

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
} // CommandPanel
