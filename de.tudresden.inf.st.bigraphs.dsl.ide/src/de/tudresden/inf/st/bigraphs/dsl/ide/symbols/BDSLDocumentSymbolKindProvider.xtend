package de.tudresden.inf.st.bigraphs.dsl.ide.symbols

import org.eclipse.xtext.ide.server.symbol.DocumentSymbolMapper.DocumentSymbolKindProvider
import org.eclipse.emf.ecore.EClass
import static org.eclipse.lsp4j.SymbolKind.*
import static de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage.Literals.*

class BDSLDocumentSymbolKindProvider extends DocumentSymbolKindProvider {

	override protected getSymbolKind(EClass clazz) {
		return switch (clazz) {
			case SIGNATURE: Class
			case MAIN_ELEMENT: Function
			// Variables
			case CONTROL_VARIABLE: Variable
			case LOCAL_RULE_DECL: Variable
			case LOCAL_PREDICATE_DECLARATION: Variable
			case LOCAL_VAR_DECL: Variable
			// Operators
			case PLUS__OPERATOR: Operator
			case MULTI__OPERATOR: Operator
			case BINARY_PARALLEL_OPERATOR: Operator
			case BINARY_NESTING_OPERATOR: Operator
			// Methods
			case EXPORT_METHOD: Method
			case EXPORT_METHOD__RESOURCE_PATH: File
			case PRINT_LN: Method
			case PRINT_LN__TEXT: String
			// BRS
			case BRS_DEFINITION: Variable
//			case B: Array
//			case BRS_DEFINITION__RULES: Array
//			case BRS_DEFINITION__PREDICATES: Array
			default: Field
		}
	}

}
