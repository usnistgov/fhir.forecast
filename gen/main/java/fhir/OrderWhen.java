/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to perform an action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.OrderWhen#getCode <em>Code</em>}</li>
 *   <li>{@link fhir.OrderWhen#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getOrderWhen()
 * @model extendedMetaData="name='Order.When' kind='elementOnly'"
 * @generated
 */
public interface OrderWhen extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code specifies when request should be done. The code may simply be a priority code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhir.FhirPackage#getOrderWhen_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhir.OrderWhen#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Timing)
	 * @see fhir.FhirPackage#getOrderWhen_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getSchedule();

	/**
	 * Sets the value of the '{@link fhir.OrderWhen#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Timing value);

} // OrderWhen
