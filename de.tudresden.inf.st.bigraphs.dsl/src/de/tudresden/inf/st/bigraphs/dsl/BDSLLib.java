package de.tudresden.inf.st.bigraphs.dsl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
//import net.bytebuddy.agent.ByteBuddyAgent;
import java.lang.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler;

import net.bytebuddy.agent.ByteBuddyAgent;

/**
 * An utility class that provides essential functionality for BDSL programs.
 * <p>
 * It allows loading multiple BDSL resources into one resource set (e.g., to
 * exploit the "library approach", or for including multiple BDSL programs).
 * <p>
 * Further, this helper class that may add external jar files to the class
 * loader to make them available for calling user-defined functions.
 * 
 * @author Dominik Grzelak
 */
public class BDSLLib {
	public static DynamicClassLoader DCL = new DynamicClassLoader(ClassLoader.getSystemClassLoader());
	public static String MAIN_LIB = "";
	private final static String FILE_EXT_CLASS = ".class";
	
	private static volatile BDSLLib instance;
	private static Object lock = new Object();
	private final List<File> loadedJarFiles = new LinkedList<>();
	
	private BDSLLib() {
		
	}
	
	public static BDSLLib getInstance() {
		BDSLLib result = instance;
		if (result == null) {
			synchronized (lock) {
				result = instance;
				if (result == null)
					instance = result = new BDSLLib();
			}
		}
		return result;
	}

	public void loadStandardLibs(ResourceSet resourceSet) throws IOException {
		URL url = getClass().getClassLoader().getResource(MAIN_LIB);
		InputStream stream = url.openStream();
		Resource resource = resourceSet.createResource(URI.createFileURI(url.getPath()));
		resource.load(stream, resourceSet.getLoadOptions());

	}

	public List<Class> findAllClasses(String packageName, Class<?> classFilter, List<JarFile> jarFiles) {
		Set<Class<?>> clazzesFound = new HashSet<Class<?>>();
		String packageName2 = packageName.replaceAll("\\.", "/");
		for (JarFile file : jarFiles) {
			URL[] urls;
			try {
				urls = new URL[] { new URL("jar:file:" + file.getName() + "!/") };
				URLClassLoader cl = new URLClassLoader(urls, Thread.currentThread().getContextClassLoader());
				Enumeration<JarEntry> e = file.entries();
				while (e.hasMoreElements()) {
					JarEntry entry = e.nextElement();
					if (entry.getName().startsWith(packageName2) && entry.getName().endsWith(FILE_EXT_CLASS)) {
						String className = entry.getName();
						className = className.substring(0, className.length() - FILE_EXT_CLASS.length());
						className = className.replace('/', '.');
						Class<?> clz = cl.loadClass(className);
						if (classFilter == null || (classFilter != null && classFilter.isAssignableFrom(clz))) {
							clazzesFound.add(clz);
						}
					}
				}
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
				continue;
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
				continue;
			}
		}
		return new ArrayList<>(clazzesFound);
	}

	public List<Class> findAllClasses(String packageName, List<JarFile> jarFiles) {
		return findAllClasses(packageName, null, jarFiles);
	}

	public List<JarFile> findAllUdfJars(List<String> sourceLocations) {
		Set<JarFile> jarFiles = new HashSet<>();
		for (String eachLocation : sourceLocations) {
			Path p = Paths.get(eachLocation);
			File f = p.toFile();
			if (f.isFile()) {
				f = p.getParent().toFile();
			}
			try {
				File[] files = f.listFiles(new FilenameFilter() {
					public boolean accept(File dir, String name) {
						return name.toLowerCase().endsWith(".jar");
					}
				});
				if (files != null) {
					for (File eachJarFile : files) {
						JarFile jarFile = new JarFile(eachJarFile.getAbsolutePath());
						jarFiles.add(jarFile);
					}
				}
			} catch (IOException | SecurityException e) {
				e.printStackTrace();
			}
		}
		return new ArrayList<>(jarFiles);
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

	public void addToClasspath(String... files) {
		for (String f : files) {
			addToClasspath(f);
		}
	}

	public void addToClasspath(JarFile... files) {
		for (JarFile f : files) {
			addToClasspath(f.getName());
		}
	}

	public void addToClasspath(File... files) {
		for (File f : files) {
			addToClasspath(f);
		}
	}

	public void addToClasspath(String file) {
		addToClasspath(new File(file));
	}

	public void addToClasspath(File file) {
		try {
			URL url = file.toURI().toURL();
			DCL.add(url);
//			loadLibrary(file);
			loadedJarFiles.add(file);
//			ClassPathAgent.appendJarFile(new JarFile(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			File AGENT_JAR = new File(BDSLLib.class.getClassLoader().getResource("classpathagent-1.0-SNAPSHOT.jar").getFile());
			ByteBuddyAgent.attach(AGENT_JAR, String.valueOf(ProcessHandle.current().pid()), file.getPath());
			throw new RuntimeException("Exception loading external jar file.", e);
		}

		
//		try {
//			if (!file.exists())
//				throw new FileNotFoundException(file.getPath());
//
//			URL url = file.toURI().toURL();
//			ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//			//URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
//			Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
//			method.setAccessible(true);
//			method.invoke(classLoader, url);
//			loadedJarFiles.add(file);
//		} catch (Exception e) {
//			throw new RuntimeException("Exception loading external jar file.", e);
//		}
	}
	
	public static void addJarToClassPath(File jarFile) {
		File AGENT_JAR = //new File("/de.tudresden.inf.st.bigraphs.dsl/src/classpathagent-1.0-SNAPSHOT.jar");
				new File(BDSLLib.class.getClassLoader().getResource("classpathagent-1.0-SNAPSHOT.jar").getFile());
        ByteBuddyAgent.attach(AGENT_JAR, String.valueOf(ProcessHandle.current().pid()), jarFile.getPath());
    }
	
	public List<File> getLoadedJarFiles() {
		return loadedJarFiles;
	}

}
