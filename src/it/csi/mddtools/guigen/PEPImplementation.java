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
 * A representation of the model object '<em><b>PEP Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PEPImplementation#getParams <em>Params</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PEPImplementation#isCustom <em>Custom</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PEPImplementation#getInlineCodeSnippets <em>Inline Code Snippets</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPEPImplementation()
 * @model
 * @generated
 */
public interface PEPImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.EnvConfigParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPEPImplementation_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvConfigParam> getParams();

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom</em>' attribute.
	 * @see #setCustom(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPEPImplementation_Custom()
	 * @model
	 * @generated
	 */
	boolean isCustom();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PEPImplementation#isCustom <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' attribute.
	 * @see #isCustom()
	 * @generated
	 */
	void setCustom(boolean value);

	/**
	 * Returns the value of the '<em><b>Inline Code Snippets</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.InlineCodeSnippet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline Code Snippets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Sono disponibili le seguenti chiavi:</p>
	 * <table border="1"><tbody>
	 * <tr>
	 * <th><b>Name</b></th>
	 * <th><b>Position</b></th>
	 * <th><b>Descrizione</b></th>
	 * </tr>
	 * <tr>
	 * <td>import</td>
	 * <td>methodPrivate</td>
	 * <td>definizione import custom</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>findActorsForPersonaInApplication</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>findActorsForPersonaInUseCase</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>findRuoliForPersonaInApplication</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>findRuoliForPersonaInUseCase</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>findUseCasesForPersonaInApplication</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>getInfoPersonaInUseCase</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>getInfoPersonaSchema</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>identificaCertificato</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>identificaUserPassword</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>identificaUserPasswordPIN</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>isIdentitaAutentica</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>isPersonaAutorizzataInUseCase</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>isPersonaInRuolo</td>
	 * <td>regione protetta metodo omonimo</td>
	 * </tr>
	 * <tr>
	 * <td>body</td>
	 * <td>methodPrivate</td>
	 * <td>introduzione eventuali metodi custom private aggiuntivi</td>
	 * </tr>
	 * </tbody></table>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Code Snippets</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPEPImplementation_InlineCodeSnippets()
	 * @model containment="true"
	 * @generated
	 */
	EList<InlineCodeSnippet> getInlineCodeSnippets();

} // PEPImplementation
