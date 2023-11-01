/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bigraph Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.BDSLBigraphDefinition#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBDSLBigraphDefinition()
 * @model
 * @generated
 */
public interface BDSLBigraphDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
   * The list contents are of type {@link org.bigraphs.dsl.bDSL.BigraphExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference list.
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBDSLBigraphDefinition_Definition()
   * @model containment="true"
   * @generated
   */
  EList<BigraphExpression> getDefinition();

} // BDSLBigraphDefinition