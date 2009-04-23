/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Column Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Model</em>' containment reference.
	 * @see #setColumnModel(ColumnModel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_ColumnModel()
	 * @model containment="true"
	 * @generated
	 */
	ColumnModel getColumnModel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Model</em>' containment reference.
	 * @see #getColumnModel()
	 * @generated
	 */
	void setColumnModel(ColumnModel value);

	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Size</em>' attribute.
	 * @see #setPageSize(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_PageSize()
	 * @model
	 * @generated
	 */
	int getPageSize();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' attribute.
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(int value);

	/**
	 * Returns the value of the '<em><b>Enable Export</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Export</em>' attribute.
	 * @see #setEnableExport(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_EnableExport()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableExport();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Export</em>' attribute.
	 * @see #isEnableExport()
	 * @generated
	 */
	void setEnableExport(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Decorator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Decorator</em>' attribute.
	 * @see #setCustomDecorator(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_CustomDecorator()
	 * @model
	 * @generated
	 */
	boolean isCustomDecorator();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Decorator</em>' attribute.
	 * @see #isCustomDecorator()
	 * @generated
	 */
	void setCustomDecorator(boolean value);

} // Table
