/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Batch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.MedicationBatch#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fhir.MedicationBatch#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getMedicationBatch()
 * @model extendedMetaData="name='Medication.Batch' kind='elementOnly'"
 * @generated
 */
public interface MedicationBatch extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assigned lot number of a batch of the specified product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(fhir.String)
	 * @see fhir.FhirPackage#getMedicationBatch_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link fhir.MedicationBatch#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this specific batch of product will expire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(DateTime)
	 * @see fhir.FhirPackage#getMedicationBatch_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpirationDate();

	/**
	 * Sets the value of the '{@link fhir.MedicationBatch#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(DateTime value);

} // MedicationBatch
