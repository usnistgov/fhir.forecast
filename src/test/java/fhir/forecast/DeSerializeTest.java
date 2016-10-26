package fhir.forecast;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
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

import fhir.util.DeSerialize;
import fhir.util.FHIRUtil;
import fhir.util.Serialize;
import forecast.util.ForecastUtil;

public class DeSerializeTest {

	Serialize seri = new Serialize();
	DeSerialize deSeri = new DeSerialize();

	@Test
	public void testParametersJSON() {
		Parameters params = createParameters();
		Serialize save = new Serialize();
		String s = save.it(params, "xxx.json");
		EObject s1 = deSeri.it(new StringReader(s), "json");
		assertNotNull(s1);
	}

	@Test
	public void testParametersXML() {
		Parameters params = createParameters();
		Serialize save = new Serialize();
		String s = save.it(params, "xxx.xml");
		EObject s1 = deSeri.it(new StringReader(s), "xml");
		assertNotNull(s1);
	}

	@Test
	public void testParametersSD() {
		EObject eObject = deSeri.it("/ForecastParameters.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testPatient() {
		EObject eObject = deSeri.it("/ForecastPatient.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImmunization() {
		EObject eObject = deSeri.it("/ForecastImmunization.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImmunizationRecommendation() {
		EObject eObject = deSeri.it("/ForecastImmunizationRecommendation.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImmunizationRecommendationRecommendation() {
		EObject eObject = deSeri.it("/ForecastImmunizationRecommendationRecommendation.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}

	@Test
	public void testImplementationGuide() {
		EObject eObject = deSeri.it("/ForecastImplementationGuide.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition) eObject;
	}
	
	public Parameters createParameters() {
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

		immunization.setDate(FHIRUtil.convertDateTime(new Date()));
		resource.setImmunization(immunization);
		resource.setPatient(patient);
		param.setResource(resource);
		params.getParameter().add(param);
		return params;
	}
}
