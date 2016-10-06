/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of information summarized from a list of other resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ListEntry#getFlag <em>Flag</em>}</li>
 *   <li>{@link fhir.ListEntry#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link fhir.ListEntry#getDate <em>Date</em>}</li>
 *   <li>{@link fhir.ListEntry#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getListEntry()
 * @model extendedMetaData="name='List.Entry' kind='elementOnly'"
 * @generated
 */
public interface ListEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The flag allows the system constructing the list to indicate the role and significance of the item in the list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(CodeableConcept)
	 * @see fhir.FhirPackage#getListEntry_Flag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flag' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFlag();

	/**
	 * Sets the value of the '{@link fhir.ListEntry#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if this item is marked as deleted in the list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deleted</em>' containment reference.
	 * @see #setDeleted(fhir.Boolean)
	 * @see fhir.FhirPackage#getListEntry_Deleted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deleted' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getDeleted();

	/**
	 * Sets the value of the '{@link fhir.ListEntry#getDeleted <em>Deleted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' containment reference.
	 * @see #getDeleted()
	 * @generated
	 */
	void setDeleted(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this item was added to the list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhir.FhirPackage#getListEntry_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhir.ListEntry#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the actual resource from which data was derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Reference)
	 * @see fhir.FhirPackage#getListEntry_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItem();

	/**
	 * Sets the value of the '{@link fhir.ListEntry#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Reference value);

} // ListEntry
