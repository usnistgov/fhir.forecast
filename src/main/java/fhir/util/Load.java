package fhir.util;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;

import org.apache.commons.io.input.ReaderInputStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class Load extends AbstractMarshaler {

	public static EObject it(String  fileName) {
		URL url = Load.class.getResource(fileName);
		resource = resourceSet.getResource(
		    URI.createURI(url.toString()), true);
		EObject eObject = (EObject)
				resource.getContents().get(0);

		return eObject;
	}
	
	public static EObject it(StringReader  reader) {
		URI uri = URI.createURI("*.modelextension");
	    resource = resourceSet.createResource(uri);
	    try {
			resource.load(new ReaderInputStream(reader), null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		EObject eObject = (EObject)
				resource.getContents().get(0);

		return eObject;
	}
}
