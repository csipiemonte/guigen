/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modello della singola colonna di una <b>Table</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Column#getSelector <em>Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getLabel <em>Label</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#isSortable <em>Sortable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#isEditable <em>Editable</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#isEventActive <em>Event Active</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getEditableFlagSelector <em>Editable Flag Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultiDataBinding <em>Multi Data Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultidataKeySelector <em>Multidata Key Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultidataValueSelector <em>Multidata Value Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getMultidataPropertySelector <em>Multidata Property Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getActiveFlagSelector <em>Active Flag Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Column#getFieldMaxLength <em>Field Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn()
 * @model annotation="logicpkg pkg='ui.widgets.table'"
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seleziona il field del record di cui è costituita la collezione associata alla
	 * tabella.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Selector()
	 * @model
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Etichetta della testata della colonna
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Sortable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostata a <i>true</i> la colonna è ordinabile cliccando sulla testata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sortable</em>' attribute.
	 * @see #setSortable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Sortable()
	 * @model
	 * @generated
	 */
	boolean isSortable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#isSortable <em>Sortable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortable</em>' attribute.
	 * @see #isSortable()
	 * @generated
	 */
	void setSortable(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a <i>true</i> la colonna &egrave; editabile. Il widget
	 * utilizzato per l'editing della colonna dipende dal tipo del field associato
	 * alla colonna (tramite la property <i>selector</i>):
	 * <ul>
	 * <li><b>CheckBox</b> in caso di tipo boolean</li>
	 * <li><b>TextField</b> in tutti gli altri casi (stringhe, numerici, date)</li>
	 * </ul>
	 * Inoltre, se sono impostate le property <i>multiDataBinding</i> o 
	 * <i>multiDataPropertySelector</i>, che comportano la possibilit&agrave;
	 * di scegliere il valore da una lista di valori, sar&agrave; utilizzata una
	 * <b>ComboBox</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Editable()
	 * @model
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indica che la colonna è cliccabile. Il click permette di scatenare l'evento CLICKED
	 * sulla tabella. deve essere utilizzato in congiunzione con un event handler
	 * nella <b>Table</b>, altrimenti non ha nessun effetto.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Active</em>' attribute.
	 * @see #setEventActive(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_EventActive()
	 * @model
	 * @generated
	 */
	boolean isEventActive();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#isEventActive <em>Event Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Active</em>' attribute.
	 * @see #isEventActive()
	 * @generated
	 */
	void setEventActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable Flag Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable Flag Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permette di stabilire a runtime se una cella della colonna (che deve essere
	 * dichiarata editabile) sarà effettivamente editabile.
	 * Rappresenta il selettore di un field del record di cui &egrave; costituita
	 * la collezione collegata alla tabella: questo field deve essere di tipo boolean.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editable Flag Selector</em>' attribute.
	 * @see #setEditableFlagSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_EditableFlagSelector()
	 * @model
	 * @generated
	 */
	String getEditableFlagSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getEditableFlagSelector <em>Editable Flag Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable Flag Selector</em>' attribute.
	 * @see #getEditableFlagSelector()
	 * @generated
	 */
	void setEditableFlagSelector(String value);

	/**
	 * Returns the value of the '<em><b>Multi Data Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Data Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permette di associare ad una colonna editabile la possibilit&agrave;
	 * di scegliere il valore della cella a partire da una collezione di coppie
	 * chiave/valore. 
	 * Per specificare quale campo del record di cui è costituita questa collezione ausiliaria
	 * utilizzare come chiave e come descrizione, occorre impostare le property
	 * <i>multidataKeySelector</i> e <i>multidataValueSelector</i>.
	 * La collezione è la stessa per tutte le righe. 
	 * Nel caso sia necessario differenziare l'insieme di valori a seconda della riga,
	 * utilizzare <i>multidataPropertySelector</i>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Data Binding</em>' containment reference.
	 * @see #setMultiDataBinding(AppDataBinding)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultiDataBinding()
	 * @model containment="true"
	 * @generated
	 */
	AppDataBinding getMultiDataBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultiDataBinding <em>Multi Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Data Binding</em>' containment reference.
	 * @see #getMultiDataBinding()
	 * @generated
	 */
	void setMultiDataBinding(AppDataBinding value);

	/**
	 * Returns the value of the '<em><b>Multidata Key Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multidata Key Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utilizzato in congiunzione con <i>multiDataBinding</i> o <i>multidataPropertySelector</i>.
	 * Seleziona il field da utilizzare come chiave-valore della combo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multidata Key Selector</em>' attribute.
	 * @see #setMultidataKeySelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultidataKeySelector()
	 * @model
	 * @generated
	 */
	String getMultidataKeySelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultidataKeySelector <em>Multidata Key Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multidata Key Selector</em>' attribute.
	 * @see #getMultidataKeySelector()
	 * @generated
	 */
	void setMultidataKeySelector(String value);

	/**
	 * Returns the value of the '<em><b>Multidata Value Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multidata Value Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utilizzato in congiunzione con <i>multiDataBinding</i> o <i>multidataPropertySelector</i>.
	 * Seleziona il field da utilizzare come label descrittiva nella combo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multidata Value Selector</em>' attribute.
	 * @see #setMultidataValueSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultidataValueSelector()
	 * @model
	 * @generated
	 */
	String getMultidataValueSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultidataValueSelector <em>Multidata Value Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multidata Value Selector</em>' attribute.
	 * @see #getMultidataValueSelector()
	 * @generated
	 */
	void setMultidataValueSelector(String value);

	/**
	 * Returns the value of the '<em><b>Multidata Property Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multidata Property Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permette di associare ad una colonna editabile la possibilit&agrave;
	 * di scegliere il valore della cella a partire da una collezione di coppie
	 * chiave/valore. 
	 * Per specificare quale campo del record di cui &egrave; costituita questa collezione ausiliaria
	 * utilizzare come chiave e come descrizione, occorre impostare le property
	 * <i>multidataKeySelector</i> e <i>multidataValueSelector</i>.
	 * L'insieme dei valori è differenziato riga per riga .
	 * Nel caso sia sufficiente uno stesso insieme di valori per tutte le righe utilizzare
	 * <i>multiDataBinding</i>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multidata Property Selector</em>' attribute.
	 * @see #setMultidataPropertySelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_MultidataPropertySelector()
	 * @model
	 * @generated
	 */
	String getMultidataPropertySelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getMultidataPropertySelector <em>Multidata Property Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multidata Property Selector</em>' attribute.
	 * @see #getMultidataPropertySelector()
	 * @generated
	 */
	void setMultidataPropertySelector(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * tooltip associato all'header della colonna
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_Tooltip()
	 * @model
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Active Flag Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permette di stabilire a runtime se una cella della colonna (che deve essere
	 * dichiarata <i>eventActive</i>) sarà effettivamente attiva (ovvero sarà "cliccabile").
	 * Rappresenta il selettore di un field del record di cui &egrave; costituita
	 * la collezione collegata alla tabella: questo field deve essere di tipo boolean.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Flag Selector</em>' attribute.
	 * @see #setActiveFlagSelector(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_ActiveFlagSelector()
	 * @model
	 * @generated
	 */
	String getActiveFlagSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getActiveFlagSelector <em>Active Flag Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Flag Selector</em>' attribute.
	 * @see #getActiveFlagSelector()
	 * @generated
	 */
	void setActiveFlagSelector(String value);

	/**
	 * Returns the value of the '<em><b>Field Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In caso di colonna editabile se specificato rappresenta il massimo numero
	 * di caratteri digitabili. Se il valore specificato &egrave; zero il campo non ha limiti.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Max Length</em>' attribute.
	 * @see #setFieldMaxLength(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getColumn_FieldMaxLength()
	 * @model
	 * @generated
	 */
	String getFieldMaxLength();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Column#getFieldMaxLength <em>Field Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Max Length</em>' attribute.
	 * @see #getFieldMaxLength()
	 * @generated
	 */
	void setFieldMaxLength(String value);

} // Column
