/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value set specifies a set of codes drawn from one or more code systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ValueSetConcept#getCode <em>Code</em>}</li>
 *   <li>{@link fhir.ValueSetConcept#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link fhir.ValueSetConcept#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhir.ValueSetConcept#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhir.ValueSetConcept#getDesignation <em>Designation</em>}</li>
 *   <li>{@link fhir.ValueSetConcept#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getValueSetConcept()
 * @model extendedMetaData="name='ValueSet.Concept' kind='elementOnly'"
 * @generated
 */
public interface ValueSetConcept extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code - a text symbol - that uniquely identifies the concept within the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhir.FhirPackage#getValueSetConcept_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhir.ValueSetConcept#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this code is not for use as a real concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(fhir.Boolean)
	 * @see fhir.FhirPackage#getValueSetConcept_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getAbstract();

	/**
	 * Sets the value of the '{@link fhir.ValueSetConcept#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable string that is the recommended default way to present this concept to a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhir.String)
	 * @see fhir.FhirPackage#getValueSetConcept_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link fhir.ValueSetConcept#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(fhir.String)
	 * @see fhir.FhirPackage#getValueSetConcept_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDefinition();

	/**
	 * Sets the value of the '{@link fhir.ValueSetConcept#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.ValueSetDesignation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see fhir.FhirPackage#getValueSetConcept_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetDesignation> getDesignation();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.ValueSetConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see fhir.FhirPackage#getValueSetConcept_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetConcept> getConcept();

} // ValueSetConcept
