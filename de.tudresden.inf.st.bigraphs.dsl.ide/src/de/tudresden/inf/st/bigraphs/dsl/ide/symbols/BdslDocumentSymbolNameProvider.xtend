package de.tudresden.inf.st.bigraphs.dsl.ide.symbols

import com.google.common.collect.Lists
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BRSVarReference
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference
import de.tudresden.inf.st.bigraphs.dsl.bDSL.MainElement
import de.tudresden.inf.st.bigraphs.dsl.bDSL.MethodStatements
import de.tudresden.inf.st.bigraphs.dsl.bDSL.PredicateVarReference
import de.tudresden.inf.st.bigraphs.dsl.bDSL.RuleVarReference
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolMapper.DocumentSymbolNameProvider
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class BdslDocumentSymbolNameProvider extends DocumentSymbolNameProvider {

	override getName(EObject object) {
		if (object instanceof MainElement) {
			return "main";
		}
		if (object instanceof MethodStatements) {
			val name = object.eClass.instanceClass.name
			if (!name.nullOrEmpty && name.contains('.')) {
				val segments = Lists.newArrayList(name.split('\\.'));
				return segments.last;
			}
			return "method";
		}
		if (object instanceof BigraphVarReference || object instanceof RuleVarReference ||
			object instanceof PredicateVarReference  || 
			object instanceof BRSVarReference) {
			val nn = NodeModelUtils.findActualNodeFor(object)
			return "Reference: " + nn.text.trim
		}
		return super.getName(object);
	}

}
