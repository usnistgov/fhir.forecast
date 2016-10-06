/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.Duration#getExtension1 <em>Extension1</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDuration()
 * @model extendedMetaData="name='Duration' kind='elementOnly'"
 * @generated
 */
public interface Duration extends Quantity {
	/**
	 * Returns the value of the '<em><b>Extension1</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exception as inherited from Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension1</em>' containment reference list.
	 * @see fhir.FhirPackage#getDuration_Extension1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getExtension1();

} // Duration
