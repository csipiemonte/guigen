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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breadcrumb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Rappresenta il cosiddetto &quot;filo d'arianna&quot;, utilizzabile per mostrare
 * all'utnete collegato il contesto applicativo in cui si trova (es.
 * funzionalit&agrave; corrente, livello di dettaglio, ...).
 * E' un <b>MultiDataWidget</b> collegabile ad <b>ApplicationData</b>
 * di tipo array di stringhe che &egrave; utilizzato per mantenere l'elenco
 * degli step del filo d'arianna. La costruzione degli step deve essere
 * effettuata tramite logica di business.
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getBreadcrumb()
 * @model annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface Breadcrumb extends Panel {
} // Breadcrumb
