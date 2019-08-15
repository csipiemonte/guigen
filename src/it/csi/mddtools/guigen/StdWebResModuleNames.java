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
 * A representation of the literals of the enumeration '<em><b>Std Web Res Module Names</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Moduli standard di risorse web
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.guigen.GuigenPackage#getStdWebResModuleNames()
 * @model
 * @generated
 */
public enum StdWebResModuleNames implements Enumerator {
	/**
	 * The '<em><b>Ext all</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>ExtJs</i>, utilizzata per la realizzazione delle funzioni 
	 * &quot;ricche&quot;.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXT_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	EXT_ALL(101, "ext_all", "ext_all"),

	/**
	 * The '<em><b>Openlayers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>OpenLayers</i>, utilizzata per la realizzazione 
	 * delle funzionalit&agrave; GIS (widget <b>MapView</b>).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #OPENLAYERS_VALUE
	 * @generated
	 * @ordered
	 */
	OPENLAYERS(102, "openlayers", "openlayers"),

	/**
	 * The '<em><b>Extjscsicore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>extjscsicore</i> (estensione di ExtJS per la
	 * realizzazione di widget/funzioni ricche utilizzate dalla modalit&agrave;
	 * <i>arricchita</i> di guigen).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTJSCSICORE_VALUE
	 * @generated
	 * @ordered
	 */
	EXTJSCSICORE(201, "extjscsicore", "extjscsicore"),

	/**
	 * The '<em><b>Extjscsienricher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>extjscsienricher</i> (estensione di ExtJS per la
	 * realizzazione del meccanismo di <i>arricchimento</i> disponibile in guigen).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTJSCSIENRICHER_VALUE
	 * @generated
	 * @ordered
	 */
	EXTJSCSIENRICHER(202, "extjscsienricher", "extjscsienricher"),

	/**
	 * The '<em><b>Extjscsimdd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>extjscsimdd</i> (estensione di ExtJS per la
	 * realizzazione dello strato completo di presentation in modalit&agrave;
	 * <i>FAT</i> di guigen).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTJSCSIMDD_VALUE
	 * @generated
	 * @ordered
	 */
	EXTJSCSIMDD(203, "extjscsimdd", "extjscsimdd"),

	/**
	 * The '<em><b>Extlibstheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione di base delle estensioni alla user interface fornite dalla libreria
	 * <i>ExtJS</i>.
	 * E' specifica di ogni portale.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTLIBSTHEME_VALUE
	 * @generated
	 * @ordered
	 */
	EXTLIBSTHEME(301, "extlibstheme", "extlibstheme"), /**
	 * The '<em><b>Xstructure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impostazione della struttura portante necessaria per realizzare
	 * i vari tipi di layout per XHTML universale.
	 * E' specifica di ogni portale.
	 * Tipologia: stili CSS.
	 * <!-- end-model-doc -->
	 * @see #XSTRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	XSTRUCTURE(302, "xstructure", "xstructure"),

	/**
	 * The '<em><b>Areabrand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione specifica della singola area tematica atta a realizzarne il
	 * <i>brand></i>.
	 * Agisce come specializzazione di <i>xstructure</i>.
	 * E' specifica di ogni portale e di ogni area tematica. Anche l'area tematica
	 * di default (general) deve essere stilizzata in questo modo.
	 * Tipologia: stili CSS.
	 * <!-- end-model-doc -->
	 * @see #AREABRAND_VALUE
	 * @generated
	 * @ordered
	 */
	AREABRAND(303, "areabrand", "areabrand"),

