package forecast.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.AdministrativeGenderList;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.String;
import org.hl7.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tch.fc.model.EvaluationActual;
import org.tch.fc.model.ForecastActual;
import org.tch.fc.model.TestCase;
import org.tch.fc.model.TestEvent;

import fhir.util.FHIRUtil;

public class ForecastUtil {

	private static Logger log = LoggerFactory.getLogger(ForecastUtil.class);

	public static final java.lang.String URL = "http://localhost/forecast/ForecastImmunizationRecomendation";

	public static final String ABSOLUTE_URL = FHIRUtil.convert(URL);

	static Map<String, Uri> mapProfile = new HashMap<String, Uri>();

	public enum FORECAST_PARAMETERs {

		SERVICE_URL("serviceURL"), SERVICE_TYPE("serviceType"), ASSESMENT_DATE("assessmentDate"), BIRTH_DATE(
				"birthDate"), GENDER("gender"), IMMUNIZATION("immunization"), IMMUNIZATIONS("immunizations");

		public final java.lang.String code;

		FORECAST_PARAMETERs(java.lang.String code) {
			this.code = code;
		}
	}

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

		FORECAST_IMPLEMENTATIONGUIDE("ForecastImplementationGuide"), FORECAST_PATIENT(
				"ForecastPatient"), FORECAST_IMMUNIZATION(
						"ForecastImmunization"), FORECAST_IMMUNIZATIONRECOMMENDATION(
								"ForecastImmunizationRecommendation"), FORECAST_IMMUNIZATIONRECOMMENDATIONRECOMMENDATION(
										"ForecastImmunizationRecommendationRecommendation"), FORECAST_CONFORMANCE(
												"Conformance");

		public final Uri uri;

