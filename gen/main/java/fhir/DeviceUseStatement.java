/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Use Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.DeviceUseStatement#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getBodySiteReference <em>Body Site Reference</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getWhenUsed <em>When Used</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getDevice <em>Device</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getIndication <em>Indication</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getNotes <em>Notes</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link fhir.DeviceUseStatement#getTimingDateTime <em>Timing Date Time</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDeviceUseStatement()
 * @model extendedMetaData="name='DeviceUseStatement' kind='elementOnly'"
 * @generated
 */
public interface DeviceUseStatement extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Body Site Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the site on the subject's body where the device was used ( i.e. the target site). (choose any one of bodySite*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site Codeable Concept</em>' containment reference.
	 * @see #setBodySiteCodeableConcept(CodeableConcept)
	 * @see fhir.FhirPackage#getDeviceUseStatement_BodySiteCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySiteCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySiteCodeableConcept();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site Codeable Concept</em>' containment reference.
	 * @see #getBodySiteCodeableConcept()
	 * @generated
	 */
	void setBodySiteCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the site on the subject's body where the device was used ( i.e. the target site). (choose any one of bodySite*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site Reference</em>' containment reference.
	 * @see #setBodySiteReference(Reference)
	 * @see fhir.FhirPackage#getDeviceUseStatement_BodySiteReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySiteReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBodySiteReference();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getBodySiteReference <em>Body Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site Reference</em>' containment reference.
	 * @see #getBodySiteReference()
	 * @generated
	 */
	void setBodySiteReference(Reference value);

	/**
	 * Returns the value of the '<em><b>When Used</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period over which the device was used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Used</em>' containment reference.
	 * @see #setWhenUsed(Period)
	 * @see fhir.FhirPackage#getDeviceUseStatement_WhenUsed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenUsed' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getWhenUsed();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getWhenUsed <em>When Used</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Used</em>' containment reference.
	 * @see #getWhenUsed()
	 * @generated
	 */
	void setWhenUsed(Period value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the device used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see fhir.FhirPackage#getDeviceUseStatement_Device()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An external identifier for this statement such as an IRI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhir.FhirPackage#getDeviceUseStatement_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason or justification for the use of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see fhir.FhirPackage#getDeviceUseStatement_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIndication();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see fhir.FhirPackage#getDeviceUseStatement_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<fhir.String> getNotes();

	/**
	 * Returns the value of the '<em><b>Recorded On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time at which the statement was made/recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded On</em>' containment reference.
	 * @see #setRecordedOn(DateTime)
	 * @see fhir.FhirPackage#getDeviceUseStatement_RecordedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recordedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecordedOn();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getRecordedOn <em>Recorded On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded On</em>' containment reference.
	 * @see #getRecordedOn()
	 * @generated
	 */
	void setRecordedOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who used the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see fhir.FhirPackage#getDeviceUseStatement_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How often the device was used. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Timing</em>' containment reference.
	 * @see #setTimingTiming(Timing)
	 * @see fhir.FhirPackage#getDeviceUseStatement_TimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTimingTiming();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getTimingTiming <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Timing</em>' containment reference.
	 * @see #getTimingTiming()
	 * @generated
	 */
	void setTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Timing Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How often the device was used. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Period</em>' containment reference.
	 * @see #setTimingPeriod(Period)
	 * @see fhir.FhirPackage#getDeviceUseStatement_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How often the device was used. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #setTimingDateTime(DateTime)
	 * @see fhir.FhirPackage#getDeviceUseStatement_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseStatement#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #getTimingDateTime()
	 * @generated
	 */
	void setTimingDateTime(DateTime value);

} // DeviceUseStatement
