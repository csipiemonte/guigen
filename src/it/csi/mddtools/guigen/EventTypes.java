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
 * A representation of the literals of the enumeration '<em><b>Event Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * tipologie di eventi a cui &egrave; possibile associare un event handler.
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getEventTypes()
 * @model annotation="logicpkg pkg='ui.event'"
 * @generated
 */
public enum EventTypes implements Enumerator {
	/**
	 * The '<em><b>CLICKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLICKED_VALUE
	 * @generated
	 * @ordered
	 */
	CLICKED(0, "CLICKED", "CLICKED"),

	/**
	 * The '<em><b>VALUE CHANGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_CHANGED(1, "VALUE_CHANGED", "VALUE_CHANGED"),

	/**
	 * The '<em><b>FOCUS GAINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOCUS_GAINED_VALUE
	 * @generated
	 * @ordered
	 */
	FOCUS_GAINED(2, "FOCUS_GAINED", "FOCUS_GAINED"),

	/**
	 * The '<em><b>FOCUS LOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOCUS_LOST_VALUE
	 * @generated
	 * @ordered
	 */
	FOCUS_LOST(3, "FOCUS_LOST", "FOCUS_LOST"), /**
	 * The '<em><b>KEY PRESSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_PRESSED_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_PRESSED(4, "KEY_PRESSED", "KEY_PRESSED"), /**
	 * The '<em><b>NODE EXPANDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_EXPANDED_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_EXPANDED(5, "NODE_EXPANDED", "NODE_EXPANDED"), /**
	 * The '<em><b>EDIT COMMITTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDIT_COMMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT_COMMITTED(5, "EDIT_COMMITTED", "EDIT_COMMITTED");

	/**
	 * The '<em><b>CLICKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLICKED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evento di click su un controllo. Esempi:
	 * <ul>
	 * <li>la pressione di un <b>ConfirmButton</b></li>
	 * <li>il click su una voce di <b>Menu</b></li>
	 * <li>il click su una cella in una <b>Table</b></li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @see #CLICKED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLICKED_VALUE = 0;

	/**
	 * The '<em><b>VALUE CHANGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VALUE CHANGED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evento che modifica il vlaore di un controllo. Esempi:
	 * <ul>
	 * <li>la selezione di una voce d una <b>ComboBox</b></li>
	 * <li>il click su un <b>RadioButton</b></li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @see #VALUE_CHANGED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_CHANGED_VALUE = 1;

	/**
	 * The '<em><b>FOCUS GAINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOCUS GAINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rappresenta l'acquisizione del focus d aparte di un controllo.
	 * PER FUTURE EVOLUZIONI.
	 * <!-- end-model-doc -->
	 * @see #FOCUS_GAINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOCUS_GAINED_VALUE = 2;

	/**
	 * The '<em><b>FOCUS LOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOCUS LOST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rappresenta la perdita del focus d aparte di un controllo.
	 * PER FUTURE EVOLUZIONI.
	 * <!-- end-model-doc -->
	 * @see #FOCUS_LOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOCUS_LOST_VALUE = 3;

	/**
	 * The '<em><b>KEY PRESSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEY PRESSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEY_PRESSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEY_PRESSED_VALUE = 4;

	/**
	 * The '<em><b>NODE EXPANDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rappresenta l'evento di apertura di un nodo in un Tree (applicabile solo a
	 * <b>TreeView</b>)
	 * <!-- end-model-doc -->
	 * @see #NODE_EXPANDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODE_EXPANDED_VALUE = 5;

	/**
	 * The '<em><b>EDIT COMMITTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rappresenta l'evento di conferma di un'attivit&agrave; di editing complesso.
	 * Valido solo per <b>MapView</b>: serve per recepire le modifiche effettuate
	 * sulla mappa.
	 * <!-- end-model-doc -->
	 * @see #EDIT_COMMITTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_COMMITTED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Event Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventTypes[] VALUES_ARRAY =
		new EventTypes[] {
			CLICKED,
			VALUE_CHANGED,
			FOCUS_GAINED,
			FOCUS_LOST,
			KEY_PRESSED,
			NODE_EXPANDED,
			EDIT_COMMITTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventTypes get(int value) {
		switch (value) {
			case CLICKED_VALUE: return CLICKED;
			case VALUE_CHANGED_VALUE: return VALUE_CHANGED;
			case FOCUS_GAINED_VALUE: return FOCUS_GAINED;
			case FOCUS_LOST_VALUE: return FOCUS_LOST;
			case KEY_PRESSED_VALUE: return KEY_PRESSED;
			case NODE_EXPANDED_VALUE: return NODE_EXPANDED;
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
	private EventTypes(int value, String name, String literal) {
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
	
} //EventTypes
