/**
 */
package fhir.impl;

import org.eclipse.emf.ecore.EClass;

import fhir.Count;
import fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CountImpl extends QuantityImpl implements Count {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCount();
	}

} //CountImpl
