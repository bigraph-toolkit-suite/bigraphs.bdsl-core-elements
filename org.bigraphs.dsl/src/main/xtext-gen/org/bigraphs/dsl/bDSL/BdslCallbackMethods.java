/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bdsl Callback Methods</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.BdslCallbackMethods#getBrs <em>Brs</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.BdslCallbackMethods#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBdslCallbackMethods()
 * @model
 * @generated
 */
public interface BdslCallbackMethods extends AbstractElement, MethodStatements
{
  /**
   * Returns the value of the '<em><b>Brs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Brs</em>' containment reference.
   * @see #setBrs(BRSVarReference)
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBdslCallbackMethods_Brs()
   * @model containment="true"
   * @generated
   */
  BRSVarReference getBrs();

  /**
   * Sets the value of the '{@link org.bigraphs.dsl.bDSL.BdslCallbackMethods#getBrs <em>Brs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Brs</em>' containment reference.
   * @see #getBrs()
   * @generated
   */
  void setBrs(BRSVarReference value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.bigraphs.dsl.bDSL.CallbackStatements}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBdslCallbackMethods_Statements()
   * @model containment="true"
   * @generated
   */
  EList<CallbackStatements> getStatements();

} // BdslCallbackMethods
