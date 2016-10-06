package fhir.util;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import fhir.FhirPackage;

public class Load extends AbstractMarshaler {

	public static EObject it(String  fileName) {
		URL url = Load.class.getResource(fileName);
		FhirPackage.eINSTANCE.eClass();
		resource = resourceSet.getResource(
		    URI.createURI(url.toString()), true);
		EObject eObject = (EObject)
				resource.getContents().get(0);

		return eObject;
	}
}
