package de.tudresden.inf.st.bigraphs.dsl.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Singleton;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.google.inject.Scope;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractBigraphDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractElement;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BRSModel;
//import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphLiteral;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalRuleDecl;
//import de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlDef;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl;
//import de.tudresden.inf.st.bigraphs.dsl.bDSL.NodeExpression;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.NodeExpressionCall;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Signature;

/**
 * Scope provider for:
 * <ul>
 * <li>nodes with matching controls according to the assigned signature of the
 * bigraph variable declaration</li>
 * <li>bigraph variable usage within other bigraph variable declaration having
 * same signature</li>
 * </ul>
 * 
 * @author Dominik Grzelak
 *
 */
@Singleton
public class BDSLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	@Inject
	IQualifiedNameProvider nameProvider;

	@Override
	protected IScope getLocalElementsScope(IScope parentScope, EObject context, EReference reference) {
		// TODO Auto-generated method stub
//		System.out.println("getLocalElementsScope");
		return super.getLocalElementsScope(parentScope, context, reference);
	}

	@Override
	public IScope getScope(EObject context, EReference reference) {
//		System.out.println("Context: " + context);
//		System.out.println("Reference.eContainer: " + reference.eContainer());

		if (reference == BDSLPackage.Literals.BRS_MODEL_IMPORT) {
//			System.out.println("BRS_MODEL_IMPORT: looking into global scope");
			return super.getGlobalScope(context.eResource(), reference);
		}

		IScope parentScope = IScope.NULLSCOPE;
		BRSModel module = EcoreUtil2.getContainerOfType(context, BRSModel.class);
//		for (import : module) {
//			if (!import.module.eIsProxy)
//				result = getBRSModelScope(context, reference, module, result);
//		}
		parentScope = getBRSModelScope(context, reference, module, parentScope);

//		if (context instanceof LocalVarDecl && reference.getName().equals("sig")) { // reference ==
//																					// BDSLPackage.Literals.SIGNATURE
//			EObject rootElement = EcoreUtil2.getRootContainer(context);
//			List<Signature> candidates = EcoreUtil2.getAllContentsOfType(rootElement, Signature.class);
//			System.out.println(rootElement);
//			return Scopes.scopeFor(candidates);
//		}

		// TODO check before if computational subBRS (they can have a different
		// signature)
		// Bigraph variable reference scope (excluding itself at the end, no recursive
		// bigraph declaration allowed)
		if (context instanceof AbstractElement && reference.eContainer() == BDSLPackage.Literals.BIGRAPH_VAR_REFERENCE) {
			EObject containerElement = EcoreUtil2.getContainerOfType(context, AbstractElement.class);
			if (containerElement != null) {
//				System.out.println("containerElement: " + containerElement);

//				Scopes.selectCompatible(IScope.NULLSCOPE.getAllElements(), BDSLPackage.Literals.BIGRAPH_VAR_REFERENCE);
//				EObject rootElement = EcoreUtil2.getRootContainer(context);
				Signature correctSignature = inferSignature((AbstractElement) containerElement);// ((LocalVarDecl)
																								// containerElement).getSig();
				List<AbstractElement> allVarDeclarations = new ArrayList<AbstractElement>();
//				= EcoreUtil2.getAllContentsOfType(rootElement,
//						LocalVarDecl.class);
//				collectScopeVarDeclarations(allVarDeclarations, containerElement);
				findAllLocalBigraphVariableDeclarations(context, allVarDeclarations);
				Predicate<AbstractElement> signatureFilterPredicate = new Predicate<AbstractElement>() {

					@Override
					public boolean apply(AbstractElement arg0) {
//						System.out.println(arg0);
//						System.out.println(correctSignature);
						Signature infered = inferSignature(arg0);
						if (infered == null)
							return false;
						return infered.equals(correctSignature);
					}

				};
				Predicate<IEObjectDescription> filter = new Predicate<IEObjectDescription>() {

					@Override
					public boolean apply(IEObjectDescription e) {
						return !Objects.equal(e.getEObjectOrProxy(), context);
					}
				};
				Collection<AbstractElement> filtered = Collections2.filter(allVarDeclarations, signatureFilterPredicate);
//				System.out.println("correctSignature is: " + correctSignature);
//				System.out.println("filtered: " + filtered);
				IScope existingScope = Scopes.scopeFor(filtered);
				return existingScope; //new FilteringScope(existingScope, filter);
			}
		}

		if ((context instanceof NodeExpressionCall)
				&& reference.eContainer() == BDSLPackage.Literals.NODE_EXPRESSION_CALL) { // && reference.eContainer()
																							// ==
																							// BDSLPackage.Literals....)
																							// {
			// && reference.eContainer() ==
			// BDSLPackage.Literals.BIGRAPH_VAR_REFERENCE) {
//			System.out.println("Reference.eContainer: " + reference.eContainer());
			EObject containerElement = EcoreUtil2.getContainerOfType(context, AbstractElement.class);
//			System.out.println("containerElement: " + containerElement);
			if (containerElement != null) {
				Signature correctSignature = inferSignature((AbstractElement) containerElement);
//				System.out.println("\t correctSignature: " + correctSignature);
//						((LocalVarDecl) containerElement).getSig();
//				if (correctSignature == null) {

//				}
//				IScope existingScope = Scopes.scopeFor(correctSignature.getControls());
				List<IEObjectDescription> scopesy = new ArrayList<IEObjectDescription>();
				for (ControlVariable x : correctSignature.getControls()) {
					if (x instanceof ControlVariable) {
						String fqn1 = ((ControlVariable) x).getName();
						// der alias name erlaubt, das als stellvertreter einzugeben und zeigt dabei
						// immer noch
						// auf das richtige element im Scope
						AliasedEObjectDescription obj2 = new AliasedEObjectDescription(QualifiedName.create(fqn1),
								EObjectDescription.create(nameProvider.getFullyQualifiedName(x), x));
						scopesy.add(obj2);
					}
				}
				IScope existingScope = new SimpleScope(IScope.NULLSCOPE, scopesy, false);
//				System.out.println("existingScope: " + existingScope);
				return existingScope;
			}
		}
//		if(result != IScope.NULLSCOPE && result.getAllElements().iterator().hasNext()) 
//			return result;
		return super.getScope(context, reference);
	}

