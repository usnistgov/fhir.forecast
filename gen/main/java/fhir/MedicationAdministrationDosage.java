/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Administration Dosage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.MedicationAdministrationDosage#getText <em>Text</em>}</li>
 *   <li>{@link fhir.MedicationAdministrationDosage#getSiteCodeableConcept <em>Site Codeable Concept</em>}</li>
 *   <li>{@link fhir.MedicationAdministrationDosage#getSiteReference <em>Site Reference</em>}</li>
 *   <li>{@link fhir.MedicationAdministrationDosage#getRoute <em>Route</em>}</li>
 *   <li>{@link fhir.MedicationAdministrationDosage#getMethod <em>Method</em>}</li>
 *   <li>{@link fhir.MedicationAdministrationDosage#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhir.MedicationAdministrationDosage#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link fhir.MedicationAdministrationDosage#getRateRange <em>Rate Range</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getMedicationAdministrationDosage()
 * @model extendedMetaData="name='MedicationAdministration.Dosage' kind='elementOnly'"
 * @generated
 */
public interface MedicationAdministrationDosage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhir.String)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getText();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Site Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm". (choose any one of site*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Codeable Concept</em>' containment reference.
	 * @see #setSiteCodeableConcept(CodeableConcept)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_SiteCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSiteCodeableConcept();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getSiteCodeableConcept <em>Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Codeable Concept</em>' containment reference.
	 * @see #getSiteCodeableConcept()
	 * @generated
	 */
	void setSiteCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Site Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm". (choose any one of site*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Reference</em>' containment reference.
	 * @see #setSiteReference(Reference)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_SiteReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSiteReference();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getSiteReference <em>Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Reference</em>' containment reference.
	 * @see #getSiteReference()
	 * @generated
	 */
	void setSiteReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Rate Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #setRateRatio(Ratio)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_RateRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRateRatio();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getRateRatio <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #getRateRatio()
	 * @generated
	 */
	void setRateRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Rate Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Range</em>' containment reference.
	 * @see #setRateRange(Range)
	 * @see fhir.FhirPackage#getMedicationAdministrationDosage_RateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRateRange();

	/**
	 * Sets the value of the '{@link fhir.MedicationAdministrationDosage#getRateRange <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Range</em>' containment reference.
	 * @see #getRateRange()
	 * @generated
	 */
	void setRateRange(Range value);

} // MedicationAdministrationDosage
