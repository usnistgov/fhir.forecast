package forecast.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.tch.fc.ConnectFactory;
import org.tch.fc.ConnectorInterface;
import org.tch.fc.model.ForecastActual;
import org.tch.fc.model.Service;
import org.tch.fc.model.Software;
import org.tch.fc.model.SoftwareResult;
import org.tch.fc.model.TestCase;
import org.tch.fc.model.TestEvent;
import org.tch.fc.model.VaccineGroup;

import fhir.Reference;
import forecast.ForecastImmunizationRecomendation;
import forecast.ForecastPatient;

public class ForecastUtilTest {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public static final String serviceUrl = "http://tchforecasttester.org/fv/forecast";

	// @Test
	public void testConvertStringForecastActualTestCase() {
		fail("Not yet implemented");
	}

	// @Test
	public void testConvertDateString() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCreateReference() {
		TestCase testCase = createTestCase();
		ForecastPatient patient = (ForecastPatient) ForecastUtil.createForecastPatient(testCase);
		ForecastUtil.createReference(patient);
	}

//	@Test
	public void testConvert() {
		Software software = new Software();
		software.setServiceUrl(serviceUrl);
		Service service = Service.getService("TCH");
		software.setService(service);
		TestCase testCase = createTestCase();
		ConnectorInterface connector;
		try {
			connector = ConnectFactory.createConnecter(software, VaccineGroup.getForecastItemList());
			java.util.List<ForecastActual> forecastActualList = connector.queryForForecast(testCase,
					new SoftwareResult());
			ForecastActual actual = forecastActualList.get(0);
			ForecastPatient patient = (ForecastPatient) ForecastUtil.createForecastPatient(testCase);
			Reference patientRef = ForecastUtil.createReference(patient.getIdentifier().get(0));
			ForecastImmunizationRecomendation recommendation = ForecastUtil.createForecastImmunizationRecomendation(actual, patientRef, testCase.getTestEventList());
			assertNotNull(recommendation);
			assertNotNull(recommendation.getIdentifier());
			assertEquals(1, recommendation.getIdentifier().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void testConvertTestCase() {
		TestCase testCase = createTestCase();
		ForecastPatient patient = ForecastUtil.createForecastPatient(testCase);
		assertNotNull(patient);
		assertNotNull(patient.getIdentifier());
		assertEquals(1, patient.getIdentifier().size());
	}

	// @Test
	public void testCreateMeta() {
		fail("Not yet implemented");
	}

	// @Test
	public void testConvertGender() {
		fail("Not yet implemented");
	}

	TestCase createTestCase() {
		TestCase testCase = new TestCase();
		try {
			testCase.setEvalDate(sdf.parse("2011-03-11"));
			testCase.setPatientSex("M");
			testCase.setPatientDob(sdf.parse("2012-01-01"));
			List<TestEvent> events = new ArrayList<TestEvent>();
			events.add(new TestEvent(200, sdf.parse("2011-01-02")));
			events.add(new TestEvent(300, sdf.parse("2011-01-03")));
			testCase.setTestEventList(events);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return testCase;
	}

}
