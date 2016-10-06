/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.AppointmentResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.AppointmentResponse#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link fhir.AppointmentResponse#getStart <em>Start</em>}</li>
 *   <li>{@link fhir.AppointmentResponse#getEnd <em>End</em>}</li>
 *   <li>{@link fhir.AppointmentResponse#getParticipantType <em>Participant Type</em>}</li>
 *   <li>{@link fhir.AppointmentResponse#getActor <em>Actor</em>}</li>
 *   <li>{@link fhir.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}</li>
 *   <li>{@link fhir.AppointmentResponse#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getAppointmentResponse()
 * @model extendedMetaData="name='AppointmentResponse' kind='elementOnly'"
 * @generated
 */
public interface AppointmentResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhir.FhirPackage#getAppointmentResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment that this response is replying to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Reference)
	 * @see fhir.FhirPackage#getAppointmentResponse_Appointment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAppointment();

	/**
	 * Sets the value of the '{@link fhir.AppointmentResponse#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Reference value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/Time that the appointment is to take place, or requested new start time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Instant)
	 * @see fhir.FhirPackage#getAppointmentResponse_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link fhir.AppointmentResponse#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Instant value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see fhir.FhirPackage#getAppointmentResponse_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link fhir.AppointmentResponse#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Participant Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role of participant in the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Type</em>' containment reference list.
	 * @see fhir.FhirPackage#getAppointmentResponse_ParticipantType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getParticipantType();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Person, Location/HealthcareService or Device that is participating in the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see fhir.FhirPackage#getAppointmentResponse_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link fhir.AppointmentResponse#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

	/**
	 * Returns the value of the '<em><b>Participant Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Status</em>' containment reference.
	 * @see #setParticipantStatus(ParticipantStatus)
	 * @see fhir.FhirPackage#getAppointmentResponse_ParticipantStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='participantStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	ParticipantStatus getParticipantStatus();

	/**
	 * Sets the value of the '{@link fhir.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Status</em>' containment reference.
	 * @see #getParticipantStatus()
	 * @generated
	 */
	void setParticipantStatus(ParticipantStatus value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional comments about the appointment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhir.String)
	 * @see fhir.FhirPackage#getAppointmentResponse_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getComment();

	/**
	 * Sets the value of the '{@link fhir.AppointmentResponse#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhir.String value);

} // AppointmentResponse
