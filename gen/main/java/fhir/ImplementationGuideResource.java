/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ImplementationGuideResource#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhir.ImplementationGuideResource#getName <em>Name</em>}</li>
 *   <li>{@link fhir.ImplementationGuideResource#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.ImplementationGuideResource#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link fhir.ImplementationGuideResource#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link fhir.ImplementationGuideResource#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link fhir.ImplementationGuideResource#getExampleFor <em>Example For</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getImplementationGuideResource()
 * @model extendedMetaData="name='ImplementationGuide.Resource' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why the resource is included in the guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(GuideResourcePurpose)
	 * @see fhir.FhirPackage#getImplementationGuideResource_Purpose()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	GuideResourcePurpose getPurpose();

	/**
	 * Sets the value of the '{@link fhir.ImplementationGuideResource#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(GuideResourcePurpose value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhir.String)
	 * @see fhir.FhirPackage#getImplementationGuideResource_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getName();

	/**
	 * Sets the value of the '{@link fhir.ImplementationGuideResource#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the reason that a resource has been included in the implementation guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhir.String)
	 * @see fhir.FhirPackage#getImplementationGuideResource_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDescription();

	/**
	 * Sets the value of the '{@link fhir.ImplementationGuideResource#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short code that may be used to identify the resource throughout the implementation guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference.
	 * @see #setAcronym(fhir.String)
	 * @see fhir.FhirPackage#getImplementationGuideResource_Acronym()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getAcronym();

	/**
	 * Sets the value of the '{@link fhir.ImplementationGuideResource#getAcronym <em>Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' containment reference.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this resource is found. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Uri</em>' containment reference.
	 * @see #setSourceUri(Uri)
	 * @see fhir.FhirPackage#getImplementationGuideResource_SourceUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSourceUri();

	/**
	 * Sets the value of the '{@link fhir.ImplementationGuideResource#getSourceUri <em>Source Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Uri</em>' containment reference.
	 * @see #getSourceUri()
	 * @generated
	 */
	void setSourceUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this resource is found. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Reference</em>' containment reference.
	 * @see #setSourceReference(Reference)
	 * @see fhir.FhirPackage#getImplementationGuideResource_SourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSourceReference();

	/**
	 * Sets the value of the '{@link fhir.ImplementationGuideResource#getSourceReference <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference</em>' containment reference.
	 * @see #getSourceReference()
	 * @generated
	 */
	void setSourceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Example For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example For</em>' containment reference.
	 * @see #setExampleFor(Reference)
	 * @see fhir.FhirPackage#getImplementationGuideResource_ExampleFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleFor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getExampleFor();

	/**
	 * Sets the value of the '{@link fhir.ImplementationGuideResource#getExampleFor <em>Example For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example For</em>' containment reference.
	 * @see #getExampleFor()
	 * @generated
	 */
	void setExampleFor(Reference value);

} // ImplementationGuideResource
