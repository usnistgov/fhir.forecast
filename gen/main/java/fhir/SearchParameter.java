/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.SearchParameter#getUrl <em>Url</em>}</li>
 *   <li>{@link fhir.SearchParameter#getName <em>Name</em>}</li>
 *   <li>{@link fhir.SearchParameter#getStatus <em>Status</em>}</li>
 *   <li>{@link fhir.SearchParameter#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhir.SearchParameter#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhir.SearchParameter#getContact <em>Contact</em>}</li>
 *   <li>{@link fhir.SearchParameter#getDate <em>Date</em>}</li>
 *   <li>{@link fhir.SearchParameter#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link fhir.SearchParameter#getCode <em>Code</em>}</li>
 *   <li>{@link fhir.SearchParameter#getBase <em>Base</em>}</li>
 *   <li>{@link fhir.SearchParameter#getType <em>Type</em>}</li>
 *   <li>{@link fhir.SearchParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.SearchParameter#getXpath <em>Xpath</em>}</li>
 *   <li>{@link fhir.SearchParameter#getXpathUsage <em>Xpath Usage</em>}</li>
 *   <li>{@link fhir.SearchParameter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getSearchParameter()
 * @model extendedMetaData="name='SearchParameter' kind='elementOnly'"
 * @generated
 */
public interface SearchParameter extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhir.FhirPackage#getSearchParameter_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language name identifying the search parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhir.String)
	 * @see fhir.FhirPackage#getSearchParameter_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getName();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this search parameter definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhir.FhirPackage#getSearchParameter_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getStatus <em>Status</em>}' containment reference.
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
	 * A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(fhir.Boolean)
	 * @see fhir.FhirPackage#getSearchParameter_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getExperimental <em>Experimental</em>}' containment reference.
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
	 * The name of the individual or organization that published the search parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(fhir.String)
	 * @see fhir.FhirPackage#getSearchParameter_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.SearchParameterContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhir.FhirPackage#getSearchParameter_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SearchParameterContact> getContact();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhir.FhirPackage#getSearchParameter_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Scope and Usage that this search parameter was created to meet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(fhir.String)
	 * @see fhir.FhirPackage#getSearchParameter_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getRequirements();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code used in the URL or the parameter name in a parameters resource for this search parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhir.FhirPackage#getSearchParameter_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base resource type that this search parameter refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Code)
	 * @see fhir.FhirPackage#getSearchParameter_Base()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='base' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getBase();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of value a search parameter refers to, and how the content is interpreted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhir.FhirPackage#getSearchParameter_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the search parameters and how it used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhir.String)
	 * @see fhir.FhirPackage#getSearchParameter_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDescription();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An XPath expression that returns a set of elements for the search parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xpath</em>' containment reference.
	 * @see #setXpath(fhir.String)
	 * @see fhir.FhirPackage#getSearchParameter_Xpath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getXpath();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getXpath <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' containment reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Xpath Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the search parameter relates to the set of elements returned by evaluating the xpath query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xpath Usage</em>' containment reference.
	 * @see #setXpathUsage(XPathUsageType)
	 * @see fhir.FhirPackage#getSearchParameter_XpathUsage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpathUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathUsageType getXpathUsage();

	/**
	 * Sets the value of the '{@link fhir.SearchParameter#getXpathUsage <em>Xpath Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath Usage</em>' containment reference.
	 * @see #getXpathUsage()
	 * @generated
	 */
	void setXpathUsage(XPathUsageType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Types of resource (if a resource is referenced).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhir.FhirPackage#getSearchParameter_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getTarget();

} // SearchParameter
