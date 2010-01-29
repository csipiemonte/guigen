/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo specifico di <b>Column<b> utilizzabile per aggiungere colonne ad una
 * <b>Table</b> presente in un <b>PanelDef</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ExtraColumn#getInsertAfter <em>Insert After</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getExtraColumn()
 * @model
 * @generated
 */
public interface ExtraColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Insert After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indica in che posizione deve essere aggiunta la nuova colonna:
	 * <ul>
	 * <li>se l'attributo non &egrave; impostato la colonna verr&agrave; aggiunta
	 *        in prima posizione</li>
	 * <li>se l'attributo &egrave; valorizzato la colonna verr&agrave; inserita dopo
	 * la colonna indicata</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert After</em>' reference.
	 * @see #setInsertAfter(Column)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExtraColumn_InsertAfter()
	 * @model
	 * @generated
	 */
	Column getInsertAfter();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ExtraColumn#getInsertAfter <em>Insert After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert After</em>' reference.
	 * @see #getInsertAfter()
	 * @generated
	 */
	void setInsertAfter(Column value);

} // ExtraColumn
