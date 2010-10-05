/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.MessageSeverity;
import it.csi.mddtools.guigen.MsgBoxPanel;
import it.csi.mddtools.guigen.PlainText;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Msg Box Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MsgBoxPanelImpl#getMessageSeverity <em>Message Severity</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MsgBoxPanelImpl#getTextMessages <em>Text Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MsgBoxPanelImpl extends PanelImpl implements MsgBoxPanel {
	/**
	 * The default value of the '{@link #getMessageSeverity() <em>Message Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSeverity MESSAGE_SEVERITY_EDEFAULT = MessageSeverity.INFO;

	/**
	 * The cached value of the '{@link #getMessageSeverity() <em>Message Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSeverity()
	 * @generated
	 * @ordered
	 */
	protected MessageSeverity messageSeverity = MESSAGE_SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextMessages() <em>Text Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainText> textMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgBoxPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.MSG_BOX_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSeverity getMessageSeverity() {
		return messageSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSeverity(MessageSeverity newMessageSeverity) {
		MessageSeverity oldMessageSeverity = messageSeverity;
		messageSeverity = newMessageSeverity == null ? MESSAGE_SEVERITY_EDEFAULT : newMessageSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MSG_BOX_PANEL__MESSAGE_SEVERITY, oldMessageSeverity, messageSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainText> getTextMessages() {
		if (textMessages == null) {
			textMessages = new EObjectContainmentEList<PlainText>(PlainText.class, this, GuigenPackage.MSG_BOX_PANEL__TEXT_MESSAGES);
		}
		return textMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.MSG_BOX_PANEL__TEXT_MESSAGES:
				return ((InternalEList<?>)getTextMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.MSG_BOX_PANEL__MESSAGE_SEVERITY:
				return getMessageSeverity();
			case GuigenPackage.MSG_BOX_PANEL__TEXT_MESSAGES:
				return getTextMessages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigenPackage.MSG_BOX_PANEL__MESSAGE_SEVERITY:
				setMessageSeverity((MessageSeverity)newValue);
				return;
			case GuigenPackage.MSG_BOX_PANEL__TEXT_MESSAGES:
				getTextMessages().clear();
				getTextMessages().addAll((Collection<? extends PlainText>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuigenPackage.MSG_BOX_PANEL__MESSAGE_SEVERITY:
				setMessageSeverity(MESSAGE_SEVERITY_EDEFAULT);
				return;
			case GuigenPackage.MSG_BOX_PANEL__TEXT_MESSAGES:
				getTextMessages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuigenPackage.MSG_BOX_PANEL__MESSAGE_SEVERITY:
				return messageSeverity != MESSAGE_SEVERITY_EDEFAULT;
			case GuigenPackage.MSG_BOX_PANEL__TEXT_MESSAGES:
				return textMessages != null && !textMessages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageSeverity: ");
		result.append(messageSeverity);
		result.append(')');
		return result.toString();
	}

} //MsgBoxPanelImpl
