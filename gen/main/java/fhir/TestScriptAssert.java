/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.TestScriptAssert#getLabel <em>Label</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getDirection <em>Direction</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getCompareToSourceId <em>Compare To Source Id</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getCompareToSourcePath <em>Compare To Source Path</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getContentType <em>Content Type</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getMinimumId <em>Minimum Id</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getNavigationLinks <em>Navigation Links</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getOperator <em>Operator</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getPath <em>Path</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getResource <em>Resource</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getResponse <em>Response</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getValidateProfileId <em>Validate Profile Id</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getValue <em>Value</em>}</li>
 *   <li>{@link fhir.TestScriptAssert#getWarningOnly <em>Warning Only</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getTestScriptAssert()
 * @model extendedMetaData="name='TestScript.Assert' kind='elementOnly'"
 * @generated
 */
public interface TestScriptAssert extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label would be used for tracking/logging purposes by test engines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getLabel();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description would be used by test engines for tracking and reporting purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getDescription();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direction to use for the assertion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(AssertionDirectionType)
	 * @see fhir.FhirPackage#getTestScriptAssert_Direction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	AssertionDirectionType getDirection();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AssertionDirectionType value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of fixture used to compare the "sourceId/path" evaluations to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compare To Source Id</em>' containment reference.
	 * @see #setCompareToSourceId(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_CompareToSourceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compareToSourceId' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getCompareToSourceId();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getCompareToSourceId <em>Compare To Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Id</em>' containment reference.
	 * @see #getCompareToSourceId()
	 * @generated
	 */
	void setCompareToSourceId(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath or JSONPath expression against fixture used to compare the "sourceId/path" evaluations to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compare To Source Path</em>' containment reference.
	 * @see #setCompareToSourcePath(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_CompareToSourcePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compareToSourcePath' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getCompareToSourcePath();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getCompareToSourcePath <em>Compare To Source Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Path</em>' containment reference.
	 * @see #getCompareToSourcePath()
	 * @generated
	 */
	void setCompareToSourcePath(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(ContentType)
	 * @see fhir.FhirPackage#getTestScriptAssert_ContentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentType getContentType();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(ContentType value);

	/**
	 * Returns the value of the '<em><b>Header Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HTTP header field name e.g. 'Location'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Field</em>' containment reference.
	 * @see #setHeaderField(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_HeaderField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='headerField' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getHeaderField();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getHeaderField <em>Header Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Field</em>' containment reference.
	 * @see #getHeaderField()
	 * @generated
	 */
	void setHeaderField(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Minimum Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Id</em>' containment reference.
	 * @see #setMinimumId(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_MinimumId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minimumId' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getMinimumId();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getMinimumId <em>Minimum Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Id</em>' containment reference.
	 * @see #getMinimumId()
	 * @generated
	 */
	void setMinimumId(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Navigation Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the test execution performs validation on the bundle navigation links.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Navigation Links</em>' containment reference.
	 * @see #setNavigationLinks(fhir.Boolean)
	 * @see fhir.FhirPackage#getTestScriptAssert_NavigationLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='navigationLinks' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getNavigationLinks();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getNavigationLinks <em>Navigation Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Links</em>' containment reference.
	 * @see #getNavigationLinks()
	 * @generated
	 */
	void setNavigationLinks(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operator type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(AssertionOperatorType)
	 * @see fhir.FhirPackage#getTestScriptAssert_Operator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operator' namespace='##targetNamespace'"
	 * @generated
	 */
	AssertionOperatorType getOperator();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AssertionOperatorType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getPath();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Code)
	 * @see fhir.FhirPackage#getTestScriptAssert_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getResource();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Code value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(AssertionResponseTypes)
	 * @see fhir.FhirPackage#getTestScriptAssert_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	AssertionResponseTypes getResponse();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(AssertionResponseTypes value);

	/**
	 * Returns the value of the '<em><b>Response Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the HTTP response code to be tested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Code</em>' containment reference.
	 * @see #setResponseCode(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_ResponseCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseCode' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getResponseCode();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getResponseCode <em>Response Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Code</em>' containment reference.
	 * @see #getResponseCode()
	 * @generated
	 */
	void setResponseCode(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Id</em>' containment reference.
	 * @see #setSourceId(Id)
	 * @see fhir.FhirPackage#getTestScriptAssert_SourceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

	/**
	 * Returns the value of the '<em><b>Validate Profile Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID of the Profile to validate against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate Profile Id</em>' containment reference.
	 * @see #setValidateProfileId(Id)
	 * @see fhir.FhirPackage#getTestScriptAssert_ValidateProfileId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validateProfileId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getValidateProfileId();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getValidateProfileId <em>Validate Profile Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Profile Id</em>' containment reference.
	 * @see #getValidateProfileId()
	 * @generated
	 */
	void setValidateProfileId(Id value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value to compare to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhir.String)
	 * @see fhir.FhirPackage#getTestScriptAssert_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getValue();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Warning Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the test execution will produce a warning only on error for this assert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warning Only</em>' containment reference.
	 * @see #setWarningOnly(fhir.Boolean)
	 * @see fhir.FhirPackage#getTestScriptAssert_WarningOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='warningOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getWarningOnly();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAssert#getWarningOnly <em>Warning Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Only</em>' containment reference.
	 * @see #getWarningOnly()
	 * @generated
	 */
	void setWarningOnly(fhir.Boolean value);

} // TestScriptAssert
