/**
 */
package fhir.impl;

import org.eclipse.emf.ecore.EClass;

import fhir.Distance;
import fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DistanceImpl extends QuantityImpl implements Distance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDistance();
	}

} //DistanceImpl
