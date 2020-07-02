package de.tudresden.inf.st.bigraphs.dsl.ide.completion

import com.google.inject.Inject
import de.tudresden.inf.st.bigraphs.dsl.services.BDSLGrammarAccess
import org.eclipse.xtext.Group
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.formatting.IWhitespaceInformationProvider
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.eclipse.xtext.xtext.CurrentTypeFinder

/*
 * BDSL content proposal provider for different IDE contexts (except Eclipse integration).
 */
class BdslContentProposalProvider extends IdeContentProposalProvider {
	@Inject extension CurrentTypeFinder
	@Inject IWhitespaceInformationProvider whitespaceInformation

	@Inject BDSLGrammarAccess grammarAccess

//	static val IGNORED_KEYWORDS = #{'/', '{', ';', '}', '+', '-', '*', '/', '>=', '<=', '>', '<', '=', '!=', ':', '[',
//		']', '|', 'or', 'and', 'div', 'mod', '$', '(', '@'}

	override protected _createProposals(RuleCall ruleCall, ContentAssistContext context,
		IIdeContentProposalAcceptor acceptor) {
		if (ruleCall.rule.name == "MainKeyword") {
			grammarAccess.mainKeywordAccess.group.createProposals(context, acceptor)
			return
		}
	}

	/*
	 * For multiple consecutive keywords such as {@link MainKeyword}
	 */
	protected def createProposals(Group group, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if (group === null) {
			return null
		}
		val proposalString = group.elements.filter(Keyword).map[value].join(" ") + " "
		val label = proposalString
		val entry = proposalCreator.createProposal(proposalString, label, context, ContentAssistEntry.KIND_FUNCTION,
			new Procedure1<ContentAssistEntry>() {
				override apply(ContentAssistEntry p) {
					p.label = label
				}
			});
		acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry))
	}

	override protected _createProposals(Keyword keyword, ContentAssistContext context,
		IIdeContentProposalAcceptor acceptor) {
		super._createProposals(keyword, context, acceptor)
	}
}
