/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Detail</b></em>'.
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
 *   <li>{@link fhir.AuditEventDetail#getType <em>Type</em>}</li>
 *   <li>{@link fhir.AuditEventDetail#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getAuditEventDetail()
 * @model extendedMetaData="name='AuditEvent.Detail' kind='elementOnly'"
 * @generated
 */
public interface AuditEventDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(fhir.String)
	 * @see fhir.FhirPackage#getAuditEventDetail_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getType();

	/**
	 * Sets the value of the '{@link fhir.AuditEventDetail#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Base64Binary)
	 * @see fhir.FhirPackage#getAuditEventDetail_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getValue();

	/**
	 * Sets the value of the '{@link fhir.AuditEventDetail#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Base64Binary value);

} // AuditEventDetail
