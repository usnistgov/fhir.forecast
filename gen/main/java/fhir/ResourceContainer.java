/**
 */
package fhir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ResourceContainer#getAccount <em>Account</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getBasic <em>Basic</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getBinary <em>Binary</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getBundle <em>Bundle</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getClaim <em>Claim</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getCommunication <em>Communication</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getComposition <em>Composition</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getCondition <em>Condition</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getConformance <em>Conformance</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getContract <em>Contract</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDataElement <em>Data Element</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDevice <em>Device</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDeviceComponent <em>Device Component</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDeviceUseRequest <em>Device Use Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDeviceUseStatement <em>Device Use Statement</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDiagnosticOrder <em>Diagnostic Order</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDocumentManifest <em>Document Manifest</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getEligibilityRequest <em>Eligibility Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getEligibilityResponse <em>Eligibility Response</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getFlag <em>Flag</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getGoal <em>Goal</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getGroup <em>Group</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getImagingObjectSelection <em>Imaging Object Selection</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getList <em>List</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getLocation <em>Location</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getMedia <em>Media</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getMedication <em>Medication</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getMedicationOrder <em>Medication Order</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getObservation <em>Observation</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getOrder <em>Order</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getOrderResponse <em>Order Response</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getOrganization <em>Organization</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getPerson <em>Person</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getProcedureRequest <em>Procedure Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getProcessRequest <em>Process Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getProcessResponse <em>Process Response</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getQuestionnaireResponse <em>Questionnaire Response</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getReferralRequest <em>Referral Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSlot <em>Slot</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSubstance <em>Substance</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSupplyDelivery <em>Supply Delivery</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getSupplyRequest <em>Supply Request</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getVisionPrescription <em>Vision Prescription</em>}</li>
 *   <li>{@link fhir.ResourceContainer#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getResourceContainer()
 * @model extendedMetaData="name='ResourceContainer' kind='elementOnly'"
 * @generated
 */
public interface ResourceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see #setAccount(Object)
	 * @see fhir.FhirPackage#getResourceContainer_Account()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='Account' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAccount();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Object value);

	/**
	 * Returns the value of the '<em><b>Allergy Intolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allergy Intolerance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #setAllergyIntolerance(AllergyIntolerance)
	 * @see fhir.FhirPackage#getResourceContainer_AllergyIntolerance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllergyIntolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntolerance getAllergyIntolerance();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getAllergyIntolerance <em>Allergy Intolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #getAllergyIntolerance()
	 * @generated
	 */
	void setAllergyIntolerance(AllergyIntolerance value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Appointment)
	 * @see fhir.FhirPackage#getResourceContainer_Appointment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Appointment getAppointment();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Appointment value);

	/**
	 * Returns the value of the '<em><b>Appointment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Response</em>' containment reference.
	 * @see #setAppointmentResponse(AppointmentResponse)
	 * @see fhir.FhirPackage#getResourceContainer_AppointmentResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AppointmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentResponse getAppointmentResponse();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getAppointmentResponse <em>Appointment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Response</em>' containment reference.
	 * @see #getAppointmentResponse()
	 * @generated
	 */
	void setAppointmentResponse(AppointmentResponse value);

	/**
	 * Returns the value of the '<em><b>Audit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit Event</em>' containment reference.
	 * @see #setAuditEvent(AuditEvent)
	 * @see fhir.FhirPackage#getResourceContainer_AuditEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AuditEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEvent getAuditEvent();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getAuditEvent <em>Audit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit Event</em>' containment reference.
	 * @see #getAuditEvent()
	 * @generated
	 */
	void setAuditEvent(AuditEvent value);

	/**
	 * Returns the value of the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic</em>' containment reference.
	 * @see #setBasic(Basic)
	 * @see fhir.FhirPackage#getResourceContainer_Basic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Basic' namespace='##targetNamespace'"
	 * @generated
	 */
	Basic getBasic();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getBasic <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic</em>' containment reference.
	 * @see #getBasic()
	 * @generated
	 */
	void setBasic(Basic value);

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference.
	 * @see #setBinary(Binary)
	 * @see fhir.FhirPackage#getResourceContainer_Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Binary getBinary();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getBinary <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' containment reference.
	 * @see #getBinary()
	 * @generated
	 */
	void setBinary(Binary value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(BodySite)
	 * @see fhir.FhirPackage#getResourceContainer_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	BodySite getBodySite();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(BodySite value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' containment reference.
	 * @see #setBundle(Bundle)
	 * @see fhir.FhirPackage#getResourceContainer_Bundle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bundle' namespace='##targetNamespace'"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getBundle <em>Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' containment reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	/**
	 * Returns the value of the '<em><b>Care Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Plan</em>' containment reference.
	 * @see #setCarePlan(CarePlan)
	 * @see fhir.FhirPackage#getResourceContainer_CarePlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CarePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlan getCarePlan();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getCarePlan <em>Care Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Plan</em>' containment reference.
	 * @see #getCarePlan()
	 * @generated
	 */
	void setCarePlan(CarePlan value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Claim)
	 * @see fhir.FhirPackage#getResourceContainer_Claim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(ClaimResponse)
	 * @see fhir.FhirPackage#getResourceContainer_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClaimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponse getClaimResponse();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(ClaimResponse value);

	/**
	 * Returns the value of the '<em><b>Clinical Impression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Impression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #setClinicalImpression(ClinicalImpression)
	 * @see fhir.FhirPackage#getResourceContainer_ClinicalImpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClinicalImpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalImpression getClinicalImpression();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getClinicalImpression <em>Clinical Impression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #getClinicalImpression()
	 * @generated
	 */
	void setClinicalImpression(ClinicalImpression value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(Communication)
	 * @see fhir.FhirPackage#getResourceContainer_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Communication' namespace='##targetNamespace'"
	 * @generated
	 */
	Communication getCommunication();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(Communication value);

	/**
	 * Returns the value of the '<em><b>Communication Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Request</em>' containment reference.
	 * @see #setCommunicationRequest(CommunicationRequest)
	 * @see fhir.FhirPackage#getResourceContainer_CommunicationRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommunicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationRequest getCommunicationRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getCommunicationRequest <em>Communication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Request</em>' containment reference.
	 * @see #getCommunicationRequest()
	 * @generated
	 */
	void setCommunicationRequest(CommunicationRequest value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(Composition)
	 * @see fhir.FhirPackage#getResourceContainer_Composition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Composition' namespace='##targetNamespace'"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

	/**
	 * Returns the value of the '<em><b>Concept Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Map</em>' containment reference.
	 * @see #setConceptMap(ConceptMap)
	 * @see fhir.FhirPackage#getResourceContainer_ConceptMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConceptMap' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMap getConceptMap();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getConceptMap <em>Concept Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Map</em>' containment reference.
	 * @see #getConceptMap()
	 * @generated
	 */
	void setConceptMap(ConceptMap value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see fhir.FhirPackage#getResourceContainer_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference.
	 * @see #setConformance(Conformance)
	 * @see fhir.FhirPackage#getResourceContainer_Conformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Conformance' namespace='##targetNamespace'"
	 * @generated
	 */
	Conformance getConformance();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getConformance <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' containment reference.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Conformance value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see fhir.FhirPackage#getResourceContainer_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Contract' namespace='##targetNamespace'"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Coverage)
	 * @see fhir.FhirPackage#getResourceContainer_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

	/**
	 * Returns the value of the '<em><b>Data Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Element</em>' containment reference.
	 * @see #setDataElement(DataElement)
	 * @see fhir.FhirPackage#getResourceContainer_DataElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataElement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataElement getDataElement();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDataElement <em>Data Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Element</em>' containment reference.
	 * @see #getDataElement()
	 * @generated
	 */
	void setDataElement(DataElement value);

	/**
	 * Returns the value of the '<em><b>Detected Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detected Issue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detected Issue</em>' attribute.
	 * @see #setDetectedIssue(Object)
	 * @see fhir.FhirPackage#getResourceContainer_DetectedIssue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='DetectedIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDetectedIssue();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDetectedIssue <em>Detected Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected Issue</em>' attribute.
	 * @see #getDetectedIssue()
	 * @generated
	 */
	void setDetectedIssue(Object value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Device)
	 * @see fhir.FhirPackage#getResourceContainer_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Device' namespace='##targetNamespace'"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Device Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Component</em>' containment reference.
	 * @see #setDeviceComponent(DeviceComponent)
	 * @see fhir.FhirPackage#getResourceContainer_DeviceComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceComponent getDeviceComponent();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDeviceComponent <em>Device Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Component</em>' containment reference.
	 * @see #getDeviceComponent()
	 * @generated
	 */
	void setDeviceComponent(DeviceComponent value);

	/**
	 * Returns the value of the '<em><b>Device Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Metric</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Metric</em>' containment reference.
	 * @see #setDeviceMetric(DeviceMetric)
	 * @see fhir.FhirPackage#getResourceContainer_DeviceMetric()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceMetric' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetric getDeviceMetric();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDeviceMetric <em>Device Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Metric</em>' containment reference.
	 * @see #getDeviceMetric()
	 * @generated
	 */
	void setDeviceMetric(DeviceMetric value);

	/**
	 * Returns the value of the '<em><b>Device Use Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Use Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Use Request</em>' containment reference.
	 * @see #setDeviceUseRequest(DeviceUseRequest)
	 * @see fhir.FhirPackage#getResourceContainer_DeviceUseRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceUseRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseRequest getDeviceUseRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDeviceUseRequest <em>Device Use Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Use Request</em>' containment reference.
	 * @see #getDeviceUseRequest()
	 * @generated
	 */
	void setDeviceUseRequest(DeviceUseRequest value);

	/**
	 * Returns the value of the '<em><b>Device Use Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Use Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Use Statement</em>' containment reference.
	 * @see #setDeviceUseStatement(DeviceUseStatement)
	 * @see fhir.FhirPackage#getResourceContainer_DeviceUseStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceUseStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseStatement getDeviceUseStatement();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDeviceUseStatement <em>Device Use Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Use Statement</em>' containment reference.
	 * @see #getDeviceUseStatement()
	 * @generated
	 */
	void setDeviceUseStatement(DeviceUseStatement value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostic Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Order</em>' containment reference.
	 * @see #setDiagnosticOrder(DiagnosticOrder)
	 * @see fhir.FhirPackage#getResourceContainer_DiagnosticOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiagnosticOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticOrder getDiagnosticOrder();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDiagnosticOrder <em>Diagnostic Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Order</em>' containment reference.
	 * @see #getDiagnosticOrder()
	 * @generated
	 */
	void setDiagnosticOrder(DiagnosticOrder value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostic Report</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #setDiagnosticReport(DiagnosticReport)
	 * @see fhir.FhirPackage#getResourceContainer_DiagnosticReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiagnosticReport' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticReport getDiagnosticReport();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDiagnosticReport <em>Diagnostic Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #getDiagnosticReport()
	 * @generated
	 */
	void setDiagnosticReport(DiagnosticReport value);

	/**
	 * Returns the value of the '<em><b>Document Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Manifest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Manifest</em>' containment reference.
	 * @see #setDocumentManifest(DocumentManifest)
	 * @see fhir.FhirPackage#getResourceContainer_DocumentManifest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentManifest' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentManifest getDocumentManifest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDocumentManifest <em>Document Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Manifest</em>' containment reference.
	 * @see #getDocumentManifest()
	 * @generated
	 */
	void setDocumentManifest(DocumentManifest value);

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(DocumentReference)
	 * @see fhir.FhirPackage#getResourceContainer_DocumentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReference getDocumentReference();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 * @generated
	 */
	void setDocumentReference(DocumentReference value);

	/**
	 * Returns the value of the '<em><b>Eligibility Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eligibility Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligibility Request</em>' containment reference.
	 * @see #setEligibilityRequest(EligibilityRequest)
	 * @see fhir.FhirPackage#getResourceContainer_EligibilityRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EligibilityRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EligibilityRequest getEligibilityRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getEligibilityRequest <em>Eligibility Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility Request</em>' containment reference.
	 * @see #getEligibilityRequest()
	 * @generated
	 */
	void setEligibilityRequest(EligibilityRequest value);

	/**
	 * Returns the value of the '<em><b>Eligibility Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eligibility Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligibility Response</em>' containment reference.
	 * @see #setEligibilityResponse(EligibilityResponse)
	 * @see fhir.FhirPackage#getResourceContainer_EligibilityResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EligibilityResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EligibilityResponse getEligibilityResponse();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getEligibilityResponse <em>Eligibility Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility Response</em>' containment reference.
	 * @see #getEligibilityResponse()
	 * @generated
	 */
	void setEligibilityResponse(EligibilityResponse value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Encounter)
	 * @see fhir.FhirPackage#getResourceContainer_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Enrollment Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrollment Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #setEnrollmentRequest(EnrollmentRequest)
	 * @see fhir.FhirPackage#getResourceContainer_EnrollmentRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnrollmentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentRequest getEnrollmentRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getEnrollmentRequest <em>Enrollment Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #getEnrollmentRequest()
	 * @generated
	 */
	void setEnrollmentRequest(EnrollmentRequest value);

	/**
	 * Returns the value of the '<em><b>Enrollment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrollment Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #setEnrollmentResponse(EnrollmentResponse)
	 * @see fhir.FhirPackage#getResourceContainer_EnrollmentResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnrollmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentResponse getEnrollmentResponse();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getEnrollmentResponse <em>Enrollment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #getEnrollmentResponse()
	 * @generated
	 */
	void setEnrollmentResponse(EnrollmentResponse value);

	/**
	 * Returns the value of the '<em><b>Episode Of Care</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episode Of Care</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #setEpisodeOfCare(EpisodeOfCare)
	 * @see fhir.FhirPackage#getResourceContainer_EpisodeOfCare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EpisodeOfCare' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCare getEpisodeOfCare();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getEpisodeOfCare <em>Episode Of Care</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #getEpisodeOfCare()
	 * @generated
	 */
	void setEpisodeOfCare(EpisodeOfCare value);

	/**
	 * Returns the value of the '<em><b>Explanation Of Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explanation Of Benefit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #setExplanationOfBenefit(ExplanationOfBenefit)
	 * @see fhir.FhirPackage#getResourceContainer_ExplanationOfBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExplanationOfBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefit getExplanationOfBenefit();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getExplanationOfBenefit <em>Explanation Of Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #getExplanationOfBenefit()
	 * @generated
	 */
	void setExplanationOfBenefit(ExplanationOfBenefit value);

	/**
	 * Returns the value of the '<em><b>Family Member History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Member History</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Member History</em>' containment reference.
	 * @see #setFamilyMemberHistory(FamilyMemberHistory)
	 * @see fhir.FhirPackage#getResourceContainer_FamilyMemberHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FamilyMemberHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilyMemberHistory getFamilyMemberHistory();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getFamilyMemberHistory <em>Family Member History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Member History</em>' containment reference.
	 * @see #getFamilyMemberHistory()
	 * @generated
	 */
	void setFamilyMemberHistory(FamilyMemberHistory value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(Flag)
	 * @see fhir.FhirPackage#getResourceContainer_Flag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Flag' namespace='##targetNamespace'"
	 * @generated
	 */
	Flag getFlag();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(Flag value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(Goal)
	 * @see fhir.FhirPackage#getResourceContainer_Goal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Goal' namespace='##targetNamespace'"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getGoal <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see fhir.FhirPackage#getResourceContainer_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Healthcare Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Healthcare Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #setHealthcareService(HealthcareService)
	 * @see fhir.FhirPackage#getResourceContainer_HealthcareService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HealthcareService' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthcareService getHealthcareService();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getHealthcareService <em>Healthcare Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #getHealthcareService()
	 * @generated
	 */
	void setHealthcareService(HealthcareService value);

	/**
	 * Returns the value of the '<em><b>Imaging Object Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imaging Object Selection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaging Object Selection</em>' containment reference.
	 * @see #setImagingObjectSelection(ImagingObjectSelection)
	 * @see fhir.FhirPackage#getResourceContainer_ImagingObjectSelection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImagingObjectSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingObjectSelection getImagingObjectSelection();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getImagingObjectSelection <em>Imaging Object Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Object Selection</em>' containment reference.
	 * @see #getImagingObjectSelection()
	 * @generated
	 */
	void setImagingObjectSelection(ImagingObjectSelection value);

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imaging Study</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference.
	 * @see #setImagingStudy(ImagingStudy)
	 * @see fhir.FhirPackage#getResourceContainer_ImagingStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingStudy getImagingStudy();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getImagingStudy <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Study</em>' containment reference.
	 * @see #getImagingStudy()
	 * @generated
	 */
	void setImagingStudy(ImagingStudy value);

	/**
	 * Returns the value of the '<em><b>Immunization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunization</em>' containment reference.
	 * @see #setImmunization(Immunization)
	 * @see fhir.FhirPackage#getResourceContainer_Immunization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Immunization' namespace='##targetNamespace'"
	 * @generated
	 */
	Immunization getImmunization();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getImmunization <em>Immunization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization</em>' containment reference.
	 * @see #getImmunization()
	 * @generated
	 */
	void setImmunization(Immunization value);

	/**
	 * Returns the value of the '<em><b>Immunization Recommendation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunization Recommendation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #setImmunizationRecommendation(ImmunizationRecommendation)
	 * @see fhir.FhirPackage#getResourceContainer_ImmunizationRecommendation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImmunizationRecommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationRecommendation getImmunizationRecommendation();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getImmunizationRecommendation <em>Immunization Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #getImmunizationRecommendation()
	 * @generated
	 */
	void setImmunizationRecommendation(ImmunizationRecommendation value);

	/**
	 * Returns the value of the '<em><b>Implementation Guide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Guide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Guide</em>' containment reference.
	 * @see #setImplementationGuide(ImplementationGuide)
	 * @see fhir.FhirPackage#getResourceContainer_ImplementationGuide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImplementationGuide' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationGuide getImplementationGuide();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getImplementationGuide <em>Implementation Guide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Guide</em>' containment reference.
	 * @see #getImplementationGuide()
	 * @generated
	 */
	void setImplementationGuide(ImplementationGuide value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see fhir.FhirPackage#getResourceContainer_List()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see fhir.FhirPackage#getResourceContainer_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(Media)
	 * @see fhir.FhirPackage#getResourceContainer_Media()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Media' namespace='##targetNamespace'"
	 * @generated
	 */
	Media getMedia();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(Media value);

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(Medication)
	 * @see fhir.FhirPackage#getResourceContainer_Medication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Medication' namespace='##targetNamespace'"
	 * @generated
	 */
	Medication getMedication();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(Medication value);

	/**
	 * Returns the value of the '<em><b>Medication Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Administration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Administration</em>' containment reference.
	 * @see #setMedicationAdministration(MedicationAdministration)
	 * @see fhir.FhirPackage#getResourceContainer_MedicationAdministration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministration getMedicationAdministration();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getMedicationAdministration <em>Medication Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Administration</em>' containment reference.
	 * @see #getMedicationAdministration()
	 * @generated
	 */
	void setMedicationAdministration(MedicationAdministration value);

	/**
	 * Returns the value of the '<em><b>Medication Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Dispense</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #setMedicationDispense(MedicationDispense)
	 * @see fhir.FhirPackage#getResourceContainer_MedicationDispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationDispense getMedicationDispense();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getMedicationDispense <em>Medication Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #getMedicationDispense()
	 * @generated
	 */
	void setMedicationDispense(MedicationDispense value);

	/**
	 * Returns the value of the '<em><b>Medication Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Order</em>' attribute.
	 * @see #setMedicationOrder(Object)
	 * @see fhir.FhirPackage#getResourceContainer_MedicationOrder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='MedicationOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMedicationOrder();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getMedicationOrder <em>Medication Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Order</em>' attribute.
	 * @see #getMedicationOrder()
	 * @generated
	 */
	void setMedicationOrder(Object value);

	/**
	 * Returns the value of the '<em><b>Medication Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Statement</em>' containment reference.
	 * @see #setMedicationStatement(MedicationStatement)
	 * @see fhir.FhirPackage#getResourceContainer_MedicationStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatement getMedicationStatement();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getMedicationStatement <em>Medication Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Statement</em>' containment reference.
	 * @see #getMedicationStatement()
	 * @generated
	 */
	void setMedicationStatement(MedicationStatement value);

	/**
	 * Returns the value of the '<em><b>Message Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Header</em>' containment reference.
	 * @see #setMessageHeader(MessageHeader)
	 * @see fhir.FhirPackage#getResourceContainer_MessageHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageHeader getMessageHeader();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getMessageHeader <em>Message Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Header</em>' containment reference.
	 * @see #getMessageHeader()
	 * @generated
	 */
	void setMessageHeader(MessageHeader value);

	/**
	 * Returns the value of the '<em><b>Naming System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Naming System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naming System</em>' containment reference.
	 * @see #setNamingSystem(NamingSystem)
	 * @see fhir.FhirPackage#getResourceContainer_NamingSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamingSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingSystem getNamingSystem();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getNamingSystem <em>Naming System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming System</em>' containment reference.
	 * @see #getNamingSystem()
	 * @generated
	 */
	void setNamingSystem(NamingSystem value);

	/**
	 * Returns the value of the '<em><b>Nutrition Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nutrition Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #setNutritionOrder(NutritionOrder)
	 * @see fhir.FhirPackage#getResourceContainer_NutritionOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NutritionOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrder getNutritionOrder();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getNutritionOrder <em>Nutrition Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #getNutritionOrder()
	 * @generated
	 */
	void setNutritionOrder(NutritionOrder value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see fhir.FhirPackage#getResourceContainer_Observation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Observation' namespace='##targetNamespace'"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Operation Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Definition</em>' containment reference.
	 * @see #setOperationDefinition(OperationDefinition)
	 * @see fhir.FhirPackage#getResourceContainer_OperationDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationDefinition getOperationDefinition();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getOperationDefinition <em>Operation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Definition</em>' containment reference.
	 * @see #getOperationDefinition()
	 * @generated
	 */
	void setOperationDefinition(OperationDefinition value);

	/**
	 * Returns the value of the '<em><b>Operation Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #setOperationOutcome(OperationOutcome)
	 * @see fhir.FhirPackage#getResourceContainer_OperationOutcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationOutcome getOperationOutcome();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getOperationOutcome <em>Operation Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #getOperationOutcome()
	 * @generated
	 */
	void setOperationOutcome(OperationOutcome value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(Order)
	 * @see fhir.FhirPackage#getResourceContainer_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Order' namespace='##targetNamespace'"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Order Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Response</em>' containment reference.
	 * @see #setOrderResponse(OrderResponse)
	 * @see fhir.FhirPackage#getResourceContainer_OrderResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrderResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderResponse getOrderResponse();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getOrderResponse <em>Order Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Response</em>' containment reference.
	 * @see #getOrderResponse()
	 * @generated
	 */
	void setOrderResponse(OrderResponse value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Organization)
	 * @see fhir.FhirPackage#getResourceContainer_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Patient)
	 * @see fhir.FhirPackage#getResourceContainer_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Payment Notice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Notice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Notice</em>' containment reference.
	 * @see #setPaymentNotice(PaymentNotice)
	 * @see fhir.FhirPackage#getResourceContainer_PaymentNotice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PaymentNotice' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentNotice getPaymentNotice();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getPaymentNotice <em>Payment Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Notice</em>' containment reference.
	 * @see #getPaymentNotice()
	 * @generated
	 */
	void setPaymentNotice(PaymentNotice value);

	/**
	 * Returns the value of the '<em><b>Payment Reconciliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Reconciliation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #setPaymentReconciliation(PaymentReconciliation)
	 * @see fhir.FhirPackage#getResourceContainer_PaymentReconciliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PaymentReconciliation' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentReconciliation getPaymentReconciliation();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getPaymentReconciliation <em>Payment Reconciliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #getPaymentReconciliation()
	 * @generated
	 */
	void setPaymentReconciliation(PaymentReconciliation value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see fhir.FhirPackage#getResourceContainer_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practitioner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practitioner</em>' containment reference.
	 * @see #setPractitioner(Practitioner)
	 * @see fhir.FhirPackage#getResourceContainer_Practitioner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Practitioner' namespace='##targetNamespace'"
	 * @generated
	 */
	Practitioner getPractitioner();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getPractitioner <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner</em>' containment reference.
	 * @see #getPractitioner()
	 * @generated
	 */
	void setPractitioner(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Procedure)
	 * @see fhir.FhirPackage#getResourceContainer_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Procedure Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Request</em>' containment reference.
	 * @see #setProcedureRequest(ProcedureRequest)
	 * @see fhir.FhirPackage#getResourceContainer_ProcedureRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProcedureRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureRequest getProcedureRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getProcedureRequest <em>Procedure Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Request</em>' containment reference.
	 * @see #getProcedureRequest()
	 * @generated
	 */
	void setProcedureRequest(ProcedureRequest value);

	/**
	 * Returns the value of the '<em><b>Process Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Request</em>' containment reference.
	 * @see #setProcessRequest(ProcessRequest)
	 * @see fhir.FhirPackage#getResourceContainer_ProcessRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProcessRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessRequest getProcessRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getProcessRequest <em>Process Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Request</em>' containment reference.
	 * @see #getProcessRequest()
	 * @generated
	 */
	void setProcessRequest(ProcessRequest value);

	/**
	 * Returns the value of the '<em><b>Process Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Response</em>' containment reference.
	 * @see #setProcessResponse(ProcessResponse)
	 * @see fhir.FhirPackage#getResourceContainer_ProcessResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProcessResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessResponse getProcessResponse();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getProcessResponse <em>Process Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Response</em>' containment reference.
	 * @see #getProcessResponse()
	 * @generated
	 */
	void setProcessResponse(ProcessResponse value);

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provenance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference.
	 * @see #setProvenance(Provenance)
	 * @see fhir.FhirPackage#getResourceContainer_Provenance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Provenance' namespace='##targetNamespace'"
	 * @generated
	 */
	Provenance getProvenance();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getProvenance <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance</em>' containment reference.
	 * @see #getProvenance()
	 * @generated
	 */
	void setProvenance(Provenance value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see fhir.FhirPackage#getResourceContainer_Questionnaire()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

	/**
	 * Returns the value of the '<em><b>Questionnaire Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire Response</em>' attribute.
	 * @see #setQuestionnaireResponse(Object)
	 * @see fhir.FhirPackage#getResourceContainer_QuestionnaireResponse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='QuestionnaireResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getQuestionnaireResponse();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getQuestionnaireResponse <em>Questionnaire Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire Response</em>' attribute.
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	void setQuestionnaireResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Referral Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referral Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referral Request</em>' containment reference.
	 * @see #setReferralRequest(ReferralRequest)
	 * @see fhir.FhirPackage#getResourceContainer_ReferralRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferralRequest getReferralRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getReferralRequest <em>Referral Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral Request</em>' containment reference.
	 * @see #getReferralRequest()
	 * @generated
	 */
	void setReferralRequest(ReferralRequest value);

	/**
	 * Returns the value of the '<em><b>Related Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Person</em>' containment reference.
	 * @see #setRelatedPerson(RelatedPerson)
	 * @see fhir.FhirPackage#getResourceContainer_RelatedPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelatedPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedPerson getRelatedPerson();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getRelatedPerson <em>Related Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Person</em>' containment reference.
	 * @see #getRelatedPerson()
	 * @generated
	 */
	void setRelatedPerson(RelatedPerson value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Assessment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see fhir.FhirPackage#getResourceContainer_RiskAssessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RiskAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getRiskAssessment <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #getRiskAssessment()
	 * @generated
	 */
	void setRiskAssessment(RiskAssessment value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Schedule)
	 * @see fhir.FhirPackage#getResourceContainer_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Search Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Parameter</em>' containment reference.
	 * @see #setSearchParameter(SearchParameter)
	 * @see fhir.FhirPackage#getResourceContainer_SearchParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SearchParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchParameter getSearchParameter();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSearchParameter <em>Search Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Parameter</em>' containment reference.
	 * @see #getSearchParameter()
	 * @generated
	 */
	void setSearchParameter(SearchParameter value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference.
	 * @see #setSlot(Slot)
	 * @see fhir.FhirPackage#getResourceContainer_Slot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace'"
	 * @generated
	 */
	Slot getSlot();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSlot <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' containment reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(Slot value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Specimen)
	 * @see fhir.FhirPackage#getResourceContainer_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Specimen getSpecimen();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Specimen value);

	/**
	 * Returns the value of the '<em><b>Structure Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Definition</em>' containment reference.
	 * @see #setStructureDefinition(StructureDefinition)
	 * @see fhir.FhirPackage#getResourceContainer_StructureDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinition getStructureDefinition();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getStructureDefinition <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Definition</em>' containment reference.
	 * @see #getStructureDefinition()
	 * @generated
	 */
	void setStructureDefinition(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(Subscription)
	 * @see fhir.FhirPackage#getResourceContainer_Subscription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subscription' namespace='##targetNamespace'"
	 * @generated
	 */
	Subscription getSubscription();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(Subscription value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(Substance)
	 * @see fhir.FhirPackage#getResourceContainer_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Substance' namespace='##targetNamespace'"
	 * @generated
	 */
	Substance getSubstance();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(Substance value);

	/**
	 * Returns the value of the '<em><b>Supply Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Delivery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Delivery</em>' containment reference.
	 * @see #setSupplyDelivery(SupplyDelivery)
	 * @see fhir.FhirPackage#getResourceContainer_SupplyDelivery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplyDelivery' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyDelivery getSupplyDelivery();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSupplyDelivery <em>Supply Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Delivery</em>' containment reference.
	 * @see #getSupplyDelivery()
	 * @generated
	 */
	void setSupplyDelivery(SupplyDelivery value);

	/**
	 * Returns the value of the '<em><b>Supply Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Request</em>' containment reference.
	 * @see #setSupplyRequest(SupplyRequest)
	 * @see fhir.FhirPackage#getResourceContainer_SupplyRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplyRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyRequest getSupplyRequest();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getSupplyRequest <em>Supply Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Request</em>' containment reference.
	 * @see #getSupplyRequest()
	 * @generated
	 */
	void setSupplyRequest(SupplyRequest value);

	/**
	 * Returns the value of the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(TestScript)
	 * @see fhir.FhirPackage#getResourceContainer_TestScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TestScript' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScript getTestScript();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getTestScript <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Script</em>' containment reference.
	 * @see #getTestScript()
	 * @generated
	 */
	void setTestScript(TestScript value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see fhir.FhirPackage#getResourceContainer_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Vision Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vision Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #setVisionPrescription(VisionPrescription)
	 * @see fhir.FhirPackage#getResourceContainer_VisionPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VisionPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionPrescription getVisionPrescription();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getVisionPrescription <em>Vision Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #getVisionPrescription()
	 * @generated
	 */
	void setVisionPrescription(VisionPrescription value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(Object)
	 * @see fhir.FhirPackage#getResourceContainer_Parameters()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getParameters();

	/**
	 * Sets the value of the '{@link fhir.ResourceContainer#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Object value);

} // ResourceContainer
