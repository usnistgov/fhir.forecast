/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The formal description of a single piece of information that can be gathered and reported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.DataElementMapping#getIdentity <em>Identity</em>}</li>
 *   <li>{@link fhir.DataElementMapping#getUri <em>Uri</em>}</li>
 *   <li>{@link fhir.DataElementMapping#getName <em>Name</em>}</li>
 *   <li>{@link fhir.DataElementMapping#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDataElementMapping()
 * @model extendedMetaData="name='DataElement.Mapping' kind='elementOnly'"
 * @generated
 */
public interface DataElementMapping extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference.
	 * @see #setIdentity(Id)
	 * @see fhir.FhirPackage#getDataElementMapping_Identity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identity' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getIdentity();

	/**
	 * Sets the value of the '{@link fhir.DataElementMapping#getIdentity <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' containment reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(Id value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that identifies the specification that this mapping is expressed to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(Uri)
	 * @see fhir.FhirPackage#getDataElementMapping_Uri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUri();

	/**
	 * Sets the value of the '{@link fhir.DataElementMapping#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name for the specification that is being mapped to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhir.String)
	 * @see fhir.FhirPackage#getDataElementMapping_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getName();

	/**
	 * Sets the value of the '{@link fhir.DataElementMapping#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(fhir.String)
	 * @see fhir.FhirPackage#getDataElementMapping_Comments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comments' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getComments();

	/**
	 * Sets the value of the '{@link fhir.DataElementMapping#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(fhir.String value);

} // DataElementMapping
