/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Vaccination Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getSeries <em>Series</em>}</li>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getSeriesDoses <em>Series Doses</em>}</li>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link fhir.ImmunizationVaccinationProtocol#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol()
 * @model extendedMetaData="name='Immunization.VaccinationProtocol' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationVaccinationProtocol extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Dose Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nominal position in a series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Sequence</em>' containment reference.
	 * @see #setDoseSequence(PositiveInt)
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_DoseSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doseSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDoseSequence();

	/**
	 * Sets the value of the '{@link fhir.ImmunizationVaccinationProtocol#getDoseSequence <em>Dose Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Sequence</em>' containment reference.
	 * @see #getDoseSequence()
	 * @generated
	 */
	void setDoseSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the description about the protocol under which the vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhir.String)
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDescription();

	/**
	 * Sets the value of the '{@link fhir.ImmunizationVaccinationProtocol#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the authority who published the protocol.  E.g. ACIP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(Reference)
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthority();

	/**
	 * Sets the value of the '{@link fhir.ImmunizationVaccinationProtocol#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(fhir.String)
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getSeries();

	/**
	 * Sets the value of the '{@link fhir.ImmunizationVaccinationProtocol#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series Doses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended number of doses to achieve immunity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Doses</em>' containment reference.
	 * @see #setSeriesDoses(PositiveInt)
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_SeriesDoses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDoses' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSeriesDoses();

	/**
	 * Sets the value of the '{@link fhir.ImmunizationVaccinationProtocol#getSeriesDoses <em>Series Doses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses</em>' containment reference.
	 * @see #getSeriesDoses()
	 * @generated
	 */
	void setSeriesDoses(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The targeted disease.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Disease</em>' containment reference list.
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_TargetDisease()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetDisease' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTargetDisease();

	/**
	 * Returns the value of the '<em><b>Dose Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the immunization event should "count" against  the protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Status</em>' containment reference.
	 * @see #setDoseStatus(CodeableConcept)
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_DoseStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseStatus();

	/**
	 * Sets the value of the '{@link fhir.ImmunizationVaccinationProtocol#getDoseStatus <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status</em>' containment reference.
	 * @see #getDoseStatus()
	 * @generated
	 */
	void setDoseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an explanation as to why an immunization event should or should not count against the protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Status Reason</em>' containment reference.
	 * @see #setDoseStatusReason(CodeableConcept)
	 * @see fhir.FhirPackage#getImmunizationVaccinationProtocol_DoseStatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseStatusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseStatusReason();

	/**
	 * Sets the value of the '{@link fhir.ImmunizationVaccinationProtocol#getDoseStatusReason <em>Dose Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status Reason</em>' containment reference.
	 * @see #getDoseStatusReason()
	 * @generated
	 */
	void setDoseStatusReason(CodeableConcept value);

} // ImmunizationVaccinationProtocol
