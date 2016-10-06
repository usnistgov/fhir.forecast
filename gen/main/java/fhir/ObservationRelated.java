/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurements and simple assertions made about a patient, device or other subject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ObservationRelated#getType <em>Type</em>}</li>
 *   <li>{@link fhir.ObservationRelated#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getObservationRelated()
 * @model extendedMetaData="name='Observation.Related' kind='elementOnly'"
 * @generated
 */
public interface ObservationRelated extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the kind of relationship that exists with the target resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ObservationRelationshipType)
	 * @see fhir.FhirPackage#getObservationRelated_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationRelationshipType getType();

	/**
	 * Sets the value of the '{@link fhir.ObservationRelated#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ObservationRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see fhir.FhirPackage#getObservationRelated_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link fhir.ObservationRelated#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

} // ObservationRelated
