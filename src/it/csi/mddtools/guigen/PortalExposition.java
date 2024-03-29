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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portal Exposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Rappresenta la singola esposizione di un'applicazione su uno specifico
 * portale, nell'ambito di una esposizione multi-portale.
 * Nel caso in cui il portale preveda differenti aree tematiche qui si specifica anche 
 * su qyale delle aree tematiche l'applicativo deve essere esposto
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PortalExposition#getPortal <em>Portal</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PortalExposition#getAreaCode <em>Area Code</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalExposition()
 * @model
 * @generated
 */
public interface PortalExposition extends EObject {
	/**
	 * Returns the value of the '<em><b>Portal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * riferimento al profilo del portale di esposizione
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portal</em>' reference.
	 * @see #setPortal(PortalProfile)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalExposition_Portal()
	 * @model
	 * @generated
	 */
	PortalProfile getPortal();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PortalExposition#getPortal <em>Portal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal</em>' reference.
	 * @see #getPortal()
	 * @generated
	 */
	void setPortal(PortalProfile value);

	/**
	 * Returns the value of the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice dell'area tematica del portale nella quale &egrave; esposto l'applicativo.
	 * In caso di portali che non prevedano aree tematiche differenziate occorre
	 * specificare l'area tematica &quot;general&quot;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Code</em>' attribute.
	 * @see #setAreaCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalExposition_AreaCode()
	 * @model
	 * @generated
	 */
	String getAreaCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PortalExposition#getAreaCode <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Code</em>' attribute.
	 * @see #getAreaCode()
	 * @generated
	 */
	void setAreaCode(String value);

} // PortalExposition
