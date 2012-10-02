/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Code Snippet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetPosition <em>Snippet Position</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetName <em>Snippet Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetCode <em>Snippet Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.InlineCodeSnippet#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getInlineCodeSnippet()
 * @model
 * @generated
 */
public interface InlineCodeSnippet extends EObject {
	/**
	 * Returns the value of the '<em><b>Snippet Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippet Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet Position</em>' attribute.
	 * @see #setSnippetPosition(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getInlineCodeSnippet_SnippetPosition()
	 * @model
	 * @generated
	 */
	String getSnippetPosition();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetPosition <em>Snippet Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet Position</em>' attribute.
	 * @see #getSnippetPosition()
	 * @generated
	 */
	void setSnippetPosition(String value);

	/**
	 * Returns the value of the '<em><b>Snippet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet Name</em>' attribute.
	 * @see #setSnippetName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getInlineCodeSnippet_SnippetName()
	 * @model
	 * @generated
	 */
	String getSnippetName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetName <em>Snippet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet Name</em>' attribute.
	 * @see #getSnippetName()
	 * @generated
	 */
	void setSnippetName(String value);

	/**
	 * Returns the value of the '<em><b>Snippet Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippet Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet Code</em>' attribute.
	 * @see #setSnippetCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getInlineCodeSnippet_SnippetCode()
	 * @model
	 * @generated
	 */
	String getSnippetCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getSnippetCode <em>Snippet Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet Code</em>' attribute.
	 * @see #getSnippetCode()
	 * @generated
	 */
	void setSnippetCode(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getInlineCodeSnippet_Lang()
	 * @model
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.InlineCodeSnippet#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

} // InlineCodeSnippet
