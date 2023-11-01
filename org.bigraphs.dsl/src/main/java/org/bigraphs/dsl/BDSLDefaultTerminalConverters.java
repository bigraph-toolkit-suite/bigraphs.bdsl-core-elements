package org.bigraphs.dsl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.conversion.impl.AbstractValueConverterService;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;

import org.bigraphs.dsl.bDSL.BDSLDocument;
import org.bigraphs.dsl.bDSL.ReferenceClassSymbol;

import com.google.inject.Inject;

// https://stackoverflow.com/questions/11598869/how-can-i-create-cross-reference-when-a-sigil-is-required-for-referring-but-not/11599826#11599826
// https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#value-converter
public class BDSLDefaultTerminalConverters extends DefaultTerminalConverters {// AbstractDeclarativeValueConverterService
																				// {

	private Grammar grammar;

	@Inject
	public void setGrammar(IGrammarAccess grammarAccess) {
		this.grammar = grammarAccess.getGrammar();
	}

	protected Grammar getGrammar() {
		return grammar;
	}

	@ValueConverter(rule = "BIGRAPH_VAR_REFERENCE_ID")
	public IValueConverter<String> BIGRAPH_VAR_REFERENCE_ID() {
		return new AbstractNullSafeConverter<String>() {

			@Override
			protected String internalToString(String value) {
//				System.out.println("internalToString: " + value);
				if (GrammarUtil.getAllKeywords(getGrammar()).contains(value)) {
					return value;
				}

				return "$" + value;
			}

			@Override
			protected String internalToValue(String string, INode node) throws ValueConverterException {
//				System.out.println("internalToValue: " + string);
//				EObject semanticElement = node.getRootNode().getSemanticElement();
//				String prefix = "";
//				if (semanticElement instanceof BDSLDocument) {
//					String fqn = ((BDSLDocument) semanticElement).getName();
//					if (fqn != null && !fqn.isEmpty() && !string.contains(fqn) && !string.contains(".")) {
//						prefix = fqn + ".";
//					}
//				}
				return string.startsWith("$") ? (string.substring(1)) : (string);
			}
		};
	}
}
