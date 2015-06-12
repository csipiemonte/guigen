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
 * A representation of the literals of the enumeration '<em><b>Custom Cartridge ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Elenco dei codici che possono essere utilizzati per classificare le cartucce.
 * <ul>
 * <li>
 * I valori <b>PLATF_1</b> ... <b>PLATF_5</b> sono riservati alle estensioni
 * abilitanti all'utilizzo di una <i>piattaforma</i> (es. BPM-FLUX, ...). Queste estensioni
 * sono realizzate da chi gestisce la piattaorma in congiunzione con il gruppo di 
 * competenza MDD.
 * </li>
 * <li>
 * I valori <b>TECH_1</b> ... <b>TECH_5</b> sono riservati alle estensioni
 * specifiche di una determinata problematica <i>tecnologica</i> (es. accesso al DB, accesso a servizi,, ...)
 * Queste estensioni sono realizzate da chi gestisce gli standard di sviluppo in congiunzione con il gruppo di 
 * competenza MDD.
 * </li>
 * <li>
 * I valori <b>CUSTOM_1</b> ... <b>CUSTOM_3</b> sono riservati alle estensioni
 * specifiche di un determinato progetto <i>tecnologica</i>.
 * Queste estensioni p'ossono essere realizzate dal gruppo di progetto con il supporto
 * del gruppo di competenza MDD, ma sono da considerarsi feature <b>AVANZATE</b>,
 * da utilizzare quando realmente necessario.
 * </li>
 * 
 * </ul>
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getCustomCartridgeID()
 * @model
 * @generated
 */
public enum CustomCartridgeID implements Enumerator {
	/**
	 * The '<em><b>PLATF 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATF_1_VALUE
	 * @generated
	 * @ordered
	 */
	PLATF_1(101, "PLATF_1", "PLATF_1"),

	/**
	 * The '<em><b>PLATF 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATF_2_VALUE
	 * @generated
	 * @ordered
	 */
	PLATF_2(102, "PLATF_2", "PLATF_2"),

	/**
	 * The '<em><b>PLATF 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATF_3_VALUE
	 * @generated
	 * @ordered
	 */
	PLATF_3(103, "PLATF_3", "PLATF_3"),

	/**
	 * The '<em><b>PLATF 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATF_4_VALUE
	 * @generated
	 * @ordered
	 */
	PLATF_4(104, "PLATF_4", "PLATF_4"),

	/**
	 * The '<em><b>PLATF 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATF_5_VALUE
	 * @generated
	 * @ordered
	 */
	PLATF_5(105, "PLATF_5", "PLATF_5"),

	/**
	 * The '<em><b>CUSTOM 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_1_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_1(201, "CUSTOM_1", "CUSTOM_1"),

	/**
	 * The '<em><b>CUSTOM 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_2_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_2(202, "CUSTOM_2", "CUSTOM_2"),

	/**
	 * The '<em><b>CUSTOM 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_3_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_3(203, "CUSTOM_3", "CUSTOM_3"),

	/**
	 * The '<em><b>TECH 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECH_1_VALUE
	 * @generated
	 * @ordered
	 */
	TECH_1(301, "TECH_1", "TECH_1"),

	/**
	 * The '<em><b>TECH 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECH_2_VALUE
	 * @generated
	 * @ordered
	 */
	TECH_2(302, "TECH_2", "TECH_2"),

	/**
	 * The '<em><b>TECH 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECH_3_VALUE
	 * @generated
	 * @ordered
	 */
	TECH_3(303, "TECH_3", "TECH_3"),

	/**
	 * The '<em><b>TECH 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECH_4_VALUE
	 * @generated
	 * @ordered
	 */
	TECH_4(304, "TECH_4", "TECH_4"),

	/**
	 * The '<em><b>TECH 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECH_5_VALUE
	 * @generated
	 * @ordered
	 */
	TECH_5(305, "TECH_5", "TECH_5");

	/**
	 * The '<em><b>PLATF 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLATF 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATF_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLATF_1_VALUE = 101;

	/**
	 * The '<em><b>PLATF 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLATF 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATF_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLATF_2_VALUE = 102;

	/**
	 * The '<em><b>PLATF 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLATF 3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATF_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLATF_3_VALUE = 103;

	/**
	 * The '<em><b>PLATF 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLATF 4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATF_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLATF_4_VALUE = 104;

	/**
	 * The '<em><b>PLATF 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLATF 5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATF_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLATF_5_VALUE = 105;

	/**
	 * The '<em><b>CUSTOM 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_1_VALUE = 201;

	/**
	 * The '<em><b>CUSTOM 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_2_VALUE = 202;

	/**
	 * The '<em><b>CUSTOM 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM 3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_3_VALUE = 203;

	/**
	 * The '<em><b>TECH 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECH 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECH_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECH_1_VALUE = 301;

	/**
	 * The '<em><b>TECH 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECH 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECH_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECH_2_VALUE = 302;

	/**
	 * The '<em><b>TECH 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECH 3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECH_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECH_3_VALUE = 303;

	/**
	 * The '<em><b>TECH 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECH 4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECH_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECH_4_VALUE = 304;

	/**
	 * The '<em><b>TECH 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECH 5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECH_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECH_5_VALUE = 305;

	/**
	 * An array of all the '<em><b>Custom Cartridge ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CustomCartridgeID[] VALUES_ARRAY =
		new CustomCartridgeID[] {
			PLATF_1,
			PLATF_2,
			PLATF_3,
			PLATF_4,
			PLATF_5,
			CUSTOM_1,
			CUSTOM_2,
			CUSTOM_3,
			TECH_1,
			TECH_2,
			TECH_3,
			TECH_4,
			TECH_5,
		};

	/**
	 * A public read-only list of all the '<em><b>Custom Cartridge ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CustomCartridgeID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Custom Cartridge ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CustomCartridgeID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomCartridgeID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Custom Cartridge ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CustomCartridgeID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomCartridgeID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Custom Cartridge ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CustomCartridgeID get(int value) {
		switch (value) {
			case PLATF_1_VALUE: return PLATF_1;
			case PLATF_2_VALUE: return PLATF_2;
			case PLATF_3_VALUE: return PLATF_3;
			case PLATF_4_VALUE: return PLATF_4;
			case PLATF_5_VALUE: return PLATF_5;
			case CUSTOM_1_VALUE: return CUSTOM_1;
			case CUSTOM_2_VALUE: return CUSTOM_2;
			case CUSTOM_3_VALUE: return CUSTOM_3;
			case TECH_1_VALUE: return TECH_1;
			case TECH_2_VALUE: return TECH_2;
			case TECH_3_VALUE: return TECH_3;
			case TECH_4_VALUE: return TECH_4;
			case TECH_5_VALUE: return TECH_5;
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
	private CustomCartridgeID(int value, String name, String literal) {
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
	
} //CustomCartridgeID
