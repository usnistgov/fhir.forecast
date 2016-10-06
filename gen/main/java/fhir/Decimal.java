/**
 */
package fhir;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rational number with implicit precision
 * Do not use a IEEE type floating point type, instead use something that works like a true decimal, with inbuilt precision (e.g. Java BigInteger)
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.Decimal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDecimal()
 * @model extendedMetaData="name='decimal' kind='elementOnly'"
 * @generated
 */
public interface Decimal extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see fhir.FhirPackage#getDecimal_Value()
	 * @model dataType="fhir.DecimalPrimitive"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link fhir.Decimal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

} // Decimal
