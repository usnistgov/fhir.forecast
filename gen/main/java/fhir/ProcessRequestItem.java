/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Request Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.ProcessRequestItem#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getProcessRequestItem()
 * @model extendedMetaData="name='ProcessRequest.Item' kind='elementOnly'"
 * @generated
 */
public interface ProcessRequestItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #setSequenceLinkId(fhir.Integer)
	 * @see fhir.FhirPackage#getProcessRequestItem_SequenceLinkId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequenceLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Integer getSequenceLinkId();

	/**
	 * Sets the value of the '{@link fhir.ProcessRequestItem#getSequenceLinkId <em>Sequence Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Link Id</em>' containment reference.
	 * @see #getSequenceLinkId()
	 * @generated
	 */
	void setSequenceLinkId(fhir.Integer value);

} // ProcessRequestItem
