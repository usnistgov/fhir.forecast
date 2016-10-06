/**
 */
package fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fhir.ElementDefinitionSlicing;
import fhir.FhirPackage;
import fhir.SlicingRules;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Slicing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhir.impl.ElementDefinitionSlicingImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link fhir.impl.ElementDefinitionSlicingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhir.impl.ElementDefinitionSlicingImpl#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link fhir.impl.ElementDefinitionSlicingImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionSlicingImpl extends ElementImpl implements ElementDefinitionSlicing {
	/**
	 * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected EList<fhir.String> discriminator;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhir.String description;

	/**
	 * The cached value of the '{@link #getOrdered() <em>Ordered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
	protected fhir.Boolean ordered;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected SlicingRules rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionSlicingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinitionSlicing();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhir.String> getDiscriminator() {
		if (discriminator == null) {
			discriminator = new EObjectContainmentEList<fhir.String>(fhir.String.class, this, FhirPackage.ELEMENT_DEFINITION_SLICING__DISCRIMINATOR);
		}
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhir.String newDescription, NotificationChain msgs) {
		fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhir.Boolean getOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrdered(fhir.Boolean newOrdered, NotificationChain msgs) {
		fhir.Boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED, oldOrdered, newOrdered);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(fhir.Boolean newOrdered) {
		if (newOrdered != ordered) {
			NotificationChain msgs = null;
			if (ordered != null)
				msgs = ((InternalEObject)ordered).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED, null, msgs);
			if (newOrdered != null)
				msgs = ((InternalEObject)newOrdered).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED, null, msgs);
			msgs = basicSetOrdered(newOrdered, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED, newOrdered, newOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRules getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRules(SlicingRules newRules, NotificationChain msgs) {
		SlicingRules oldRules = rules;
		rules = newRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_SLICING__RULES, oldRules, newRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRules(SlicingRules newRules) {
		if (newRules != rules) {
			NotificationChain msgs = null;
			if (rules != null)
				msgs = ((InternalEObject)rules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_SLICING__RULES, null, msgs);
			if (newRules != null)
				msgs = ((InternalEObject)newRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_SLICING__RULES, null, msgs);
			msgs = basicSetRules(newRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_SLICING__RULES, newRules, newRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DISCRIMINATOR:
				return ((InternalEList<?>)getDiscriminator()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED:
				return basicSetOrdered(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_SLICING__RULES:
				return basicSetRules(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DISCRIMINATOR:
				return getDiscriminator();
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION:
				return getDescription();
			case FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED:
				return getOrdered();
			case FhirPackage.ELEMENT_DEFINITION_SLICING__RULES:
				return getRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DISCRIMINATOR:
				getDiscriminator().clear();
				getDiscriminator().addAll((Collection<? extends fhir.String>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION:
				setDescription((fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED:
				setOrdered((fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__RULES:
				setRules((SlicingRules)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DISCRIMINATOR:
				getDiscriminator().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION:
				setDescription((fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED:
				setOrdered((fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__RULES:
				setRules((SlicingRules)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DISCRIMINATOR:
				return discriminator != null && !discriminator.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION_SLICING__DESCRIPTION:
				return description != null;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__ORDERED:
				return ordered != null;
			case FhirPackage.ELEMENT_DEFINITION_SLICING__RULES:
				return rules != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionSlicingImpl
