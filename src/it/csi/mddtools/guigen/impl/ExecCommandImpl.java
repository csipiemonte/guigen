/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen.impl;

import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.CommandOutcome;
import it.csi.mddtools.guigen.ExecCommand;
import it.csi.mddtools.guigen.GuigenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecCommandImpl#getResults <em>Results</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecCommandImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecCommandImpl#getPostExecData <em>Post Exec Data</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecCommandImpl#getTemplateCartridgeID <em>Template Cartridge ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecCommandImpl#getTemplateFragmentID <em>Template Fragment ID</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.impl.ExecCommandImpl#getExtraModels <em>Extra Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecCommandImpl extends CommandImpl implements ExecCommand {
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandOutcome> results;

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
	 * The default value of the '{@link #getTemplateCartridgeID() <em>Template Cartridge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateCartridgeID()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_CARTRIDGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateCartridgeID() <em>Template Cartridge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateCartridgeID()
	 * @generated
	 * @ordered
	 */
	protected String templateCartridgeID = TEMPLATE_CARTRIDGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateFragmentID() <em>Template Fragment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateFragmentID()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_FRAGMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateFragmentID() <em>Template Fragment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateFragmentID()
	 * @generated
	 * @ordered
	 */
	protected String templateFragmentID = TEMPLATE_FRAGMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtraModels() <em>Extra Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraModels()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> extraModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigenPackage.Literals.EXEC_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandOutcome> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<CommandOutcome>(CommandOutcome.class, this, GuigenPackage.EXEC_COMMAND__RESULTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EXEC_COMMAND__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationData> getPostExecData() {
		if (postExecData == null) {
			postExecData = new EObjectResolvingEList<ApplicationData>(ApplicationData.class, this, GuigenPackage.EXEC_COMMAND__POST_EXEC_DATA);
		}
		return postExecData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateCartridgeID() {
		return templateCartridgeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateCartridgeID(String newTemplateCartridgeID) {
		String oldTemplateCartridgeID = templateCartridgeID;
		templateCartridgeID = newTemplateCartridgeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EXEC_COMMAND__TEMPLATE_CARTRIDGE_ID, oldTemplateCartridgeID, templateCartridgeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateFragmentID() {
		return templateFragmentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateFragmentID(String newTemplateFragmentID) {
		String oldTemplateFragmentID = templateFragmentID;
		templateFragmentID = newTemplateFragmentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigenPackage.EXEC_COMMAND__TEMPLATE_FRAGMENT_ID, oldTemplateFragmentID, templateFragmentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getExtraModels() {
		if (extraModels == null) {
			extraModels = new EObjectResolvingEList<EObject>(EObject.class, this, GuigenPackage.EXEC_COMMAND__EXTRA_MODELS);
		}
		return extraModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuigenPackage.EXEC_COMMAND__RESULTS:
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
			case GuigenPackage.EXEC_COMMAND__RESULTS:
				return getResults();
			case GuigenPackage.EXEC_COMMAND__METHOD_NAME:
				return getMethodName();
			case GuigenPackage.EXEC_COMMAND__POST_EXEC_DATA:
				return getPostExecData();
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_CARTRIDGE_ID:
				return getTemplateCartridgeID();
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_FRAGMENT_ID:
				return getTemplateFragmentID();
			case GuigenPackage.EXEC_COMMAND__EXTRA_MODELS:
				return getExtraModels();
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
			case GuigenPackage.EXEC_COMMAND__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends CommandOutcome>)newValue);
				return;
			case GuigenPackage.EXEC_COMMAND__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case GuigenPackage.EXEC_COMMAND__POST_EXEC_DATA:
				getPostExecData().clear();
				getPostExecData().addAll((Collection<? extends ApplicationData>)newValue);
				return;
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_CARTRIDGE_ID:
				setTemplateCartridgeID((String)newValue);
				return;
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_FRAGMENT_ID:
				setTemplateFragmentID((String)newValue);
				return;
			case GuigenPackage.EXEC_COMMAND__EXTRA_MODELS:
				getExtraModels().clear();
				getExtraModels().addAll((Collection<? extends EObject>)newValue);
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
			case GuigenPackage.EXEC_COMMAND__RESULTS:
				getResults().clear();
				return;
			case GuigenPackage.EXEC_COMMAND__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case GuigenPackage.EXEC_COMMAND__POST_EXEC_DATA:
				getPostExecData().clear();
				return;
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_CARTRIDGE_ID:
				setTemplateCartridgeID(TEMPLATE_CARTRIDGE_ID_EDEFAULT);
				return;
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_FRAGMENT_ID:
				setTemplateFragmentID(TEMPLATE_FRAGMENT_ID_EDEFAULT);
				return;
			case GuigenPackage.EXEC_COMMAND__EXTRA_MODELS:
				getExtraModels().clear();
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
			case GuigenPackage.EXEC_COMMAND__RESULTS:
				return results != null && !results.isEmpty();
			case GuigenPackage.EXEC_COMMAND__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case GuigenPackage.EXEC_COMMAND__POST_EXEC_DATA:
				return postExecData != null && !postExecData.isEmpty();
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_CARTRIDGE_ID:
				return TEMPLATE_CARTRIDGE_ID_EDEFAULT == null ? templateCartridgeID != null : !TEMPLATE_CARTRIDGE_ID_EDEFAULT.equals(templateCartridgeID);
			case GuigenPackage.EXEC_COMMAND__TEMPLATE_FRAGMENT_ID:
				return TEMPLATE_FRAGMENT_ID_EDEFAULT == null ? templateFragmentID != null : !TEMPLATE_FRAGMENT_ID_EDEFAULT.equals(templateFragmentID);
			case GuigenPackage.EXEC_COMMAND__EXTRA_MODELS:
				return extraModels != null && !extraModels.isEmpty();
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
		result.append(", templateCartridgeID: ");
		result.append(templateCartridgeID);
		result.append(", templateFragmentID: ");
		result.append(templateFragmentID);
		result.append(')');
		return result.toString();
	}

} //ExecCommandImpl
