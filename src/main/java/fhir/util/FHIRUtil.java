package fhir.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.Code;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.SimpleQuantity;
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
	
	public enum IMMUNIZATION_STATUS {
		IN_PROGRESS("in-progress", 	"In Progress"), ON_HOLD("on-hold","On Hold"), COMPLETED("completed", "Completed"), ENTERED_IN_ERROR("entered-in-error", "Entered in Error"), STOPPED("stopped", "Stopped");

		public final Coding coding;

		IMMUNIZATION_STATUS(java.lang.String s, java.lang.String display) {
			this.coding = FhirFactory.eINSTANCE.createCoding();
			Code code = FhirFactory.eINSTANCE.createCode();
			code.setId(createId().getValue());
			code.setValue(s);
			coding.setSystem(createUri("http://hl7.org/fhir/immunization-status"));
			coding.setCode(code);
			coding.setDisplay(FHIRUtil.convert(display));
		}
	}

	public enum IMMUNIZATION_RECOMMENDATION_STATUS {
		DUE("due"), OVERDUE("overdue");

		public final Coding coding;

		IMMUNIZATION_RECOMMENDATION_STATUS(java.lang.String s) {
			this.coding = FhirFactory.eINSTANCE.createCoding();
			Code code = FhirFactory.eINSTANCE.createCode();
			code.setId(createId().getValue());
			code.setValue(s);
			coding.setCode(code);
		}
	}
	
	public enum IMMUNIZATION_RECOMMENDATION_DATE_CRITERION {
		DUE("due", "Due Date"), RECOMMENDED("reommended","Recommended Date"), EARLIEST("earliest", "Earliest Date"), OVERDUE("overdue", "Past Due Date"), LATEST("latest", "Latest Date");

		public final Coding coding;

		IMMUNIZATION_RECOMMENDATION_DATE_CRITERION(java.lang.String s, java.lang.String display) {
			this.coding = FhirFactory.eINSTANCE.createCoding();
			Code code = FhirFactory.eINSTANCE.createCode();
			code.setId(createId().getValue());
			code.setValue(s);
			coding.setSystem(createUri("http://hl7.org/fhir/immunization-recommendation-date-criterion"));
			coding.setCode(code);
			coding.setDisplay(FHIRUtil.convert(display));
		}
	}

	public enum BOOLEAN {

		TRUE(true), FALSE(false);

		public final org.hl7.fhir.Boolean bool;

		BOOLEAN(java.lang.Boolean bool) {
			this.bool = FhirFactory.eINSTANCE.createBoolean();
			this.bool.setValue(bool);
		}
	}
                
	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        public static final SimpleDateFormat sdfShort = new SimpleDateFormat("yyyy-MM-dd");

	public static Instant createInstant(java.util.Date date) {
		Instant instant = FhirFactory.eINSTANCE.createInstant();
		instant.setValue(convert2XMLCalendar(date));
		return instant;
	}

	public static Instant createInstant(java.lang.String s) {
		Instant instant = FhirFactory.eINSTANCE.createInstant();
		instant.setValue(convert2XMLCalendar(s));
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
		//identifier.setId(createUuid().toString());                
                identifier.setId(createUuid().getValue());
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
	
	public static SimpleQuantity createQuantity(BigDecimal i) {
		SimpleQuantity quantity = FhirFactory.eINSTANCE.createSimpleQuantity();
//		quantity.setId(value);
//		quantity.setCode(value);
//		quantity.setComparator(value);
//		quantity.setSystem(value);
//		quantity.setUnit(value);
		Decimal dec = FhirFactory.eINSTANCE.createDecimal();
		dec.setValue(i);
		quantity.setValue(dec);
		return quantity;
	}

	public static org.hl7.fhir.Date convert(java.util.Date i) {
		XMLGregorianCalendar xgc = checkDateInput(i);
		Date o = FhirFactory.eINSTANCE.createDate();
		o.setValue(xgc);
		return o;
	}

	public static java.util.Date convert(org.hl7.fhir.Date i) throws ParseException {
                if(i.getValue().toString().length() == 10)
                    return  sdfShort.parse(i.getValue().toString());
		return sdf.parse(i.getValue().toString());
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

	public static XMLGregorianCalendar convert2XMLCalendar(java.lang.String i) {
		XMLGregorianCalendar o = null;
		try {
			o = DatatypeFactory.newInstance().newXMLGregorianCalendar(i);
		} catch (DatatypeConfigurationException e) {
			log.error("", e);
		}
		return o;
	}

	public static XMLGregorianCalendar convert2XMLCalendar(java.util.Date i) {
		XMLGregorianCalendar o = null;
		try {
			Calendar cal = GregorianCalendar.getInstance();
			cal.setTime(i);
			o = DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar)cal);
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
