package de.tudresden.inf.st.bigraphs.dsl.tests.ide.symbols

//import org.junit.Test

import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest
import org.junit.jupiter.api.Test

class DocumentSymbolsTest extends AbstractBdslLSPTest {

//	@Test
//	def void testEmpty() {
//		testDocumentSymbol[
//			model = '''
//			'''
//		]
//	}
	
//	@Test
//	def void testBigraphVariableDeclarations() {
//		testDocumentSymbol[
//			model = '''
//			main = {
//				println($bigExplicitRoot)
//				brs example {
//			        agents = [$bigExplicitRoot, $bigExplicitRoot],
//			    	rules = [$testReact1],
//			    	preds = [$pred1]
//			    }
//			}
//			val bigExplicitRoot(Sig1) = {
//				a | b | c
//			}
//			'''
//			expectedSymbols = '''
//				symbol "bigExplicitRoot" {
//					kind: 13
//					location: MyModel.bdsl [[8, 4] .. [8, 19]]
//				}
//				symbol "example" {
//					kind: 13
//					location: MyModel.bdsl [[2, 5] .. [2, 12]]
//				}
//			'''
//		]
//	}
	
	@Test
	def void testBigraphVariableDeclarations2() {
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
				symbol "example" {
					kind: 13
					location: MyModel.bdsl [[2, 5] .. [2, 12]]
				}
			'''
		]
	}
}
