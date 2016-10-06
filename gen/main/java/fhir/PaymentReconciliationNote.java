/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides payment details and claim references supporting a bulk payment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.PaymentReconciliationNote#getType <em>Type</em>}</li>
 *   <li>{@link fhir.PaymentReconciliationNote#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getPaymentReconciliationNote()
 * @model extendedMetaData="name='PaymentReconciliation.Note' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliationNote extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The note purpose: Print/Display.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see fhir.FhirPackage#getPaymentReconciliationNote_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link fhir.PaymentReconciliationNote#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The note text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhir.String)
	 * @see fhir.FhirPackage#getPaymentReconciliationNote_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getText();

	/**
	 * Sets the value of the '{@link fhir.PaymentReconciliationNote#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhir.String value);

} // PaymentReconciliationNote
