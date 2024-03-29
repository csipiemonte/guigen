/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Header dell'applicazione. comune a tutti i <b>ContentPanel</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Header#getCodCanale <em>Cod Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Header#getCodApplicativo <em>Cod Applicativo</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Header#getNomeCanale <em>Nome Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Header#getLinkCanale <em>Link Canale</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Header#getNomeApplicativo <em>Nome Applicativo</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Header#getTitle <em>Title</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Header#getMetaAttributes <em>Meta Attributes</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {

	/**
	 * Returns the value of the '<em><b>Cod Canale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Canale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice del canale all'interno del portale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Canale</em>' attribute.
	 * @see #setCodCanale(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_CodCanale()
	 * @model
	 * @generated
	 */
	String getCodCanale();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getCodCanale <em>Cod Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Canale</em>' attribute.
	 * @see #getCodCanale()
	 * @generated
	 */
	void setCodCanale(String value);

	/**
	 * Returns the value of the '<em><b>Cod Applicativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Applicativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice dell'applicativo come codificato nel portale
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Applicativo</em>' attribute.
	 * @see #setCodApplicativo(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_CodApplicativo()
	 * @model
	 * @generated
	 */
	String getCodApplicativo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getCodApplicativo <em>Cod Applicativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Applicativo</em>' attribute.
	 * @see #getCodApplicativo()
	 * @generated
	 */
	void setCodApplicativo(String value);

	/**
	 * Returns the value of the '<em><b>Nome Canale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Canale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nome descrittivo del canale tematico.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nome Canale</em>' attribute.
	 * @see #setNomeCanale(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_NomeCanale()
	 * @model
	 * @generated
	 */
	String getNomeCanale();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getNomeCanale <em>Nome Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Canale</em>' attribute.
	 * @see #getNomeCanale()
	 * @generated
	 */
	void setNomeCanale(String value);

	/**
	 * Returns the value of the '<em><b>Link Canale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Canale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link della home page del canale tematico
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Canale</em>' attribute.
	 * @see #setLinkCanale(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_LinkCanale()
	 * @model
	 * @generated
	 */
	String getLinkCanale();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getLinkCanale <em>Link Canale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Canale</em>' attribute.
	 * @see #getLinkCanale()
	 * @generated
	 */
	void setLinkCanale(String value);

	/**
	 * Returns the value of the '<em><b>Nome Applicativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Applicativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome descrittivo dell'applicativo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nome Applicativo</em>' attribute.
	 * @see #setNomeApplicativo(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_NomeApplicativo()
	 * @model
	 * @generated
	 */
	String getNomeApplicativo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getNomeApplicativo <em>Nome Applicativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Applicativo</em>' attribute.
	 * @see #getNomeApplicativo()
	 * @generated
	 */
	void setNomeApplicativo(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Header#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Meta Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.HeaderMetaAttr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Attributes</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getHeader_MetaAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderMetaAttr> getMetaAttributes();
} // Header
