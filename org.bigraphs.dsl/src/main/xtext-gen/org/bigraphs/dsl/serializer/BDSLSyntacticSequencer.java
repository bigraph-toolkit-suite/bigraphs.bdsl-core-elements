/*
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.bigraphs.dsl.services.BDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_Barren_BarrenKeyword_0_0_or_BrnKeyword_0_1;
	protected AbstractElementAlias match_Closure_ClosureKeyword_0_0_or_ClsreKeyword_0_1_or_SolidusKeyword_0_2;
	protected AbstractElementAlias match_NodeExpressionCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_3__q;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Substitution_SubstKeyword_0_1_or_SubstitutionKeyword_0_0;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BDSLGrammarAccess) access;
		match_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getBDSLTerminalExpressionAccess().getLeftParenthesisKeyword_1_0());
		match_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getBDSLTerminalExpressionAccess().getLeftParenthesisKeyword_1_0());
		match_Barren_BarrenKeyword_0_0_or_BrnKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBarrenAccess().getBarrenKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getBarrenAccess().getBrnKeyword_0_1()));
		match_Closure_ClosureKeyword_0_0_or_ClsreKeyword_0_1_or_SolidusKeyword_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClosureAccess().getClosureKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getClosureAccess().getClsreKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getClosureAccess().getSolidusKeyword_0_2()));
		match_NodeExpressionCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeExpressionCallAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getNodeExpressionCallAccess().getRightSquareBracketKeyword_1_3()));
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_Substitution_SubstKeyword_0_1_or_SubstitutionKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSubstitutionAccess().getSubstKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getSubstitutionAccess().getSubstitutionKeyword_0_0()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMAIN_KEYWORDRule())
			return getMAIN_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[ ]";
	}
	
	/**
	 * MAIN_KEYWORD:
	 * 	"main" "=";
	 */
	protected String getMAIN_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "main =";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Barren_BarrenKeyword_0_0_or_BrnKeyword_0_1.equals(syntax))
				emit_Barren_BarrenKeyword_0_0_or_BrnKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Closure_ClosureKeyword_0_0_or_ClsreKeyword_0_1_or_SolidusKeyword_0_2.equals(syntax))
				emit_Closure_ClosureKeyword_0_0_or_ClsreKeyword_0_1_or_SolidusKeyword_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NodeExpressionCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_3__q.equals(syntax))
				emit_NodeExpressionCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Substitution_SubstKeyword_0_1_or_SubstitutionKeyword_0_0.equals(syntax))
				emit_Substitution_SubstKeyword_0_1_or_SubstitutionKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'load' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'load' '(' ',' 'as' '=' format=LoadFormat
	 *     (rule start) (ambiguity) 'load' '(' ',' 'resourcePath' '=' resourcePath=STRING
	 *     (rule start) (ambiguity) 'load' '(' 'sig' '=' sig=[Signature|ID]
	 *     (rule start) (ambiguity) 'randomBigraph' '(' ')' (rule start)
	 *     (rule start) (ambiguity) 'randomBigraph' '(' ',' 'n' '=' n=INT
	 *     (rule start) (ambiguity) 'randomBigraph' '(' ',' 'p' '=' p=FLOAT
	 *     (rule start) (ambiguity) 'randomBigraph' '(' ',' 't' '=' t=INT
	 *     (rule start) (ambiguity) 'randomBigraph' '(' 'sig' '=' sig=[Signature|ID]
	 *     (rule start) (ambiguity) '{' 'agents' '=' '[' agents+=BigraphVarReference
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' brs=AssignableBigraphExpressionWithExplicitSig
	 *     (rule start) (ambiguity) '{' definition+=BigraphExpression
	 *     (rule start) (ambiguity) '{' redex=AssignableBigraphExpressionWithExplicitSig
	 *     (rule start) (ambiguity) '{' redex=BigraphExpression
	 *     (rule start) (ambiguity) type=[AbstractNamedSignatureElement|BIGRAPH_VAR_REFERENCE_ID]
	 *     (rule start) (ambiguity) {BDSLAssignment.left=}
	 
	 * </pre>
	 */
	protected void emit_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' 'agents' '=' '[' agents+=BigraphVarReference
	 *     (rule start) (ambiguity) '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '{' brs=AssignableBigraphExpressionWithExplicitSig
	 *     (rule start) (ambiguity) '{' definition+=BigraphExpression
	 *     (rule start) (ambiguity) '{' redex=AssignableBigraphExpressionWithExplicitSig
	 *     (rule start) (ambiguity) '{' redex=BigraphExpression
	 *     (rule start) (ambiguity) {BDSLAssignment.left=}
	 
	 * </pre>
	 */
	protected void emit_BDSLTerminalExpression_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'barren' | 'brn'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) '()' (rule start)
	 *     (rule start) (ambiguity) '()' (rule start)
	 
	 * </pre>
	 */
	protected void emit_Barren_BarrenKeyword_0_0_or_BrnKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'closure' | 'clsre' | '/'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) '(' value+=STRING
	 *     (rule start) (ambiguity) '(' value+=STRING
	 
	 * </pre>
	 */
	protected void emit_Closure_ClosureKeyword_0_0_or_ClsreKeyword_0_1_or_SolidusKeyword_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     value=[ControlVariable|FQN] (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_NodeExpressionCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'id' '(' index=INT
	 *     (rule start) (ambiguity) 'join' '()' (rule start)
	 *     (rule start) (ambiguity) 'merge' '(' sites=INT
	 *     (rule start) (ambiguity) 'val' name=ID
	 *     (rule start) (ambiguity) ('barren' | 'brn') '()' (rule start)
	 *     (rule start) (ambiguity) ('closure' | 'clsre' | '/') '(' value+=STRING
	 *     (rule start) (ambiguity) ('substitution' | 'subst') '(' from=STRING
	 *     (rule start) (ambiguity) value=[ControlVariable|FQN]
	 *     (rule start) (ambiguity) value=[LocalVarDecl|BIGRAPH_VAR_REFERENCE_ID]
	 *     (rule start) (ambiguity) {Multi.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Multi.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'substitution' | 'subst'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) '(' from=STRING
	 *     (rule start) (ambiguity) '(' from=STRING
	 
	 * </pre>
	 */
	protected void emit_Substitution_SubstKeyword_0_1_or_SubstitutionKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) '}' ')' (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) '}' (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) expressions+=XExpressionOrVarDeclaration
	 
	 * </pre>
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) expressions+=XExpressionOrVarDeclaration
	 
	 * </pre>
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '=&gt;' returnType=JvmTypeReference
	 
	 * </pre>
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     importedNamespace=QualifiedNameWithWildcard (ambiguity) (rule end)
	 *     importedType=[JvmDeclaredType|QualifiedName] (ambiguity) (rule end)
	 *     memberName=ValidID (ambiguity) (rule end)
	 *     wildcard?='*' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=XExpression
	 *     (rule start) (ambiguity) '#' '{' '}' (rule start)
	 *     (rule start) (ambiguity) '#' '{' elements+=XExpression
	 *     (rule start) (ambiguity) '&lt;' typeArguments+=JvmArgumentTypeReference
	 *     (rule start) (ambiguity) '[' declaredFormalParameters+=JvmFormalParameter
	 *     (rule start) (ambiguity) '[' explicitSyntax?='|'
	 *     (rule start) (ambiguity) '[' expression=XExpressionInClosure
	 *     (rule start) (ambiguity) 'do' body=XExpression
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' ')' eachExpression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' updateExpressions+=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' expression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'for' '(' initExpressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) 'if' '(' if=XExpression
	 *     (rule start) (ambiguity) 'new' constructor=[JvmConstructor|QualifiedName]
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) 'return' (rule start)
	 *     (rule start) (ambiguity) 'return' expression=XExpression
	 *     (rule start) (ambiguity) 'switch' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' switch=XExpression
	 *     (rule start) (ambiguity) 'synchronized' '(' param=XExpression
	 *     (rule start) (ambiguity) 'throw' expression=XExpression
	 *     (rule start) (ambiguity) 'try' expression=XExpression
	 *     (rule start) (ambiguity) 'typeof' '(' type=[JvmType|QualifiedName]
	 *     (rule start) (ambiguity) 'while' '(' predicate=XExpression
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' expressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|FeatureCallID]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|IdOrSuper]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|OpUnary]
	 *     (rule start) (ambiguity) isTrue?='true'
	 *     (rule start) (ambiguity) value=Number
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {XAssignment.assignable=}
	 *     (rule start) (ambiguity) {XBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {XCastedExpression.target=}
	 *     (rule start) (ambiguity) {XInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {XMemberFeatureCall.memberCallTarget=}
	 *     (rule start) (ambiguity) {XPostfixOperation.operand=}
	 
	 * </pre>
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=XExpression
	 *     (rule start) (ambiguity) '#' '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '{' elements+=XExpression
	 *     (rule start) (ambiguity) '&lt;' typeArguments+=JvmArgumentTypeReference
	 *     (rule start) (ambiguity) '[' declaredFormalParameters+=JvmFormalParameter
	 *     (rule start) (ambiguity) '[' explicitSyntax?='|'
	 *     (rule start) (ambiguity) '[' expression=XExpressionInClosure
	 *     (rule start) (ambiguity) 'do' body=XExpression
	 *     (rule start) (ambiguity) 'false' ')' (rule start)
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' ')' eachExpression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' updateExpressions+=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' expression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'for' '(' initExpressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) 'if' '(' if=XExpression
	 *     (rule start) (ambiguity) 'new' constructor=[JvmConstructor|QualifiedName]
	 *     (rule start) (ambiguity) 'null' ')' (rule start)
	 *     (rule start) (ambiguity) 'return' ')' (rule start)
	 *     (rule start) (ambiguity) 'return' expression=XExpression
	 *     (rule start) (ambiguity) 'switch' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' switch=XExpression
	 *     (rule start) (ambiguity) 'synchronized' '(' param=XExpression
	 *     (rule start) (ambiguity) 'throw' expression=XExpression
	 *     (rule start) (ambiguity) 'try' expression=XExpression
	 *     (rule start) (ambiguity) 'typeof' '(' type=[JvmType|QualifiedName]
	 *     (rule start) (ambiguity) 'while' '(' predicate=XExpression
	 *     (rule start) (ambiguity) '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '{' expressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|FeatureCallID]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|IdOrSuper]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|OpUnary]
	 *     (rule start) (ambiguity) isTrue?='true'
	 *     (rule start) (ambiguity) value=Number
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {XAssignment.assignable=}
	 *     (rule start) (ambiguity) {XBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {XCastedExpression.target=}
	 *     (rule start) (ambiguity) {XInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {XMemberFeatureCall.memberCallTarget=}
	 *     (rule start) (ambiguity) {XPostfixOperation.operand=}
	 
	 * </pre>
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}