/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.OperationDefinitionBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link fhir.OperationDefinitionBinding#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link fhir.OperationDefinitionBinding#getValueSetReference <em>Value Set Reference</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getOperationDefinitionBinding()
 * @model extendedMetaData="name='OperationDefinition.Binding' kind='elementOnly'"
 * @generated
 */
public interface OperationDefinitionBinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(Code)
	 * @see fhir.FhirPackage#getOperationDefinitionBinding_Strength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStrength();

	/**
	 * Sets the value of the '{@link fhir.OperationDefinitionBinding#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Code value);

	/**
	 * Returns the value of the '<em><b>Value Set Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used. (choose any one of valueSet*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #setValueSetUri(Uri)
	 * @see fhir.FhirPackage#getOperationDefinitionBinding_ValueSetUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueSetUri();

	/**
	 * Sets the value of the '{@link fhir.OperationDefinitionBinding#getValueSetUri <em>Value Set Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #getValueSetUri()
	 * @generated
	 */
	void setValueSetUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Set Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used. (choose any one of valueSet*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #setValueSetReference(Reference)
	 * @see fhir.FhirPackage#getOperationDefinitionBinding_ValueSetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueSetReference();

	/**
	 * Sets the value of the '{@link fhir.OperationDefinitionBinding#getValueSetReference <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #getValueSetReference()
	 * @generated
	 */
	void setValueSetReference(Reference value);

} // OperationDefinitionBinding
