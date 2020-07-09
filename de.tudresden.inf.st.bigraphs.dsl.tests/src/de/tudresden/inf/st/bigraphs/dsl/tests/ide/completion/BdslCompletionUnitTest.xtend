package de.tudresden.inf.st.bigraphs.dsl.tests.ide.completion

//import org.junit.Test
//import org.junit.jupiter.api.Test
import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest
import org.eclipse.xtext.testing.TestCompletionConfiguration
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.eclipse.lsp4j.CompletionParams
import org.eclipse.lsp4j.TextDocumentIdentifier
import org.eclipse.lsp4j.Position
import org.junit.Assert
import java.util.function.Function
import org.junit.jupiter.api.Test

class BdslCompletionUnitTest extends AbstractBdslLSPTest {

	@Test
	def void testEmptyDocumentCompletion() {
//		val extension tcc = new TestCompletionConfiguration()
//		tcc.model = '''
//		main = {
//			
//		}
//'''
//		tcc.line = 0
//		tcc.column = 0
//		testCompletion(tcc)
		

//		tcc.filePath = 'MyModel.' + fileExtension
//		val filePath = initializeContext(tcc).uri
//		println("filePath " + filePath)
//		val completionItems = languageServer.completion(new CompletionParams => [
//			textDocument = new TextDocumentIdentifier(filePath)
//			position = new Position(line, column)
//			println("textDoc " + textDocument)
//		])
//		println("completionItems " + completionItems)
//		val result = completionItems.get
//		println("result " + result)
//		val items = if (result.isLeft) result.getLeft else result.getRight.items
//		// assert ordered by sortText
//		Assert.assertEquals(items, items.sortBy[sortText].toList)
//		if (tcc.assertCompletionList !== null) {
//			tcc.assertCompletionList.apply(result.getRight)
//		} else {
//			val actualCompletionItems = items.toExpectation
//			assertEquals(expectedCompletionItems, actualCompletionItems)
//		}
		
//			model = '''
//			'''
//			line = 0
//			column = 0
//			expectedCompletionItems = '''
//			 -> main = {  [[0, 0] .. [0, 0]]
//			pred -> pred [[0, 0] .. [0, 0]]
//			react -> react [[0, 0] .. [0, 0]]
//			signature -> signature [[0, 0] .. [0, 0]]
//			val -> val [[0, 0] .. [0, 0]]
//			'''
//		]
	}

	@Test
	def void testMainCompletion() {
//		testCompletion [
//			model = '''
//			ma'''
//			line = 0
//			column = 2
//			expectedCompletionItems = '''
//			ma -> main = {  [[0, 0] .. [0, 2]]
//			'''
//		]
	}
}
