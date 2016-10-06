/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Response Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type of response code to use for assertion.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.AssertionResponseTypes#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getAssertionResponseTypes()
 * @model extendedMetaData="name='AssertionResponseTypes' kind='elementOnly'"
 * @generated
 */
public interface AssertionResponseTypes extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fhir.AssertionResponseTypesList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fhir.AssertionResponseTypesList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(AssertionResponseTypesList)
	 * @see fhir.FhirPackage#getAssertionResponseTypes_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	AssertionResponseTypesList getValue();

	/**
	 * Sets the value of the '{@link fhir.AssertionResponseTypes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fhir.AssertionResponseTypesList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AssertionResponseTypesList value);

	/**
	 * Unsets the value of the '{@link fhir.AssertionResponseTypes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(AssertionResponseTypesList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link fhir.AssertionResponseTypes#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(AssertionResponseTypesList)
	 * @generated
	 */
	boolean isSetValue();

} // AssertionResponseTypes
