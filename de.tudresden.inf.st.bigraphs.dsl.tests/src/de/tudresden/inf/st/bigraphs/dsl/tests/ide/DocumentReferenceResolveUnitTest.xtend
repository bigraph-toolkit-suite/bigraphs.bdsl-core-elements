package de.tudresden.inf.st.bigraphs.dsl.tests.ide

import org.junit.Assert
import org.junit.jupiter.api.Test
import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest

/*
 * 
 */
class DocumentReferenceResolveUnitTest extends AbstractBdslLSPTest {

	@Test
	def void testBigraphVariableDeclarations() {
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
	val big1(Sig1) = { a | b }
	val big2(Sig1) = {}
	val big3(Sig1):Sig1.a = {}
	val bigA(Sig1):a = {a | Sig1.b}
	val big4(Sig1):Sig1.a = { Sig1.a | b}
	val bigB(Sig1):c = {}
}
			'''
		)
		expectDiagnostics(uri, "Couldn't resolve reference to ControlVariable 'c'.:11")
	}
}
