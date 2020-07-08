/*
 * generated by Xtext 2.15.0
 */
package de.tudresden.inf.st.bigraphs.dsl.tests

import com.google.inject.Inject
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BRSModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import static extension org.junit.Assert.assertFalse
import org.junit.jupiter.api.Assertions

//import org.junit.Test

//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(BDSLInjectorProvider)
class BDSLParsingTest {
	@Inject
	ParseHelper<BRSModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
signature Sig1 {
	atomic ctrl a arity 1
	atomic ctrl b arity 1
}

main = {
    val test = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
    $test23 = load(sig=Sig1, as=xmi, resourcePath="classpath:models/test.xmi")
    println($test2)
}


val test2(Sig1) = {
	a | b
}

		''')
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		println('''Unexpected errors: «errors.join(", ")»''');
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		
		//		val expr = result.statements
//		println(result.signature)
//		val LocalVarDeclImpl stmt1 = expr.get(0) as LocalVarDeclImpl
//		println(stmt1.sig)
//		println(stmt1.sig.controls)
//var a(s1) = s1.a["a"] * s1.a * s2.a["b","b"] * s1.b;	

	}
}
