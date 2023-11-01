/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL.impl;

import java.util.Collection;

import org.bigraphs.dsl.bDSL.AbstractElement;
import org.bigraphs.dsl.bDSL.BDSLDocument;
import org.bigraphs.dsl.bDSL.BDSLDocumentImport;
import org.bigraphs.dsl.bDSL.BDSLPackage;
import org.bigraphs.dsl.bDSL.BDSLUdfImport;
import org.bigraphs.dsl.bDSL.MainElement;
import org.bigraphs.dsl.bDSL.Signature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.BDSLDocumentImpl#getImportDeclarationsBdsl <em>Import Declarations Bdsl</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.BDSLDocumentImpl#getImportDeclarationsUdf <em>Import Declarations Udf</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.BDSLDocumentImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.BDSLDocumentImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.BDSLDocumentImpl#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDSLDocumentImpl extends UDFArgumentTypesImpl implements BDSLDocument
{
  /**
   * The cached value of the '{@link #getImportDeclarationsBdsl() <em>Import Declarations Bdsl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportDeclarationsBdsl()
   * @generated
   * @ordered
   */
  protected EList<BDSLDocumentImport> importDeclarationsBdsl;

  /**
   * The cached value of the '{@link #getImportDeclarationsUdf() <em>Import Declarations Udf</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportDeclarationsUdf()
   * @generated
   * @ordered
   */
  protected EList<BDSLUdfImport> importDeclarationsUdf;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected EList<Signature> signature;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> statements;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected MainElement main;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BDSLDocumentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BDSLPackage.Literals.BDSL_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BDSLDocumentImport> getImportDeclarationsBdsl()
  {
    if (importDeclarationsBdsl == null)
    {
      importDeclarationsBdsl = new EObjectContainmentEList<BDSLDocumentImport>(BDSLDocumentImport.class, this, BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_BDSL);
    }
    return importDeclarationsBdsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BDSLUdfImport> getImportDeclarationsUdf()
  {
    if (importDeclarationsUdf == null)
    {
      importDeclarationsUdf = new EObjectContainmentEList<BDSLUdfImport>(BDSLUdfImport.class, this, BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_UDF);
    }
    return importDeclarationsUdf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Signature> getSignature()
  {
    if (signature == null)
    {
      signature = new EObjectContainmentEList<Signature>(Signature.class, this, BDSLPackage.BDSL_DOCUMENT__SIGNATURE);
    }
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractElement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, BDSLPackage.BDSL_DOCUMENT__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainElement getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMain(MainElement newMain, NotificationChain msgs)
  {
    MainElement oldMain = main;
    main = newMain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BDSLPackage.BDSL_DOCUMENT__MAIN, oldMain, newMain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMain(MainElement newMain)
  {
    if (newMain != main)
    {
      NotificationChain msgs = null;
      if (main != null)
        msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BDSLPackage.BDSL_DOCUMENT__MAIN, null, msgs);
      if (newMain != null)
        msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BDSLPackage.BDSL_DOCUMENT__MAIN, null, msgs);
      msgs = basicSetMain(newMain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BDSLPackage.BDSL_DOCUMENT__MAIN, newMain, newMain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_BDSL:
        return ((InternalEList<?>)getImportDeclarationsBdsl()).basicRemove(otherEnd, msgs);
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_UDF:
        return ((InternalEList<?>)getImportDeclarationsUdf()).basicRemove(otherEnd, msgs);
      case BDSLPackage.BDSL_DOCUMENT__SIGNATURE:
        return ((InternalEList<?>)getSignature()).basicRemove(otherEnd, msgs);
      case BDSLPackage.BDSL_DOCUMENT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case BDSLPackage.BDSL_DOCUMENT__MAIN:
        return basicSetMain(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_BDSL:
        return getImportDeclarationsBdsl();
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_UDF:
        return getImportDeclarationsUdf();
      case BDSLPackage.BDSL_DOCUMENT__SIGNATURE:
        return getSignature();
      case BDSLPackage.BDSL_DOCUMENT__STATEMENTS:
        return getStatements();
      case BDSLPackage.BDSL_DOCUMENT__MAIN:
        return getMain();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_BDSL:
        getImportDeclarationsBdsl().clear();
        getImportDeclarationsBdsl().addAll((Collection<? extends BDSLDocumentImport>)newValue);
        return;
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_UDF:
        getImportDeclarationsUdf().clear();
        getImportDeclarationsUdf().addAll((Collection<? extends BDSLUdfImport>)newValue);
        return;
      case BDSLPackage.BDSL_DOCUMENT__SIGNATURE:
        getSignature().clear();
        getSignature().addAll((Collection<? extends Signature>)newValue);
        return;
      case BDSLPackage.BDSL_DOCUMENT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends AbstractElement>)newValue);
        return;
      case BDSLPackage.BDSL_DOCUMENT__MAIN:
        setMain((MainElement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_BDSL:
        getImportDeclarationsBdsl().clear();
        return;
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_UDF:
        getImportDeclarationsUdf().clear();
        return;
      case BDSLPackage.BDSL_DOCUMENT__SIGNATURE:
        getSignature().clear();
        return;
      case BDSLPackage.BDSL_DOCUMENT__STATEMENTS:
        getStatements().clear();
        return;
      case BDSLPackage.BDSL_DOCUMENT__MAIN:
        setMain((MainElement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_BDSL:
        return importDeclarationsBdsl != null && !importDeclarationsBdsl.isEmpty();
      case BDSLPackage.BDSL_DOCUMENT__IMPORT_DECLARATIONS_UDF:
        return importDeclarationsUdf != null && !importDeclarationsUdf.isEmpty();
      case BDSLPackage.BDSL_DOCUMENT__SIGNATURE:
        return signature != null && !signature.isEmpty();
      case BDSLPackage.BDSL_DOCUMENT__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case BDSLPackage.BDSL_DOCUMENT__MAIN:
        return main != null;
    }
    return super.eIsSet(featureID);
  }

} //BDSLDocumentImpl