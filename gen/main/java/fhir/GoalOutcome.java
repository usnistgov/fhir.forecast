/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.GoalOutcome#getResultCodeableConcept <em>Result Codeable Concept</em>}</li>
 *   <li>{@link fhir.GoalOutcome#getResultReference <em>Result Reference</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getGoalOutcome()
 * @model extendedMetaData="name='Goal.Outcome' kind='elementOnly'"
 * @generated
 */
public interface GoalOutcome extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Result Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of what's changed (or not changed). (choose any one of result*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Codeable Concept</em>' containment reference.
	 * @see #setResultCodeableConcept(CodeableConcept)
	 * @see fhir.FhirPackage#getGoalOutcome_ResultCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getResultCodeableConcept();

	/**
	 * Sets the value of the '{@link fhir.GoalOutcome#getResultCodeableConcept <em>Result Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Codeable Concept</em>' containment reference.
	 * @see #getResultCodeableConcept()
	 * @generated
	 */
	void setResultCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Result Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of what's changed (or not changed). (choose any one of result*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Reference</em>' containment reference.
	 * @see #setResultReference(Reference)
	 * @see fhir.FhirPackage#getGoalOutcome_ResultReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResultReference();

	/**
	 * Sets the value of the '{@link fhir.GoalOutcome#getResultReference <em>Result Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Reference</em>' containment reference.
	 * @see #getResultReference()
	 * @generated
	 */
	void setResultReference(Reference value);

} // GoalOutcome
