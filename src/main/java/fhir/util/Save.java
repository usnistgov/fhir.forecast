package fhir.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class Save extends AbstractMarshaler {
	
	public static String it(EObject eObject, String uriString) {

		resource = resourceSet.createResource(URI.createURI(uriString));
		resource.getContents().add(eObject);
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		try {
			resource.save(stream, Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stream.toString();
	}
}