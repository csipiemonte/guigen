/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPAUTHSSO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.OPAUTHSSO#getMinAuthLevel <em>Min Auth Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getOPAUTHSSO()
 * @model
 * @generated
 */
public interface OPAUTHSSO extends AutenticationMethod {

	/**
	 * Returns the value of the '<em><b>Min Auth Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Auth Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Auth Level</em>' attribute.
	 * @see #setMinAuthLevel(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getOPAUTHSSO_MinAuthLevel()
	 * @model default="1"
	 * @generated
	 */
	int getMinAuthLevel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.OPAUTHSSO#getMinAuthLevel <em>Min Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Auth Level</em>' attribute.
	 * @see #getMinAuthLevel()
	 * @generated
	 */
	void setMinAuthLevel(int value);
} // OPAUTHSSO
