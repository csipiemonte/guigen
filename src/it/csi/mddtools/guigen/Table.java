/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tabella di visualizzazione dati. Permette di visualizzare in formato tabellare
 * una collezione di record.
 * Mette a disposizione alcune funzioni avanzate:
 * <ol>
 * <li>paginazione
 *   <ul>
 *   <li>opzionale</li>
 *   <li>con possibilit&agrave; di impostare la dimensione della "pagina"</li>
 *   <li>resettabile da business logic</li>
 *   </ul>
 * </li>  
 * <li>export dei dati
 *   <ul>
 *   <li>opzionale</li>
 *   <li>in formato PDF, XLS, RTF</li>
 *   </ul>
 * </li>
 * <li>Con selezione della riga (&egrave; è il valore associato al DataWidget Table, utilizzabile nella business logic
 *   <ul>
 *   <li>opzionale (abilitata solo se è impostato un databinding/valuebinding)</li>
 *   <li>singola o multipla (a seconda del tipo del databinding/valuebinding)</li>
 *   </ul>
 * </li>
 * <li>Con possibilit&agrave; di editing delle celle
 *   <ul>
 *   <li>con widget di editing differenziato a seconda del tipo del dato della cella (TextField se Stringa/numerico, checkbox se boolean</li>
 *   <li>con possibilit&agrave; di scegliere a runtime se una singola cella deve essere editabile o meno</li>
 *   <li>con possibilit&agrave; di prendere il valore della cella da una collection (tramite combobox); la collection può essere unica per tutta la colonna o variabile per la singola riga</li>
 *   </ul>
 * </li>
 * </ol>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Table#getSummary <em>Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Column Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il modello delle colonne che la tabella dovr&agrave; visualizzare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column Model</em>' containment reference.
	 * @see #setColumnModel(ColumnModel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_ColumnModel()
	 * @model containment="true"
	 * @generated
	 */
	ColumnModel getColumnModel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getColumnModel <em>Column Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Model</em>' containment reference.
	 * @see #getColumnModel()
	 * @generated
	 */
	void setColumnModel(ColumnModel value);

	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numero di record max visualizzati in una pagina. 
	 * Un valore di "0" significa che la paginazione &egrave; disabilitata: in 
	 * questo caso vengono visualizzati tutti i record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Size</em>' attribute.
	 * @see #setPageSize(int)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_PageSize()
	 * @model
	 * @generated
	 */
	int getPageSize();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' attribute.
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(int value);

	/**
	 * Returns the value of the '<em><b>Enable Export</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true abilita l'export della tabella.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Export</em>' attribute.
	 * @see #setEnableExport(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_EnableExport()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableExport();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#isEnableExport <em>Enable Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Export</em>' attribute.
	 * @see #isEnableExport()
	 * @generated
	 */
	void setEnableExport(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Decorator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true abilita la definizione di un CustomDecorator, 
	 * per impostazioni grafiche particolari.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Decorator</em>' attribute.
	 * @see #setCustomDecorator(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_CustomDecorator()
	 * @model
	 * @generated
	 */
	boolean isCustomDecorator();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#isCustomDecorator <em>Custom Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Decorator</em>' attribute.
	 * @see #isCustomDecorator()
	 * @generated
	 */
	void setCustomDecorator(boolean value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getTable_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Table#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

} // Table
