/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MultiDataWidget che permette la selezione di uno o più valori all'interno di 
 * un elenco di possibili opzioni.
 * Se il value-binding &egrave; impostato su un <b>ApplicationData</b> di tipo
 * Simple la combo sar&agrave; a selezione singola; se il value-binding &egrave; impostato su un <b>ApplicationData</b> di tipo
 * TypedArray (con component type Simple) la combo sar&agrave; a selezione multipla.
 * Alla combo &egrave; possibile associare un event handler relativo all'evento
 * VALUE_CHANGED, che viene scatenato nel momento un cui viene modificata la selezione.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getKeySelector <em>Key Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#getValueSelector <em>Value Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ComboBox#isOmitHeaderValue <em>Omit Header Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox()
 * @model
 * @generated
 */
public interface ComboBox extends DataWidget, MultiDataWidget {

	/**
	 * Returns the value of the '<em><b>Key Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome del campo che deve essere considerato come "key". Il campo deve
	 * corrispondere ad un field del complex type di cui è costituito l'array
	 * collegato alla combo (tramite multi-data-binding).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Selector</em>' attribute.
	 * @see #setKeySelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_KeySelector()
	 * @model
	 * @generated
	 */
	String getKeySelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#getKeySelector <em>Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Selector</em>' attribute.
	 * @see #getKeySelector()
	 * @generated
	 */
	void setKeySelector(String value);

	/**
	 * Returns the value of the '<em><b>Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome del campo che deve essere utilizzato come descrizione visualizzata. Il campo deve
	 * corrispondere ad un field del complex type di cui è costituito l'array
	 * collegato alla combo (tramite multi-data-binding).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Selector</em>' attribute.
	 * @see #setValueSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_ValueSelector()
	 * @model
	 * @generated
	 */
	String getValueSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#getValueSelector <em>Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Selector</em>' attribute.
	 * @see #getValueSelector()
	 * @generated
	 */
	void setValueSelector(String value);

	/**
	 * Returns the value of the '<em><b>Omit Header Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Header Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true non viene inserita la entry relativa allo stato di selezione nulla.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Omit Header Value</em>' attribute.
	 * @see #setOmitHeaderValue(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getComboBox_OmitHeaderValue()
	 * @model default="false"
	 * @generated
	 */
	boolean isOmitHeaderValue();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ComboBox#isOmitHeaderValue <em>Omit Header Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Header Value</em>' attribute.
	 * @see #isOmitHeaderValue()
	 * @generated
	 */
	void setOmitHeaderValue(boolean value);
} // ComboBox