	/**
	 * The '<em><b>Extlibsareabrand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione specifica della singola area tematica atta a realizzarne il
	 * <i>brand></i>.
	 * Agisce come specializzazione di quanto definito in <i>xtheme</i>.
	 * E' specifica di ogni portale e di ogni area tematica. Anche l'area tematica
	 * di default (general) deve essere stilizzata in questo modo.
	 * Tipologia: stili css
	 * <!-- end-model-doc -->
	 * @see #EXTLIBSAREABRAND_VALUE
	 * @generated
	 * @ordered
	 */
	EXTLIBSAREABRAND(304, "extlibsareabrand", "extlibsareabrand"), /**
	 * The '<em><b>Openlayerstheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione di base delle estensioni alla user interface fornite dalla libreria
	 * <i>OPENLAYERS</i>.
	 * E' specifica di ogni portale.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #OPENLAYERSTHEME_VALUE
	 * @generated
	 * @ordered
	 */
	OPENLAYERSTHEME(305, "openlayerstheme", "openlayerstheme"), /**
	 * The '<em><b>Openlayersareabrand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione specifica della singola area tematica atta a realizzarne il
	 * <i>brand></i>.
	 * Agisce come specializzazione di quanto definito in <i>openlayerstheme</i>.
	 * E' specifica di ogni portale e di ogni area tematica. Anche l'area tematica
	 * di default (general) deve essere stilizzata in questo modo.
	 * Tipologia: stili css
	 * <!-- end-model-doc -->
	 * @see #OPENLAYERSAREABRAND_VALUE
	 * @generated
	 * @ordered
	 */
	OPENLAYERSAREABRAND(306, "openlayersareabrand", "openlayersareabrand"), /**
	 * The '<em><b>Enrichments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arricchimenti specifici della singola applicazione.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #ENRICHMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENRICHMENTS(401, "enrichments", "enrichments"),

	/**
	 * The '<em><b>Globalinclusions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frammenti html inclusi globalmente.
	 * Tipologia: risorse web di varia natura (tipicamente html)
	 * <!-- end-model-doc -->
	 * @see #GLOBALINCLUSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	GLOBALINCLUSIONS(501, "globalinclusions", "globalinclusions");

	/**
	 * The '<em><b>Ext all</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ext all</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>ExtJs</i>, utilizzata per la realizzazione delle funzioni 
	 * &quot;ricche&quot;.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXT_ALL
	 * @model name="ext_all"
	 * @generated
	 * @ordered
	 */
	public static final int EXT_ALL_VALUE = 101;

	/**
	 * The '<em><b>Openlayers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Openlayers</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>OpenLayers</i>, utilizzata per la realizzazione 
	 * delle funzionalit&agrave; GIS (widget <b>MapView</b>).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #OPENLAYERS
	 * @model name="openlayers"
	 * @generated
	 * @ordered
	 */
	public static final int OPENLAYERS_VALUE = 102;

	/**
	 * The '<em><b>Extjscsicore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extjscsicore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>extjscsicore</i> (estensione di ExtJS per la
	 * realizzazione di widget/funzioni ricche utilizzate dalla modalit&agrave;
	 * <i>arricchita</i> di guigen).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTJSCSICORE
	 * @model name="extjscsicore"
	 * @generated
	 * @ordered
	 */
	public static final int EXTJSCSICORE_VALUE = 201;

	/**
	 * The '<em><b>Extjscsienricher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extjscsienricher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>extjscsienricher</i> (estensione di ExtJS per la
	 * realizzazione del meccanismo di <i>arricchimento</i> disponibile in guigen).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTJSCSIENRICHER
	 * @model name="extjscsienricher"
	 * @generated
	 * @ordered
	 */
	public static final int EXTJSCSIENRICHER_VALUE = 202;

	/**
	 * The '<em><b>Extjscsimdd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extjscsimdd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Libreria Javascript <i>extjscsimdd</i> (estensione di ExtJS per la
	 * realizzazione dello strato completo di presentation in modalit&agrave;
	 * <i>FAT</i> di guigen).
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTJSCSIMDD
	 * @model name="extjscsimdd"
	 * @generated
	 * @ordered
	 */
	public static final int EXTJSCSIMDD_VALUE = 203;

	/**
	 * The '<em><b>Extlibstheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione di base delle estensioni alla user interface fornite dalla libreria
	 * <i>ExtJS</i>.
	 * E' specifica di ogni portale.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #EXTLIBSTHEME
	 * @model name="extlibstheme"
	 * @generated
	 * @ordered
	 */
	public static final int EXTLIBSTHEME_VALUE = 301;

	/**
	 * The '<em><b>Xstructure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xstructure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impostazione della struttura portante necessaria per realizzare
	 * i vari tipi di layout per XHTML universale.
	 * E' specifica di ogni portale.
	 * Tipologia: stili CSS.
	 * <!-- end-model-doc -->
	 * @see #XSTRUCTURE
	 * @model name="xstructure"
	 * @generated
	 * @ordered
	 */
	public static final int XSTRUCTURE_VALUE = 302;

	/**
	 * The '<em><b>Areabrand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Areabrand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione specifica della singola area tematica atta a realizzarne il
	 * <i>brand></i>.
	 * Agisce come specializzazione di <i>xstructure</i>.
	 * E' specifica di ogni portale e di ogni area tematica. Anche l'area tematica
	 * di default (general) deve essere stilizzata in questo modo.
	 * Tipologia: stili CSS.
	 * <!-- end-model-doc -->
	 * @see #AREABRAND
	 * @model name="areabrand"
	 * @generated
	 * @ordered
	 */
	public static final int AREABRAND_VALUE = 303;

