package fhir.forecast;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import fhir.StructureDefinition;
import fhir.util.Load;

public class LoadTest {

	@Test
	public void testCDSiPatient() {
		EObject eObject = Load.it("/ForecastPatient.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition)eObject;
//		StructureDefinitionSnapshot snap = def.getSnapshot();
//		snap.getElement();
	}

	@Test
	public void testImmunization() {
		EObject eObject = Load.it("/ForecastPatientImmunization.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition)eObject;
//		StructureDefinitionSnapshot snap = def.getSnapshot();
//		snap.getElement();
	}

	@Test
	public void testImmunizationRecommendation() {
		EObject eObject = Load.it("/ForecastPatientImmunizationRecommendation.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition)eObject;
//		StructureDefinitionSnapshot snap = def.getSnapshot();
//		snap.getElement();
	}

	@Test
	public void testImmunizationRecommendationRecommendation() {
		EObject eObject = Load.it("/ForecastPatientImmunizationRecommendationRecommendation.structuredefinition.xml");
		assertNotNull(eObject);
		assertTrue(eObject instanceof StructureDefinition);
		StructureDefinition def = (StructureDefinition)eObject;
//		StructureDefinitionSnapshot snap = def.getSnapshot();
//		snap.getElement();
	}
}
