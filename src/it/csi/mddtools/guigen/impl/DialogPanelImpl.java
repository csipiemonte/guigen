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
import it.csi.mddtools.guigen.DialogPanel;
import it.csi.mddtools.guigen.GuigenPackage;

import it.csi.mddtools.guigen.MsgBoxPanel;
import java.util.Collection;
import it.csi.mddtools.guigen.Panel;
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
 * An implementation of the model object '<em><b>Dialog Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.DialogPanelImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.DialogPanelImpl#getMsgBoxes <em>Msg Boxes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DialogPanelImpl extends PanelImpl implements DialogPanel {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected CommandPanel commands;
	/**
	 * The cached value of the '{@link #getMsgBoxes() <em>Msg Boxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgBoxes()
	 * @generated
	 * @ordered
	 */
	protected EList<MsgBoxPanel> msgBoxes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.DIALOG_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPanel getCommands() {
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommands(CommandPanel newCommands, NotificationChain msgs) {
		CommandPanel oldCommands = commands;
		commands = newCommands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.DIALOG_PANEL__COMMANDS, oldCommands, newCommands);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommands(CommandPanel newCommands) {
		if (newCommands != commands) {
			NotificationChain msgs = null;
			if (commands != null)
				msgs = ((InternalEObject)commands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.DIALOG_PANEL__COMMANDS, null, msgs);
			if (newCommands != null)
				msgs = ((InternalEObject)newCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.DIALOG_PANEL__COMMANDS, null, msgs);
			msgs = basicSetCommands(newCommands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.DIALOG_PANEL__COMMANDS, newCommands, newCommands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MsgBoxPanel> getMsgBoxes() {
		if (msgBoxes == null) {
			msgBoxes = new EObjectContainmentEList<MsgBoxPanel>(MsgBoxPanel.class, this, GuigenPackage.DIALOG_PANEL__MSG_BOXES);
		}
		return msgBoxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.DIALOG_PANEL__COMMANDS:
				return basicSetCommands(null, msgs);
			case GuigenPackage.DIALOG_PANEL__MSG_BOXES:
				return ((InternalEList<?>)getMsgBoxes()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.DIALOG_PANEL__COMMANDS:
				return getCommands();
			case GuigenPackage.DIALOG_PANEL__MSG_BOXES:
				return getMsgBoxes();
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
			case GuigenPackage.DIALOG_PANEL__COMMANDS:
				setCommands((CommandPanel)newValue);
				return;
			case GuigenPackage.DIALOG_PANEL__MSG_BOXES:
				getMsgBoxes().clear();
				getMsgBoxes().addAll((Collection<? extends MsgBoxPanel>)newValue);
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
			case GuigenPackage.DIALOG_PANEL__COMMANDS:
				setCommands((CommandPanel)null);
				return;
			case GuigenPackage.DIALOG_PANEL__MSG_BOXES:
				getMsgBoxes().clear();
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
			case GuigenPackage.DIALOG_PANEL__COMMANDS:
				return commands != null;
			case GuigenPackage.DIALOG_PANEL__MSG_BOXES:
				return msgBoxes != null && !msgBoxes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DialogPanelImpl
