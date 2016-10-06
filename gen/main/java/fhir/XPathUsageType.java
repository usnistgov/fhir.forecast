/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath Usage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * How a search parameter relates to the set of elements returned by evaluating its xpath query.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.XPathUsageType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getXPathUsageType()
 * @model extendedMetaData="name='XPathUsageType' kind='elementOnly'"
 * @generated
 */
public interface XPathUsageType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fhir.XPathUsageTypeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fhir.XPathUsageTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(XPathUsageTypeList)
	 * @see fhir.FhirPackage#getXPathUsageType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	XPathUsageTypeList getValue();

	/**
	 * Sets the value of the '{@link fhir.XPathUsageType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fhir.XPathUsageTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XPathUsageTypeList value);

	/**
	 * Unsets the value of the '{@link fhir.XPathUsageType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(XPathUsageTypeList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link fhir.XPathUsageType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(XPathUsageTypeList)
	 * @generated
	 */
	boolean isSetValue();

} // XPathUsageType
