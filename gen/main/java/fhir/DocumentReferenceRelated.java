/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a document .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.DocumentReferenceRelated#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.DocumentReferenceRelated#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDocumentReferenceRelated()
 * @model extendedMetaData="name='DocumentReference.Related' kind='elementOnly'"
 * @generated
 */
public interface DocumentReferenceRelated extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhir.FhirPackage#getDocumentReferenceRelated_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhir.DocumentReferenceRelated#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(Reference)
	 * @see fhir.FhirPackage#getDocumentReferenceRelated_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRef();

	/**
	 * Sets the value of the '{@link fhir.DocumentReferenceRelated#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Reference value);

} // DocumentReferenceRelated
