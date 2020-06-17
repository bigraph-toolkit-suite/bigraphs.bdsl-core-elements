/*
 * generated by Xtext 2.21.0
 */
package de.tudresden.inf.st.bigraphs.dsl.validation

import de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable
import org.eclipse.xtext.validation.Check
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Signature
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl
import java.util.Objects
import org.eclipse.emf.ecore.EObject
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Site

//import java.security.Signature
/**
 * This class contains custom validation rules. 
 * 
 * "The other class is a subclass of that abstract class and is generated to the src/ folder in order to be edited by you. That is where you put the constraints in."
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * 
 * @author Dominik Grzelak
 */
class BDSLValidator extends AbstractBDSLValidator {

	public static val INVALID_NAME = 'invalidName'

	public static val CYCLIC_VARIABLE_USAGE = 'cyclicBigraphVariable';

	public static val SITE_INDEX_IS_POSITIVE = 'siteIndexIsPositive';

	@Check
	def siteIndexIsPositive(Site siteExpression) {
		if (siteExpression.index <= 0) {
			warning("The index of a site must be a positive integer", BDSLPackage.Literals.SITE__INDEX,
				SITE_INDEX_IS_POSITIVE);
		}
	}

	@Check
	def checkNoCycleInEntityHierarchy(BigraphVarReference varDecl) {
		if (varDecl.eContainer.eClass == BDSLPackage.Literals.BRS_MODEL) {
			return
		}

		var current = varDecl as EObject;
		while (Objects::nonNull(current)) {
			println("vcurrent" + current)
			if (current == varDecl.value) {
				warning("Cyclic bigraph variable reference", BDSLPackage::eINSTANCE.bigraphVarReference_Value)
				return
			}
			current = current.eContainer
		}
	}

	@Check
	def checkNameStartsWithCapital(Signature entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("Signature name should start with a capital", BDSLPackage.Literals.SIGNATURE__NAME, INVALID_NAME);
		}
	}

}
