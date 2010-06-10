/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Ext Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di far passare il flusso di esecuzione ad una pagina esterna all'applicativo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.JumpExtCommand#getStaticUrl <em>Static Url</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.JumpExtCommand#getRuntimeUrlProvider <em>Runtime Url Provider</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.JumpExtCommand#getLocationCode <em>Location Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpExtCommand()
 * @model annotation="logicpkg pkg='cmd'"
 * @generated
 */
public interface JumpExtCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Static Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se specificato l'effetto del comando sarà la redirezione del flusso applicativo all'url specificato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Url</em>' attribute.
	 * @see #setStaticUrl(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpExtCommand_StaticUrl()
	 * @model
	 * @generated
	 */
	String getStaticUrl();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.JumpExtCommand#getStaticUrl <em>Static Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Url</em>' attribute.
	 * @see #getStaticUrl()
	 * @generated
	 */
	void setStaticUrl(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Url Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Url Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se specificato il flusso applicativo verr&agrave; rediretto all'url fornito dinamicamente (a runtime) dall'application data specificato.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime Url Provider</em>' reference.
	 * @see #setRuntimeUrlProvider(ApplicationData)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpExtCommand_RuntimeUrlProvider()
	 * @model
	 * @generated
	 */
	ApplicationData getRuntimeUrlProvider();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.JumpExtCommand#getRuntimeUrlProvider <em>Runtime Url Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Url Provider</em>' reference.
	 * @see #getRuntimeUrlProvider()
	 * @generated
	 */
	void setRuntimeUrlProvider(ApplicationData value);

	/**
	 * Returns the value of the '<em><b>Location Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice identificativo della locazione. A solo scopo menmonico. deve essere univoco all'interno del <b>ContentPanel</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Code</em>' attribute.
	 * @see #setLocationCode(String)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getJumpExtCommand_LocationCode()
	 * @model
	 * @generated
	 */
	String getLocationCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.JumpExtCommand#getLocationCode <em>Location Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Code</em>' attribute.
	 * @see #getLocationCode()
	 * @generated
	 */
	void setLocationCode(String value);

} // JumpExtCommand
