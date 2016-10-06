/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.PatientCommunication#getLanguage <em>Language</em>}</li>
 *   <li>{@link fhir.PatientCommunication#getPreferred <em>Preferred</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getPatientCommunication()
 * @model extendedMetaData="name='Patient.Communication' kind='elementOnly'"
 * @generated
 */
public interface PatientCommunication extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(CodeableConcept)
	 * @see fhir.FhirPackage#getPatientCommunication_Language()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLanguage();

	/**
	 * Sets the value of the '{@link fhir.PatientCommunication#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred</em>' containment reference.
	 * @see #setPreferred(fhir.Boolean)
	 * @see fhir.FhirPackage#getPatientCommunication_Preferred()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preferred' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getPreferred();

	/**
	 * Sets the value of the '{@link fhir.PatientCommunication#getPreferred <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' containment reference.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(fhir.Boolean value);

} // PatientCommunication
