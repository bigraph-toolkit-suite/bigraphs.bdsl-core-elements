package de.tudresden.inf.st.bigraphs.dsl.utils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.google.common.base.Preconditions;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractBigraphDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractElementsWithNameAndSig;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AssignableBigraphExpression;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AssignableBigraphExpressionWithExplicitSig;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLExpression;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLReferenceDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLReferenceSymbol;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLVariableDeclaration2;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BRSDefinition;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphExpression;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarDeclOrReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.NodeExpressionCall;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.ReferenceClassSymbol;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.RuleVarReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.DataSource;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LoadMethod;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalPredicateDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalRuleDecl;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.MethodStatements;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Signature;

/*
 * 
 * @author Dominik Grzelak
 */
public class BDSLUtil {

	public static Signature tryInferSignature(AbstractElementsWithNameAndSig variable) {
		if (variable instanceof LocalVarDecl) {
			return tryInferSignature((LocalVarDecl)variable);
		}
		if (variable instanceof LocalPredicateDeclaration) {
			return tryInferSignature((LocalPredicateDeclaration)variable);
		}
		if (variable instanceof LocalRuleDecl) {
			return tryInferSignature((LocalRuleDecl)variable);
		}
		if (variable instanceof BRSDefinition) {
			return tryInferSignature((BRSDefinition)variable);
		}
		return null;
	}

	/**
	 * This method tries to infer a signature from a local bigraph variable
	 * declaration. The user is allowed to omit the signature. However, in some
	 * cases it can be derived from the definition: 1. If signature already set,
	 * return it; 2. Check if control type is explicitly defined; 3. Run through
	 * definitions and find a node expression call. From the first one, get the
	 * signature
	 * 
	 * @param localVarDecl the variable declaration
	 * @return a signature, or {@code null} if it could not be derived
	 */
	public static Signature tryInferSignature(LocalVarDecl localVarDecl) {
		if (Objects.nonNull(localVarDecl.getSig()))
			return localVarDecl.getSig();
		if (Objects.nonNull(localVarDecl.getControlType())) {
			return (Signature) localVarDecl.getControlType().eContainer();
		}
		BDSLVariableDeclaration2 container = EcoreUtil2.getContainerOfType(localVarDecl,
				BDSLVariableDeclaration2.class);
		if (Objects.nonNull(container)) {
			if (container.getValue() instanceof BDSLExpression) {
				BDSLExpression bdslExpr = container.getValue();
				if (bdslExpressionIsBigraphDefinition(bdslExpr)) {
					List<Signature> signatures = bdslExpr.getDefinition().stream()
							.filter(x -> x instanceof NodeExpressionCall).map(x -> ((NodeExpressionCall) x).getValue())
							.map(x -> (Signature) x.eContainer()).collect(Collectors.toList());
					if (signatures.size() > 0) {
						return signatures.get(0);
					}
				}
				if (bdslExpr instanceof AssignableBigraphExpressionWithExplicitSig) {
					return ((AssignableBigraphExpressionWithExplicitSig) container.getValue()).getSig();
				}
				if (bdslExpr instanceof ReferenceClassSymbol) {
					return tryInferSignature((LocalVarDecl) ((ReferenceClassSymbol) bdslExpr).getType());
				}
			}
		}
		return null;
	}

	public static Signature tryInferSignature(LocalPredicateDeclaration localPredDecl) {
		if (Objects.nonNull(localPredDecl.getSig()))
			return localPredDecl.getSig();

		BDSLVariableDeclaration2 container = EcoreUtil2.getContainerOfType(localPredDecl,
				BDSLVariableDeclaration2.class);
		if (Objects.nonNull(container)) {
			if (container.getValue() instanceof BDSLExpression) {
				BDSLExpression bdslExpr = container.getValue();
				if (bdslExpressionIsBigraphDefinition(bdslExpr)) {
					List<Signature> signatures = bdslExpr.getDefinition().stream()
							.filter(x -> x instanceof NodeExpressionCall).map(x -> ((NodeExpressionCall) x).getValue())
							.map(x -> (Signature) x.eContainer()).collect(Collectors.toList());
					if (signatures.size() > 0) {
						return signatures.get(0);
					}
				}
				if (bdslExpr instanceof AssignableBigraphExpressionWithExplicitSig) {
					return ((AssignableBigraphExpressionWithExplicitSig) container.getValue()).getSig();
				}
				if (bdslExpr instanceof ReferenceClassSymbol) {
					return tryInferSignature((LocalVarDecl) ((ReferenceClassSymbol) bdslExpr).getType());
				}
			}
		}
		return null;
	}

