package org.bigraphs.dsl.ide.completion

import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator

import static extension org.bigraphs.dsl.ide.completion.ContentAssistEntryUtils.attachSourceIfAbsent

class BdslContentProposalCreator extends IdeContentProposalCreator {

	/**
	 * Besides doing exactly what described at {@link IdeContentProposalCreator} the super class,
	 * it tries to set the source of the entry. If the current model of the content is not {@code null}
	 * it sets on the entry. If the current module is {@code null} (consider an empty BDSL file), then sets
	 * the resource as the source.
	 */
	override ContentAssistEntry createProposal(String proposal, String prefix, ContentAssistContext context,
		String kind, (ContentAssistEntry)=>void init) {

		return super.createProposal(proposal, prefix, context, kind, init).attachSourceIfAbsent(context);
	}
}
