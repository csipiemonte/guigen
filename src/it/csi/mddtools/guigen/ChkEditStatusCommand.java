/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Edit Status Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di verificare se, all'interno di una sessione di editing, vi sono state
 * delle variazioni al valore di uno o pi&ugrave; <b>ApplicationData</b>.
 * Affinch&egrave; il check sia veritiero è necessario che gli <b>ApplicationData</b>
 * oggetto di verifica siano un sottoinsieme dell'insieme di <b>ApplicationData</b>
 * indicati nel comando <b>BeginEditCommand</b> che ha originato
 * la sessione di editing (altrimenti non sar&agrave; disponibile il valore originario
 * con il quale effettuare il check di modifica).
 * A fronte dell'esito del check sarà possibile proseguire l'esecuzione con uno 
 * tra due comandi (referenziati nei due elementi di tipo <b>CommandOutcome</b>).
 * Mediante l'attributo <i>checkAggregation</i>E'possibile specificare la logica di aggregazione del check relativamente
 * ai vari <b>ApplicationData</b> referenziati:
 * <ul>
 * <li>OR: l'esito sar&agrave; di "occorsa variazione" se il valore di almeno uno dei dati
 *       referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
 * <li>AND: l'esito sar&agrave; di "occorsa variazione" se il valore di tutti i dati
 *       referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
 * <li>XOR: l'esito sar&agrave; di "occorsa variazione" se il valore di uno soltanto tra i dati
 *       referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
 * </ul>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDataChecked <em>Data Checked</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getCheckAggregation <em>Check Aggregation</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfChanged <em>Do If Changed</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfNotChanged <em>Do If Not Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getChkEditStatusCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface ChkEditStatusCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Data Checked</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.ApplicationData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco dei dati oggetto della verifica. Devono essere un sottoinsieme 
	 * dei dati referenziati nel corrispondente <b>BeginEditCommand</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Checked</em>' reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getChkEditStatusCommand_DataChecked()
	 * @model
	 * @generated
	 */
	EList<ApplicationData> getDataChecked();

	/**
	 * Returns the value of the '<em><b>Check Aggregation</b></em>' attribute.
	 * The default value is <code>"OR"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.LogicAggregationTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tipo di aggregazione dei check sui dati. Possibilit&agrave;:
	 * <ul>
	 * <li>OR: l'esito sar&agrave; di "occorsa variazione" se il valore di almeno uno dei dati
	 *       referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
	 * <li>AND: l'esito sar&agrave; di "occorsa variazione" se il valore di tutti i dati
	 *       referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
	 * <li>XOR: l'esito sar&agrave; di "occorsa variazione" se il valore di uno soltanto tra i dati
	 *       referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check Aggregation</em>' attribute.
	 * @see it.csi.mddtools.guigen.LogicAggregationTypes
	 * @see #setCheckAggregation(LogicAggregationTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getChkEditStatusCommand_CheckAggregation()
	 * @model default="OR"
	 * @generated
	 */
	LogicAggregationTypes getCheckAggregation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getCheckAggregation <em>Check Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Aggregation</em>' attribute.
	 * @see it.csi.mddtools.guigen.LogicAggregationTypes
	 * @see #getCheckAggregation()
	 * @generated
	 */
	void setCheckAggregation(LogicAggregationTypes value);

	/**
	 * Returns the value of the '<em><b>Do If Changed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifica il branch di elaborazione da eseguire nel caso che i check
	 * specificati indichino che ci sono state delle modifiche.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do If Changed</em>' containment reference.
	 * @see #setDoIfChanged(CommandOutcome)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getChkEditStatusCommand_DoIfChanged()
	 * @model containment="true"
	 * @generated
	 */
	CommandOutcome getDoIfChanged();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfChanged <em>Do If Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do If Changed</em>' containment reference.
	 * @see #getDoIfChanged()
	 * @generated
	 */
	void setDoIfChanged(CommandOutcome value);

	/**
	 * Returns the value of the '<em><b>Do If Not Changed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifica il branch di elaborazione da eseguire nel caso che i check
	 * specificati indichino che <i>non</i> ci sono state delle modifiche.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do If Not Changed</em>' containment reference.
	 * @see #setDoIfNotChanged(CommandOutcome)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getChkEditStatusCommand_DoIfNotChanged()
	 * @model containment="true"
	 * @generated
	 */
	CommandOutcome getDoIfNotChanged();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ChkEditStatusCommand#getDoIfNotChanged <em>Do If Not Changed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do If Not Changed</em>' containment reference.
	 * @see #getDoIfNotChanged()
	 * @generated
	 */
	void setDoIfNotChanged(CommandOutcome value);

} // ChkEditStatusCommand
