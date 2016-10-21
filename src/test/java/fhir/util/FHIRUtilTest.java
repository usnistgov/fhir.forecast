package fhir.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class FHIRUtilTest {

	@Test
	public void testConvertDate() {
		java.util.Date dt0 = new java.util.Date();
		org.hl7.fhir.Date dt1 = FHIRUtil.convert(dt0);
		assertNotNull(dt1);
	}

}
