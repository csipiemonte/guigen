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
 * A representation of the model object '<em><b>GUI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getStructure <em>Structure</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getBeahviors <em>Beahviors</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getCodComponente <em>Cod Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getVersioneProdotto <em>Versione Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getVersioneComponente <em>Versione Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.GUIModel#getTypedefs <em>Typedefs</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel()
 * @model
 * @generated
 */
public interface GUIModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(GUIStructure)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_Structure()
	 * @model containment="true"
	 * @generated
	 */
	GUIStructure getStructure();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(GUIStructure value);

	/**
	 * Returns the value of the '<em><b>Beahviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beahviors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beahviors</em>' containment reference.
	 * @see #setBeahviors(GUIBehaviors)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_Beahviors()
	 * @model containment="true"
	 * @generated
	 */
	GUIBehaviors getBeahviors();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getBeahviors <em>Beahviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beahviors</em>' containment reference.
	 * @see #getBeahviors()
	 * @generated
	 */
	void setBeahviors(GUIBehaviors value);

	/**
	 * Returns the value of the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Prodotto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #setCodProdotto(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_CodProdotto()
	 * @model
	 * @generated
	 */
	String getCodProdotto();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getCodProdotto <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #getCodProdotto()
	 * @generated
	 */
	void setCodProdotto(String value);

	/**
	 * Returns the value of the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Componente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Componente</em>' attribute.
	 * @see #setCodComponente(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_CodComponente()
	 * @model
	 * @generated
	 */
	String getCodComponente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getCodComponente <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Componente</em>' attribute.
	 * @see #getCodComponente()
	 * @generated
	 */
	void setCodComponente(String value);

	/**
	 * Returns the value of the '<em><b>Versione Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versione Prodotto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versione Prodotto</em>' attribute.
	 * @see #setVersioneProdotto(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_VersioneProdotto()
	 * @model
	 * @generated
	 */
	String getVersioneProdotto();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getVersioneProdotto <em>Versione Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versione Prodotto</em>' attribute.
	 * @see #getVersioneProdotto()
	 * @generated
	 */
	void setVersioneProdotto(String value);

	/**
	 * Returns the value of the '<em><b>Versione Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versione Componente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versione Componente</em>' attribute.
	 * @see #setVersioneComponente(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_VersioneComponente()
	 * @model
	 * @generated
	 */
	String getVersioneComponente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getVersioneComponente <em>Versione Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versione Componente</em>' attribute.
	 * @see #getVersioneComponente()
	 * @generated
	 */
	void setVersioneComponente(String value);

	/**
	 * Returns the value of the '<em><b>Typedefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typedefs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typedefs</em>' containment reference.
	 * @see #setTypedefs(Typedefs)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getGUIModel_Typedefs()
	 * @model containment="true"
	 * @generated
	 */
	Typedefs getTypedefs();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.GUIModel#getTypedefs <em>Typedefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typedefs</em>' containment reference.
	 * @see #getTypedefs()
	 * @generated
	 */
	void setTypedefs(Typedefs value);

} // GUIModel
