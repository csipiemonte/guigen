/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Customization PDef Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Valorizzazione di parametro di <b>PanelDef</b> che permette di personalizzare
 * una <b>Table</b> per la quale &egrave; stata prevista la personalizzabilit&agrave;
 * (tramite un <b>TableCustomizationPDefVal</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TableCustomizationPDefVal#getExtraCols <em>Extra Cols</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.TableCustomizationPDefVal#getHiddenCols <em>Hidden Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationPDefVal()
 * @model
 * @generated
 */
public interface TableCustomizationPDefVal extends PDefParamVal {
	/**
	 * Returns the value of the '<em><b>Extra Cols</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ExtraColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'elenco delle colonne da aggiungere alle colonne preesistenti nella tabella
	 * base. Le colonne saranno aggiunte secondo quanto specificato nell'
	 * attributo <i>insertAfter</i> dell'oggetto <b>ExtraColumn</b> corrispondente.
	 * Se due <b>ExtraColumn</b> presentano lo stesso valore di tale attributo, esse
	 * saranno inserite nell'ordine in cui sono presenti in questo elenco.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Cols</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationPDefVal_ExtraCols()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtraColumn> getExtraCols();

	/**
	 * Returns the value of the '<em><b>Hidden Cols</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco delle colonne della <b>Table</b> base che devono essere nascoste.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hidden Cols</em>' reference.
	 * @see #setHiddenCols(Column)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTableCustomizationPDefVal_HiddenCols()
	 * @model
	 * @generated
	 */
	Column getHiddenCols();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TableCustomizationPDefVal#getHiddenCols <em>Hidden Cols</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Cols</em>' reference.
	 * @see #getHiddenCols()
	 * @generated
	 */
	void setHiddenCols(Column value);

} // TableCustomizationPDefVal
