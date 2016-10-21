package fhir.forecast;

import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.Date;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Patient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fhir.util.FHIRUtil;
import fhir.util.Save;
import forecast.util.ForecastUtil;

public class SaveTest {
	
	Logger log = LoggerFactory.getLogger(SaveTest.class);

	@Test
	public void testIt() {
		Patient sut = FhirFactory.eINSTANCE.createPatient();
		XMLGregorianCalendar xgc = FHIRUtil.convertString2XMLCalendar(new java.lang.String("2010-02-03"));
		Date birthDate = FhirFactory.eINSTANCE.createDate();
		birthDate.setValue(xgc);
		sut.setBirthDate(birthDate);
		sut.setGender(ForecastUtil.createGender("M"));
		
		String s = Save.it(sut, "sut.xml");
		
		log.info("s" + s);
	}
}
