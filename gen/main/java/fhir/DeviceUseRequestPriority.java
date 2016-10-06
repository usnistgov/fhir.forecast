/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Use Request Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Codes representing the priority of the request.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.DeviceUseRequestPriority#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDeviceUseRequestPriority()
 * @model extendedMetaData="name='DeviceUseRequestPriority' kind='elementOnly'"
 * @generated
 */
public interface DeviceUseRequestPriority extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fhir.DeviceUseRequestPriorityList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fhir.DeviceUseRequestPriorityList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DeviceUseRequestPriorityList)
	 * @see fhir.FhirPackage#getDeviceUseRequestPriority_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	DeviceUseRequestPriorityList getValue();

	/**
	 * Sets the value of the '{@link fhir.DeviceUseRequestPriority#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fhir.DeviceUseRequestPriorityList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DeviceUseRequestPriorityList value);

	/**
	 * Unsets the value of the '{@link fhir.DeviceUseRequestPriority#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DeviceUseRequestPriorityList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link fhir.DeviceUseRequestPriority#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DeviceUseRequestPriorityList)
	 * @generated
	 */
	boolean isSetValue();

} // DeviceUseRequestPriority
