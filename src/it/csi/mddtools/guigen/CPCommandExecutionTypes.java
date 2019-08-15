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
 * A representation of the literals of the enumeration '<em><b>CP Command Execution Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getCPCommandExecutionTypes()
 * @model
 * @generated
 */
public enum CPCommandExecutionTypes implements Enumerator {
	/**
	 * The '<em><b>ON INIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito al primo ingresso nel content panel. Serve pertanto
	 * per l'inizializzazione del ContentPanel
	 * <!-- end-model-doc -->
	 * @see #ON_INIT_VALUE
	 * @generated
	 * @ordered
	 */
	ON_INIT(0, "ON_INIT", "ON_INIT"),

	/**
	 * The '<em><b>ON ENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito ad ogni ingresso nel content panel (proveniente da
	 * un a differente schermata). Serve pertanto per quei casi in cui sia
	 * necessaria una inizializzazione del ContentPanel che non possa essere effettuata
	 * una tantum, ma debba essere ripetuta ad ogni ingresso.
	 * <!-- end-model-doc -->
	 * @see #ON_ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	ON_ENTER(1, "ON_ENTER", "ON_ENTER"),

	/**
	 * The '<em><b>BEFORE EVENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito prima dell'esecuzione di ogni evento esplicito su uno dei
	 * widget della schermata. 
	 * <!-- end-model-doc -->
	 * @see #BEFORE_EVENTS_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_EVENTS(2, "BEFORE_EVENTS", "BEFORE_EVENTS"),

	/**
	 * The '<em><b>AFTER EVENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito al termine dell'esecuzione di ogni evento esplicito su uno dei
	 * widget della schermata (prima dell'eventuale cambio di schermata)
	 * <!-- end-model-doc -->
	 * @see #AFTER_EVENTS_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_EVENTS(3, "AFTER_EVENTS", "AFTER_EVENTS"),

	/**
	 * The '<em><b>ON REFRESH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito ad ogni refresh della schermata; se il refresh &egrave;
	 * scatenato da un evento su un widget, il comando viene eseguito prima dell'
	 * esecuzione ddell'evento. 
	 * <!-- end-model-doc -->
	 * @see #ON_REFRESH_VALUE
	 * @generated
	 * @ordered
	 */
	ON_REFRESH(4, "ON_REFRESH", "ON_REFRESH");

	/**
	 * The '<em><b>ON INIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito al primo ingresso nel content panel. Serve pertanto
	 * per l'inizializzazione del ContentPanel
	 * <!-- end-model-doc -->
	 * @see #ON_INIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_INIT_VALUE = 0;

	/**
	 * The '<em><b>ON ENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito ad ogni ingresso nel content panel (proveniente da
	 * un a differente schermata). Serve pertanto per quei casi in cui sia
	 * necessaria una inizializzazione del ContentPanel che non possa essere effettuata
	 * una tantum, ma debba essere ripetuta ad ogni ingresso.
	 * <!-- end-model-doc -->
	 * @see #ON_ENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_ENTER_VALUE = 1;

	/**
	 * The '<em><b>BEFORE EVENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito prima dell'esecuzione di ogni evento esplicito su uno dei
	 * widget della schermata. 
	 * <!-- end-model-doc -->
	 * @see #BEFORE_EVENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_EVENTS_VALUE = 2;

	/**
	 * The '<em><b>AFTER EVENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito al termine dell'esecuzione di ogni evento esplicito su uno dei
	 * widget della schermata (prima dell'eventuale cambio di schermata)
	 * <!-- end-model-doc -->
	 * @see #AFTER_EVENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_EVENTS_VALUE = 3;

	/**
	 * The '<em><b>ON REFRESH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il comando viene eseguito ad ogni refresh della schermata; se il refresh &egrave;
	 * scatenato da un evento su un widget, il comando viene eseguito prima dell'
	 * esecuzione ddell'evento. 
	 * <!-- end-model-doc -->
	 * @see #ON_REFRESH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_REFRESH_VALUE = 4;

	/**
	 * An array of all the '<em><b>CP Command Execution Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPCommandExecutionTypes[] VALUES_ARRAY =
		new CPCommandExecutionTypes[] {
			ON_INIT,
			ON_ENTER,
			BEFORE_EVENTS,
			AFTER_EVENTS,
			ON_REFRESH,
		};

	/**
	 * A public read-only list of all the '<em><b>CP Command Execution Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPCommandExecutionTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CP Command Execution Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPCommandExecutionTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCommandExecutionTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CP Command Execution Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPCommandExecutionTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCommandExecutionTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CP Command Execution Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPCommandExecutionTypes get(int value) {
		switch (value) {
			case ON_INIT_VALUE: return ON_INIT;
			case ON_ENTER_VALUE: return ON_ENTER;
			case BEFORE_EVENTS_VALUE: return BEFORE_EVENTS;
			case AFTER_EVENTS_VALUE: return AFTER_EVENTS;
			case ON_REFRESH_VALUE: return ON_REFRESH;
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
	private CPCommandExecutionTypes(int value, String name, String literal) {
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
	
} //CPCommandExecutionTypes
