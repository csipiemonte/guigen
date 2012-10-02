/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.IdentityAdapter#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.IdentityAdapter#getInfoSourceName <em>Info Source Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.IdentityAdapter#getTicketVerifyMethod <em>Ticket Verify Method</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.IdentityAdapter#getInlineCodeSnippets <em>Inline Code Snippets</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getIdentityAdapter()
 * @model
 * @generated
 */
public interface IdentityAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.InfoSourceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.InfoSourceTypes
	 * @see #setSourceType(InfoSourceTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getIdentityAdapter_SourceType()
	 * @model
	 * @generated
	 */
	InfoSourceTypes getSourceType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.IdentityAdapter#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.InfoSourceTypes
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(InfoSourceTypes value);

	/**
	 * Returns the value of the '<em><b>Info Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Source Name</em>' attribute.
	 * @see #setInfoSourceName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getIdentityAdapter_InfoSourceName()
	 * @model
	 * @generated
	 */
	String getInfoSourceName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.IdentityAdapter#getInfoSourceName <em>Info Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Source Name</em>' attribute.
	 * @see #getInfoSourceName()
	 * @generated
	 */
	void setInfoSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Ticket Verify Method</b></em>' attribute.
	 * The default value is <code>"LOCAL"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.TicketVerifyMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ticket Verify Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket Verify Method</em>' attribute.
	 * @see it.csi.mddtools.guigen.TicketVerifyMethod
	 * @see #setTicketVerifyMethod(TicketVerifyMethod)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getIdentityAdapter_TicketVerifyMethod()
	 * @model default="LOCAL"
	 * @generated
	 */
	TicketVerifyMethod getTicketVerifyMethod();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.IdentityAdapter#getTicketVerifyMethod <em>Ticket Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket Verify Method</em>' attribute.
	 * @see it.csi.mddtools.guigen.TicketVerifyMethod
	 * @see #getTicketVerifyMethod()
	 * @generated
	 */
	void setTicketVerifyMethod(TicketVerifyMethod value);

	/**
	 * Returns the value of the '<em><b>Inline Code Snippets</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.InlineCodeSnippet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline Code Snippets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline Code Snippets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getIdentityAdapter_InlineCodeSnippets()
	 * @model containment="true"
	 * @generated
	 */
	EList<InlineCodeSnippet> getInlineCodeSnippets();

} // IdentityAdapter
