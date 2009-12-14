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
 * A representation of the model object '<em><b>Panel Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definizione di pannello riusabile. Deve essere definita in un modello esterno
 * e referenziata tramite l'oggetto <b>PanelDefUse</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getPanel <em>Panel</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getParams <em>Params</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getAppDataDefs <em>App Data Defs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getTypeDefs <em>Type Defs</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getActors <em>Actors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.PanelDef#getOnRefreshCommand <em>On Refresh Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef()
 * @model
 * @generated
 */
public interface PanelDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice menmonico identificativo della definizione
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contiene la struttura del pannello.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Panel</em>' containment reference.
	 * @see #setPanel(Panel)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_Panel()
	 * @model containment="true"
	 * @generated
	 */
	Panel getPanel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDef#getPanel <em>Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel</em>' containment reference.
	 * @see #getPanel()
	 * @generated
	 */
	void setPanel(Panel value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.PDefParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dichiarazione dei parametri di configurazione del frammento.
	 * Per ogni parametro definito qui, nel <b>PanelDefUse</b> occorre specificare
	 * una valorizzazione del parametro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<PDefParam> getParams();

	/**
	 * Returns the value of the '<em><b>App Data Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Data Defs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definizione di application data fittizi che servono per impostare i binding dei dati.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Data Defs</em>' containment reference.
	 * @see #setAppDataDefs(ApplicationDataDefs)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_AppDataDefs()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationDataDefs getAppDataDefs();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDef#getAppDataDefs <em>App Data Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Data Defs</em>' containment reference.
	 * @see #getAppDataDefs()
	 * @generated
	 */
	void setAppDataDefs(ApplicationDataDefs value);

	/**
	 * Returns the value of the '<em><b>Type Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Defs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definizione di tipi fittizi utilizzati negli application data fittizi.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Defs</em>' containment reference.
	 * @see #setTypeDefs(Typedefs)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_TypeDefs()
	 * @model containment="true"
	 * @generated
	 */
	Typedefs getTypeDefs();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDef#getTypeDefs <em>Type Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Defs</em>' containment reference.
	 * @see #getTypeDefs()
	 * @generated
	 */
	void setTypeDefs(Typedefs value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definizione di ruoli fittizi che servono per impostare i security constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definizione di attori fittizi che servono per impostare i security constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.guigen.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definizione di use case fittizi che servono per impostare i security constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference list.
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_UseCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUseCases();

	/**
	 * Returns the value of the '<em><b>On Refresh Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Refresh Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PER FUTURI SVILUPPI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Refresh Command</em>' containment reference.
	 * @see #setOnRefreshCommand(Command)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getPanelDef_OnRefreshCommand()
	 * @model containment="true"
	 * @generated
	 */
	Command getOnRefreshCommand();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.PanelDef#getOnRefreshCommand <em>On Refresh Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Refresh Command</em>' containment reference.
	 * @see #getOnRefreshCommand()
	 * @generated
	 */
	void setOnRefreshCommand(Command value);

} // PanelDef
