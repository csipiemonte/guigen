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
 * A representation of the literals of the enumeration '<em><b>Logout Action Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getLogoutActionTypes()
 * @model
 * @generated
 */
public enum LogoutActionTypes implements Enumerator {
	/**
	 * The '<em><b>LOCAL LOGOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_LOGOUT_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_LOGOUT(0, "LOCAL_LOGOUT", "LOCAL_LOGOUT"),

	/**
	 * The '<em><b>SSO LOGOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSO_LOGOUT_VALUE
	 * @generated
	 * @ordered
	 */
	SSO_LOGOUT(1, "SSO_LOGOUT", "SSO_LOGOUT");

	/**
	 * The '<em><b>LOCAL LOGOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCAL LOGOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_LOGOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_LOGOUT_VALUE = 0;

	/**
	 * The '<em><b>SSO LOGOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SSO LOGOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SSO_LOGOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SSO_LOGOUT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Logout Action Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogoutActionTypes[] VALUES_ARRAY =
		new LogoutActionTypes[] {
			LOCAL_LOGOUT,
			SSO_LOGOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Logout Action Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LogoutActionTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Logout Action Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogoutActionTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogoutActionTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logout Action Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogoutActionTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogoutActionTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logout Action Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogoutActionTypes get(int value) {
		switch (value) {
			case LOCAL_LOGOUT_VALUE: return LOCAL_LOGOUT;
			case SSO_LOGOUT_VALUE: return SSO_LOGOUT;
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
	private LogoutActionTypes(int value, String name, String literal) {
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
	
} //LogoutActionTypes
