/**
 */
package forecast.impl;

import org.eclipse.emf.ecore.EClass;

import fhir.impl.PatientImpl;
import forecast.ForecastPackage;
import forecast.ForecastPatient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ForecastPatientImpl extends PatientImpl implements ForecastPatient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForecastPatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForecastPackage.Literals.FORECAST_PATIENT;
	}

} //ForecastPatientImpl
