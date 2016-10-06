/**
 */
package forecast;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see forecast.ForecastPackage
 * @generated
 */
public interface ForecastFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForecastFactory eINSTANCE = forecast.impl.ForecastFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Immunization Recomendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recomendation</em>'.
	 * @generated
	 */
	ForecastImmunizationRecomendation createForecastImmunizationRecomendation();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation Recommendation</em>'.
	 * @generated
	 */
	ForecastImmunizationRecommendationRecommendation createForecastImmunizationRecommendationRecommendation();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	ForecastPatient createForecastPatient();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	ForecastImmunization createForecastImmunization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ForecastPackage getForecastPackage();

} //ForecastFactory
