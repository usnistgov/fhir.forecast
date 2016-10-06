/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.Address#getUse <em>Use</em>}</li>
 *   <li>{@link fhir.Address#getType <em>Type</em>}</li>
 *   <li>{@link fhir.Address#getText <em>Text</em>}</li>
 *   <li>{@link fhir.Address#getLine <em>Line</em>}</li>
 *   <li>{@link fhir.Address#getCity <em>City</em>}</li>
 *   <li>{@link fhir.Address#getDistrict <em>District</em>}</li>
 *   <li>{@link fhir.Address#getState <em>State</em>}</li>
 *   <li>{@link fhir.Address#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fhir.Address#getCountry <em>Country</em>}</li>
 *   <li>{@link fhir.Address#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getAddress()
 * @model extendedMetaData="name='Address' kind='elementOnly'"
 * @generated
 */
public interface Address extends Element {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(AddressUse)
	 * @see fhir.FhirPackage#getAddress_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressUse getUse();

	/**
	 * Sets the value of the '{@link fhir.Address#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(AddressUse value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AddressType)
	 * @see fhir.FhirPackage#getAddress_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getType();

	/**
	 * Sets the value of the '{@link fhir.Address#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AddressType value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A full text representation of the address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhir.String)
	 * @see fhir.FhirPackage#getAddress_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getText();

	/**
	 * Sets the value of the '{@link fhir.Address#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see fhir.FhirPackage#getAddress_Line()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<fhir.String> getLine();

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the city, town, village or other community or delivery center.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(fhir.String)
	 * @see fhir.FhirPackage#getAddress_City()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getCity();

	/**
	 * Sets the value of the '{@link fhir.Address#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(fhir.String value);

	/**
	 * Returns the value of the '<em><b>District</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the administrative area (county).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>District</em>' containment reference.
	 * @see #setDistrict(fhir.String)
	 * @see fhir.FhirPackage#getAddress_District()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='district' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDistrict();

	/**
	 * Sets the value of the '{@link fhir.Address#getDistrict <em>District</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' containment reference.
	 * @see #getDistrict()
	 * @generated
	 */
	void setDistrict(fhir.String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(fhir.String)
	 * @see fhir.FhirPackage#getAddress_State()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getState();

	/**
	 * Sets the value of the '{@link fhir.Address#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A postal code designating a region defined by the postal service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(fhir.String)
	 * @see fhir.FhirPackage#getAddress_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='postalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getPostalCode();

	/**
	 * Sets the value of the '{@link fhir.Address#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country - a nation as commonly understood or generally accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(fhir.String)
	 * @see fhir.FhirPackage#getAddress_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getCountry();

	/**
	 * Sets the value of the '{@link fhir.Address#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period when address was/is in use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhir.FhirPackage#getAddress_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhir.Address#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // Address
