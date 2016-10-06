/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Metadata</b></em>'.
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
 *   <li>{@link fhir.TestScriptMetadata#getLink <em>Link</em>}</li>
 *   <li>{@link fhir.TestScriptMetadata#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getTestScriptMetadata()
 * @model extendedMetaData="name='TestScript.Metadata' kind='elementOnly'"
 * @generated
 */
public interface TestScriptMetadata extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.TestScriptLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to the FHIR specification that this test is covering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see fhir.FhirPackage#getTestScriptMetadata_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptLink> getLink();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.TestScriptCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see fhir.FhirPackage#getTestScriptMetadata_Capability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='capability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptCapability> getCapability();

} // TestScriptMetadata
