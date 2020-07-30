package de.tudresden.inf.st.bigraphs.dsl.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.inject.Singleton;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.inject.Inject;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractElement;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractElementsWithNameAndSig;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractMainStatements;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.AssignmentOrVariableDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLDocument;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLReferenceDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLVariableDeclaration2;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BRSDefinition;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarDeclOrReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlType;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.NodeExpressionCall;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.Signature;
import de.tudresden.inf.st.bigraphs.dsl.utils.BDSLUtil;

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
//		System.out.println("Reference: " + reference);
//		System.out.println("Reference.eContainer: " + reference.eContainer());

		if (reference == BDSLPackage.Literals.BDSL_DOCUMENT_IMPORT) {
//			System.out.println("BRS_MODEL_IMPORT: looking into global scope");
			return super.getGlobalScope(context.eResource(), reference);
		}

		IScope parentScope = IScope.NULLSCOPE;
		BDSLDocument module = EcoreUtil2.getContainerOfType(context, BDSLDocument.class);
//		for (import : module) {
//			if (!import.module.eIsProxy)
//				result = getBRSModelScope(context, reference, module, result);
//		}
		parentScope = getBRSModelScope(context, reference, module, parentScope);
//		System.out.println(parentScope);

//		ontext: de.tudresden.inf.st.bigraphs.dsl.bDSL.impl.BigraphVarReferenceImpl@52350abb (name: test2)
//		Reference.eContainer: org.eclipse.emf.ecore.impl.EClassImpl@3b956878 (name: LoadMethod) (instanceClassName: null) (abstract: false, interface: false)

		// TODO check before if computational subBRS (they can have a different
		// signature)
		// Bigraph variable reference scope (excluding itself at the end, no recursive
		// bigraph declaration allowed)
		if (context instanceof AbstractElementsWithNameAndSig
				&& reference.eContainer() == BDSLPackage.Literals.BIGRAPH_VAR_REFERENCE) {
			EObject containerElement = EcoreUtil2.getContainerOfType(context, AbstractElementsWithNameAndSig.class);
			if (containerElement != null) {
//				System.out.println("containerElement: " + containerElement);
//				Scopes.selectCompatible(IScope.NULLSCOPE.getAllElements(), BDSLPackage.Literals.BIGRAPH_VAR_REFERENCE);
//				EObject rootElement = EcoreUtil2.getRootContainer(context);
				Signature correctSignature = inferSignature((AbstractElementsWithNameAndSig) containerElement);
				List<AbstractElementsWithNameAndSig> allVarDeclarations = new ArrayList<AbstractElementsWithNameAndSig>();
				findAllLocalBigraphVariableDeclarations(context, allVarDeclarations);
				Predicate<AbstractElementsWithNameAndSig> signatureFilterPredicate = new Predicate<AbstractElementsWithNameAndSig>() {

					@Override
					public boolean apply(AbstractElementsWithNameAndSig arg0) {
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
				Collection<AbstractElementsWithNameAndSig> filtered = Collections2.filter(allVarDeclarations,
						signatureFilterPredicate);
				IScope existingScope = Scopes.scopeFor(filtered);
				return existingScope; // new FilteringScope(existingScope, filter);
			}
		}

		if ((context instanceof LocalVarDecl) && reference == BDSLPackage.Literals.LOCAL_VAR_DECL__CONTROL_TYPE
				&& reference.eContainer() == BDSLPackage.Literals.LOCAL_VAR_DECL) {
			Signature currentSignature = BDSLUtil.tryInferSignature(((LocalVarDecl) context));
			if (java.util.Objects.nonNull(currentSignature)) {
				List<IEObjectDescription> controlScope = new ArrayList<IEObjectDescription>();
				QualifiedName sigQfn = nameProvider.getFullyQualifiedName(currentSignature);
				for (ControlVariable x : currentSignature.getControls()) {
						String ctrlQfn = ((ControlVariable) x).getName();
						QualifiedName ctrlFullQfn = QualifiedName.EMPTY.append(sigQfn).append(ctrlQfn);
						
						AliasedEObjectDescription objDescr = new AliasedEObjectDescription(QualifiedName.create(ctrlQfn),
								EObjectDescription.create(nameProvider.getFullyQualifiedName(x), x));
						AliasedEObjectDescription objDescr2 = new AliasedEObjectDescription(ctrlFullQfn,
								EObjectDescription.create(ctrlFullQfn, x));
						
						controlScope.add(objDescr);
						controlScope.add(objDescr2);
				}
				IScope existingScope = new SimpleScope(IScope.NULLSCOPE, controlScope, false);
				return existingScope;
			}
		}

		// Scope Provider for controls inside a bigraph definition
		if ((context instanceof NodeExpressionCall)
				&& reference.eContainer() == BDSLPackage.Literals.NODE_EXPRESSION_CALL) {

//			System.out.println("Reference.eContainer of NodeExpressionCall: " + reference.eContainer());

			Optional<AssignmentOrVariableDeclaration> bdslVarDecl = StreamSupport
					.stream(EcoreUtil2.getAllContainers(context).spliterator(), false)
					.filter(x -> x instanceof AssignmentOrVariableDeclaration)
					.map(x -> (AssignmentOrVariableDeclaration) x).findFirst();
			EObject containerElement = null;
//			System.out.println("bdslVarDecl: " + bdslVarDecl);
			if (bdslVarDecl.isPresent()) {
				containerElement = bdslVarDecl.get();
//				System.out.println("Trying to cast now: " + containerElement + "; " + containerElement.getClass() + "; "
//						+ containerElement.eClass());
				if (((BDSLVariableDeclaration2) containerElement).getVariable() instanceof BigraphVarDeclOrReference) {
//					System.out.println("\tNow in var decl 1...");
					containerElement = BDSLUtil.getLocalVarDecl(
							(BigraphVarDeclOrReference) ((BDSLVariableDeclaration2) containerElement).getVariable());
//					System.out.println("\tcontainerElement is now: " + containerElement);
				}
			} else {
				containerElement = EcoreUtil2.getContainerOfType(context, AbstractElementsWithNameAndSig.class);
//				System.out.println("\t now in else block");
				if (containerElement == null) {
//					System.out.println("\tfirst round is null");
					containerElement = EcoreUtil2.getContainerOfType(context, BDSLVariableDeclaration2.class);
					if (containerElement != null) {
						if (((BDSLVariableDeclaration2) containerElement)
								.getVariable() instanceof BigraphVarDeclOrReference) {
//							System.out.println("\tNow in var decl 2...");
							containerElement = BDSLUtil.getLocalVarDecl(
									(BigraphVarDeclOrReference) ((BDSLVariableDeclaration2) containerElement)
											.getVariable());
						}
					}
				}
//				System.out.println("Still: " + containerElement);
				if (containerElement == null) {
					containerElement = EcoreUtil2.getContainerOfType(context, BigraphVarDeclOrReference.class);
					System.out.println("\t" + containerElement);
				}
			}

			Signature correctSignature = null;
			if (containerElement != null) {

//				System.out.println("\t containerElement: " + containerElement);
				if (containerElement instanceof AssignmentOrVariableDeclaration)
					correctSignature = inferSignature((AssignmentOrVariableDeclaration) containerElement);
				if (containerElement instanceof AbstractElementsWithNameAndSig) {
					correctSignature = inferSignature((AbstractElementsWithNameAndSig) containerElement);
				}
			}

//			System.out.println("Signature so far: " + correctSignature);
			if (correctSignature != null) {
				List<IEObjectDescription> scopesy = new ArrayList<IEObjectDescription>();
				QualifiedName sigQfn = nameProvider.getFullyQualifiedName(correctSignature);
				for (ControlVariable x : correctSignature.getControls()) {
					if (x instanceof ControlVariable) {
//						String fqn1 = ((ControlVariable) x).getName();
						String ctrlQfn = ((ControlVariable) x).getName();
						QualifiedName ctrlFullQfn = QualifiedName.EMPTY.append(sigQfn).append(ctrlQfn);
						// der alias name erlaubt, das als stellvertreter einzugeben und zeigt dabei
						// immer noch
						// auf das richtige element im Scope
						AliasedEObjectDescription obj2 = new AliasedEObjectDescription(QualifiedName.create(ctrlQfn),
								EObjectDescription.create(ctrlQfn, x));
						
						AliasedEObjectDescription objDescr2 = new AliasedEObjectDescription(ctrlFullQfn,
								EObjectDescription.create(ctrlFullQfn, x));
						
						scopesy.add(obj2);
						scopesy.add(objDescr2);
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
	public void findAllLocalBigraphVariableDeclarations(EObject context, List<AbstractElementsWithNameAndSig> collect) {
//		System.out.println("context: " + context);
//		List<AbstractElement> allVarDeclarations = EcoreUtil2.getAllContentsOfType(context, AbstractElement.class);
		List<AbstractElementsWithNameAndSig> allVarDeclarations = EcoreUtil2.getAllContentsOfType(context,
				AbstractElementsWithNameAndSig.class);

		List<String> names = collect.stream().map(x -> x.getName()).collect(Collectors.toList());
		for (AbstractElementsWithNameAndSig each : allVarDeclarations) {
			if (!names.contains(each.getName())) {
				collect.add(each);
			}
		}
		if (context.eContainer() != null) {
			findAllLocalBigraphVariableDeclarations(context.eContainer(), collect);
		}
	}

	public Signature inferSignature(AssignmentOrVariableDeclaration variableOrAssignment) {
		if (variableOrAssignment instanceof BDSLVariableDeclaration2) {
			return inferSignature(((BDSLVariableDeclaration2) variableOrAssignment).getVariable());
		} else if (variableOrAssignment instanceof BDSLReferenceDeclaration) {
			return inferSignature(((BDSLReferenceDeclaration) variableOrAssignment).getTarget());
		}
		return null;
	}

	/**
	 * Infer the signature of a variable declaration by looking up the parent
	 * context.
	 * 
	 * A inner bigraph declaration need not have to define a signature (or more
	 * specifically, it is not possible to define one accidentally).
	 * 
	 * @param variable
	 * @return
	 */
	public Signature inferSignature(AbstractElementsWithNameAndSig variable) {
		if (variable.getSig() != null) {
			return variable.getSig();
		}
		if (variable.eContainer() != null) {
			EObject container = EcoreUtil2.getContainerOfType(variable.eContainer(),
					AbstractElementsWithNameAndSig.class);
//			Signature sig = ((LocalVarDecl) variable.eContainer()).getSig();
//			if (sig != null)
//				return sig;
			if (container instanceof AbstractElementsWithNameAndSig)
				return inferSignature(((AbstractElementsWithNameAndSig) container));
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

	public IScope getBRSModelScope(EObject context, EReference reference, BDSLDocument module, IScope parent) {
//		System.out.println("getBRSModelScope");
		Collection<AbstractElement> allDefinitions = module.getStatements();
		IScope ad1 = Scopes.scopeFor(allDefinitions, parent); // Scopes.scopeFor(allDefinitions2, parent);
		Collection<AbstractMainStatements> allDefinitions2 = module.getMain().getBody().getStatements();
		IScope ad2 = Scopes.scopeFor(allDefinitions2, ad1);
//				Collections2.filter(module.getStatements(),
//				e -> e.getClass().equals(LocalVarDecl.class));
		return ad2;
	}

	public IScope getSigDefScope(EObject context, EReference reference, IScope parent) {
		EObject containerElement = EcoreUtil2.getContainerOfType(context, AbstractElement.class);
		if (containerElement != null) {
//			EObject rootElement = EcoreUtil2.getRootContainer(context);
			Signature correctSignature = ((AbstractElementsWithNameAndSig) containerElement).getSig();
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
			Signature correctSignature = ((AbstractElementsWithNameAndSig) containerElement).getSig();
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