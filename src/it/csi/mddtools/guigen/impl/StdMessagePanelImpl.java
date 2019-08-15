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

import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.StdMessagePanel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Std Message Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.StdMessagePanelImpl#isShowGlobalMessages <em>Show Global Messages</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.StdMessagePanelImpl#isShowFieldErrorDetails <em>Show Field Error Details</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.StdMessagePanelImpl#isShowFieldErrors <em>Show Field Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StdMessagePanelImpl extends PanelImpl implements StdMessagePanel {
	/**
	 * The default value of the '{@link #isShowGlobalMessages() <em>Show Global Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGlobalMessages()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_GLOBAL_MESSAGES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowGlobalMessages() <em>Show Global Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGlobalMessages()
	 * @generated
	 * @ordered
	 */
	protected boolean showGlobalMessages = SHOW_GLOBAL_MESSAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowFieldErrorDetails() <em>Show Field Error Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowFieldErrorDetails()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_FIELD_ERROR_DETAILS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowFieldErrorDetails() <em>Show Field Error Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowFieldErrorDetails()
	 * @generated
	 * @ordered
	 */
	protected boolean showFieldErrorDetails = SHOW_FIELD_ERROR_DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowFieldErrors() <em>Show Field Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowFieldErrors()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_FIELD_ERRORS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowFieldErrors() <em>Show Field Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowFieldErrors()
	 * @generated
	 * @ordered
	 */
	protected boolean showFieldErrors = SHOW_FIELD_ERRORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdMessagePanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.STD_MESSAGE_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowGlobalMessages() {
		return showGlobalMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowGlobalMessages(boolean newShowGlobalMessages) {
		boolean oldShowGlobalMessages = showGlobalMessages;
		showGlobalMessages = newShowGlobalMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES, oldShowGlobalMessages, showGlobalMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowFieldErrorDetails() {
		return showFieldErrorDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowFieldErrorDetails(boolean newShowFieldErrorDetails) {
		boolean oldShowFieldErrorDetails = showFieldErrorDetails;
		showFieldErrorDetails = newShowFieldErrorDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS, oldShowFieldErrorDetails, showFieldErrorDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowFieldErrors() {
		return showFieldErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowFieldErrors(boolean newShowFieldErrors) {
		boolean oldShowFieldErrors = showFieldErrors;
		showFieldErrors = newShowFieldErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS, oldShowFieldErrors, showFieldErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES:
				return isShowGlobalMessages();
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS:
				return isShowFieldErrorDetails();
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS:
				return isShowFieldErrors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES:
				setShowGlobalMessages((Boolean)newValue);
				return;
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS:
				setShowFieldErrorDetails((Boolean)newValue);
				return;
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS:
				setShowFieldErrors((Boolean)newValue);
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
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES:
				setShowGlobalMessages(SHOW_GLOBAL_MESSAGES_EDEFAULT);
				return;
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS:
				setShowFieldErrorDetails(SHOW_FIELD_ERROR_DETAILS_EDEFAULT);
				return;
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS:
				setShowFieldErrors(SHOW_FIELD_ERRORS_EDEFAULT);
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
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_GLOBAL_MESSAGES:
				return showGlobalMessages != SHOW_GLOBAL_MESSAGES_EDEFAULT;
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERROR_DETAILS:
				return showFieldErrorDetails != SHOW_FIELD_ERROR_DETAILS_EDEFAULT;
			case GuigenPackage.STD_MESSAGE_PANEL__SHOW_FIELD_ERRORS:
				return showFieldErrors != SHOW_FIELD_ERRORS_EDEFAULT;
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
		result.append(" (showGlobalMessages: ");
		result.append(showGlobalMessages);
		result.append(", showFieldErrorDetails: ");
		result.append(showFieldErrorDetails);
		result.append(", showFieldErrors: ");
		result.append(showFieldErrors);
		result.append(')');
		return result.toString();
	}

} //StdMessagePanelImpl
