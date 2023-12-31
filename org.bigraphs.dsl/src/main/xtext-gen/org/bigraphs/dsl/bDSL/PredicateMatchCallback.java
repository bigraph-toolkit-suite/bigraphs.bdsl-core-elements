/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Match Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.PredicateMatchCallback#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getPredicateMatchCallback()
 * @model
 * @generated
 */
public interface PredicateMatchCallback extends BdslCallbackMethods
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.bigraphs.dsl.bDSL.PredicateVarReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getPredicateMatchCallback_Params()
   * @model containment="true"
   * @generated
   */
  EList<PredicateVarReference> getParams();

} // PredicateMatchCallback
