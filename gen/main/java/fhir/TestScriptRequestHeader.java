/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Request Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.TestScriptRequestHeader#getField <em>Field</em>}</li>
 *   <li>{@link fhir.TestScriptRequestHeader#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getTestScriptRequestHeader()
 * @model extendedMetaData="name='TestScript.RequestHeader' kind='elementOnly'"
 * @generated
 */
public interface TestScriptRequestHeader extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HTTP header field e.g. "Accept".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptRequestHeader_Field()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getField();

	/**
	 * Sets the value of the '{@link fhir.TestScriptRequestHeader#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the header e.g. "application/xml".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptRequestHeader_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getValue();

	/**
	 * Sets the value of the '{@link fhir.TestScriptRequestHeader#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhir.String value);

} // TestScriptRequestHeader
