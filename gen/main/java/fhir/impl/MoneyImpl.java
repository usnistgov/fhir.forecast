/**
 */
package fhir.impl;

import org.eclipse.emf.ecore.EClass;

import fhir.FhirPackage;
import fhir.Money;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Money</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MoneyImpl extends QuantityImpl implements Money {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMoney();
	}

} //MoneyImpl
