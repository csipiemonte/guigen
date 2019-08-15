/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
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
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.MsgBoxPanelImpl#getMessageSeverity <em>Message Severity</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MsgBoxPanelImpl#getTextMessages <em>Text Messages</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.MsgBoxPanelImpl#isShowStdLegend <em>Show Std Legend</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #isShowStdLegend() <em>Show Std Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowStdLegend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_STD_LEGEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowStdLegend() <em>Show Std Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowStdLegend()
	 * @generated
	 * @ordered
	 */
	protected boolean showStdLegend = SHOW_STD_LEGEND_EDEFAULT;

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
	public boolean isShowStdLegend() {
		return showStdLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowStdLegend(boolean newShowStdLegend) {
		boolean oldShowStdLegend = showStdLegend;
		showStdLegend = newShowStdLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.MSG_BOX_PANEL__SHOW_STD_LEGEND, oldShowStdLegend, showStdLegend));
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
			case GuigenPackage.MSG_BOX_PANEL__SHOW_STD_LEGEND:
				return isShowStdLegend();
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
			case GuigenPackage.MSG_BOX_PANEL__SHOW_STD_LEGEND:
				setShowStdLegend((Boolean)newValue);
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
			case GuigenPackage.MSG_BOX_PANEL__SHOW_STD_LEGEND:
				setShowStdLegend(SHOW_STD_LEGEND_EDEFAULT);
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
			case GuigenPackage.MSG_BOX_PANEL__SHOW_STD_LEGEND:
				return showStdLegend != SHOW_STD_LEGEND_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (messageSeverity: ");
		result.append(messageSeverity);
		result.append(", showStdLegend: ");
		result.append(showStdLegend);
		result.append(')');
		return result.toString();
	}

} //MsgBoxPanelImpl
