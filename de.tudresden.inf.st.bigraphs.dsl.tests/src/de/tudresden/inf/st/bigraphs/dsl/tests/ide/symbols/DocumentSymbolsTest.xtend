package de.tudresden.inf.st.bigraphs.dsl.tests.ide.symbols

//import org.junit.Test
import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest
import org.junit.jupiter.api.Test

class DocumentSymbolsTest extends AbstractBdslLSPTest {

	@Test
	def void testEmpty() {
		testDocumentSymbol[
			model = '''
			'''
		]
	}
	
	@Test
	def void testBigraphVariableDeclarations() {
		testDocumentSymbol[
			model = '''
			val bigExplicitRoot(Sig1) = {
				a | b | c
			}
			'''
			expectedSymbols = '''
				symbol "bigExplicitRoot" {
					kind: 13
					location: MyModel.bdsl [[0, 4] .. [0, 19]]
				}
			'''
		]
	}
	
	@Test
	def void testBRSDeclarationAndPrintMethod() {
		testDocumentSymbol[
			model = '''
				main = {
					println($bigExplicitRoot)
					brs example {
					       agents = [$bigExplicitRoot, $bigExplicitRoot],
					   	rules = [$testReact1],
					   	preds = [$pred1]
					   }
				}
			'''
			expectedSymbols = '''
				symbol "main" {
				    kind: 12
				    location: MyModel.bdsl [[7, 0] .. [7, 1]]
				}
				symbol "PrintLn" {
				    kind: 6
				    location: MyModel.bdsl [[1, 8] .. [1, 9]]
				    container: "main"
				}
				symbol "Reference: $bigExplicitRoot" {
				    kind: 8
				    location: MyModel.bdsl [[1, 9] .. [1, 25]]
				    container: "PrintLn"
				}
				symbol "example" {
				    kind: 13
				    location: MyModel.bdsl [[2, 5] .. [2, 12]]
				    container: "main"
				}
				symbol "Reference: $bigExplicitRoot" {
				    kind: 8
				    location: MyModel.bdsl [[3, 18] .. [3, 34]]
				    container: "example"
				}
				symbol "Reference: $bigExplicitRoot" {
				    kind: 8
				    location: MyModel.bdsl [[3, 36] .. [3, 52]]
				    container: "example"
				}
				symbol "Reference: $testReact1" {
				    kind: 8
				    location: MyModel.bdsl [[4, 14] .. [4, 25]]
				    container: "example"
				}
				symbol "Reference: $pred1" {
				    kind: 8
				    location: MyModel.bdsl [[5, 14] .. [5, 20]]
				    container: "example"
				}
			'''
		]
	}
}
