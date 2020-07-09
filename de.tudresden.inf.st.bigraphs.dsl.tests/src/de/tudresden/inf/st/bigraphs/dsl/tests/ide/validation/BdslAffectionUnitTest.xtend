package de.tudresden.inf.st.bigraphs.dsl.tests.ide.validation

import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest
//import org.junit.Test
import org.junit.Assert
import org.junit.jupiter.api.Test

/*
 * Syntax validation unit tests for {@link BDSLValidator}
 */
class BdslAffectionUnitTest extends AbstractBdslLSPTest {

	@Test
	def void testResourcePathLoadMethod_01() {
				initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

main = {
    val test1 = load(sig=Sig1, as=xmi, resourcePath="file:models/test.xmi")
    val test2 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
    val test3 = load(sig=Sig1, as=xmi, resourcePath="cdo:models/test.xmi")
    load(sig=Sig1, as=xmi, resourcePath=null)
    load(sig=Sig1, as=xmi, resourcePath="")
}
			'''
		)
		expectDiagnostics(uri, "The resourcePath is missing a resource identifier:9,
The resourcePath is missing a resource identifier:10,
The resourcePath is not set:9,
The resourcePath is not set:10,
mismatched input 'null' expecting RULE_STRING:9")


val uri2 = 'inmemory:/bar.bdsl'
		open(
			uri2,
			'''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

main = {
    val test1 = load(sig=Sig1, as=xmi, resourcePath="file:models/test")
    val test2 = load(sig=Sig1, as=ecore, resourcePath="classpath:models/test.xmi")
}
			'''
		)
		expectDiagnostics(uri2, "The extension of the resource path doesn't match with the specified load-as argument:6,
The extension of the resource path doesn't match with the specified load-as argument:7")

	}


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