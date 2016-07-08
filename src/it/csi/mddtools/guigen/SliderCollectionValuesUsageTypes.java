/**
 */
package it.csi.mddtools.guigen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Slider Collection Values Usage Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getSliderCollectionValuesUsageTypes()
 * @model
 * @generated
 */
public enum SliderCollectionValuesUsageTypes implements Enumerator {
	/**
	 * The '<em><b>RANGE BOUNDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_BOUNDS_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE_BOUNDS(0, "RANGE_BOUNDS", "RANGE_BOUNDS"),

	/**
	 * The '<em><b>DISCRETE VALUES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETE_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETE_VALUES(1, "DISCRETE_VALUES", "DISCRETE_VALUES");

	/**
	 * The '<em><b>RANGE BOUNDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RANGE BOUNDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANGE_BOUNDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_BOUNDS_VALUE = 0;

	/**
	 * The '<em><b>DISCRETE VALUES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCRETE VALUES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCRETE_VALUES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUES_VALUE = 1;

	/**
	 * An array of all the '<em><b>Slider Collection Values Usage Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SliderCollectionValuesUsageTypes[] VALUES_ARRAY =
		new SliderCollectionValuesUsageTypes[] {
			RANGE_BOUNDS,
			DISCRETE_VALUES,
		};

	/**
	 * A public read-only list of all the '<em><b>Slider Collection Values Usage Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SliderCollectionValuesUsageTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Slider Collection Values Usage Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SliderCollectionValuesUsageTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SliderCollectionValuesUsageTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Slider Collection Values Usage Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SliderCollectionValuesUsageTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SliderCollectionValuesUsageTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Slider Collection Values Usage Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SliderCollectionValuesUsageTypes get(int value) {
		switch (value) {
			case RANGE_BOUNDS_VALUE: return RANGE_BOUNDS;
			case DISCRETE_VALUES_VALUE: return DISCRETE_VALUES;
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
	private SliderCollectionValuesUsageTypes(int value, String name, String literal) {
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
	
} //SliderCollectionValuesUsageTypes
