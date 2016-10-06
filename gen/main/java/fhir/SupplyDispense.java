/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A supply - a  request for something, and provision of what is supplied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.SupplyDispense#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getStatus <em>Status</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getType <em>Type</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getSuppliedItem <em>Supplied Item</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhir.SupplyDispense#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getSupplyDispense()
 * @model extendedMetaData="name='Supply.Dispense' kind='elementOnly'"
 * @generated
 */
public interface SupplyDispense extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier assigned by the dispensing facility when the item(s) is dispensed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhir.FhirPackage#getSupplyDispense_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the dispense event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SupplyDispenseStatus)
	 * @see fhir.FhirPackage#getSupplyDispense_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyDispenseStatus getStatus();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SupplyDispenseStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhir.FhirPackage#getSupplyDispense_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of supply that has been dispensed. Includes unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhir.FhirPackage#getSupplyDispense_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Supplied Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the medication or substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplied Item</em>' containment reference.
	 * @see #setSuppliedItem(Reference)
	 * @see fhir.FhirPackage#getSupplyDispense_SuppliedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='suppliedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSuppliedItem();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getSuppliedItem <em>Supplied Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplied Item</em>' containment reference.
	 * @see #getSuppliedItem()
	 * @generated
	 */
	void setSuppliedItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual responsible for dispensing the medication, supplier or device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference.
	 * @see #setSupplier(Reference)
	 * @see fhir.FhirPackage#getSupplyDispense_Supplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSupplier();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getSupplier <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' containment reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Reference value);

	/**
	 * Returns the value of the '<em><b>When Prepared</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the dispense event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Prepared</em>' containment reference.
	 * @see #setWhenPrepared(Period)
	 * @see fhir.FhirPackage#getSupplyDispense_WhenPrepared()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenPrepared' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getWhenPrepared();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getWhenPrepared <em>When Prepared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Prepared</em>' containment reference.
	 * @see #getWhenPrepared()
	 * @generated
	 */
	void setWhenPrepared(Period value);

	/**
	 * Returns the value of the '<em><b>When Handed Over</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the dispensed item was sent or handed to the patient (or agent).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Handed Over</em>' containment reference.
	 * @see #setWhenHandedOver(DateTime)
	 * @see fhir.FhirPackage#getSupplyDispense_WhenHandedOver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenHandedOver' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenHandedOver();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getWhenHandedOver <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Handed Over</em>' containment reference.
	 * @see #getWhenHandedOver()
	 * @generated
	 */
	void setWhenHandedOver(DateTime value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see fhir.FhirPackage#getSupplyDispense_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link fhir.SupplyDispense#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the person who picked up the Supply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference list.
	 * @see fhir.FhirPackage#getSupplyDispense_Receiver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiver' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReceiver();

} // SupplyDispense
