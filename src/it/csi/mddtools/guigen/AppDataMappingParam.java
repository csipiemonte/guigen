/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Data Mapping Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definizione di parametro di <b>PanelDef</b> che permette di rimpiazzare 
 * l'application data fittizio con quello reale nel <b>PanelDefUse</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppDataMappingParam#getDefAppData <em>Def App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataMappingParam()
 * @model
 * @generated
 */
public interface AppDataMappingParam extends PDefParam {
	/**
	 * Returns the value of the '<em><b>Def App Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def App Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def App Data</em>' reference.
	 * @see #setDefAppData(ApplicationData)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataMappingParam_DefAppData()
	 * @model
	 * @generated
	 */
	ApplicationData getDefAppData();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppDataMappingParam#getDefAppData <em>Def App Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def App Data</em>' reference.
	 * @see #getDefAppData()
	 * @generated
	 */
	void setDefAppData(ApplicationData value);

} // AppDataMappingParam
