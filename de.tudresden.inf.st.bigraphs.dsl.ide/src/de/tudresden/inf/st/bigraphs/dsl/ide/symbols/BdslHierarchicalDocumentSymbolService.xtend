package de.tudresden.inf.st.bigraphs.dsl.ide.symbols

import com.google.common.base.Predicate
import com.google.common.collect.ImmutableList
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractBigraphDeclaration
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractElement
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractMainStatements
import de.tudresden.inf.st.bigraphs.dsl.bDSL.MainElement
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.ide.server.symbol.HierarchicalDocumentSymbolService

import static extension com.google.common.collect.Iterators.*
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Signature
import de.tudresden.inf.st.bigraphs.dsl.bDSL.RuleVarReference
import de.tudresden.inf.st.bigraphs.dsl.bDSL.PredicateVarReference
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLDocument

class BdslHierarchicalDocumentSymbolService extends HierarchicalDocumentSymbolService {
	
	override protected getAllContents(Resource resource) {
		val brsModel = resource.contents.head;
		if(brsModel instanceof BDSLDocument) {
			val allStatements = EcoreUtil.getAllProperContents(brsModel, true).filter(new Predicate() {
				
				override apply(Object arg0) {
					return arg0 instanceof AbstractElement || //local var decls
					arg0 instanceof MainElement || // main block
					arg0 instanceof AbstractMainStatements || // everything inside the main block
					arg0 instanceof AbstractBigraphDeclaration || // bigraphvarreference, and others
					arg0 instanceof Signature ||
					arg0 instanceof RuleVarReference ||
					arg0 instanceof PredicateVarReference
				}
				
			});
		
			val result = ImmutableList.copyOf(allStatements.filter(Object));
			return result.iterator();
		}
		return emptyList.iterator;
	}
	
}