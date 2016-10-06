package forecast.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.tch.fc.model.TestCase;
import org.tch.fc.model.TestEvent;

import forecast.ForecastPatient;

public class ForecastUtilTest {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//	@Test
	public void testConvertStringForecastActualTestCase() {
		fail("Not yet implemented");
	}

//	@Test
	public void testConvertDateString() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertTestCase() {
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
		ForecastPatient patient = ForecastUtil.convert(testCase);
		assertNotNull(patient);
		assertNotNull(patient.getIdentifier());
		assertEquals(1, patient.getIdentifier().size());
	}

//	@Test
	public void testCreateMeta() {
		fail("Not yet implemented");
	}

//	@Test
	public void testCreateReference() {
		fail("Not yet implemented");
	}

//	@Test
	public void testConvertGender() {
		fail("Not yet implemented");
	}

}
