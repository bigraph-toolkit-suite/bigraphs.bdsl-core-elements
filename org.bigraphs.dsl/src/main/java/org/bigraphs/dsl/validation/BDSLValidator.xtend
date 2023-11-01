/*
 * generated by Xtext 2.21.0
 */
package org.bigraphs.dsl.validation

import org.bigraphs.dsl.bDSL.AssignableBigraphExpressionWithExplicitSig
import org.bigraphs.dsl.bDSL.BDSLPackage
import org.bigraphs.dsl.bDSL.BDSLVariableDeclaration2
import org.bigraphs.dsl.bDSL.BRSDefinition
import org.bigraphs.dsl.bDSL.BigraphVarReference
import org.bigraphs.dsl.bDSL.Closure
import org.bigraphs.dsl.bDSL.DataSource
import org.bigraphs.dsl.bDSL.LoadFormat
import org.bigraphs.dsl.bDSL.LoadMethod
import org.bigraphs.dsl.bDSL.LocalPredicateDeclaration
import org.bigraphs.dsl.bDSL.LocalRuleDecl
import org.bigraphs.dsl.bDSL.LocalVarDecl
import org.bigraphs.dsl.bDSL.ReferenceClassSymbol
import org.bigraphs.dsl.bDSL.Signature
import org.bigraphs.dsl.bDSL.Site
import org.bigraphs.dsl.utils.BDSLUtil
import java.util.Objects
import org.apache.commons.io.FilenameUtils
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.bigraphs.dsl.bDSL.ExportMethod
import org.bigraphs.dsl.bDSL.DataSink
import org.bigraphs.dsl.bDSL.ExportFormat
import org.bigraphs.dsl.bDSL.BDSLBrsDefinition
import org.bigraphs.dsl.bDSL.BDSLExpression

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

	public static val INVALID_CLOSURE_DEFINITION = 'invalidClosure'

	public static val CYCLIC_VARIABLE_USAGE = 'cyclicBigraphVariable';

	public static val SITE_INDEX_IS_POSITIVE = 'siteIndexIsPositive';

	public static val LOAD_METHOD_MISSING_RESOURCE_IDENTIFIER = 'missingResourceIdentifierLoadMethod';

	public static val EXPORT_METHOD_MISSING_RESOURCE_IDENTIFIER = 'missingResourceIdentifierExportMethod';

	public static val EXPORT_METHOD_INCOMPATIBLE_RESOURCE_IDENTIFIER = 'incompatibleResourceIdentifierExportMethod';

	public static val LOAD_METHOD_RES_EXT_AMBIGUOUS = 'fileExtensionMismatch';

	public static val ASSIGNMENT_SIGNATURES_MISMATCH = 'signatureMismatch';

	public static val ASSIGNMENT_TYPE_CHECKING = 'assignmentTypesNotMatch';

	public static val BRS_AGENT_CHECKING_NOT_PRIME = 'brsAgentIsNotPrime';
	public static val BRS_AGENT_CHECKING_NOT_GROUND = 'brsAgentIsNotGround';

	@Check
	def checkBrsAgentIsPrime(BDSLBrsDefinition brsDefFrag) {
	}

	@Check
	def checkBrsAgentIsGround(BDSLBrsDefinition brsDefFrag) {
		var eMsg = "";
//		println("brsDefFrag.eContainer: " + brsDefFrag.eContainer)
		if (brsDefFrag.eContainer instanceof BDSLVariableDeclaration2) {
			val brsVarDecl = brsDefFrag.eContainer as BDSLVariableDeclaration2;
//			println("brsDecl.variable: " + brsVarDecl.variable);
			if (brsVarDecl.variable instanceof BRSDefinition) {
				var brsVar = brsVarDecl.variable as BRSDefinition
//				println("brsVar.name: " + brsVar.name)
				// BDSLVariableDeclaration2
				for (BigraphVarReference eachAgent : brsDefFrag.agents) {
//					println("Agent : " + eachAgent.value)
					val localVarDecl = eachAgent.value as LocalVarDecl
//					println("localVarDecl.eContainer: " + localVarDecl.eContainer)
					val agentDecl = localVarDecl.eContainer as BDSLVariableDeclaration2
//					println("agentDecl.value: " + agentDecl.value)
					val agentExpr = agentDecl.value as BDSLExpression
//					println("agentExpr.definition: " + agentExpr.definition)
					//check if ctrl is non atomic and if the next operation has a barren root or something
				}
			}
		}
	}

	@Check
	def checkTypeOfAssignment(BDSLVariableDeclaration2 varDeclaration) {
		val variableLeft = varDeclaration.variable
		val valueRight = varDeclaration.value

		if (valueRight instanceof AssignableBigraphExpressionWithExplicitSig) {
			return
		}

		if (variableLeft instanceof LocalVarDecl && !(
			BDSLUtil.bdslExpressionIsBigraphDefinition(valueRight) ||
			BDSLUtil.checkReferenceSymbolType(valueRight, LocalVarDecl))) {
			error("Type of left-hand side of the variable declaration with name " + variableLeft.name +
				" doesn't match with type on right-hand side",
				BDSLPackage.Literals.BDSL_VARIABLE_DECLARATION2__VARIABLE, ASSIGNMENT_TYPE_CHECKING);
		}

		if (variableLeft instanceof LocalRuleDecl && !(
			BDSLUtil.bdslExpressionIsRuleDefinition(valueRight) ||
			BDSLUtil.checkReferenceSymbolType(valueRight, LocalRuleDecl))) {
			error("Type of left-hand side of the rule declaration with name " + variableLeft.name +
				" doesn't match with type on right-hand side",
				BDSLPackage.Literals.BDSL_VARIABLE_DECLARATION2__VARIABLE, ASSIGNMENT_TYPE_CHECKING);
		}

		if (variableLeft instanceof LocalPredicateDeclaration && !(
			BDSLUtil.bdslExpressionIsBigraphDefinition(valueRight) ||
			BDSLUtil.checkReferenceSymbolType(valueRight, LocalPredicateDeclaration))) {
			error("Type of left-hand side of the predicate declaration with name " + variableLeft.name +
				" doesn't match with type on right-hand side",
				BDSLPackage.Literals.BDSL_VARIABLE_DECLARATION2__VARIABLE, ASSIGNMENT_TYPE_CHECKING);
		}

		if (variableLeft instanceof BRSDefinition && !(
			BDSLUtil.bdslExpressionIsBRSDefinition(valueRight) ||
			BDSLUtil.checkReferenceSymbolType(valueRight, BRSDefinition))) {
			error("Type of left-hand side of the BRS declaration with name " + variableLeft.name +
				" doesn't match with type on right-hand side",
				BDSLPackage.Literals.BDSL_VARIABLE_DECLARATION2__VARIABLE, ASSIGNMENT_TYPE_CHECKING);
		}

	}

	Signature sigRight;

	@Check
	def assignableBigraphExpressionSigCheck(BDSLVariableDeclaration2 container) {
		val variableLeft = container.variable
		val valueRight = container.value
		val signatureLeft = variableLeft.sig
		if (valueRight === null || signatureLeft === null) {
			return
		}

		var sigRight = {
			if (valueRight instanceof AssignableBigraphExpressionWithExplicitSig) {
				sigRight = (valueRight as AssignableBigraphExpressionWithExplicitSig).sig
			} else if (valueRight instanceof ReferenceClassSymbol) {
				sigRight = BDSLUtil.tryInferSignature((valueRight as ReferenceClassSymbol).type)
			}
		}

		if (sigRight !== null && sigRight !== signatureLeft) {
			error(
				"Signature of right-hand side doesn't match with signature on left-hand side of the variable declaration with name " +
					variableLeft.name, BDSLPackage.Literals.BDSL_VARIABLE_DECLARATION2__VARIABLE,
				ASSIGNMENT_SIGNATURES_MISMATCH);
		}
	}

	@Check
	def loadMethodResourceFormat(LoadMethod loadMethod) {
		if (loadMethod.resourcePath === null || BDSLUtil.Strings.rawStringOf(loadMethod.resourcePath) === null ||
			BDSLUtil.Strings.rawStringOf(loadMethod.resourcePath).isEmpty) {
			warning("The resourcePath is not set", BDSLPackage.Literals.LOAD_METHOD__RESOURCE_PATH,
				LOAD_METHOD_MISSING_RESOURCE_IDENTIFIER)
		} else {
			val ext = FilenameUtils.getExtension(BDSLUtil.Strings.rawStringOf(loadMethod.resourcePath))
			val loadFormatOfExt = LoadFormat.get(ext)
			if (Objects.isNull(loadFormatOfExt) || loadMethod.format != loadFormatOfExt) {
				warning("The extension of the resource path doesn't match with the specified load-as argument",
					BDSLPackage.Literals.LOAD_METHOD__RESOURCE_PATH, LOAD_METHOD_RES_EXT_AMBIGUOUS)
			}

		}

	}

	@Check
	def loadMethodNoResourceIdentifier(LoadMethod loadMethod) {
		if (BDSLUtil.Resources.getDataSourceFromIdentifier(BDSLUtil.Strings.rawStringOf(loadMethod.resourcePath)) ==
			DataSource.UNSPECIFIED) {
			warning("The resourcePath is missing a resource identifier",
				BDSLPackage.Literals.LOAD_METHOD__RESOURCE_PATH, LOAD_METHOD_MISSING_RESOURCE_IDENTIFIER)
		}
	}

