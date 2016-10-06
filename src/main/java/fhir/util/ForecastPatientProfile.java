package fhir.util;

import fhir.FhirFactory;
import fhir.Instant;
import fhir.Meta;
import fhir.StructureDefinition;

public class ForecastPatientProfile implements Runnable {

	public void run() {
		StructureDefinition profile = FhirFactory.eINSTANCE.createStructureDefinition();
		Meta meta = FhirFactory.eINSTANCE.createMeta();
		Instant instant = FhirFactory.eINSTANCE.createInstant();
//		instant.setValue("2016-08-31T15:20:17.965-04:00");
//		meta.setLastUpdated(instant);
//		profile.setMeta(value);

	}

	public static void main(String[] args) {
		
	}
}