	/**
	 * The '<em><b>Extlibsareabrand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione specifica della singola area tematica atta a realizzarne il
	 * <i>brand></i>.
	 * Agisce come specializzazione di quanto definito in <i>xtheme</i>.
	 * E' specifica di ogni portale e di ogni area tematica. Anche l'area tematica
	 * di default (general) deve essere stilizzata in questo modo.
	 * Tipologia: stili css
	 * <!-- end-model-doc -->
	 * @see #EXTLIBSAREABRAND
	 * @model name="extlibsareabrand"
	 * @generated
	 * @ordered
	 */
	public static final int EXTLIBSAREABRAND_VALUE = 304;

	/**
	 * The '<em><b>Openlayerstheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione di base delle estensioni alla user interface fornite dalla libreria
	 * <i>OPENLAYERS</i>.
	 * E' specifica di ogni portale.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #OPENLAYERSTHEME
	 * @model name="openlayerstheme"
	 * @generated
	 * @ordered
	 */
	public static final int OPENLAYERSTHEME_VALUE = 305;

	/**
	 * The '<em><b>Openlayersareabrand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stilizzazione specifica della singola area tematica atta a realizzarne il
	 * <i>brand></i>.
	 * Agisce come specializzazione di quanto definito in <i>openlayerstheme</i>.
	 * E' specifica di ogni portale e di ogni area tematica. Anche l'area tematica
	 * di default (general) deve essere stilizzata in questo modo.
	 * Tipologia: stili css
	 * <!-- end-model-doc -->
	 * @see #OPENLAYERSAREABRAND
	 * @model name="openlayersareabrand"
	 * @generated
	 * @ordered
	 */
	public static final int OPENLAYERSAREABRAND_VALUE = 306;

	/**
	 * The '<em><b>Enrichments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enrichments</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arricchimenti specifici della singola applicazione.
	 * Tipologia: javascript
	 * <!-- end-model-doc -->
	 * @see #ENRICHMENTS
	 * @model name="enrichments"
	 * @generated
	 * @ordered
	 */
	public static final int ENRICHMENTS_VALUE = 401;

	/**
	 * The '<em><b>Globalinclusions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Globalinclusions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frammenti html inclusi globalmente.
	 * Tipologia: risorse web di varia natura (tipicamente html)
	 * <!-- end-model-doc -->
	 * @see #GLOBALINCLUSIONS
	 * @model name="globalinclusions"
	 * @generated
	 * @ordered
	 */
	public static final int GLOBALINCLUSIONS_VALUE = 501;

	/**
	 * An array of all the '<em><b>Std Web Res Module Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StdWebResModuleNames[] VALUES_ARRAY =
		new StdWebResModuleNames[] {
			EXT_ALL,
			OPENLAYERS,
			EXTJSCSICORE,
			EXTJSCSIENRICHER,
			EXTJSCSIMDD,
			EXTLIBSTHEME,
			XSTRUCTURE,
			AREABRAND,
			EXTLIBSAREABRAND,
			OPENLAYERSTHEME,
			OPENLAYERSAREABRAND,
			ENRICHMENTS,
			GLOBALINCLUSIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Std Web Res Module Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StdWebResModuleNames> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Std Web Res Module Names</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StdWebResModuleNames get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StdWebResModuleNames result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Std Web Res Module Names</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StdWebResModuleNames getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StdWebResModuleNames result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Std Web Res Module Names</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StdWebResModuleNames get(int value) {
		switch (value) {
			case EXT_ALL_VALUE: return EXT_ALL;
			case OPENLAYERS_VALUE: return OPENLAYERS;
			case EXTJSCSICORE_VALUE: return EXTJSCSICORE;
			case EXTJSCSIENRICHER_VALUE: return EXTJSCSIENRICHER;
			case EXTJSCSIMDD_VALUE: return EXTJSCSIMDD;
			case EXTLIBSTHEME_VALUE: return EXTLIBSTHEME;
			case XSTRUCTURE_VALUE: return XSTRUCTURE;
			case AREABRAND_VALUE: return AREABRAND;
			case EXTLIBSAREABRAND_VALUE: return EXTLIBSAREABRAND;
			case OPENLAYERSTHEME_VALUE: return OPENLAYERSTHEME;
			case OPENLAYERSAREABRAND_VALUE: return OPENLAYERSAREABRAND;
			case ENRICHMENTS_VALUE: return ENRICHMENTS;
			case GLOBALINCLUSIONS_VALUE: return GLOBALINCLUSIONS;
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
	private StdWebResModuleNames(int value, String name, String literal) {
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
	
} //StdWebResModuleNames