//	@Check
//	def exportMethodNoResourceIdentifier(ExportMethod exportMethod) {
//		if (BDSLUtil.Resources.getDataSinkFromIdentifier(BDSLUtil.Strings.rawStringOf(exportMethod.resourcePath)) ===
//			DataSink.STDOUT) {
//			warning("The resourcePath is missing a resource identifier",
//				BDSLPackage.Literals.EXPORT_METHOD__RESOURCE_PATH, EXPORT_METHOD_MISSING_RESOURCE_IDENTIFIER)
//		}
//	}
	@Check
	def incompatibleResourceIdentifierForPng(ExportMethod exportMethod) {
		val dataSink = BDSLUtil.Resources.getDataSinkFromIdentifier(
			BDSLUtil.Strings.rawStringOf(exportMethod.resourcePath));
		if (exportMethod.format == ExportFormat.PNG && (dataSink === DataSink.STDOUT)) {
			warning("The specified resource path is incompatible with the export format",
				BDSLPackage.Literals.EXPORT_METHOD__RESOURCE_PATH, EXPORT_METHOD_INCOMPATIBLE_RESOURCE_IDENTIFIER)
		}
	}

	@Check
	def siteIndexIsPositive(Site siteExpression) {
		if (siteExpression.index <= 0) {
			error("The index of a site must be a positive integer", BDSLPackage.Literals.SITE__INDEX,
				SITE_INDEX_IS_POSITIVE);
		}
	}

	@Check
	def closureNamesAreNotDistinct(Closure closureExpression) {
		val t = newHashSet(closureExpression.value.toArray)
		if (closureExpression.value.size != t.size) {
			error("Names in the closure are not distinct.", BDSLPackage.Literals.CLOSURE__VALUE,
				INVALID_CLOSURE_DEFINITION);
		}
	}

	@Check
	def checkNoCycleInEntityHierarchy(BigraphVarReference varDecl) {
		if (varDecl.eContainer.eClass == BDSLPackage.Literals.BDSL_DOCUMENT) {
			return
		}

		var current = varDecl as EObject;
		while (Objects::nonNull(current)) {
//			println("vcurrent" + current)
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