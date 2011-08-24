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

import it.csi.mddtools.guigen.Command;
import it.csi.mddtools.guigen.EventHandler;
import it.csi.mddtools.guigen.EventTypes;
import it.csi.mddtools.guigen.GuigenPackage;

import it.csi.mddtools.guigen.MethodProtectionTypes;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.EventHandlerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.EventHandlerImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.EventHandlerImpl#isSkipValidation <em>Skip Validation</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.EventHandlerImpl#getMethodProtection <em>Method Protection</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.EventHandlerImpl#getEventSpecifiers <em>Event Specifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventHandlerImpl extends EObjectImpl implements EventHandler {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command;

	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final EventTypes EVENT_TYPE_EDEFAULT = EventTypes.CLICKED;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventTypes eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkipValidation() <em>Skip Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipValidation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_VALIDATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkipValidation() <em>Skip Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipValidation()
	 * @generated
	 * @ordered
	 */
	protected boolean skipValidation = SKIP_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodProtection() <em>Method Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodProtection()
	 * @generated
	 * @ordered
	 */
	protected static final MethodProtectionTypes METHOD_PROTECTION_EDEFAULT = MethodProtectionTypes.REJECT_SAME;

	/**
	 * The cached value of the '{@link #getMethodProtection() <em>Method Protection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodProtection()
	 * @generated
	 * @ordered
	 */
	protected MethodProtectionTypes methodProtection = METHOD_PROTECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventSpecifiers() <em>Event Specifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSpecifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eventSpecifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.EVENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(Command newCommand, NotificationChain msgs) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuigenPackage.EVENT_HANDLER__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Command newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.EVENT_HANDLER__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuigenPackage.EVENT_HANDLER__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EVENT_HANDLER__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypes getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(EventTypes newEventType) {
		EventTypes oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EVENT_HANDLER__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSkipValidation() {
		return skipValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipValidation(boolean newSkipValidation) {
		boolean oldSkipValidation = skipValidation;
		skipValidation = newSkipValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EVENT_HANDLER__SKIP_VALIDATION, oldSkipValidation, skipValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodProtectionTypes getMethodProtection() {
		return methodProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodProtection(MethodProtectionTypes newMethodProtection) {
		MethodProtectionTypes oldMethodProtection = methodProtection;
		methodProtection = newMethodProtection == null ? METHOD_PROTECTION_EDEFAULT : newMethodProtection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EVENT_HANDLER__METHOD_PROTECTION, oldMethodProtection, methodProtection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEventSpecifiers() {
		if (eventSpecifiers == null) {
			eventSpecifiers = new EDataTypeUniqueEList<String>(String.class, this, GuigenPackage.EVENT_HANDLER__EVENT_SPECIFIERS);
		}
		return eventSpecifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.EVENT_HANDLER__COMMAND:
				return basicSetCommand(null, msgs);
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
			case GuigenPackage.EVENT_HANDLER__COMMAND:
				return getCommand();
			case GuigenPackage.EVENT_HANDLER__EVENT_TYPE:
				return getEventType();
			case GuigenPackage.EVENT_HANDLER__SKIP_VALIDATION:
				return isSkipValidation();
			case GuigenPackage.EVENT_HANDLER__METHOD_PROTECTION:
				return getMethodProtection();
			case GuigenPackage.EVENT_HANDLER__EVENT_SPECIFIERS:
				return getEventSpecifiers();
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
			case GuigenPackage.EVENT_HANDLER__COMMAND:
				setCommand((Command)newValue);
				return;
			case GuigenPackage.EVENT_HANDLER__EVENT_TYPE:
				setEventType((EventTypes)newValue);
				return;
			case GuigenPackage.EVENT_HANDLER__SKIP_VALIDATION:
				setSkipValidation((Boolean)newValue);
				return;
			case GuigenPackage.EVENT_HANDLER__METHOD_PROTECTION:
				setMethodProtection((MethodProtectionTypes)newValue);
				return;
			case GuigenPackage.EVENT_HANDLER__EVENT_SPECIFIERS:
				getEventSpecifiers().clear();
				getEventSpecifiers().addAll((Collection<? extends String>)newValue);
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
			case GuigenPackage.EVENT_HANDLER__COMMAND:
				setCommand((Command)null);
				return;
			case GuigenPackage.EVENT_HANDLER__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case GuigenPackage.EVENT_HANDLER__SKIP_VALIDATION:
				setSkipValidation(SKIP_VALIDATION_EDEFAULT);
				return;
			case GuigenPackage.EVENT_HANDLER__METHOD_PROTECTION:
				setMethodProtection(METHOD_PROTECTION_EDEFAULT);
				return;
			case GuigenPackage.EVENT_HANDLER__EVENT_SPECIFIERS:
				getEventSpecifiers().clear();
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
			case GuigenPackage.EVENT_HANDLER__COMMAND:
				return command != null;
			case GuigenPackage.EVENT_HANDLER__EVENT_TYPE:
				return eventType != EVENT_TYPE_EDEFAULT;
			case GuigenPackage.EVENT_HANDLER__SKIP_VALIDATION:
				return skipValidation != SKIP_VALIDATION_EDEFAULT;
			case GuigenPackage.EVENT_HANDLER__METHOD_PROTECTION:
				return methodProtection != METHOD_PROTECTION_EDEFAULT;
			case GuigenPackage.EVENT_HANDLER__EVENT_SPECIFIERS:
				return eventSpecifiers != null && !eventSpecifiers.isEmpty();
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
		result.append(" (eventType: ");
		result.append(eventType);
		result.append(", skipValidation: ");
		result.append(skipValidation);
		result.append(", methodProtection: ");
		result.append(methodProtection);
		result.append(", eventSpecifiers: ");
		result.append(eventSpecifiers);
		result.append(')');
		return result.toString();
	}

} //EventHandlerImpl
