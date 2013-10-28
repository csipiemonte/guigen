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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo base (semplice).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#isNillable <em>Nillable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#isUserDefined <em>User Defined</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#getDataTypeModifiers <em>Data Type Modifiers</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.SimpleType#getEditHintMsg <em>Edit Hint Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType()
 * @model annotation="logicpkg pkg='mdl.types'"
 * @generated
 */
public interface SimpleType extends Type {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.SimpleTypeCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice che serve per discriminare il tipo base (scalare) specifico.
	 * Se &egrave; impostato <i>userDefined</i> a false allora il tipo
	 * corrisponde ad un tipo base del linguaggio host (es int, java.lang.Double).
	 * Se invece <i>userDefined</i> &egrave; impostato a true, viene generato
	 * un nuovo tipo di dato astratto basato sul tipo scalare corrispondente e 
	 * nel quale &egrave; possibile specificare meglio il dominio di valori ammessi e
	 * alcune caratteristiche di formattazione.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.SimpleTypeCodes
	 * @see #setCode(SimpleTypeCodes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_Code()
	 * @model
	 * @generated
	 */
	SimpleTypeCodes getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.guigen.SimpleTypeCodes
	 * @see #getCode()
	 * @generated
	 */
	void setCode(SimpleTypeCodes value);

	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true, il tipo ammette il vlaore <i>null</i> nel suo dominio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #setNillable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_Nillable()
	 * @model
	 * @generated
	 */
	boolean isNillable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #isNillable()
	 * @generated
	 */
	void setNillable(boolean value);

	/**
	 * Returns the value of the '<em><b>User Defined</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true viene generata una classe che rappresenta il tipo di dato
	 * e everr&agrave; utilizzata questa classe al posto del tipo scalare corrispondente,
	 * che sar&agrave; utilizzato come contenitore del dato internamente alla classe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined</em>' attribute.
	 * @see #setUserDefined(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_UserDefined()
	 * @model default="false"
	 * @generated
	 */
	boolean isUserDefined();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#isUserDefined <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined</em>' attribute.
	 * @see #isUserDefined()
	 * @generated
	 */
	void setUserDefined(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Modifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utilizzato solo se <i>userDefined</i> = true.
	 * Permette di specificare il tipo di dato, in termini di restrizioni sul dominio
	 * di valori ammessi, opzioni di formattazione etc.
	 * 
	 * [[TODO: documentare sintassi ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type Modifiers</em>' attribute list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_DataTypeModifiers()
	 * @model
	 * @generated
	 */
	EList<String> getDataTypeModifiers();

	/**
	 * Returns the value of the '<em><b>Edit Hint Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Hint Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utilizzato solo se <i>userDefined</i> == true.
	 * Permette di specificare il messaggio che deve essere utilizzato per descrivere
	 * il range di valori ammessi. Può essere utilizzato, a seconda delle cartucce di 
	 * generazione, come tooltip oppure come messaggio di errore in caso di 
	 * immissione di un valore scorretto.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Hint Msg</em>' attribute.
	 * @see #setEditHintMsg(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSimpleType_EditHintMsg()
	 * @model
	 * @generated
	 */
	String getEditHintMsg();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.SimpleType#getEditHintMsg <em>Edit Hint Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Hint Msg</em>' attribute.
	 * @see #getEditHintMsg()
	 * @generated
	 */
	void setEditHintMsg(String value);

} // SimpleType
