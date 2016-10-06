package fhir.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fhir.Code;
import fhir.Date;
import fhir.DateTime;
import fhir.FhirFactory;
import fhir.Id;
import fhir.Identifier;
import fhir.String;

public abstract class FHIRUtil {
	
	private static Logger log = LoggerFactory.getLogger(FHIRUtil.class);
	
	public enum FORMAT {
		JSON("json"), XML("xml");
		
		public final Code code;

		FORMAT(java.lang.String code) {
			this.code = FhirFactory.eINSTANCE.createCode();
			this.code.setId(createId().getValue());
			this.code.setValue(code);
		}		
	}

	public enum CONFORMANCE_STATUS {
		DRAFT("draft"), ACTIVE("active"), RETIRED("retired");

		public final Code code;

		CONFORMANCE_STATUS(java.lang.String code) {
			this.code = FhirFactory.eINSTANCE.createCode();
			this.code.setId(createId().getValue());
			this.code.setValue(code);
		}
	}

	public enum BOOLEAN {
		
		TRUE(true),
		FALSE(false);
		
		public final fhir.Boolean bool;
		
		BOOLEAN(java.lang.Boolean bool) {
			this.bool = FhirFactory.eINSTANCE.createBoolean();
			this.bool.setValue(bool);
		}
	}

	public static Id createId() {
		Id id = FhirFactory.eINSTANCE.createId();
		id.setValue(UUID.randomUUID().toString());
		return id;
	}

	public static Identifier createIdentifier() {
		Identifier identifier = FhirFactory.eINSTANCE.createIdentifier();
		identifier.setId(createUuid().toString());
		identifier.setValue(createUuid());
		return identifier;
	}

	public static String createUuid() {
		return convert(UUID.randomUUID().toString());
	}
	
	public static String convert(java.lang.String i) {
		String s = FhirFactory.eINSTANCE.createString();
		s.setValue(i);
		return s;
	}

	public static String createURN(Identifier i) {
		return createURN(i.getValue());
	}

	public static String createURN(String i) {
		StringBuilder bld = new StringBuilder();
		bld.append("urn");
		bld.append(":");
		bld.append("uuid");
		bld.append(":");
		bld.append(i.getValue());
		return convert(bld.toString());
	}

	public static Date convert(java.util.Date i) {
		XMLGregorianCalendar xgc = checkDateInput(i);
		Date date = FhirFactory.eINSTANCE.createDate();
		date.setValue(xgc);
		return date;
	}

	public static DateTime convertDateTime(java.util.Date i) {
		XMLGregorianCalendar xgc = checkDateInput(i);
		DateTime date = FhirFactory.eINSTANCE.createDateTime();
		date.setValue(xgc);
		return date;
	}

	public static XMLGregorianCalendar convertString2XMLCalendar(java.lang.String i) {
		XMLGregorianCalendar xgc = null;
		try {
			xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(i);
		} catch (DatatypeConfigurationException e) {
			log.error("", e);
		}
		return xgc;
	}

	public static XMLGregorianCalendar checkDateInput(java.util.Date i) {
		XMLGregorianCalendar xgc = null;
		if (i == null) {
			return null;
		}
		try {
			Calendar gcal = GregorianCalendar.getInstance();
			gcal.setTime(i);
			xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) gcal);
		} catch (DatatypeConfigurationException e) {
			log.error("", e);
		}
		return xgc;
	}	
}
