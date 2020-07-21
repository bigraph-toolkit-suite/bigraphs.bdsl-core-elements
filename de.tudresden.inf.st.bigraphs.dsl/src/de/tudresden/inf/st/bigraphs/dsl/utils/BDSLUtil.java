package de.tudresden.inf.st.bigraphs.dsl.utils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.google.common.base.Preconditions;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractBigraphDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLVariableDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarDeclOrReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.NodeExpressionCall;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.DataSource;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LoadMethod;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl;
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
		BDSLVariableDeclaration container = EcoreUtil2.getContainerOfType(localVarDecl, BDSLVariableDeclaration.class);
		if (Objects.nonNull(container)) {
			List<Signature> signatures = container.getDefinition().stream().filter(x -> x instanceof NodeExpressionCall)
					.map(x -> ((NodeExpressionCall) x).getValue()).map(x -> (Signature) x.eContainer())
					.collect(Collectors.toList());
			if (signatures.size() > 0) {
				return signatures.get(0);
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
