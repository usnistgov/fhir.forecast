package fhir.util;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.hl7.fhir.FhirPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3._1999.xhtml.XhtmlPackage;

public abstract class AbstractSerializeDeserialize {

	static Logger log = LoggerFactory.getLogger(AbstractSerializeDeserialize.class);

	protected final ResourceSet resourceSet = new ResourceSetImpl();
	protected Resource resource;

	protected AbstractSerializeDeserialize() {
		log.trace("AbstractSerializeDeserialize==>" + resourceSet);
		FhirPackage.eINSTANCE.eClass();
		XhtmlPackage.eINSTANCE.eClass();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		log.trace("<==AbstractSerializeDeserialize");
	}
}
