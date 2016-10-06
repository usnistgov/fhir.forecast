package forecast.util;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tch.fc.model.ForecastActual;
import org.tch.fc.model.TestCase;

import fhir.AdministrativeGenderList;
import fhir.Code;
import fhir.CodeableConcept;
import fhir.FhirFactory;
import fhir.Identifier;
import fhir.ImmunizationRecommendationRecommendation;
import fhir.Meta;
import fhir.Reference;
import fhir.String;
import fhir.Uri;
import fhir.util.FHIRUtil;
import forecast.ForecastFactory;
import forecast.ForecastImmunizationRecomendation;
import forecast.ForecastImmunizationRecommendationRecommendation;
import forecast.ForecastPatient;

public class ForecastUtil {

	private static Logger log = LoggerFactory.getLogger(ForecastUtil.class);

	public static final java.lang.String URL = "http://localhost/forecast/ForecastImmunizationRecomendation";

	public static final String ABSOLUTE_URL = FHIRUtil.convert(URL);

	static Map<String, Uri> mapProfile = new HashMap<String, Uri>();

	public enum PROFILEs {

		FORECAST_PATIENT(URIs.FORECAST_PATIENT), FORECAST_IMMUNIZATION(
				URIs.FORECAST_IMMUNIZATION), FORECAST_IMMUNIZATIONRECOMMENDATION(
						URIs.FORECAST_IMMUNIZATIONRECOMMENDATION), FORECAST_IMMUNIZATIONRECOMMENDATIONRECOMMENDATION(
								URIs.FORECAST_IMMUNIZATIONRECOMMENDATIONRECOMMENDATION);

		public final Reference reference;

		PROFILEs(URIs reference) {
			this.reference = FhirFactory.eINSTANCE.createReference();
			this.reference.setId(FHIRUtil.createId().getValue());
			this.reference.setReference(FHIRUtil.convert(reference.uri.getValue()));
		}
	}

	public enum URIs {

		FORECAST_PATIENT("StructureDefinition/ForecastPatient"), FORECAST_IMMUNIZATION(
				"StructureDefinition/ForecastImmunization"), FORECAST_IMMUNIZATIONRECOMMENDATION(
						"StructureDefinition/ForecastImmunizationRecomendation"), FORECAST_IMMUNIZATIONRECOMMENDATIONRECOMMENDATION(
								"StructureDefinition/ImmunizationRecommendationRecommendation"), FORECAST_CONFORMANCE(
										"Conformance");

		public final Uri uri;

		URIs(java.lang.String uri) {
			this.uri = FhirFactory.eINSTANCE.createUri();
			this.uri.setId(FHIRUtil.createId().getValue());
			this.uri.setValue(uri);
		}
	}

	public static ForecastImmunizationRecomendation convert(java.lang.String id, ForecastActual i, TestCase testCase) {
		ForecastImmunizationRecomendation o = ForecastFactory.eINSTANCE.createForecastImmunizationRecomendation();
		o.setId(FHIRUtil.createId());
		o.setMeta(createMeta(URIs.FORECAST_IMMUNIZATIONRECOMMENDATION));
		o.setPatient(createReference(convert(testCase).getIdentifier().get(0)));
		log.debug("vaccineGroup=" + i.getVaccineGroup());
		ImmunizationRecommendationRecommendation irr = convert(i.getDueDate(), i.getVaccineGroup().getVaccineCvx());
		o.getRecommendation().add(irr);
		return o;
	}

	public static ImmunizationRecommendationRecommendation convert(java.util.Date date, java.lang.String vaccineCvx) {
		log.debug("vaccineCvx=" + vaccineCvx);
		ForecastImmunizationRecommendationRecommendation o = ForecastFactory.eINSTANCE
				.createForecastImmunizationRecommendationRecommendation();
		o.setId(FHIRUtil.createId().getValue());
		o.setDate(FHIRUtil.convertDateTime(date));
		CodeableConcept code = FhirFactory.eINSTANCE.createCodeableConcept();
		code.setText(FHIRUtil.convert(vaccineCvx));
		o.setVaccineCode(code);
		return (ImmunizationRecommendationRecommendation) o;
	}

	public static ForecastPatient convert(TestCase i) {
		log.trace("convert==> i=" + i);
		ForecastPatient o = ForecastFactory.eINSTANCE.createForecastPatient();
		o.setId(FHIRUtil.createId());
		o.getIdentifier().add(FHIRUtil.createIdentifier());
		o.setMeta(createMeta(URIs.FORECAST_PATIENT));
		o.setGender(convertGender(i.getPatientSex()));
		o.setBirthDate(FHIRUtil.convert(i.getPatientDob()));
		return o;
	}

	public static Meta createMeta(URIs profile) {
		Meta meta = FhirFactory.eINSTANCE.createMeta();
		meta.setId(FHIRUtil.createId().getValue());
		meta.getProfile().add(profile.uri);
		return meta;
	}

	public static Reference createReference(Identifier i) {
		Reference o = FhirFactory.eINSTANCE.createReference();
		o.setId(FHIRUtil.createId().getValue());
		o.setReference(FHIRUtil.createURN(i));
		return o;
	}

	public static Code convertGender(java.lang.String gender) {
		Code code = FhirFactory.eINSTANCE.createCode();
		if ("M".equals(gender)) {
			code.setValue(AdministrativeGenderList.MALE.name());
		} else if ("F".equals(gender)) {
			code.setValue(AdministrativeGenderList.FEMALE.name());
		} else {
			code.setValue(AdministrativeGenderList.OTHER.name());
		}
		return code;
	}
}
