/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di eseguire logica custom all'intenro di una catena di comandi.
 * Al metodo specificato in <i>methodName</i> sar&agave; passata una struttura
 * dati contenente:
 * <ul>
 * <li>i riferimenti agli <b>ApplicationData</b> referenziati
 * dal <b>ContentPanel</b> che contiene il comando.</li>
 * <li>un riferimento alla sessione applicativa</li>
 * <li> alcune informazioni ausiliarie diepndenti dalla struttura del 
 *     <b>ContentPanel</b> (es. Id del nodo selezionato in un tree, 
 *     informazioni circa il tab su cui si è cliccato, informazioni sulla cella selezionata
 * in una tabella) </li>
 * </ul>
 * Nel metodo il programmatore potr&agrave; eseguire qualsiasi tipo di logica ed in 
 * particolare:
 * <ul>
 * <li> modificare lo stato degli application data o della sessione.</li>
 * <li> inserire nel contesto applicativo messaggi informativi o di errore</li>
 * <li> determinare la prosecuzione del flusso, selezionando uno tra i 
 * <i>results</i> disponibili.</li>
 * </ul>
 * Al termine dell'esecuzione del metodo il flusso proseguir&agrave; con il comando
 * inserito nel <b>CommandOutcome</b> specificato al termine della logica.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getResults <em>Results</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getPostExecData <em>Post Exec Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getTemplateCartridgeID <em>Template Cartridge ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getTemplateFragmentID <em>Template Fragment ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ExecCommand#getExtraModels <em>Extra Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand()
 * @model
 * @generated
 */
public interface ExecCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.CommandOutcome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'elenco delle possibili prosecuzioni a fronte dell'esecuzione del comando.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandOutcome> getResults();

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome del metodo nel quale sarà contenuta la logica effettiva.
	 * L'implementazione dipende dalla particolare cartuccia di generazione.
	 * Nel caso della cartuccia "struts2" verr&agrave; generato un metodo nello
	 * strato spring, contenente una regione protetta nel quale il programamtore
	 * dovr&agrave; inserire la logica effettiva.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ExecCommand#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Post Exec Data</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Exec Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Occorre dichiarare preventivamente gli application data che saranno modificati nella logica applicativa.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Exec Data</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_PostExecData()
	 * @model
	 * @generated
	 */
	EList<ApplicationData> getPostExecData();

	/**
	 * Returns the value of the '<em><b>Template Cartridge ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Cartridge ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id della cartuccia di template da utilizzare per la generazione 100% del codice associato
	 * all' <b>ExecCommand</b>.
	 * Se non si specifica nessun ID (opzione di default) viene generato un metodo con
	 * regione protetta nel quale deve essere scritta manualmente la logica di business.
	 * Attualmente il meccanismo di registrazione di nuove cartucce di template prevedono
	 * un naming statico e predeterminato.
	 * I valori attualmente utilizzabili sono:
	 * <ul>
	 * <li>ID per cartucce di estensione di piattaforma
	 *   <ul>
	 *   <li>EXTPLATF1</li>
	 *   <li>EXTPLATF2</li>
	 *   <li>EXTPLATF3</li>
	 *   <li>EXTPLATF4</li>
	 *   <li>EXTPLATF5</li>
	 *   <li>EXTPLATF6</li>
	 *   <li>EXTPLATF7</li>
	 *   <li>EXTPLATF8</li>
	 *   <li>EXTPLATF9</li>
	 *   <li>EXTPLATF10</li>
	 *   </ul>
	 * </li>
	 * <li>ID per cartucce di estensione di progetto
	 *   <ul>
	 *   <li>EXTCUST1</li>
	 *   <li>EXTCUST2</li>
	 *   <li>EXTCUST3</li>
	 *   </ul>
	 * </li>
	 * </ul>
	 * 
	 * L'assegnazione degli ID ai vari progetti di estensione orientati alla facilitazione dell'utilizzo
	 * di piattaforme sono assegnati da DP-ISP.
	 * Gli ID di estensione specifica del progetto sono liberamente utilizzabili.
	 * 
	 * <b>Attenzione</b>: Questa opzione &egrave; da considerarsi una possibilit&agrave; <b>avanzata</b> 
	 * da utilizzarsi con cautela.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Cartridge ID</em>' attribute.
	 * @see #setTemplateCartridgeID(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_TemplateCartridgeID()
	 * @model
	 * @generated
	 */
	String getTemplateCartridgeID();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ExecCommand#getTemplateCartridgeID <em>Template Cartridge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Cartridge ID</em>' attribute.
	 * @see #getTemplateCartridgeID()
	 * @generated
	 */
	void setTemplateCartridgeID(String value);

	/**
	 * Returns the value of the '<em><b>Template Fragment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Fragment ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id del template da utilizzare per la generazione 100% del codice associato
	 * all' <b>ExecCommand</b>. L'id &egrave; specifico della cartuccia indicata nell'attributo
	 * <i>templateCartridgeID</i>.
	 * 
	 * <b>Attenzione</b>: Questa opzione &egrave; da considerarsi una possibilit&agrave; <b>avanzata</b> 
	 * da utilizzarsi con cautela.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Fragment ID</em>' attribute.
	 * @see #setTemplateFragmentID(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_TemplateFragmentID()
	 * @model
	 * @generated
	 */
	String getTemplateFragmentID();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ExecCommand#getTemplateFragmentID <em>Template Fragment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Fragment ID</em>' attribute.
	 * @see #getTemplateFragmentID()
	 * @generated
	 */
	void setTemplateFragmentID(String value);

	/**
	 * Returns the value of the '<em><b>Extra Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eventuali modelli (porzioni di modello) aggiuntivi utilizzabili dalle varie cartucce
	 * di generazione 100% (es. modello del mapping RDB, ... modello di una
	 * interfaccia di servizio, ...)
	 * 
	 * <b>Attenzione</b>: Questa opzione &egrave; da considerarsi una possibilit&agrave; <b>avanzata</b> 
	 * da utilizzarsi con cautela.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Models</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getExecCommand_ExtraModels()
	 * @model
	 * @generated
	 */
	EList<EObject> getExtraModels();

} // ExecCommand
