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
 * A representation of the literals of the enumeration '<em><b>Portal Names</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getPortalNames()
 * @model
 * @generated
 */
public enum PortalNames implements Enumerator {
	/**
	 * The '<em><b>SISTEMA PIEMONTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISTEMA_PIEMONTE_VALUE
	 * @generated
	 * @ordered
	 */
	SISTEMA_PIEMONTE(0, "SISTEMA_PIEMONTE", "SISTEMA_PIEMONTE"),

	/**
	 * The '<em><b>INTRANET RUPARPIEMONTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRANET_RUPARPIEMONTE_VALUE
	 * @generated
	 * @ordered
	 */
	INTRANET_RUPARPIEMONTE(1, "INTRANET_RUPARPIEMONTE", "INTRANET_RUPARPIEMONTE");

	/**
	 * The '<em><b>SISTEMA PIEMONTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SISTEMA PIEMONTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SISTEMA_PIEMONTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SISTEMA_PIEMONTE_VALUE = 0;

	/**
	 * The '<em><b>INTRANET RUPARPIEMONTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTRANET RUPARPIEMONTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTRANET_RUPARPIEMONTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTRANET_RUPARPIEMONTE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Portal Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortalNames[] VALUES_ARRAY =
		new PortalNames[] {
			SISTEMA_PIEMONTE,
			INTRANET_RUPARPIEMONTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Portal Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PortalNames> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Portal Names</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortalNames get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortalNames result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Portal Names</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortalNames getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortalNames result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Portal Names</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortalNames get(int value) {
		switch (value) {
			case SISTEMA_PIEMONTE_VALUE: return SISTEMA_PIEMONTE;
			case INTRANET_RUPARPIEMONTE_VALUE: return INTRANET_RUPARPIEMONTE;
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
	private PortalNames(int value, String name, String literal) {
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
	
} //PortalNames