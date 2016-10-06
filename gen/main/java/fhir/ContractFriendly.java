/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Friendly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ContractFriendly#getContentAttachment <em>Content Attachment</em>}</li>
 *   <li>{@link fhir.ContractFriendly#getContentReference <em>Content Reference</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getContractFriendly()
 * @model extendedMetaData="name='Contract.Friendly' kind='elementOnly'"
 * @generated
 */
public interface ContractFriendly extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Content Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability. (choose any one of content*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Attachment</em>' containment reference.
	 * @see #setContentAttachment(Attachment)
	 * @see fhir.FhirPackage#getContractFriendly_ContentAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getContentAttachment();

	/**
	 * Sets the value of the '{@link fhir.ContractFriendly#getContentAttachment <em>Content Attachment</em>}' containment reference.
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
	 * Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability. (choose any one of content*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Reference</em>' containment reference.
	 * @see #setContentReference(Reference)
	 * @see fhir.FhirPackage#getContractFriendly_ContentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContentReference();

	/**
	 * Sets the value of the '{@link fhir.ContractFriendly#getContentReference <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Reference</em>' containment reference.
	 * @see #getContentReference()
	 * @generated
	 */
	void setContentReference(Reference value);

} // ContractFriendly
