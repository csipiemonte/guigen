/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
 * A representation of the literals of the enumeration '<em><b>Wizard Numbering Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getWizardNumberingTypes()
 * @model
 * @generated
 */
public enum WizardNumberingTypes implements Enumerator {
	/**
	 * The '<em><b>NO NUMBERING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_NUMBERING_VALUE
	 * @generated
	 * @ordered
	 */
	NO_NUMBERING(0, "NO_NUMBERING", "NO_NUMBERING"),

	/**
	 * The '<em><b>ARABIC NUMERALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARABIC_NUMERALS_VALUE
	 * @generated
	 * @ordered
	 */
	ARABIC_NUMERALS(1, "ARABIC_NUMERALS", "ARABIC_NUMERALS"),

	/**
	 * The '<em><b>LOWERCASE ALPHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	LOWERCASE_ALPHA(2, "LOWERCASE_ALPHA", "LOWERCASE_ALPHA"),

	/**
	 * The '<em><b>UPPERCASE ALPHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE_ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	UPPERCASE_ALPHA(3, "UPPERCASE_ALPHA", "UPPERCASE_ALPHA"),

	/**
	 * The '<em><b>UPPERCASE ROMAN NUMERALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE_ROMAN_NUMERALS_VALUE
	 * @generated
	 * @ordered
	 */
	UPPERCASE_ROMAN_NUMERALS(4, "UPPERCASE_ROMAN_NUMERALS", "UPPERCASE_ROMAN_NUMERALS"),

	/**
	 * The '<em><b>LOWERCASE ROMAN NUMERALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_ROMAN_NUMERALS_VALUE
	 * @generated
	 * @ordered
	 */
	LOWERCASE_ROMAN_NUMERALS(5, "LOWERCASE_ROMAN_NUMERALS", "LOWERCASE_ROMAN_NUMERALS");

	/**
	 * The '<em><b>NO NUMBERING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO NUMBERING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_NUMBERING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_NUMBERING_VALUE = 0;

	/**
	 * The '<em><b>ARABIC NUMERALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARABIC NUMERALS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARABIC_NUMERALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARABIC_NUMERALS_VALUE = 1;

	/**
	 * The '<em><b>LOWERCASE ALPHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWERCASE ALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_ALPHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWERCASE_ALPHA_VALUE = 2;

	/**
	 * The '<em><b>UPPERCASE ALPHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPPERCASE ALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE_ALPHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPERCASE_ALPHA_VALUE = 3;

	/**
	 * The '<em><b>UPPERCASE ROMAN NUMERALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPPERCASE ROMAN NUMERALS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE_ROMAN_NUMERALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPERCASE_ROMAN_NUMERALS_VALUE = 4;

	/**
	 * The '<em><b>LOWERCASE ROMAN NUMERALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWERCASE ROMAN NUMERALS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_ROMAN_NUMERALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWERCASE_ROMAN_NUMERALS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Wizard Numbering Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WizardNumberingTypes[] VALUES_ARRAY =
		new WizardNumberingTypes[] {
			NO_NUMBERING,
			ARABIC_NUMERALS,
			LOWERCASE_ALPHA,
			UPPERCASE_ALPHA,
			UPPERCASE_ROMAN_NUMERALS,
			LOWERCASE_ROMAN_NUMERALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Wizard Numbering Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WizardNumberingTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wizard Numbering Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WizardNumberingTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WizardNumberingTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wizard Numbering Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WizardNumberingTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WizardNumberingTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wizard Numbering Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WizardNumberingTypes get(int value) {
		switch (value) {
			case NO_NUMBERING_VALUE: return NO_NUMBERING;
			case ARABIC_NUMERALS_VALUE: return ARABIC_NUMERALS;
			case LOWERCASE_ALPHA_VALUE: return LOWERCASE_ALPHA;
			case UPPERCASE_ALPHA_VALUE: return UPPERCASE_ALPHA;
			case UPPERCASE_ROMAN_NUMERALS_VALUE: return UPPERCASE_ROMAN_NUMERALS;
			case LOWERCASE_ROMAN_NUMERALS_VALUE: return LOWERCASE_ROMAN_NUMERALS;
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
	private WizardNumberingTypes(int value, String name, String literal) {
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
	
} //WizardNumberingTypes
