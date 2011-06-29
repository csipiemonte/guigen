/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pannello destinato a contenere una <b>MenuView</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.MenuPanel#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getMenuPanel()
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>MenuPanel</b> &egrave; un pannello privo di visualizzazione grafica propria, da utilizzarsi\r\nesclusivamente per contenere il widget <b>MenuView</b>.\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface MenuPanel extends Panel {

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I widget inseribili in questo tipo di pannello sono solo:
	 * <ul>
	 * <li>TreeView</li>
	 * <li>MenuView</li>
	 * <li>UserDefinedWidget</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getMenuPanel_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();
} // MenuPanel
