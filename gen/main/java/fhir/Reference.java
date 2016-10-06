/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference from one resource to another.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.Reference#getReference <em>Reference</em>}</li>
 *   <li>{@link fhir.Reference#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getReference()
 * @model extendedMetaData="name='Reference' kind='elementOnly'"
 * @generated
 */
public interface Reference extends Element {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a location at which the other resource is found. The reference may be a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(fhir.String)
	 * @see fhir.FhirPackage#getReference_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getReference();

	/**
	 * Sets the value of the '{@link fhir.Reference#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plain text narrative that identifies the resource in addition to the resource reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhir.String)
	 * @see fhir.FhirPackage#getReference_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link fhir.Reference#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhir.String value);

} // Reference
