package fhir.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.io.input.ReaderInputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeSerialize extends AbstractSerializeDeserialize {

	private final Logger log = LoggerFactory.getLogger(DeSerialize.class);

	public DeSerialize() {
		super();
	}

	public EObject it(String fileName) {
		URL url = this.getClass().getResource(fileName);
		resource = resourceSet.getResource(URI.createURI(url.toString()), true);
		EObject eObject = (EObject) resource.getContents().get(0);

		return eObject;
	}
        
        
	public EObject it(URL url) {
		
		resource = resourceSet.getResource(URI.createURI(url.toString()), true);
		EObject eObject = (EObject) resource.getContents().get(0);

		return eObject;
	}        
        
	public EObject it(StringReader reader, String sUri) {
		return it(new ReaderInputStream(reader), sUri);
	}

	public EObject it(InputStream reader, String sUri) {
		URI uri = URI.createURI(sUri);
		try {
			resource = resourceSet.createResource(uri);
			resource.load(reader, Collections.EMPTY_MAP);                        
			EList<EObject> eList = resource.getContents();
			if (eList.size() > 0) {
				EObject eObject = (EObject) resource.getContents().get(0);

				return eObject;
			} else {
				log.error("json=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("json"));
				log.error("xml=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("xml"));
				log.error("Resource had no contents; returning null");
			}
		} catch (IOException e) {
			log.error("", e);
		} catch (Exception e) {
			log.error("NPE");
		}
		return null;
	}
}
