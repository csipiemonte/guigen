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
 * A representation of the literals of the enumeration '<em><b>Tree Selection Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Determina il tipo di selezione permessa sull'albero:
 * <ul>
 * <li>solo sui nodi foglia</li>
 * <li>solo sui nodi non foglia</li>
 * <li>su tutti i nodi</li>
 * </ul>
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getTreeSelectionTypes()
 * @model
 * @generated
 */
public enum TreeSelectionTypes implements Enumerator {
	/**
	 * The '<em><b>ALL NODES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_NODES_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_NODES(0, "ALL_NODES", "ALL_NODES"),

	/**
	 * The '<em><b>LEAF NODES ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAF_NODES_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LEAF_NODES_ONLY(1, "LEAF_NODES_ONLY", "LEAF_NODES_ONLY"),

	/**
	 * The '<em><b>NON LEAF NODES ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_LEAF_NODES_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	NON_LEAF_NODES_ONLY(2, "NON_LEAF_NODES_ONLY", "NON_LEAF_NODES_ONLY");

	/**
	 * The '<em><b>ALL NODES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL NODES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_NODES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_NODES_VALUE = 0;

	/**
	 * The '<em><b>LEAF NODES ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEAF NODES ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAF_NODES_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_NODES_ONLY_VALUE = 1;

	/**
	 * The '<em><b>NON LEAF NODES ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NON LEAF NODES ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_LEAF_NODES_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_LEAF_NODES_ONLY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tree Selection Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TreeSelectionTypes[] VALUES_ARRAY =
		new TreeSelectionTypes[] {
			ALL_NODES,
			LEAF_NODES_ONLY,
			NON_LEAF_NODES_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Tree Selection Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TreeSelectionTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tree Selection Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreeSelectionTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TreeSelectionTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tree Selection Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreeSelectionTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TreeSelectionTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tree Selection Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreeSelectionTypes get(int value) {
		switch (value) {
			case ALL_NODES_VALUE: return ALL_NODES;
			case LEAF_NODES_ONLY_VALUE: return LEAF_NODES_ONLY;
			case NON_LEAF_NODES_ONLY_VALUE: return NON_LEAF_NODES_ONLY;
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
	private TreeSelectionTypes(int value, String name, String literal) {
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
	
} //TreeSelectionTypes
