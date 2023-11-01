/*
 * generated by Xtext 2.21.0
 */
package org.bigraphs.dsl.ide

import org.eclipse.xtext.ide.server.symbol.DocumentSymbolMapper.DocumentSymbolKindProvider
import org.bigraphs.dsl.ide.symbols.BdslHierarchicalDocumentSymbolService
import org.eclipse.xtext.ide.server.symbol.HierarchicalDocumentSymbolService
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolService
import org.bigraphs.dsl.ide.symbols.BdslDocumentSymbolService
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolMapper.DocumentSymbolNameProvider
import org.bigraphs.dsl.ide.symbols.BdslDocumentSymbolNameProvider
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import org.bigraphs.dsl.ide.completion.BdslContentProposalProvider
import org.bigraphs.dsl.ide.completion.BdslContentProposalCreator
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator
import org.bigraphs.dsl.ide.symbols.BDSLDocumentSymbolKindProvider

/**
 * Use this class to register IDE components such as context proposal provider, code lens service, formatting, etc.
 */
class BDSLIdeModule extends AbstractBDSLIdeModule {

	def Class<? extends IdeContentProposalCreator> bindIdeContentProposalCreator() {
		return BdslContentProposalCreator;
	}

	override Class<? extends IdeContentProposalProvider> bindIdeContentProposalProvider() {
		return BdslContentProposalProvider
	}

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