//	public void collectScopeVarDeclarations(List<LocalVarDecl> list, EObject rootElement) {
//
//	}

	/**
	 * Find all local bigraph variable declaration beginning from the current scope.
	 * The method works its way up. So variables with the same names in the outer
	 * scopes getting discarded.
	 * 
	 * The correct signature checking is not done here and possibly not necessary
	 * because of other restrictions at other places.
	 * 
	 * @param context the current context element
	 * @param collect a list to collect all occurring declarations
	 */
	public void findAllLocalBigraphVariableDeclarations(EObject context, List<AbstractElement> collect) {
//		System.out.println("context: " + context);
		List<AbstractElement> allVarDeclarations = EcoreUtil2.getAllContentsOfType(context, AbstractElement.class);
		List<String> names = collect.stream().map(x -> x.getName()).collect(Collectors.toList());
		for (AbstractElement each : allVarDeclarations) {
			if (!names.contains(each.getName())) {
				collect.add(each);
			}
		}
		if (context.eContainer() != null) {
			findAllLocalBigraphVariableDeclarations(context.eContainer(), collect);
		}
	}

	/**
	 * Infer the signature of a variable declaration by looking up the parent context.
	 * 
	 * A inner bigraph declaration need not have to define a signature (or more specifically, it is not possible to define one accidentally).
	 * @param variable
	 * @return
	 */
	public Signature inferSignature(AbstractElement variable) {
		if (variable.getSig() != null) {
			return variable.getSig();
		}
		if (variable.eContainer() != null) {
			EObject container = EcoreUtil2.getContainerOfType(variable.eContainer(), AbstractElement.class);
//			Signature sig = ((LocalVarDecl) variable.eContainer()).getSig();
//			if (sig != null)
//				return sig;
			if (container instanceof AbstractElement)
				return inferSignature(((AbstractElement) container));
		}
		return null;
	}
	
