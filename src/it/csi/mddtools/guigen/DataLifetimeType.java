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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Lifetime Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Possibili modi di persistenza dell'application data.
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getDataLifetimeType()
 * @model annotation="logicpkg pkg='mdl.data'"
 * @generated
 */
public enum DataLifetimeType implements Enumerator {
	/**
	 * The '<em><b>USER ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	USER_ACTION(0, "USER_ACTION", "USER_ACTION"),

	/**
	 * The '<em><b>USER SESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_SESSION_VALUE
	 * @generated
	 * @ordered
	 */
	USER_SESSION(1, "USER_SESSION", "USER_SESSION"), /**
	 * The '<em><b>SAME PAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAME_PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_PAGE(2, "SAME_PAGE", "SAME_PAGE");

	/**
	 * The '<em><b>USER ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER ACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il valore &egrave; disponibile solo fino al termine dell'azione utente corrente.
	 * <!-- end-model-doc -->
	 * @see #USER_ACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_ACTION_VALUE = 0;

	/**
	 * The '<em><b>USER SESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER SESSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il valore &egrave; disponibile per tutta la durata della sessioen utente, a meno che non venga esplicitamente rimosso.
	 * <!-- end-model-doc -->
	 * @see #USER_SESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_SESSION_VALUE = 1;

	/**
	 * The '<em><b>SAME PAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il valore &egrave; disponibile finch&egrave; il flusso non passa a dun content panel differente, tramite un <b>JumpCommand</b>.
	 * <!-- end-model-doc -->
	 * @see #SAME_PAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_PAGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Lifetime Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataLifetimeType[] VALUES_ARRAY =
		new DataLifetimeType[] {
			USER_ACTION,
			USER_SESSION,
			SAME_PAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Lifetime Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataLifetimeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Lifetime Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataLifetimeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataLifetimeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Lifetime Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataLifetimeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataLifetimeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Lifetime Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataLifetimeType get(int value) {
		switch (value) {
			case USER_ACTION_VALUE: return USER_ACTION;
			case USER_SESSION_VALUE: return USER_SESSION;
			case SAME_PAGE_VALUE: return SAME_PAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataLifetimeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataLifetimeType
