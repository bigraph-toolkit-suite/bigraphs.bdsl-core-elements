/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL.impl;

import org.bigraphs.dsl.bDSL.AssignableBigraphExpressionWithExplicitSig;
import org.bigraphs.dsl.bDSL.BDSLPackage;
import org.bigraphs.dsl.bDSL.Signature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignable Bigraph Expression With Explicit Sig</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.AssignableBigraphExpressionWithExplicitSigImpl#getSig <em>Sig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignableBigraphExpressionWithExplicitSigImpl extends AssignableBigraphExpressionImpl implements AssignableBigraphExpressionWithExplicitSig
{
  /**
   * The cached value of the '{@link #getSig() <em>Sig</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSig()
   * @generated
   * @ordered
   */
  protected Signature sig;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignableBigraphExpressionWithExplicitSigImpl()
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
    return BDSLPackage.Literals.ASSIGNABLE_BIGRAPH_EXPRESSION_WITH_EXPLICIT_SIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signature getSig()
  {
    if (sig != null && sig.eIsProxy())
    {
      InternalEObject oldSig = (InternalEObject)sig;
      sig = (Signature)eResolveProxy(oldSig);
      if (sig != oldSig)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BDSLPackage.ASSIGNABLE_BIGRAPH_EXPRESSION_WITH_EXPLICIT_SIG__SIG, oldSig, sig));
      }
    }
    return sig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature basicGetSig()
  {
    return sig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSig(Signature newSig)
  {
    Signature oldSig = sig;
    sig = newSig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BDSLPackage.ASSIGNABLE_BIGRAPH_EXPRESSION_WITH_EXPLICIT_SIG__SIG, oldSig, sig));
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
      case BDSLPackage.ASSIGNABLE_BIGRAPH_EXPRESSION_WITH_EXPLICIT_SIG__SIG:
        if (resolve) return getSig();
        return basicGetSig();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BDSLPackage.ASSIGNABLE_BIGRAPH_EXPRESSION_WITH_EXPLICIT_SIG__SIG:
        setSig((Signature)newValue);
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
      case BDSLPackage.ASSIGNABLE_BIGRAPH_EXPRESSION_WITH_EXPLICIT_SIG__SIG:
        setSig((Signature)null);
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
      case BDSLPackage.ASSIGNABLE_BIGRAPH_EXPRESSION_WITH_EXPLICIT_SIG__SIG:
        return sig != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignableBigraphExpressionWithExplicitSigImpl
