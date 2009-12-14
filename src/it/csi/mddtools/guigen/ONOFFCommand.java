/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ONOFF Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permette di abilitare/disabilitare i widget specificati. Lo stato di abilitazione
 * rimane persistente in sessione.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.ONOFFCommand#isEnable <em>Enable</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getONOFFCommand()
 * @model
 * @generated
 */
public interface ONOFFCommand extends Command, CommandOnWidgets {
	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a true il comando ha effetto di abilitare i widget; 
	 * se impostato a false ha l'effetto di disabilitazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #setEnable(boolean)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getONOFFCommand_Enable()
	 * @model
	 * @generated
	 */
	boolean isEnable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.ONOFFCommand#isEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #isEnable()
	 * @generated
	 */
	void setEnable(boolean value);

} // ONOFFCommand