	public static Signature tryInferSignature(LocalRuleDecl localRuleDecl) {
		if (Objects.nonNull(localRuleDecl.getSig()))
			return localRuleDecl.getSig();
		BDSLVariableDeclaration2 container = EcoreUtil2.getContainerOfType(localRuleDecl,
				BDSLVariableDeclaration2.class);

		if (Objects.nonNull(container)) {
			if (container.getValue() instanceof BDSLExpression) {
				BDSLExpression bdslExpr = container.getValue();
				if (bdslExpressionIsRuleDefinition(bdslExpr)) {
					if (bdslExpr.getRedex() instanceof BigraphVarReference) {
						// TODO
						return tryInferSignature((LocalVarDecl) ((BigraphVarReference) bdslExpr.getRedex()).getValue());
					}
				}
				if (bdslExpr.getRedex() instanceof AssignableBigraphExpressionWithExplicitSig) {
					return ((AssignableBigraphExpressionWithExplicitSig) bdslExpr.getRedex()).getSig();
				}
				if (bdslExpr instanceof ReferenceClassSymbol) {
					return tryInferSignature((LocalRuleDecl) ((ReferenceClassSymbol) bdslExpr).getType());
				}
			}
		}
		return null;
	}

	public static Signature tryInferSignature(BRSDefinition brsDefinition) {
		if (Objects.nonNull(brsDefinition.getSig()))
			return brsDefinition.getSig();
		BDSLVariableDeclaration2 container = EcoreUtil2.getContainerOfType(brsDefinition,
				BDSLVariableDeclaration2.class);
		if (Objects.nonNull(container)) {
			if (container.getValue() instanceof BDSLExpression) {
				BDSLExpression bdslExpr = container.getValue();
				if (bdslExpressionIsBRSDefinition(bdslExpr)) {
					BDSLReferenceSymbol referenceSymbol = bdslExpr.getAgents().get(0);
					if (referenceSymbol instanceof BigraphVarReference) {
						return tryInferSignature(((BigraphVarReference) referenceSymbol).getValue());
					}
				}
			}
		}
		return null;
	}

	public static LocalVarDecl getLocalVarDecl(BigraphVarDeclOrReference typeLeftHandSide) {
		if (typeLeftHandSide instanceof LocalVarDecl) {
			return (LocalVarDecl) typeLeftHandSide;
		}
		if (typeLeftHandSide instanceof BigraphVarReference) {
			return ((BigraphVarReference) typeLeftHandSide).getValue();
		}
		return null;
	}

	public static boolean bdslExpressionIsBRSDefinition(BDSLExpression bdslExpression) {
		BDSLVariableDeclaration2 decl = EcoreUtil2.getContainerOfType(bdslExpression, BDSLVariableDeclaration2.class);
		if (Objects.nonNull(bdslExpression.getAgents()) && bdslExpression.getAgents().size() > 0
				&& Objects.nonNull(bdslExpression.getRules()) && bdslExpression.getRules().size() > 0
				&& !bdslExpressionIsMethodStatement(bdslExpression) && decl.getVariable() instanceof BRSDefinition) {
			return true;
		}
		return false;
	}

	public static boolean bdslExpressionIsRuleDefinition(BDSLExpression bdslExpression) {
		BDSLVariableDeclaration2 decl = EcoreUtil2.getContainerOfType(bdslExpression, BDSLVariableDeclaration2.class);
		if (Objects.nonNull(bdslExpression.getRedex()) && Objects.nonNull(bdslExpression.getReactum())
				&& !bdslExpressionIsMethodStatement(bdslExpression) && decl.getVariable() instanceof LocalRuleDecl) {
			return true;
		}
		return false;
	}

