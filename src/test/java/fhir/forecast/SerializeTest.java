package fhir.forecast;

import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.Date;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Patient;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fhir.util.FHIRUtil;
import fhir.util.Serialize;
import forecast.util.ForecastUtil;

public class SerializeTest {
	
	Logger log = LoggerFactory.getLogger(SerializeTest.class);
	
	Serialize seri = new Serialize();

	@Test
	public void testItPatientJSON() {
		Patient sut = FhirFactory.eINSTANCE.createPatient();
		XMLGregorianCalendar xgc = FHIRUtil.convert2XMLCalendar("2010-02-03");
		Date birthDate = FhirFactory.eINSTANCE.createDate();
		birthDate.setValue(xgc);
		sut.setBirthDate(birthDate);
		sut.setGender(ForecastUtil.createGender("M"));
		
		String s = seri.it(sut, "sut.json");
		
		log.info("s" + s);
	}
	
	@Test
	public void testItPatientXML() {
		Patient sut = FhirFactory.eINSTANCE.createPatient();
		XMLGregorianCalendar xgc = FHIRUtil.convert2XMLCalendar("2010-02-03");
		Date birthDate = FhirFactory.eINSTANCE.createDate();
		birthDate.setValue(xgc);
		sut.setBirthDate(birthDate);
		sut.setGender(ForecastUtil.createGender("M"));
		
		String s = seri.it(sut, "sut.xml");
		
		log.info("s" + s);
	}}
