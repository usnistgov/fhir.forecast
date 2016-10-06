/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A  text note which also  contains information about who made the statement and when.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.Annotation#getAuthorReference <em>Author Reference</em>}</li>
 *   <li>{@link fhir.Annotation#getAuthorString <em>Author String</em>}</li>
 *   <li>{@link fhir.Annotation#getTime <em>Time</em>}</li>
 *   <li>{@link fhir.Annotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getAnnotation()
 * @model extendedMetaData="name='Annotation' kind='elementOnly'"
 * @generated
 */
public interface Annotation extends Element {
	/**
	 * Returns the value of the '<em><b>Author Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual responsible for making the annotation. (choose any one of author*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Reference</em>' containment reference.
	 * @see #setAuthorReference(Reference)
	 * @see fhir.FhirPackage#getAnnotation_AuthorReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthorReference();

	/**
	 * Sets the value of the '{@link fhir.Annotation#getAuthorReference <em>Author Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Reference</em>' containment reference.
	 * @see #getAuthorReference()
	 * @generated
	 */
	void setAuthorReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Author String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual responsible for making the annotation. (choose any one of author*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author String</em>' containment reference.
	 * @see #setAuthorString(fhir.String)
	 * @see fhir.FhirPackage#getAnnotation_AuthorString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorString' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getAuthorString();

	/**
	 * Sets the value of the '{@link fhir.Annotation#getAuthorString <em>Author String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author String</em>' containment reference.
	 * @see #getAuthorString()
	 * @generated
	 */
	void setAuthorString(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when this particular annotation was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(DateTime)
	 * @see fhir.FhirPackage#getAnnotation_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTime();

	/**
	 * Sets the value of the '{@link fhir.Annotation#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text of the annotation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhir.String)
	 * @see fhir.FhirPackage#getAnnotation_Text()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getText();

	/**
	 * Sets the value of the '{@link fhir.Annotation#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhir.String value);

} // Annotation
