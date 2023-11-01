/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL.impl;

import org.bigraphs.dsl.bDSL.BDSLPackage;
import org.bigraphs.dsl.bDSL.BDSLReactDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.BDSLReactDefinitionImpl#getRedex <em>Redex</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.impl.BDSLReactDefinitionImpl#getReactum <em>Reactum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDSLReactDefinitionImpl extends MinimalEObjectImpl.Container implements BDSLReactDefinition
{
  /**
   * The cached value of the '{@link #getRedex() <em>Redex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRedex()
   * @generated
   * @ordered
   */
  protected EObject redex;

  /**
   * The cached value of the '{@link #getReactum() <em>Reactum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactum()
   * @generated
   * @ordered
   */
  protected EObject reactum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BDSLReactDefinitionImpl()
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
    return BDSLPackage.Literals.BDSL_REACT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getRedex()
  {
    return redex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRedex(EObject newRedex, NotificationChain msgs)
  {
    EObject oldRedex = redex;
    redex = newRedex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BDSLPackage.BDSL_REACT_DEFINITION__REDEX, oldRedex, newRedex);
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
  public void setRedex(EObject newRedex)
  {
    if (newRedex != redex)
    {
      NotificationChain msgs = null;
      if (redex != null)
        msgs = ((InternalEObject)redex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BDSLPackage.BDSL_REACT_DEFINITION__REDEX, null, msgs);
      if (newRedex != null)
        msgs = ((InternalEObject)newRedex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BDSLPackage.BDSL_REACT_DEFINITION__REDEX, null, msgs);
      msgs = basicSetRedex(newRedex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BDSLPackage.BDSL_REACT_DEFINITION__REDEX, newRedex, newRedex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getReactum()
  {
    return reactum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReactum(EObject newReactum, NotificationChain msgs)
  {
    EObject oldReactum = reactum;
    reactum = newReactum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BDSLPackage.BDSL_REACT_DEFINITION__REACTUM, oldReactum, newReactum);
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
  public void setReactum(EObject newReactum)
  {
    if (newReactum != reactum)
    {
      NotificationChain msgs = null;
      if (reactum != null)
        msgs = ((InternalEObject)reactum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BDSLPackage.BDSL_REACT_DEFINITION__REACTUM, null, msgs);
      if (newReactum != null)
        msgs = ((InternalEObject)newReactum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BDSLPackage.BDSL_REACT_DEFINITION__REACTUM, null, msgs);
      msgs = basicSetReactum(newReactum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BDSLPackage.BDSL_REACT_DEFINITION__REACTUM, newReactum, newReactum));
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
      case BDSLPackage.BDSL_REACT_DEFINITION__REDEX:
        return basicSetRedex(null, msgs);
      case BDSLPackage.BDSL_REACT_DEFINITION__REACTUM:
        return basicSetReactum(null, msgs);
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
      case BDSLPackage.BDSL_REACT_DEFINITION__REDEX:
        return getRedex();
      case BDSLPackage.BDSL_REACT_DEFINITION__REACTUM:
        return getReactum();
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
      case BDSLPackage.BDSL_REACT_DEFINITION__REDEX:
        setRedex((EObject)newValue);
        return;
      case BDSLPackage.BDSL_REACT_DEFINITION__REACTUM:
        setReactum((EObject)newValue);
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
      case BDSLPackage.BDSL_REACT_DEFINITION__REDEX:
        setRedex((EObject)null);
        return;
      case BDSLPackage.BDSL_REACT_DEFINITION__REACTUM:
        setReactum((EObject)null);
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
      case BDSLPackage.BDSL_REACT_DEFINITION__REDEX:
        return redex != null;
      case BDSLPackage.BDSL_REACT_DEFINITION__REACTUM:
        return reactum != null;
    }
    return super.eIsSet(featureID);
  }

} //BDSLReactDefinitionImpl
