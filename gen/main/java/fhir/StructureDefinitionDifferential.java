/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Definition Differential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions, and constraints on resources and data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.StructureDefinitionDifferential#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getStructureDefinitionDifferential()
 * @model extendedMetaData="name='StructureDefinition.Differential' kind='elementOnly'"
 * @generated
 */
public interface StructureDefinitionDifferential extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.ElementDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures constraints on each element within the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see fhir.FhirPackage#getStructureDefinitionDifferential_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinition> getElement();

} // StructureDefinitionDifferential
