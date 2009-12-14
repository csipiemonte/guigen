/**
 * <copyright>
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
 * @model
 * @generated
 */
public interface RefreshViewCommand extends Command, CommandOnWidgets, CommandOnPanels {
} // RefreshViewCommand
