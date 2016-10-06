/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Manifest Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifest that defines a set of documents.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.DocumentManifestContent#getPAttachment <em>PAttachment</em>}</li>
 *   <li>{@link fhir.DocumentManifestContent#getPReference <em>PReference</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDocumentManifestContent()
 * @model extendedMetaData="name='DocumentManifest.Content' kind='elementOnly'"
 * @generated
 */
public interface DocumentManifestContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>PAttachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed. (choose any one of p*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PAttachment</em>' containment reference.
	 * @see #setPAttachment(Attachment)
	 * @see fhir.FhirPackage#getDocumentManifestContent_PAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getPAttachment();

	/**
	 * Sets the value of the '{@link fhir.DocumentManifestContent#getPAttachment <em>PAttachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PAttachment</em>' containment reference.
	 * @see #getPAttachment()
	 * @generated
	 */
	void setPAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>PReference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed. (choose any one of p*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PReference</em>' containment reference.
	 * @see #setPReference(Reference)
	 * @see fhir.FhirPackage#getDocumentManifestContent_PReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPReference();

	/**
	 * Sets the value of the '{@link fhir.DocumentManifestContent#getPReference <em>PReference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PReference</em>' containment reference.
	 * @see #getPReference()
	 * @generated
	 */
	void setPReference(Reference value);

} // DocumentManifestContent
