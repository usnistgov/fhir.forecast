package fhir.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Serialize extends AbstractSerializeDeserialize {

	private final Logger log = LoggerFactory.getLogger(Serialize.class);

	public Serialize() {
		super();
	}

	public String it(EObject eObject, String uriString) {

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

	public OutputStream it(EObject eObject, String uriString, OutputStream stream) {

		try {
			resource = resourceSet.createResource(URI.createURI(uriString));
			resource.getContents().add(eObject);
			resource.save(stream, Collections.EMPTY_MAP);
		} catch (IOException e) {
			log.error("", e);
		} catch(NullPointerException e) {
			log.error(String.format("uriString=%s", uriString));
			log.error(String.format("is not null: resource=%b, uriString=%b, eObject=%b", resource, uriString, eObject), e);
		}
		return stream;
	}
}
