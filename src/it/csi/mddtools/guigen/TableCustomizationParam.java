/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Customization Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definizione di parametro di <b>PanelDef</b> che permette di personalizzare
 * una <b>Table</b> contenuta nel <b>PanelDef</b>.
 * La personalizzazione consiste nella possibilit&agrave; di:
 * <ul>
 * <li>aggiungere colonne extra in una posizione ben definita rispetto alle colonne
 *       preessitenti nella tabella base</li>
 * <li>nascondere una parte delle colonne presenti nella tabella base</li>
 * </ul>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TableCustomizationParam#getBaseTable <em>Base Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationParam()
 * @model
 * @generated
 */
public interface TableCustomizationParam extends PDefParam {
	/**
	 * Returns the value of the '<em><b>Base Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * La <b>Table</b> su cui &egrave; possibile effettuare la personalizzazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Table</em>' reference.
	 * @see #setBaseTable(Table)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationParam_BaseTable()
	 * @model
	 * @generated
	 */
	Table getBaseTable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TableCustomizationParam#getBaseTable <em>Base Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Table</em>' reference.
	 * @see #getBaseTable()
	 * @generated
	 */
	void setBaseTable(Table value);

} // TableCustomizationParam
