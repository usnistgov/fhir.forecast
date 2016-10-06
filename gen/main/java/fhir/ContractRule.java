/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Rule</b></em>'.
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
 *   <li>{@link fhir.ContractRule#getContentAttachment <em>Content Attachment</em>}</li>
 *   <li>{@link fhir.ContractRule#getContentReference <em>Content Reference</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getContractRule()
 * @model extendedMetaData="name='Contract.Rule' kind='elementOnly'"
 * @generated
 */
public interface ContractRule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Content Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal). (choose any one of content*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Attachment</em>' containment reference.
	 * @see #setContentAttachment(Attachment)
	 * @see fhir.FhirPackage#getContractRule_ContentAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getContentAttachment();

	/**
	 * Sets the value of the '{@link fhir.ContractRule#getContentAttachment <em>Content Attachment</em>}' containment reference.
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
	 * Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal). (choose any one of content*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Reference</em>' containment reference.
	 * @see #setContentReference(Reference)
	 * @see fhir.FhirPackage#getContractRule_ContentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContentReference();

	/**
	 * Sets the value of the '{@link fhir.ContractRule#getContentReference <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Reference</em>' containment reference.
	 * @see #getContentReference()
	 * @generated
	 */
	void setContentReference(Reference value);

} // ContractRule
