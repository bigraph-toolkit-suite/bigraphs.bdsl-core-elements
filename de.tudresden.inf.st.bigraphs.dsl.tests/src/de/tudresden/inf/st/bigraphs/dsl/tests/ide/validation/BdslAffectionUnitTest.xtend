package de.tudresden.inf.st.bigraphs.dsl.tests.ide.validation

import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest
import org.junit.Test
import org.junit.Assert

/*
 * Syntax validation unit tests for {@link BDSLValidator}
 */
class BdslAffectionUnitTest extends AbstractBdslLSPTest {

	@Test
	def void testSiteIndexNotPositive_01() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
				signature Sig1 {
					active ctrl a arity 1
					passive ctrl b arity 1
					atomic ctrl c arity 1
				}
				
				main = {
				}
				
				val bigExplicitRoot(Sig1) = {
					id(0)
				}
			'''
		)
		expectDiagnostics(uri, "The index of a site must be a positive integer:10")

		open(
			"inmemory:/foo2.bdsl",
			'''
				signature Sig1 {
					active ctrl a arity 1
					passive ctrl b arity 1
					atomic ctrl c arity 1
				}
				
				main = {
				}
				
				val bigExplicitRoot(Sig1) = {
					id(1)
				}
			'''
		)
		expectDiagnostics("inmemory:/foo2.bdsl", "")
	}

	@Test
	def void testSiteIndexNotPositive_02() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
				signature Sig1 {
					active ctrl a arity 1
					passive ctrl b arity 1
					atomic ctrl c arity 1
				}
				
				main = {
				}
				
				val bigExplicitRoot(Sig1) = {
					id(-1)
				}
			'''
		)
		expectDiagnostics(uri, "extraneous input '-' expecting RULE_INT:10")

	}

	def expectDiagnostics(String uri, String expected) {
		val diagnostics = diagnostics;
		var issues = diagnostics.get(uri)
		if (issues === null) {
			return
		}
		Assert.assertEquals(expected, issues.sortBy[range.start.line].sortBy[message].join(',\n') [
			message + ":" + range.start.line
		])
	}

}
