/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Answers Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.QuestionnaireAnswersQuestion#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersQuestion#getText <em>Text</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersQuestion#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getQuestionnaireAnswersQuestion()
 * @model extendedMetaData="name='QuestionnaireAnswers.Question' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireAnswersQuestion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireAnswers resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(fhir.String)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersQuestion_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersQuestion#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual question as shown to the user to prompt them for an answer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhir.String)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersQuestion_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getText();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersQuestion#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.QuestionnaireAnswersAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The respondent's answer(s) to the question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see fhir.FhirPackage#getQuestionnaireAnswersQuestion_Answer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireAnswersAnswer> getAnswer();

} // QuestionnaireAnswersQuestion