		URIs(java.lang.String uri) {
			this.uri = FhirFactory.eINSTANCE.createUri();
			this.uri.setId(FHIRUtil.createId().getValue());
			this.uri.setValue(uri);
		}
	}

	public static ImmunizationRecommendation createForecastImmunizationRecommendation(ForecastActual i, Patient patient,
			List<TestEvent> events) {
		ImmunizationRecommendation o = FhirFactory.eINSTANCE.createImmunizationRecommendation();
		o.setId(FHIRUtil.createId());
		o.getIdentifier().add(FHIRUtil.createIdentifier());
		o.setMeta(createMeta(URIs.FORECAST_IMMUNIZATIONRECOMMENDATION));
		ResourceContainer rc0 = FhirFactory.eINSTANCE.createResourceContainer();
		rc0.setPatient(patient);
		o.getContained().add(rc0);
		log.debug("vaccineGroup=" + i.getVaccineGroup());
		ImmunizationRecommendationRecommendation irr = createImmunizationRecommendationRecommendation(i);
		o.getRecommendation().add(irr);
		return o;
	}

	public static ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation(
			ForecastActual i) {   
		ImmunizationRecommendationRecommendation o = FhirFactory.eINSTANCE
				.createImmunizationRecommendationRecommendation();
		o.setId(FHIRUtil.createId().getValue());
		o.setDate(FHIRUtil.convertDateTime(i.getDueDate()));
		CodeableConcept code = FhirFactory.eINSTANCE.createCodeableConcept();
		//code.setText(FHIRUtil.convert(i.getVaccineCvx()));
                code.setText(FHIRUtil.convert(i.getVaccineGroup().getVaccineCvx()));
                Coding coding = FhirFactory.eINSTANCE.createCoding();
                Code c = FhirFactory.eINSTANCE.createCode();
                c.setValue(i.getVaccineGroup().getVaccineCvx());
                
                coding.setCode(c);
                code.getCoding().add(coding);
		o.setVaccineCode(code);                
		PositiveInt pi = FhirFactory.eINSTANCE.createPositiveInt();
                
                if(i.getDoseNumber() != null && !"".isEmpty())
                    pi.setValue(new BigInteger(i.getDoseNumber()));
           //     else if(i.getVaccineGroup(). != null)
           //         pi.setValue(new BigInteger(i.getVaccineGroup().getEvaluationActualList().get(0).getDoseNumber()));

       //         pi.setValue(new BigInteger("123"));
       
                CodeableConcept adminStatus = FhirFactory.eINSTANCE.createCodeableConcept();
                Coding adminStatusCoding = FhirFactory.eINSTANCE.createCoding();
                Code adminStatusCode = FhirFactory.eINSTANCE.createCode();
                adminStatusCode.setValue(i.getAdminStatus());
                adminStatusCoding.setCode(adminStatusCode);
                adminStatus.getCoding().add(adminStatusCoding);
                o.setForecastStatus(adminStatus);
                             
		o.setDoseNumber(pi);
		CodeableConcept forecastStatus = FhirFactory.eINSTANCE.createCodeableConcept();                
		forecastStatus.getCoding().add(FHIRUtil.IMMUNIZATION_RECOMMENDATION_STATUS.DUE.coding);

		ImmunizationRecommendationDateCriterion dueCriterion = createImmunizationRecommendationDateCriterion(
				FHIRUtil.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION.DUE, i.getDueDate());
		o.getDateCriterion().add(dueCriterion);
		ImmunizationRecommendationDateCriterion earliestCriterion = createImmunizationRecommendationDateCriterion(
				FHIRUtil.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION.EARLIEST, i.getDueDate());
		o.getDateCriterion().add(earliestCriterion);
		ImmunizationRecommendationDateCriterion overdueCriterion = createImmunizationRecommendationDateCriterion(
				FHIRUtil.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION.OVERDUE, i.getOverdueDate());
		o.getDateCriterion().add(overdueCriterion);
		ImmunizationRecommendationDateCriterion latestCriterion = createImmunizationRecommendationDateCriterion(
				FHIRUtil.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION.LATEST, i.getOverdueDate());
		o.getDateCriterion().add(latestCriterion);
 
		return (ImmunizationRecommendationRecommendation) o;
	}

	public static ImmunizationRecommendationDateCriterion createImmunizationRecommendationDateCriterion(
			FHIRUtil.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION crit, java.util.Date date) {
		ImmunizationRecommendationDateCriterion dateCriterion = FhirFactory.eINSTANCE
				.createImmunizationRecommendationDateCriterion();
		CodeableConcept forecastStatus = FhirFactory.eINSTANCE.createCodeableConcept();
                Coding coding = FhirFactory.eINSTANCE.createCoding();
                //coding.setCode(crit.coding.getCode());
                Code code = FhirFactory.eINSTANCE.createCode();
                code.setValue(crit.coding.getCode().getValue());                
                coding.setCode(code);
		//forecastStatus.getCoding().add(crit.coding);                
                forecastStatus.getCoding().add(coding);
//               forecastStatus.getCoding().add(crit);
              //  forecastStatus.setText(FHIRUtil.convert(crit.coding.getCode().getValue()));
             //   forecastStatus.setId(crit.name() + " " + crit.toString());
		dateCriterion.setCode(forecastStatus);
		dateCriterion.setValue(FHIRUtil.convertDateTime(date));
                       
		return dateCriterion;
	}

	public static Patient createPatient(TestCase i) {
		Patient o = FhirFactory.eINSTANCE.createPatient();
		o.setId(FHIRUtil.createId());
		o.getIdentifier().add(FHIRUtil.createIdentifier());
		o.setMeta(createMeta(URIs.FORECAST_PATIENT));
		o.setGender(createGender(i.getPatientSex()));
		o.setBirthDate(FHIRUtil.convert(i.getPatientDob()));
		return o;
	}

	public List<Immunization> createImmunizations(TestCase tc, Reference patient) {
		List<Immunization> immunizations = new ArrayList<Immunization>();
		for (TestEvent event : tc.getTestEventList()) {
			Immunization immunization = createImmunization(event, patient);
			immunizations.add(immunization);
		}
		return immunizations;
	}

	public Immunization createImmunization(TestEvent event, Reference patient) {
		Immunization immunization = FhirFactory.eINSTANCE.createImmunization();
		immunization.setId(FHIRUtil.createId());
		immunization.setMeta(createMeta(event.getEventDate(), "1"));
		immunization.setStatus(FHIRUtil.IMMUNIZATION_STATUS.COMPLETED.coding.getCode());
		immunization.setDate(FHIRUtil.convertDateTime(event.getEventDate()));

		CodeableConcept vaccineType = createCodeableConcept(event);
		immunization.setVaccineCode(vaccineType);
		for (EvaluationActual eval : event.getEvaluationActualList()) {
			ImmunizationVaccinationProtocol ivp = createImmunizationVaccinationProtocol(eval);
			immunization.getVaccinationProtocol().add(ivp);
		}
		return immunization;
	}

	ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol(EvaluationActual eval) {
		ImmunizationVaccinationProtocol ivp = FhirFactory.eINSTANCE.createImmunizationVaccinationProtocol();
		PositiveInt pInt = FhirFactory.eINSTANCE.createPositiveInt();
		pInt.setValue(BigInteger.valueOf(1L));
		ivp.setDoseSequence(pInt);
		// The following has not yet been implemented in the forecaster.
		// ivp.setSeries(value);
		// ivp.setSeriesDoses(value);
		// ivp.setDoseStatus(value);
		return ivp;
	}

	public static CodeableConcept createCodeableConcept(TestEvent event) {
		return createCodeableConcept(event.getConditionCode(), event.getLabelScreen(),
				"http://hl7.org/fhir/v3/vs/VaccineType");
	}

	public static CodeableConcept createCodeableConcept(EvaluationActual eval) {
		return createCodeableConcept(eval.getSeriesUsedCode(), eval.getSeriesUsedText(),
				"http://hl7.org/fhir/v3/vs/vaccination-protocol-dose-target");
	}

	public static CodeableConcept createCodeableConcept(java.lang.String code, java.lang.String text,
			java.lang.String uri) {
		CodeableConcept cc = FhirFactory.eINSTANCE.createCodeableConcept();
		Coding coding = FhirFactory.eINSTANCE.createCoding();
		// coding.setId(UUID.randomUUID().toString());
		coding.setSystem(FHIRUtil.createUri(uri));
		coding.setDisplay(FHIRUtil.convert(text));
		Code value = FhirFactory.eINSTANCE.createCode();
		value.setValue(code);
		coding.setCode(value);
		cc.getCoding().add(coding);
		return cc;
	}

	public static Meta createMeta(java.lang.String date, java.lang.String versionId) {
		Meta meta = FhirFactory.eINSTANCE.createMeta();
		meta.setLastUpdated(FHIRUtil.createInstant(date));
		meta.setVersionId(FHIRUtil.createId(versionId));
		return meta;
	}

	public static Meta createMeta(java.util.Date date, java.lang.String versionId) {
		Meta meta = FhirFactory.eINSTANCE.createMeta();
		meta.setLastUpdated(FHIRUtil.createInstant(date));
		meta.setVersionId(FHIRUtil.createId(versionId));
		return meta;
	}

	public static Meta createMeta(URIs profile) {
		Meta meta = FhirFactory.eINSTANCE.createMeta();
		meta.getProfile().add(profile.uri);
		return meta;
	}

	public static ResourceContainer createResourceContainer(Patient i) {
		ResourceContainer o = FhirFactory.eINSTANCE.createResourceContainer();
		o.setPatient(i);
		return o;
	}

	// public static Reference createReference(Patient i) {
	// Reference o = FhirFactory.eINSTANCE.createReference();
	// o.setId(FHIRUtil.createId().getValue());
	// java.lang.String s = java.lang.String.format("%s?identifier=%s",
	// i.eClass().getName(),
	// i.getIdentifier().get(0).getValue().getValue());
	// o.setReference(FHIRUtil.createURN(FHIRUtil.convert(s)));
	// return o;
	// }

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

	// public static java.lang.String parametersToString(Parameters p) {
	// StringBuilder bld = new StringBuilder();
	// bld.append("\n Id=" + p.getId());
	// for(ParametersParameter pp : p.getParameter()) {
	// bld.append("\n name=" + pp.getName());
	// for(ParametersParameter part : pp.getPart()) {
	// bld.append("\n Id=" + part.getId());
	// bld.append("\n Date=" + part.getResource().getImmunization().getDate());
	// bld.append("\n =" + part.getResource().getImmunization(). ;
	// bld.append("\n =" + part ;
	// bld.append("\n =" + part ;
	// }
	// return bld.toString();
	// }
}
