package fhir.util;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import fhir.FhirPackage;
import xhtml.XhtmlPackage;

public abstract class AbstractMarshaler {
	
	static ResourceSet resourceSet = new ResourceSetImpl();
	static Resource resource; 

	static {
		FhirPackage.eINSTANCE.eClass();
		XhtmlPackage.eINSTANCE.eClass();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    "xml", new XMLResourceFactoryImpl());
	}
}
