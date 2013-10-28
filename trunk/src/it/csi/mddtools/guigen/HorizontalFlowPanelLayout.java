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
 * A representation of the model object '<em><b>Horizontal Flow Panel Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gli elementi sono posizionati l'uno a fianco all'altro, da sinistra a destra.
 * Non è necessario nessun specificatore per i singoli elementi
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getHorizontalFlowPanelLayout()
 * @model annotation="uilayoutdoc description='<p>\r\nL\' <b>HorizontalFlowPanelLayout</b> (layout sequenziale a sviluppo\r\norizzontale) prevede che gli elementi contenuti nel pannello che possiede\r\nquesto layout siano visualizzati uno dopo l\'altro in una sequenza \r\norizzontale, all\'interno dell\'area disponibile per il pannello contenitore.\r\nDi fatto, se il numero di widget inseriti nel pannello &egrave; <i>n</i>, \r\nrappresenta un layout con <i>n</i> colonne logiche (una per widget) e\r\n<i>2*n</i> colonne fisiche (una per la label ed una per il campo effettivo, \r\nil tutto moltiplicato per il numero di widget).\r\nE\' possibile regolare le percentuali di occupazione della componente label\r\ne della componente widget di ciascuno dei widget.\r\nLe percentuali sono relative allo spazio a disposizione dell\'interno pannello.\r\n</p>'"
 *        annotation="logicpkg pkg='ui.layout'"
 * @generated
 */
public interface HorizontalFlowPanelLayout extends PanelLayout {
} // HorizontalFlowPanelLayout
