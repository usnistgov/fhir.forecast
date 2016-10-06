/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Prosthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ClaimProsthesis#getInitial <em>Initial</em>}</li>
 *   <li>{@link fhir.ClaimProsthesis#getPriorDate <em>Prior Date</em>}</li>
 *   <li>{@link fhir.ClaimProsthesis#getPriorMaterial <em>Prior Material</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getClaimProsthesis()
 * @model extendedMetaData="name='Claim.Prosthesis' kind='elementOnly'"
 * @generated
 */
public interface ClaimProsthesis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this is the initial placement of a fixed prosthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(fhir.Boolean)
	 * @see fhir.FhirPackage#getClaimProsthesis_Initial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initial' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getInitial();

	/**
	 * Sets the value of the '{@link fhir.ClaimProsthesis#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Prior Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of the initial placement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prior Date</em>' containment reference.
	 * @see #setPriorDate(Date)
	 * @see fhir.FhirPackage#getClaimProsthesis_PriorDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priorDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPriorDate();

	/**
	 * Sets the value of the '{@link fhir.ClaimProsthesis#getPriorDate <em>Prior Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Date</em>' containment reference.
	 * @see #getPriorDate()
	 * @generated
	 */
	void setPriorDate(Date value);

	/**
	 * Returns the value of the '<em><b>Prior Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material of the prior denture or bridge prosthesis. (Oral).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prior Material</em>' containment reference.
	 * @see #setPriorMaterial(Coding)
	 * @see fhir.FhirPackage#getClaimProsthesis_PriorMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priorMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPriorMaterial();

	/**
	 * Sets the value of the '{@link fhir.ClaimProsthesis#getPriorMaterial <em>Prior Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Material</em>' containment reference.
	 * @see #getPriorMaterial()
	 * @generated
	 */
	void setPriorMaterial(Coding value);

} // ClaimProsthesis
