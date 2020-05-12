/**
 * generated by Xtext 2.21.0
 */
package de.tudresden.inf.st.bigraphs.dsl.bDSL.util;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage
 * @generated
 */
public class BDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BDSLPackage.BRS_MODEL:
      {
        BRSModel brsModel = (BRSModel)theEObject;
        T result = caseBRSModel(brsModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.BRS_MODEL_IMPORT:
      {
        BRSModelImport brsModelImport = (BRSModelImport)theEObject;
        T result = caseBRSModelImport(brsModelImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.MAIN_ELEMENT:
      {
        MainElement mainElement = (MainElement)theEObject;
        T result = caseMainElement(mainElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.SIGNATURE:
      {
        Signature signature = (Signature)theEObject;
        T result = caseSignature(signature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.CONTROL_DEF:
      {
        ControlDef controlDef = (ControlDef)theEObject;
        T result = caseControlDef(controlDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.EINT:
      {
        EInt eInt = (EInt)theEObject;
        T result = caseEInt(eInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.NAME_CONSTANT:
      {
        NameConstant nameConstant = (NameConstant)theEObject;
        T result = caseNameConstant(nameConstant);
        if (result == null) result = caseLinkNames(nameConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.LINK_NAMES:
      {
        LinkNames linkNames = (LinkNames)theEObject;
        T result = caseLinkNames(linkNames);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.SITE_VARS:
      {
        SiteVars siteVars = (SiteVars)theEObject;
        T result = caseSiteVars(siteVars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.LVD2:
      {
        LVD2 lvd2 = (LVD2)theEObject;
        T result = caseLVD2(lvd2);
        if (result == null) result = caseAbstractBigraphDeclaration(lvd2);
        if (result == null) result = caseBigraphExpression(lvd2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.LOCAL_VAR_DECL:
      {
        LocalVarDecl localVarDecl = (LocalVarDecl)theEObject;
        T result = caseLocalVarDecl(localVarDecl);
        if (result == null) result = caseAbstractElement(localVarDecl);
        if (result == null) result = caseLVD2(localVarDecl);
        if (result == null) result = caseAbstractBigraphDeclaration(localVarDecl);
        if (result == null) result = caseBigraphExpression(localVarDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.BIGRAPH_VAR_REFERENCE:
      {
        BigraphVarReference bigraphVarReference = (BigraphVarReference)theEObject;
        T result = caseBigraphVarReference(bigraphVarReference);
        if (result == null) result = caseAbstractBigraphDeclaration(bigraphVarReference);
        if (result == null) result = caseAbstractMainStatements(bigraphVarReference);
        if (result == null) result = casePrintableExpression(bigraphVarReference);
        if (result == null) result = caseBigraphExpression(bigraphVarReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.ABSTRACT_BIGRAPH_DECLARATION:
      {
        AbstractBigraphDeclaration abstractBigraphDeclaration = (AbstractBigraphDeclaration)theEObject;
        T result = caseAbstractBigraphDeclaration(abstractBigraphDeclaration);
        if (result == null) result = caseBigraphExpression(abstractBigraphDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.NODE_EXPRESSION_CALL:
      {
        NodeExpressionCall nodeExpressionCall = (NodeExpressionCall)theEObject;
        T result = caseNodeExpressionCall(nodeExpressionCall);
        if (result == null) result = caseAbstractBigraphDeclaration(nodeExpressionCall);
        if (result == null) result = caseBigraphExpression(nodeExpressionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.BIGRAPH_EXPRESSION:
      {
        BigraphExpression bigraphExpression = (BigraphExpression)theEObject;
        T result = caseBigraphExpression(bigraphExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.MAIN_DECLARATION:
      {
        MainDeclaration mainDeclaration = (MainDeclaration)theEObject;
        T result = caseMainDeclaration(mainDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.ABSTRACT_MAIN_STATEMENTS:
      {
        AbstractMainStatements abstractMainStatements = (AbstractMainStatements)theEObject;
        T result = caseAbstractMainStatements(abstractMainStatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.PRINT_LN:
      {
        PrintLn printLn = (PrintLn)theEObject;
        T result = casePrintLn(printLn);
        if (result == null) result = caseAbstractMainStatements(printLn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.PRINTABLE_EXPRESSION:
      {
        PrintableExpression printableExpression = (PrintableExpression)theEObject;
        T result = casePrintableExpression(printableExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.MAIN_LITERAL:
      {
        MainLiteral mainLiteral = (MainLiteral)theEObject;
        T result = caseMainLiteral(mainLiteral);
        if (result == null) result = caseMainElement(mainLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.CONTROL_VARIABLE:
      {
        ControlVariable controlVariable = (ControlVariable)theEObject;
        T result = caseControlVariable(controlVariable);
        if (result == null) result = caseControlDef(controlVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseBigraphExpression(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BDSLPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseBigraphExpression(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BRS Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BRS Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBRSModel(BRSModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BRS Model Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BRS Model Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBRSModelImport(BRSModelImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainElement(MainElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignature(Signature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlDef(ControlDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EInt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EInt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEInt(EInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameConstant(NameConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Names</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Names</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkNames(LinkNames object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Vars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Vars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiteVars(SiteVars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LVD2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LVD2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLVD2(LVD2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVarDecl(LocalVarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bigraph Var Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bigraph Var Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBigraphVarReference(BigraphVarReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Bigraph Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Bigraph Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractBigraphDeclaration(AbstractBigraphDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Expression Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Expression Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeExpressionCall(NodeExpressionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bigraph Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bigraph Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBigraphExpression(BigraphExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainDeclaration(MainDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Main Statements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Main Statements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMainStatements(AbstractMainStatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print Ln</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print Ln</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrintLn(PrintLn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Printable Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Printable Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrintableExpression(PrintableExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainLiteral(MainLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlVariable(ControlVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti(Multi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BDSLSwitch
