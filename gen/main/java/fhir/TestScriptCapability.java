/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Capability</b></em>'.
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
 *   <li>{@link fhir.TestScriptCapability#getRequired <em>Required</em>}</li>
 *   <li>{@link fhir.TestScriptCapability#getValidated <em>Validated</em>}</li>
 *   <li>{@link fhir.TestScriptCapability#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.TestScriptCapability#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhir.TestScriptCapability#getLink <em>Link</em>}</li>
 *   <li>{@link fhir.TestScriptCapability#getConformance <em>Conformance</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getTestScriptCapability()
 * @model extendedMetaData="name='TestScript.Capability' kind='elementOnly'"
 * @generated
 */
public interface TestScriptCapability extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(fhir.Boolean)
	 * @see fhir.FhirPackage#getTestScriptCapability_Required()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link fhir.TestScriptCapability#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Validated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated</em>' containment reference.
	 * @see #setValidated(fhir.Boolean)
	 * @see fhir.FhirPackage#getTestScriptCapability_Validated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validated' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getValidated();

	/**
	 * Sets the value of the '{@link fhir.TestScriptCapability#getValidated <em>Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated</em>' containment reference.
	 * @see #getValidated()
	 * @generated
	 */
	void setValidated(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the capabilities that this test script is requiring the server to support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptCapability_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDescription();

	/**
	 * Sets the value of the '{@link fhir.TestScriptCapability#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which server these requirements apply to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(fhir.Integer)
	 * @see fhir.FhirPackage#getTestScriptCapability_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Integer getDestination();

	/**
	 * Sets the value of the '{@link fhir.TestScriptCapability#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see fhir.FhirPackage#getTestScriptCapability_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getLink();

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference.
	 * @see #setConformance(Reference)
	 * @see fhir.FhirPackage#getTestScriptCapability_Conformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conformance' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getConformance();

	/**
	 * Sets the value of the '{@link fhir.TestScriptCapability#getConformance <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' containment reference.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Reference value);

} // TestScriptCapability
