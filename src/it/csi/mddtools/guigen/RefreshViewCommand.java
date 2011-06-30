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
 * A representation of the model object '<em><b>Refresh View Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di effettuare il re-rendering di una porzione di ContentPanel.
 * Funziona solo se sono abilitate le fatures di interazione "ricca", nell'elemento
 * <b>TargetPlatform</b>.
 * Al fine di garnatire l'accessibilit&agrave;, Nel caso della cartuccia "struts2", se il browser non supporta javascript, 
 * la feature effettua un "downgrade" automatico mantenendo il funzionamento
 * seppur perdendo la funzione ricca (ovvero si ha il refresh completo della pagina).
 * Essendo sottoclasse di <b>CommandOnWidgets</b> e <b>CommandOnPanels</b> &egrave; 
 * possibile specificare la porzione di <b>ContentPanel</b> che deve essere aggiornata.
 * L'interpretazione delle proeprty <i>targetWidgets</i> e <i>targetPanels</i>
 * dipende dalla particolare cartuccia di generazione utilizzata.
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRefreshViewCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface RefreshViewCommand extends Command, CommandOnWidgets, CommandOnPanels {
} // RefreshViewCommand
