/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.VisionPrescriptionDispense#getProduct <em>Product</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getEye <em>Eye</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getSphere <em>Sphere</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getAxis <em>Axis</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getPrism <em>Prism</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getBase <em>Base</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getAdd <em>Add</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getPower <em>Power</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getDuration <em>Duration</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getColor <em>Color</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getBrand <em>Brand</em>}</li>
 *   <li>{@link fhir.VisionPrescriptionDispense#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getVisionPrescriptionDispense()
 * @model extendedMetaData="name='VisionPrescription.Dispense' kind='elementOnly'"
 * @generated
 */
public interface VisionPrescriptionDispense extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of vision correction product which is required for the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(Coding)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Product()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProduct();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Coding value);

	/**
	 * Returns the value of the '<em><b>Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The eye for which the lens applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eye</em>' containment reference.
	 * @see #setEye(VisionEyes)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Eye()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eye' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionEyes getEye();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getEye <em>Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eye</em>' containment reference.
	 * @see #getEye()
	 * @generated
	 */
	void setEye(VisionEyes value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lens power measured in diopters (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sphere</em>' containment reference.
	 * @see #setSphere(Decimal)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Sphere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sphere' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getSphere();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getSphere <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' containment reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(Decimal value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Power adjustment for astigmatism measured in diopters (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cylinder</em>' containment reference.
	 * @see #setCylinder(Decimal)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Cylinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cylinder' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getCylinder();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getCylinder <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' containment reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(Decimal value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adjustment for astigmatism measured in integer degrees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(fhir.Integer)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Axis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='axis' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.Integer getAxis();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Prism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of prism to compensate for eye alignment in fractional units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prism</em>' containment reference.
	 * @see #setPrism(Decimal)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Prism()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prism' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPrism();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getPrism <em>Prism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prism</em>' containment reference.
	 * @see #getPrism()
	 * @generated
	 */
	void setPrism(Decimal value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative base, or reference lens edge, for the prism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(VisionBase)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Base()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='base' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionBase getBase();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(VisionBase value);

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Power adjustment for multifocal lenses measured in diopters (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add</em>' containment reference.
	 * @see #setAdd(Decimal)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Add()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='add' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getAdd();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getAdd <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' containment reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(Decimal value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact lens power measured in diopters (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power</em>' containment reference.
	 * @see #setPower(Decimal)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Power()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPower();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getPower <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' containment reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Decimal value);

	/**
	 * Returns the value of the '<em><b>Back Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Back curvature measured in millimeters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Curve</em>' containment reference.
	 * @see #setBackCurve(Decimal)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_BackCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='backCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getBackCurve();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getBackCurve <em>Back Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Curve</em>' containment reference.
	 * @see #getBackCurve()
	 * @generated
	 */
	void setBackCurve(Decimal value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact lens diameter measured in millimeters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diameter</em>' containment reference.
	 * @see #setDiameter(Decimal)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Diameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diameter' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDiameter();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getDiameter <em>Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' containment reference.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended maximum wear period for the lens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(SimpleQuantity)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getDuration();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special color or pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(fhir.String)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getColor();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brand recommendations or restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Brand</em>' containment reference.
	 * @see #setBrand(fhir.String)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Brand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='brand' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getBrand();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getBrand <em>Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' containment reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes for special requirements such as coatings and lens materials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(fhir.String)
	 * @see fhir.FhirPackage#getVisionPrescriptionDispense_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getNotes();

	/**
	 * Sets the value of the '{@link fhir.VisionPrescriptionDispense#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(fhir.String value);

} // VisionPrescriptionDispense
