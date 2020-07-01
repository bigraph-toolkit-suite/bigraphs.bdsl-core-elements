package de.tudresden.inf.st.bigraphs.dsl.tests.ide

import de.tudresden.inf.st.bigraphs.dsl.ide.BDSLIdeSetup
import org.eclipse.xtext.testing.AbstractLanguageServerTest

abstract class AbstractBdslLSPTest extends AbstractLanguageServerTest {
	
	new() {
		super('bdsl')
		BDSLIdeSetup.doSetup
	}
	
}