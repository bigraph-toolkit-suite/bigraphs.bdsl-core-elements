/*
 * generated by Xtext 2.21.0
 */
package org.bigraphs.dsl.ide

import com.google.inject.Guice
import org.bigraphs.dsl.BDSLRuntimeModule
import org.bigraphs.dsl.BDSLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class BDSLIdeSetup extends BDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new BDSLRuntimeModule, new BDSLIdeModule))
	}

}
