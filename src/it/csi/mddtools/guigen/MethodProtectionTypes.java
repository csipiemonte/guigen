/**
 * <copyright>
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
 * A representation of the literals of the enumeration '<em><b>Method Protection Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getMethodProtectionTypes()
 * @model
 * @generated
 */
public enum MethodProtectionTypes implements Enumerator {
	/**
	 * The '<em><b>REJECT SAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_SAME_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_SAME(1, "REJECT_SAME", "REJECT_SAME"),

	/**
	 * The '<em><b>ALLOW ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW_ALL(0, "ALLOW_ALL", "ALLOW_ALL"),

	/**
	 * The '<em><b>REJECT ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_ALL(2, "REJECT_ALL", "REJECT_ALL");

	/**
	 * The '<em><b>REJECT SAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REJECT SAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_SAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_SAME_VALUE = 1;

	/**
	 * The '<em><b>ALLOW ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOW ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOW_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_ALL_VALUE = 0;

	/**
	 * The '<em><b>REJECT ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REJECT ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_ALL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Method Protection Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MethodProtectionTypes[] VALUES_ARRAY =
		new MethodProtectionTypes[] {
			REJECT_SAME,
			ALLOW_ALL,
			REJECT_ALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Method Protection Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MethodProtectionTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Method Protection Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodProtectionTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodProtectionTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Protection Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodProtectionTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodProtectionTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Protection Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodProtectionTypes get(int value) {
		switch (value) {
			case REJECT_SAME_VALUE: return REJECT_SAME;
			case ALLOW_ALL_VALUE: return ALLOW_ALL;
			case REJECT_ALL_VALUE: return REJECT_ALL;
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
	private MethodProtectionTypes(int value, String name, String literal) {
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
	
} //MethodProtectionTypes