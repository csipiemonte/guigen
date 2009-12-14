/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette la visualizzazione di testo, fisso o proveniente da application data, senza possibilità di editing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PlainText#getStaticText <em>Static Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPlainText()
 * @model
 * @generated
 */
public interface PlainText extends DataWidget {

	/**
	 * Returns the value of the '<em><b>Static Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato il widget visualizzer&agrave; il testo html specificato a fianco alla label.
	 * In caso contrario, e se sar&agrave; specificato un data binding, il
	 * valore visualizzato sar&agrave; preso dall'application data referenziato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Text</em>' attribute.
	 * @see #setStaticText(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPlainText_StaticText()
	 * @model
	 * @generated
	 */
	String getStaticText();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PlainText#getStaticText <em>Static Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Text</em>' attribute.
	 * @see #getStaticText()
	 * @generated
	 */
	void setStaticText(String value);
} // PlainText
