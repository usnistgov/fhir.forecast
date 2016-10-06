/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.CommunicationPayload#getContentString <em>Content String</em>}</li>
 *   <li>{@link fhir.CommunicationPayload#getContentAttachment <em>Content Attachment</em>}</li>
 *   <li>{@link fhir.CommunicationPayload#getContentReference <em>Content Reference</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getCommunicationPayload()
 * @model extendedMetaData="name='Communication.Payload' kind='elementOnly'"
 * @generated
 */
public interface CommunicationPayload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Content String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A communicated content (or for multi-part communications, one portion of the communication). (choose any one of content*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content String</em>' containment reference.
	 * @see #setContentString(fhir.String)
	 * @see fhir.FhirPackage#getCommunicationPayload_ContentString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentString' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getContentString();

	/**
	 * Sets the value of the '{@link fhir.CommunicationPayload#getContentString <em>Content String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content String</em>' containment reference.
	 * @see #getContentString()
	 * @generated
	 */
	void setContentString(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Content Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A communicated content (or for multi-part communications, one portion of the communication). (choose any one of content*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Attachment</em>' containment reference.
	 * @see #setContentAttachment(Attachment)
	 * @see fhir.FhirPackage#getCommunicationPayload_ContentAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getContentAttachment();

	/**
	 * Sets the value of the '{@link fhir.CommunicationPayload#getContentAttachment <em>Content Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Attachment</em>' containment reference.
	 * @see #getContentAttachment()
	 * @generated
	 */
	void setContentAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Content Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A communicated content (or for multi-part communications, one portion of the communication). (choose any one of content*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Reference</em>' containment reference.
	 * @see #setContentReference(Reference)
	 * @see fhir.FhirPackage#getCommunicationPayload_ContentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContentReference();

	/**
	 * Sets the value of the '{@link fhir.CommunicationPayload#getContentReference <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Reference</em>' containment reference.
	 * @see #getContentReference()
	 * @generated
	 */
	void setContentReference(Reference value);

} // CommunicationPayload
