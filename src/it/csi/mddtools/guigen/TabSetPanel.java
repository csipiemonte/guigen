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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Set Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo specifico di <b>MultiPanel</b> corredato di componente di controllo
 * a "tab": per passare da un tab all'altro è sufficiente selezionare la "linguetta" 
 * corrispondente.
 * Come per tutti i <b>MultiPanel</b> il programmatore avrà nel model le informazioni
 * riguardanti:
 * <ul>
 * <li>il tab correntemente visualizzato</li>
 * <li>il tab "target" (quello sulla cui 2linguetta" si è cliccato; questa informazione 
 * &egrave; disponibile solo all'interno di un <b>EventHandler</b> associato
 *  al widget fittizio <b>TabSwitcher</b>)</li>.
 * </ul>
 * Il primo tab è quello visualizzato di default.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.TabSetPanel#getSwitcher <em>Switcher</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTabSetPanel()
 * @model annotation="uipaneldoc description='<p>\r\nIl <b>TabSetPanel</b> &egrave; un pannello utilizzato realizzare strutture organizzate\r\na <i>tab</i>. Prevede due sezioni visibili:\r\n<ol>\r\n<li>la lista di &quot; linguette &quot; che servono per attivare i vari <i>tab</i> \r\n(con evidenza visiva del tab correntemente selezionato)</li>\r\n<li>la sezione in cui viene visualizzato il contenuto del <i>tab</i> correntemente selezionato.</li>\r\n</ol>\r\nAll\'interno del singolo tab &egrave; possibile inserire tutte le tipologie di pannello disponibili.\r\n</p>'"
 *        annotation="logicpkg pkg='ui.panels'"
 * @generated
 */
public interface TabSetPanel extends MultiPanel {

	/**
	 * Returns the value of the '<em><b>Switcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switcher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il <b>TabSwitcher</b> &egrave; un widget fittizio che, se inserito, permette
	 * di effettuar eil post dei dati e l'esecuzione di logica a fronte dell'evento di
	 * selezione (click) delle "linguette".
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Switcher</em>' containment reference.
	 * @see #setSwitcher(TabSwitcher)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTabSetPanel_Switcher()
	 * @model containment="true"
	 * @generated
	 */
	TabSwitcher getSwitcher();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.TabSetPanel#getSwitcher <em>Switcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switcher</em>' containment reference.
	 * @see #getSwitcher()
	 * @generated
	 */
	void setSwitcher(TabSwitcher value);

} // TabSetPanel
