/**
 */
package fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fhir.FhirPackage;
import fhir.ProcessRequestItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Request Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhir.impl.ProcessRequestItemImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequestItemImpl extends BackboneElementImpl implements ProcessRequestItem {
	/**
	 * The cached value of the '{@link #getSequenceLinkId() <em>Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected fhir.Integer sequenceLinkId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequestItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcessRequestItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhir.Integer getSequenceLinkId() {
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceLinkId(fhir.Integer newSequenceLinkId, NotificationChain msgs) {
		fhir.Integer oldSequenceLinkId = sequenceLinkId;
		sequenceLinkId = newSequenceLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID, oldSequenceLinkId, newSequenceLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceLinkId(fhir.Integer newSequenceLinkId) {
		if (newSequenceLinkId != sequenceLinkId) {
			NotificationChain msgs = null;
			if (sequenceLinkId != null)
				msgs = ((InternalEObject)sequenceLinkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID, null, msgs);
			if (newSequenceLinkId != null)
				msgs = ((InternalEObject)newSequenceLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID, null, msgs);
			msgs = basicSetSequenceLinkId(newSequenceLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID, newSequenceLinkId, newSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID:
				return basicSetSequenceLinkId(null, msgs);
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
			case FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID:
				return getSequenceLinkId();
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
			case FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID:
				setSequenceLinkId((fhir.Integer)newValue);
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
			case FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID:
				setSequenceLinkId((fhir.Integer)null);
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
			case FhirPackage.PROCESS_REQUEST_ITEM__SEQUENCE_LINK_ID:
				return sequenceLinkId != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessRequestItemImpl
