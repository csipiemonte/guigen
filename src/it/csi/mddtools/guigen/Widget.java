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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe astratta dalla quale discendono tutti i vari tipi di widget.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getLayoutSpec <em>Layout Spec</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getSecurityConstraints <em>Security Constraints</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#isDefaultVisible <em>Default Visible</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#isDefaultEnabled <em>Default Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Widget#getEnableEnrichment <em>Enable Enrichment</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget()
 * @model abstract="true"
 *        annotation="logicpkg pkg='ui.widgets'"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice identificativo del widget. Deve essere univoco all'interno del 
	 * <b>ContentPanel</b> che lo contiene e deve essere un identificativo
	 * valido java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Etichetta associata al widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Layout Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifica di posizionamento del widget all'interno del pannello che lo contiene.
	 * Il tipo dell'oggetto associato deve essere coerente con il tipo di layout del
	 * pannello contenitore.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout Spec</em>' containment reference.
	 * @see #setLayoutSpec(WidgetLayoutSpecifier)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_LayoutSpec()
	 * @model containment="true"
	 * @generated
	 */
	WidgetLayoutSpecifier getLayoutSpec();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getLayoutSpec <em>Layout Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Spec</em>' containment reference.
	 * @see #getLayoutSpec()
	 * @generated
	 */
	void setLayoutSpec(WidgetLayoutSpecifier value);

	/**
	 * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.EventHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gestori degli eventi associati al widget. Le tipologie di evento gestite sono
	 * dipendenti dal particolare tipo di widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Handlers</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_EventHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventHandler> getEventHandlers();

	/**
	 * Returns the value of the '<em><b>Security Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.UISecurityConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E' possibile specificare uno o pi&ugrave; security constraints sul widget, che
	 * permettono di rendere condizionata la visualizzazione o la abilitazione del
	 * widget a fronte delle condizioni descritte nel constraint.
	 * I constraint sono additivi (nel senso booleano) per ciascun <i>constrained behavior</i>
	 * (comportamento condizionato = {visibilit&agrave; / abilitazione}): se almeno un
	 * constraint &egrave; verificato il comportamento condizionato sar&agrave; abilitato
	 * (visibilit&agrave; / editabilit&agrave;).
	 * Se nessun constraint sar&agrave; verificato, la visualizzazioen/abilitazione sarà condizionata solo allo stato
	 * di default / comandato, ovvero al valore delle proprietà <b>defaultVisible</b> o 
	 * <b>defaultEnabled</b> se non è stato in precedenza utilizzato nessun
	 * comando di tipo <b>ONOFFCommand</b> o <b>VisibilityCommand</b>; se 
	 * tali comandi sono stati utilizzati allora "vince" l'impostazione derivante da
	 * questi comandi.
	 * Se, infine, un constraint &egrave; verificato, comunque un eventuale
	 * disabilitazione/invisibilit&agrave; comandata (tramite <b>ONOFFCommand</b>
	 *  o <b>VisibilityCommand</b>) vince.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Constraints</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_SecurityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<UISecurityConstraint> getSecurityConstraints();

	/**
	 * Returns the value of the '<em><b>Default Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * stato di visibilit&agrave; di default del widget
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Visible</em>' attribute.
	 * @see #setDefaultVisible(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_DefaultVisible()
	 * @model default="true"
	 * @generated
	 */
	boolean isDefaultVisible();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#isDefaultVisible <em>Default Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Visible</em>' attribute.
	 * @see #isDefaultVisible()
	 * @generated
	 */
	void setDefaultVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * stato di abilitazione di default del widget
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Enabled</em>' attribute.
	 * @see #setDefaultEnabled(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_DefaultEnabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isDefaultEnabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#isDefaultEnabled <em>Default Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Enabled</em>' attribute.
	 * @see #isDefaultEnabled()
	 * @generated
	 */
	void setDefaultEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * tooltip associato alla etichetta del widget
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_Tooltip()
	 * @model
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Enable Enrichment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a <i>true</i> e se le features ricche sono abilitate (nella 
	 * <b>TargetPlatform</b>) allora il widget sar&agrave; arricchito, altrimenti non
	 * sar&agrave; applicato nessun arricchimento.
	 * Il valore di default è <i>true</i> 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Enrichment</em>' attribute.
	 * @see #setEnableEnrichment(Boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getWidget_EnableEnrichment()
	 * @model
	 * @generated
	 */
	Boolean getEnableEnrichment();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Widget#getEnableEnrichment <em>Enable Enrichment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Enrichment</em>' attribute.
	 * @see #getEnableEnrichment()
	 * @generated
	 */
	void setEnableEnrichment(Boolean value);

} // Widget
