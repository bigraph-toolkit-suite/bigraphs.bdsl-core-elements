package de.tudresden.inf.st.bigraphs.dsl.tests.ide.validation

import de.tudresden.inf.st.bigraphs.dsl.tests.ide.AbstractBdslLSPTest
//import org.junit.Test
import org.junit.jupiter.api.Test
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLDocument
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
//import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import static extension org.junit.Assert.assertSame
/*
 * Syntax validation unit tests for {@link BDSLValidator}
 * 
 * The first statement must be {@code initialize}.
 */
class BdslAffectionUnitTest extends AbstractBdslLSPTest {
//	@Inject
//	ParseHelper<BDSLDocument> parseHelper
//	@Inject
//	extension ParseHelper<BDSLDocument>
//	@Inject extension ValidationTestHelper
//	@Inject Provider<ResourceSet> resourceSetProvider;



	@Test
	def void udfOperationTest_01() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
			signature Sig1 {
				atomic ctrl a arity 1
				atomic ctrl b arity 1
			}
main = {
	val test1 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
	$test1 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
    j {
    	java.util.Date ( $test1 )
    }
}
			'''
		)
		expectDiagnostics(uri, "")
	}

	@Test
	def void testSignatureMatchOnAssignment_01() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

signature Sig2 {
	atomic ctrl a arity 1
}

signature Sig3 {
	atomic ctrl a arity 1
}

main = {
    val test1 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
    val test2 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
    val test3 = load(sig=Sig1, as=xmi, resourcePath="cdo:models/test.xmi")
}
			'''
		)
		expectDiagnostics(uri, "")
	}

	@Test
	def void testSignatureMatchOnAssignment_02() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

signature Sig2 {
	atomic ctrl a arity 1
}

signature Sig3 {
	atomic ctrl a arity 1
}

