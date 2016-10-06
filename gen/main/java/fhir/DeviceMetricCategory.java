/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the category of the metric.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.DeviceMetricCategory#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDeviceMetricCategory()
 * @model extendedMetaData="name='DeviceMetricCategory' kind='elementOnly'"
 * @generated
 */
public interface DeviceMetricCategory extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fhir.DeviceMetricCategoryList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fhir.DeviceMetricCategoryList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DeviceMetricCategoryList)
	 * @see fhir.FhirPackage#getDeviceMetricCategory_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	DeviceMetricCategoryList getValue();

	/**
	 * Sets the value of the '{@link fhir.DeviceMetricCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fhir.DeviceMetricCategoryList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DeviceMetricCategoryList value);

	/**
	 * Unsets the value of the '{@link fhir.DeviceMetricCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DeviceMetricCategoryList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link fhir.DeviceMetricCategory#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DeviceMetricCategoryList)
	 * @generated
	 */
	boolean isSetValue();

} // DeviceMetricCategory
