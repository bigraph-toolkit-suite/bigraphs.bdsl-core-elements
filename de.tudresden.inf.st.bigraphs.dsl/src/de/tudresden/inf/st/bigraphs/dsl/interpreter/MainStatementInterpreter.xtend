package de.tudresden.inf.st.bigraphs.dsl.interpreter

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractMainStatements
import de.tudresden.inf.st.bigraphs.dsl.bDSL.PrintLn

class MainStatementInterpreter {
	
	def dispatch Object interpret(AbstractMainStatements stmts) {
		if(stmts instanceof PrintLn ) {
			println(stmts.text) // output stream command
			return stmts.text
		}
		return null
	}
}