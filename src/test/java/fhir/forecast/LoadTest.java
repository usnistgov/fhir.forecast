package fhir.forecast;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.Patient;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.StructureDefinition;
import org.junit.Test;

import fhir.util.FHIRUtil;
import fhir.util.Load;
import fhir.util.Save;
import forecast.util.ForecastUtil;

public class LoadTest {

	@Test
	public void testParameters() {
//		EObject eObject = Load.it("/parameters.xml");
//		assertNotNull(eObject);
//		assertTrue(eObject instanceof Parameters);
		Parameters params = FhirFactory.eINSTANCE.createParameters();
		ParametersParameter param = FhirFactory.eINSTANCE.createParametersParameter();
		param.setName(FHIRUtil.convert("assessmentDate"));
		param.setValueDate(FHIRUtil.convert(new Date()));
		params.getParameter().add(param);
		param = FhirFactory.eINSTANCE.createParametersParameter();
		param.setName(FHIRUtil.convert("gender"));
		param.setValueCode(ForecastUtil.createGender("M"));
		params.getParameter().add(param);		
		param = FhirFactory.eINSTANCE.createParametersParameter();
		param.setName(FHIRUtil.convert("birthDate"));
		param.setValueDate(FHIRUtil.convert(new Date()));
		params.getParameter().add(param);
		param = FhirFactory.eINSTANCE.createParametersParameter();
		param.setName(FHIRUtil.convert("immunization"));
		ResourceContainer resource = FhirFactory.eINSTANCE.createResourceContainer();
		Immunization immunization = FhirFactory.eINSTANCE.createImmunization();
		immunization.setId(FHIRUtil.createId());
		Patient patient = FhirFactory.eINSTANCE.createPatient();
		
		patient.getIdentifier().add(FHIRUtil.createIdentifier());
		patient.setBirthDate(FHIRUtil.convert(new Date()));
		patient.setGender(ForecastUtil.createGender("M"));
//		immunization.setPatient(ForecastUtil.createReference(patient));
		immunization.setDate(FHIRUtil.convertDateTime(new Date()));
		resource.setImmunization(immunization);
		resource.setPatient(patient);
		param.setResource(resource);
		params.getParameter().add(param);
		String s = Save.it(params, "xxx.xml");
	}

	@Test
	public void testParametersSD() {
		EObject eObject = Load.it("/ForecastParameters.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testPatient() {
		EObject eObject = Load.it("/ForecastPatient.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImmunization() {
		EObject eObject = Load.it("/ForecastImmunization.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImmunizationRecommendation() {
		EObject eObject = Load.it("/ForecastImmunizationRecommendation.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImmunizationRecommendationRecommendation() {
		EObject eObject = Load.it("/ForecastImmunizationRecommendationRecommendation.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImplementationGuide() {
		EObject eObject = Load.it("/ForecastImplementationGuide.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}
}
