package fhir.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import fhir.StructureDefinition;
import fhir.util.Load;

public class ProfileLoadTest {

	@Test
	public void testForecastImmunizationRecomendationRecomendation() {	
		StructureDefinition sut = (StructureDefinition)Load.it("/ForecastImmunizationRecomendationRecomendation.structuredefinition.xml");
		assertNotNull(sut);
	}
	
	@Test
	public void testForecastImmunizationRecomendation() {	
		StructureDefinition sut = (StructureDefinition)Load.it("/ForecastImmunizationRecomendation.structuredefinition.xml");
		assertNotNull(sut);
	}
	
	@Test
	public void testForecastImmunization() {	
		StructureDefinition sut = (StructureDefinition)Load.it("/ForecastImmunization.structuredefinition.xml");
		assertNotNull(sut);
	}

	@Test
	public void testForecastPatient() {	
		StructureDefinition sut = (StructureDefinition)Load.it("/ForecastPatient.structuredefinition.xml");
		assertNotNull(sut);
	}

}
