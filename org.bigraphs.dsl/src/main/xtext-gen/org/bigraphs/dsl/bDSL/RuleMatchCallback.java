/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Match Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.RuleMatchCallback#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getRuleMatchCallback()
 * @model
 * @generated
 */
public interface RuleMatchCallback extends BdslCallbackMethods
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.bigraphs.dsl.bDSL.RuleVarReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getRuleMatchCallback_Params()
   * @model containment="true"
   * @generated
   */
  EList<RuleVarReference> getParams();

} // RuleMatchCallback
