/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.AuditEventNetwork#getAddress <em>Address</em>}</li>
 *   <li>{@link fhir.AuditEventNetwork#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getAuditEventNetwork()
 * @model extendedMetaData="name='AuditEvent.Network' kind='elementOnly'"
 * @generated
 */
public interface AuditEventNetwork extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the network access point of the user device for the audit event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(fhir.String)
	 * @see fhir.FhirPackage#getAuditEventNetwork_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getAddress();

	/**
	 * Sets the value of the '{@link fhir.AuditEventNetwork#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the type of network access point that originated the audit event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AuditEventParticipantNetworkType)
	 * @see fhir.FhirPackage#getAuditEventNetwork_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventParticipantNetworkType getType();

	/**
	 * Sets the value of the '{@link fhir.AuditEventNetwork#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AuditEventParticipantNetworkType value);

} // AuditEventNetwork
