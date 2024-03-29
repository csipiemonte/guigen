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
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gestore di un evento di User Interaction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#getCommand <em>Command</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#getEventType <em>Event Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#isSkipValidation <em>Skip Validation</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#getMethodProtection <em>Method Protection</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.EventHandler#getEventSpecifiers <em>Event Specifiers</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler()
 * @model annotation="logicpkg pkg='ui.event'"
 * @generated
 */
public interface EventHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fronte dell'evento specificato in <i>eventType</i> sar&agrave; eseguito
	 * il comando specificato in questo elemento.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Command)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_Command()
	 * @model containment="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EventHandler#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.EventTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifica il tipo di evento per cui &egrave; definito questo event handler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @see #setEventType(EventTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_EventType()
	 * @model
	 * @generated
	 */
	EventTypes getEventType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EventHandler#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see it.csi.mddtools.guigen.EventTypes
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventTypes value);

	/**
	 * Returns the value of the '<em><b>Skip Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true non saranno eseguite le logiche automatiche di conversione/validazione
	 * a fronte dell'occorrenza dell'evento specificato.
	 * Serve per gestire casi in cui la non conformit&agrave; dei dati immessi non
	 * &egrave; importante, anzi deve essere ignorata (es. il tasto "indietro" o "annulla").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Validation</em>' attribute.
	 * @see #setSkipValidation(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_SkipValidation()
	 * @model
	 * @generated
	 */
	boolean isSkipValidation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EventHandler#isSkipValidation <em>Skip Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Validation</em>' attribute.
	 * @see #isSkipValidation()
	 * @generated
	 */
	void setSkipValidation(boolean value);

	/**
	 * Returns the value of the '<em><b>Method Protection</b></em>' attribute.
	 * The default value is <code>"REJECT_SAME"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.MethodProtectionTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permette di proteggere l'esecuzione del metodo associato all'<b>EventHandler</b>
	 * da effetti indesiderati derivanti dal'eventuale esecuzione contemporanea di altri metodi.
	 * Le possibili protezioni sono:
	 * <ol>
	 * <li><b>allowAll</b>: permette l'esecuzione contemporanea di qualsiasi metodo (nessuna 
	 * protezione)</li>
	 * <li><b>rejectSame</b> (<i>default</i>): evita l'esecuzione contemporanea di altre istanze dello stesso 
	 * metodo (protezione tipica del doppio click su uno stesso pulsante)</li>
	 * <li><b>rejectAll</b>: evita l'esecuzione contemporanea di altre istanze di qualsiasi 
	 * metodo (protezione cautelativa globale)</li>
	 * </ol>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Protection</em>' attribute.
	 * @see it.csi.mddtools.guigen.MethodProtectionTypes
	 * @see #setMethodProtection(MethodProtectionTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_MethodProtection()
	 * @model default="REJECT_SAME"
	 * @generated
	 */
	MethodProtectionTypes getMethodProtection();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.EventHandler#getMethodProtection <em>Method Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Protection</em>' attribute.
	 * @see it.csi.mddtools.guigen.MethodProtectionTypes
	 * @see #getMethodProtection()
	 * @generated
	 */
	void setMethodProtection(MethodProtectionTypes value);

	/**
	 * Returns the value of the '<em><b>Event Specifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Specifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permette di specificare ulteriormente la gestione dell'evento. 
	 * E' possibile inserire 0, 1 o molti specificatori:
	 * <ul>
	 * <li>lo specificatore viene scritto in formato testo e la 
	 *  sintassi di ciascun specificatore &egrave; tipicamente del tipo:
	 * &lt;cod_specificatore&gt;=&lt;val_specificatore&gt; 
	 * (esempio: <i>min_chars=3</i>)
	 * </li>
	 * <li>le possibili valorizzazioni dipendono fortemente dal tipo di evento gestito.
	 * Attualmente le possibiit&agrave; sono:
	 *   <ul>
	 *   <li>evento <b>KEYPRESSED</b>:
	 *     <ul>
	 *     <li><i>min_chars=&lt;numero&gt;</i>: permette di specificare il numero
	 *            di caratteri minimo affinch&egrave; scatti la query di <i>suggestion</i>
	 *            (il default &egrave; 4)
	 *      </li>
	 *     </ul>
	 *   </li>
	 *   </ul>
	 * </li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Specifiers</em>' attribute list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getEventHandler_EventSpecifiers()
	 * @model
	 * @generated
	 */
	EList<String> getEventSpecifiers();

} // EventHandler
