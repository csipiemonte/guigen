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
 * A representation of the model object '<em><b>Radio Buttons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Widget a selezione alternativa tra un insieme statico di valori.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.RadioButtons#getRadio <em>Radio</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.RadioButtons#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons()
 * @model annotation="uiwidgetdoc description='E\' il classico widget di selezione di una opzione tra un insieme finito (e definito a tempo di sviluppo) di possibilit&agrave;.\r\nIl widget completo prevede una <i>label</i> ed il campo di immissione associato, che &egrave; a sua volta costituito\r\nda un elenco di pulsanti la cui selezione &egrave; mutualmente esclusiva.\r\nLa <i>label</i> pu&ograve; essere, in casi particolari, vuota.\r\nIl <b>RadioButtons</b> pu&ograve; essere utilizzato all\'interno di:\r\n<ul>\r\n<li>WidgetsPanel, con layout Verticale, Orizzontale, Griglia</li>\r\n</ul>\r\nPrevede due modalit&agrave; di funzionamento, una <i>standard</i> ed una\r\n<i>ricca</i>.\r\n<h4>modalit&agrave; standard</h4>\r\nIl funzionamento di base del RadioButtons prevede:\r\n<ul>\r\n<li>la possibilit&agrave; di effettuare, al momento del submit della form,\r\nla validazione dell\'input immesso (es. verifica di campo required)</li>\r\n<li>la possibilit&agrave; di essere disabilitato a comando</li>\r\n<li>la possibilit&agrave; di essere reso invisibile a comando</li>\r\n<li>la possibilit&agrave; di essere disabilitato/invisibile a fronte di regole associate al profilo dell\'utente\r\ncollegato</li>\r\n<li>la visualizzazione di un marcatore di errore in prossimit&agrave; della label, in caso di fallita\r\nvalidazione</li>\r\n</ul>\r\n<h4>modalit&agrave; ricca</h4>\r\nLa modalit&agrave; ricca prevede di default i seguenti comportamenti aggiuntivi:\r\n<ul>\r\n<li>tooltip al passaggio del cursore sulla label del widget</li>\r\n</ul>\r\n' event-clicked='<p>E\'possibile, a fronte della selezione da parte dell\'utente di una delle opzioni visualizzate, scatenare una logica applicativa e modificare di\r\nconseguenza la schermata visualizzata. Esistono due modalit&agrave; di esecuzione della logica \r\nassociata: <i>standard</i> e <i>ricca</i>.\r\n<h5>modalit&agrave; standard</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata\r\ne, al termine dell\'esecuzione viene ricaricata l\'intera schermata\r\noppure il flusso passa ad una schermata differente.\r\n<h5>modalit&agrave; ricca</h5>\r\nAlla selezione di una opzione dalla lista viene eseguita la logica applicativa associata. Durante\r\nl\'esecuzione viene sospesa l\'interazione utente e viene visualizzato un\r\nindicatore di \"operazione in corso\".\r\nAl termine dell\'esecuzione i possibili effetti sono:\r\n<ul>\r\n<li>il refresh dell\'intera schermata corrente, con mantenimento della\r\nposizione delle eventuali scrollbar</li>\r\n<li>il refresh di una porzione specifica di schermata</li>\r\n<li>il passaggio del flusso ad una schermata differente</li>\r\n</ul>\r\n</p>'"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface RadioButtons extends DataWidget {
	/**
	 * Returns the value of the '<em><b>Radio</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.RadioButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme dei radiobutton che determina l'insieme dei valori possibili
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radio</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons_Radio()
	 * @model containment="true"
	 * @generated
	 */
	EList<RadioButton> getRadio();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orientamento dei singoli <b>Radiobutton</b>. Valori ammessi:
	 * <ul>
	 * <li>Vertical</li>
	 * <li>Horizontal</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(PanelLayout)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getRadioButtons_Layout()
	 * @model containment="true"
	 * @generated
	 */
	PanelLayout getLayout();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.RadioButtons#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(PanelLayout value);

} // RadioButtons
