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

import it.csi.mddtools.guigen.Calendar;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.CalendarImpl#isSelectYear <em>Select Year</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.CalendarImpl#isSelectMonth <em>Select Month</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.CalendarImpl#getSelectYearRange <em>Select Year Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalendarImpl extends DataWidgetImpl implements Calendar {
	/**
	 * The default value of the '{@link #isSelectYear() <em>Select Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectYear()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECT_YEAR_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSelectYear() <em>Select Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectYear()
	 * @generated
	 * @ordered
	 */
	protected boolean selectYear = SELECT_YEAR_EDEFAULT;
	/**
	 * The default value of the '{@link #isSelectMonth() <em>Select Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectMonth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECT_MONTH_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSelectMonth() <em>Select Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectMonth()
	 * @generated
	 * @ordered
	 */
	protected boolean selectMonth = SELECT_MONTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getSelectYearRange() <em>Select Year Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectYearRange()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_YEAR_RANGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSelectYearRange() <em>Select Year Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectYearRange()
	 * @generated
	 * @ordered
	 */
	protected String selectYearRange = SELECT_YEAR_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.CALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectYear() {
		return selectYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectYear(boolean newSelectYear) {
		boolean oldSelectYear = selectYear;
		selectYear = newSelectYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CALENDAR__SELECT_YEAR, oldSelectYear, selectYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectMonth() {
		return selectMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectMonth(boolean newSelectMonth) {
		boolean oldSelectMonth = selectMonth;
		selectMonth = newSelectMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CALENDAR__SELECT_MONTH, oldSelectMonth, selectMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectYearRange() {
		return selectYearRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectYearRange(String newSelectYearRange) {
		String oldSelectYearRange = selectYearRange;
		selectYearRange = newSelectYearRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.CALENDAR__SELECT_YEAR_RANGE, oldSelectYearRange, selectYearRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.CALENDAR__SELECT_YEAR:
				return isSelectYear();
			case GuigenPackage.CALENDAR__SELECT_MONTH:
				return isSelectMonth();
			case GuigenPackage.CALENDAR__SELECT_YEAR_RANGE:
				return getSelectYearRange();
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
			case GuigenPackage.CALENDAR__SELECT_YEAR:
				setSelectYear((Boolean)newValue);
				return;
			case GuigenPackage.CALENDAR__SELECT_MONTH:
				setSelectMonth((Boolean)newValue);
				return;
			case GuigenPackage.CALENDAR__SELECT_YEAR_RANGE:
				setSelectYearRange((String)newValue);
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
			case GuigenPackage.CALENDAR__SELECT_YEAR:
				setSelectYear(SELECT_YEAR_EDEFAULT);
				return;
			case GuigenPackage.CALENDAR__SELECT_MONTH:
				setSelectMonth(SELECT_MONTH_EDEFAULT);
				return;
			case GuigenPackage.CALENDAR__SELECT_YEAR_RANGE:
				setSelectYearRange(SELECT_YEAR_RANGE_EDEFAULT);
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
			case GuigenPackage.CALENDAR__SELECT_YEAR:
				return selectYear != SELECT_YEAR_EDEFAULT;
			case GuigenPackage.CALENDAR__SELECT_MONTH:
				return selectMonth != SELECT_MONTH_EDEFAULT;
			case GuigenPackage.CALENDAR__SELECT_YEAR_RANGE:
				return SELECT_YEAR_RANGE_EDEFAULT == null ? selectYearRange != null : !SELECT_YEAR_RANGE_EDEFAULT.equals(selectYearRange);
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
		result.append(" (selectYear: ");
		result.append(selectYear);
		result.append(", selectMonth: ");
		result.append(selectMonth);
		result.append(", selectYearRange: ");
		result.append(selectYearRange);
		result.append(')');
		return result.toString();
	}

} //CalendarImpl
