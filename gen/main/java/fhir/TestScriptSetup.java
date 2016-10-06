/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup</b></em>'.
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
 *   <li>{@link fhir.TestScriptSetup#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link fhir.TestScriptSetup#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getTestScriptSetup()
 * @model extendedMetaData="name='TestScript.Setup' kind='elementOnly'"
 * @generated
 */
public interface TestScriptSetup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(TestScriptMetadata)
	 * @see fhir.FhirPackage#getTestScriptSetup_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptMetadata getMetadata();

	/**
	 * Sets the value of the '{@link fhir.TestScriptSetup#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(TestScriptMetadata value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.TestScriptAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action would contain either an operation or an assertion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fhir.FhirPackage#getTestScriptSetup_Action()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptAction> getAction();

} // TestScriptSetup