	public static boolean bdslExpressionIsMethodStatement(BDSLExpression bdslExpression) {
		return bdslExpression instanceof MethodStatements;
	}

	public static boolean bdslExpressionIsAssignableBigraphMethodExpression(BDSLExpression bdslExpression) {
		return bdslExpression instanceof AssignableBigraphExpressionWithExplicitSig;
	}

	public static boolean bdslExpressionIsBigraphDefinition(BDSLExpression bdslExpression) {
		BDSLVariableDeclaration2 decl = EcoreUtil2.getContainerOfType(bdslExpression, BDSLVariableDeclaration2.class);
		if (Objects.nonNull(bdslExpression.getDefinition()) && bdslExpression.getDefinition().size() > 0
				&& !bdslExpressionIsMethodStatement(bdslExpression)
				&& (decl.getVariable() instanceof LocalPredicateDeclaration
						|| decl.getVariable() instanceof LocalVarDecl)) {
			return true;
		}
		return false;
	}

	public static boolean bdslExpressionIsPredicateDefinition(BDSLExpression bdslExpression) {
		BDSLVariableDeclaration2 decl = EcoreUtil2.getContainerOfType(bdslExpression, BDSLVariableDeclaration2.class);
		if (bdslExpressionIsBigraphDefinition(bdslExpression) && Objects.nonNull(decl)
				&& decl.getVariable() instanceof LocalPredicateDeclaration) {
			return true;
		}
		return false;
	}

	public static boolean checkReferenceSymbolType(BDSLExpression bdslExpression, Class<?> clazz) {
		if (bdslExpression instanceof ReferenceClassSymbol) {
			Class<?> refClass = ((ReferenceClassSymbol) bdslExpression).getType().getClass();
			return clazz.isAssignableFrom(refClass);
		}
		return false;
	}

	public static void updateSignatureOfAssignment(AssignableBigraphExpression assignmentExpression,
			Signature signature) {
		BDSLVariableDeclaration2 prntContainer = EcoreUtil2.getContainerOfType(assignmentExpression,
				BDSLVariableDeclaration2.class);
		if (Objects.isNull(prntContainer)) {
			BDSLReferenceDeclaration refCnt = EcoreUtil2.getContainerOfType(assignmentExpression,
					BDSLReferenceDeclaration.class);
			assert refCnt != null;
			updateSignatureOfAssignment(refCnt, signature);
		} else {
			updateSignatureOfAssignment(prntContainer, signature);
		}
	}

	public static void updateSignatureOfAssignment(BDSLVariableDeclaration2 prntContainer, Signature signature) {
//        LocalVarDecl decl = BDSLUtil2.getLocalVarDecl(prntContainer.getVariable());
		prntContainer.getVariable().setSig(signature); // update signature
	}

	public static void updateSignatureOfAssignment(BDSLReferenceDeclaration prntContainer, Signature signature) {
//        LocalVarDecl decl = BDSLUtil2.getLocalVarDecl(prntContainer.getTarget());
		prntContainer.getTarget().setSig(signature); // update signature
	}

	public static class Strings {
		public static String rawStringOf(String value) {
			if (Objects.isNull(value))
				return null;
			boolean firstPos = value.charAt(0) == '\"' || value.charAt(0) == '\'';
			boolean lastPos = value.charAt(value.length() - 1) == '\"' || value.charAt(value.length() - 1) == '\'';
			if (firstPos && lastPos) {
				return value.substring(1, value.length() - 1);
			}
			return value;
		}
	}

	public static class Resources {
		public static DataSource getDataSourceFromIdentifier(String resourcePath) {
			if (Objects.nonNull(resourcePath) && !resourcePath.isEmpty()) {
				if (resourcePath.startsWith("classpath:")) {
					return DataSource.CLASSPATH;
				}
				if (resourcePath.startsWith("cdo:")) {
					return DataSource.DB;
				}
				if (resourcePath.startsWith("file:")) {
					return DataSource.LOCAL_FILE;
				}
			}
			return DataSource.UNSPECIFIED;
		}
	}
}