//	public Signature inferSignature(LocalRuleDecl variable) {
//		if (variable.getSig() != null) {
//			return variable.getSig();
//		}
//		if (variable.eContainer() != null) {
//			EObject containerRule = EcoreUtil2.getContainerOfType(variable.eContainer(), LocalRuleDecl.class);
//			if(containerRule instanceof LocalRuleDecl) {
//				return inferSignature(((LocalRuleDecl) containerRule));
//			}
//		}
//
//		return null;
//	}

	public IScope getBRSModelScope(EObject context, EReference reference, BRSModel module, IScope parent) {
//		System.out.println("getBRSModelScope");
		Collection<AbstractElement> allDefinitions = module.getStatements();
//				Collections2.filter(module.getStatements(),
//				e -> e.getClass().equals(LocalVarDecl.class));
		return Scopes.scopeFor(allDefinitions, parent);
	}

	public IScope getSigDefScope(EObject context, EReference reference, IScope parent) {
		EObject containerElement = EcoreUtil2.getContainerOfType(context, AbstractElement.class);
		if (containerElement != null) {
//			EObject rootElement = EcoreUtil2.getRootContainer(context);
			Signature correctSignature = ((AbstractElement) containerElement).getSig();
			final QualifiedName fqn1 = getQualifiedNameProvider().getFullyQualifiedName(correctSignature);
//			System.out.println("fqn1 of sig: " + fqn1);
			IScope mbsSig = MapBasedScope.createScope(parent,
					Collections.singleton(EObjectDescription.create(fqn1, correctSignature)));
			return mbsSig;
		}
		return parent;
	}

	public IScope getDefinitionScope(EObject context, EReference reference, IScope parent) {
//		System.out.println("reference: " + reference.eContainer());
		if (context instanceof NodeExpressionCall
				&& reference.eContainer() == BDSLPackage.Literals.NODE_EXPRESSION_CALL) {
			// && reference.eContainer() ==
			// BDSLPackage.Literals.BIGRAPH_VAR_REFERENCE) {
			EObject containerElement = context.eContainer();// EcoreUtil2.getContainerOfType(context,
															// LocalVarDecl.class);
//			if (containerElement != null) {
////				EObject rootElement = EcoreUtil2.getRootContainer(context);
			Signature correctSignature = ((AbstractElement) containerElement).getSig();
//				final QualifiedName fqn1 = getQualifiedNameProvider().getFullyQualifiedName(correctSignature);
////				System.out.println("fqn1 of sig: " + fqn1);
//				IScope mbsSig = MapBasedScope.createScope(parent, Collections.singleton(EObjectDescription.create(fqn1, correctSignature)));
//				
//				
			List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
//				IScope existingScope = Scopes.scopeFor(correctSignature.getControls());
//				existingScope.getAllElements().forEach(x -> result.add(x));
			correctSignature.getControls().forEach(x -> {
				String fqn = getQualifiedNameProvider().getFullyQualifiedName(x).toString();
				result.add(EObjectDescription.create(QualifiedName.create(fqn), x));
			});

//				Scopes.filterDuplicates(result);
			IScope scopeControls = MapBasedScope.createScope(parent, result);

//			System.out.println("MapBasedScope:\t" + scopeControls);

//				IScope cool = Scopes.scopeFor(correctSignature.getControls(), new Function<ControlDef, QualifiedName>() {
//
//					@Override
//					public QualifiedName apply(ControlDef x) {
//						return getQualifiedNameProvider().getFullyQualifiedName(x);
//					}
//					
//				}, parent);
			return scopeControls; // existingScope;
		}
//		}
		return parent;
	}

}