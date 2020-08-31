package de.tudresden.inf.st.bigraphs.dsl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class BDSLLib {
	public static String MAIN_LIB = "";

	public void loadStandardLibs(ResourceSet resourceSet) throws IOException {
		URL url = getClass().getClassLoader().getResource(MAIN_LIB);
		InputStream stream = url.openStream();
		Resource resource = resourceSet.createResource(URI.createFileURI(url.getPath()));
		resource.load(stream, resourceSet.getLoadOptions());

	}

	public void loadIncludeLibraries(ResourceSet resourceSet, String[] includeFilenames) throws IOException {
		if (Objects.isNull(includeFilenames) || includeFilenames.length == 0)
			return;
		for (String eachFilename : includeFilenames) {
			URL url = getClass().getClassLoader().getResource(eachFilename);
			InputStream stream = url.openStream();
			Resource resource = resourceSet.createResource(URI.createFileURI(url.getPath()));
			resource.load(stream, resourceSet.getLoadOptions());
		}
	}

}