main = {
    val test1(Sig1) = load(sig=Sig1, as=xmi, resourcePath="file:models/test.xmi")
    val test2(Sig1) = load(sig=Sig2, as=xmi, resourcePath="classpath:models/test.xmi")
    val test3(Sig2) = load(sig=Sig3, as=xmi, resourcePath="cdo:models/test.xmi")
}
val test3a(Sig3) = load(sig=Sig3, as=xmi, resourcePath="cdo:models/test.xmi")
val test4(Sig1) = load(sig=Sig3, as=xmi, resourcePath="cdo:models/test.xmi")
			'''
		)
		expectDiagnostics(uri, "Signature of right-hand side doesn't match with signature on left-hand side of the variable declaration with name test2:15,
Signature of right-hand side doesn't match with signature on left-hand side of the variable declaration with name test3:16,
Signature of right-hand side doesn't match with signature on left-hand side of the variable declaration with name test4:19")
	}

	@Test
	def void testSignatureMatchOnAssignment_03() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

signature Sig2 {
	atomic ctrl a arity 1
}

signature Sig3 {
	atomic ctrl a arity 1
}

main = {
    val test1(Sig1) = load(sig=Sig1, as=xmi, resourcePath="file:models/test.xmi") // Good
    val test1a = $test1 // Good
    
    val test2 = load(sig=Sig1, as=xmi, resourcePath="file:models/test.xmi") // Good
    val test2a = $test2 // Good
    
    val test2b(Sig2) = $test2 // Bad
}
			'''
		)
		expectDiagnostics(uri,
			"Signature of right-hand side doesn't match with signature on left-hand side of the variable declaration with name test2b:20")
	}

	@Test
	def void testTypeCheckingOnAssignment_01() {
		initialize
		val uri = 'inmemory:/foo01.bdsl'
		open(uri, '''
			signature Sig1 {
				active ctrl a arity 1
				passive ctrl b arity 1
				atomic ctrl c arity 1
			}
			
			main = {
				brs example(Sig1) = {
					agents = [$big1],
					   rules = [$reactRule1]
				}
				brs ex2 = $example
			}
			
			val big1(Sig1) = {
				a | b | b
			}
			
			val big2 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
			
			val bigTest = $big1
			val bigTest2 = $big2
			
			react reactRule1(Sig1) = {$big1}, {a | b}
			react reactRule2(Sig1) = $reactRule1
		''')
		expectDiagnostics(uri, "")

		val uri2 = 'inmemory:/foo02.bdsl'
		open(uri2, '''
			signature Sig1 {
				active ctrl a arity 1
				passive ctrl b arity 1
				atomic ctrl c arity 1
			}
			
			main = {
				
			
							val big1(Sig1) = {
								a | b | b
							}
							react reactRule1 = $big1 //fail 12
							react reactRule2(Sig1) = {$big1}, {a | b} //ok
							react reactRule3(Sig1) = $reactRule2 // ok
							val big2 = $reactRule2 //fail
							val big3 = $big2 //ok, even if not resolvable
							brs brsVar1(Sig1) = {
												agents = [$big1],
												   rules = [$reactRule2]
											}
							brs brsVar2(Sig1) = $brsVar1 //ok
							brs brsVar3(Sig1) = $big1 //fail 22
							brs brsVar4(Sig1) = $reactRule2 //fail 23
			}
		''')
		expectDiagnostics(uri2, "Type of left-hand side of the BRS declaration with name brsVar3 doesn't match with type on right-hand side:22,
Type of left-hand side of the BRS declaration with name brsVar4 doesn't match with type on right-hand side:23,
Type of left-hand side of the rule declaration with name reactRule1 doesn't match with type on right-hand side:12,
Type of left-hand side of the variable declaration with name big2 doesn't match with type on right-hand side:15")

	}

	@Test
	def void testResourcePathLoadMethod_01() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

main = {
    val test1 = load(sig=Sig1, as=xmi, resourcePath="file:models/test.xmi")
    val test2 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
    val test3 = load(sig=Sig1, as=xmi, resourcePath="cdo:models/test.xmi")
    load(sig=Sig1, as=xmi, resourcePath=null)
    load(sig=Sig1, as=xmi, resourcePath="")
}
			'''
		)
		expectDiagnostics(uri, "The resourcePath is missing a resource identifier:9,
The resourcePath is missing a resource identifier:10,
The resourcePath is not set:9,
The resourcePath is not set:10,
mismatched input 'null' expecting RULE_STRING:9")

		val uri2 = 'inmemory:/bar.bdsl'
		open(
			uri2,
			'''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

main = {
    val test1 = load(sig=Sig1, as=xmi, resourcePath="file:models/test")
    val test2 = load(sig=Sig1, as=ecore, resourcePath="classpath:models/test.xmi")
}
			'''
		)
		expectDiagnostics(uri2, "The extension of the resource path doesn't match with the specified load-as argument:6,
The extension of the resource path doesn't match with the specified load-as argument:7")

	}

	@Test
	def void testSiteIndexNotPositive_01() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
				signature Sig1 {
					active ctrl a arity 1
					passive ctrl b arity 1
					atomic ctrl c arity 1
				}
				
				main = {
				}
				
				val bigExplicitRoot(Sig1) = {
					id(0)
				}
			'''
		)
		expectDiagnostics(uri, "The index of a site must be a positive integer:10")

		open(
			"inmemory:/foo2.bdsl",
			'''
				signature Sig1 {
					active ctrl a arity 1
					passive ctrl b arity 1
					atomic ctrl c arity 1
				}
				
				main = {
				}
				
				val bigExplicitRoot(Sig1) = {
					id(1)
				}
			'''
		)
		expectDiagnostics("inmemory:/foo2.bdsl", "")
	}

	@Test
	def void testSiteIndexNotPositive_02() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
				signature Sig1 {
					active ctrl a arity 1
					passive ctrl b arity 1
					atomic ctrl c arity 1
				}
				
				main = {
				}
				
				val bigExplicitRoot(Sig1) = {
					id(-1)
				}
			'''
		)
//		expectDiagnostics(uri, "extraneous input '-' expecting RULE_INT:10")
		expectDiagnostics(uri, "no viable alternative at input '(':10")

	}
	
	@Test
	def void testAgentInBRSIsGround() {
		initialize
		val uri = 'inmemory:/foo.bdsl'
		open(
			uri,
			'''
				signature Sig1 {
					active a:1
					passive b:1
					atomic c:1
				}
				
				main = {
					brs example(Sig1) = {
						agents = [$agent],
					    rules = [$rule1]
					}
				}
				
				val agent(Sig1) = {
					a | b | c
				}
				
				react rule1(Sig1) = {
				    $agent
				}, {
				    a | b
				}
			'''
		)
//		expectDiagnostics(uri, "extraneous input '-' expecting RULE_INT:10")
		//expectDiagnostics(uri, "no viable alternative at input '(':10")
	}

}
