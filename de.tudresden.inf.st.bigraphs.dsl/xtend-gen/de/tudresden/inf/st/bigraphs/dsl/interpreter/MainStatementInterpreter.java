package de.tudresden.inf.st.bigraphs.dsl.interpreter;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractMainStatements;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.PrintLn;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.PrintableExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class MainStatementInterpreter {
  protected Object _interpret(final AbstractMainStatements stmts) {
    if ((stmts instanceof PrintLn)) {
      InputOutput.<PrintableExpression>println(((PrintLn)stmts).getText());
      return ((PrintLn)stmts).getText();
    }
    return null;
  }
  
  public Object interpret(final AbstractMainStatements stmts) {
    return _interpret(stmts);
  }
}
