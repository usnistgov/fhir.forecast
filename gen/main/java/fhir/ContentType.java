/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The content or mime type.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ContentType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getContentType()
 * @model extendedMetaData="name='ContentType' kind='elementOnly'"
 * @generated
 */
public interface ContentType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fhir.ContentTypeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fhir.ContentTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ContentTypeList)
	 * @see fhir.FhirPackage#getContentType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ContentTypeList getValue();

	/**
	 * Sets the value of the '{@link fhir.ContentType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fhir.ContentTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ContentTypeList value);

	/**
	 * Unsets the value of the '{@link fhir.ContentType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ContentTypeList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link fhir.ContentType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ContentTypeList)
	 * @generated
	 */
	boolean isSetValue();

} // ContentType
