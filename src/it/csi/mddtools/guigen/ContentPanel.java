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
 * A representation of the model object '<em><b>Content Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ContentPanel#getPanels <em>Panels</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ContentPanel#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ContentPanel#getAppData <em>App Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ContentPanel#getOnRefreshCommand <em>On Refresh Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getContentPanel()
 * @model
 * @generated
 */
public interface ContentPanel extends EObject {
	/**
	 * Returns the value of the '<em><b>Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panels</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panels</em>' containment reference.
	 * @see #setPanels(Panel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getContentPanel_Panels()
	 * @model containment="true"
	 * @generated
	 */
	Panel getPanels();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ContentPanel#getPanels <em>Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panels</em>' containment reference.
	 * @see #getPanels()
	 * @generated
	 */
	void setPanels(Panel value);

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
	 * @see it.csi.mddtools.guigen.GuigenPackage#getContentPanel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ContentPanel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>App Data</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Data</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getContentPanel_AppData()
	 * @model
	 * @generated
	 */
	EList<ApplicationData> getAppData();

	/**
	 * Returns the value of the '<em><b>On Refresh Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Refresh Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Refresh Command</em>' containment reference.
	 * @see #setOnRefreshCommand(Command)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getContentPanel_OnRefreshCommand()
	 * @model containment="true"
	 * @generated
	 */
	Command getOnRefreshCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ContentPanel#getOnRefreshCommand <em>On Refresh Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Refresh Command</em>' containment reference.
	 * @see #getOnRefreshCommand()
	 * @generated
	 */
	void setOnRefreshCommand(Command value);

} // ContentPanel
