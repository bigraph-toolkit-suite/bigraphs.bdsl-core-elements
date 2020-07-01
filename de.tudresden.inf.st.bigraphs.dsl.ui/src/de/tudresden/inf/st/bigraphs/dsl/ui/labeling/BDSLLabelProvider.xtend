/*
 * generated by Xtext 2.15.0
 */
package de.tudresden.inf.st.bigraphs.dsl.ui.labeling

import com.google.inject.Inject
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractBigraphDeclaration
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BRSModel
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphExpression
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference
import de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LVD2
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl
import de.tudresden.inf.st.bigraphs.dsl.bDSL.MainElement
import de.tudresden.inf.st.bigraphs.dsl.bDSL.NodeExpressionCall
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Plus
import de.tudresden.inf.st.bigraphs.dsl.bDSL.PrintLn
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Signature
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

//import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphLiteral
/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class BDSLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def String text(Signature event) {
		return event.getName() + " (" + event.controls.size + ")";
	}

	def String text(ControlVariable event) {
		return event.getName() + " (" + event.arity + ", " + event.type.getName() + ")";
	}

	def String text(LocalVarDecl event) {
		return event.getName() + " (" + event.sig.name + "." + event.type.getName() + ")" + " : Bigraph";
	}

	def String text(LVD2 event) {
		return "LVD2";
	}

	def String text(AbstractBigraphDeclaration event) {
		if (event instanceof BigraphVarReference) {
			return event.value.name + " : " + BigraphVarReference.simpleName;
		}
		if (event instanceof NodeExpressionCall) {
			return text(event.value);
		}
		return "AbstractBigraphDeclaration";
	}

	def String text(BigraphExpression event) {
		if(event instanceof Plus) {
			return Plus.simpleName + " : BigraphExpression";
		}
		return "BigraphExpression";
	}

	def String image(BRSModel ele) {
		return "bigraph-pure-logo.png";
	}

	def String text(MainElement event) {
		return "main";
	}

	def String text(PrintLn event) {
		return event.class.simpleName + "(String)";
	}
}
