/**
 * generated by Xtext 2.21.0
 */
package de.tudresden.inf.st.bigraphs.dsl.bDSL.impl;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BDSLFactoryImpl extends EFactoryImpl implements BDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BDSLFactory init()
  {
    try
    {
      BDSLFactory theBDSLFactory = (BDSLFactory)EPackage.Registry.INSTANCE.getEFactory(BDSLPackage.eNS_URI);
      if (theBDSLFactory != null)
      {
        return theBDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BDSLPackage.BRS_MODEL: return createBRSModel();
      case BDSLPackage.BRS_MODEL_IMPORT: return createBRSModelImport();
      case BDSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case BDSLPackage.MAIN_ELEMENT: return createMainElement();
      case BDSLPackage.SIGNATURE: return createSignature();
      case BDSLPackage.CONTROL_DEF: return createControlDef();
      case BDSLPackage.EINT: return createEInt();
      case BDSLPackage.NAME_CONSTANT: return createNameConstant();
      case BDSLPackage.LINK_NAMES: return createLinkNames();
      case BDSLPackage.SITE_VARS: return createSiteVars();
      case BDSLPackage.LVD2: return createLVD2();
      case BDSLPackage.LOCAL_VAR_DECL: return createLocalVarDecl();
      case BDSLPackage.BIGRAPH_VAR_REFERENCE: return createBigraphVarReference();
      case BDSLPackage.ABSTRACT_BIGRAPH_DECLARATION: return createAbstractBigraphDeclaration();
      case BDSLPackage.NODE_EXPRESSION_CALL: return createNodeExpressionCall();
      case BDSLPackage.BIGRAPH_EXPRESSION: return createBigraphExpression();
      case BDSLPackage.MAIN_DECLARATION: return createMainDeclaration();
      case BDSLPackage.ABSTRACT_MAIN_STATEMENTS: return createAbstractMainStatements();
      case BDSLPackage.PRINT_LN: return createPrintLn();
      case BDSLPackage.PRINTABLE_EXPRESSION: return createPrintableExpression();
      case BDSLPackage.MAIN_LITERAL: return createMainLiteral();
      case BDSLPackage.CONTROL_VARIABLE: return createControlVariable();
      case BDSLPackage.PLUS: return createPlus();
      case BDSLPackage.MULTI: return createMulti();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BDSLPackage.BINARY_PARALLEL_OPERATOR:
        return createBinaryParallelOperatorFromString(eDataType, initialValue);
      case BDSLPackage.BINARY_NESTING_OPERATOR:
        return createBinaryNestingOperatorFromString(eDataType, initialValue);
      case BDSLPackage.CONTROL_TYPE:
        return createControlTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BDSLPackage.BINARY_PARALLEL_OPERATOR:
        return convertBinaryParallelOperatorToString(eDataType, instanceValue);
      case BDSLPackage.BINARY_NESTING_OPERATOR:
        return convertBinaryNestingOperatorToString(eDataType, instanceValue);
      case BDSLPackage.CONTROL_TYPE:
        return convertControlTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BRSModel createBRSModel()
  {
    BRSModelImpl brsModel = new BRSModelImpl();
    return brsModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BRSModelImport createBRSModelImport()
  {
    BRSModelImportImpl brsModelImport = new BRSModelImportImpl();
    return brsModelImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainElement createMainElement()
  {
    MainElementImpl mainElement = new MainElementImpl();
    return mainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlDef createControlDef()
  {
    ControlDefImpl controlDef = new ControlDefImpl();
    return controlDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInt createEInt()
  {
    EIntImpl eInt = new EIntImpl();
    return eInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameConstant createNameConstant()
  {
    NameConstantImpl nameConstant = new NameConstantImpl();
    return nameConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LinkNames createLinkNames()
  {
    LinkNamesImpl linkNames = new LinkNamesImpl();
    return linkNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SiteVars createSiteVars()
  {
    SiteVarsImpl siteVars = new SiteVarsImpl();
    return siteVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LVD2 createLVD2()
  {
    LVD2Impl lvd2 = new LVD2Impl();
    return lvd2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalVarDecl createLocalVarDecl()
  {
    LocalVarDeclImpl localVarDecl = new LocalVarDeclImpl();
    return localVarDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigraphVarReference createBigraphVarReference()
  {
    BigraphVarReferenceImpl bigraphVarReference = new BigraphVarReferenceImpl();
    return bigraphVarReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractBigraphDeclaration createAbstractBigraphDeclaration()
  {
    AbstractBigraphDeclarationImpl abstractBigraphDeclaration = new AbstractBigraphDeclarationImpl();
    return abstractBigraphDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeExpressionCall createNodeExpressionCall()
  {
    NodeExpressionCallImpl nodeExpressionCall = new NodeExpressionCallImpl();
    return nodeExpressionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigraphExpression createBigraphExpression()
  {
    BigraphExpressionImpl bigraphExpression = new BigraphExpressionImpl();
    return bigraphExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainDeclaration createMainDeclaration()
  {
    MainDeclarationImpl mainDeclaration = new MainDeclarationImpl();
    return mainDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractMainStatements createAbstractMainStatements()
  {
    AbstractMainStatementsImpl abstractMainStatements = new AbstractMainStatementsImpl();
    return abstractMainStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintLn createPrintLn()
  {
    PrintLnImpl printLn = new PrintLnImpl();
    return printLn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintableExpression createPrintableExpression()
  {
    PrintableExpressionImpl printableExpression = new PrintableExpressionImpl();
    return printableExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainLiteral createMainLiteral()
  {
    MainLiteralImpl mainLiteral = new MainLiteralImpl();
    return mainLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlVariable createControlVariable()
  {
    ControlVariableImpl controlVariable = new ControlVariableImpl();
    return controlVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryParallelOperator createBinaryParallelOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryParallelOperator result = BinaryParallelOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryParallelOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryNestingOperator createBinaryNestingOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryNestingOperator result = BinaryNestingOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryNestingOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlType createControlTypeFromString(EDataType eDataType, String initialValue)
  {
    ControlType result = ControlType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertControlTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BDSLPackage getBDSLPackage()
  {
    return (BDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BDSLPackage getPackage()
  {
    return BDSLPackage.eINSTANCE;
  }

} //BDSLFactoryImpl
