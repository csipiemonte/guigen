/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ActionResult;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ExecAction;
import it.csi.mddtools.guigen.GuigenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecActionImpl#getResults <em>Results</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecActionImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecActionImpl#getPostExecData <em>Post Exec Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecActionImpl extends ActionImpl implements ExecAction {
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionResult> results;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPostExecData() <em>Post Exec Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostExecData()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationData> postExecData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.EXEC_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<ActionResult>(ActionResult.class, this, GuigenPackage.EXEC_ACTION__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EXEC_ACTION__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getPostExecData() {
		if (postExecData == null) {
			postExecData = new EObjectResolvingEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.EXEC_ACTION__POST_EXEC_DATA);
		}
		return postExecData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.EXEC_ACTION__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
			case GuigenPackage.EXEC_ACTION__RESULTS:
				return getResults();
			case GuigenPackage.EXEC_ACTION__METHOD_NAME:
				return getMethodName();
			case GuigenPackage.EXEC_ACTION__POST_EXEC_DATA:
				return getPostExecData();
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
			case GuigenPackage.EXEC_ACTION__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends ActionResult>)newValue);
				return;
			case GuigenPackage.EXEC_ACTION__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case GuigenPackage.EXEC_ACTION__POST_EXEC_DATA:
				getPostExecData().clear();
				getPostExecData().addAll((Collection<? extends ApplicationData>)newValue);
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
			case GuigenPackage.EXEC_ACTION__RESULTS:
				getResults().clear();
				return;
			case GuigenPackage.EXEC_ACTION__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case GuigenPackage.EXEC_ACTION__POST_EXEC_DATA:
				getPostExecData().clear();
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
			case GuigenPackage.EXEC_ACTION__RESULTS:
				return results != null && !results.isEmpty();
			case GuigenPackage.EXEC_ACTION__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case GuigenPackage.EXEC_ACTION__POST_EXEC_DATA:
				return postExecData != null && !postExecData.isEmpty();
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
		result.append(" (methodName: ");
		result.append(methodName);
		result.append(')');
		return result.toString();
	}

} //ExecActionImpl
