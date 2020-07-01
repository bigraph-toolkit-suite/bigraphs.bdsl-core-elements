package de.tudresden.inf.st.bigraphs.dsl.documentation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.internal.Log
import com.google.inject.Singleton
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl

@Log
@Singleton
class BDSLDocumentationProvider implements IEObjectDocumentationProvider {
	
	def dispatch getDocumentation(EObject o) {
		return null
	}
	
	def dispatch getDocumentation(LocalVarDecl o) {
		return "documentation";
	}
	
}