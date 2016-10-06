/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The status of the response to an order.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.OrderStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getOrderStatus()
 * @model extendedMetaData="name='OrderStatus' kind='elementOnly'"
 * @generated
 */
public interface OrderStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fhir.OrderStatusList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fhir.OrderStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(OrderStatusList)
	 * @see fhir.FhirPackage#getOrderStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	OrderStatusList getValue();

	/**
	 * Sets the value of the '{@link fhir.OrderStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fhir.OrderStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OrderStatusList value);

	/**
	 * Unsets the value of the '{@link fhir.OrderStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(OrderStatusList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link fhir.OrderStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(OrderStatusList)
	 * @generated
	 */
	boolean isSetValue();

} // OrderStatus
