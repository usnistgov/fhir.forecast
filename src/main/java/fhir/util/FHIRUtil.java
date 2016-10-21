package fhir.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.Code;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.String;
import org.hl7.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public abstract class FHIRUtil {
	
	private static Logger log = LoggerFactory.getLogger(FHIRUtil.class);
	
	public final static Id FHIR_VERSION = createFHIRVersion();
	
	public enum AGGREGATION {
		CONTAINED("contained"), REFERENCED("referenced"), BUNDLED("bundled");
		
		public final java.lang.String code;
		
		AGGREGATION(java.lang.String code) {
			this.code = code;
		}
	}
	
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
		
		public final org.hl7.fhir.Boolean bool;
		
		BOOLEAN(java.lang.Boolean bool) {
			this.bool = FhirFactory.eINSTANCE.createBoolean();
			this.bool.setValue(bool);
		}
	}
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");

	public static Instant createInstant(java.lang.String s) {
		Instant instant = FhirFactory.eINSTANCE.createInstant();
		instant.setValue(convertString2XMLCalendar(s));
		return instant;
	}
	
	public static Id createId(java.lang.String sId) {
		Id id = FhirFactory.eINSTANCE.createId();
		id.setValue(sId);
		return id;
	}

	public static Id createId() {
		Id id = FhirFactory.eINSTANCE.createId();
		id.setValue(UUID.randomUUID().toString());
		return id;
	}
	
	public static Id createFHIRVersion() {
		Id id = FhirFactory.eINSTANCE.createId();
		id.setId(createId().getId());
		id.setValue("STU3");
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
	
	public static Uri createUri(java.lang.String s) {
		Uri uri = FhirFactory.eINSTANCE.createUri();
		uri.setValue(s);
		return uri;
	}

	public static String createURN(Identifier i) {
		return createURN(i.getValue());
	}

	public static String createURN(String i) {
		java.lang.String o = "urn:uuid:" + i.getValue();
		return convert(o);
	}

	public static org.hl7.fhir.Date convert(java.util.Date i) {
		XMLGregorianCalendar xgc = checkDateInput(i);
		Date o = FhirFactory.eINSTANCE.createDate();
		o.setValue(xgc);
		return o;
	}

	public static java.util.Date convert(org.hl7.fhir.Date i) throws ParseException {
		return sdf.parse(i.getId());
	}
	
	public static java.util.Date convert(DateTime i) {
		XMLGregorianCalendar xgc = i.getValue();
		return xgc.toGregorianCalendar().getTime();
	}

	public static DateTime convertDateTime(java.util.Date i) {
		XMLGregorianCalendar xgc = checkDateInput(i);
		DateTime o = FhirFactory.eINSTANCE.createDateTime();
		o.setValue(xgc);
		return o;
	}

	public static XMLGregorianCalendar convertString2XMLCalendar(java.lang.String i) {
		XMLGregorianCalendar o = null;
		try {
			o = DatatypeFactory.newInstance().newXMLGregorianCalendar(i);
		} catch (DatatypeConfigurationException e) {
			log.error("", e);
		}
		return o;
	}

	public static XMLGregorianCalendar checkDateInput(java.util.Date i) {
		XMLGregorianCalendar o = null;
		if (i == null) {
			return null;
		}
		try {
			Calendar gcal = GregorianCalendar.getInstance();
			gcal.setTime(i);
			o = DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) gcal);
		} catch (DatatypeConfigurationException e) {
			log.error("", e);
		}
		return o;
	}	
}
