/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Header Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.MessageHeaderSource#getName <em>Name</em>}</li>
 *   <li>{@link fhir.MessageHeaderSource#getSoftware <em>Software</em>}</li>
 *   <li>{@link fhir.MessageHeaderSource#getVersion <em>Version</em>}</li>
 *   <li>{@link fhir.MessageHeaderSource#getContact <em>Contact</em>}</li>
 *   <li>{@link fhir.MessageHeaderSource#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getMessageHeaderSource()
 * @model extendedMetaData="name='MessageHeader.Source' kind='elementOnly'"
 * @generated
 */
public interface MessageHeaderSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable name for the source system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhir.String)
	 * @see fhir.FhirPackage#getMessageHeaderSource_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getName();

	/**
	 * Sets the value of the '{@link fhir.MessageHeaderSource#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May include configuration or other information useful in debugging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(fhir.String)
	 * @see fhir.FhirPackage#getMessageHeaderSource_Software()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='software' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getSoftware();

	/**
	 * Sets the value of the '{@link fhir.MessageHeaderSource#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can convey versions of multiple systems in situations where a message passes through multiple hands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhir.String)
	 * @see fhir.FhirPackage#getMessageHeaderSource_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getVersion();

	/**
	 * Sets the value of the '{@link fhir.MessageHeaderSource#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An e-mail, phone, website or other contact point to use to resolve issues with message communications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(ContactPoint)
	 * @see fhir.FhirPackage#getMessageHeaderSource_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getContact();

	/**
	 * Sets the value of the '{@link fhir.MessageHeaderSource#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the routing target to send acknowledgements to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Uri)
	 * @see fhir.FhirPackage#getMessageHeaderSource_Endpoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getEndpoint();

	/**
	 * Sets the value of the '{@link fhir.MessageHeaderSource#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Uri value);

} // MessageHeaderSource
