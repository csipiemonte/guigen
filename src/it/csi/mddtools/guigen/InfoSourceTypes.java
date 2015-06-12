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
 * A representation of the literals of the enumeration '<em><b>Info Source Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getInfoSourceTypes()
 * @model
 * @generated
 */
public enum InfoSourceTypes implements Enumerator {
	/**
	 * The '<em><b>REQUEST PARAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_PARAM_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_PARAM(1, "REQUEST_PARAM", "REQUEST_PARAM"),

	/**
	 * The '<em><b>REQUEST HEADER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_HEADER(2, "REQUEST_HEADER", "REQUEST_HEADER"),

	/**
	 * The '<em><b>REQUEST COOKIE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_COOKIE_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_COOKIE(3, "REQUEST_COOKIE", "REQUEST_COOKIE"),

	/**
	 * The '<em><b>SESSION ATTRIBUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SESSION_ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	SESSION_ATTRIBUTE(5, "SESSION_ATTRIBUTE", "SESSION_ATTRIBUTE"),

	/**
	 * The '<em><b>REQUEST ATTRIBUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_ATTRIBUTE(4, "REQUEST_ATTRIBUTE", "REQUEST_ATTRIBUTE"), /**
	 * The '<em><b>REQUEST URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_URL_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_URL(6, "REQUEST_URL", "REQUEST_URL");

	/**
	 * The '<em><b>REQUEST PARAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST PARAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_PARAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_PARAM_VALUE = 1;

	/**
	 * The '<em><b>REQUEST HEADER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST HEADER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_HEADER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_HEADER_VALUE = 2;

	/**
	 * The '<em><b>REQUEST COOKIE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST COOKIE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_COOKIE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_COOKIE_VALUE = 3;

	/**
	 * The '<em><b>SESSION ATTRIBUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SESSION ATTRIBUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SESSION_ATTRIBUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SESSION_ATTRIBUTE_VALUE = 5;

	/**
	 * The '<em><b>REQUEST ATTRIBUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST ATTRIBUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_ATTRIBUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_ATTRIBUTE_VALUE = 4;

	/**
	 * The '<em><b>REQUEST URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST URL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_URL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_URL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Info Source Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InfoSourceTypes[] VALUES_ARRAY =
		new InfoSourceTypes[] {
			REQUEST_PARAM,
			REQUEST_HEADER,
			REQUEST_COOKIE,
			SESSION_ATTRIBUTE,
			REQUEST_ATTRIBUTE,
			REQUEST_URL,
		};

	/**
	 * A public read-only list of all the '<em><b>Info Source Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InfoSourceTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Info Source Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfoSourceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfoSourceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Info Source Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfoSourceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfoSourceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Info Source Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfoSourceTypes get(int value) {
		switch (value) {
			case REQUEST_PARAM_VALUE: return REQUEST_PARAM;
			case REQUEST_HEADER_VALUE: return REQUEST_HEADER;
			case REQUEST_COOKIE_VALUE: return REQUEST_COOKIE;
			case SESSION_ATTRIBUTE_VALUE: return SESSION_ATTRIBUTE;
			case REQUEST_ATTRIBUTE_VALUE: return REQUEST_ATTRIBUTE;
			case REQUEST_URL_VALUE: return REQUEST_URL;
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
	private InfoSourceTypes(int value, String name, String literal) {
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
	
} //InfoSourceTypes
