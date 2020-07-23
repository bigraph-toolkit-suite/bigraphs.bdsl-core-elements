package de.tudresden.inf.st.bigraphs.dsl.utils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.google.common.base.Preconditions;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractBigraphDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AssignableBigraphExpression;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AssignableBigraphExpressionWithExplicitSig;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLExpression;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLReferenceDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLVariableDeclaration2;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarDeclOrReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.NodeExpressionCall;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.DataSource;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LoadMethod;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.MethodStatements;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Signature;

/*
 * 
 * @author Dominik Grzelak
 */
public class BDSLUtil {

	/**
	 * 1. If signature already set, return it; 2. Check if control type is
	 * explicitly defined; 3. Run through definitions and find a node expression
	 * call. From the first one, get the signature
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
				List<Signature> signatures = bdslExpr.getDefinition().stream()
						.filter(x -> x instanceof NodeExpressionCall).map(x -> ((NodeExpressionCall) x).getValue())
						.map(x -> (Signature) x.eContainer()).collect(Collectors.toList());
				if (signatures.size() > 0) {
					return signatures.get(0);
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
		if (Objects.nonNull(bdslExpression.getAgents()) && bdslExpression.getAgents().size() > 0 &&
				Objects.nonNull(bdslExpression.getRules()) && bdslExpression.getRules().size() > 0
				&& !bdslExpressionIsRuleDefinition(bdslExpression) && !bdslExpressionIsBigraphDefinition(bdslExpression)
				&& !bdslExpressionIsMethodStatement(bdslExpression)) {
			return true;
		}
		return false;
	}

	public static boolean bdslExpressionIsRuleDefinition(BDSLExpression bdslExpression) {
		if (Objects.nonNull(bdslExpression.getRedex()) && Objects.nonNull(bdslExpression.getReactum())
				&& !bdslExpressionIsMethodStatement(bdslExpression)) {
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
		if (Objects.nonNull(bdslExpression.getDefinition()) && bdslExpression.getDefinition().size() > 0
				&& !bdslExpressionIsMethodStatement(bdslExpression)) {
			return true;
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
