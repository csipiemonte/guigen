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
 * A representation of the literals of the enumeration '<em><b>Command Functions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getCommandFunctions()
 * @model annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public enum CommandFunctions implements Enumerator {
	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "UNSPECIFIED", "UNSPECIFIED"),

	/**
	 * The '<em><b>ADD ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_ITEM(101, "ADD_ITEM", "ADD_ITEM"),

	/**
	 * The '<em><b>EDIT ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDIT_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT_ITEM(102, "EDIT_ITEM", "EDIT_ITEM"),

	/**
	 * The '<em><b>DELETE ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE_ITEM(103, "DELETE_ITEM", "DELETE_ITEM"),

	/**
	 * The '<em><b>SEARCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH(104, "SEARCH", "SEARCH"),

	/**
	 * The '<em><b>SAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	SAVE(105, "SAVE", "SAVE"),

	/**
	 * The '<em><b>LOAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD(106, "LOAD", "LOAD"),

	/**
	 * The '<em><b>DETAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	DETAIL(107, "DETAIL", "DETAIL"),

	/**
	 * The '<em><b>LOOKUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOKUP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOKUP(108, "LOOKUP", "LOOKUP"), /**
	 * The '<em><b>NEXT ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_ITEM(201, "NEXT_ITEM", "NEXT_ITEM"),

	/**
	 * The '<em><b>PREVIOUS ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUS_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUS_ITEM(202, "PREVIOUS_ITEM", "PREVIOUS_ITEM"),

	/**
	 * The '<em><b>FIRST ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_ITEM(203, "FIRST_ITEM", "FIRST_ITEM"),

	/**
	 * The '<em><b>LAST ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_ITEM(204, "LAST_ITEM", "LAST_ITEM"),

	/**
	 * The '<em><b>CONFIRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRM_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRM(301, "CONFIRM", "CONFIRM"),

	/**
	 * The '<em><b>CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(302, "CANCEL", "CANCEL"),

	/**
	 * The '<em><b>FORWARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORWARD_VALUE
	 * @generated
	 * @ordered
	 */
	FORWARD(401, "FORWARD", "FORWARD"),

	/**
	 * The '<em><b>BACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACK_VALUE
	 * @generated
	 * @ordered
	 */
	BACK(402, "BACK", "BACK"),

	/**
	 * The '<em><b>SHOW REPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOW_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHOW_REPORT(501, "SHOW_REPORT", "SHOW_REPORT"), /**
	 * The '<em><b>SHOW HELP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOW_HELP_VALUE
	 * @generated
	 * @ordered
	 */
	SHOW_HELP(502, "SHOW_HELP", "SHOW_HELP"),

	/**
	 * The '<em><b>SEND MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEND_MESSAGE(503, "SEND_MESSAGE", "SEND_MESSAGE");

	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSPECIFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>ADD ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_ITEM_VALUE = 101;

	/**
	 * The '<em><b>EDIT ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EDIT ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDIT_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_ITEM_VALUE = 102;

	/**
	 * The '<em><b>DELETE ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETE ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_ITEM_VALUE = 103;

	/**
	 * The '<em><b>SEARCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEARCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_VALUE = 104;

	/**
	 * The '<em><b>SAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAVE_VALUE = 105;

	/**
	 * The '<em><b>LOAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_VALUE = 106;

	/**
	 * The '<em><b>DETAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETAIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETAIL_VALUE = 107;

	/**
	 * The '<em><b>LOOKUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOOKUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOKUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOOKUP_VALUE = 108;

	/**
	 * The '<em><b>NEXT ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEXT ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_ITEM_VALUE = 201;

	/**
	 * The '<em><b>PREVIOUS ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREVIOUS ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREVIOUS_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUS_ITEM_VALUE = 202;

	/**
	 * The '<em><b>FIRST ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRST ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_ITEM_VALUE = 203;

	/**
	 * The '<em><b>LAST ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAST ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAST_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_ITEM_VALUE = 204;

	/**
	 * The '<em><b>CONFIRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIRM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIRM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRM_VALUE = 301;

	/**
	 * The '<em><b>CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 302;

	/**
	 * The '<em><b>FORWARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORWARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORWARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORWARD_VALUE = 401;

	/**
	 * The '<em><b>BACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BACK_VALUE = 402;

	/**
	 * The '<em><b>SHOW REPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHOW REPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOW_REPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHOW_REPORT_VALUE = 501;

	/**
	 * The '<em><b>SHOW HELP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHOW HELP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOW_HELP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHOW_HELP_VALUE = 502;

	/**
	 * The '<em><b>SEND MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEND MESSAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND_MESSAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEND_MESSAGE_VALUE = 503;

	/**
	 * An array of all the '<em><b>Command Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CommandFunctions[] VALUES_ARRAY =
		new CommandFunctions[] {
			UNSPECIFIED,
			ADD_ITEM,
			EDIT_ITEM,
			DELETE_ITEM,
			SEARCH,
			SAVE,
			LOAD,
			DETAIL,
			LOOKUP,
			NEXT_ITEM,
			PREVIOUS_ITEM,
			FIRST_ITEM,
			LAST_ITEM,
			CONFIRM,
			CANCEL,
			FORWARD,
			BACK,
			SHOW_REPORT,
			SHOW_HELP,
			SEND_MESSAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Command Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CommandFunctions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Command Functions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandFunctions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommandFunctions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Command Functions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandFunctions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommandFunctions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Command Functions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandFunctions get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case ADD_ITEM_VALUE: return ADD_ITEM;
			case EDIT_ITEM_VALUE: return EDIT_ITEM;
			case DELETE_ITEM_VALUE: return DELETE_ITEM;
			case SEARCH_VALUE: return SEARCH;
			case SAVE_VALUE: return SAVE;
			case LOAD_VALUE: return LOAD;
			case DETAIL_VALUE: return DETAIL;
			case LOOKUP_VALUE: return LOOKUP;
			case NEXT_ITEM_VALUE: return NEXT_ITEM;
			case PREVIOUS_ITEM_VALUE: return PREVIOUS_ITEM;
			case FIRST_ITEM_VALUE: return FIRST_ITEM;
			case LAST_ITEM_VALUE: return LAST_ITEM;
			case CONFIRM_VALUE: return CONFIRM;
			case CANCEL_VALUE: return CANCEL;
			case FORWARD_VALUE: return FORWARD;
			case BACK_VALUE: return BACK;
			case SHOW_REPORT_VALUE: return SHOW_REPORT;
			case SHOW_HELP_VALUE: return SHOW_HELP;
			case SEND_MESSAGE_VALUE: return SEND_MESSAGE;
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
	private CommandFunctions(int value, String name, String literal) {
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
	
} //CommandFunctions
