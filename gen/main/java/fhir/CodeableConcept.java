/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codeable Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.CodeableConcept#getCoding <em>Coding</em>}</li>
 *   <li>{@link fhir.CodeableConcept#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getCodeableConcept()
 * @model extendedMetaData="name='CodeableConcept' kind='elementOnly'"
 * @generated
 */
public interface CodeableConcept extends Element {
	/**
	 * Returns the value of the '<em><b>Coding</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a code defined by a terminology system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coding</em>' containment reference list.
	 * @see fhir.FhirPackage#getCodeableConcept_Coding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCoding();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhir.String)
	 * @see fhir.FhirPackage#getCodeableConcept_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getText();

	/**
	 * Sets the value of the '{@link fhir.CodeableConcept#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhir.String value);

} // CodeableConcept
