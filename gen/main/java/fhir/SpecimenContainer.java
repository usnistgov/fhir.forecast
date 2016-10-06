/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sample to be used for analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.SpecimenContainer#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.SpecimenContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.SpecimenContainer#getType <em>Type</em>}</li>
 *   <li>{@link fhir.SpecimenContainer#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fhir.SpecimenContainer#getSpecimenQuantity <em>Specimen Quantity</em>}</li>
 *   <li>{@link fhir.SpecimenContainer#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}</li>
 *   <li>{@link fhir.SpecimenContainer#getAdditiveReference <em>Additive Reference</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getSpecimenContainer()
 * @model extendedMetaData="name='Specimen.Container' kind='elementOnly'"
 * @generated
 */
public interface SpecimenContainer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhir.FhirPackage#getSpecimenContainer_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description of the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhir.String)
	 * @see fhir.FhirPackage#getSpecimenContainer_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDescription();

	/**
	 * Sets the value of the '{@link fhir.SpecimenContainer#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of container associated with the specimen (e.g. slide, aliquot, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhir.FhirPackage#getSpecimenContainer_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhir.SpecimenContainer#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capacity (volume or other measure) the container may contain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(SimpleQuantity)
	 * @see fhir.FhirPackage#getSpecimenContainer_Capacity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='capacity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getCapacity();

	/**
	 * Sets the value of the '{@link fhir.SpecimenContainer#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Specimen Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen Quantity</em>' containment reference.
	 * @see #setSpecimenQuantity(SimpleQuantity)
	 * @see fhir.FhirPackage#getSpecimenContainer_SpecimenQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimenQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getSpecimenQuantity();

	/**
	 * Sets the value of the '{@link fhir.SpecimenContainer#getSpecimenQuantity <em>Specimen Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen Quantity</em>' containment reference.
	 * @see #getSpecimenQuantity()
	 * @generated
	 */
	void setSpecimenQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Additive Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA. (choose any one of additive*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive Codeable Concept</em>' containment reference.
	 * @see #setAdditiveCodeableConcept(CodeableConcept)
	 * @see fhir.FhirPackage#getSpecimenContainer_AdditiveCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditiveCodeableConcept();

	/**
	 * Sets the value of the '{@link fhir.SpecimenContainer#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Codeable Concept</em>' containment reference.
	 * @see #getAdditiveCodeableConcept()
	 * @generated
	 */
	void setAdditiveCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA. (choose any one of additive*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive Reference</em>' containment reference.
	 * @see #setAdditiveReference(Reference)
	 * @see fhir.FhirPackage#getSpecimenContainer_AdditiveReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAdditiveReference();

	/**
	 * Sets the value of the '{@link fhir.SpecimenContainer#getAdditiveReference <em>Additive Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Reference</em>' containment reference.
	 * @see #getAdditiveReference()
	 * @generated
	 */
	void setAdditiveReference(Reference value);

} // SpecimenContainer
