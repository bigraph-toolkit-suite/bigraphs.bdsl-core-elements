package de.tudresden.inf.st.bigraphs.dsl.tests.ide

import de.tudresden.inf.st.bigraphs.dsl.ide.BDSLIdeSetup
import org.eclipse.xtext.testing.AbstractLanguageServerTest
import org.junit.Assert

abstract class AbstractBdslLSPTest extends AbstractLanguageServerTest {
	
	new() {
		super('bdsl')
		BDSLIdeSetup.doSetup
	}
	
	def expectDiagnostics(String uri, String expected) {
		val diagnostics = diagnostics;
		var issues = diagnostics.get(uri)
		if (issues === null) {
			Assert.assertEquals("", expected)
			return
		}
		Assert.assertEquals(expected, issues.sortBy[range.start.line].sortBy[message].join(',\n') [
			message + ":" + range.start.line
		])
	}
	
}