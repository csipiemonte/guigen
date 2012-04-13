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

import it.csi.mddtools.guigen.CommandOnWidgets;
import it.csi.mddtools.guigen.GuigenPackage;
import it.csi.mddtools.guigen.Menu;
import it.csi.mddtools.guigen.VisibilityCommand;
import it.csi.mddtools.guigen.Widget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.VisibilityCommandImpl#getTargetWidgets <em>Target Widgets</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.VisibilityCommandImpl#getTargetMenuElement <em>Target Menu Element</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.VisibilityCommandImpl#isShow <em>Show</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisibilityCommandImpl extends CommandImpl implements VisibilityCommand {
	/**
	 * The cached value of the '{@link #getTargetWidgets() <em>Target Widgets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> targetWidgets;

	/**
	 * The cached value of the '{@link #getTargetMenuElement() <em>Target Menu Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMenuElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> targetMenuElement;

	/**
	 * The default value of the '{@link #isShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShow()
	 * @generated
	 * @ordered
	 */
	protected boolean show = SHOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.VISIBILITY_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getTargetWidgets() {
		if (targetWidgets == null) {
			targetWidgets = new EObjectResolvingEList<Widget>(Widget.class, this, GuigenPackage.VISIBILITY_COMMAND__TARGET_WIDGETS);
		}
		return targetWidgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getTargetMenuElement() {
		if (targetMenuElement == null) {
			targetMenuElement = new EObjectResolvingEList<Menu>(Menu.class, this, GuigenPackage.VISIBILITY_COMMAND__TARGET_MENU_ELEMENT);
		}
		return targetMenuElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(boolean newShow) {
		boolean oldShow = show;
		show = newShow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.VISIBILITY_COMMAND__SHOW, oldShow, show));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_WIDGETS:
				return getTargetWidgets();
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_MENU_ELEMENT:
				return getTargetMenuElement();
			case GuigenPackage.VISIBILITY_COMMAND__SHOW:
				return isShow();
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
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_WIDGETS:
				getTargetWidgets().clear();
				getTargetWidgets().addAll((Collection<? extends Widget>)newValue);
				return;
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_MENU_ELEMENT:
				getTargetMenuElement().clear();
				getTargetMenuElement().addAll((Collection<? extends Menu>)newValue);
				return;
			case GuigenPackage.VISIBILITY_COMMAND__SHOW:
				setShow((Boolean)newValue);
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
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_WIDGETS:
				getTargetWidgets().clear();
				return;
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_MENU_ELEMENT:
				getTargetMenuElement().clear();
				return;
			case GuigenPackage.VISIBILITY_COMMAND__SHOW:
				setShow(SHOW_EDEFAULT);
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
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_WIDGETS:
				return targetWidgets != null && !targetWidgets.isEmpty();
			case GuigenPackage.VISIBILITY_COMMAND__TARGET_MENU_ELEMENT:
				return targetMenuElement != null && !targetMenuElement.isEmpty();
			case GuigenPackage.VISIBILITY_COMMAND__SHOW:
				return show != SHOW_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommandOnWidgets.class) {
			switch (derivedFeatureID) {
				case GuigenPackage.VISIBILITY_COMMAND__TARGET_WIDGETS: return GuigenPackage.COMMAND_ON_WIDGETS__TARGET_WIDGETS;
				case GuigenPackage.VISIBILITY_COMMAND__TARGET_MENU_ELEMENT: return GuigenPackage.COMMAND_ON_WIDGETS__TARGET_MENU_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommandOnWidgets.class) {
			switch (baseFeatureID) {
				case GuigenPackage.COMMAND_ON_WIDGETS__TARGET_WIDGETS: return GuigenPackage.VISIBILITY_COMMAND__TARGET_WIDGETS;
				case GuigenPackage.COMMAND_ON_WIDGETS__TARGET_MENU_ELEMENT: return GuigenPackage.VISIBILITY_COMMAND__TARGET_MENU_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (show: ");
		result.append(show);
		result.append(')');
		return result.toString();
	}

} //VisibilityCommandImpl
