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

import it.csi.mddtools.guigen.GridWidgetLayoutSpec;
import it.csi.mddtools.guigen.GuigenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Widget Layout Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl#getRow <em>Row</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl#getHspan <em>Hspan</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.GridWidgetLayoutSpecImpl#getVspan <em>Vspan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridWidgetLayoutSpecImpl extends WidgetLayoutSpecifierImpl implements GridWidgetLayoutSpec {
	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHspan() <em>Hspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHspan()
	 * @generated
	 * @ordered
	 */
	protected static final int HSPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHspan() <em>Hspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHspan()
	 * @generated
	 * @ordered
	 */
	protected int hspan = HSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVspan() <em>Vspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVspan()
	 * @generated
	 * @ordered
	 */
	protected static final int VSPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVspan() <em>Vspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVspan()
	 * @generated
	 * @ordered
	 */
	protected int vspan = VSPAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridWidgetLayoutSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.GRID_WIDGET_LAYOUT_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHspan() {
		return hspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHspan(int newHspan) {
		int oldHspan = hspan;
		hspan = newHspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__HSPAN, oldHspan, hspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVspan() {
		return vspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVspan(int newVspan) {
		int oldVspan = vspan;
		vspan = newVspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__VSPAN, oldVspan, vspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__ROW:
				return getRow();
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__COLUMN:
				return getColumn();
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__HSPAN:
				return getHspan();
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__VSPAN:
				return getVspan();
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
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__ROW:
				setRow((Integer)newValue);
				return;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__COLUMN:
				setColumn((Integer)newValue);
				return;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__HSPAN:
				setHspan((Integer)newValue);
				return;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__VSPAN:
				setVspan((Integer)newValue);
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
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__HSPAN:
				setHspan(HSPAN_EDEFAULT);
				return;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__VSPAN:
				setVspan(VSPAN_EDEFAULT);
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
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__ROW:
				return row != ROW_EDEFAULT;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__COLUMN:
				return column != COLUMN_EDEFAULT;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__HSPAN:
				return hspan != HSPAN_EDEFAULT;
			case GuigenPackage.GRID_WIDGET_LAYOUT_SPEC__VSPAN:
				return vspan != VSPAN_EDEFAULT;
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
		result.append(" (row: ");
		result.append(row);
		result.append(", column: ");
		result.append(column);
		result.append(", hspan: ");
		result.append(hspan);
		result.append(", vspan: ");
		result.append(vspan);
		result.append(')');
		return result.toString();
	}

} //GridWidgetLayoutSpecImpl
