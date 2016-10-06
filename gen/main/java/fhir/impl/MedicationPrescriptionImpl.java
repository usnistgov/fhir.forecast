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

import fhir.CodeableConcept;
import fhir.DateTime;
import fhir.FhirPackage;
import fhir.Identifier;
import fhir.MedicationPrescription;
import fhir.MedicationPrescriptionDispense;
import fhir.MedicationPrescriptionDosageInstruction;
import fhir.MedicationPrescriptionStatus;
import fhir.MedicationPrescriptionSubstitution;
import fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getDateEnded <em>Date Ended</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getReasonEnded <em>Reason Ended</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getDispense <em>Dispense</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link fhir.impl.MedicationPrescriptionImpl#getPriorPrescription <em>Prior Prescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationPrescriptionImpl extends DomainResourceImpl implements MedicationPrescription {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getDateWritten() <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateWritten()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateWritten;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationPrescriptionStatus status;

	/**
	 * The cached value of the '{@link #getDateEnded() <em>Date Ended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnded()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateEnded;

	/**
	 * The cached value of the '{@link #getReasonEnded() <em>Reason Ended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnded()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonEnded;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getPrescriber() <em>Prescriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriber()
	 * @generated
	 * @ordered
	 */
	protected Reference prescriber;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getReasonCodeableConcept() <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonCodeableConcept;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reasonReference;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected fhir.String note;

	/**
	 * The cached value of the '{@link #getMedicationCodeableConcept() <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept medicationCodeableConcept;

	/**
	 * The cached value of the '{@link #getMedicationReference() <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference medicationReference;

	/**
	 * The cached value of the '{@link #getDosageInstruction() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationPrescriptionDosageInstruction> dosageInstruction;

	/**
	 * The cached value of the '{@link #getDispense() <em>Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispense()
	 * @generated
	 * @ordered
	 */
	protected MedicationPrescriptionDispense dispense;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationPrescriptionSubstitution substitution;

	/**
	 * The cached value of the '{@link #getPriorPrescription() <em>Prior Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference priorPrescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationPrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationPrescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_PRESCRIPTION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateWritten() {
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateWritten(DateTime newDateWritten, NotificationChain msgs) {
		DateTime oldDateWritten = dateWritten;
		dateWritten = newDateWritten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN, oldDateWritten, newDateWritten);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateWritten(DateTime newDateWritten) {
		if (newDateWritten != dateWritten) {
			NotificationChain msgs = null;
			if (dateWritten != null)
				msgs = ((InternalEObject)dateWritten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN, null, msgs);
			if (newDateWritten != null)
				msgs = ((InternalEObject)newDateWritten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN, null, msgs);
			msgs = basicSetDateWritten(newDateWritten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN, newDateWritten, newDateWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationPrescriptionStatus newStatus, NotificationChain msgs) {
		MedicationPrescriptionStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationPrescriptionStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateEnded() {
		return dateEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateEnded(DateTime newDateEnded, NotificationChain msgs) {
		DateTime oldDateEnded = dateEnded;
		dateEnded = newDateEnded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED, oldDateEnded, newDateEnded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnded(DateTime newDateEnded) {
		if (newDateEnded != dateEnded) {
			NotificationChain msgs = null;
			if (dateEnded != null)
				msgs = ((InternalEObject)dateEnded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED, null, msgs);
			if (newDateEnded != null)
				msgs = ((InternalEObject)newDateEnded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED, null, msgs);
			msgs = basicSetDateEnded(newDateEnded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED, newDateEnded, newDateEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonEnded() {
		return reasonEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonEnded(CodeableConcept newReasonEnded, NotificationChain msgs) {
		CodeableConcept oldReasonEnded = reasonEnded;
		reasonEnded = newReasonEnded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED, oldReasonEnded, newReasonEnded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonEnded(CodeableConcept newReasonEnded) {
		if (newReasonEnded != reasonEnded) {
			NotificationChain msgs = null;
			if (reasonEnded != null)
				msgs = ((InternalEObject)reasonEnded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED, null, msgs);
			if (newReasonEnded != null)
				msgs = ((InternalEObject)newReasonEnded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED, null, msgs);
			msgs = basicSetReasonEnded(newReasonEnded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED, newReasonEnded, newReasonEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescriber() {
		return prescriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriber(Reference newPrescriber, NotificationChain msgs) {
		Reference oldPrescriber = prescriber;
		prescriber = newPrescriber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER, oldPrescriber, newPrescriber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriber(Reference newPrescriber) {
		if (newPrescriber != prescriber) {
			NotificationChain msgs = null;
			if (prescriber != null)
				msgs = ((InternalEObject)prescriber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER, null, msgs);
			if (newPrescriber != null)
				msgs = ((InternalEObject)newPrescriber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER, null, msgs);
			msgs = basicSetPrescriber(newPrescriber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER, newPrescriber, newPrescriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonCodeableConcept() {
		return reasonCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonCodeableConcept(CodeableConcept newReasonCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldReasonCodeableConcept = reasonCodeableConcept;
		reasonCodeableConcept = newReasonCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, oldReasonCodeableConcept, newReasonCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCodeableConcept(CodeableConcept newReasonCodeableConcept) {
		if (newReasonCodeableConcept != reasonCodeableConcept) {
			NotificationChain msgs = null;
			if (reasonCodeableConcept != null)
				msgs = ((InternalEObject)reasonCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, null, msgs);
			if (newReasonCodeableConcept != null)
				msgs = ((InternalEObject)newReasonCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetReasonCodeableConcept(newReasonCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT, newReasonCodeableConcept, newReasonCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReasonReference() {
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonReference(Reference newReasonReference, NotificationChain msgs) {
		Reference oldReasonReference = reasonReference;
		reasonReference = newReasonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE, oldReasonReference, newReasonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonReference(Reference newReasonReference) {
		if (newReasonReference != reasonReference) {
			NotificationChain msgs = null;
			if (reasonReference != null)
				msgs = ((InternalEObject)reasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE, null, msgs);
			if (newReasonReference != null)
				msgs = ((InternalEObject)newReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE, null, msgs);
			msgs = basicSetReasonReference(newReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE, newReasonReference, newReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhir.String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(fhir.String newNote, NotificationChain msgs) {
		fhir.String oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(fhir.String newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMedicationCodeableConcept() {
		return medicationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMedicationCodeableConcept = medicationCodeableConcept;
		medicationCodeableConcept = newMedicationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT, oldMedicationCodeableConcept, newMedicationCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept) {
		if (newMedicationCodeableConcept != medicationCodeableConcept) {
			NotificationChain msgs = null;
			if (medicationCodeableConcept != null)
				msgs = ((InternalEObject)medicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newMedicationCodeableConcept != null)
				msgs = ((InternalEObject)newMedicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMedicationCodeableConcept(newMedicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT, newMedicationCodeableConcept, newMedicationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMedicationReference() {
		return medicationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationReference(Reference newMedicationReference, NotificationChain msgs) {
		Reference oldMedicationReference = medicationReference;
		medicationReference = newMedicationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE, oldMedicationReference, newMedicationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationReference(Reference newMedicationReference) {
		if (newMedicationReference != medicationReference) {
			NotificationChain msgs = null;
			if (medicationReference != null)
				msgs = ((InternalEObject)medicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE, null, msgs);
			if (newMedicationReference != null)
				msgs = ((InternalEObject)newMedicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE, null, msgs);
			msgs = basicSetMedicationReference(newMedicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE, newMedicationReference, newMedicationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationPrescriptionDosageInstruction> getDosageInstruction() {
		if (dosageInstruction == null) {
			dosageInstruction = new EObjectContainmentEList<MedicationPrescriptionDosageInstruction>(MedicationPrescriptionDosageInstruction.class, this, FhirPackage.MEDICATION_PRESCRIPTION__DOSAGE_INSTRUCTION);
		}
		return dosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionDispense getDispense() {
		return dispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispense(MedicationPrescriptionDispense newDispense, NotificationChain msgs) {
		MedicationPrescriptionDispense oldDispense = dispense;
		dispense = newDispense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE, oldDispense, newDispense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispense(MedicationPrescriptionDispense newDispense) {
		if (newDispense != dispense) {
			NotificationChain msgs = null;
			if (dispense != null)
				msgs = ((InternalEObject)dispense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE, null, msgs);
			if (newDispense != null)
				msgs = ((InternalEObject)newDispense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE, null, msgs);
			msgs = basicSetDispense(newDispense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE, newDispense, newDispense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationPrescriptionSubstitution newSubstitution, NotificationChain msgs) {
		MedicationPrescriptionSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationPrescriptionSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPriorPrescription() {
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorPrescription(Reference newPriorPrescription, NotificationChain msgs) {
		Reference oldPriorPrescription = priorPrescription;
		priorPrescription = newPriorPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION, oldPriorPrescription, newPriorPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorPrescription(Reference newPriorPrescription) {
		if (newPriorPrescription != priorPrescription) {
			NotificationChain msgs = null;
			if (priorPrescription != null)
				msgs = ((InternalEObject)priorPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION, null, msgs);
			if (newPriorPrescription != null)
				msgs = ((InternalEObject)newPriorPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION, null, msgs);
			msgs = basicSetPriorPrescription(newPriorPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION, newPriorPrescription, newPriorPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_PRESCRIPTION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN:
				return basicSetDateWritten(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED:
				return basicSetDateEnded(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED:
				return basicSetReasonEnded(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER:
				return basicSetPrescriber(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				return basicSetReasonCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE:
				return basicSetReasonReference(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__NOTE:
				return basicSetNote(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT:
				return basicSetMedicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE:
				return basicSetMedicationReference(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE:
				return basicSetDispense(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION:
				return basicSetPriorPrescription(null, msgs);
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
			case FhirPackage.MEDICATION_PRESCRIPTION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN:
				return getDateWritten();
			case FhirPackage.MEDICATION_PRESCRIPTION__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED:
				return getDateEnded();
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED:
				return getReasonEnded();
			case FhirPackage.MEDICATION_PRESCRIPTION__PATIENT:
				return getPatient();
			case FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER:
				return getPrescriber();
			case FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				return getReasonCodeableConcept();
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.MEDICATION_PRESCRIPTION__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT:
				return getMedicationCodeableConcept();
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE:
				return getMedicationReference();
			case FhirPackage.MEDICATION_PRESCRIPTION__DOSAGE_INSTRUCTION:
				return getDosageInstruction();
			case FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE:
				return getDispense();
			case FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION:
				return getPriorPrescription();
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
			case FhirPackage.MEDICATION_PRESCRIPTION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN:
				setDateWritten((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__STATUS:
				setStatus((MedicationPrescriptionStatus)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED:
				setDateEnded((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED:
				setReasonEnded((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER:
				setPrescriber((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE:
				setReasonReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__NOTE:
				setNote((fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE:
				setMedicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				getDosageInstruction().addAll((Collection<? extends MedicationPrescriptionDosageInstruction>)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE:
				setDispense((MedicationPrescriptionDispense)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION:
				setSubstitution((MedicationPrescriptionSubstitution)newValue);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)newValue);
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
			case FhirPackage.MEDICATION_PRESCRIPTION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN:
				setDateWritten((DateTime)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__STATUS:
				setStatus((MedicationPrescriptionStatus)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED:
				setDateEnded((DateTime)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED:
				setReasonEnded((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER:
				setPrescriber((Reference)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE:
				setReasonReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__NOTE:
				setNote((fhir.String)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE:
				setMedicationReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE:
				setDispense((MedicationPrescriptionDispense)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION:
				setSubstitution((MedicationPrescriptionSubstitution)null);
				return;
			case FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)null);
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
			case FhirPackage.MEDICATION_PRESCRIPTION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_WRITTEN:
				return dateWritten != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__DATE_ENDED:
				return dateEnded != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_ENDED:
				return reasonEnded != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__PATIENT:
				return patient != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__PRESCRIBER:
				return prescriber != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_CODEABLE_CONCEPT:
				return reasonCodeableConcept != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__REASON_REFERENCE:
				return reasonReference != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__NOTE:
				return note != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_CODEABLE_CONCEPT:
				return medicationCodeableConcept != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__MEDICATION_REFERENCE:
				return medicationReference != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__DOSAGE_INSTRUCTION:
				return dosageInstruction != null && !dosageInstruction.isEmpty();
			case FhirPackage.MEDICATION_PRESCRIPTION__DISPENSE:
				return dispense != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__SUBSTITUTION:
				return substitution != null;
			case FhirPackage.MEDICATION_PRESCRIPTION__PRIOR_PRESCRIPTION:
				return priorPrescription != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationPrescriptionImpl
