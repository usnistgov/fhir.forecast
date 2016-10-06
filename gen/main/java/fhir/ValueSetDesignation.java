/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Designation</b></em>'.
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
 *   <li>{@link fhir.ValueSetDesignation#getLanguage <em>Language</em>}</li>
 *   <li>{@link fhir.ValueSetDesignation#getUse <em>Use</em>}</li>
 *   <li>{@link fhir.ValueSetDesignation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getValueSetDesignation()
 * @model extendedMetaData="name='ValueSet.Designation' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDesignation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language this designation is defined for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see fhir.FhirPackage#getValueSetDesignation_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link fhir.ValueSetDesignation#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that details how this designation would be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Coding)
	 * @see fhir.FhirPackage#getValueSetDesignation_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getUse();

	/**
	 * Sets the value of the '{@link fhir.ValueSetDesignation#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Coding value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text value for this designation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhir.String)
	 * @see fhir.FhirPackage#getValueSetDesignation_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getValue();

	/**
	 * Sets the value of the '{@link fhir.ValueSetDesignation#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhir.String value);

} // ValueSetDesignation
