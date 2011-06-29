/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Data Mapping PDef Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Valorizzazione di parametro di <b>PanelDef</b> che permette di rimpiazzare 
 * l'application data fittizio con quello reale nel <b>PanelDefUse</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.AppDataMappingPDefVal#getActualAppData <em>Actual App Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataMappingPDefVal()
 * @model
 * @generated
 */
public interface AppDataMappingPDefVal extends PDefParamVal {
	/**
	 * Returns the value of the '<em><b>Actual App Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual App Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual App Data</em>' reference.
	 * @see #setActualAppData(ApplicationData)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getAppDataMappingPDefVal_ActualAppData()
	 * @model
	 * @generated
	 */
	ApplicationData getActualAppData();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.AppDataMappingPDefVal#getActualAppData <em>Actual App Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual App Data</em>' reference.
	 * @see #getActualAppData()
	 * @generated
	 */
	void setActualAppData(ApplicationData value);

} // AppDataMappingPDefVal
