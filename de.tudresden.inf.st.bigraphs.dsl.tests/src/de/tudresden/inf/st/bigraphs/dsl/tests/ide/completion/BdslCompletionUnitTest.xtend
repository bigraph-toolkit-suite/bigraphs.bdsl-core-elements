package de.tudresden.inf.st.bigraphs.dsl.tests.ide.completion

import org.junit.Test
//import org.junit.jupiter.api.Test
import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest

class BdslCompletionUnitTest extends AbstractBdslLSPTest {

	@Test
	def void testEmptyDocumentCompletion() {
		testCompletion [
			model = '''
			'''
			line = 0
			column = 0
			expectedCompletionItems = '''
			 -> main = {  [[0, 0] .. [0, 0]]
			pred -> pred [[0, 0] .. [0, 0]]
			react -> react [[0, 0] .. [0, 0]]
			signature -> signature [[0, 0] .. [0, 0]]
			val -> val [[0, 0] .. [0, 0]]
			'''
		]
	}
	
	@Test
	def void testMainCompletion() {
		testCompletion [
			model = '''
			ma'''
			line = 0
			column = 2
			expectedCompletionItems = '''
			ma -> main = {  [[0, 0] .. [0, 2]]
			'''
		]
	}
}
