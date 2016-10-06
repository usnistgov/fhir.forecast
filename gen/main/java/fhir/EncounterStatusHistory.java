/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Status History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.EncounterStatusHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link fhir.EncounterStatusHistory#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getEncounterStatusHistory()
 * @model extendedMetaData="name='Encounter.StatusHistory' kind='elementOnly'"
 * @generated
 */
public interface EncounterStatusHistory extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * planned | arrived | in-progress | onleave | finished | cancelled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EncounterState)
	 * @see fhir.FhirPackage#getEncounterStatusHistory_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterState getStatus();

	/**
	 * Sets the value of the '{@link fhir.EncounterStatusHistory#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EncounterState value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the episode was in the specified status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhir.FhirPackage#getEncounterStatusHistory_Period()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhir.EncounterStatusHistory#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // EncounterStatusHistory
