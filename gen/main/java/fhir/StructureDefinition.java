/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions, and constraints on resources and data types.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.StructureDefinition#getUrl <em>Url</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getName <em>Name</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getContact <em>Contact</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getDate <em>Date</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getMapping <em>Mapping</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getKind <em>Kind</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getConstrainedType <em>Constrained Type</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getContextType <em>Context Type</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getContext <em>Context</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getBase <em>Base</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getSnapshot <em>Snapshot</em>}</li>
 *   <li>{@link fhir.StructureDefinition#getDifferential <em>Differential</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getStructureDefinition()
 * @model extendedMetaData="name='StructureDefinition' kind='elementOnly'"
 * @generated
 */
public interface StructureDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this structure definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this structure definition is (or will be) published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhir.FhirPackage#getStructureDefinition_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal identifier that is used to identify this StructureDefinition when it is represented in other formats, or referenced in a specification, model, design or an instance  (should be globally unique OID, UUID, or URI), (if it's not possible to use the literal URI).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhir.FhirPackage#getStructureDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that is used to identify this version of the StructureDefinition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the StructureDefinition author manually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhir.String)
	 * @see fhir.FhirPackage#getStructureDefinition_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getVersion();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language name identifying the StructureDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhir.String)
	 * @see fhir.FhirPackage#getStructureDefinition_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getName();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defined so that applications can use this name when displaying the value of the extension to the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhir.String)
	 * @see fhir.FhirPackage#getStructureDefinition_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the StructureDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhir.FhirPackage#getStructureDefinition_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This StructureDefinition was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(fhir.Boolean)
	 * @see fhir.FhirPackage#getStructureDefinition_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the structure definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(fhir.String)
	 * @see fhir.FhirPackage#getStructureDefinition_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.StructureDefinitionContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhir.FhirPackage#getStructureDefinition_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureDefinitionContact> getContact();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date this version of the structure definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the structure definition changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhir.FhirPackage#getStructureDefinition_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the StructureDefinition and its use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhir.String)
	 * @see fhir.FhirPackage#getStructureDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDescription();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of structure definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see fhir.FhirPackage#getStructureDefinition_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUseContext();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explains why this structure definition is needed and why it's been constrained as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(fhir.String)
	 * @see fhir.FhirPackage#getStructureDefinition_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getRequirements();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the structure definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(fhir.String)
	 * @see fhir.FhirPackage#getStructureDefinition_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getCopyright();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of terms from external terminologies that may be used to assist with indexing and searching of templates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhir.FhirPackage#getStructureDefinition_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCode();

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the FHIR specification on which this StructureDefinition is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Version</em>' containment reference.
	 * @see #setFhirVersion(Id)
	 * @see fhir.FhirPackage#getStructureDefinition_FhirVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fhirVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getFhirVersion();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getFhirVersion <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Version</em>' containment reference.
	 * @see #getFhirVersion()
	 * @generated
	 */
	void setFhirVersion(Id value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.StructureDefinitionMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An external specification that the content is mapped to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see fhir.FhirPackage#getStructureDefinition_Mapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructureDefinitionMapping> getMapping();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the kind of structure that this definition is describing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(StructureDefinitionKind)
	 * @see fhir.FhirPackage#getStructureDefinition_Kind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinitionKind getKind();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StructureDefinitionKind value);

	/**
	 * Returns the value of the '<em><b>Constrained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of type that is being constrained - a data type, an extension, a resource, including abstract ones. If this field is present, it indicates that the structure definition is a constraint. If it is not present, then the structure definition is the definition of a base structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrained Type</em>' containment reference.
	 * @see #setConstrainedType(Code)
	 * @see fhir.FhirPackage#getStructureDefinition_ConstrainedType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constrainedType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getConstrainedType();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getConstrainedType <em>Constrained Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Type</em>' containment reference.
	 * @see #getConstrainedType()
	 * @generated
	 */
	void setConstrainedType(Code value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether structure this definition describes is abstract or not  - that is, whether an actual exchanged item can ever be of this type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(fhir.Boolean)
	 * @see fhir.FhirPackage#getStructureDefinition_Abstract()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getAbstract();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an extension, Identifies the context within FHIR resources where the extension can be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Type</em>' containment reference.
	 * @see #setContextType(ExtensionContext)
	 * @see fhir.FhirPackage#getStructureDefinition_ContextType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contextType' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionContext getContextType();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getContextType <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' containment reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(ExtensionContext value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the types of resource or data type elements to which the extension can be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see fhir.FhirPackage#getStructureDefinition_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<fhir.String> getContext();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is the base structure from which this set of constraints is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Uri)
	 * @see fhir.FhirPackage#getStructureDefinition_Base()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='base' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getBase();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Uri value);

	/**
	 * Returns the value of the '<em><b>Snapshot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshot</em>' containment reference.
	 * @see #setSnapshot(StructureDefinitionSnapshot)
	 * @see fhir.FhirPackage#getStructureDefinition_Snapshot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='snapshot' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinitionSnapshot getSnapshot();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getSnapshot <em>Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot</em>' containment reference.
	 * @see #getSnapshot()
	 * @generated
	 */
	void setSnapshot(StructureDefinitionSnapshot value);

	/**
	 * Returns the value of the '<em><b>Differential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Differential</em>' containment reference.
	 * @see #setDifferential(StructureDefinitionDifferential)
	 * @see fhir.FhirPackage#getStructureDefinition_Differential()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='differential' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinitionDifferential getDifferential();

	/**
	 * Sets the value of the '{@link fhir.StructureDefinition#getDifferential <em>Differential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Differential</em>' containment reference.
	 * @see #getDifferential()
	 * @generated
	 */
	void setDifferential(StructureDefinitionDifferential value);

} // StructureDefinition
