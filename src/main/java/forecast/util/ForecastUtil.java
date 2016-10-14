package forecast.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tch.fc.model.EvaluationActual;
import org.tch.fc.model.ForecastActual;
import org.tch.fc.model.TestCase;
import org.tch.fc.model.TestEvent;

import fhir.AdministrativeGenderList;
import fhir.Code;
import fhir.CodeableConcept;
import fhir.Coding;
import fhir.FhirFactory;
import fhir.Identifier;
import fhir.Immunization;
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

		FORECAST_IMPLEMENTATIONGUIDE(URIs.FORECAST_IMPLEMENTATIONGUIDE), FORECAST_PATIENT(
				URIs.FORECAST_PATIENT), FORECAST_IMMUNIZATION(
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

		FORECAST_IMPLEMENTATIONGUIDE("StructureDefinition/ImplementationGuide"), FORECAST_PATIENT(
				"StructureDefinition/ForecastPatient"), FORECAST_IMMUNIZATION(
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

	public static ForecastImmunizationRecomendation createForecastImmunizationRecomendation(ForecastActual i,
			Reference patient, List<TestEvent> events) {
		ForecastImmunizationRecomendation o = ForecastFactory.eINSTANCE.createForecastImmunizationRecomendation();
		o.setId(FHIRUtil.createId());
		o.getIdentifier().add(FHIRUtil.createIdentifier());
		o.setMeta(createMeta(URIs.FORECAST_IMMUNIZATIONRECOMMENDATION));
		o.setPatient(patient);
		log.debug("vaccineGroup=" + i.getVaccineGroup());
		ImmunizationRecommendationRecommendation irr = createImmunizationRecommendationRecommendation(i.getDueDate(),
				i.getVaccineGroup().getVaccineCvx());
		o.getRecommendation().add(irr);
//		Immunization immunization = createImmunizations(events, patient);
//		irr.getSupportingImmunization().add(immunization);
		return o;
	}

	public static ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation(
			java.util.Date date, java.lang.String vaccineCvx) {
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

	public static ForecastPatient createForecastPatient(TestCase i) {
		log.trace("convert==> i=" + i);
		ForecastPatient o = ForecastFactory.eINSTANCE.createForecastPatient();
		o.setId(FHIRUtil.createId());
		o.getIdentifier().add(FHIRUtil.createIdentifier());
		o.setMeta(createMeta(URIs.FORECAST_PATIENT));
		o.setGender(createGender(i.getPatientSex()));
		o.setBirthDate(FHIRUtil.convert(i.getPatientDob()));
		return o;
	}

	public List<Immunization> createImmunizations(List<TestEvent> events, Reference patient) {
		List<Immunization> immunizations = new ArrayList<Immunization>();
//		for(TestEvent event : events) {
//			Immunization immunization = FhirFactory.eINSTANCE.createImmunization();
//			immunization.setId(FHIRUtil.createId());
//			immunization.setStatus(value);
//			immunization.setDate(FHIRUtil.convertDateTime(event.getEventDate()));
//			immunization.setDoseQuantity(value)
//			event.getEvent().
//			CodeableConcept cc = createCodeableConcept(event.getEvaluationActualList());
//			immunization.setVaccineCode(value);
//		}
		return immunizations;
	}

	public static CodeableConcept createCodeableConcept(EvaluationActual eval) {
		CodeableConcept cc = FhirFactory.eINSTANCE.createCodeableConcept();
//		cc.setId("");
//		cc.setText(eval.);
//		Coding coding = FhirFactory.eINSTANCE.createCoding();
//		coding.setId(value);
//		Code value = FhirFactory.eINSTANCE.createCode();
//		value.setValue(value);
//		coding.setCode(event.getLabel());
//		cc.getCoding().add(coding);
		return cc;
	}

	public static Meta createMeta(URIs profile) {
		Meta meta = FhirFactory.eINSTANCE.createMeta();
		meta.setId(FHIRUtil.createId().getValue());
		meta.getProfile().add(profile.uri);
		return meta;
	}

	public static Reference createReference(ForecastPatient i) {
		Reference o = FhirFactory.eINSTANCE.createReference();
		o.setId(FHIRUtil.createId().getValue());
		java.lang.String s = java.lang.String.format("%s?identifier=%s", i.eClass().getName(),
				i.getIdentifier().get(0).getValue().getValue());
		o.setReference(FHIRUtil.createURN(FHIRUtil.convert(s)));
		return o;
	}

	public static Reference createReference(Identifier i) {
		Reference o = FhirFactory.eINSTANCE.createReference();
		o.setId(FHIRUtil.createId().getValue());
		o.setReference(FHIRUtil.createURN(i));
		return o;
	}

	public static Code createGender(java.lang.String gender) {
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

	public static java.lang.String forecastToString(ForecastActual forecastActual) {
		StringBuilder bld = new StringBuilder();
		bld.append("\nVaccineCvx=" + forecastActual.getVaccineCvx());
		bld.append("\nAdminStatus=" + forecastActual.getAdminStatus());
		bld.append("\nDoseNumber=" + forecastActual.getDoseNumber());
		bld.append("\nDueDate=" + forecastActual.getDueDateString());
		bld.append("\nFinishedDate=" + forecastActual.getFinishedDateString());
		bld.append("\nOverdueDate=" + forecastActual.getOverdueDateString());
		bld.append("\nExplanationHtml=" + forecastActual.getExplanationHtml());
		bld.append("\nForecastReason=" + forecastActual.getForecastReason());
		return bld.toString();
	}

	public static java.lang.String testEventsToString(List<TestEvent> events) {
		StringBuilder bld = new StringBuilder();
		bld.append("\n");
		for (TestEvent te : events) {
			bld.append("\n TestEvent==>");
			bld.append("\n VaccineCvx=" + te.getConditionCode());
			bld.append("\n LabelScreen=" + te.getLabelScreen());
			bld.append("\n ScreenId=" + te.getScreenId());
			bld.append("\n TestEventId=" + te.getTestEventId());
			List<EvaluationActual> eal = te.getEvaluationActualList();
			if (eal != null) {
			for (EvaluationActual eval : te.getEvaluationActualList()) {
				bld.append("\n EvaluationActual==>");
				bld.append("\n DoseNumber=" + eval.getDoseNumber());
				bld.append("\n DoseValid=" + eval.getDoseValid());
				bld.append("\n EvaluationReason=" + eval.getEvaluationReason());
				bld.append("\n EvaluationReasonCode=" + eval.getEvaluationReasonCode());
				bld.append("\n EvaluationStatus=" + eval.getEvaluationStatus());
				bld.append("\n ReasonText=" + eval.getReasonCode());
				bld.append("\n ForecastReason=" + eval.getReasonText());
				bld.append("\n SeriesUsedCode=" + eval.getSeriesUsedCode());
				bld.append("\n SeriesUsedText=" + eval.getSeriesUsedText());
				bld.append("\n VaccineCvx=" + eval.getVaccineCvx());
			}
			} else {
				log.debug("getEvaluationActualList was null");
			}
		}
		return bld.toString();
	}
}
