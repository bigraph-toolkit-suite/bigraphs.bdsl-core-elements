package de.tudresden.inf.st.bigraphs.dsl;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.conversion.impl.AbstractValueConverterService;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;

import com.google.inject.Inject;

// https://stackoverflow.com/questions/11598869/how-can-i-create-cross-reference-when-a-sigil-is-required-for-referring-but-not/11599826#11599826
// https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#value-converter
public class DefaultTerminalConverters extends AbstractDeclarativeValueConverterService {

	private Grammar grammar;

	@Inject
	public void setGrammar(IGrammarAccess grammarAccess) {
		this.grammar = grammarAccess.getGrammar();
	}

	protected Grammar getGrammar() {
		return grammar;
	}

	@ValueConverter(rule = "BigraphVarReferenceID")
	public IValueConverter<String> BigraphVarReferenceID() {
		return new AbstractNullSafeConverter<String>() {

			@Override
			protected String internalToString(String value) {
				if (GrammarUtil.getAllKeywords(getGrammar()).contains(value)) {
					return value; //"$" + value;
				}
				return "$" + value; //value;
			}

			@Override
			protected String internalToValue(String string, INode node) throws ValueConverterException {
				return string.startsWith("$") ? string.substring(1) : string;
			}
		};
	}
}