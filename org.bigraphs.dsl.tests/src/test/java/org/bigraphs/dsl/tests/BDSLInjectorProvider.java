/*
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.bigraphs.dsl.BDSLRuntimeModule;
import org.bigraphs.dsl.BDSLStandaloneSetup;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;

public class BDSLInjectorProvider implements IInjectorProvider, IRegistryConfigurator {

	protected GlobalStateMemento stateBeforeInjectorCreation;
	protected GlobalStateMemento stateAfterInjectorCreation;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}

	@Override
	public Injector getInjector() {
		if (injector == null) {
			this.injector = internalCreateInjector();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}

	protected Injector internalCreateInjector() {
		return new BDSLStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(createRuntimeModule());
			}
		}.createInjectorAndDoEMFRegistration();
	}

	protected BDSLRuntimeModule createRuntimeModule() {
		// make it work also with Maven/Tycho and OSGI
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
		return new BDSLRuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return BDSLInjectorProvider.class
						.getClassLoader();
			}
		};
	}

	@Override
	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
		stateBeforeInjectorCreation = null;
	}

	@Override
	public void setupRegistry() {
		stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		if (injector == null) {
			getInjector();
		}
		stateAfterInjectorCreation.restoreGlobalState();
	}
}
