/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Manifest Related</b></em>'.
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
 *   <li>{@link fhir.DocumentManifestRelated#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.DocumentManifestRelated#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDocumentManifestRelated()
 * @model extendedMetaData="name='DocumentManifest.Related' kind='elementOnly'"
 * @generated
 */
public interface DocumentManifestRelated extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhir.FhirPackage#getDocumentManifestRelated_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhir.DocumentManifestRelated#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related Resource to this DocumentManifest. For example, Order, DiagnosticOrder,  Procedure, EligibilityRequest, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(Reference)
	 * @see fhir.FhirPackage#getDocumentManifestRelated_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRef();

	/**
	 * Sets the value of the '{@link fhir.DocumentManifestRelated#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Reference value);

} // DocumentManifestRelated
