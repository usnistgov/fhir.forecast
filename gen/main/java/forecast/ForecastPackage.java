/**
 */
package forecast;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see forecast.ForecastFactory
 * @model kind="package"
 * @generated
 */
public interface ForecastPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forecast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fhir.forecast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forecast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForecastPackage eINSTANCE = forecast.impl.ForecastPackageImpl.init();

	/**
	 * The meta object id for the '{@link forecast.impl.ForecastImmunizationRecomendationImpl <em>Immunization Recomendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forecast.impl.ForecastImmunizationRecomendationImpl
	 * @see forecast.impl.ForecastPackageImpl#getForecastImmunizationRecomendation()
	 * @generated
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__ID = FhirPackage.IMMUNIZATION_RECOMMENDATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__META = FhirPackage.IMMUNIZATION_RECOMMENDATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__IMPLICIT_RULES = FhirPackage.IMMUNIZATION_RECOMMENDATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__LANGUAGE = FhirPackage.IMMUNIZATION_RECOMMENDATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__TEXT = FhirPackage.IMMUNIZATION_RECOMMENDATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__CONTAINED = FhirPackage.IMMUNIZATION_RECOMMENDATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__EXTENSION = FhirPackage.IMMUNIZATION_RECOMMENDATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__MODIFIER_EXTENSION = FhirPackage.IMMUNIZATION_RECOMMENDATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__IDENTIFIER = FhirPackage.IMMUNIZATION_RECOMMENDATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__PATIENT = FhirPackage.IMMUNIZATION_RECOMMENDATION__PATIENT;

	/**
	 * The feature id for the '<em><b>Recommendation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION__RECOMMENDATION = FhirPackage.IMMUNIZATION_RECOMMENDATION__RECOMMENDATION;

	/**
	 * The number of structural features of the '<em>Immunization Recomendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION_FEATURE_COUNT = FhirPackage.IMMUNIZATION_RECOMMENDATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Immunization Recomendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMENDATION_OPERATION_COUNT = FhirPackage.IMMUNIZATION_RECOMMENDATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forecast.impl.ForecastImmunizationRecommendationRecommendationImpl <em>Immunization Recommendation Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forecast.impl.ForecastImmunizationRecommendationRecommendationImpl
	 * @see forecast.impl.ForecastPackageImpl#getForecastImmunizationRecommendationRecommendation()
	 * @generated
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__EXTENSION = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__ID = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__ID;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__MODIFIER_EXTENSION = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE;

	/**
	 * The feature id for the '<em><b>Vaccine Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER;

	/**
	 * The feature id for the '<em><b>Forecast Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS;

	/**
	 * The feature id for the '<em><b>Date Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Supporting Immunization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION;

	/**
	 * The feature id for the '<em><b>Supporting Patient Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION;

	/**
	 * The number of structural features of the '<em>Immunization Recommendation Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_FEATURE_COUNT = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Immunization Recommendation Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_OPERATION_COUNT = FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forecast.impl.ForecastPatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forecast.impl.ForecastPatientImpl
	 * @see forecast.impl.ForecastPackageImpl#getForecastPatient()
	 * @generated
	 */
	int FORECAST_PATIENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__ID = FhirPackage.PATIENT__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__META = FhirPackage.PATIENT__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__IMPLICIT_RULES = FhirPackage.PATIENT__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__LANGUAGE = FhirPackage.PATIENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__TEXT = FhirPackage.PATIENT__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__CONTAINED = FhirPackage.PATIENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__EXTENSION = FhirPackage.PATIENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__MODIFIER_EXTENSION = FhirPackage.PATIENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__IDENTIFIER = FhirPackage.PATIENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__ACTIVE = FhirPackage.PATIENT__ACTIVE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__NAME = FhirPackage.PATIENT__NAME;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__TELECOM = FhirPackage.PATIENT__TELECOM;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__GENDER = FhirPackage.PATIENT__GENDER;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__BIRTH_DATE = FhirPackage.PATIENT__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Deceased Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__DECEASED_BOOLEAN = FhirPackage.PATIENT__DECEASED_BOOLEAN;

	/**
	 * The feature id for the '<em><b>Deceased Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__DECEASED_DATE_TIME = FhirPackage.PATIENT__DECEASED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__ADDRESS = FhirPackage.PATIENT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Marital Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__MARITAL_STATUS = FhirPackage.PATIENT__MARITAL_STATUS;

	/**
	 * The feature id for the '<em><b>Multiple Birth Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__MULTIPLE_BIRTH_BOOLEAN = FhirPackage.PATIENT__MULTIPLE_BIRTH_BOOLEAN;

	/**
	 * The feature id for the '<em><b>Multiple Birth Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__MULTIPLE_BIRTH_INTEGER = FhirPackage.PATIENT__MULTIPLE_BIRTH_INTEGER;

	/**
	 * The feature id for the '<em><b>Photo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__PHOTO = FhirPackage.PATIENT__PHOTO;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__CONTACT = FhirPackage.PATIENT__CONTACT;

	/**
	 * The feature id for the '<em><b>Animal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__ANIMAL = FhirPackage.PATIENT__ANIMAL;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__COMMUNICATION = FhirPackage.PATIENT__COMMUNICATION;

	/**
	 * The feature id for the '<em><b>Care Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__CARE_PROVIDER = FhirPackage.PATIENT__CARE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__MANAGING_ORGANIZATION = FhirPackage.PATIENT__MANAGING_ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT__LINK = FhirPackage.PATIENT__LINK;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT_FEATURE_COUNT = FhirPackage.PATIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_PATIENT_OPERATION_COUNT = FhirPackage.PATIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forecast.impl.ForecastImmunizationImpl <em>Immunization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forecast.impl.ForecastImmunizationImpl
	 * @see forecast.impl.ForecastPackageImpl#getForecastImmunization()
	 * @generated
	 */
	int FORECAST_IMMUNIZATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__ID = FhirPackage.IMMUNIZATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__META = FhirPackage.IMMUNIZATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__IMPLICIT_RULES = FhirPackage.IMMUNIZATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__LANGUAGE = FhirPackage.IMMUNIZATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__TEXT = FhirPackage.IMMUNIZATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__CONTAINED = FhirPackage.IMMUNIZATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__EXTENSION = FhirPackage.IMMUNIZATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__MODIFIER_EXTENSION = FhirPackage.IMMUNIZATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__IDENTIFIER = FhirPackage.IMMUNIZATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__STATUS = FhirPackage.IMMUNIZATION__STATUS;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__DATE = FhirPackage.IMMUNIZATION__DATE;

	/**
	 * The feature id for the '<em><b>Vaccine Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__VACCINE_CODE = FhirPackage.IMMUNIZATION__VACCINE_CODE;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__PATIENT = FhirPackage.IMMUNIZATION__PATIENT;

	/**
	 * The feature id for the '<em><b>Was Not Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__WAS_NOT_GIVEN = FhirPackage.IMMUNIZATION__WAS_NOT_GIVEN;

	/**
	 * The feature id for the '<em><b>Reported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__REPORTED = FhirPackage.IMMUNIZATION__REPORTED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__PERFORMER = FhirPackage.IMMUNIZATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__REQUESTER = FhirPackage.IMMUNIZATION__REQUESTER;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__ENCOUNTER = FhirPackage.IMMUNIZATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__MANUFACTURER = FhirPackage.IMMUNIZATION__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__LOCATION = FhirPackage.IMMUNIZATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__LOT_NUMBER = FhirPackage.IMMUNIZATION__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__EXPIRATION_DATE = FhirPackage.IMMUNIZATION__EXPIRATION_DATE;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__SITE = FhirPackage.IMMUNIZATION__SITE;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__ROUTE = FhirPackage.IMMUNIZATION__ROUTE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__DOSE_QUANTITY = FhirPackage.IMMUNIZATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__NOTE = FhirPackage.IMMUNIZATION__NOTE;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__EXPLANATION = FhirPackage.IMMUNIZATION__EXPLANATION;

	/**
	 * The feature id for the '<em><b>Reaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__REACTION = FhirPackage.IMMUNIZATION__REACTION;

	/**
	 * The feature id for the '<em><b>Vaccination Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION__VACCINATION_PROTOCOL = FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL;

	/**
	 * The number of structural features of the '<em>Immunization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_FEATURE_COUNT = FhirPackage.IMMUNIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Immunization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_IMMUNIZATION_OPERATION_COUNT = FhirPackage.IMMUNIZATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link forecast.ForecastImmunizationRecomendation <em>Immunization Recomendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunization Recomendation</em>'.
	 * @see forecast.ForecastImmunizationRecomendation
	 * @generated
	 */
	EClass getForecastImmunizationRecomendation();

	/**
	 * Returns the meta object for class '{@link forecast.ForecastImmunizationRecommendationRecommendation <em>Immunization Recommendation Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunization Recommendation Recommendation</em>'.
	 * @see forecast.ForecastImmunizationRecommendationRecommendation
	 * @generated
	 */
	EClass getForecastImmunizationRecommendationRecommendation();

	/**
	 * Returns the meta object for class '{@link forecast.ForecastPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see forecast.ForecastPatient
	 * @generated
	 */
	EClass getForecastPatient();

	/**
	 * Returns the meta object for class '{@link forecast.ForecastImmunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunization</em>'.
	 * @see forecast.ForecastImmunization
	 * @generated
	 */
	EClass getForecastImmunization();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ForecastFactory getForecastFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link forecast.impl.ForecastImmunizationRecomendationImpl <em>Immunization Recomendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forecast.impl.ForecastImmunizationRecomendationImpl
		 * @see forecast.impl.ForecastPackageImpl#getForecastImmunizationRecomendation()
		 * @generated
		 */
		EClass FORECAST_IMMUNIZATION_RECOMENDATION = eINSTANCE.getForecastImmunizationRecomendation();

		/**
		 * The meta object literal for the '{@link forecast.impl.ForecastImmunizationRecommendationRecommendationImpl <em>Immunization Recommendation Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forecast.impl.ForecastImmunizationRecommendationRecommendationImpl
		 * @see forecast.impl.ForecastPackageImpl#getForecastImmunizationRecommendationRecommendation()
		 * @generated
		 */
		EClass FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION = eINSTANCE.getForecastImmunizationRecommendationRecommendation();

		/**
		 * The meta object literal for the '{@link forecast.impl.ForecastPatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forecast.impl.ForecastPatientImpl
		 * @see forecast.impl.ForecastPackageImpl#getForecastPatient()
		 * @generated
		 */
		EClass FORECAST_PATIENT = eINSTANCE.getForecastPatient();

		/**
		 * The meta object literal for the '{@link forecast.impl.ForecastImmunizationImpl <em>Immunization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forecast.impl.ForecastImmunizationImpl
		 * @see forecast.impl.ForecastPackageImpl#getForecastImmunization()
		 * @generated
		 */
		EClass FORECAST_IMMUNIZATION = eINSTANCE.getForecastImmunization();

	}

} //ForecastPackage
