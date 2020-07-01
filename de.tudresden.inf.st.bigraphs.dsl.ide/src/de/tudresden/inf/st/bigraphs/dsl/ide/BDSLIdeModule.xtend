/*
 * generated by Xtext 2.21.0
 */
package de.tudresden.inf.st.bigraphs.dsl.ide

import de.tudresden.inf.st.bigraphs.dsl.ide.symbols.BDSLDocumentSymbolKindProvider
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolMapper.DocumentSymbolKindProvider
import de.tudresden.inf.st.bigraphs.dsl.ide.symbols.BdslHierarchicalDocumentSymbolService
import org.eclipse.xtext.ide.server.symbol.HierarchicalDocumentSymbolService
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolService
import de.tudresden.inf.st.bigraphs.dsl.ide.symbols.BdslDocumentSymbolService
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolMapper.DocumentSymbolNameProvider
import de.tudresden.inf.st.bigraphs.dsl.ide.symbols.BdslDocumentSymbolNameProvider

/**
 * Use this class to register IDE components such as context proposal provider, code lens service, formatting, etc.
 */
class BDSLIdeModule extends AbstractBDSLIdeModule {

	def Class<? extends DocumentSymbolService> bindDocumentSymbolService() {
		return BdslDocumentSymbolService;
	}

	def Class<? extends DocumentSymbolKindProvider> bindDocumentSymbolKindProvider() {
		return BDSLDocumentSymbolKindProvider;
	}

	def Class<? extends HierarchicalDocumentSymbolService> bindHierarchicalDocumentSymbolService() {
		return BdslHierarchicalDocumentSymbolService;
	}
	
	def Class<? extends DocumentSymbolNameProvider> bindDocumentSymbolNameProvider() {
		return BdslDocumentSymbolNameProvider;
	}
}
