/**
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarative UI Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UI constraint basato sull'esecuzione di uno script durante la fase di
 * rendering dell'elemento di UI.
 * Lo script deve essere codificato come espressione booleana nel linguaggio
 * definito dalla property "language". All'interno dell'espressione possono 
 * essere utilizzati tutti i campi che sono disponibili nel model della schermata
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.DeclarativeUIConstraint#getLanguage <em>Language</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.DeclarativeUIConstraint#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getDeclarativeUIConstraint()
 * @model annotation="logicpkg pkg='security'"
 * @generated
 */
public interface DeclarativeUIConstraint extends UISecurityConstraint {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"beanshell"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.InlineScriptingLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il linguaggio in cui deve essere scritta l'espressione del constraint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see it.csi.mddtools.guigen.InlineScriptingLanguage
	 * @see #setLanguage(InlineScriptingLanguage)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDeclarativeUIConstraint_Language()
	 * @model default="beanshell"
	 * @generated
	 */
	InlineScriptingLanguage getLanguage();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DeclarativeUIConstraint#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see it.csi.mddtools.guigen.InlineScriptingLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(InlineScriptingLanguage value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lo script del constraint. deve essere una espressione booleana. Pu&ograve;
	 * utilizzare tutte le properties disponibili nel model del ContentPanel e deve avere un
	 * valore booleano.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getDeclarativeUIConstraint_Script()
	 * @model
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.DeclarativeUIConstraint#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

} // DeclarativeUIConstraint
