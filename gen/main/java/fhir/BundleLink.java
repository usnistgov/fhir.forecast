/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for a collection of resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.BundleLink#getRelation <em>Relation</em>}</li>
 *   <li>{@link fhir.BundleLink#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getBundleLink()
 * @model extendedMetaData="name='Bundle.Link' kind='elementOnly'"
 * @generated
 */
public interface BundleLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(fhir.String)
	 * @see fhir.FhirPackage#getBundleLink_Relation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getRelation();

	/**
	 * Sets the value of the '{@link fhir.BundleLink#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference details for the link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhir.FhirPackage#getBundleLink_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhir.BundleLink#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

} // BundleLink
