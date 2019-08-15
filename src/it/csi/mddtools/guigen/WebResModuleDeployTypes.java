/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
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
 * A representation of the literals of the enumeration '<em><b>Web Res Module Deploy Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Possibili tipologie di <i>deploy</i> del modulo (e degli artefatti corrispondenti)
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getWebResModuleDeployTypes()
 * @model
 * @generated
 */
public enum WebResModuleDeployTypes implements Enumerator {
	/**
	 * The '<em><b>APPSERVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli artefatti relativi al modulo sono contenuti nel pacchetto applicativo
	 * che sarà installato nell'application server (es. nell'EAR)
	 * <!-- end-model-doc -->
	 * @see #APPSERVER_VALUE
	 * @generated
	 * @ordered
	 */
	APPSERVER(0, "APPSERVER", "APPSERVER"),

	/**
	 * The '<em><b>WEBSERVER GLOBAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli artefatti relativi al modulo sono referenziati in una cartella del 
	 * <i>web server</i> che espone l'applicazione che è disponibile con ciclo
	 * di vita indipendente dall'applicazione (cartella globale)
	 * <!-- end-model-doc -->
	 * @see #WEBSERVER_GLOBAL_VALUE
	 * @generated
	 * @ordered
	 */
	WEBSERVER_GLOBAL(0, "WEBSERVER_GLOBAL", "WEBSERVER_GLOBAL"),

	/**
	 * The '<em><b>WEBSERVER LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli artefatti relativi al modulo sono installati e in una cartella del 
	 * <i>web server</i> che espone l'applicazione. La cartella segue il
	 * ciclo di vita dell'applicazione (cartella locale). Le risorse sono poi 
	 * referenziate dalle componenti applicative puntando a quella
	 * cartella
	 * <!-- end-model-doc -->
	 * @see #WEBSERVER_LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	WEBSERVER_LOCAL(0, "WEBSERVER_LOCAL", "WEBSERVER_LOCAL");

	/**
	 * The '<em><b>APPSERVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPSERVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli artefatti relativi al modulo sono contenuti nel pacchetto applicativo
	 * che sarà installato nell'application server (es. nell'EAR)
	 * <!-- end-model-doc -->
	 * @see #APPSERVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPSERVER_VALUE = 0;

	/**
	 * The '<em><b>WEBSERVER GLOBAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEBSERVER GLOBAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli artefatti relativi al modulo sono referenziati in una cartella del 
	 * <i>web server</i> che espone l'applicazione che è disponibile con ciclo
	 * di vita indipendente dall'applicazione (cartella globale)
	 * <!-- end-model-doc -->
	 * @see #WEBSERVER_GLOBAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEBSERVER_GLOBAL_VALUE = 0;

	/**
	 * The '<em><b>WEBSERVER LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEBSERVER LOCAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gli artefatti relativi al modulo sono installati e in una cartella del 
	 * <i>web server</i> che espone l'applicazione. La cartella segue il
	 * ciclo di vita dell'applicazione (cartella locale). Le risorse sono poi 
	 * referenziate dalle componenti applicative puntando a quella
	 * cartella
	 * <!-- end-model-doc -->
	 * @see #WEBSERVER_LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEBSERVER_LOCAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Web Res Module Deploy Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WebResModuleDeployTypes[] VALUES_ARRAY =
		new WebResModuleDeployTypes[] {
			APPSERVER,
			WEBSERVER_GLOBAL,
			WEBSERVER_LOCAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Web Res Module Deploy Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WebResModuleDeployTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Web Res Module Deploy Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebResModuleDeployTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WebResModuleDeployTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Web Res Module Deploy Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebResModuleDeployTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WebResModuleDeployTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Web Res Module Deploy Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebResModuleDeployTypes get(int value) {
		switch (value) {
			case APPSERVER_VALUE: return APPSERVER;
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
	private WebResModuleDeployTypes(int value, String name, String literal) {
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
	
} //WebResModuleDeployTypes
