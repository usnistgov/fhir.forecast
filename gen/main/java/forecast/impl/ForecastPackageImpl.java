/**
 */
package forecast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import fhir.FhirPackage;
import fhir.impl.FhirPackageImpl;
import forecast.ForecastFactory;
import forecast.ForecastImmunization;
import forecast.ForecastImmunizationRecomendation;
import forecast.ForecastImmunizationRecommendationRecommendation;
import forecast.ForecastPackage;
import forecast.ForecastPatient;
import xhtml.XhtmlPackage;
import xhtml.impl.XhtmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForecastPackageImpl extends EPackageImpl implements ForecastPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forecastImmunizationRecomendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forecastImmunizationRecommendationRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forecastPatientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forecastImmunizationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see forecast.ForecastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ForecastPackageImpl() {
		super(eNS_URI, ForecastFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ForecastPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ForecastPackage init() {
		if (isInited) return (ForecastPackage)EPackage.Registry.INSTANCE.getEPackage(ForecastPackage.eNS_URI);

		// Obtain or create and register package
		ForecastPackageImpl theForecastPackage = (ForecastPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ForecastPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ForecastPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FhirPackageImpl theFhirPackage = (FhirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI) instanceof FhirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI) : FhirPackage.eINSTANCE);
		XhtmlPackageImpl theXhtmlPackage = (XhtmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI) instanceof XhtmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI) : XhtmlPackage.eINSTANCE);

		// Load packages
		theFhirPackage.loadPackage();
		theXhtmlPackage.loadPackage();

		// Create package meta-data objects
		theForecastPackage.createPackageContents();

		// Initialize created meta-data
		theForecastPackage.initializePackageContents();

		// Fix loaded packages
		theFhirPackage.fixPackageContents();
		theXhtmlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theForecastPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ForecastPackage.eNS_URI, theForecastPackage);
		return theForecastPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForecastImmunizationRecomendation() {
		return forecastImmunizationRecomendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForecastImmunizationRecommendationRecommendation() {
		return forecastImmunizationRecommendationRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForecastPatient() {
		return forecastPatientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForecastImmunization() {
		return forecastImmunizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForecastFactory getForecastFactory() {
		return (ForecastFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		forecastImmunizationRecomendationEClass = createEClass(FORECAST_IMMUNIZATION_RECOMENDATION);

		forecastImmunizationRecommendationRecommendationEClass = createEClass(FORECAST_IMMUNIZATION_RECOMMENDATION_RECOMMENDATION);

		forecastPatientEClass = createEClass(FORECAST_PATIENT);

		forecastImmunizationEClass = createEClass(FORECAST_IMMUNIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FhirPackage theFhirPackage = (FhirPackage)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		forecastImmunizationRecomendationEClass.getESuperTypes().add(theFhirPackage.getImmunizationRecommendation());
		forecastImmunizationRecommendationRecommendationEClass.getESuperTypes().add(theFhirPackage.getImmunizationRecommendationRecommendation());
		forecastPatientEClass.getESuperTypes().add(theFhirPackage.getPatient());
		forecastImmunizationEClass.getESuperTypes().add(theFhirPackage.getImmunization());

		// Initialize classes, features, and operations; add parameters
		initEClass(forecastImmunizationRecomendationEClass, ForecastImmunizationRecomendation.class, "ForecastImmunizationRecomendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forecastImmunizationRecommendationRecommendationEClass, ForecastImmunizationRecommendationRecommendation.class, "ForecastImmunizationRecommendationRecommendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forecastPatientEClass, ForecastPatient.class, "ForecastPatient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forecastImmunizationEClass, ForecastImmunization.class, "ForecastImmunization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ForecastPackageImpl
