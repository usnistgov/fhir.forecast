/**
 */
package forecast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import forecast.ForecastFactory;
import forecast.ForecastImmunization;
import forecast.ForecastImmunizationRecomendation;
import forecast.ForecastImmunizationRecommendationRecommendation;
import forecast.ForecastPackage;
import forecast.ForecastPatient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForecastFactoryImpl extends EFactoryImpl implements ForecastFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForecastFactory init() {
		try {
			ForecastFactory theForecastFactory = (ForecastFactory)EPackage.Registry.INSTANCE.getEFactory(ForecastPackage.eNS_URI);
			if (theForecastFactory != null) {
				return theForecastFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ForecastFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ForecastPackage.FORECAST_IMMUNIZATION_RECOMENDATION: return createForecastImmunizationRecomendation();
			case ForecastPackage.FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createForecastImmunizationRecommendationRecommendation();
			case ForecastPackage.FORECAST_PATIENT: return createForecastPatient();
			case ForecastPackage.FORECAST_IMMUNIZATION: return createForecastImmunization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastImmunizationRecomendation createForecastImmunizationRecomendation() {
		ForecastImmunizationRecomendationImpl forecastImmunizationRecomendation = new ForecastImmunizationRecomendationImpl();
		return forecastImmunizationRecomendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastImmunizationRecommendationRecommendation createForecastImmunizationRecommendationRecommendation() {
		ForecastImmunizationRecommendationRecommendationImpl forecastImmunizationRecommendationRecommendation = new ForecastImmunizationRecommendationRecommendationImpl();
		return forecastImmunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastPatient createForecastPatient() {
		ForecastPatientImpl forecastPatient = new ForecastPatientImpl();
		return forecastPatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastImmunization createForecastImmunization() {
		ForecastImmunizationImpl forecastImmunization = new ForecastImmunizationImpl();
		return forecastImmunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastPackage getForecastPackage() {
		return (ForecastPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ForecastPackage getPackage() {
		return ForecastPackage.eINSTANCE;
	}

} //ForecastFactoryImpl
