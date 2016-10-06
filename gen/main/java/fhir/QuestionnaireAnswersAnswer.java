/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Answers Answer</b></em>'.
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
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueInstant <em>Value Instant</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueString <em>Value String</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueMeasuredQuantity <em>Value Measured Quantity</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link fhir.QuestionnaireAnswersAnswer#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer()
 * @model extendedMetaData="name='QuestionnaireAnswers.Answer' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireAnswersAnswer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(fhir.Boolean)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Decimal</em>' containment reference.
	 * @see #setValueDecimal(Decimal)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValueDecimal();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueDecimal <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Decimal</em>' containment reference.
	 * @see #getValueDecimal()
	 * @generated
	 */
	void setValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Integer</em>' containment reference.
	 * @see #setValueInteger(fhir.Integer)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Integer getValueInteger();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueInteger <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer</em>' containment reference.
	 * @see #getValueInteger()
	 * @generated
	 */
	void setValueInteger(fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Date</em>' containment reference.
	 * @see #setValueDate(Date)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getValueDate();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueDate <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date</em>' containment reference.
	 * @see #getValueDate()
	 * @generated
	 */
	void setValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Date Time</em>' containment reference.
	 * @see #setValueDateTime(DateTime)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Instant</em>' containment reference.
	 * @see #setValueInstant(Instant)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getValueInstant();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueInstant <em>Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Instant</em>' containment reference.
	 * @see #getValueInstant()
	 * @generated
	 */
	void setValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Time</em>' containment reference.
	 * @see #setValueTime(Time)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getValueTime();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueTime <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Time</em>' containment reference.
	 * @see #getValueTime()
	 * @generated
	 */
	void setValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value String</em>' containment reference.
	 * @see #setValueString(fhir.String)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getValueString();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Uri</em>' containment reference.
	 * @see #setValueUri(Uri)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueUri();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueUri <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uri</em>' containment reference.
	 * @see #getValueUri()
	 * @generated
	 */
	void setValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Attachment</em>' containment reference.
	 * @see #setValueAttachment(Attachment)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Coding</em>' containment reference.
	 * @see #setValueCoding(Coding)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getValueCoding();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueCoding <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Coding</em>' containment reference.
	 * @see #getValueCoding()
	 * @generated
	 */
	void setValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Value Measured Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Measured Quantity</em>' attribute.
	 * @see #setValueMeasuredQuantity(Object)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueMeasuredQuantity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='valueMeasuredQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getValueMeasuredQuantity();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueMeasuredQuantity <em>Value Measured Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Measured Quantity</em>' attribute.
	 * @see #getValueMeasuredQuantity()
	 * @generated
	 */
	void setValueMeasuredQuantity(Object value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer (or one of the answers) provided by the respondant to the question. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(Reference)
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_ValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueReference();

	/**
	 * Sets the value of the '{@link fhir.QuestionnaireAnswersAnswer#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.QuestionnaireAnswersGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested group, containing nested question for this question. The order of groups within the question is relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see fhir.FhirPackage#getQuestionnaireAnswersAnswer_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireAnswersGroup> getGroup();

} // QuestionnaireAnswersAnswer
