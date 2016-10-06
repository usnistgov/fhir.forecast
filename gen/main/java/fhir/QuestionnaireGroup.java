/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.QuestionnaireGroup#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link fhir.QuestionnaireGroup#getTitle <em>Title</em>}</li>
 *   <li>{@link fhir.QuestionnaireGroup#getConcept <em>Concept</em>}</li>
 *   <li>{@link fhir.QuestionnaireGroup#getText <em>Text</em>}</li>
 *   <li>{@link fhir.QuestionnaireGroup#getRequired <em>Required</em>}</li>
 *   <li>{@link fhir.QuestionnaireGroup#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link fhir.QuestionnaireGroup#getGroup <em>Group</em>}</li>
 *   <li>{@link fhir.QuestionnaireGroup#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getQuestionnaireGroup()
 * @model extendedMetaData="name='Questionnaire.Group' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(fhir.String)
	 * @see fhir.FhirPackage#getQuestionnaireGroup_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireGroup#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human-readable name for this section of the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(fhir.String)
	 * @see fhir.FhirPackage#getQuestionnaireGroup_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getTitle();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireGroup#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a how this group of questions is known in a particular terminology such as LOINC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see fhir.FhirPackage#getQuestionnaireGroup_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getConcept();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional text for the group, used for display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhir.String)
	 * @see fhir.FhirPackage#getQuestionnaireGroup_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getText();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireGroup#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(fhir.Boolean)
	 * @see fhir.FhirPackage#getQuestionnaireGroup_Required()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireGroup#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Repeats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the group may occur multiple times in the instance, containing multiple sets of answers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeats</em>' containment reference.
	 * @see #setRepeats(fhir.Boolean)
	 * @see fhir.FhirPackage#getQuestionnaireGroup_Repeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeats' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getRepeats();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireGroup#getRepeats <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeats</em>' containment reference.
	 * @see #getRepeats()
	 * @generated
	 */
	void setRepeats(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.QuestionnaireGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sub-group within a group. The ordering of groups within this group is relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see fhir.FhirPackage#getQuestionnaireGroup_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.QuestionnaireQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of questions within this group. The order of questions within the group is relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see fhir.FhirPackage#getQuestionnaireGroup_Question()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireQuestion> getQuestion();

} // QuestionnaireGroup
