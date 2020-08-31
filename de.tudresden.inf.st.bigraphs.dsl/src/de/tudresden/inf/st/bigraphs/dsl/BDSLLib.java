package de.tudresden.inf.st.bigraphs.dsl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.lf5.util.ResourceUtils;
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

	public List<Resource> loadIncludeLibraries(ResourceSet resourceSet, String[] includeFilenames) throws IOException {
		if (Objects.isNull(includeFilenames) || includeFilenames.length == 0)
			return Collections.EMPTY_LIST;
		List<Resource> resources = new ArrayList<>();
		for (String eachFilename : includeFilenames) {
//			URL url = BDSLLib.class.getResource(eachFilename);
			URL url = new File(eachFilename).toURI().toURL();
			InputStream stream = url.openStream();
			Resource resource = resourceSet.createResource(URI.createFileURI(url.getPath()));
			resource.load(stream, resourceSet.getLoadOptions());
			resources.add(resource);
		}
		return resources;
	}

}
