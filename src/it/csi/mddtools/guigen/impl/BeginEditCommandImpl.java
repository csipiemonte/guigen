/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.BeginEditCommand;
import it.csi.mddtools.guigen.GuigenPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Begin Edit Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.BeginEditCommandImpl#getDataEdited <em>Data Edited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeginEditCommandImpl extends CommandImpl implements BeginEditCommand {
	/**
	 * The cached value of the '{@link #getDataEdited() <em>Data Edited</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEdited()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationData> dataEdited;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeginEditCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.BEGIN_EDIT_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getDataEdited() {
		if (dataEdited == null) {
			dataEdited = new EObjectResolvingEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.BEGIN_EDIT_COMMAND__DATA_EDITED);
		}
		return dataEdited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigenPackage.BEGIN_EDIT_COMMAND__DATA_EDITED:
				return getDataEdited();
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
			case GuigenPackage.BEGIN_EDIT_COMMAND__DATA_EDITED:
				getDataEdited().clear();
				getDataEdited().addAll((Collection<? extends ApplicationData>)newValue);
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
			case GuigenPackage.BEGIN_EDIT_COMMAND__DATA_EDITED:
				getDataEdited().clear();
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
			case GuigenPackage.BEGIN_EDIT_COMMAND__DATA_EDITED:
				return dataEdited != null && !dataEdited.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BeginEditCommandImpl
